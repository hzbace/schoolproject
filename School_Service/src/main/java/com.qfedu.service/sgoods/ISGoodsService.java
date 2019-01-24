package com.qfedu.service.sgoods;

import com.baomidou.mybatisplus.extension.service.IService;

import com.qfedu.entity.sgoods.SGoods;
import com.qfedu.tool.vo.ResultVo;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author java1806
 * @since 2019-01-24
 */
public interface ISGoodsService {
    //展示所有交换的商品
    ResultVo getAllGoods();

    //添加所要交换的商品
    ResultVo addGoods(String gName, String gContent,String gUwant,String gUsernum);

}
