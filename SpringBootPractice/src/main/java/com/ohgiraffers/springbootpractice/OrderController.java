package com.ohgiraffers.springbootpractice;


import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;
import java.util.Date;

@Controller
@RequestMapping
public class OrderController {


    @PostMapping("/order")
    public ModelAndView insertOrder(ModelAndView mv, OrderDTO newOrder){


        newOrder.setDate(new Date());

        System.out.println(newOrder);

        mv.addObject("order",newOrder);
        mv.setViewName("confirm");

        return mv;
    }

}
