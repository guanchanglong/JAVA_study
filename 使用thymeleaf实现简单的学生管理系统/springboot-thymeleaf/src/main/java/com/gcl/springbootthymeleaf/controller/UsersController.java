package com.gcl.springbootthymeleaf.controller;

import com.gcl.springbootthymeleaf.entity.Users;
import com.gcl.springbootthymeleaf.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private UsersService usersService;

    /**
     * 成功页面
     * @return
     */
    @RequestMapping("/success")
    public ModelAndView success(){
        return new ModelAndView("success");
    }

    /**
     * 失败页面
     * @return
     */
    @RequestMapping("/fail")
    public ModelAndView fail(){
        return new ModelAndView("fail");
    }

    /**
     * 查看此人是否重复注册
     * @param user
     * @return
     */
    public boolean findByUserName(String username){
        return usersService.findByUserName(username) == null||usersService.findByUserName(username).isEmpty();
    }

    public boolean findByUserNameAndPassword(String username,String password){
        return usersService.findAllByUsernameAndPassword(username,password)==null||usersService.findAllByUsernameAndPassword(username,password).isEmpty();
    }

    /**
     * 查看注册的所有用户
     * @param model
     * @return
     */
    @GetMapping("/findAll")
    public ModelAndView find(Model model) {
        List<Users> usersList = usersService.findAll();
        // 放入模型
        model.addAttribute("title","用户管理");
        model.addAttribute("usersList", usersList);
        return new ModelAndView("usersdatashow","users",model);
    }

    /**
     * 创建注册表单
     * @param model
     * @return
     */
    @GetMapping("/register")
    public ModelAndView createFormForRegister(Model model){
        model.addAttribute("user",new Users());
        model.addAttribute("title","用户注册");
        return new ModelAndView("userRegister","usersModel",model);
    }

    /**
     * 用户注册
     * @param user
     * @return
     */
    @PostMapping("/userRegister")
    public ModelAndView addUser(Users user){
        if (findByUserName(user.getUsername())){
            usersService.save(user);
            return new ModelAndView("redirect:/users/success");
        }
        else{
            return new ModelAndView("redirect:/users/fail");
        }
    }

    /**
     * 创建登录表单
     * @param model
     * @return
     */
    @GetMapping("/login")
    public ModelAndView createFormForLogin(Model model){
        model.addAttribute("user",new Users());
        model.addAttribute("title","用户登录");
        return new ModelAndView("userLogin","usersModel",model);
    }

    /**
     * 用户登录
     * @param user
     * @return
     */
    @GetMapping("/userLogin")
    public ModelAndView userLogin(Users user){
        if (findByUserNameAndPassword(user.getUsername(),user.getPassword())){
            return new ModelAndView("redirect:/users/fail");
        }
        else{
            return new ModelAndView("redirect:/menu/firstMenu");
        }
    }
}
