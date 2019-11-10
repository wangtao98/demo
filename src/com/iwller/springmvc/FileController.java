package com.iwller.springmvc;

import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

@Controller
public class FileController {
    @RequestMapping("/fileupload")
    //File不能完全描述一个上传文件，比如说文件类型
    public String upload(MultipartFile file){
        System.out.println(file.getName());//获取表单的名字
        System.out.println(file.getSize());//获取表单的大小
        System.out.println(file.getOriginalFilename());//获取上传文件的原始名字
//        System.out.println(file.getInputStream());//获取到文件上传的输入流
        System.out.println(file.getContentType());//获取上传文件的类型
        InputStream in = null;
        OutputStream out = null;
        try {
            out = new FileOutputStream("D:/a.txt");
            in = file.getInputStream();
            IOUtils.copy(in,out);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return "";
    }
    @RequestMapping("/download")
    public void download(HttpServletResponse response)throws Exception{
        //拿到响应流
        ServletOutputStream out = response.getOutputStream();
        //读取需要被下载的文件
        FileInputStream in = new FileInputStream("D:/a.jpg");
        //解决乱码问题
        String str = "逗逼";
        str = new String(str.getBytes("UTF-8"), "ISO8859-1");
        //设置下载头
        response.setHeader("Content-Disposition","attachment;fileName="+str+".jpg");
        IOUtils.copy(in,out);
        in.close();
    }
}
