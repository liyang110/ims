package com.ims.modules.demo.test.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ims.modules.demo.test.entity.JeecgOrderTicket;

import java.util.List;

/**
 * @Description: 订单机票
 *  jeecg-boot
 * @Date:  2019-02-15
 * @Version: V1.0
 */
public interface IJeecgOrderTicketService extends IService<JeecgOrderTicket> {
	
	public List<JeecgOrderTicket> selectTicketsByMainId(String mainId);
}
