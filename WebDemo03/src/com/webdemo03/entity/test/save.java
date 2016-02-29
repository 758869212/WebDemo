package com.webdemo03.entity.test;

import com.webdemo03.entity.Aa01Entity;
import com.webdemo03.utils.HibernateUtils;
import org.junit.Test;


/**
 * Created by Dong on 15/8/25.
 */
public class save {
    /*private static SessionFactory sf = null;

    static {
        try {
            org.hibernate.cfg.Configuration cfg = new org.hibernate.cfg.Configuration();
            cfg.configure();
            sf = cfg.buildSessionFactory();
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }*/

    @Test
    public void saveInfo(){
        /*Session sess = sf.openSession();
        Transaction tx = sess.beginTransaction();*/

        Aa01Entity aa01 = new Aa01Entity();

        aa01.setAaa02("参数名");
        aa01.setAaa03("1");
        aa01.setAaa04("参数备注");
        aa01.setAaa05(1);
        aa01.setAaa06(1);

        boolean b = HibernateUtils.saveEntity(aa01);
        if (b){
            System.out.println("插入成功，新记录的ID是：" + aa01.getAaa01());
        }
        else{
            System.out.println("插入失败!");
        }

        /*sess.save(aa01);
        tx.commit();
        sess.close();*/
    }
}
