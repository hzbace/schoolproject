package com.qfedu.dao.sblog;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import com.qfedu.entity.sblog.SBlog;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author java1806
 * @since 2019-01-22
 */
public interface SBlogMapper extends BaseMapper<SBlog> {
    @Select("select * from s_blog")
    List<SBlog> getAllBlog();
    @Update("update s_blog set bl_sharenum = #{blSharenum} + 1 where bl_id = #{blId}")
    int updateShare(@Param("blId") Integer blId,@Param("blSharenum") Integer blSharenum);
    @Update("update s_blog set bl_commentnum = #{blCommentnum} + 1 where bl_id = #{blId}")
    int updateComment(@Param("blId") Integer blId,@Param("blCommentnum") Integer blCommentnum);
}
