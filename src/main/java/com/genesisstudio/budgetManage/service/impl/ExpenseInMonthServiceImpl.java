package com.genesisstudio.budgetManage.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.genesisstudio.budgetManage.domain.ExpenseInMonth;
import com.genesisstudio.budgetManage.domain.IncomeInMonth;
import com.genesisstudio.budgetManage.service.ExpenseInMonthService;
import com.genesisstudio.budgetManage.mapper.ExpenseInMonthMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author genesis-young
* @description 针对表【expense_in_month】的数据库操作Service实现
* @createDate 2024-07-27 13:16:38
*/
@Service
public class ExpenseInMonthServiceImpl extends ServiceImpl<ExpenseInMonthMapper, ExpenseInMonth>
    implements ExpenseInMonthService{

    @Autowired
    private ExpenseInMonthMapper expenseInMonthMapper;

    public List<ExpenseInMonth> latest(int current, int pageSize, String id) {
        QueryWrapper<ExpenseInMonth> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("id", id);
        queryWrapper.orderByDesc("id");
        List<ExpenseInMonth> expenseInMonths = expenseInMonthMapper.selectList(queryWrapper);
        int start=0;
        if(expenseInMonths.size()>pageSize){
            start=expenseInMonths.size()-pageSize-(current-1);
            return expenseInMonths.subList(start,start+pageSize);
        }
        return expenseInMonths.subList(start,expenseInMonths.isEmpty() ?0:expenseInMonths.size()-1);
    }

    @Autowired
    public void setExpenseInMonthMapper(ExpenseInMonthMapper expenseInMonthMapper) {
        this.expenseInMonthMapper = expenseInMonthMapper;
    }
}




