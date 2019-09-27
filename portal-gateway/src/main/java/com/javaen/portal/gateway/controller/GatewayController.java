package com.javaen.portal.gateway.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 * Project Name: javaen-portal
 * <br>
 * Description:
 * <br>
 * File Name: GatewayController
 * <br>
 * Copyright: Copyright (C) 2019 All Rights Reserved.
 * <br>
 *
 * @author: vegaxh
 * <p>
 * Date                 Author      Version     Description
 * ------------------------------------------------------------------
 * 2019/9/27 10:47     |vegaxh      |v1.0.1       |Create
 */

@Controller
@RefreshScope
public class GatewayController {

    @Value("${user.name}")
    private String userName;

    @RequestMapping("/getUserName")
    @ResponseBody
    public String get() {
        return this.userName;
    }
}
