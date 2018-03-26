package com.lyc.test.booapp.event;

import org.springframework.context.ApplicationEvent;

/**
 * Created by liyuanchao on 3/19/18.
 */
public class MyApplicationEvent extends ApplicationEvent {
    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public MyApplicationEvent(Object source) {
        super(source);
    }
}
