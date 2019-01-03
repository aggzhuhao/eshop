package com.zhuhao.eshop.controller;


import com.zhuhao.eshop.entity.User;
import com.zhuhao.eshop.serviceImpl.LoginServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.net.ssl.HttpsURLConnection;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpSession;

/**
 * restful 接口
 */
@Controller
public class LoginController {

    @Autowired
    LoginServiceImpl loginService;



    //判断账号是否能登录
    @RequestMapping("/loginuser")
    public Object getuser(User user, HttpSession session){
        User user1 = loginService.selectUserByIdPsw(user);
        if(user1 != null){
            session.setAttribute("user",user1);
            return "/index";
        }
        return "/login";
    }

    //ajax  判断数据库内是否存在user
    @ResponseBody
    @RequestMapping("/checkusername")
    public boolean checkusername(String username){
        return loginService.checkusername(username);
    }

    //新增用户
    @RequestMapping("/createUser")
    public String createUser(User user, HttpSession session){
        if(user != null && user.getUsername() != null) {
            if (loginService.createUser(user)) {
                session.setAttribute("user", user);
                return "redirect:/index";
            }
            return "/register";
        }
        return "/index";
    }

    //注销用户
    @RequestMapping("/removeuser")
    public String removeuser(HttpSession session){
        session.removeAttribute("user");
        return "redirect:/index";
    }

}
