package com.genesisstudio.budgetManage.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName user_settings
 */
@TableName(value ="user_settings")
@Data
public class UserSettings implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 
     */
    private String currency;

    /**
     * 
     */
    private Integer periodStart;

    /**
     * 
     */
    private Integer autoAllocation;

    /**
     * 
     */
    private Integer allocationRule;

    /**
     * 
     */
    private Integer levelAlpha;

    /**
     * 
     */
    private Integer levelBeta;

    /**
     * 
     */
    private Integer levelSigma;

    /**
     * 
     */
    private Integer accountId;

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
        UserSettings other = (UserSettings) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCurrency() == null ? other.getCurrency() == null : this.getCurrency().equals(other.getCurrency()))
            && (this.getPeriodStart() == null ? other.getPeriodStart() == null : this.getPeriodStart().equals(other.getPeriodStart()))
            && (this.getAutoAllocation() == null ? other.getAutoAllocation() == null : this.getAutoAllocation().equals(other.getAutoAllocation()))
            && (this.getAllocationRule() == null ? other.getAllocationRule() == null : this.getAllocationRule().equals(other.getAllocationRule()))
            && (this.getLevelAlpha() == null ? other.getLevelAlpha() == null : this.getLevelAlpha().equals(other.getLevelAlpha()))
            && (this.getLevelBeta() == null ? other.getLevelBeta() == null : this.getLevelBeta().equals(other.getLevelBeta()))
            && (this.getLevelSigma() == null ? other.getLevelSigma() == null : this.getLevelSigma().equals(other.getLevelSigma()))
            && (this.getAccountId() == null ? other.getAccountId() == null : this.getAccountId().equals(other.getAccountId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCurrency() == null) ? 0 : getCurrency().hashCode());
        result = prime * result + ((getPeriodStart() == null) ? 0 : getPeriodStart().hashCode());
        result = prime * result + ((getAutoAllocation() == null) ? 0 : getAutoAllocation().hashCode());
        result = prime * result + ((getAllocationRule() == null) ? 0 : getAllocationRule().hashCode());
        result = prime * result + ((getLevelAlpha() == null) ? 0 : getLevelAlpha().hashCode());
        result = prime * result + ((getLevelBeta() == null) ? 0 : getLevelBeta().hashCode());
        result = prime * result + ((getLevelSigma() == null) ? 0 : getLevelSigma().hashCode());
        result = prime * result + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", currency=").append(currency);
        sb.append(", periodstart=").append(periodStart);
        sb.append(", autoAllocation=").append(autoAllocation);
        sb.append(", allocationRule=").append(allocationRule);
        sb.append(", levelAlpha=").append(levelAlpha);
        sb.append(", levelBeta=").append(levelBeta);
        sb.append(", levelSigma=").append(levelSigma);
        sb.append(", acountId=").append(accountId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}