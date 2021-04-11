package com.example.demo.demo.impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class JsonTest {
    public static void main(String[] args) {
        String jsonStr = "{\n" + "    \"code\":\"000000\", \n"
                + "    \"data\":[{\"thirdPayNum\":\"50138500904373862411\",\"amount\":1,\"orderId\":\"203001001010\",\"period\":[\"1\",\"2\"],\"payType\":\"01\",\"status\":\"S\",\"createTime\":\"2020-09-10 10:46:13\",\"updateTime\":\"2020-09-10 10:46:13\",\"errorMsg\":\"成功\",\"errorCode\":\"121\"},\n"
                + "    {\"thirdPayNum\":\"50138500904373862411\",\"amount\":12,\"orderId\":\"203001001010\",\"period\":\"42\",\"payType\":\"01\",\"status\":\"S\",\"createTime\":\"2020-09-10 10:46:13\",\"updateTime\":\"2020-09-10 10:46:13\",\"errorMsg\":\"\",\"errorCode\":\"121\"}]\n"
                + "}";
        JSONObject jsonObject = JSONObject.parseObject(jsonStr);
        if (jsonObject != null && "000000".equals(jsonObject.getString("code"))
                && jsonObject.getJSONArray("data") != null) {
            String data = jsonObject.getJSONArray("data").toJSONString();
            List<KernelPayResult> array = JSONArray
                    .parseArray(data,
                            KernelPayResult.class);
            List<KernelPayResultVo> voList = new ArrayList<>();
            for (KernelPayResult payresult : array) {
                voList.add(payresult.converVO(111," vo.getThirdOrderNo()"));
            }
            voList.forEach(vo-> System.out.println(vo));
            System.out.println("成功！！！！");

        } else {
            System.out.println("throw new BusinessException(PlatformErrCode.ERR_20037);");
        }

    }
}
