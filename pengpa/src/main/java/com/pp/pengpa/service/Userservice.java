package com.pp.pengpa.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.github.pagehelper.Page;
import com.pp.pengpa.entity.Tusers;


public interface Userservice {
	public int addUserKey(Tusers user) throws DataAccessException;
	public int addUser(Tusers user) throws DataAccessException;
	
	public List<Tusers> getCountUsers(Tusers user); 
	public List<Tusers> queryUserList(Tusers user) throws DataAccessException;
	public Page queryUserList2(Tusers user) throws DataAccessException;
	public Tusers queryUser(Tusers user) throws DataAccessException;

    int deleteUserById(int id); 
	
	int updateUser(Tusers user);

	
}
