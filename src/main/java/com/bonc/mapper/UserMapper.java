package com.bonc.mapper;

import org.apache.ibatis.annotations.Mapper;

/**
 * Created by ZhaoZhi qiang
 * 2018/5/24.19:30
 */
@Mapper
public interface UserMapper {
    /**
     * 通过手机号获取用户id
     * @param mobile
     * @return
     */
    Long obtainUserIdByMobile(String mobile);


    /**
     * 通过邮箱获取用户id
     * @param email
     * @return
     */
    Long obtainUserIdByEmail(String email);
}
