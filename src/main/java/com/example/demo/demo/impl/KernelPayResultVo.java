package com.example.demo.demo.impl;

import lombok.Data;
import lombok.ToString;

import java.util.List;
@Data
public class KernelPayResultVo {
    private String  serialNumber;         //   交易流水号 String  桔子流水号
    private Integer channelId;            //    渠道ID Integer
    private Integer amount;               //    支付金额 Integer 分
    private String  orderNo;              //    渠道订单号    String
    //private String  period;               //    期数 "1","2"
    private String  payType;              //    支付类型 String  "0"主动还款,"1"代扣
    private Integer status;               //    状态   Integer 1划扣成功或支付成功  2划扣或支付处理中   3请求支付失败
    private String  createTime;           //    申请时间 String  yyyy-MM-dd hh:mm:ss
    private String  updateTime;           //     处理时间 String  yyyy-MM-dd hh:mm:ss
    private List<String> periodList;           //    [ "1","2" ]
}
