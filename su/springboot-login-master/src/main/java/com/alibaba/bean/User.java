package com.alibaba.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author xxx
 * @since 2023-04-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("user")
@ApiModel(value="User对象", description="")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("userid")
    private String userid;

    @TableField("username")
    private String username;

    @TableField("password")
    private String password;

    @TableField("avatarlocation")
    private String avatarlocation;

    @TableField("userrole")
    private String userrole;

    @TableField("email")
    private String email;

    @TableField("PHONE")
    private String phone;


    public static final String USERID = "userid";

    public static final String USERNAME = "username";

    public static final String PASSWORD = "password";

    public static final String AVATARLOCATION = "avatarlocation";

    public static final String USERROLE = "userrole";

    public static final String EMAIL = "email";

    public static final String PHONE = "PHONE";

}
