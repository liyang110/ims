package com.ims.modules.system.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ims.modules.system.entity.SysDictItem;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 *  zhangweijian
 * @since 2018-12-28
 */
public interface SysDictItemMapper extends BaseMapper<SysDictItem> {
    @Select("SELECT * FROM SYS_DICT_ITEM WHERE DICT_ID = #{mainId}")
    public List<SysDictItem> selectItemsByMainId(String mainId);
}
