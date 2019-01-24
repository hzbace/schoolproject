package com.qfedu.service.sfriend;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qfedu.entity.sfriend.SFriend;
import com.qfedu.tool.vo.ResultVo;


/**
 * <p>
 *  服务类
 * </p>
 *
 * @author java1806
 * @since 2019-01-24
 */
public interface ISFriendService {
    //展示好友列表
    ResultVo getAllFriend(String token);

}
