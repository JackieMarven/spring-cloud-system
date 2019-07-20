package com.system.common.request;

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
public class RestRequest<T> implements Serializable{
     /** 分页大小*/
     private Integer pageSize;
    /** 页码*/
     private Integer pageNum;

     private T body;

    public RestRequest(T body) {
        this.body = body;
    }
}
