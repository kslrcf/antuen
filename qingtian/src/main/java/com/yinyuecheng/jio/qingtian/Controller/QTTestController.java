package com.yinyuecheng.jio.qingtian.Controller;

import com.yinyuecheng.jio.qingtian.Service.impl.QTTestServiceImpl;
import com.yinyuecheng.jio.qingtian.dto.CarryInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author hang.zhang
 * @Date 2021/1/29 14:28
 * @Version 1.0
 */
@RestController
public class QTTestController {
    @Autowired
    QTTestServiceImpl qtTestService;

    @RequestMapping(value = "/getMainCarry", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public CarryInfo getMainCarry(){
        return qtTestService.getQTMainCarry();
    }
}
