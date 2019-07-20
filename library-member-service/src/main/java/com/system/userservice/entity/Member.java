package com.system.userservice.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

/**
 * 会员实体类
 * @author lmm
 * @date 2019/7/20 0:25
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "bs_member")
public class Member {

    @GeneratedValue
    @Id
    private Long id;

    @Column
    private String userName;
    @Column
    private Byte age;
    @Column
    private String avatar;
    @Column
    private Byte gender;
    @Column
    private String phone;
    @Column
    private Integer userAccount;
    @Column
    private String password;
    @Column
    private Date birth;
    @Column
    private String weixinOpenid;
    @Column
    private String qqOpenid;
    @Column
    private Boolean status;
    @Column
    private Date regeistTime;
    @Column
    private Date updateTime;
}
