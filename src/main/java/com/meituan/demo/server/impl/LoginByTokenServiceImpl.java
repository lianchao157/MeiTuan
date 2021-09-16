package com.meituan.demo.server.impl;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.meituan.demo.server.LoginByTokenService;
import org.springframework.stereotype.Service;

@Service
public class LoginByTokenServiceImpl implements LoginByTokenService {


    @Override
    public String getToken(String name, String password) {

            String token="";
            token= JWT.create()
                    .withClaim("username", name)
                    .withClaim("generatetime",System.currentTimeMillis())
                    .withClaim("exptime",1000*1*60*60)
                    .sign(Algorithm.HMAC256(password));// 以 password 作为 token 的密钥
            return token;
        }
}
