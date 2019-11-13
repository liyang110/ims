package com.ims.modules.message.service;

import com.ims.common.system.base.service.JeecgService;
import com.ims.modules.message.entity.SysMessageTemplate;

import java.util.List;


/**
 * @Description: 消息模板
 *  jeecg-boot
 * @Date:  2019-04-09
 * @Version: V1.0
 */
public interface ISysMessageTemplateService extends JeecgService<SysMessageTemplate> {
    List<SysMessageTemplate> selectByCode(String code);
}
