package com.websocket.mywebsocket.web;

import com.websocket.mywebsocket.domain.MailBean;
import com.websocket.mywebsocket.utils.MailUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.thymeleaf.TemplateEngine;

import java.io.IOException;

@Controller
public class EmailController {
@Autowired
    private MailUtil mailUtil;
@Autowired
    private TemplateEngine templateEngine;

    @RequestMapping( value = "/mail" ,method = RequestMethod.POST)
    public String mail(@RequestParam("file") MultipartFile file, @RequestParam String recipient, @RequestParam String subject, @RequestParam String content ){
        MailBean mailBean=new MailBean();
        mailBean.setContent(content);
        mailBean.setRecipient(recipient);
        mailBean.setSubject(subject);
        mailUtil.sendAttachmentMail(mailBean,file);
        return "redirect:/";
    }

    @RequestMapping( value = "/mailPost" ,method = RequestMethod.POST)
    @ResponseBody
    public String mail(@RequestBody MailBean mailBean){

        mailUtil.sendAttachmentMailAndPost(mailBean);
        return "OK";
    }
}
