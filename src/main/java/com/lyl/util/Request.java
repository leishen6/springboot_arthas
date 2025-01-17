package com.lyl.util;

import com.alibaba.fastjson.JSONObject;

import java.util.UUID;

/**
 * @PACKAGE_NAME: com.lyl.util
 * @ClassName: Request
 * @Description:  请求报文
 * @Date: 2020-10-04 21:01
 **/
public class Request<T> {

    /**
     * 请求时间戳
     */
    private long timestamp;

    /**
     * 版本号
     */
    private String version;


    private String serialNo;


    /**
     * 业务参数,不同业务接口不同.(请求参数)
     */
    private T data;


    public Request() {
        this.timestamp = System.currentTimeMillis();
        this.serialNo = UUID.randomUUID().toString().replaceAll("-", "");
    }


    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }


    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }


    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }

}
