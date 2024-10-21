package com.sky.common.pojo.result;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * @program: sky-user-order
 * @description: 返回结果类
 * @author: whl
 * @create: 2024-10-18 14:28
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result<T> {

    /**
     * 响应码
     */
    private Integer code;
    /**
     * 响应数据
     */
    private String msg;
    /**
     * 响应体
     */
    private T data;

    public static <T> Result<T> success(){
        Result<T> result = new Result<>();
        result.code = 200;
        return result;
    }

    public static <T> Result<T> success(T data){
        Result<T> result = new Result<>();
        result.code = 200;
        result.data = data;
        return result;
    }

    public static <T> Result<T> error(String msg){
        Result<T> result = new Result<>();
        result.code = 500;
        result.msg = msg;
        return result;
    }
}
