package com.gcl.springbootthymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/menu")
public class MenuController {
    /**
     * 一级菜单
     * @param model
     * @return
     */
    @RequestMapping("/firstMenu")
    public ModelAndView Menu(Model model){
        model.addAttribute("title","菜单");
        return new ModelAndView("mainMenu","menu",model);
    }
}
