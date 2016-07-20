package com.xh.customnotification;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/**
 * Created by xiaohui on 7/19/2016.
 */
public class Constants {
    public interface ACTION {
        public static String MAIN_ACTION = "com.xh.customnotification.action.main";
        public static String INIT_ACTION = "com.xh.customnotification.action.init";
        public static String PREV_ACTION = "com.xh.customnotification.action.prev";
        public static String PLAY_ACTION = "com.xh.customnotification.action.play";
        public static String NEXT_ACTION = "com.xh.customnotification.action.next";
        public static String STARTFOREGROUND_ACTION = "com.xh.customnotification.action.startforeground";
        public static String STOPFOREGROUND_ACTION = "com.xh.customnotification.action.stopforeground";

    }

    public interface NOTIFICATION_ID {
        public static int FOREGROUND_SERVICE = 101;
    }

    public static Bitmap getDefaultAlbumArt(Context context, int resId) {
        Bitmap bm = null;
        BitmapFactory.Options options = new BitmapFactory.Options();
        try {
            bm = BitmapFactory.decodeResource(context.getResources(),
                    resId, options);
        } catch (Error ee) {
        } catch (Exception e) {
        }
        return bm;
    }

}
