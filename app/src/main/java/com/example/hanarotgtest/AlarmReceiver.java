package com.example.hanarotgtest;

import android.app.AlarmManager;
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

import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import java.util.List;

public class AlarmReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        // 재부팅을 한 경우, 로컬 DB에 저장된 모든 알람을 확인하여 설정한다.
        if(intent.getAction().equals("android.intent.action.BOOT_COMPLETED")) {
            Toast.makeText(context, "재부팅했습니다.", Toast.LENGTH_SHORT).show();
        }
        // Acitivy 파일이 아니기 때문에 여기서 똑같은 방식으로 사용할 수 없는 듯 하다
        // 따라서 MainActiivy onCreate시 만들어 놓은 mContext를 통해 메소드를 호출함
        ((MainActivity)MainActivity.mContext).onAlarm();

        Toast.makeText(context, "알람~!!", Toast.LENGTH_SHORT).show();
        Log.i("0", "알람 딱대");
    }
}
