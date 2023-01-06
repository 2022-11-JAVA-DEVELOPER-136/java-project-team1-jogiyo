package com.team1.jogiyo.order;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.team1.jogiyo.common.DataSource;
import com.team1.jogiyo.product.Product;

public class OrderDao {
	//OrderInterface를 implements후 메소드 재정의 하세요
	private DataSource dataSource;
	public OrderDao() throws Exception{
		this.dataSource=new DataSource();
	}
	
	/*
	 * 주문생성
	 */
	public int insert(Orders orders) throws Exception {
		//insert into orders(o_no, o_date, o_total, m_id) values(orders_o_no_SEQ.nextval, sysdate, ?, ?)
		//insert into order_item(oi_no,oi_qty,o_no,p_no) values(order_item_oi_no_SEQ.nextval,?,orders_o_no_SEQ.currval,?)
		Connection con=null;
		PreparedStatement pstmt=null;
		int rowCount=0;
		try {
			con=dataSource.getConnection();
			con.setAutoCommit(false);
			pstmt=con.prepareStatement(OrderSQL.ORDER_INSERT);
			pstmt.setInt(1, orders.getO_total());
			pstmt.setString(2, orders.getM_id());
			rowCount = pstmt.executeUpdate();
			
			pstmt=con.prepareStatement(OrderSQL.ORDERITEM_INSERT);
			for (OrderItem orderItem : orders.getOrderItemList()) {
				pstmt.setInt(1, orderItem.getOi_qty());
				pstmt.setInt(2, orderItem.getProduct().getP_no());
				pstmt.executeUpdate();
			}
			con.commit();
			pstmt.close();
			con.close();
			
		} catch (Exception e) {
			con.rollback();
			throw e;
		}finally {
			if(con!=null)con.close();
		}
		
		return rowCount;
	}
	
	/*
	 * 주문전체삭제(ON DELETE CASCADE)
	 */
	
	public int deleteByUserId(String sUserId) throws Exception{
		//delete from orders where m_id=?
		Connection con=null;
		PreparedStatement pstmt=null;
		int rowCount=0;
		
		try {
			con=dataSource.getConnection();
			pstmt=con.prepareStatement(OrderSQL.ORDER_DELETE_BY_USERID);
			pstmt.setString(1, sUserId);
			rowCount = pstmt.executeUpdate();
			pstmt.close();
			con.close();
		} catch (Exception e) {
			con.rollback();
			throw e;
		}finally {
			if(con!=null)con.close();
		}
		return rowCount;
	}
	
	/*
	 * 주문1건삭제(ON DELETE CASCADE)
	 */
	public int deleteByOrderNo(int o_no) throws Exception{
		//delete from orders where o_no=?
		Connection con=null;
		PreparedStatement pstmt=null;
		int rowCount=0;
		try {
			con=dataSource.getConnection();
			pstmt=con.prepareStatement(OrderSQL.ORDER_DELETE_BY_O_NO);
			pstmt.setInt(1, o_no);
			rowCount = pstmt.executeUpdate();
			pstmt.close();
			con.close();

		} catch (Exception e) {
			con.rollback();
			throw e;
		}finally {
			if(con!=null)con.close();
		}
		return rowCount;
		
	}
	
	/*
	 * 주문전체(특정사용자)
	 */
	public ArrayList<Orders> findByUserId(String sUserId) throws Exception{
		//select * from orders where m_id=?
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		ArrayList<Orders> ordersArrayList = new ArrayList<Orders>();
		
		try {
			con=dataSource.getConnection();
			pstmt=con.prepareStatement(OrderSQL.ORDER_SELECT_BY_USERID);
			pstmt.setString(1, sUserId);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				ordersArrayList.add(new Orders(rs.getInt("o_no"), 
											   rs.getDate("o_date"), 
											   rs.getInt("o_total"), 
											   rs.getString("m_id")));
			}
			
		}finally {
			if(con!=null) {
				con.close();
			}
		}
		return ordersArrayList;
	}
		
		
	/*
	 * 주문1개보기(주문상세리스트)
	 */
	public Orders findByOrderNo(String sUserId,int o_no)throws Exception{
		/*
		select * 
		    from orders o 
		    join order_item oi 
		    on o.o_no=oi.o_no 
		    join product p
		    on p.p_no=oi.p_no
		where m_id=? and o.o_no=?;
		 */
		Orders findOrder=null;
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		try {
			con=dataSource.getConnection();
			pstmt=con.prepareStatement(OrderSQL.ORDER_SELECT_WITH_PRODUCT_BY_USERID);
			pstmt.setString(1, sUserId);
			pstmt.setInt(2, o_no);
			rs = pstmt.executeQuery();
			/*
O_NO O_DATE        O_TOTAL M_ID      OI_NO     OI_QTY       O_NO       P_NO       P_NO P_NAME   P_IMAGE           P_PRICE P_DESC               CT_NO
--- ---------- ---------- ------------------------------------------------------- ---------- ---------------------------- ------- ----------
  2 2023/01/06      45000 bbbb        3          1          2          1          1 치킨        chicken.jpg        18000 바삭바삭후라이드치킨    10
  2 2023/01/06      45000 bbbb        4          2          2          2          2 피자        chicken.jpg        24000 맛있는피자              20
  2 2023/01/06      45000 bbbb        5          3          2          3          3 자장면      jajangmyeon.jpg    8000 고소한자장면             30
			 */
			if(rs.next()) {
				findOrder=new Orders(rs.getInt("o_no"), 
									 rs.getDate("o_Date"), 
									 rs.getInt("o_total"), 
									 rs.getString("m_id"));
				do {
					findOrder.getOrderItemList()
							.add(new OrderItem(rs.getInt("oi_no"), 
											   rs.getInt("oi_qty"), 
											   rs.getInt("o_no"), 
											   new Product(rs.getInt("p_no"), 
													   	   rs.getString("p_name"),
													   	   rs.getString("p_image"),
													   	   rs.getInt("p_price"),
													   	   rs.getString("p_desc"),
													   	   rs.getInt("ct_no"))));
					
				} while (rs.next());
				
			}
			pstmt.close();
			con.close();
		}finally {
			if(con!=null) {
				con.close();
			}
		}
		return findOrder;
	}
	
}
