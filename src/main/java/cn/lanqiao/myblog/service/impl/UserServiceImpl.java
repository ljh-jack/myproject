package cn.lanqiao.myblog.service.impl;

import cn.lanqiao.myblog.entity.User;
import cn.lanqiao.myblog.mapper.UserMapper;
import cn.lanqiao.myblog.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ljh
 * @since 2022-05-06
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
