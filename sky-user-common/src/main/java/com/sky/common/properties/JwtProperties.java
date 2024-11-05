package com.sky.common.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @program: sky-user-order
 * @description:
 * @author: whl
 * @create: 2024-11-04 14:36
 **/
@Component
@ConfigurationProperties(prefix = "user.jwt")
@Data
public class JwtProperties {

    private String userSecretKey;
    private long userTtl;
    private String userTokenName;
}
