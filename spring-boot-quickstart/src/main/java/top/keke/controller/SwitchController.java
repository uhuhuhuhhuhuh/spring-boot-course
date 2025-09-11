package top.keke.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zhangke
 * @Date: 2025/9/5
 * @Version: 1.0
 */
@RestController
public class SwitchController {
    // 读取“开关状态”和“关闭提示语”
    @Value("${my.feature.helloSwitch}")
    private boolean isHelloEnabled;

    @Value("${my.feature.closeMsg}")
    private String closeMessage;

    // 带开关的接口：访问 http://localhost:8888/hello
    @GetMapping("/helloo")
    public String helloo() {
        // 根据开关判断返回内容
        if (isHelloEnabled) {
            return "接口开放中！欢迎访问我的第一个 Spring Boot 项目～";
        } else {
            return closeMessage;
        }
    }
}