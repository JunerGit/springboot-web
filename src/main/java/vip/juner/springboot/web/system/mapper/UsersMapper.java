package vip.juner.springboot.web.system.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import vip.juner.springboot.web.system.model.Users;

@Mapper
public interface UsersMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Users record);

    int insertSelective(Users record);

    Users selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);
    
    List<Users> findByUser(String name);
}