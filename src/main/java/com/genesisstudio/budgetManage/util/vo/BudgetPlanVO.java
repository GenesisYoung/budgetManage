package com.genesisstudio.budgetManage.util.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BudgetPlanVO {
    private Long id;
    private String name;
    private String description;
    private Double target;
    private Double current;
    private Date beginDate;
    private Long total;
}
