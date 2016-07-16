package com.hulk.springboot.mybatis;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
/**
 * UserMapper
 * @author hulk
 *
 */
import org.apache.ibatis.annotations.Select;

import com.hulk.springboot.model.User;

@Mapper
public interface UserMapper {
	@Select("select * from user")
	List<User> findAllUser();

	@Insert("insert into user(username,password) values(#{user.username},#{user.password})")
	boolean insertUser(@Param("user") User user);

	@InsertProvider(type = UserMapperProvider.class, method = "insertUser")
	void insertUserProvider(@Param("user") User user);

	@InsertProvider(type = UserMapperProvider.class, method = "insertALLBatch")
	void insertUserListProvider(@Param("users") List<User> users);
}
