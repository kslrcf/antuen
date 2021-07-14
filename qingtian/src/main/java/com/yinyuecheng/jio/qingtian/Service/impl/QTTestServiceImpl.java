package com.yinyuecheng.jio.qingtian.Service.impl;

import com.yinyuecheng.jio.qingtian.Service.QTTestService;
import com.yinyuecheng.jio.qingtian.dto.CarryInfo;
import org.springframework.stereotype.Service;

/**
 * @Author hang.zhang
 * @Date 2021/1/29 14:29
 * @Version 1.0
 */
@Service
public class QTTestServiceImpl implements QTTestService {
    @Override
    public CarryInfo getQTMainCarry() {
        CarryInfo carryInfo = new CarryInfo();
        carryInfo.setPower(6000);
        carryInfo.setProfession("sword");
        return carryInfo;
    }
}
