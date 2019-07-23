package com.system.library.service;

import com.system.library.entity.User;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @ClassName UserService
 * @Description connect service which name is library-system-core-service
 * @Author mawenjie
 * @Date 2019-07-22 17:58
 **/
@FeignClient(name = "library-system-core-service")
public interface UserService {

    @GetMapping("/user")
    List<User> getUserList();
}
