package com.team1.jogiyo.order;

import java.util.ArrayList;
import java.util.List;

import com.team1.jogiyo.cart.Cart;
import com.team1.jogiyo.cart.CartDao;
import com.team1.jogiyo.product.Product;
import com.team1.jogiyo.product.ProductDao;

public class OrderService {
	private OrderDao orderDao;
	private ProductDao productDao;
	private CartDao cartDao;
	public OrderService() throws Exception {
		orderDao=new OrderDao();
		productDao=new ProductDao();
		cartDao=new CartDao();
	}
	/*
	 * 주문1개삭제
	 */
	public int deleteByOrderNo(int o_no)throws Exception{
		return orderDao.deleteByOrderNo(o_no);
	}
	
	/*
	 * 주문전체삭제
	 */
	public int delete(String sUserId)throws Exception{
		return orderDao.deleteByUserId(sUserId);
	}
	/*
	 * 주문목록
	 */
	public ArrayList<Order> list(String sUserId) throws Exception{
		return orderDao.findByUserId(sUserId);
	}
	/*
	 * 주문상세보기
	 */
	public Order detail(String sUserId,int o_no)throws Exception{
		return orderDao.findByOrderNo(sUserId, o_no);
	}
	/*
	 * 상품에서 직접주문
	 */
	public int create(String sUserId,int p_no,int oi_qty) throws Exception{
		//상품(product)객체에서 정보 orderItem객체로 전이 필요
		Product product=productDao.findByPrimaryKey(p_no);
		OrderItem orderItem=new OrderItem(0, oi_qty, p_no, product);
		// Orders 객체에 List<OrderItem> 필요
		ArrayList<OrderItem> orderItemList=new ArrayList<OrderItem>();
		orderItemList.add(orderItem);
		Order newOrders=new Order(0, 
									null, 
									orderItemList.get(0).getOi_qty()*orderItemList.get(0).getProduct().getP_price(), 
									sUserId);
		newOrders.setOrderItemList(orderItemList);
		return orderDao.insert(newOrders);
	}
	/*
	 * cart 전체주문
	 */
	public int create(String sUserId) throws Exception{
		//카트(cart)객체에서 정보 orderItem객체로 모두 전이
		List<Cart> cartList = cartDao.findByUser(sUserId);
		ArrayList<OrderItem> orderItemList=new ArrayList<OrderItem>();
		int o_tot_price=0;
		for (Cart cart : cartList) {
			//Cart -> OrderItem 정보 전이
			OrderItem orderItem=new OrderItem(0, cart.getC_qty(), 0, cart.getProduct());
			orderItemList.add(orderItem);
			o_tot_price+=orderItem.getOi_qty()*orderItem.getProduct().getP_price();
		}
		Order newOrders=new Order(0, null, o_tot_price, sUserId);
		newOrders.setOrderItemList(orderItemList);
		int rowCount = orderDao.insert(newOrders);
		cartDao.deleteAll(sUserId);
		return rowCount;
	}
	/*
	 * cart에서 선택주문
	 */
	public int create(String sUserId,String[] cart_item_noStr_array) throws Exception{
		return 0;
	}
	
}
