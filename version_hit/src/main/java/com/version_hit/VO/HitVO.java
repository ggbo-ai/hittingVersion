package com.version_hit.VO;


import com.version_hit.PO.HitPO;

public class HitVO {
    private Integer aid;
    private String version;
    private String platform;
    private String device_id;
    private String os_api;
    private String channel;
    private String version_code;
    private String update_version_code;
    private String cpu_arch;

    public HitVO(){}

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getDevice_id() {
        return device_id;
    }

    public void setDevice_id(String device_id) {
        this.device_id = device_id;
    }

    public String getOs_api() {
        return os_api;
    }

    public void setOs_api(String os_api) {
        this.os_api = os_api;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getVersion_code() {
        return version_code;
    }

    public void setVersion_code(String version_code) {
        this.version_code = version_code;
    }

    public String getUpdate_version_code() {
        return update_version_code;
    }

    public void setUpdate_version_code(String update_version_code) {
        this.update_version_code = update_version_code;
    }

    public String getCpu_arch() {
        return cpu_arch;
    }

    public void setCpu_arch(String cpu_arch) {
        this.cpu_arch = cpu_arch;
    }
}
