package org.linphone.compatibility;

import android.app.AlarmManager;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.ContactsContract;
import android.widget.TextView;
import java.util.ArrayList;
import org.linphone.C5321R;

public class ApiElevenPlus {
    public static Notification createMessageNotification(Context context, int i, String str, String str2, Bitmap bitmap, PendingIntent pendingIntent) {
        if (i != 1) {
            str = context.getString(C5321R.string.unread_messages).replace("%i", String.valueOf(i));
        }
        return new Notification.Builder(context).setContentTitle(str).setContentText(str2).setContentIntent(pendingIntent).setSmallIcon(C5321R.C5323drawable.chat).setAutoCancel(true).setDefaults(7).setWhen(System.currentTimeMillis()).setNumber(i).setLargeIcon(bitmap).getNotification();
    }

    public static Notification createInCallNotification(Context context, String str, String str2, int i, Bitmap bitmap, String str3, PendingIntent pendingIntent) {
        Notification notification = new Notification.Builder(context).setContentTitle(str3).setContentText(str2).setSmallIcon(i).setAutoCancel(false).setContentIntent(pendingIntent).setWhen(System.currentTimeMillis()).setLargeIcon(bitmap).getNotification();
        notification.flags |= 2;
        return notification;
    }

    public static Notification createNotification(Context context, String str, String str2, int i, int i2, Bitmap bitmap, PendingIntent pendingIntent, boolean z) {
        Notification notification;
        if (bitmap != null) {
            notification = new Notification.Builder(context).setContentTitle(str).setContentText(str2).setSmallIcon(i, i2).setLargeIcon(bitmap).setContentIntent(pendingIntent).setWhen(System.currentTimeMillis()).getNotification();
        } else {
            notification = new Notification.Builder(context).setContentTitle(str).setContentText(str2).setSmallIcon(i, i2).setContentIntent(pendingIntent).setWhen(System.currentTimeMillis()).getNotification();
        }
        if (z) {
            notification.flags |= 2;
        }
        return notification;
    }

    public static Intent prepareAddContactIntent(String str, String str2) {
        Intent intent = new Intent("android.intent.action.INSERT", ContactsContract.Contacts.CONTENT_URI);
        intent.putExtra("name", str);
        if (str2 != null && str2.startsWith("sip:")) {
            str2 = str2.substring(4);
        }
        ArrayList arrayList = new ArrayList();
        ContentValues contentValues = new ContentValues();
        contentValues.put("mimetype", "vnd.android.cursor.item/sip_address");
        contentValues.put("data1", str2);
        arrayList.add(contentValues);
        intent.putParcelableArrayListExtra("data", arrayList);
        return intent;
    }

    public static Intent prepareEditContactIntentWithSipAddress(int i, String str) {
        Intent intent = new Intent("android.intent.action.EDIT", ContactsContract.Contacts.CONTENT_URI);
        intent.setData(ContentUris.withAppendedId(ContactsContract.Contacts.CONTENT_URI, (long) i));
        ArrayList arrayList = new ArrayList();
        ContentValues contentValues = new ContentValues();
        contentValues.put("mimetype", "vnd.android.cursor.item/sip_address");
        contentValues.put("data1", str);
        arrayList.add(contentValues);
        intent.putParcelableArrayListExtra("data", arrayList);
        return intent;
    }

    public static Notification createMissedCallNotification(Context context, String str, String str2, PendingIntent pendingIntent) {
        return new Notification.Builder(context).setContentTitle(str).setContentText(str2).setContentIntent(pendingIntent).setSmallIcon(C5321R.C5323drawable.call_status_missed).setAutoCancel(true).setDefaults(7).setWhen(System.currentTimeMillis()).getNotification();
    }

    public static Notification createSimpleNotification(Context context, String str, String str2, PendingIntent pendingIntent) {
        return new Notification.Builder(context).setContentTitle(str).setContentText(str2).setContentIntent(pendingIntent).setSmallIcon(C5321R.C5323drawable.linphone_logo).setAutoCancel(true).setDefaults(7).setWhen(System.currentTimeMillis()).getNotification();
    }

    public static void setTextAppearance(TextView textView, Context context, int i) {
        textView.setTextAppearance(context, i);
    }

    public static void scheduleAlarm(AlarmManager alarmManager, int i, long j, PendingIntent pendingIntent) {
        alarmManager.set(i, j, pendingIntent);
    }
}
