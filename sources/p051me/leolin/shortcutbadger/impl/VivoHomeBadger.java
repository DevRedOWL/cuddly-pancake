package p051me.leolin.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.firebase.messaging.Constants;
import java.util.Arrays;
import java.util.List;
import p051me.leolin.shortcutbadger.Badger;
import p051me.leolin.shortcutbadger.ShortcutBadgeException;

/* renamed from: me.leolin.shortcutbadger.impl.VivoHomeBadger */
public class VivoHomeBadger implements Badger {
    public void executeBadge(Context context, ComponentName componentName, int i) throws ShortcutBadgeException {
        Intent intent = new Intent("launcher.action.CHANGE_APPLICATION_NOTIFICATION_NUM");
        intent.putExtra(Constants.FirelogAnalytics.PARAM_PACKAGE_NAME, context.getPackageName());
        intent.putExtra("className", componentName.getClassName());
        intent.putExtra("notificationNum", i);
        context.sendBroadcast(intent);
    }

    public List<String> getSupportLaunchers() {
        return Arrays.asList(new String[]{"com.vivo.launcher"});
    }
}
