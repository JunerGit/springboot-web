package vip.juner.springboot.web.system.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import vip.juner.springboot.web.system.model.JDBC;

public interface JDBCMapper {
	
	@Select("SELECT * FROM USERS WHERE NAME = #{name}")
	JDBC findByName(@Param("name") String name);
	
	@Insert("INSERT INTO USERS(NAME, AGE) VALUES(#{name}, #{age})")
	int insert(@Param("name") String name, @Param("age") Integer age);

}
