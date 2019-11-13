package com.ims.modules.quartz.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ims.modules.quartz.entity.QuartzJob;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Description: 定时任务在线管理
 *  jeecg-boot
 * @Date:  2019-01-02
 * @Version: V1.0
 */
public interface QuartzJobMapper extends BaseMapper<QuartzJob> {

	public List<QuartzJob> findByJobClassName(@Param("jobClassName") String jobClassName);

}
