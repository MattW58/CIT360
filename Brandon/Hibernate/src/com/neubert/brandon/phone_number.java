package com.neubert.brandon;

import javax.persistence.*;

@Entity
@Table(name="phone_number")
public class phone_number {
    @Id
    @GeneratedValue
    private Integer id;
    private String phone;

    public String getPhone(){
        return phone;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }
}