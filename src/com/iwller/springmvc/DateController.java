package com.iwller.springmvc;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class DateController {
    @RequestMapping("/date")
    public ModelAndView method(User u)throws Exception{
        System.out.println("DateController.method");
        System.out.println(u);
        return null;
    }
    //每个请求过来之前都会经过这个方法
    @InitBinder
    public void initBinder(WebDataBinder binder){
        System.out.println("DateController.initBinder");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        sdf.setLenient(false);
        binder.registerCustomEditor(Date.class,new CustomDateEditor(sdf,true));
    }

}
