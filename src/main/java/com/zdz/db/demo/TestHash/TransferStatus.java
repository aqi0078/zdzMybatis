package com.zdz.db.demo.TestHash;

import lombok.AllArgsConstructor;

/**
 * 划转状态.
 *
 * @author fatty
 */
@AllArgsConstructor
public enum TransferStatus {
  INIT(CommonByte._0, "初始化"),
  PROCESSING(CommonByte._1, "处理中"),
  DONE(CommonByte._2, "已完成"),
  FAIL(CommonByte._3, "失败"),
  PENDING(CommonByte._4, "待人工处理");

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
