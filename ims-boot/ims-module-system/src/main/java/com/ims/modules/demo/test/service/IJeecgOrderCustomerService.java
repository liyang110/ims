package com.ims.modules.demo.test.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ims.modules.demo.test.entity.JeecgOrderCustomer;

import java.util.List;

/**
 * @Description: 订单客户
 *  jeecg-boot
 * @Date:  2019-02-15
 * @Version: V1.0
 */
public interface IJeecgOrderCustomerService extends IService<JeecgOrderCustomer> {
	
	public List<JeecgOrderCustomer> selectCustomersByMainId(String mainId);
}
