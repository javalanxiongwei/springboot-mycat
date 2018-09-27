package cn.wolfcode.mycat.controller;

import cn.wolfcode.mycat.domain.User;
import cn.wolfcode.mycat.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by wolfcode-lanxw
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserMapper userMapper;
    @RequestMapping("/save")
    public String save(User user){
        userMapper.insert(user);
        return "保存成功";
    }
    @RequestMapping("/list")
    public List<User> list(){
        return userMapper.selectAll();
    }
}
