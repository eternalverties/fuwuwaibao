package com.example.springaisimple.controller;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ai")
public class AIController {

    //智能对话的客户端
    @Autowired
    private ChatClient chatClient;

    @GetMapping("/chat")
    public String generation(@RequestParam(value="message",defaultValue = "请帮我生成一份教学设计") String message){
        //prompt:提示词
        return this.chatClient.prompt()
                //用户信息
            .user(message)
                //远程请求大模型
                .call()
                //返回文本
                .content();
        }
    }
