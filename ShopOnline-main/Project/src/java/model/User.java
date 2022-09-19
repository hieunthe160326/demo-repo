/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author trung
 */
public class User {
    
    private String username, password, fullname, phone;
    private boolean gender;
    private String email;
    private int roleId;
    private int statusId;

    public User() {
    }

    public User(String username, String password, String fullname, String phone, boolean gender, String email, int roleId, int statusId) {
        this.username = username;
        this.password = password;
        this.fullname = fullname;
        this.phone = phone;
        this.gender = gender;
        this.email = email;
        this.roleId = roleId;
        this.statusId = statusId;
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

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getStatusID() {
        switch (statusId) {
            case 1:
                return "Active";
            case 2:
                return "Locked";
            case 3:
                return "Gmail Login";
            default:
                return "Unverified";
        }
    }

    public void setStatusId(int statusId) {
        this.statusId = statusId;
    }
    
    
}
