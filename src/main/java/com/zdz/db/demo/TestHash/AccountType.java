package com.zdz.db.demo.TestHash;

import lombok.AllArgsConstructor;

/**
 * 账户类型.
 * @author fatty
 */
@AllArgsConstructor
public enum AccountType {
  OTC(CommonByte._1, "OTC"),
  CONTRACT(CommonByte._2,"合约"),
  WALLET(CommonByte._3, "钱包"),
  OPTION(CommonByte._4, "期权"),
  SPOT(CommonByte._5, "现货"),
  ;

  private byte value;
  private String text;

  public byte getValue() {
    return value;
  }

  public void setValue(byte value) {
    this.value = value;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }
}
