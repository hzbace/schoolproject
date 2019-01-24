package com.qfedu.service.sschedule;

import com.baomidou.mybatisplus.extension.service.IService;

import com.qfedu.entity.sschedule.SSchedule;
import com.qfedu.tool.vo.ResultVo;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author java1806
 * @since 2019-01-21
 */
public interface ISScheduleService  {
    ResultVo selectByMjid(Integer sdMjid);

}
