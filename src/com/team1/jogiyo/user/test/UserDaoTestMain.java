package com.team1.jogiyo.user.test;

import java.util.List;

import com.team1.jogiyo.user.User;
import com.team1.jogiyo.user.UserDao;

public class UserDaoTestMain {

	public static void main(String[] args) throws Exception {
		
		UserDao userDao = new UserDao();
		
		System.out.println("insert"+userDao.insert(
								new User("hhhh","1234","송준기","구로","010-2134-2142")));
								
		
		System.out.println("update"+userDao.update(
					            new User("ffff","1234","장동건","잠실","010-2352-2352")));
					            
		
		System.out.println("delete"+userDao.delete("gggg"));
		
		
		System.out.println("findByPrimaryKey"+userDao.findByPrimaryKey("ffff"));
		
		System.out.println("findByName"+userDao.findByName("조성동"));
		
		System.out.println("findAll:");
		List<User> userList = userDao.findAll();
		System.out.println(userList);
		
		
		
		

	}

}
