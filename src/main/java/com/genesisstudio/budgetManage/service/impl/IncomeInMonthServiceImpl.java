package com.genesisstudio.budgetManage.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.genesisstudio.budgetManage.domain.IncomeInMonth;
import com.genesisstudio.budgetManage.service.IncomeInMonthService;
import com.genesisstudio.budgetManage.mapper.IncomeInMonthMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author genesis-young
* @description 针对表【income_in_month】的数据库操作Service实现
* @createDate 2024-07-27 13:16:50
*/
@Service
public class IncomeInMonthServiceImpl extends ServiceImpl<IncomeInMonthMapper, IncomeInMonth>
    implements IncomeInMonthService{

    @Autowired
    private IncomeInMonthMapper incomeInMonthMapper;
    public List<IncomeInMonth> latest(int current, int pageSize, String id) {
        QueryWrapper<IncomeInMonth> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("id", id);
        queryWrapper.orderByDesc("id");
        List<IncomeInMonth> incomeInMonths = incomeInMonthMapper.selectList(queryWrapper);
        int start=0;
        if(incomeInMonths.size()>pageSize){
            start=incomeInMonths.size()-pageSize-(current-1);
            return incomeInMonths.subList(start,start+pageSize);
        }
        return incomeInMonths.subList(start, incomeInMonths.isEmpty() ?0:incomeInMonths.size()-1);
    }
}




