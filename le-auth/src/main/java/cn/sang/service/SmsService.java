package cn.sang.service;


import com.cloopen.rest.sdk.CCPRestSmsSDK;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class SmsService{
    public void SendTo(String to, String templateId, String[] datas) throws Exception {
        CCPRestSmsSDK sdk=new CCPRestSmsSDK();
        sdk.init("app.cloopen.com", "8883");
        sdk.setAccount("8aaf0708701ea9ab01704314546f1104", "4a3e48fac9884fc9bb7a3fd0dab68579");
        sdk.setAppId("8aaf0708701ea9ab0170431454ce110b");
        HashMap result = sdk.sendTemplateSMS(to, templateId, datas);
        if ("000000".equals(result.get("statusCode"))) {
            System.out.println("短信发送成功！");
        }else{
            throw new Exception(result.get("statusCode").toString()+":"+result.get("statusMsg").toString());
        }
    }
}
