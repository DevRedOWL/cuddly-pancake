package org.linphone.compatibility;

import android.app.AlarmManager;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.PowerManager;
import android.provider.Settings;
import android.text.Html;
import android.text.Spanned;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import org.linphone.mediastream.Version;

public class Compatibility {
    public static void CreateChannel(Context context) {
        if (Version.sdkAboveOrEqual(26)) {
            ApiTwentySixPlus.CreateChannel(context);
        }
    }

    public static Notification createSimpleNotification(Context context, String str, String str2, PendingIntent pendingIntent) {
        if (Version.sdkAboveOrEqual(26)) {
            return ApiTwentySixPlus.createSimpleNotification(context, str, str2, pendingIntent);
        }
        if (Version.sdkAboveOrEqual(21)) {
            return ApiTwentyOnePlus.createSimpleNotification(context, str, str2, pendingIntent);
        }
        if (Version.sdkAboveOrEqual(16)) {
            return ApiSixteenPlus.createSimpleNotification(context, str, str2, pendingIntent);
        }
        return ApiElevenPlus.createSimpleNotification(context, str, str2, pendingIntent);
    }

    public static Notification createMissedCallNotification(Context context, String str, String str2, PendingIntent pendingIntent) {
        if (Version.sdkAboveOrEqual(26)) {
            return ApiTwentySixPlus.createMissedCallNotification(context, str, str2, pendingIntent);
        }
        if (Version.sdkAboveOrEqual(21)) {
            return ApiTwentyOnePlus.createMissedCallNotification(context, str, str2, pendingIntent);
        }
        if (Version.sdkAboveOrEqual(16)) {
            return ApiSixteenPlus.createMissedCallNotification(context, str, str2, pendingIntent);
        }
        return ApiElevenPlus.createMissedCallNotification(context, str, str2, pendingIntent);
    }

    public static Notification createMessageNotification(Context context, int i, String str, String str2, String str3, Bitmap bitmap, PendingIntent pendingIntent) {
        if (Version.sdkAboveOrEqual(26)) {
            return ApiTwentySixPlus.createMessageNotification(context, i, str2, str3, bitmap, pendingIntent);
        }
        if (Version.sdkAboveOrEqual(21)) {
            return ApiTwentyOnePlus.createMessageNotification(context, i, str2, str3, bitmap, pendingIntent);
        }
        if (Version.sdkAboveOrEqual(16)) {
            return ApiSixteenPlus.createMessageNotification(context, i, str2, str3, bitmap, pendingIntent);
        }
        return ApiElevenPlus.createMessageNotification(context, i, str2, str3, bitmap, pendingIntent);
    }

    public static Notification createInCallNotification(Context context, String str, String str2, int i, Bitmap bitmap, String str3, PendingIntent pendingIntent) {
        if (Version.sdkAboveOrEqual(26)) {
            return ApiTwentySixPlus.createInCallNotification(context, str, str2, i, bitmap, str3, pendingIntent);
        }
        if (Version.sdkAboveOrEqual(21)) {
            return ApiTwentyOnePlus.createInCallNotification(context, str, str2, i, bitmap, str3, pendingIntent);
        }
        if (Version.sdkAboveOrEqual(16)) {
            return ApiSixteenPlus.createInCallNotification(context, str, str2, i, bitmap, str3, pendingIntent);
        }
        return ApiElevenPlus.createInCallNotification(context, str, str2, i, bitmap, str3, pendingIntent);
    }

    public static Notification createNotification(Context context, String str, String str2, int i, int i2, Bitmap bitmap, PendingIntent pendingIntent, boolean z, int i3) {
        if (Version.sdkAboveOrEqual(26)) {
            return ApiTwentySixPlus.createNotification(context, str, str2, i, i2, bitmap, pendingIntent, z, i3);
        }
        if (Version.sdkAboveOrEqual(21)) {
            return ApiTwentyOnePlus.createNotification(context, str, str2, i, i2, bitmap, pendingIntent, z, i3);
        }
        if (Version.sdkAboveOrEqual(16)) {
            return ApiSixteenPlus.createNotification(context, str, str2, i, i2, bitmap, pendingIntent, z, i3);
        }
        return ApiElevenPlus.createNotification(context, str, str2, i, i2, bitmap, pendingIntent, z);
    }

    public static CompatibilityScaleGestureDetector getScaleGestureDetector(Context context, CompatibilityScaleGestureListener compatibilityScaleGestureListener) {
        if (!Version.sdkAboveOrEqual(8)) {
            return null;
        }
        CompatibilityScaleGestureDetector compatibilityScaleGestureDetector = new CompatibilityScaleGestureDetector(context);
        compatibilityScaleGestureDetector.setOnScaleListener(compatibilityScaleGestureListener);
        return compatibilityScaleGestureDetector;
    }

    public static void removeGlobalLayoutListener(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (Version.sdkAboveOrEqual(16)) {
            ApiSixteenPlus.removeGlobalLayoutListener(viewTreeObserver, onGlobalLayoutListener);
        } else {
            viewTreeObserver.removeGlobalOnLayoutListener(onGlobalLayoutListener);
        }
    }

    public static boolean canDrawOverlays(Context context) {
        if (Build.VERSION.SDK_INT >= 23) {
            return Settings.canDrawOverlays(context);
        }
        return true;
    }

    public static boolean isScreenOn(PowerManager powerManager) {
        if (Build.VERSION.SDK_INT >= 20) {
            return powerManager.isInteractive();
        }
        return powerManager.isScreenOn();
    }

    public static Spanned fromHtml(String str) {
        return Html.fromHtml(str);
    }

    public static void setTextAppearance(TextView textView, Context context, int i) {
        if (Version.sdkAboveOrEqual(23)) {
            ApiTwentyThreePlus.setTextAppearance(textView, i);
        } else {
            ApiElevenPlus.setTextAppearance(textView, context, i);
        }
    }

    public static void scheduleAlarm(AlarmManager alarmManager, int i, long j, PendingIntent pendingIntent) {
        if (Version.sdkAboveOrEqual(19)) {
            ApiNineteenPlus.scheduleAlarm(alarmManager, i, j, pendingIntent);
        } else {
            ApiElevenPlus.scheduleAlarm(alarmManager, i, j, pendingIntent);
        }
    }

    public static void startService(Context context, Intent intent) {
        if (Version.sdkAboveOrEqual(26)) {
            ApiTwentySixPlus.startService(context, intent);
        } else {
            ApiSixteenPlus.startService(context, intent);
        }
    }
}
