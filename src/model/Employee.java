/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.awt.Image;
import java.time.LocalDate;
import java.time.OffsetDateTime;

/**
 *
 * @author vrushaliphaltankar
 */
public class Employee {
    
    private String name;
    private String empId;
    private int age;
    private String gender;
    private LocalDate startDate;
    private int level;
    private String teamInfo;
    private String positionTitle;
    private ContactInfo contactInfo;
    private String photo;

    public String getName() {
        return name;
    }

    public String getEmpId() {
        return empId;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public int getLevel() {
        return level;
    }

    public String getTeamInfo() {
        return teamInfo;
    }

    public String getPositionTitle() {
        return positionTitle;
    }

    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setTeamInfo(String teamInfo) {
        this.teamInfo = teamInfo;
    }

    public void setPositionTitle(String positionTitle) {
        this.positionTitle = positionTitle;
    }

    public void setContactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
