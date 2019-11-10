package com.iwller.springmvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class JSONController {
    @RequestMapping("jsonData")
    @ResponseBody//我们的响应不再是通过springMVC处理，而是通过response处理
    public User jsonMethod(){
        return new User("admin", "123");
    }
    public static void main(String[] args)throws Exception{
        ObjectMapper objectMapper = new ObjectMapper();
        User u = new User("admin", "123");
        String str = objectMapper.writeValueAsString(u);
        System.out.println(str);
    }
}
