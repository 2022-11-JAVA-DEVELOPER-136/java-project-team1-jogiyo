package com.team1.jogiyo.cart.test;

import com.team1.jogiyo.cart.Cart;
import com.team1.jogiyo.cart.CartDao;
import com.team1.jogiyo.product.Product;

public class CartDaoTestMain {

	public static void main(String[] args) throws Exception{
		CartDao cartDao=new CartDao();
		Product product=null;
		//1. 카트에 추가
		System.out.println("1. insert" +
						  cartDao.insert(new Cart(0,4,"bbbb",new Product(1,"치킨","chicken.jpg",18000,"바삭바삭후라이드치킨",10))));
		/*
		//2.카트에 있는 제품의 수량 변경(카트리스트에서 변경)
		System.out.println("2. update " +
						  cartDao.update(2,5));
		//3. 카트 물품 하나 삭제 
		System.out.println("3. deleteByCartNo"+
						 cartDao.deleteByCartNo(1));
		//4. 카트 전체 삭제
		System.out.println("4. deleteAll"+
				 		 cartDao.deleteAll("cccc"));
		//5. 해당 유저의 카트리스트 전체 보여주기
		System.out.println("5. findByUser"+
						 cartDao.findByUser("bbbb"));
		*/
	}

}
