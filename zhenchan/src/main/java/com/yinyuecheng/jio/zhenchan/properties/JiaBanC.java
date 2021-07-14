package com.yinyuecheng.jio.zhenchan.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Author hang.zhang
 * @Date 2021/4/29 17:54
 * @Version 1.0
 */
@Component
public class JiaBanC {
    private String  name;
    private String  profession;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }
}
