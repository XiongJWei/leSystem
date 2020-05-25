package cn.sang.dao;

import org.apache.ibatis.annotations.Mapper;
import cn.sang.entity.SysRole;
import cn.sang.entity.SysUser;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 用户接口
 */
@Mapper
@Repository
public interface SysUserDao {

    SysUser getSysUserByUsername(String username);

    List<SysRole> listGetSysRoleById(Long id);
}
