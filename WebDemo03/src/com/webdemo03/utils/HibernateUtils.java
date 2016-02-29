package com.webdemo03.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import sun.jvm.hotspot.debugger.win32.coff.WindowsNTSubsystem;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Created by Dong on 15/8/29.
 */
public class HibernateUtils {
    private HibernateUtils(){

    }

    static SessionFactory sessionFactory;

    /*
     * 取得Hibernate的Session
     */
    public static Session getSession(){
        if (sessionFactory == null) {
            sessionFactory = new Configuration().configure().buildSessionFactory();
        }
        return sessionFactory.openSession();
    }


    /*
     * insert记录
     */
    public static  boolean saveEntity(Object obj){
        Session ss = null;
        Transaction ts = null;
        boolean result = false;
        try
        {
            ss = getSession();
            ts = ss.beginTransaction();
            ss.save(obj);
            ts.commit();
            result = true;
        } catch (Exception e) {
            ByteArrayOutputStream outs = new ByteArrayOutputStream();
            e.printStackTrace(new PrintStream(outs));
            String exception = outs.toString();
            System.out.print("错误内容明细1："+exception);
            System.out.print("错误内容明细2："+e.getCause());
            System.out.print("错误内容明细3："+e.getMessage());
            //System.out.print("错误内容明细4："+e.getStackTrace());
            //System.out.print("错误内容明细5："+e.getClass().getPackage());
            //System.out.print("错误内容明细5："+e.getClass().getDeclaredMethods());
        } finally{
            ss.close();
        }
        return result;

    }
}
