package com.example.retrofit;


import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Data {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("codeCls")
    @Expose
    private String codeCls;
    @SerializedName("codeType")
    @Expose
    private String codeType;
    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("codeNm")
    @Expose
    private String codeNm;
    @SerializedName("codeDesc")
    @Expose
    private String codeDesc;
    @SerializedName("dispOrd")
    @Expose
    private String dispOrd;
    @SerializedName("createUserId")
    @Expose
    private Object createUserId;
    @SerializedName("udpateUserId")
    @Expose
    private Object udpateUserId;
    @SerializedName("devices")
    @Expose
    private List<Device> devices = null;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodeCls() {
        return codeCls;
    }

    public void setCodeCls(String codeCls) {
        this.codeCls = codeCls;
    }

    public String getCodeType() {
        return codeType;
    }

    public void setCodeType(String codeType) {
        this.codeType = codeType;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCodeNm() {
        return codeNm;
    }

    public void setCodeNm(String codeNm) {
        this.codeNm = codeNm;
    }

    public String getCodeDesc() {
        return codeDesc;
    }

    public void setCodeDesc(String codeDesc) {
        this.codeDesc = codeDesc;
    }

    public String getDispOrd() {
        return dispOrd;
    }

    public void setDispOrd(String dispOrd) {
        this.dispOrd = dispOrd;
    }

    public Object getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Object createUserId) {
        this.createUserId = createUserId;
    }

    public Object getUdpateUserId() {
        return udpateUserId;
    }

    public void setUdpateUserId(Object udpateUserId) {
        this.udpateUserId = udpateUserId;
    }

    public List<Device> getDevices() {
        return devices;
    }

    public void setDevices(List<Device> devices) {
        this.devices = devices;
    }

    @Override
    public String toString() {
        return "Data{" +
                "id=" + id +
                ", codeCls='" + codeCls + '\'' +
                ", codeType='" + codeType + '\'' +
                ", code='" + code + '\'' +
                ", codeNm='" + codeNm + '\'' +
                ", codeDesc='" + codeDesc + '\'' +
                ", dispOrd='" + dispOrd + '\'' +
                ", createUserId=" + createUserId +
                ", udpateUserId=" + udpateUserId +
                ", devices=" + devices +
                '}';
    }
}




