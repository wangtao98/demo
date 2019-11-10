package com.iwller.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class AnnotationController {
    @RequestMapping("/method")
    public ModelAndView method(HttpServletRequest httpServletRequest, HttpSession session) throws Exception {
        System.out.println("AnnotationController.method"+session);
        //回显数据
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","今天天气好热");
        mv.setViewName("/index.jsp");
        return mv;
    }
}
