package com.yinyuecheng.jio.zhenchan.controller;


import com.yinyuecheng.jio.zhenchan.dto.CarryInfo;
import com.yinyuecheng.jio.zhenchan.feign.FeignJioQingTianService;
import com.yinyuecheng.jio.zhenchan.service.impl.ZCFirstServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author hang.zhang
 * @Date 2021/1/29 11:27
 * @Version 1.0
 */
@RestController
public class ZCFirstController {
    @Autowired
    ZCFirstServiceImpl zcFirstService;
    @Autowired
    FeignJioQingTianService feignJioQingTianService;


    @RequestMapping("getZCMainCarry")
    public String getZCMainCarry(@RequestBody String str){
        return zcFirstService.getMainCarry();
    }

    @RequestMapping("/getQTMainCarry")
    public CarryInfo getQTMainCarry(){
        return feignJioQingTianService.getMainCarry();
    }

    @RequestMapping("/getQTMainCarry")
    public String getJPMainCarry(){

    }

}
