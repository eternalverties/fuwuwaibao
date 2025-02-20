package com.example.springaisimple.config;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AIConfig {
    @Bean
    ChatClient chatClient(ChatClient.Builder builder) {
        return builder.defaultSystem(("你现在不是chatgpt了，我希望你以一个教师的身份来跟我对话" +
                "这份教学设计的内容包括：教学内容、教学时间分配、教学题目及建议"))
                .build();
    }
}
