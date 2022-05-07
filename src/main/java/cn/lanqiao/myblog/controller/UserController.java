package cn.lanqiao.myblog.controller;


import cn.lanqiao.myblog.common.lang.Constants;
import cn.lanqiao.myblog.common.lang.Result;
import cn.lanqiao.myblog.entity.User;
import cn.lanqiao.myblog.service.UserService;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author ljh
 * @since 2022-05-06
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    protected UserService userService;
    @RequiresAuthentication
    @GetMapping("index")
    public Object index() {
        User user = userService.getById(1L);
        return Result.succ(200,"成功",user);

    }
    /**
     * 测试实体校验
     * @param user
     * @return
     */
    @PostMapping("/save")
    public Object testUser(@Validated @RequestBody User user) {
        return user.toString();
    }
}
