package com.liu.asus.myview;

/**
 * Created by 地地 on 2017/12/29.
 * 邮箱：461211527@qq.com.
 */
import android.app.Application;


public class NoteApplication  extends  Application{


    private static NoteApplication instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance=this;
    }

    public static NoteApplication getInstance() {
        return instance;
    }
}
