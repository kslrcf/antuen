package com.yinyuecheng.jio.zhenchan.service.impl;

import com.yinyuecheng.jio.zhenchan.service.ZCFirstService;
import org.springframework.stereotype.Service;

/**
 * @Author hang.zhang
 * @Date 2021/1/29 11:28
 * @Version 1.0
 */
@Service
public class ZCFirstServiceImpl implements ZCFirstService {
    @Override
    public String getMainCarry() {
        return "巨大的白手";
    }
}
