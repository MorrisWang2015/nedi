package com.baoxian.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Date:2019/1/20
 * Author:Morris
 */
@Controller
public class BaseController {

    Logger logger = LoggerFactory.getLogger(BaseController.class);

    @RequestMapping("/recieve")
    public void getRequest(HttpServletRequest request) {

        try {
            String senStr = getRequestContent(request);
            logger.info("接收到报文{}", senStr);
        } catch (IOException e) {
            logger.info(String.valueOf(e));
        }

    }

    private String getRequestContent(HttpServletRequest request) throws IOException {
        //StringBuffer stringBuffer = new StringBuffer();
        // 取HTTP请求流
        ServletInputStream sis = request.getInputStream();
        // 取HTTP请求流长度
        int size = request.getContentLength();
        // 用于缓存每次读取的数据
        byte[] buffer = new byte[size];
        // 用于存放结果的数组
        byte[] xmldataByte = new byte[size];
        int count = 0;
        int rbyte = 0;
        // 循环读取
        while (count < size) {
            // 每次实际读取长度存于rbyte中
            rbyte = sis.read(buffer);
            for (int i = 0; i < rbyte; i++) {
                xmldataByte[count + i] = buffer[i];
            }
            count += rbyte;
        }

        String str = new String(xmldataByte, "UTF-8");

        if (logger.isInfoEnabled()) {
            logger.info("请求ip--" + "--接收到报文 ： {}", str);
        }
        return str;
    }

}
