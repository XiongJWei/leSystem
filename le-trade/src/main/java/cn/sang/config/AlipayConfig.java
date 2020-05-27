package cn.sang.config;


import org.springframework.context.annotation.Configuration;

@Configuration
public class AlipayConfig {
    // 商户appid
    private  String APPID = "2016101800715957";
    // 私钥 pkcs8格式的
    private  String RSA_PRIVATE_KEY = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCG6z7w+2ZONYnB1uWQ2XY/hKDdHv9JO5LmtuvjmhCewswuI7WdiwAwQMtbUjqlZBGGkqA2G0Y9anAmAG9N8o73LJzlqbAXbNc/bW4rknCCRTV/hBUFQw/R4UWIYsBQEy8kd+K0sr6hFo6a+sN6Tqwr5cjKnr8EPyG8yMF2oVwzkz9T4Y01YpLvi8RwxS8nLVgVLsa404vFqxMYvKpMgG5Si8iku6URwUoCgVqRZHWnxx0dHNyIvRMVYNg/6MbjblMQNVogryy9PWlNze/Xk9KyZg8YXs6sPIWjDH+LQRzIVHm81ZltOtJthDDF3fMpgAfDQrJYUXwMuZMKmr1OC5SbAgMBAAECggEAC/5pr/6JT7aOsn6qFcBfNLJTopSY2SfEnWHxgmA1zgc/I3LlOEYdFC0OZuXedMl6jV4HhAfUrK0Dnz02p9VCRFLg98Gn980jLW5K9vCjs9D3OojBXaBijaPbDI7KzdOGw1UtACdLrwJUVw6nxf2sbJKW0Pxfur7p/uBR4nvhuGvjkFm6k974uQvs9H0mZb9EpcSRfNWPwMBO5gzkMGzS6nJa+Ywrqjxaq2iEIAyjmYFBsIidKiEh1iKUUmPNUmJipEfRDPrkja9Xa3HbwLkf4hmChtI3WyEVLTLXeG5L5mIiE0XtCXyq8vCfLSPxG8j2eEka8vZeSEQAGwcabQo6wQKBgQC55TurmDkQEryeks/ZHmr+wcinZcLOowmwsVeF20uFQTcuMr0gjUTYUMfNqpHVOcdxGgi9H8dr1Ng/4GuWnXCqS5tRJ47nJXUi7PRq+cBuaPBIZQdxv14LEvxKomIvCVDbVGtwzxN5jsMtO00+J5c7NGwSzcd4pEqMSVhy/5SISwKBgQC5zJ/z0rO5LDnWI9HhdqBSP+xwSjso89/iQZ120U4S1/nCQpNWGRf0j5MUIIcQTAnm0HH+a+89THedKfanbt5qhLEAaeGLbwJ9+RfGUB8eivVw6cufewru/nEy65r7QAX4sE1R3DYXl1MoBdB/lla6ZkFu8IMalLa4wiwrA6YS8QKBgQCvcKuG/6vjAnvnAFGO7Ik4E3UmnwBiejZb/pLGbrdwdKL6Q8KAZTLzIBHhhTgKz3Ptxw82Rja0CvVoG4oOZFn/LknQJpBUj+Jj6tOl3j2BNiKHgGmtLVk5BFr8qRIWqCkaRir8FUKg9142YwA8R6sPoiLZAEJgFlWQ3mvOZG0uzwKBgC/KQ0Y65wF1L7c15XFBywD88jr7zPW+rNKMoA0EzzknllVyPGWD9NZx65ncuADoHg/hg8C2UIYK2iVxusDcUpdBZCnAEkSEHDb80DGxQB/iDDmr2TU/N9O7XLCFS4rer+qEpo6svrkYskn0HOoEaHBvhtsbQA2hPNKPFz9FI/1xAoGAVyN4gv+SlItWPsI/doORtWMl8TZBY9xdknOrfGYAM9qJcGLB5hn3llooxhzK4CLih9T8s6akjIZZ2sBoV6uXkBm1pWTODaKHDgnBGwCCcZ3KfpbILMHpfmuqIWIDiz2fTgAQ0Q6U5zpjz2bfAN48SCnOyzI2sGQV91S8p+z4DvU=";
    // 服务器异步通知页面路径 需http://或者https://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    private  String notify_url = "http://liushen.wezoz.com/pay/zfb/notify";
    // 页面跳转同步通知页面路径 需http://或者https://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问 商户可以自定义同步跳转地址
    private  String return_url = "http://liushen.wezoz.com/pay/returnUrl";
    // 请求网关地址
    private  String URL = "https://openapi.alipaydev.com/gateway.do";
    // 编码
    private  String CHARSET = "utf-8";
    // 返回格式
    private  String FORMAT = "json";
    // 支付宝公钥
    private  String ALIPAY_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAqL7P5FmYOTj1CR1hVEckZWvH80rJZknPoLAcLEbeqEaTnHgNH2PtJ3tNqYnbjwAYF1U2Ph+e97oPgjFeMAfXj3n2dOcx7B1jvocNszzKmVJwDYz4G0HCDgGbGMWPDhyczlyGDWi8MkJYMsKNOA3++Rvn+U6GU1gxwNZpFBYtFBoN2kaOKJRWlDrDyIfDri4LiHws46GEi26ocknhkecp7fHKlFXo95ORr+v3uEoufgr3gl2WtN+c2EE8z/PMRZgXzCxyevPTO6t2vvMH8x9gL/m4OSlopkp8waVERxfr3fRGvSRQ9X847VvxUTvKHXamCSBRdsbDD7IgMRo14q4hHwIDAQAB";
    // 日志记录目录
    private  String log_path = "/logs";
    // RSA2
    private  String SIGNTYPE = "RSA2";
    //支付成功跳转页
    private String paymentSuccessUrl="http://localhost:8082/pay/zfb/success";
    //支付失败跳转页
    private String paymentFailureUrl="http://localhost:8082/pay/zfb/failure";

