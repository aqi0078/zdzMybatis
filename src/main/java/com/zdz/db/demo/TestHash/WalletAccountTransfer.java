package com.zdz.db.demo.TestHash;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
* @author Mac
*/
@Data
public class WalletAccountTransfer implements Serializable {
    /**
     * 主键
     */
    private Long id;

    /**
     * 流水号
     */
    private String tradeNo;

    /**
     * 来源账户：1 OTC，2 合约 3 钱包 4 期权
     */
    private Byte fromType;

    /**
     * 来源账户：1 OTC，2 合约 3 钱包 4 期权
     */
    private Byte toType;

    /**
     * 用户id
     */
    private Long uid;

    /**
     * 币种
     */
    private String currency;

    /**
     * 发生额
     */
    private BigDecimal amount;

    /**
     * 划转状态：0：初始化，1：待执行，2：已完成，3：划转失败
     */
    private Byte status;

    /**
     * 交易所 id
     */
    private Integer exchId;

    /**
     * 修改时间
     */
    private Date mtime;

    /**
     * 添加时间
     */
    private Date ctime;

    /**
     * hash
     */
    private String hash;

}
