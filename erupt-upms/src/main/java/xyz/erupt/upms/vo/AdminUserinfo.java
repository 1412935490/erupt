package xyz.erupt.upms.vo;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author YuePeng
 * date 2021/11/29 21:03
 */
@Getter
@Setter
public class AdminUserinfo {

    private Long id; //用户id

    private String account; //用户名

    private String username; //账号

    private String org;  //所属组织

    private String post; //所诉岗位

    private boolean superAdmin; //是否为超级管理员

    private List<String> roles; //角色列表

}
