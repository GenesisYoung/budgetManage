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
 * @TableName period_budget
 */
@TableName(value ="period_budget")
@Data
public class PeriodBudget implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Long periodId;

    /**
     * 
     */
    private Date periodStart;

    /**
     * 
     */
    private Date periodEnd;

    /**
     * 
     */
    private Double periodTotal;

    /**
     * 
     */
    private Double residualAmount;

    /**
     * 
     */
    private String tags;

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
        PeriodBudget other = (PeriodBudget) that;
        return (this.getPeriodId() == null ? other.getPeriodId() == null : this.getPeriodId().equals(other.getPeriodId()))
            && (this.getPeriodStart() == null ? other.getPeriodStart() == null : this.getPeriodStart().equals(other.getPeriodStart()))
            && (this.getPeriodEnd() == null ? other.getPeriodEnd() == null : this.getPeriodEnd().equals(other.getPeriodEnd()))
            && (this.getPeriodTotal() == null ? other.getPeriodTotal() == null : this.getPeriodTotal().equals(other.getPeriodTotal()))
            && (this.getResidualAmount() == null ? other.getResidualAmount() == null : this.getResidualAmount().equals(other.getResidualAmount()))
            && (this.getTags() == null ? other.getTags() == null : this.getTags().equals(other.getTags()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPeriodId() == null) ? 0 : getPeriodId().hashCode());
        result = prime * result + ((getPeriodStart() == null) ? 0 : getPeriodStart().hashCode());
        result = prime * result + ((getPeriodEnd() == null) ? 0 : getPeriodEnd().hashCode());
        result = prime * result + ((getPeriodTotal() == null) ? 0 : getPeriodTotal().hashCode());
        result = prime * result + ((getResidualAmount() == null) ? 0 : getResidualAmount().hashCode());
        result = prime * result + ((getTags() == null) ? 0 : getTags().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", periodId=").append(periodId);
        sb.append(", periodStart=").append(periodStart);
        sb.append(", periodEnd=").append(periodEnd);
        sb.append(", periodTotal=").append(periodTotal);
        sb.append(", residualAmount=").append(residualAmount);
        sb.append(", tags=").append(tags);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}