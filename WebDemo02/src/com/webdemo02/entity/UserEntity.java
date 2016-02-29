package com.webdemo02.entity;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by Dong on 15/8/24.
 */
@Entity
@Table(name = "user", schema = "", catalog = "webdemo02")
public class UserEntity {
    private long uId;
    private String uName;
    private String uAccount;
    private String uPassword;
    private Date uBirthday;
    private byte uSex;
    private String uTelphnoe;
    private String uEmail;
    private Integer uQq;

    @Id
    @Column(name = "uId")
    public long getuId() {
        return uId;
    }

    public void setuId(long uId) {
        this.uId = uId;
    }

    @Basic
    @Column(name = "uName")
    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    @Basic
    @Column(name = "uAccount")
    public String getuAccount() {
        return uAccount;
    }

    public void setuAccount(String uAccount) {
        this.uAccount = uAccount;
    }

    @Basic
    @Column(name = "uPassword")
    public String getuPassword() {
        return uPassword;
    }

    public void setuPassword(String uPassword) {
        this.uPassword = uPassword;
    }

    @Basic
    @Column(name = "uBirthday")
    public Date getuBirthday() {
        return uBirthday;
    }

    public void setuBirthday(Date uBirthday) {
        this.uBirthday = uBirthday;
    }

    @Basic
    @Column(name = "uSex")
    public byte getuSex() {
        return uSex;
    }

    public void setuSex(byte uSex) {
        this.uSex = uSex;
    }

    @Basic
    @Column(name = "uTelphnoe")
    public String getuTelphnoe() {
        return uTelphnoe;
    }

    public void setuTelphnoe(String uTelphnoe) {
        this.uTelphnoe = uTelphnoe;
    }

    @Basic
    @Column(name = "uEmail")
    public String getuEmail() {
        return uEmail;
    }

    public void setuEmail(String uEmail) {
        this.uEmail = uEmail;
    }

    @Basic
    @Column(name = "uQQ")
    public Integer getuQq() {
        return uQq;
    }

    public void setuQq(Integer uQq) {
        this.uQq = uQq;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserEntity that = (UserEntity) o;

        if (uId != that.uId) return false;
        if (uSex != that.uSex) return false;
        if (uName != null ? !uName.equals(that.uName) : that.uName != null) return false;
        if (uAccount != null ? !uAccount.equals(that.uAccount) : that.uAccount != null) return false;
        if (uPassword != null ? !uPassword.equals(that.uPassword) : that.uPassword != null) return false;
        if (uBirthday != null ? !uBirthday.equals(that.uBirthday) : that.uBirthday != null) return false;
        if (uTelphnoe != null ? !uTelphnoe.equals(that.uTelphnoe) : that.uTelphnoe != null) return false;
        if (uEmail != null ? !uEmail.equals(that.uEmail) : that.uEmail != null) return false;
        if (uQq != null ? !uQq.equals(that.uQq) : that.uQq != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (uId ^ (uId >>> 32));
        result = 31 * result + (uName != null ? uName.hashCode() : 0);
        result = 31 * result + (uAccount != null ? uAccount.hashCode() : 0);
        result = 31 * result + (uPassword != null ? uPassword.hashCode() : 0);
        result = 31 * result + (uBirthday != null ? uBirthday.hashCode() : 0);
        result = 31 * result + (int) uSex;
        result = 31 * result + (uTelphnoe != null ? uTelphnoe.hashCode() : 0);
        result = 31 * result + (uEmail != null ? uEmail.hashCode() : 0);
        result = 31 * result + (uQq != null ? uQq.hashCode() : 0);
        return result;
    }
}
