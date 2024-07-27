package com.genesisstudio.budgetManage.util.vo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ResponseObjectVO {
    private String message;
    private Object data;
}
