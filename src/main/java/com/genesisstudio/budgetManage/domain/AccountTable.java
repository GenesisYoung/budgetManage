package com.genesisstudio.budgetManage.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName account_table
 */
@TableName(value ="account_table")
@Data
public class AccountTable implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Long accountId;

    /**
     * 
     */
    private String accountName;

    /**
     * 
     */
    private String accountPassword;

    /**
     * 
     */
    private Integer isActive;

    /**
     * 
     */
    private String accountEmail;

    /**
     * 
     */
    private String avatarPath;

    /**
     * 
     */
    private String currency;

    /**
     * 
     */
    private Long totalAsset;

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
        AccountTable other = (AccountTable) that;
        return (this.getAccountId() == null ? other.getAccountId() == null : this.getAccountId().equals(other.getAccountId()))
            && (this.getAccountName() == null ? other.getAccountName() == null : this.getAccountName().equals(other.getAccountName()))
            && (this.getAccountPassword() == null ? other.getAccountPassword() == null : this.getAccountPassword().equals(other.getAccountPassword()))
            && (this.getIsActive() == null ? other.getIsActive() == null : this.getIsActive().equals(other.getIsActive()))
            && (this.getAccountEmail() == null ? other.getAccountEmail() == null : this.getAccountEmail().equals(other.getAccountEmail()))
            && (this.getAvatarPath() == null ? other.getAvatarPath() == null : this.getAvatarPath().equals(other.getAvatarPath()))
            && (this.getCurrency() == null ? other.getCurrency() == null : this.getCurrency().equals(other.getCurrency()))
            && (this.getTotalAsset() == null ? other.getTotalAsset() == null : this.getTotalAsset().equals(other.getTotalAsset()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        result = prime * result + ((getAccountName() == null) ? 0 : getAccountName().hashCode());
        result = prime * result + ((getAccountPassword() == null) ? 0 : getAccountPassword().hashCode());
        result = prime * result + ((getIsActive() == null) ? 0 : getIsActive().hashCode());
        result = prime * result + ((getAccountEmail() == null) ? 0 : getAccountEmail().hashCode());
        result = prime * result + ((getAvatarPath() == null) ? 0 : getAvatarPath().hashCode());
        result = prime * result + ((getCurrency() == null) ? 0 : getCurrency().hashCode());
        result = prime * result + ((getTotalAsset() == null) ? 0 : getTotalAsset().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", accountId=").append(accountId);
        sb.append(", accountName=").append(accountName);
        sb.append(", accountPassword=").append(accountPassword);
        sb.append(", isActive=").append(isActive);
        sb.append(", accountEmail=").append(accountEmail);
        sb.append(", avatarPath=").append(avatarPath);
        sb.append(", currency=").append(currency);
        sb.append(", totalAsset=").append(totalAsset);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}