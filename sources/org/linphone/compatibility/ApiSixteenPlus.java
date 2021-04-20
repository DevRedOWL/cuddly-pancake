package org.linphone.compatibility;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.view.ViewTreeObserver;
import org.linphone.C5321R;

public class ApiSixteenPlus {
    public static Notification createMessageNotification(Context context, int i, String str, String str2, Bitmap bitmap, PendingIntent pendingIntent) {
        if (i != 1) {
            str = context.getString(C5321R.string.unread_messages).replace("%i", String.valueOf(i));
        }
        return new Notification.Builder(context).setContentTitle(str).setContentText(str2).setSmallIcon(C5321R.C5323drawable.topbar_chat_notification).setAutoCancel(true).setContentIntent(pendingIntent).setDefaults(7).setWhen(System.currentTimeMillis()).setLargeIcon(bitmap).setNumber(i).build();
    }

    public static Notification createInCallNotification(Context context, String str, String str2, int i, Bitmap bitmap, String str3, PendingIntent pendingIntent) {
        Notification build = new Notification.Builder(context).setContentTitle(str3).setContentText(str2).setSmallIcon(i).setAutoCancel(false).setContentIntent(pendingIntent).setWhen(System.currentTimeMillis()).setLargeIcon(bitmap).build();
        build.flags |= 2;
        return build;
    }

    public static Notification createNotification(Context context, String str, String str2, int i, int i2, Bitmap bitmap, PendingIntent pendingIntent, boolean z, int i3) {
        Notification notification;
        if (bitmap != null) {
            notification = new Notification.Builder(context).setContentTitle(str).setContentText(str2).setSmallIcon(i, i2).setLargeIcon(bitmap).setContentIntent(pendingIntent).setWhen(System.currentTimeMillis()).setPriority(i3).build();
        } else {
            notification = new Notification.Builder(context).setContentTitle(str).setContentText(str2).setSmallIcon(i, i2).setContentIntent(pendingIntent).setWhen(System.currentTimeMillis()).setPriority(i3).build();
        }
        if (z) {
            notification.flags |= 2;
        }
        return notification;
    }

    public static void removeGlobalLayoutListener(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
    }

    public static Notification createMissedCallNotification(Context context, String str, String str2, PendingIntent pendingIntent) {
        return new Notification.Builder(context).setContentTitle(str).setContentText(str2).setSmallIcon(C5321R.C5323drawable.call_status_missed).setAutoCancel(true).setContentIntent(pendingIntent).setDefaults(7).setWhen(System.currentTimeMillis()).build();
    }

    public static Notification createSimpleNotification(Context context, String str, String str2, PendingIntent pendingIntent) {
        return new Notification.Builder(context).setContentTitle(str).setContentText(str2).setSmallIcon(C5321R.C5323drawable.linphone_logo).setAutoCancel(true).setContentIntent(pendingIntent).setDefaults(7).setWhen(System.currentTimeMillis()).build();
    }

    public static void startService(Context context, Intent intent) {
        context.startService(intent);
    }
}
