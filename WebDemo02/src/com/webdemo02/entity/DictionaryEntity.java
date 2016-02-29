package com.webdemo02.entity;

import javax.persistence.*;

/**
 * Created by Dong on 15/8/24.
 */
@Entity
@Table(name = "dictionary", schema = "", catalog = "webdemo02")
public class DictionaryEntity {
    private long dId;
    private String dField;
    private byte dValue;
    private String dName;
    private String dNote;

    @Id
    @Column(name = "dId")
    public long getdId() {
        return dId;
    }

    public void setdId(long dId) {
        this.dId = dId;
    }

    @Basic
    @Column(name = "dField")
    public String getdField() {
        return dField;
    }

    public void setdField(String dField) {
        this.dField = dField;
    }

    @Basic
    @Column(name = "dValue")
    public byte getdValue() {
        return dValue;
    }

    public void setdValue(byte dValue) {
        this.dValue = dValue;
    }

    @Basic
    @Column(name = "dName")
    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }

    @Basic
    @Column(name = "dNote")
    public String getdNote() {
        return dNote;
    }

    public void setdNote(String dNote) {
        this.dNote = dNote;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DictionaryEntity that = (DictionaryEntity) o;

        if (dId != that.dId) return false;
        if (dValue != that.dValue) return false;
        if (dField != null ? !dField.equals(that.dField) : that.dField != null) return false;
        if (dName != null ? !dName.equals(that.dName) : that.dName != null) return false;
        if (dNote != null ? !dNote.equals(that.dNote) : that.dNote != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (dId ^ (dId >>> 32));
        result = 31 * result + (dField != null ? dField.hashCode() : 0);
        result = 31 * result + (int) dValue;
        result = 31 * result + (dName != null ? dName.hashCode() : 0);
        result = 31 * result + (dNote != null ? dNote.hashCode() : 0);
        return result;
    }
}
