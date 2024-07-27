package com.genesisstudio.budgetManage.service;

import com.genesisstudio.budgetManage.domain.BudgetTable;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author genesis-young
* @description 针对表【budget_table】的数据库操作Service
* @createDate 2024-07-27 13:16:22
*/
public interface BudgetTableService extends IService<BudgetTable> {

    List<BudgetTable> latest(Integer page, String id);
}
