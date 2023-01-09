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
			return cartDao.updateByProductNo(cart);
		} else {
			return cartDao.insert(cart); 
		}
	}
	//카트 창에서 제품수량 변경
	public int updateInCart(int c_no,int c_qty) throws Exception{
		return cartDao.updateByCartNo(c_no, c_qty);
	}
	//해당 유저의 카트 보기
	public List<Cart> cartListByUserId(String sUserId) throws Exception{
		return cartDao.findByUser(sUserId);
	}
	//카트 아이템 한 개 보기 
	public Cart cartListByCartNo(int c_no) throws Exception{
		return cartDao.findByCartNo(c_no);
	}
	//카트 전체 삭제
	public int deleteAll(String sUserId) throws Exception{
		return cartDao.deleteAll(sUserId);
	}
	//카트에서 물품 하나 삭제
	public int deleteCartItem(int c_no) throws Exception{
		return cartDao.deleteByCartNo(c_no);
	}
	
	
	
}
