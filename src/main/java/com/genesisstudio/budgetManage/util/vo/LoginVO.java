package com.genesisstudio.budgetManage.util.vo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class LoginVO {
    private Boolean loginStatus;
    private String username;
    private Long userId;
}
