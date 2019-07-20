package com.system.librarymemberapi.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

/**
 * 会员实体类
 * @author lmm
 * @date 2019/7/20 0:25
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MemberDto implements Serializable {

    private Long id;

    private String userName;

    private Byte age;

    private String avatar;

    private Byte gender;

    private String phone;

    private Integer userAccount;

    private String password;

    private Date birth;

    private String weixinOpenid;

    private String qqOpenid;

    private Boolean status;

    private Date regeistTime;

    private Date updateTime;
}
