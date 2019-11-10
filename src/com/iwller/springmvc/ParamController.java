package com.iwller.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class ParamController {
    /*
    原始方式:req.getParameter
     */
    @RequestMapping("/param")
    public ModelAndView param(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        User u = new User(username, password);
        System.out.println(u);
        return  null;
    }
    //方法形参与前台的参数一致（基于同名匹配原则）
    @RequestMapping("/param1")
    public ModelAndView param1(String username,String password) throws Exception {
        User u = new User(username, password);
        System.out.println(u);
        return  null;
    }
    //方法形参与前台参数不一致时,用注解@RequestParam()
    @RequestMapping("/param2")
    public ModelAndView param2(@RequestParam("username") String name, String password) throws Exception {
        User u = new User(name, password);
        System.out.println(u);
        return  null;
    }
    //
    @RequestMapping("/param3")
    public ModelAndView param3(User u) throws Exception {
        System.out.println("ParamController.param3");
        System.out.println(u);
        return  null;
    }
    @RequestMapping("/delete/{dirId}")
    public ModelAndView delete(@PathVariable("dirId") Long id) throws Exception {
        System.out.println(id);
        return  null;
    }

}
