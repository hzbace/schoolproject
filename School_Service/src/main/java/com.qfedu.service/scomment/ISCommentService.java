package com.qfedu.service.scomment;


import com.qfedu.tool.vo.ResultVo;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author java1806
 * @since 2019-01-22
 */
public interface ISCommentService {
    //展示该blog所有评论
    ResultVo showAllComment(Integer cmId);

    //发表评论
    ResultVo addComment(Integer cmId, String token, String cmContent);

}
