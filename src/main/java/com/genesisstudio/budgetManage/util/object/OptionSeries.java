package com.genesisstudio.budgetManage.util.object;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Map;

@Data
@AllArgsConstructor
public class OptionSeries {
    private Map<String,String> data;
}
