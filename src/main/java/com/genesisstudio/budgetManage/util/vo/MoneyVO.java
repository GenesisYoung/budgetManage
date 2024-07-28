package com.genesisstudio.budgetManage.util.vo;

import com.genesisstudio.budgetManage.util.object.OptionSeries;
import com.genesisstudio.budgetManage.util.object.PeriodicBudget;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MoneyVO {
    private OptionSeries dailyOption;
    private PeriodicBudget periodicBudget;
}
