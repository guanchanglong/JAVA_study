package com.gcl.springbootthymeleaf.controller;

import com.gcl.springbootthymeleaf.entity.Students;
import com.gcl.springbootthymeleaf.service.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/students")
public class StudentsController {

    @Autowired
    private StudentsService studentsService;

    /**
     * 添加成功页面
     * @return
     */
    @RequestMapping("/successToAdd")
    public ModelAndView successToAdd(Model model){
        model.addAttribute("title","添加成功");
        return new ModelAndView("successStudents","Success",model);
    }

    /**
     * 添加失败页面
     * @return
     */
    @RequestMapping("/failToAdd")
    public ModelAndView failToAdd(Model model){
        model.addAttribute("title","添加失败");
        return new ModelAndView("failStudents","Fail",model);
    }

    /**
     * 删除成功页面
     * @return
     */
    @RequestMapping("/successToDelete")
    public ModelAndView successToDelete(Model model){
        model.addAttribute("title","删除成功");
        return new ModelAndView("successStudents","Success",model);
    }

    /**
     * 删除失败页面
     * @return
     */
    @RequestMapping("/failToDelete")
    public ModelAndView failToDelete(Model model){
        model.addAttribute("title","删除失败");
        return new ModelAndView("failStudents","Fail",model);
    }

    /**
     * 修改成功页面
     * @return
     */
    @RequestMapping("/successToModify")
    public ModelAndView successToModify(Model model){
        model.addAttribute("title","修改成功");
        return new ModelAndView("successStudents","Success",model);
    }

    /**
     * 修改失败页面
     * @return
     */
    @RequestMapping("/failToModify")
    public ModelAndView failToModify(Model model){
        return new ModelAndView("failStudents","Fail",model);
    }

    /**
     * 按学号查找学生
     * @param number
     * @return
     */
    public boolean findAllByNumber(String number){
        return studentsService.findAllByNumber(number)==null||studentsService.findAllByNumber(number).isEmpty();
    }

    /**
     * 显示所有学生信息
     * @param model
     * @return
     */
    @GetMapping("/findAll")
    public ModelAndView findAll(Model model){
        List<Students> list = studentsService.findAll();
        model.addAttribute("studentsList" , list);
        model.addAttribute("title","学生管理");
        return new ModelAndView("studentsList","students",model);
    }

    /**
     * 创建增添学生功能的表单
     * @param model
     * @return
     */
    @GetMapping("/add")
    public ModelAndView createFormForAddStudents(Model model){
        model.addAttribute("student",new Students());
        model.addAttribute("title","添加学生");
        return new ModelAndView("studentsAdd","studentsModel",model);
    }


    /**
     * 增添学生功能
     * @param students
     * @return
     */
    @PostMapping("/addStudents")
    public ModelAndView addStudents(Students students){
        if (findAllByNumber(students.getNumber())){     //如果不存在该学生添加进数据库
            studentsService.save(students);
            return new ModelAndView("redirect:/students/successToAdd");
        }
        else{
            return new ModelAndView("redirect:/students/failToAdd");
        }
    }

    /**
     * 创建删除学生功能的表单
     * @param model
     * @return
     */
    @GetMapping("/delete")
    public ModelAndView createFormForDeleteStudents(Model model){
        model.addAttribute("student", new Students());
        model.addAttribute("title","删除学生");
        return new ModelAndView("studentsDelete","studentsModel",model);
    }

    /**
     * 删除学生功能
     * @param students
     * @return
     */
    @Transactional
    @DeleteMapping("/deleteStudents")
    public ModelAndView deleteStudents(Students students){
        if (findAllByNumber(students.getNumber())){     //如果不存在该学生，删除失败
            return new ModelAndView("redirect:/students/failToDelete");
        }
        else{                                           //存在该学生，执行删除操作
            studentsService.deleteByNumber(students.getNumber());
            return new ModelAndView("redirect:/students/successToDelete");
        }
    }

    /**
     * 创建修改学生信息的表单
     * @param model
     * @return
     */
    @GetMapping("/modify")
    public ModelAndView createFormForModifyStudents(Model model){
        model.addAttribute("student",new Students());
        model.addAttribute("title","修改学生信息");
        return new ModelAndView("studentsModify","studentsModel",model);
    }

    /**
     * 修改学生信息功能
     * @param students
     * @return
     */
    @Transactional
    @PostMapping("/modifyStudents")
    public ModelAndView modifyStudents(Students students){
        if (findAllByNumber(students.getNumber())){     //如果不存在就修改失败
            return new ModelAndView("redirect:/students/failToModify");
        }
        else{
            studentsService.deleteByNumber(students.getNumber());           //先将原存在的学生信息删除
            studentsService.save(students);                                 //再保存新的学生信息
            return new ModelAndView("redirect:/students/successToModify");
        }
    }
}
