package com.ims.modules.message.service.impl;

import com.ims.common.system.base.service.impl.JeecgServiceImpl;
import com.ims.modules.message.entity.SysMessage;
import com.ims.modules.message.mapper.SysMessageMapper;
import com.ims.modules.message.service.ISysMessageService;
import org.springframework.stereotype.Service;

/**
 * @Description: 消息
 *  jeecg-boot
 * @Date:  2019-04-09
 * @Version: V1.0
 */
@Service
public class SysMessageServiceImpl extends JeecgServiceImpl<SysMessageMapper, SysMessage> implements ISysMessageService {

}
