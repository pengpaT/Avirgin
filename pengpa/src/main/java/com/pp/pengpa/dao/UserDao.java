package com.pp.pengpa.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.springframework.dao.DataAccessException;

import com.pp.pengpa.entity.Tusers;
@Mapper
public interface UserDao {
	/*@Mapper：声明一个mybatis的dao接口，会被spring boot扫描到
	 * @SelectKey注解用于查询一下需要的前置字段，如上面的代码所示先查出id字段的值，然后插入到t_user表中，一般配合@Insert和@Update
	 */
	@SelectKey(statement = "select max(id) from t_users", before = true, resultType = long.class, keyProperty = "id")
	@Insert("insert into t_users(id,username,userpwd,userstate,usertype,registeredtme,phones,mechanicals) values (#{id},#{username},#{userpwd},#{userstate},#{usertype},#{registeredtme},#{phones},#{mechanicals})")
	public int addUserKey(Tusers user) throws DataAccessException;
	/*
	 * 回传ID
		假设数据库表的ID主键是自动增长的，现在添加一条数据，想要得到这条数据自动增长的ID，方法如下
		dao层:useGeneratedKeys=true：获取数据库生成的主键
		keyProperty="id"：把主键值存入User param对象的id属性
		@Insert("insert into user(name) values(#{name})") 
		@Options(useGeneratedKeys=true,keyProperty="id")  
		public int addUser(Tusers user);
	 */
	@Insert("insert into t_users(username,userpwd,userstate,usertype,registeredtme,phones,mechanicals) values (#{username},#{userpwd},#{userstate},#{usertype},#{registeredtme},#{phones},#{mechanicals})")
	@Options(useGeneratedKeys=true,keyProperty="id") 
	public int addUser(Tusers user) throws DataAccessException;
	
	@Select("select count(id) from t_users where username=#{username}")  
	public List<Tusers> getCountUsers(Tusers user); 
	//@Select("select * from t_users where username=#{username} limit #{start},#{end}")
	@Select({"<script>",
	    "SELECT * FROM t_users",
	    "WHERE 1=1",
	    "<when test='username!=null'>",
	    "AND username=#{username}",
	    "</when>",
	   " limit #{start},#{end}",
	    "</script>"})
	public List<Tusers> queryUserList(Tusers user) throws DataAccessException;
	@Select({"<script>",
		"SELECT * FROM t_users",
		"WHERE 1=1",
		"<when test='username!=null'>",
		"AND username=#{username}",
		"</when>",
	"</script>"})
	public List<Tusers> queryUserList2(Tusers user) throws DataAccessException;
	@Select("select * from t_users where id=#{id}")
	public Tusers queryUser(Tusers user) throws DataAccessException;

	@Delete("delete from  t_users where id =#{id}")  
    int deleteUserById(int id); 
	
	@Update("update t_users set username=#{username} where id=#{id}")  
	int updateUser(Tusers user);
}
