package com.team1.jogiyo.order.test;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import com.team1.jogiyo.cart.Cart;
import com.team1.jogiyo.cart.CartDao;
import com.team1.jogiyo.order.OrderDao;
import com.team1.jogiyo.order.OrderItem;
import com.team1.jogiyo.order.Order;
import com.team1.jogiyo.product.Product;
import com.team1.jogiyo.product.ProductDao;

public class OrderDaoTestMain {

	public static void main(String[] args) throws Exception{
		OrderDao orderDao=new OrderDao();
		System.out.println(orderDao.findByUserId("cccc"));
		System.out.println(orderDao.findByOrderNo("cccc",3));
		
		/*
		 * 1.상품에서직접주문
		 */
//		int p_qty=1;
//		int p_no=1;
//		ProductDao productDao=new ProductDao();
//		Product product=productDao.findByPrimaryKey(p_no);
//		System.out.println(product);
//		ArrayList<OrderItem> orderItemList=new ArrayList<OrderItem>();
//		orderItemList.add(new OrderItem(0, p_qty, p_no, product));
//		
//		Orders newOrder=new Orders(0, null, product.getP_price(), "bbbb");
//		orderDao.insert(newOrder);
//		System.out.println(orderDao.findByUserId("bbbb"));
		
		/*
		 * 2.cart에서 한번에 주문
		 */
//		int c_no=2;
//		int c_qty;
//		CartDao cartDao=new CartDao();
//		List<Cart> cartList=new ArrayList<Cart>();
//		cartList=cartDao.findByUser("bbbb");
//		System.out.println("*************bbbb 회원의 카트 목록전체****************");
//		System.out.println(cartList);
//		ArrayList<OrderItem> orderItemList2=new ArrayList<OrderItem>();
//		for (Cart cart : cartList) {
//			orderItemList2.add(null);
//		}
		
		
		
		
	}

}
