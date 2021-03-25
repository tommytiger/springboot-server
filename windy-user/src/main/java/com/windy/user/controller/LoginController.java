package com.windy.user.controller;

import com.windy.user.entity.dto.WxLoginReq;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Slf4j
@RequestMapping("/login")
@RestController
public class LoginController {


    @Value("${wx.auth-code2Session}")
    private String authCode2SessionUrl;


    @PostMapping("")
    public String login(@RequestBody String code) {
        RestTemplate restTemplate = new RestTemplate();
        log.info("code={}", code);
        String result = "";

        authCode2SessionUrl = authCode2SessionUrl + "&js_code=" + code + "&grant_type=authorization_code";
        log.info("微信codeUrl={}", authCode2SessionUrl);
        result = restTemplate.getForEntity(authCode2SessionUrl, String.class).getBody();
        log.info("响应结果:{}",result);
        return result;
}
}
