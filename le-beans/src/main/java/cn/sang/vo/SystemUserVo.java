package cn.sang.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

@ApiModel(value = "SystemUserVo",description = "后台用户VO")
public class SystemUserVo implements Serializable {
    /**
     * 用户id
     */
    @ApiModelProperty("[非必填] 主键id")
    private Integer id;
    /**
     * 用户密码
     */
    @ApiModelProperty("[非必填] 用户密码")
    private String password;
    /**
     * 用户状态
     */
    @ApiModelProperty("[非必填] 用户状态")
    private Boolean statusId;
    /**
     * 是否启用
     */
    @ApiModelProperty("[非必填] 是否启用(1:启用 0:未启用)")
    private Integer enabled;
    /**
     * 是否锁定
     */
    @ApiModelProperty("[非必填] 是否锁定(1:锁定 0:未锁定)")
    private Integer locked;
    /**
     * 电话号码
     */
    @ApiModelProperty("[非必填] 电话号码")
    private String mobile;
    /**
     * 排序
     */
    @ApiModelProperty("[非必填] 排序")
    private Integer sort;
    /**
     * 真实姓名
     */
    @ApiModelProperty("[非必填] 用户名称")
    private String realName;
    /**
     * 备注
     */
    @ApiModelProperty("[非必填] 备注")
    private String remark;
    /**
     * 创建时间
     */
    @ApiModelProperty("[非必填] 创建时间")
    private Date gmtCreate;
    /**
     * 修改时间
     */
    @ApiModelProperty("[非必填] 修改时间")
    private Date gmtModified;
    /**
     * 用户编号
     */
    @ApiModelProperty("[非必填] 用户编号")
    private Long userNo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getEnabled() {
        return enabled;
    }

    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }

    public Integer getLocked() {
        return locked;
    }

    public void setLocked(Integer locked) {
        this.locked = locked;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getGmtCreate(Date date) {
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

    public Long getUserNo() {
        return userNo;
    }

    public void setUserNo(Long userNo) {
        this.userNo = userNo;
    }

    public Boolean getStatusId() {
        return statusId;
    }

    public void setStatusId(Boolean statusId) {
        this.statusId = statusId;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
