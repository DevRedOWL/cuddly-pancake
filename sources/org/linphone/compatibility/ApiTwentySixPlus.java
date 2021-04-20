package org.linphone.compatibility;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.view.ViewTreeObserver;
import androidx.core.app.NotificationCompat;
import org.linphone.C5321R;

public class ApiTwentySixPlus {
    public static void CreateChannel(Context context) {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        String string = context.getString(C5321R.string.notification_service_channel_id);
        String string2 = context.getString(C5321R.string.content_title_notification_service);
        String string3 = context.getString(C5321R.string.content_title_notification_service);
        NotificationChannel notificationChannel = new NotificationChannel(string, string2, 0);
        notificationChannel.setDescription(string3);
        notificationChannel.enableVibration(false);
        notificationManager.createNotificationChannel(notificationChannel);
        String string4 = context.getString(C5321R.string.notification_channel_id);
        String string5 = context.getString(C5321R.string.content_title_notification);
        String string6 = context.getString(C5321R.string.content_title_notification);
        NotificationChannel notificationChannel2 = new NotificationChannel(string4, string5, 4);
        notificationChannel2.setDescription(string6);
        notificationChannel2.enableLights(true);
        notificationChannel2.setLightColor(context.getColor(C5321R.C5322color.notification_color_led));
        notificationChannel2.enableLights(true);
        notificationManager.createNotificationChannel(notificationChannel2);
    }

    public static Notification createMessageNotification(Context context, int i, String str, String str2, Bitmap bitmap, PendingIntent pendingIntent) {
        if (i != 1) {
            str = context.getString(C5321R.string.unread_messages).replace("%i", String.valueOf(i));
        }
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        return new Notification.Builder(context, context.getString(C5321R.string.notification_channel_id)).setContentTitle(str).setContentText(str2).setSmallIcon(C5321R.C5323drawable.topbar_chat_notification).setAutoCancel(true).setContentIntent(pendingIntent).setDefaults(3).setLargeIcon(bitmap).setCategory(NotificationCompat.CATEGORY_MESSAGE).setVisibility(0).setPriority(1).setNumber(i).build();
    }

    public static Notification createInCallNotification(Context context, String str, String str2, int i, Bitmap bitmap, String str3, PendingIntent pendingIntent) {
        return new Notification.Builder(context, context.getString(C5321R.string.notification_channel_id)).setContentTitle(str3).setContentText(str2).setSmallIcon(i).setAutoCancel(false).setContentIntent(pendingIntent).setLargeIcon(bitmap).setCategory("call").setVisibility(1).setPriority(1).build();
    }

    public static Notification createNotification(Context context, String str, String str2, int i, int i2, Bitmap bitmap, PendingIntent pendingIntent, boolean z, int i3) {
        if (bitmap != null) {
            return new Notification.Builder(context, context.getString(C5321R.string.notification_service_channel_id)).setContentTitle(str).setContentText(str2).setSmallIcon(i, i2).setLargeIcon(bitmap).setContentIntent(pendingIntent).setCategory(NotificationCompat.CATEGORY_SERVICE).setVisibility(-1).setPriority(i3).build();
        }
        return new Notification.Builder(context, context.getString(C5321R.string.notification_service_channel_id)).setContentTitle(str).setContentText(str2).setSmallIcon(i, i2).setContentIntent(pendingIntent).setCategory(NotificationCompat.CATEGORY_SERVICE).setVisibility(-1).setPriority(i3).build();
    }

    public static void removeGlobalLayoutListener(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
    }

    public static Notification createMissedCallNotification(Context context, String str, String str2, PendingIntent pendingIntent) {
        return new Notification.Builder(context, context.getString(C5321R.string.notification_channel_id)).setContentTitle(str).setContentText(str2).setSmallIcon(C5321R.C5323drawable.call_status_missed).setAutoCancel(true).setContentIntent(pendingIntent).setDefaults(3).setCategory(NotificationCompat.CATEGORY_MESSAGE).setVisibility(0).setPriority(1).build();
    }

    public static Notification createSimpleNotification(Context context, String str, String str2, PendingIntent pendingIntent) {
        return new Notification.Builder(context, context.getString(C5321R.string.notification_channel_id)).setContentTitle(str).setContentText(str2).setSmallIcon(C5321R.C5323drawable.linphone_logo).setAutoCancel(true).setContentIntent(pendingIntent).setDefaults(3).setCategory(NotificationCompat.CATEGORY_MESSAGE).setVisibility(0).setPriority(1).build();
    }

    public static void startService(Context context, Intent intent) {
        context.startForegroundService(intent);
    }
}
