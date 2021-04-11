package com.example.demo.demo.impl;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class KernelPayResult {
    private String  orderId;              // 桔子订单号982005221532275907",
    private List<String> period;               //"8",
    private String  status;               // "S",成功，F失败，I支付划扣中。其他异常
    private String  errorCode;            // "000000",
    private String  errorMsg;             // "操作成功",
    private String  payType;              // "1",
    private String  thirdPayNum;         //桔子流水号 "50138500904373862411",
    private Integer amount;               // 1 分
    private String  createTime;           // "2020-09-10 10:46:13",
    private String  updateTime;           // "2020-09-10 10:46:53"

    public KernelPayResultVo converVO(Integer channelId, String thirdOrderNo) {
        KernelPayResultVo vo = new KernelPayResultVo();
        vo.setOrderNo(this.orderId);
        vo.setPeriodList(this.period);
        vo.setChannelId(channelId);
        vo.setSerialNumber(thirdOrderNo);
        vo.setAmount(this.amount);
        vo.setPayType(this.payType);
        vo.setCreateTime(this.createTime);
        vo.setUpdateTime(this.updateTime);
        //确认过会返回单个值


        //S 操作成功 ；F 支付公司返回 失败；I 正在划扣中，请稍后重试
        // Q 渠道不能为空 ；C 支付序列号不能为空； ；F 支付公司返回 ；N 该笔划扣操作不存在 ； D 订单号或期数为空 A：操作过于频繁 W：未支付
        if ("S".equals(this.status)) {
            vo.setStatus(1);
        } else if ("I".equals(this.status)) {
            vo.setStatus(2);
        } else if ("F".equals(this.status)) {
            vo.setStatus(3);
        } else if ("W".equals(this.status)) {
            System.out.println("throw new BusinessException(PlatformErrCode.ERR_20048);");
        } else if ("N".equals(this.status)) {
            System.out.println("throw new BusinessException(PlatformErrCode.ERR_20036);");
        } else if ("C".equals(this.status)) {
            System.out.println(" throw new BusinessException(PlatformErrCode.ERR_20035);");
        } else if ("Q".equals(this.status)) {
            System.out.println(" throw new BusinessException(PlatformErrCode.ERR_20004);");
        } else if ("A".equals(this.status)) {
            System.out.println("throw new BusinessException(PlatformErrCode.ERR_20040);");
        } else {
            System.out.println("throw new BusinessException(PlatformErrCode.ERR_20037);");
        }
        return vo;
    }
}
