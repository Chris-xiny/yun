package com.chrisxin.yun.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result {
    private Object data;
    private boolean success;
    private String message;
    private Long timestamp;

    public static Result success(){
        return build(null,true,null);
    }

    public static Result success(String message){
        return build(null,true,message);
    }

    public static Result success(Object data){
        return build(data,true,null);
    }

    public static Result fail(String message){
        return build(null,false,message);
    }

    private static Result build(Object data,boolean success,String message){
        Result result=new Result();
        result.setSuccess(success);
        result.setData(data);
        result.setMessage(message);
        result.setTimestamp(System.currentTimeMillis());
        return result;
    }
}
