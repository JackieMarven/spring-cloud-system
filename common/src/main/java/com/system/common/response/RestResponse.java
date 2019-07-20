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

    private String code = "200";

    private String msg = "请求成功";

    private T body = null;

}
