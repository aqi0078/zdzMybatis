package com.zdz.db.demo.TestHash;

import com.alibaba.fastjson.JSONObject;
import com.google.common.hash.Hashing;

import java.math.BigDecimal;

/**
 * @Description:
 * @Date: 2020/12/3
 */
public class TestMain {

    public static void main(String[] args) {
        walletTransferHashTest();
    }
    public static void walletTransferHashTest() {
        WalletAccountTransfer walletAccountTransfer = new WalletAccountTransfer();
        walletAccountTransfer.setAmount(new BigDecimal("221.556"));
        walletAccountTransfer.setCurrency("CMC");
        walletAccountTransfer.setExchId(1);
        walletAccountTransfer.setFromType(AccountType.SPOT.getValue());
        walletAccountTransfer.setStatus(TransferStatus.PROCESSING.getValue());
        walletAccountTransfer.setToType( AccountType.WALLET.getValue());
        walletAccountTransfer.setUid(100855311515L);
        walletAccountTransfer.setTradeNo("1334414417605033984");
        String hash = genHash(walletAccountTransfer);
        System.out.println(hash);
    }
    private static String genHash(WalletAccountTransfer transfer) {
        return Hashing.sha256().hashBytes(JSONObject.toJSONString(transfer).getBytes()).toString();
    }
}
