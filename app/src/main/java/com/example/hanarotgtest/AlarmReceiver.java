package com.example.hanarotgtest;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import android.widget.Toast;

public class AlarmReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        // ((MainActivity)MainActivity.mContext).onAlarm(context);

        Toast.makeText(context, "알람~!!", Toast.LENGTH_SHORT).show();
        Log.i("0", "알람 걸렸음");
    }
}
