package com.version_hit.VO;


import com.version_hit.PO.HitPO;

public class HitVO {
    private String download_url;
    private String update_version_code;
    private String md5;
    private String title;
    private String update_tips;

    public HitVO(){}
    public HitVO(HitPO hitPO){
        this.download_url = hitPO.getDownload_url();
        this.update_version_code = hitPO.getUpdate_version_code();
        this.md5=hitPO.getMd5();
        this.title=hitPO.getTitle();
        this.update_tips=hitPO.getUpdate_tips();
    }

    public String getDownload_url() {
        return download_url;
    }

    public void setDownload_url(String download_url) {
        this.download_url = download_url;
    }

    public String getUpdate_version_code() {
        return update_version_code;
    }

    public void setUpdate_version_code(String update_version_code) {
        this.update_version_code = update_version_code;
    }

    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUpdate_tips() {
        return update_tips;
    }

    public void setUpdate_tips(String update_tips) {
        this.update_tips = update_tips;
    }
}
