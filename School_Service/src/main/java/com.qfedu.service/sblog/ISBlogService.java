package com.qfedu.service.sblog;


import com.qfedu.tool.vo.ResultVo;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author java1806
 * @since 2019-01-22
 */
public interface ISBlogService  {
    //审核并添加blog标题
    ResultVo checkBlog(Integer blStyle, String token, String blItem);

    //展示所有blog
    ResultVo showAllBlog();

    //添加赞
    ResultVo updateShare(Integer blId, Integer blSharenum);



}
