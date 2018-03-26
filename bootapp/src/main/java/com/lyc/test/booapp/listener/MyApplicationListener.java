package com.lyc.test.booapp.listener;

import com.lyc.test.booapp.event.MyApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * Created by liyuanchao on 3/19/18.
 */
public class MyApplicationListener implements ApplicationListener<MyApplicationEvent> {
    @Override
    public void onApplicationEvent(MyApplicationEvent myApplicationEvent) {
        System.out.println(myApplicationEvent.getClass().getName() + "被监听......");
    }
}
