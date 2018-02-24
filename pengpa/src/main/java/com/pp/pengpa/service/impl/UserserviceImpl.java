package com.pp.pengpa.service.impl;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.pp.pengpa.dao.TusersMapper;
import com.pp.pengpa.dao.UserDao;
import com.pp.pengpa.entity.Tusers;
import com.pp.pengpa.service.Userservice;


@Service
@MapperScan("main.java.dao")
@Transactional
public class UserserviceImpl implements Userservice {

	@Autowired
	private TusersMapper tusersMapper;
	@Autowired
	private UserDao userDao;
	
	public int addUserKey(Tusers user) throws DataAccessException {
		// TODO Auto-generated method stub
		//return userDao.addUserKey(user);
		return tusersMapper.addUserKey(user);
	}

	public int addUser(Tusers user) throws DataAccessException {
		// TODO Auto-generated method stub
		//return userDao.addUser(user);
		return tusersMapper.addUser(user);
	}

	public List<Tusers> getCountUsers(Tusers user) {
		// TODO Auto-generated method stub
		//return userDao.getCountUsers(user);
		return tusersMapper.getCountUsers(user);
	}

	public Page queryUserList2(Tusers user) throws DataAccessException {
		/*
		 * PageHelper.startPage会拦截下一个sql，也就是mybatisDao.findAll()的SQL。并且根据当前数据库的语法，把这个SQL改造成一个高性能的分页SQL，同时还会查询该表的总行数，具体可以看SQL日志。
			PageHelper.startPage和mybatisDao.findAll()最好紧跟在一起，中间不要有别的逻辑，否则可能出BUG。
			Page<User> page：相当于一个list集合，findAll()方法查询完成后，会给page对象的相关参数赋值
		 */
		//分页插件: 查询第1页，每页10行 
	    Page<Tusers> page =PageHelper.startPage(2, 1);  
	   // userDao.queryUserList2(user); 
	    tusersMapper.queryUserList2(user); 
	    //数据表的总行数 
	    page.getTotal(); 
	    //分页查询结果的总行数 
	    page.size(); 
	    //第一个User对象，参考list，序号0是第一个元素，依此类推 
	    return  page; 
		
	}
	public List<Tusers> queryUserList(Tusers user) throws DataAccessException {
		/*
		 * PageHelper.startPage会拦截下一个sql，也就是mybatisDao.findAll()的SQL。并且根据当前数据库的语法，把这个SQL改造成一个高性能的分页SQL，同时还会查询该表的总行数，具体可以看SQL日志。
			PageHelper.startPage和mybatisDao.findAll()最好紧跟在一起，中间不要有别的逻辑，否则可能出BUG。
			Page<User> page：相当于一个list集合，findAll()方法查询完成后，会给page对象的相关参数赋值
		 */
		//分页插件: 查询第1页，每页10行 
		// Page<Tusers> page =PageHelper.startPage(0, 2);  
		// userDao.queryUserList(user); 
		//数据表的总行数 
		// page.getTotal(); 
		//分页查询结果的总行数 
		// page.size(); 
		//第一个User对象，参考list，序号0是第一个元素，依此类推 
		// return (List<Tusers>) page; 
		return userDao.queryUserList(user);
		//return tusersMapper.queryUserList(user);
	}

	public Tusers queryUser(Tusers user) throws DataAccessException {
		// TODO Auto-generated method stub
		//return userDao.queryUser(user);
		return tusersMapper.queryUser(user);
	}

	public int deleteUserById(int id) {
		// TODO Auto-generated method stub
		//return userDao.deleteUserById(id);
		return tusersMapper.deleteUserById(id);
	}

	public int updateUser(Tusers user) {
		// TODO Auto-generated method stub
		//return userDao.updateUser(user);
		return tusersMapper.updateUser(user);
	}

	
}
