package com.thought_daily.admin.app;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;

/*********************************
 * *Created by Saurabh on 4/26/2017.
 ********************************/

public class Notification_receiver extends BroadcastReceiver {
    private FactBook mFactBook=new FactBook();
    //private MainActivity mMainActivity=new MainActivity();
    //
    // int count= mMainActivity.getCount();
    String fact=mFactBook.getFactRandom();



    @Override
    public void onReceive(Context context, Intent intent) {
        NotificationManager notificationManager=(NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);

        Intent repeating_intent = new Intent(context,MainActivity.class);
        repeating_intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

        PendingIntent pendingIntent =PendingIntent.getActivity(context,100,repeating_intent,PendingIntent.FLAG_UPDATE_CURRENT);

        NotificationCompat.BigTextStyle bigText =new NotificationCompat.BigTextStyle();
        bigText.bigText(fact);
        bigText.setBigContentTitle("Thought Daily");
       // bigText.setSummaryText()
        NotificationCompat.Builder builder =new NotificationCompat.Builder(context)
                .setContentIntent(pendingIntent)
                .setContentTitle("Thought Of The Day")
                //.setContentText(fact)
                .setStyle(bigText)
                .setSmallIcon(R.mipmap.ic_notification_icon)
                .setAutoCancel(true);
        notificationManager.notify(100,builder.build());

    }
}
