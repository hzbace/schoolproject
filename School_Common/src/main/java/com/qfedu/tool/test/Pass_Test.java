package com.qfedu.tool.test;

import com.qfedu.tool.util.Base64Util;
import com.qfedu.tool.util.EncryptUtil;

public class Pass_Test {
    public static void main(String[] args) {
        System.out.println("AES秘钥："+ Base64Util.base64Enc(EncryptUtil.createAESKey()));
    }
}
