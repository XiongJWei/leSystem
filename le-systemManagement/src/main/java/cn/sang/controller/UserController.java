package cn.sang.controller;

import cn.sang.aop.MyLog;
import cn.sang.entity.User;
import cn.sang.service.SysUserService;
import cn.sang.util.Dto;
import cn.sang.util.DtoUtil;
import cn.sang.util.MD5;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Date;

/**
 * 用户基本信息(User)表控制层
 *
 * @author makejava
 * @since 2020-05-12 17:18:14
 */
@RestController
@RequestMapping("user")
@Api(tags = "学员管理")
public class UserController {
    /**
     * 服务对象
     */
    @Resource
    private SysUserService userService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @ApiOperation(value = "根据id查询用户", httpMethod = "GET")
    //登录映射
    @MyLog(value = "根据id查询用户")
    @GetMapping("selectOne")
    public User selectOne(Long id) {
        User user = null;
        try {
            user = userService.queryById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }

    @MyLog("根据id修改用户密码")
    @PostMapping("/api/updateByMobilePsw")
    @ApiOperation(value = "根据id修改用户密码", notes = "String")
    public Dto updateByMobilePsw(Long id, String mobilePsw) {
        try {
            if (id > 0 && mobilePsw != null) {
                User u = new User();
                u.setId(id);
                u.setMobilePsw(MD5.getMd5(mobilePsw, 32));
                u.setGmtModified(new Date());
                User user = userService.update(u);
                if (user != null) {
                    return DtoUtil.returnSuccess("200", user);
                }
                return DtoUtil.returnSuccess("密码修改失败");
            }
            return DtoUtil.returnSuccess("用户id或新密码不能为空");
        } catch (Exception e) {
            e.printStackTrace();
            return DtoUtil.returnFail("异常", e.getMessage());
        }
    }

    @MyLog("修改用户信息")
    @PostMapping("/api/updateUser")
    @ApiOperation(value = "修改用户信息", notes = "User对象")
    public Dto updateUser(@RequestBody User user) {
        try {
            if (user != null) {
                User u = userService.update(user);
                if (u != null) {
                    return DtoUtil.returnSuccess("200", user);
                }
                return DtoUtil.returnSuccess("修改用户信息失败");
            }
            return DtoUtil.returnSuccess("参数不能为空");
        } catch (Exception e) {
            e.printStackTrace();
            return DtoUtil.returnFail("异常", e.getMessage());
        }
    }

}