package com.team1.jogiyo.order;

import java.util.ArrayList;

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
	public ArrayList<Orders> list(String sUserId) throws Exception{
		return orderDao.findByUserId(sUserId);
	}
	/*
	 * 주문상세보기
	 */
	public Orders detail(String sUserId,int o_no)throws Exception{
		return orderDao.findByOrderNo(sUserId, o_no);
	}
	/*
	 * 상품에서 직접주문
	 */
//	public int create(String sUserId,int p_no,int oi_qty) throws Exception{
//		//상품(product)객체에서 정보 orderItem객체로 전이 필요
//		Product product=productDao.findByPrimaryKey(p_no);
//		OrderItem orderItem=new OrderItem(0, oi_qty, p_no, product);
//		ArrayList<OrderItem> orderItemList=new ArrayList<OrderItem>();
//		
//		
//	}
//	/*
//	 * cart에서 주문
//	 */
//	public int create(String sUserId) throws Exception{
//		
//	}
//	/*
//	 * cart에서 선택주문
//	 */
//	public int create(String sUserId,String[] cart_item_noStr_array) throws Exception{
//		
//	}
	
}
