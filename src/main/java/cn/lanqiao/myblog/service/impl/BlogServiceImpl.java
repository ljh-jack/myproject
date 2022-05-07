package cn.lanqiao.myblog.service.impl;

import cn.lanqiao.myblog.entity.Blog;
import cn.lanqiao.myblog.mapper.BlogMapper;
import cn.lanqiao.myblog.service.BlogService;
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
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}
