package com.kevin.springboot_study.listener;

/**
 * Created by kevin on 16-7-5.
 */

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * 监听Session的创建与销毁
 */
@WebListener
public class MyHttpSessionListener implements HttpSessionListener {

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        System.out.println("Session被创建");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.println("Session被销毁");
    }
}
