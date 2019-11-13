package com.ims.modules.demo.test.service;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.ims.common.system.base.service.JeecgService;
import com.ims.modules.demo.test.entity.JeecgDemo;

/**
 * @Description: jeecg 测试demo
 *  jeecg-boot
 * @Date:  2018-12-29
 * @Version: V1.0
 */
public interface IJeecgDemoService extends JeecgService<JeecgDemo> {
	
	public void testTran();
	
	public JeecgDemo getByIdCacheable(String id);
	
	/**
	 * 查询列表数据 在service中获取数据权限sql信息
	 * @param pageSize
	 * @param pageNo
	 * @return
	 */
	IPage<JeecgDemo> queryListWithPermission(int pageSize, int pageNo);
}
