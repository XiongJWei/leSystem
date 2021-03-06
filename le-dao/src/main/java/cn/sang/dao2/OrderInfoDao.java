package cn.sang.dao2;

import cn.sang.entity.OrderInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import cn.sang.entity.OrderInfo;
import cn.sang.vo.AddOrderInfoVo;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 订单信息表(OrderInfo)表数据库访问层
 *
 * @author makejava
 * @since 2020-05-14 15:46:41
 */
@Mapper
@Repository
public interface OrderInfoDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    OrderInfo queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<OrderInfo> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param orderInfo 实例对象
     * @return 对象列表
     */
    List<OrderInfo> queryAll(OrderInfo orderInfo);
    /**
     * 新增数据
     *
     * @param orderInfo 实例对象
     * @return 影响行数
     */
    int insert(OrderInfo orderInfo);

    /**
     * 修改数据
     *
     * @param orderInfo 实例对象
     * @return 影响行数
     */
    int update(OrderInfo orderInfo);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);


    int insert(AddOrderInfoVo addOrderInfoVo);

}