package com.oldchong.lifemanager.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private long id;

    private String name;

    private String usrGrp;

    private String phone;

    public User() {
    }

    public User(long id, String name, String usrGrp, String phone) {
        this.id = id;
        this.name = name;
        this.usrGrp = usrGrp;
        this.phone = phone;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsrGrp() {
        return usrGrp;
    }

    public void setUsrGrp(String usrGrp) {
        this.usrGrp = usrGrp;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
