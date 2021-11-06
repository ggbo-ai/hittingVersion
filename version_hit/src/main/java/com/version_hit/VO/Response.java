package com.version_hit.VO;

public class Response {
    String message;

    ReturnVO returnVO;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ReturnVO getReturnVO() {
        return returnVO;
    }

    public void setReturnVO(ReturnVO returnVO) {
        this.returnVO = returnVO;
    }

    public Response(String message, ReturnVO returnVO) {
        this.message = message;
        this.returnVO = returnVO;
    }

    public Response() {
    }
}
