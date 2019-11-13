package com.ims.modules.demo.test.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ims.modules.demo.test.entity.JeecgOrderCustomer;
import com.ims.modules.demo.test.entity.JeecgOrderMain;
import com.ims.modules.demo.test.entity.JeecgOrderTicket;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

/**
 * @Description: 订单
 *  jeecg-boot
 * @Date:  2019-02-15
 * @Version: V1.0
 */
public interface IJeecgOrderMainService extends IService<JeecgOrderMain> {

	/**
	 * 添加一对多
	 * 
	 */
	public void saveMain(JeecgOrderMain jeecgOrderMain, List<JeecgOrderCustomer> jeecgOrderCustomerList, List<JeecgOrderTicket> jeecgOrderTicketList) ;
	
	/**
	 * 修改一对多
	 * 
	 */
	public void updateMain(JeecgOrderMain jeecgOrderMain,List<JeecgOrderCustomer> jeecgOrderCustomerList,List<JeecgOrderTicket> jeecgOrderTicketList);
	
	/**
	 * 删除一对多
	 */
	public void delMain (String id);
	
	/**
	 * 批量删除一对多
	 */
	public void delBatchMain (Collection<? extends Serializable> idList);
}
