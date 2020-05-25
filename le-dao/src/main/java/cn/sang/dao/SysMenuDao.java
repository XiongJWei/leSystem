package cn.sang.dao;

import org.apache.ibatis.annotations.Mapper;
import cn.sang.entity.Menu;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 *资源接口
 */
@Mapper
@Repository
public interface SysMenuDao {

    List<Menu> listSysmenuBySysRole();
}
