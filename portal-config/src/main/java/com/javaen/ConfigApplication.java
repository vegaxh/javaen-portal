package com.javaen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * <p>
 * Project Name: javaen-portal
 * <br>
 * Description:
 * <br>
 * File Name: ConfigApplication
 * <br>
 * Copyright: Copyright (C) 2019 All Rights Reserved.
 * <br>
 *
 * @author: vegaxh
 * <p>
 * Date                 Author      Version     Description
 * ------------------------------------------------------------------
 * 2019/9/25 16:59     |vegaxh      |v1.0.1       |Create
 */

@SpringBootApplication
@EnableConfigServer
public class ConfigApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigApplication.class, args);
    }
}
