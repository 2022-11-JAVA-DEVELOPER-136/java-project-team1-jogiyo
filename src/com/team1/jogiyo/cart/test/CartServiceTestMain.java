package com.team1.jogiyo.cart.test;

import com.team1.jogiyo.cart.Cart;
import com.team1.jogiyo.cart.CartService;
import com.team1.jogiyo.product.Product;
import com.team1.jogiyo.product.ProductDao;
import com.team1.jogiyo.product.ProductService;

public class CartServiceTestMain {

	public static void main(String[] args) throws Exception{
		CartService cartService=new CartService();
		ProductService productService=new ProductService();
		//1. 카트에 제품 추가
		System.out.println("1. 제품 장바구니에 담기 "+cartService.addCartInProduct(new Cart(0,3,"aaaa",productService.findByName("치킨"))));
		
	}

}
