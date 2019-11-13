package com.ims.modules.quartz.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ims.modules.quartz.entity.QuartzJob;
import org.quartz.SchedulerException;

import java.util.List;

/**
 * @Description: 定时任务在线管理
 *  jeecg-boot
 * @Date: 2019-04-28
 * @Version: V1.1
 */
public interface IQuartzJobService extends IService<QuartzJob> {

	List<QuartzJob> findByJobClassName(String jobClassName);

	boolean saveAndScheduleJob(QuartzJob quartzJob);

	boolean editAndScheduleJob(QuartzJob quartzJob) throws SchedulerException;

	boolean deleteAndStopJob(QuartzJob quartzJob);

	boolean resumeJob(QuartzJob quartzJob);
}
