package com.system.common.response;

import lombok.*;

import java.io.Serializable;

/**
 * @author lmm
 * @date 2019/7/20 7:51
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RestResponse<T> implements Serializable{

    private String code;

    private String msg;

    private T body = null;


    public static <T> RestResponse<T> success(T body){
        return new RestResponse<T>("200","success",body);
    }

    public static <T> RestResponse<T> fail(){
        return new RestResponse<T>("201", "", null);
    }

    public static <T> RestResponse<T> fail(String msg, T body){
        return new RestResponse<T>("201", msg, body);
    }
}
