package com.chenddd.springcloud.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Author: chenddd
 * Date: 2022/5/25 20:47
 * FileName: CommonResult
 * Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T>{

    private Integer code;

    private String msg;

    private T data;

    public CommonResult(Integer code,String message){
        this(code,message,null);
    }

}
