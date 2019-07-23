package com.system.library.repository;

import com.system.library.entity.User;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @ClassName userRepository
 * @Author mawenjie
 * @Date 2019-07-20 22:17
 **/
@Repository
public interface UserRepository extends JpaRepository<User, String> {

    List<User> findAll();
}
