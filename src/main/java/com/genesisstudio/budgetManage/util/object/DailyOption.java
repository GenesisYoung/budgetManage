package com.genesisstudio.budgetManage.util.object;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DailyOption {
    private Legend legend;
    private OptionSeries series;
}
