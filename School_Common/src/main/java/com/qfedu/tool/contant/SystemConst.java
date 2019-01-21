package com.qfedu.tool.contant;

public class SystemConst {
    //Token的密钥
    public static final String TOKENKEY = "JKaFp3nOoMCCtXV9nE14LQ==";


    //Redis存储Token的集合名称
    public static final String TOKENMAP = "usertokens";

    //Redis存储签到的连续天数
    public static final String SIGNINMAP = "usersignindays";

    //学贝的默认失效时间 6个月
    public static final int SHELLMONTH = 6;

    //学贝的类型
    public static final int SHELLTYPE1 = 1;//签到
    public static final int SHELLTYPE2 = 2;//推荐新用户
    public static final int SHELLTYPE3 = 3;//活动赠送
    public static final int SHELLTYPE4 = 4;//充值 没有失效期

}
