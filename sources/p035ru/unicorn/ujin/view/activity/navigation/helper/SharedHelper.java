package p035ru.unicorn.ujin.view.activity.navigation.helper;

import android.content.Context;
import android.content.SharedPreferences;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mainsmart.Rooms;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.helper.SharedHelper */
public class SharedHelper {
    public static final String APP_PREFERENCES = "settings";
    public static final String IS_CONFIRM = "is_confirm";
    public static final String ROOM_ID = "room_id";
    private static final String ROOM_NAME = "room_name";

    public static boolean isPersonalConfirm(Context context) {
        return getSharedPreference(context).getBoolean(IS_CONFIRM, false);
    }

    public static SharedPreferences getSharedPreference(Context context) {
        return context.getSharedPreferences(APP_PREFERENCES, 0);
    }

    public static void setConfirm(Context context) {
        getSharedPreference(context).edit().putBoolean(IS_CONFIRM, true).apply();
    }

    public static void setCurrentRoom(Context context, Integer num, String str) {
        SharedPreferences sharedPreference = getSharedPreference(context);
        sharedPreference.edit().putInt(ROOM_ID, num.intValue()).apply();
        sharedPreference.edit().putString(ROOM_NAME, str).apply();
    }

    public static Rooms getCurrentRoom(Context context) {
        int i = context.getSharedPreferences(APP_PREFERENCES, 0).getInt(ROOM_ID, -1);
        String string = context.getSharedPreferences(APP_PREFERENCES, 0).getString(ROOM_NAME, "");
        if (i == -1 || string.equals("")) {
            return null;
        }
        return new Rooms(Integer.valueOf(i), string);
    }

    public static void setNoneRoom(Context context) {
        SharedPreferences sharedPreference = getSharedPreference(context);
        sharedPreference.edit().putInt(ROOM_ID, -1).apply();
        sharedPreference.edit().putString(ROOM_NAME, "").apply();
    }
}
