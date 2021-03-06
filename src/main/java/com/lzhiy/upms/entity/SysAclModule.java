package com.lzhiy.upms.entity;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;
/***********************************************************************
 * @website ：
 * @creator : zhiyingli
 * @create-time : 2019/5/23
 * @email : lizhiying61f@gmail.com
 * @description :
 ***********************************************************************/
@Setter
@Getter
public class SysAclModule {
    private Integer id;
    private String name;
    private Integer parentId;
    private String level;
    private Integer status;
    private Integer seq;
    private String remark;
    private String operator;
    private LocalDate operateTime;
    private String operateIp;
}
