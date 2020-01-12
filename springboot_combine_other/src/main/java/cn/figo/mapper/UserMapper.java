package cn.figo.mapper;

import cn.figo.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author Figo
 * @Date 2020/1/12 18:14
 */
@Mapper
public interface UserMapper {
    public List<User> queryUserList();
}
