package cn.figo.repository;

import cn.figo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author Figo
 * @Date 2020/1/12 19:24
 */
public interface UserRepository extends JpaRepository<User,Long> {

    public List<User> findAll();

}
