package com.qfedu.tool.token;

import com.alibaba.fastjson.JSON;

import com.qfedu.entity.suser.SUser;
import com.qfedu.tool.contant.SystemConst;
import com.qfedu.tool.util.Base64Util;
import com.qfedu.tool.util.EncryptUtil;

import java.time.LocalDateTime;
import java.util.Random;

public class TokenUtil {
    //生成Token
    public static String createToken(SUser user){
        LoginToken token = new LoginToken();
        token.setId(user.getUserid());
        token.setUser(user);
        token.setCreatetime(LocalDateTime.now());
        token.setRandomnum(new Random().nextLong());
        String json = JSON.toJSONString(token);
        return EncryptUtil.AESEnc(Base64Util.base64Dec(SystemConst.TOKENKEY),json);



    }
    //更新Token的时间
    public static String updateToken(String token){
        String json = EncryptUtil.AESDec(Base64Util.base64Dec(SystemConst.TOKENKEY),token);
        LoginToken loginToken = JSON.parseObject(json,LoginToken.class);
        loginToken.setCreatetime(LocalDateTime.now());
        loginToken.setRandomnum(new Random().nextLong());
        return EncryptUtil.AESEnc(Base64Util.base64Dec(SystemConst.TOKENKEY),JSON.toJSONString(loginToken));
    }
}
