package org.rhine.datamasking.apache.dubbo.demo;


import org.rhine.datamasking.annotation.Sensitive;
import org.rhine.datamasking.annotation.SensitiveEnum;

import java.io.Serializable;

public class Response implements Serializable {

    String name;

    @Sensitive
    String address;

    @Sensitive
    int age;

    @Sensitive(type = SensitiveEnum.PHONE, maskingValue = "x")
    String phoneNum;

    @Sensitive(type = SensitiveEnum.ID_CARD)
    String idCard;

    @Sensitive(type = SensitiveEnum.REGULAR, regex = "\\w")
    String comment;

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "Response{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", phoneNum='" + phoneNum + '\'' +
                ", idCard='" + idCard + '\'' +
                ", comment='" + comment + '\'' +
                '}';
    }
}
