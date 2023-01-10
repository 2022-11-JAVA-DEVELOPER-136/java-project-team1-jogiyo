package com.team1.jogiyo.order.test;

import java.util.Iterator;
import java.util.List;

import com.team1.jogiyo.cart.Cart;
import com.team1.jogiyo.cart.CartService;
import com.team1.jogiyo.order.Order;
import com.team1.jogiyo.order.OrderItem;
import com.team1.jogiyo.order.OrderService;
import com.team1.jogiyo.product.ProductService;

public class OrderServiceTestMain {

	public static void main(String[] args) throws Exception {
		OrderService orderService=new OrderService();
		CartService cartService=new CartService();
		ProductService productService=new ProductService();
		/*
		 * 1.상품에서 직접주문
		 */
//		System.out.println("상품에서 직접주문 >> "+ orderService.create("bbbb", 2, 2));
//		System.out.println("주문목록 확인 >>"+orderService.list("bbbb"));
		
//		/*
//		 * 2.cart에서 한번에 주문
//		 */
//		System.out.println("cart에서 회원 장바구니 리스트 확인");
//		List<Cart> cartList= cartService.cartListByUserId("bbbb");
//		System.out.println(cartList);
//		System.out.println("cart에서 한번에 주문>>"+ orderService.create("bbbb"));
		
		
		/*
		 * orderHistory테스트
		 */
//		List<Order> orderList =  orderService.list("bbbb");
//		for (Order order : orderList) {
//			List<OrderItem> orderItems= orderService.detail("bbbb", order.getO_no()).getOrderItemList();
//			for (OrderItem orderItem : orderItems) {
//				System.out.println(order.getO_no()+" "+orderItem.getProduct());
//			}
//		}
		
		/*
		 * orderHistoryDetatil테스트
		 */
//		Order order =  orderService.list("bbbb").get(0);
//		System.out.println("========="+order);
//		List<OrderItem> orderItems= orderService.detail("bbbb", order.getO_no()).getOrderItemList();
//		for (OrderItem orderItem : orderItems) {
//			System.out.println(order.getO_no()+" "+orderItem.getProduct());
//		}
		
		/*
		 * cart 선택 주문 테스트
		 */
		System.out.println("cart에서 회원 장바구니 리스트 확인");
		List<Cart> cartList= cartService.cartListByUserId("bbbb");
		System.out.println(cartList);
		// 2,4,5 중에  2,4 선택
		
		int[] arrint= {2,4};
		for (int i = 0; i < arrint.length; i++) {
			System.out.println(arrint[i]);
		}
		
		System.out.println(" >>"+ orderService.create("bbbb", arrint));
	}

}
