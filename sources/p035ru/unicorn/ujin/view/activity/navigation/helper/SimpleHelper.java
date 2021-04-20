package p035ru.unicorn.ujin.view.activity.navigation.helper;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.helper.SimpleHelper */
public class SimpleHelper {
    public static void call(Context context, String str) {
        context.startActivity(new Intent("android.intent.action.CALL", Uri.parse("tel:" + str)));
    }

    public static void playTrack(String str, Context context) {
        try {
            MediaPlayer create = MediaPlayer.create(context, Uri.parse(str));
            if (create != null) {
                create.start();
            }
        } catch (Exception unused) {
        }
    }
}