    public String getAPPID() {
        return APPID;
    }

    public void setAPPID(String APPID) {
        this.APPID = APPID;
    }

    public String getRSA_PRIVATE_KEY() {
        return RSA_PRIVATE_KEY;
    }

    public void setRSA_PRIVATE_KEY(String RSA_PRIVATE_KEY) {
        this.RSA_PRIVATE_KEY = RSA_PRIVATE_KEY;
    }

    public String getNotify_url() {
        return notify_url;
    }

    public void setNotify_url(String notify_url) {
        this.notify_url = notify_url;
    }

    public String getReturn_url() {
        return return_url;
    }

    public void setReturn_url(String return_url) {
        this.return_url = return_url;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public String getCHARSET() {
        return CHARSET;
    }

    public void setCHARSET(String CHARSET) {
        this.CHARSET = CHARSET;
    }

    public String getFORMAT() {
        return FORMAT;
    }

    public void setFORMAT(String FORMAT) {
        this.FORMAT = FORMAT;
    }

    public String getALIPAY_PUBLIC_KEY() {
        return ALIPAY_PUBLIC_KEY;
    }

    public void setALIPAY_PUBLIC_KEY(String ALIPAY_PUBLIC_KEY) {
        this.ALIPAY_PUBLIC_KEY = ALIPAY_PUBLIC_KEY;
    }

    public String getLog_path() {
        return log_path;
    }

    public void setLog_path(String log_path) {
        this.log_path = log_path;
    }

    public String getSIGNTYPE() {
        return SIGNTYPE;
    }

    public void setSIGNTYPE(String SIGNTYPE) {
        this.SIGNTYPE = SIGNTYPE;
    }

    public String getPaymentSuccessUrl() {
        return paymentSuccessUrl;
    }

    public void setPaymentSuccessUrl(String paymentSuccessUrl) {
        this.paymentSuccessUrl = paymentSuccessUrl;
    }

    public String getPaymentFailureUrl() {
        return paymentFailureUrl;
    }

    public void setPaymentFailureUrl(String paymentFailureUrl) {
        this.paymentFailureUrl = paymentFailureUrl;
    }
}
