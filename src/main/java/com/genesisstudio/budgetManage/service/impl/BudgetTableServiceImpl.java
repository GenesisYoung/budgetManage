package com.genesisstudio.budgetManage.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.genesisstudio.budgetManage.domain.BudgetTable;
import com.genesisstudio.budgetManage.service.BudgetTableService;
import com.genesisstudio.budgetManage.mapper.BudgetTableMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author genesis-young
* @description 针对表【budget_table】的数据库操作Service实现
* @createDate 2024-07-27 13:16:22
*/
@Service
public class BudgetTableServiceImpl extends ServiceImpl<BudgetTableMapper, BudgetTable>
    implements BudgetTableService{

    @Autowired
    private BudgetTableMapper budgetTableMapper;
    public List<BudgetTable> latest(Integer current, String id) {
        Page<BudgetTable> page = new Page<>(current,1);
        QueryWrapper<BudgetTable> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("account_id", id);
        queryWrapper.orderByDesc("budget_id");
        Page<BudgetTable> budgetTablePage = budgetTableMapper.selectPage(page, queryWrapper);
        return budgetTablePage.getRecords();
    }
}




