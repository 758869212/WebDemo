package com.webdemo03.entity;

import javax.persistence.*;


/**
 * Created by Dong on 15/8/29.
 */
@Entity
@Table(name = "AA01", schema = "DONG", catalog = "")
public class Aa01Entity {
    private int aaa01;
    private String aaa02;
    private String aaa03;
    private String aaa04;
    private Integer aaa05;
    private Integer aaa06;
    private int uniqueall;

    @Id
    @Column(name = "AAA01", nullable = false, insertable = true, updatable = true, precision = 0)
    //@GenericGenerator(name = "AAA01", strategy = "sequence", parameters = {@Parameter(name = "sequence",value="sq_aa01_aaa01")})
    //@GeneratedValue(generator = "sq_aa01_aaa01")
    @SequenceGenerator(name="SQ_AA01_AAA01",sequenceName="SQ_AA01_AAA01", allocationSize = 1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE,generator="SQ_AA01_AAA01")
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
    public Integer getAaa05() {
        return aaa05;
    }

    public void setAaa05(Integer aaa05) {
        this.aaa05 = aaa05;
    }

    @Basic
    @Column(name = "AAA06", nullable = false, insertable = true, updatable = true, precision = 0)
    public Integer getAaa06() {
        return aaa06;
    }

    public void setAaa06(Integer aaa06) {
        this.aaa06 = aaa06;
    }


    @Column(name = "UNIQUEALL", nullable = false, insertable = true, updatable = true, precision = 0)
    @SequenceGenerator(name="SQ_ALL_UNIQUEALL",sequenceName="SQ_ALL_UNIQUEALL")
    @GeneratedValue(strategy=GenerationType.SEQUENCE,generator="SQ_ALL_UNIQUEALL")
    public int getUniqueall() {
        return uniqueall;
    }

    public void setUniqueall(int uniqueall) {
        this.uniqueall = uniqueall;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Aa01Entity that = (Aa01Entity) o;

        if (aaa01 != that.aaa01) return false;
        if (uniqueall != that.uniqueall) return false;
        if (aaa02 != null ? !aaa02.equals(that.aaa02) : that.aaa02 != null) return false;
        if (aaa03 != null ? !aaa03.equals(that.aaa03) : that.aaa03 != null) return false;
        if (aaa04 != null ? !aaa04.equals(that.aaa04) : that.aaa04 != null) return false;
        if (aaa05 != null ? !aaa05.equals(that.aaa05) : that.aaa05 != null) return false;
        if (aaa06 != null ? !aaa06.equals(that.aaa06) : that.aaa06 != null) return false;

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
        return result;
    }
}
