package com.iwller.springmvc;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorldController implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        System.out.println("HelloWorldController.handleRequest");
        //回显数据
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","今天天气好热");
        mv.setViewName("/index.jsp");
        return mv;
    }
}
