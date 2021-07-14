package com.yinyuecheng.jio.zhenchan.feign;

import com.yinyuecheng.jio.zhenchan.dto.CarryInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author hang.zhang
 * @Date 2021/1/29 15:24
 * @Version 1.0
 */

@FeignClient("jio-qingtian")
public interface FeignJioQingTianService {

    @RequestMapping(value = "/getMainCarry", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    CarryInfo getMainCarry();

}
