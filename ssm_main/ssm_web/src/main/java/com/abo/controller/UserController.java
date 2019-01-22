package com.abo.controller;

import com.abo.domain.User;
import com.abo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * 控制器
 * findAll:查询用户表,显示所有用户信息
 */
@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private IUserService userService;

    @RequestMapping("findAll")
    public ModelAndView findAll(){
        // 调用service查询
        List<User> list = userService.findAll();
        ModelAndView mv = new ModelAndView();
        // 保存数据（到request域）
        mv.addObject("list",list);
        // 设置转发的页面
        mv.setViewName("list");
        return mv;
    }
}
