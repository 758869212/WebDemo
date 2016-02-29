package com.webdemo02.test;

import com.webdemo02.entity.UserEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.Test;

import javax.persistence.Transient;
import java.sql.Date;


/**
 * Created by Dong on 15/8/25.
 */
public class save {
    private static SessionFactory sf = null;

    static {
        try {
            org.hibernate.cfg.Configuration cfg = new org.hibernate.cfg.Configuration();
            cfg.configure();
            sf = cfg.buildSessionFactory();
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    @Test
    public void saveInfo(){
        Session sess = sf.openSession();
        Transaction tx = sess.beginTransaction();

        UserEntity user = new UserEntity();

        user.setuName("Dong");
        user.setuAccount("Dong108");
        user.setuPassword("dongdong");
        user.setuBirthday(new Date(System.currentTimeMillis()));
        byte sex = 1;
        user.setuSex(sex);
        user.setuTelphnoe("3736180");
        user.setuEmail("758869212@qq.com");
        user.setuQq(758869212);

        sess.save(user);
        tx.commit();
        sess.close();
    }
}
