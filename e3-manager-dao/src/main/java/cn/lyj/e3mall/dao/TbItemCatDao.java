package cn.lyj.e3mall.dao;

import cn.lyj.e3mall.entity.TbItemCat;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (TbItemCat)表数据库访问层
 *
 * @author makejava
 * @since 2020-12-07 16:51:57
 */
public interface TbItemCatDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TbItemCat queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<TbItemCat> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tbItemCat 实例对象
     * @return 对象列表
     */
    List<TbItemCat> queryAll(TbItemCat tbItemCat);

    /**
     * 新增数据
     *
     * @param tbItemCat 实例对象
     * @return 影响行数
     */
    int insert(TbItemCat tbItemCat);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<TbItemCat> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<TbItemCat> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<TbItemCat> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<TbItemCat> entities);

    /**
     * 修改数据
     *
     * @param tbItemCat 实例对象
     * @return 影响行数
     */
    int update(TbItemCat tbItemCat);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}