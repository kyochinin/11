package com.softusing.xuzhining.form;

import com.softusing.xuzhining.domain.User;
import org.hibernate.validator.constraints.Length;
import org.springframework.beans.BeanUtils;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
//UserForm的表单类
public class UserForm {
    public static final String PHONE_REG = "^((13[0-9])|(15[^4])|(18[0,2,3,5-9])|(17[0-8])|(147))\\d{8}$";
    private Long id;
    @NotBlank//需要依赖
    private String username;
    // @NotBlank
    @Length(min = 6, message = "至少六位")
    private String password;
    @Pattern(regexp = "PHONE_REG", message = "请输入正确手机号")
    private String phone;
    @Email
    private String email;
    @NotBlank
    private String ConfirmPassword;

    public UserForm() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getConfirmPassword() {
        return ConfirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.ConfirmPassword = confirmPassword;
    }



    //判断 密码 与 确认密码是否一致
    public boolean confirmPassword() {
        if (this.password.equals(this.ConfirmPassword)) {
            return true;
        }
        return false;
    }

   /* 在convertToUser方法中，创建了一个UserFormConvert的实例对象。
    调用UserFormConvert对象的convert方法，将当前的UserForm对象作为参数传入进行转换。
    将转换后的User对象赋值给user变量。
    最后，返回转换后的User对象。*/


    //转换
    private class UserFormConvert implements FormConvert<UserForm, User> {
        @Override
        public User convert(UserForm userForm) {
            User user = new User();
            BeanUtils.copyProperties(userForm, user);
            return user;
        }
    }

    public User convertToUser() {
        User user = new UserFormConvert().convert(this);
        return user;
    }


}
