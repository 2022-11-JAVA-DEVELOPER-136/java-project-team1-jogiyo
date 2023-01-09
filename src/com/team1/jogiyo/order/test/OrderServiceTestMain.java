package com.team1.jogiyo.order.test;

import java.util.List;

import com.team1.jogiyo.cart.Cart;
import com.team1.jogiyo.cart.CartService;
import com.team1.jogiyo.order.OrderService;

public class OrderServiceTestMain {

	public static void main(String[] args) throws Exception {
		OrderService orderService=new OrderService();
		CartService cartService=new CartService();
		/*
		 * 1.상품에서 직접주문
		 */
		System.out.println("상품에서 직접주문 >> "+ orderService.create("bbbb", 2, 2));
		System.out.println("주문목록 확인 >>"+orderService.list("bbbb"));
		/*
		 * 2.cart에서 한번에 주문
		 */
		System.out.println("cart에서 회원 장바구니 리스트 확인");
		List<Cart> cartList= cartService.cartListByUserId("bbbb");
		System.out.println(cartList);
		System.out.println("cart에서 한번에 주문>>"+ orderService.create("bbbb"));
		
		/*
		 * 3. cart에서 선택 주문
		 */
		
		
	}

}
