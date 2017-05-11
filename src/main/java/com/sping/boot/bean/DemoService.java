package com.sping.boot.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/5/11.
 */
@Service
public class DemoService {

    @Autowired
    public UserService userService;

    public String demo() {
        return "hello " + userService.get();
    }
}
