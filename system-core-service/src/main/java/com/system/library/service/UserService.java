package com.system.library.service;

import com.system.library.entity.User;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @ClassName UserService
 * @Author mawenjie
 * @Date 2019-07-22 17:15
 **/
public interface UserService {

    List<User> getUserList();
}
