package cn.abel.bean;

import java.util.Date;


public class User {
    private Long id;
    private String name;
    private String address;
    private String mobile;
    private String email;
    private Date createTime;
    private Integer role;

   

    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", address=" + address + ", mobile=" + mobile + ", email=" + email
                + ", createTime=" + createTime + ", role=" + role + "]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

   

  
}