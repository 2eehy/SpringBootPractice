package com.ohgiraffers.springbootpractice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping()
@SessionAttributes("nickName")
public class MainController {

    @PostMapping("/main")
    public ModelAndView tomain(ModelAndView mv,String nickName){

        System.out.println(nickName);

        mv.addObject("nickName",nickName);

        mv.setViewName("main");


        return mv;
    }




}
