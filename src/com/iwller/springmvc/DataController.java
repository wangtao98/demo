package com.iwller.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class DataController {
    @RequestMapping("/data")
    public User method1() throws Exception {
        System.out.println("DataController.method1");
        User user = new User("返回内容","888");
        return  user;
    }
    @RequestMapping("/data1")
    public String method2(Model model) throws Exception {
        System.out.println("DataController.method2");
        model.addAttribute("msg","后天放假");
        return  "haha";
    }

    @RequestMapping("/data2")
    public String method3(Model model) throws Exception {
        System.out.println("DataController.method2");
        model.addAttribute("msg","后天放假");
        return  "forward:/input.jsp";
    }
}
