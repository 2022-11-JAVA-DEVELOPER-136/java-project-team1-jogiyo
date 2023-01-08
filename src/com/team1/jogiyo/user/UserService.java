package com.team1.jogiyo.user;

import java.util.List;



public class UserService {
	private UserDao userDao;
	public UserService() throws Exception {
		userDao = new UserDao();
	}
	/*
	 * 회원가입
	 */
	public int create(User user) throws Exception {
		//1.아이디중복체크
		if(userDao.countByUserId(user.getM_id())>=1) {
			//중복
			return -1;
		}else {
			//가입
			int rowCount = userDao.insert(user);
			return rowCount;
		}
	}
	/*
	 * 회원로그인
	 */
	public  int login(String m_id, String m_password) throws Exception {
		/*
		 * 0 : 실패
		 * 1 : 성공
		 */
		int result = 0;
		if(userDao.countByUserId(m_id)==1) {
			//아이디존재하는 경우
			User lofinUser = userDao.findByPrimaryKey(m_id);
			if(lofinUser.getM_password().equals(m_password)) {
				//패스워드 일치
				result = 1;
			}else {
				//패스워드불일치
				result = 0;
			}
		}else{
			//회원이 아닌 경우
			result = 0;
		}
		return result;
	}
	
	/*
	 * 회원로그아웃
	 */
	public void logout() {
		
	}
	/*
	 * 로그인한 회원의 정보보기
	 */
	public User findUser(String m_id) throws Exception {
		return userDao.findByPrimaryKey(m_id);
	}
	/*
	 * 회원수정
	 */
	public int update(User user) throws Exception {
		return userDao.update(user);
		
	}
	/*
	 * 아이디 중복 체크
	 */
	public boolean isDuplicateId(String m_id) throws Exception {
		if(userDao.countByUserId(m_id)>=1) {
			return true;
		}else {
		return false;
	}
}
	/*
	 * 회원탈퇴
	 */
	public int remove(String m_id) throws Exception {
		return userDao.delete(m_id);
	
	}
	public List<User> userList() throws Exception{
		return userDao.findAll();
	}
}
