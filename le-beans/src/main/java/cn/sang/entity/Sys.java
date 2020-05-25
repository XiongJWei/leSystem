package cn.sangpojo.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 系统配置表(Sys)实体类
 *
 * @author makejava
 * @since 2020-05-25 10:11:51
 */
public class Sys implements Serializable {
    private static final long serialVersionUID = -31873366625177069L;
    /**
    * 主键
    */
    private Long id;
    /**
    * 创建时间
    */
    private Date gmtCreate;
    /**
    * 修改时间
    */
    private Date gmtModified;
    /**
    * 状态(1有效, 0无效)
    */
    private Boolean statusId;
    /**
    * 排序
    */
    private Integer sort;
    /**
    * 视频存储平台（1保利威视，2七牛）
    */
    private Boolean videoType;
    /**
    * useid
    */
    private String polyvUseid;
    /**
    * writetoken
    */
    private String polyvWritetoken;
    /**
    * readtoken
    */
    private String polyvReadtoken;
    /**
    * secretkey
    */
    private String polyvSecretkey;
    /**
    * 文件存储类型（1阿里云，2七牛）
    */
    private Boolean fileType;
    /**
    * access_key_id
    */
    private String aliyunAccessKeyId;
    /**
    * access_key_secret
    */
    private String aliyunAccessKeySecret;
    /**
    * oss_url
    */
    private String aliyunOssUrl;
    /**
    * oss_bucket
    */
    private String aliyunOssBucket;
    /**
    * oas_vault
    */
    private String aliyunOasVault;
    /**
    * 支付通道（1龙果支付，2其他）
    */
    private Boolean payType;
    /**
    * 支付请求
    */
    private String payUrl;
    /**
    * roncoo_key
    */
    private String payKey;
    /**
    * roncoo_secret
    */
    private String paySecret;
    /**
    * 回调地址
    */
    private String notifyUrl;
    /**
    * sms_code
    */
    private String smsCode;
    /**
    * 短信签名
    */
    private String signName;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public Boolean getStatusId() {
        return statusId;
    }

    public void setStatusId(Boolean statusId) {
        this.statusId = statusId;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Boolean getVideoType() {
        return videoType;
    }

    public void setVideoType(Boolean videoType) {
        this.videoType = videoType;
    }

    public String getPolyvUseid() {
        return polyvUseid;
    }

    public void setPolyvUseid(String polyvUseid) {
        this.polyvUseid = polyvUseid;
    }

    public String getPolyvWritetoken() {
        return polyvWritetoken;
    }

    public void setPolyvWritetoken(String polyvWritetoken) {
        this.polyvWritetoken = polyvWritetoken;
    }

    public String getPolyvReadtoken() {
        return polyvReadtoken;
    }

    public void setPolyvReadtoken(String polyvReadtoken) {
        this.polyvReadtoken = polyvReadtoken;
    }

    public String getPolyvSecretkey() {
        return polyvSecretkey;
    }

    public void setPolyvSecretkey(String polyvSecretkey) {
        this.polyvSecretkey = polyvSecretkey;
    }

    public Boolean getFileType() {
        return fileType;
    }

    public void setFileType(Boolean fileType) {
        this.fileType = fileType;
    }

    public String getAliyunAccessKeyId() {
        return aliyunAccessKeyId;
    }

    public void setAliyunAccessKeyId(String aliyunAccessKeyId) {
        this.aliyunAccessKeyId = aliyunAccessKeyId;
    }

    public String getAliyunAccessKeySecret() {
        return aliyunAccessKeySecret;
    }

    public void setAliyunAccessKeySecret(String aliyunAccessKeySecret) {
        this.aliyunAccessKeySecret = aliyunAccessKeySecret;
    }

    public String getAliyunOssUrl() {
        return aliyunOssUrl;
    }

    public void setAliyunOssUrl(String aliyunOssUrl) {
        this.aliyunOssUrl = aliyunOssUrl;
    }

    public String getAliyunOssBucket() {
        return aliyunOssBucket;
    }

    public void setAliyunOssBucket(String aliyunOssBucket) {
        this.aliyunOssBucket = aliyunOssBucket;
    }

    public String getAliyunOasVault() {
        return aliyunOasVault;
    }

    public void setAliyunOasVault(String aliyunOasVault) {
        this.aliyunOasVault = aliyunOasVault;
    }

    public Boolean getPayType() {
        return payType;
    }

    public void setPayType(Boolean payType) {
        this.payType = payType;
    }

    public String getPayUrl() {
        return payUrl;
    }

    public void setPayUrl(String payUrl) {
        this.payUrl = payUrl;
    }

    public String getPayKey() {
        return payKey;
    }

    public void setPayKey(String payKey) {
        this.payKey = payKey;
    }

    public String getPaySecret() {
        return paySecret;
    }

    public void setPaySecret(String paySecret) {
        this.paySecret = paySecret;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public String getSmsCode() {
        return smsCode;
    }

    public void setSmsCode(String smsCode) {
        this.smsCode = smsCode;
    }

    public String getSignName() {
        return signName;
    }

    public void setSignName(String signName) {
        this.signName = signName;
    }

}