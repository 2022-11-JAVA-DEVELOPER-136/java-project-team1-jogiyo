package com.team1.jogiyo.cart;

import java.util.List;

public class CartService {
	private CartDao cartDao;
	public CartService() throws Exception{
		cartDao=new CartDao();
	}
	//상품창에서 카트에 제품 추가 및 수정
	public int addCartInProduct(Cart cart) throws Exception {
		if(cartDao.countByProductNo(cart.getM_id(), cart.getProduct().getP_no())>0) {
			return cartDao.updateInProduct(cart);
		} else {
			return cartDao.insert(cart); 
		}
	}
	//카트 창에서 제품수량 변경
	public int updateInCart(Cart cart) throws Exception{
		return cartDao.updateInCart(cart.getC_no(), cart.getC_qty());
	}
	//해당 유저의 카트 보기
	public List<Cart> cartListByUserId(Cart cart) throws Exception{
		return cartDao.findByUser(cart.getM_id());
	}
	//카트 아이템 한 개 보기 
	public Cart cartListByCartNo(Cart cart) throws Exception{
		return cartDao.findByCartNo(cart.getC_no());
	}
	//카트 전체 삭제
	public int deleteAll(Cart cart) throws Exception{
		return cartDao.deleteAll(cart.getM_id());
	}
	//카트에서 물품 하나 삭제
	public int deleteCartItem(Cart cart) throws Exception{
		return cartDao.deleteByCartNo(cart.getC_no());
	}
	
	
	
}
