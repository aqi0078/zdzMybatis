package com.zdz.db.demo.TestHash;

import lombok.AllArgsConstructor;

/**
 * 交易状态.
 *
 * @author fatty
 */
@AllArgsConstructor
public enum TransactionStatus {
  _0(CommonByte._0, "未审核"),
  _1(CommonByte._1, "审核通过"),
  _2(CommonByte._2, "审核拒绝"),
  _3(CommonByte._3, "支付中已经打币"),
  _4(CommonByte._4, "支付失败"),
  _5(CommonByte._5, "已完成"),
  _6(CommonByte._6, "已撤销"),
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
