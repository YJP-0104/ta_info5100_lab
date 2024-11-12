package model;

import java.util.Date;
import javax.swing.ImageIcon;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author yashpatel
 */
public class Patient {

    private int id;
    private String firstname;

    private String lname;
    private int age;
    private String gender;
    private String paitientType;

    private ImageIcon profilePicture;
    private Date Date;

    public String getName() {
        return firstname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.firstname = name;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPaitientType() {
        return paitientType;
    }

    public void setPaitientType(String paitientType) {
        this.paitientType = paitientType;
    }

    public ImageIcon getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(ImageIcon profilePicture) {
        this.profilePicture = profilePicture;
    }

    public void setDate(Date date) {
        this.Date = date;
    }

    public Date getDate() {
        return Date;
    }

}
