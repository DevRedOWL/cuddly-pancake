package org.linphone.compatibility;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.ViewTreeObserver;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import org.linphone.C5321R;

public class ApiTwentyOnePlus {
    public static Notification createMessageNotification(Context context, int i, String str, String str2, Bitmap bitmap, PendingIntent pendingIntent) {
        if (i != 1) {
            str = context.getString(C5321R.string.unread_messages).replace("%i", String.valueOf(i));
        }
        return new Notification.Builder(context).setContentTitle(str).setContentText(str2).setSmallIcon(C5321R.C5323drawable.topbar_chat_notification).setAutoCancel(true).setContentIntent(pendingIntent).setDefaults(3).setLargeIcon(bitmap).setLights(ContextCompat.getColor(context, C5321R.C5322color.notification_color_led), context.getResources().getInteger(C5321R.integer.notification_ms_on), context.getResources().getInteger(C5321R.integer.notification_ms_off)).setCategory(NotificationCompat.CATEGORY_MESSAGE).setVisibility(0).setPriority(1).setNumber(i).build();
    }

    public static Notification createInCallNotification(Context context, String str, String str2, int i, Bitmap bitmap, String str3, PendingIntent pendingIntent) {
        return new Notification.Builder(context).setContentTitle(str3).setContentText(str2).setSmallIcon(i).setAutoCancel(false).setContentIntent(pendingIntent).setLargeIcon(bitmap).setCategory("call").setVisibility(1).setPriority(1).setLights(ContextCompat.getColor(context, C5321R.C5322color.notification_color_led), context.getResources().getInteger(C5321R.integer.notification_ms_on), context.getResources().getInteger(C5321R.integer.notification_ms_off)).build();
    }

    public static Notification createNotification(Context context, String str, String str2, int i, int i2, Bitmap bitmap, PendingIntent pendingIntent, boolean z, int i3) {
        if (bitmap != null) {
            return new Notification.Builder(context).setContentTitle(str).setContentText(str2).setSmallIcon(i, i2).setLargeIcon(bitmap).setContentIntent(pendingIntent).setCategory(NotificationCompat.CATEGORY_SERVICE).setVisibility(-1).setLights(ContextCompat.getColor(context, C5321R.C5322color.notification_color_led), context.getResources().getInteger(C5321R.integer.notification_ms_on), context.getResources().getInteger(C5321R.integer.notification_ms_off)).setPriority(i3).build();
        }
        return new Notification.Builder(context).setContentTitle(str).setContentText(str2).setSmallIcon(i, i2).setContentIntent(pendingIntent).setCategory(NotificationCompat.CATEGORY_SERVICE).setVisibility(-1).setLights(ContextCompat.getColor(context, C5321R.C5322color.notification_color_led), context.getResources().getInteger(C5321R.integer.notification_ms_on), context.getResources().getInteger(C5321R.integer.notification_ms_off)).setPriority(i3).build();
    }

    public static void removeGlobalLayoutListener(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
    }

    public static Notification createMissedCallNotification(Context context, String str, String str2, PendingIntent pendingIntent) {
        return new Notification.Builder(context).setContentTitle(str).setContentText(str2).setSmallIcon(C5321R.C5323drawable.call_status_missed).setAutoCancel(true).setContentIntent(pendingIntent).setDefaults(3).setCategory(NotificationCompat.CATEGORY_MESSAGE).setVisibility(0).setLights(ContextCompat.getColor(context, C5321R.C5322color.notification_color_led), context.getResources().getInteger(C5321R.integer.notification_ms_on), context.getResources().getInteger(C5321R.integer.notification_ms_off)).setPriority(1).build();
    }

    public static Notification createSimpleNotification(Context context, String str, String str2, PendingIntent pendingIntent) {
        return new Notification.Builder(context).setContentTitle(str).setContentText(str2).setSmallIcon(C5321R.C5323drawable.linphone_logo).setAutoCancel(true).setContentIntent(pendingIntent).setDefaults(3).setCategory(NotificationCompat.CATEGORY_MESSAGE).setVisibility(0).setLights(ContextCompat.getColor(context, C5321R.C5322color.notification_color_led), context.getResources().getInteger(C5321R.integer.notification_ms_on), context.getResources().getInteger(C5321R.integer.notification_ms_off)).setPriority(1).build();
    }
}
