package com.ims.modules.system.model;

import com.ims.modules.system.entity.SysDepart;
import com.ims.modules.system.entity.SysUser;
import lombok.Data;

/**
 * 包含 SysUser 和 SysDepart 的 Model
 *
 *  sunjianlei
 */
@Data
public class SysUserSysDepartModel {

    private SysUser sysUser;
    private SysDepart sysDepart;

}
