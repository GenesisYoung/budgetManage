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
 * @TableName expense_table
 */
@TableName(value ="expense_table")
@Data
public class ExpenseTable implements Serializable {
    /**
     * 
     */
    @TableId
    private Long expenseId;

    /**
     * 
     */
    private String expenseTag;

    /**
     * 
     */
    private Double expenseAmount;

    /**
     * 
     */
    private Long accountId;

    /**
     * 
     */
    private Date recordDate;

    /**
     * 
     */
    private Integer isActive;

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
        ExpenseTable other = (ExpenseTable) that;
        return (this.getExpenseId() == null ? other.getExpenseId() == null : this.getExpenseId().equals(other.getExpenseId()))
            && (this.getExpenseTag() == null ? other.getExpenseTag() == null : this.getExpenseTag().equals(other.getExpenseTag()))
            && (this.getExpenseAmount() == null ? other.getExpenseAmount() == null : this.getExpenseAmount().equals(other.getExpenseAmount()))
            && (this.getAccountId() == null ? other.getAccountId() == null : this.getAccountId().equals(other.getAccountId()))
            && (this.getRecordDate() == null ? other.getRecordDate() == null : this.getRecordDate().equals(other.getRecordDate()))
            && (this.getIsActive() == null ? other.getIsActive() == null : this.getIsActive().equals(other.getIsActive()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getExpenseId() == null) ? 0 : getExpenseId().hashCode());
        result = prime * result + ((getExpenseTag() == null) ? 0 : getExpenseTag().hashCode());
        result = prime * result + ((getExpenseAmount() == null) ? 0 : getExpenseAmount().hashCode());
        result = prime * result + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        result = prime * result + ((getRecordDate() == null) ? 0 : getRecordDate().hashCode());
        result = prime * result + ((getIsActive() == null) ? 0 : getIsActive().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", expenseId=").append(expenseId);
        sb.append(", expenseTag=").append(expenseTag);
        sb.append(", expenseAmount=").append(expenseAmount);
        sb.append(", accountId=").append(accountId);
        sb.append(", recordDate=").append(recordDate);
        sb.append(", isActive=").append(isActive);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}