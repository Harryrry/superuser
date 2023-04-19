package com.alibaba.service.impl;

import com.alibaba.bean.User;
import com.alibaba.mapper.UserMapper;
import com.alibaba.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xxx
 * @since 2023-04-18
 */
@Service
public class UserImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
