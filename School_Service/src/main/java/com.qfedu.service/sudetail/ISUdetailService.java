package com.qfedu.service.sudetail;

import com.baomidou.mybatisplus.extension.service.IService;

import com.qfedu.entity.sudetail.SUdetail;
import com.qfedu.tool.vo.ResultVo;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author java1806
 * @since 2019-01-17
 */
public interface ISUdetailService{
    //更新用户详情界面
    ResultVo updateUserDetail(SUdetail sUdetail);
}
