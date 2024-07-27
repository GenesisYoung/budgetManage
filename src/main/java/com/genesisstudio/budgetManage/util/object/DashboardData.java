package com.genesisstudio.budgetManage.util.object;

import com.genesisstudio.budgetManage.domain.BudgetTable;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DashboardData {
    private String[] xAxisDate;
    private Income Income;
    private Expense Expense;
    private Long total;
}
