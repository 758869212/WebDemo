package com.webdemo03.entity;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;

/**
 * Created by Dong on 15/8/29.
 */
@Entity
@Table(name = "AA01_BACKUP", schema = "DONG", catalog = "")
public class Aa01BackupEntity {
    private int aaa01;
    private String aaa02;
    private String aaa03;
    private String aaa04;
    private BigInteger aaa05;
    private BigInteger aaa06;
    private int uniqueall;
    private String operation;
    private Timestamp operationdate;

    @Basic
    @Column(name = "AAA01", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getAaa01() {
        return aaa01;
    }

    public void setAaa01(int aaa01) {
        this.aaa01 = aaa01;
    }

    @Basic
    @Column(name = "AAA02", nullable = false, insertable = true, updatable = true, length = 200)
    public String getAaa02() {
        return aaa02;
    }

    public void setAaa02(String aaa02) {
        this.aaa02 = aaa02;
    }

    @Basic
    @Column(name = "AAA03", nullable = false, insertable = true, updatable = true, length = 20)
    public String getAaa03() {
        return aaa03;
    }

    public void setAaa03(String aaa03) {
        this.aaa03 = aaa03;
    }

    @Basic
    @Column(name = "AAA04", nullable = true, insertable = true, updatable = true, length = 200)
    public String getAaa04() {
        return aaa04;
    }

    public void setAaa04(String aaa04) {
        this.aaa04 = aaa04;
    }

    @Basic
    @Column(name = "AAA05", nullable = false, insertable = true, updatable = true, precision = 0)
    public BigInteger getAaa05() {
        return aaa05;
    }

    public void setAaa05(BigInteger aaa05) {
        this.aaa05 = aaa05;
    }

    @Basic
    @Column(name = "AAA06", nullable = false, insertable = true, updatable = true, precision = 0)
    public BigInteger getAaa06() {
        return aaa06;
    }

    public void setAaa06(BigInteger aaa06) {
        this.aaa06 = aaa06;
    }

    @Id
    @Column(name = "UNIQUEALL", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getUniqueall() {
        return uniqueall;
    }

    public void setUniqueall(int uniqueall) {
        this.uniqueall = uniqueall;
    }

    @Basic
    @Column(name = "OPERATION", nullable = false, insertable = true, updatable = true, length = 50)
    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    @Basic
    @Column(name = "OPERATIONDATE", nullable = false, insertable = true, updatable = true)
    public Timestamp getOperationdate() {
        return operationdate;
    }

    public void setOperationdate(Timestamp operationdate) {
        this.operationdate = operationdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Aa01BackupEntity that = (Aa01BackupEntity) o;

        if (aaa01 != that.aaa01) return false;
        if (uniqueall != that.uniqueall) return false;
        if (aaa02 != null ? !aaa02.equals(that.aaa02) : that.aaa02 != null) return false;
        if (aaa03 != null ? !aaa03.equals(that.aaa03) : that.aaa03 != null) return false;
        if (aaa04 != null ? !aaa04.equals(that.aaa04) : that.aaa04 != null) return false;
        if (aaa05 != null ? !aaa05.equals(that.aaa05) : that.aaa05 != null) return false;
        if (aaa06 != null ? !aaa06.equals(that.aaa06) : that.aaa06 != null) return false;
        if (operation != null ? !operation.equals(that.operation) : that.operation != null) return false;
        if (operationdate != null ? !operationdate.equals(that.operationdate) : that.operationdate != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = aaa01;
        result = 31 * result + (aaa02 != null ? aaa02.hashCode() : 0);
        result = 31 * result + (aaa03 != null ? aaa03.hashCode() : 0);
        result = 31 * result + (aaa04 != null ? aaa04.hashCode() : 0);
        result = 31 * result + (aaa05 != null ? aaa05.hashCode() : 0);
        result = 31 * result + (aaa06 != null ? aaa06.hashCode() : 0);
        result = 31 * result + uniqueall;
        result = 31 * result + (operation != null ? operation.hashCode() : 0);
        result = 31 * result + (operationdate != null ? operationdate.hashCode() : 0);
        return result;
    }
}
