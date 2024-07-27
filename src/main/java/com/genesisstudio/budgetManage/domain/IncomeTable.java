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
 * @TableName income_table
 */
@TableName(value ="income_table")
@Data
public class IncomeTable implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Long incomeId;

    /**
     * 
     */
    private String incomeTag;

    /**
     * 
     */
    private Double incomeAmount;

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
        IncomeTable other = (IncomeTable) that;
        return (this.getIncomeId() == null ? other.getIncomeId() == null : this.getIncomeId().equals(other.getIncomeId()))
            && (this.getIncomeTag() == null ? other.getIncomeTag() == null : this.getIncomeTag().equals(other.getIncomeTag()))
            && (this.getIncomeAmount() == null ? other.getIncomeAmount() == null : this.getIncomeAmount().equals(other.getIncomeAmount()))
            && (this.getAccountId() == null ? other.getAccountId() == null : this.getAccountId().equals(other.getAccountId()))
            && (this.getRecordDate() == null ? other.getRecordDate() == null : this.getRecordDate().equals(other.getRecordDate()))
            && (this.getIsActive() == null ? other.getIsActive() == null : this.getIsActive().equals(other.getIsActive()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIncomeId() == null) ? 0 : getIncomeId().hashCode());
        result = prime * result + ((getIncomeTag() == null) ? 0 : getIncomeTag().hashCode());
        result = prime * result + ((getIncomeAmount() == null) ? 0 : getIncomeAmount().hashCode());
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
        sb.append(", incomeId=").append(incomeId);
        sb.append(", incomeTag=").append(incomeTag);
        sb.append(", incomeAmount=").append(incomeAmount);
        sb.append(", accountId=").append(accountId);
        sb.append(", recordDate=").append(recordDate);
        sb.append(", isActive=").append(isActive);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}