package com.pp.pengpa.dao;

import com.pp.pengpa.entity.Tusers;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
@Mapper
public interface TusersMapper {
	public int addUserKey(Tusers user);
	public int addUser(Tusers user);
	public List<Tusers> getCountUsers(Tusers user); 
	public List<Tusers> queryUserList(Tusers user);
	public List<Tusers> queryUserList2(Tusers user);
	public Tusers queryUser(Tusers user);
	int deleteUserById(int id); 
	int updateUser(Tusers user);
}