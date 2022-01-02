package com.xxxx.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import com.xxxx.server.pojo.Menu;
import io.swagger.models.auth.In;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Mr.Lan
 * @since 2022-01-01
 */
public interface MenuMapper extends BaseMapper<Menu> {

    /**
     * 根据用户id查询菜单列表
     * @return
     */
    List<Menu> getMenusByAdminId(Integer id);
}
