package com.api.framework.shortmessage;

import com.api.framework.web.domain.AjaxResult;
import com.api.framework.web.domain.ResponseStatusEnum;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * 希奥短信服务
 */
@Component
public class XhsmService {

    //企业uid
    @Value("${sm.xh.uid}")
    private String uid;

    //企业密码
    @Value("${sm.xh.pwd}")
    private String pwd;

    //短信发送平台url
    @Value("${sm.xh.url}")
    private String url;

    @Autowired
    private RestTemplate template;

    /**
     * 发送短信
     * @param phone
     * @param msg
     * demo:xhsmService.sendMsg("15881101782","测试:12345");
     * @return
     */
    public AjaxResult sendMsg(String phone, String msg){
        try {
            //msg=URLEncoder.encode( msg, "UTF-8" )
            url += "?uid=" + uid + "&password=" + DigestUtils.md5Hex(pwd) + "&mobile=" + phone + "&msg=" + msg;
            String result=template.getForObject(url, String.class);
            return new AjaxResult(ResponseStatusEnum.SUCCESS.getCode(),ResponseStatusEnum.SUCCESS.getName());
        }catch (Exception ex){
            return new AjaxResult(ResponseStatusEnum.Fail.getCode(),ex.getMessage());
        }
    }
}
