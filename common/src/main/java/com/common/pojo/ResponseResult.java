package com.common.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description:
 * @Auther: zhurongsheng
 * @Date: 2020/3/22 15:27
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseResult {

    private String msg;

    private Integer status;

    private Object data;

    public static ResponseResult success(Object object){
        return new ResponseResult("SUCCESS",200,object);
    }

    public static ResponseResult fail(String msg){
        return new ResponseResult(msg, 500,null);
    }
}
