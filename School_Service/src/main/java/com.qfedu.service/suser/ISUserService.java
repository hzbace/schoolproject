package com.qfedu.service.suser;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qfedu.entity.suser.SUser;
import com.qfedu.tool.vo.ResultVo;


/**
 * <p>
 *  服务类
 * </p>
 *
 * @author java1806
 * @since 2019-01-17
 */
public interface ISUserService  {
    //审核学号
    ResultVo check(String usernum);
    //用户登录
    ResultVo login(String usernum, String userpassword);
    //用户退出
    ResultVo loginout(String token);
    //修改密码
    ResultVo updatePassword(String userpassword, String newpassword, String token, String newpassword2);
    //通过当前用户id查询学号
    ResultVo getUsernum(String token);

}
