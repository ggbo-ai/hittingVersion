package com.version_hit.VO;

import lombok.Data;

@Data
public class ReturnVO {
    int msg;

    public ReturnVO(int msg) {
        this.msg = msg;
    }
    public ReturnVO() {

    }
}
