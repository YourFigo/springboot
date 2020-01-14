package cn.figo.springboot.mapper;

import cn.figo.springboot.pojo.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author Figo
 * @Date 2020/1/14 22:38
 */
@Mapper
public interface UserMapper extends tk.mybatis.mapper.common.Mapper<User> {
}
