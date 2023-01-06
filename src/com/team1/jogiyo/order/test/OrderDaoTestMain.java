package com.team1.jogiyo.order.test;

import java.sql.Date;
import java.util.ArrayList;

import com.team1.jogiyo.order.OrderDao;
import com.team1.jogiyo.order.OrderItem;
import com.team1.jogiyo.order.Orders;
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
		int p_qty=1;
		int p_no=1;
		ProductDao productDao=new ProductDao();
		Product product=productDao.findByPrimaryKey(p_no);
		System.out.println(product);
		ArrayList<OrderItem> orderItemList=new ArrayList<OrderItem>();
		orderItemList.add(new OrderItem(0, p_qty, p_no, product));
		
		Orders newOrder=new Orders(0, null, product.getP_price(), "dddd");
		orderDao.insert(newOrder);
		System.out.println(orderDao.findByUserId("dddd"));
		
		/*
		 * 2.cart에서 주문
		 */
		
		
		
	}

}
