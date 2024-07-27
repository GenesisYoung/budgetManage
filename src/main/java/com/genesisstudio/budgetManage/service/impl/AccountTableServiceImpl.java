package com.genesisstudio.budgetManage.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.genesisstudio.budgetManage.domain.AccountTable;
import com.genesisstudio.budgetManage.service.AccountTableService;
import com.genesisstudio.budgetManage.mapper.AccountTableMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author genesis-young
* @description 针对表【account_table】的数据库操作Service实现
* @createDate 2024-07-24 19:09:35
*/
@Service
public class AccountTableServiceImpl extends ServiceImpl<AccountTableMapper, AccountTable>
    implements AccountTableService{
    @Autowired
    private AccountTableMapper accountTableMapper;
    @Override
    public AccountTable findByEmail(String email) {
        QueryWrapper<AccountTable> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("account_email", email);
        List<AccountTable> accountTables = accountTableMapper.selectList(queryWrapper);
        if(!accountTables.isEmpty()){
            return accountTables.getFirst();
        }
        return null;
    }

    public AccountTable login(AccountTable accountTable) {
        QueryWrapper<AccountTable> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("account_email", accountTable.getAccountEmail());
        queryWrapper.eq("account_password", accountTable.getAccountPassword());
        List<AccountTable> accountTables = accountTableMapper.selectList(queryWrapper);
        if(!accountTables.isEmpty()){
            return accountTables.getFirst();
        }
        return null;
    }
}




