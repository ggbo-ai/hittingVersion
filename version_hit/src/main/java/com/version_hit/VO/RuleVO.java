package com.version_hit.VO;

import lombok.Data;

@Data
public class RuleVO {
    private Integer aid;
    private String platform;
    private String download_url;
    private String update_version_code;
    private String md5;
//    private String device_id_list;
    private Integer max_update_version_code;
    private Integer min_update_version_code;
    private Integer max_os_api;
    private Integer min_os_api;
    private String cpu_arch;
    private String channel;
    private String title;
    private String update_tips;

    public Integer getAid() {
        return aid;
    }

    public String getPlatform() {
        return platform;
    }

    public String getDownload_url() {
        return download_url;
    }

    public String getUpdate_version_code() {
        return update_version_code;
    }

    public String getMd5() {
        return md5;
    }

//    public String getDevice_id_list() {
//        return device_id_list;
//    }



    public String getCpu_arch() {
        return cpu_arch;
    }

    public String getChannel() {
        return channel;
    }

    public String getTitle() {
        return title;
    }

    public String getUpdate_tips() {
        return update_tips;
    }

    public RuleVO(String platform) {
        this.platform = platform;
    }

    public RuleVO( String platform, String download_url, String update_version_code, String md5,  Integer max_update_version_code, Integer min_update_version_code, Integer max_os_api, Integer min_os_api, String cpu_arch, String channel, String title, String update_tips) {

        this.platform = platform;
        this.download_url = download_url;
        this.update_version_code = update_version_code;
        this.md5 = md5;
//        this.device_id_list = device_id_list;
        this.max_update_version_code = max_update_version_code;
        this.min_update_version_code = min_update_version_code;
        this.max_os_api = max_os_api;
        this.min_os_api = min_os_api;
        this.cpu_arch = cpu_arch;
        this.channel = channel;
        this.title = title;
        this.update_tips = update_tips;
    }

    public RuleVO() {

    }
}
