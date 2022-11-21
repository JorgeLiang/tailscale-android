package com.tailscale.jlog.tslog;

import android.app.Application;
import android.os.Environment;

import java.io.File;

/**
 * Created by Jorge on 2022/11/21
 */

public class MyApplication extends Application {

     @Override
     public void onCreate() {
      super.onCreate();
         String path = Environment.getExternalStorageDirectory()
                 + File.separator + "AAA_TS_Log";
         String fileName = "TS";
         KLogHandler.getInstance().initHandler(path,fileName);
     }



}
