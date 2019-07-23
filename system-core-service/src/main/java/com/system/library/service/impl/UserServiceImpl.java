package com.system.library.service.impl;

import com.system.library.entity.User;
import com.system.library.repository.UserRepository;
import com.system.library.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName userServiceImpl
 * @Author mawenjie
 * @Date 2019-07-20 22:20
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> getUserList() {
        System.out.println(11111);
        return userRepository.findAll();
    }
}
