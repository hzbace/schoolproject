package com.qfedu.service.sblogcontent;


import com.qfedu.tool.vo.ResultVo;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author java1806
 * @since 2019-01-22
 */
public interface ISBlogcontentService {

    ResultVo addBlogContent(Integer blcBid, String blcContent);

}
