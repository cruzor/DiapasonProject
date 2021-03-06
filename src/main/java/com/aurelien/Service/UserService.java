package com.aurelien.Service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;

import com.aurelien.Dao.UserDao;
import com.aurelien.Entity.User;

public class UserService 
{
	@Autowired
	private UserDao userDao;
	
	public Collection<User> getAllUsers()
	{
		return this.userDao.getAllUsers();
	}
	public User getUserById(int id)
	{
		return this.userDao.getUserById(id);
	}
	public void removeUserById(int id)
	{
		// TODO Auto-generated method stub
		this.userDao.removeUserById(id);
		
	}

	public void updateUser(User user) 
	{
		this.userDao.updateUser(user);
		
	}

	public void insertUser(User user) 
	{
		this.userDao.insertUserToDB(user);
		
	}
	
	
}
