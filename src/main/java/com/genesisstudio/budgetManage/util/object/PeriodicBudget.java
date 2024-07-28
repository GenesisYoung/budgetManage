package com.genesisstudio.budgetManage.util.object;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PeriodicBudget {
    private String period;
    private Double periodBudget;
    private String currencyType;
    private Double residual;
    private String[] tags;
}
