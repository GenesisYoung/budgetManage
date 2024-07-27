package com.genesisstudio.budgetManage.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName budget_table
 */
@TableName(value ="budget_table")
@Data
public class BudgetTable implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Long budgetId;

    /**
     * 
     */
    private String budgetName;

    /**
     * 
     */
    private Double budgetTarget;

    /**
     * 
     */
    private Double budgetCurrent;

    /**
     * 
     */
    private Date beginDate;

    /**
     * 
     */
    private String description;

    /**
     * 
     */
    private Long accountId;

    /**
     * 
     */
    private Integer isFinished;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        BudgetTable other = (BudgetTable) that;
        return (this.getBudgetId() == null ? other.getBudgetId() == null : this.getBudgetId().equals(other.getBudgetId()))
            && (this.getBudgetName() == null ? other.getBudgetName() == null : this.getBudgetName().equals(other.getBudgetName()))
            && (this.getBudgetTarget() == null ? other.getBudgetTarget() == null : this.getBudgetTarget().equals(other.getBudgetTarget()))
            && (this.getBudgetCurrent() == null ? other.getBudgetCurrent() == null : this.getBudgetCurrent().equals(other.getBudgetCurrent()))
            && (this.getBeginDate() == null ? other.getBeginDate() == null : this.getBeginDate().equals(other.getBeginDate()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getAccountId() == null ? other.getAccountId() == null : this.getAccountId().equals(other.getAccountId()))
            && (this.getIsFinished() == null ? other.getIsFinished() == null : this.getIsFinished().equals(other.getIsFinished()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getBudgetId() == null) ? 0 : getBudgetId().hashCode());
        result = prime * result + ((getBudgetName() == null) ? 0 : getBudgetName().hashCode());
        result = prime * result + ((getBudgetTarget() == null) ? 0 : getBudgetTarget().hashCode());
        result = prime * result + ((getBudgetCurrent() == null) ? 0 : getBudgetCurrent().hashCode());
        result = prime * result + ((getBeginDate() == null) ? 0 : getBeginDate().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        result = prime * result + ((getIsFinished() == null) ? 0 : getIsFinished().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", budgetId=").append(budgetId);
        sb.append(", budgetName=").append(budgetName);
        sb.append(", budgetTarget=").append(budgetTarget);
        sb.append(", budgetCurrent=").append(budgetCurrent);
        sb.append(", beginDate=").append(beginDate);
        sb.append(", description=").append(description);
        sb.append(", accountId=").append(accountId);
        sb.append(", isFinished=").append(isFinished);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}