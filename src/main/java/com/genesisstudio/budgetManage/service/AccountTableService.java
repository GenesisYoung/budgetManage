package com.genesisstudio.budgetManage.service;

import com.genesisstudio.budgetManage.domain.AccountTable;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author genesis-young
* @description 针对表【account_table】的数据库操作Service
* @createDate 2024-07-24 19:09:35
*/
public interface AccountTableService extends IService<AccountTable> {
    public AccountTable findByEmail(String email);
}
