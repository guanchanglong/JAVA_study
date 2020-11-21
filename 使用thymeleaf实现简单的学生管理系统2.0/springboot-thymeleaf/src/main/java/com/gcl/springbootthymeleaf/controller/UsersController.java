package com.gcl.springbootthymeleaf.controller;

import com.gcl.springbootthymeleaf.entity.Users;
import com.gcl.springbootthymeleaf.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.awt.*;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

@Controller
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private UsersService usersService;

    /**
     * 查看此人是否重复注册
     * @param username
     * @return
     */
    public boolean findByUserName(String username){
        return usersService.findByUserName(username) == null||usersService.findByUserName(username).isEmpty();
    }

    public boolean findByUserNameAndPassword(String username,String password){
        return usersService.findAllByUsernameAndPassword(username,password)==null||usersService.findAllByUsernameAndPassword(username,password).isEmpty();
    }



    @GetMapping("/findAll")
    public ModelAndView findAll(Model model, @RequestParam(value = "pageNum", defaultValue = "0") int pageNum, @RequestParam(value = "pageSize", defaultValue = "6") int pageSize){
        List<Users> list = usersService.findAll();

        Page<Users> users = usersService.getUsersList(pageNum, pageSize);
        Iterator<Users> usersIterator = users.iterator();
        while (usersIterator.hasNext()){
            System.out.println(usersIterator.next().toString());
        }
        model.addAttribute("usersPage", users);
        model.addAttribute("usersList" , list);
        model.addAttribute("title","学生管理");

        return new ModelAndView("usersShow","users",model);
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
    public ModelAndView addUser(Users user,Model model){
        if (findByUserName(user.getUsername())){
            usersService.save(user);
            model.addAttribute("title","注册成功");
            return new ModelAndView("successToRegister","Success",model);
        }
        else{
            model.addAttribute("title","注册失败");
            return new ModelAndView("fail","Fail",model);
        }
    }

    /**
     * 创建登录表单
     * @param model
     * @return
     */
    @GetMapping("/login")
    public ModelAndView createFormForLogin(Model model, HttpServletRequest request){
        model.addAttribute("user",new Users());
//        HttpSession session = request.getSession();
//        Image code = (Image) session.getAttribute("code");
        model.addAttribute("title","用户登录");
//        model.addAttribute("code",code);
        return new ModelAndView("userLogin","usersModel",model);
    }

    /**
     * 用户登录
     * @param user
     * @return
     */
    @GetMapping("/userLogin")
    public ModelAndView userLogin(Users user, HttpSession session,Model model){
        if (findByUserNameAndPassword(user.getUsername(),user.getPassword())){
            model.addAttribute("title","登录失败");
            return new ModelAndView("failToLogin","Fail",model);
        }
        else{
            //在session中设置用户信息
            session.setAttribute("userLogin",user.getUsername());
            return new ModelAndView("redirect:/menu/firstMenu");    //登录成功
        }
    }


    /*
    在退出功能的方法里面我们就要执行清空session中数据的操作，
    首先用Enumeration的对象来得到所有的session中的信息，
    使用循环遍历，执行 removeAttribute（）的session删除操作，
    清空所有session中的信息，最后再跳转到登录页面：
     */
    @RequestMapping("/outLogin")
    public ModelAndView outLogin(HttpServletRequest request){
        Enumeration em = request.getSession().getAttributeNames();
        while(em.hasMoreElements()){
            request.getSession().removeAttribute(em.nextElement().toString());
        }
        return new ModelAndView("redirect:/");
    }
}
