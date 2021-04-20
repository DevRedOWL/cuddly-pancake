package p035ru.unicorn.ujin.shortcut;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.drawable.Icon;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.ble.TransparentActivity;
import p035ru.unicorn.ujin.ble.data.BleReader;
import p035ru.unicorn.ujin.data.Enums;
import p035ru.unicorn.ujin.data.MyPassIn;
import p035ru.unicorn.ujin.enums.Flavor;
import p035ru.unicorn.ujin.view.activity.TermsActivity;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\t\u001a\u00020\b2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bJ\u0016\u0010\r\u001a\u00020\b2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000bJ\n\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0012"}, mo51343d2 = {"Lru/unicorn/ujin/shortcut/AppShortcutManager;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "deleteAllShortCut", "", "initBleShortCut", "listOfBle", "", "Lru/unicorn/ujin/ble/data/BleReader;", "initPassShortCut", "result", "Lru/unicorn/ujin/data/MyPassIn;", "shortcutManager", "Landroid/content/pm/ShortcutManager;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.shortcut.AppShortcutManager */
/* compiled from: AppShortcutManager.kt */
public final class AppShortcutManager {
    private final Context context;

    public AppShortcutManager(Context context2) {
        Intrinsics.checkNotNullParameter(context2, "context");
        this.context = context2;
    }

    public final Context getContext() {
        return this.context;
    }

    public final ShortcutManager shortcutManager() {
        return (ShortcutManager) this.context.getSystemService(ShortcutManager.class);
    }

    public final void initPassShortCut(List<MyPassIn> list) {
        if (Flavor.Companion.current().getHasAppShortcut() && Build.VERSION.SDK_INT >= 25) {
            ShortcutInfo.Builder icon = new ShortcutInfo.Builder(this.context, "superID").setShortLabel(this.context.getString(R.string.label_short_my_pass_shortcut)).setIcon(Icon.createWithResource(this.context, R.drawable.ic_svg_qr));
            Intent intent = new Intent(this.context, TermsActivity.class);
            intent.addFlags(268435456);
            intent.addFlags(32768);
            intent.setAction("android.intent.action.VIEW");
            intent.putExtra(Enums.PushClickEventType.Companion.getEVENT_KEY(), Enums.PushClickEventType.PASS_SHOW_MY.getEventValue());
            Unit unit = Unit.INSTANCE;
            ShortcutInfo build = icon.setIntent(intent).build();
            Intrinsics.checkNotNullExpressionValue(build, "ShortcutInfo.Builder(con…                 .build()");
            if (list == null) {
                return;
            }
            if (!list.isEmpty()) {
                ShortcutManager shortcutManager = shortcutManager();
                if (shortcutManager != null) {
                    shortcutManager.addDynamicShortcuts(Collections.singletonList(build));
                    return;
                }
                return;
            }
            ShortcutManager shortcutManager2 = shortcutManager();
            if (shortcutManager2 != null) {
                shortcutManager2.removeAllDynamicShortcuts();
            }
        }
    }

    public final void deleteAllShortCut() {
        ShortcutManager shortcutManager;
        if (Build.VERSION.SDK_INT >= 25 && (shortcutManager = shortcutManager()) != null) {
            shortcutManager.removeAllDynamicShortcuts();
        }
    }

    public final void initBleShortCut(List<? extends BleReader> list) {
        if (Flavor.Companion.current().getHasAppShortcut() && Build.VERSION.SDK_INT >= 25) {
            List arrayList = new ArrayList();
            if (shortcutManager() != null && list != null) {
                Collection arrayList2 = new ArrayList();
                for (Object next : list) {
                    if (StringsKt.contains((CharSequence) ((BleReader) next).getInterfaceType(), (CharSequence) "ble", true)) {
                        arrayList2.add(next);
                    }
                }
                int i = 0;
                for (Object next2 : (List) arrayList2) {
                    int i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    BleReader bleReader = (BleReader) next2;
                    Context context2 = this.context;
                    ShortcutInfo.Builder icon = new ShortcutInfo.Builder(context2, "shortcutBle" + i).setShortLabel(bleReader.getDeviceTitle()).setIcon(Icon.createWithResource(this.context, R.drawable.ic_svg_bluetooth));
                    Intent intent = new Intent(this.context, TransparentActivity.class);
                    intent.addFlags(268435456);
                    intent.addFlags(32768);
                    intent.setAction("android.intent.action.VIEW");
                    intent.putExtra(Enums.PushClickEventType.Companion.getEVENT_KEY(), Enums.PushClickEventType.BLE_ACTION_BY_CLICK.getEventValue());
                    intent.putExtra(Enums.PushClickEventType.BLE_ACTION_BY_CLICK.getEventTypeID(), bleReader.getSerialNumber());
                    Unit unit = Unit.INSTANCE;
                    ShortcutInfo build = icon.setIntent(intent).build();
                    Intrinsics.checkNotNullExpressionValue(build, "ShortcutInfo.Builder(con…                 .build()");
                    arrayList.add(build);
                    if (arrayList.size() > 3) {
                        break;
                    }
                    i = i2;
                }
            }
            if (!arrayList.isEmpty()) {
                ShortcutManager shortcutManager = shortcutManager();
                if (shortcutManager != null) {
                    shortcutManager.addDynamicShortcuts(arrayList);
                    return;
                }
                return;
            }
            ShortcutManager shortcutManager2 = shortcutManager();
            if (shortcutManager2 != null) {
                shortcutManager2.removeAllDynamicShortcuts();
            }
        }
    }
}
