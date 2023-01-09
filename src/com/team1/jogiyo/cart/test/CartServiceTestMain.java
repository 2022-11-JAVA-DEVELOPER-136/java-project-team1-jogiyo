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
		System.out.println("1. 장바구니에 새로 추가 ");
		int rowCount=cartService.addCartInProduct(new Cart(0,3,"aaaa",productService.findByPrimaryKey(8)));
		System.out.println(rowCount);
		//1-1. 카트에 들어있던 제품 수량 업데이트
		System.out.println("1. 장바구니 수량 업데이트 ");
		rowCount=cartService.updateInCart(new Cart(0,11,"aaaa",productService.findByPrimaryKey(1)));
		System.out.println(rowCount);
	}

}
