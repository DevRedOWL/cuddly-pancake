package p035ru.unicorn.ujin.data.service.location;

import android.app.Notification;
import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.app.NotificationCompat;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.ble.ble_service_detector.strategy.PushUISetting;
import p046io.reactivex.subjects.PublishSubject;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b&\u0018\u00002\u00020\u0001:\u0002<=B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010&\u001a\u00020'H\u0002J \u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\t2\u0006\u0010+\u001a\u00020\u00052\u0006\u0010,\u001a\u00020\u0005H\u0004J\"\u0010(\u001a\u00020)2\u0006\u0010,\u001a\u00020\u00052\u0006\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u000100H\u0004J\b\u00101\u001a\u00020)H\u0004J\b\u00102\u001a\u00020'H\u0002J\u0010\u00103\u001a\u00020'2\u0006\u00104\u001a\u00020\tH\u0004J\b\u00105\u001a\u00020'H\u0016J\b\u00106\u001a\u00020'H\u0016J\b\u00107\u001a\u00020'H\u0004J\b\u00108\u001a\u00020'H\u0002J\b\u00109\u001a\u00020'H\u0004J\u0010\u0010:\u001a\u00020'2\u0006\u0010;\u001a\u00020)H\u0004R*\u0010\u0003\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u0007X\u0004¢\u0006\u0002\n\u0000R+\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8F@FX\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR+\u0010\u0010\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8F@FX\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR&\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\t0\u00150\u0014X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0019X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\u00020\u001bX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001c\u0010 \u001a\u0004\u0018\u00010!X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006>"}, mo51343d2 = {"Lru/unicorn/ujin/data/service/location/BaseBleService;", "Lru/unicorn/ujin/data/service/location/BaseService;", "()V", "currentNotificationAction", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "<set-?>", "", "isBleEnable", "()Z", "setBleEnable", "(Z)V", "isBleEnable$delegate", "Lkotlin/properties/ReadWriteProperty;", "isLocationEnable", "setLocationEnable", "isLocationEnable$delegate", "isServiceAvailableSubject", "Lio/reactivex/subjects/PublishSubject;", "Lkotlin/Pair;", "Lru/unicorn/ujin/data/service/location/BaseBleService$BleAvailableTrigger;", "()Lio/reactivex/subjects/PublishSubject;", "mReceiver", "Landroid/content/BroadcastReceiver;", "pushManager", "Lru/unicorn/ujin/data/service/location/PushManager;", "getPushManager", "()Lru/unicorn/ujin/data/service/location/PushManager;", "setPushManager", "(Lru/unicorn/ujin/data/service/location/PushManager;)V", "remoteView", "Landroid/widget/RemoteViews;", "getRemoteView", "()Landroid/widget/RemoteViews;", "setRemoteView", "(Landroid/widget/RemoteViews;)V", "createCustomNotificationViewIfNeeded", "", "createNotificationForService", "Landroid/app/Notification;", "isError", "message", "clickAction", "pushUISetting", "Lru/unicorn/ujin/ble/ble_service_detector/strategy/PushUISetting;", "bundle", "Landroid/os/Bundle;", "createNotificationForServiceDefault", "init", "notifyScreenStatus", "isJustScreenOn", "onCreate", "onDestroy", "registerBroadcastReceivers", "unregisterBroadcastReceivers", "updateBleStatus", "updatePushInfo", "notification", "BleAvailableTrigger", "BleType", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.service.location.BaseBleService */
/* compiled from: BaseBleService.kt */
public abstract class BaseBleService extends BaseService {
    static final /* synthetic */ KProperty[] $$delegatedProperties;
    private final HashMap<String, Long> currentNotificationAction = new HashMap<>();
    private final ReadWriteProperty isBleEnable$delegate = Delegates.INSTANCE.notNull();
    private final ReadWriteProperty isLocationEnable$delegate = Delegates.INSTANCE.notNull();
    private final PublishSubject<Pair<BleAvailableTrigger, Boolean>> isServiceAvailableSubject;
    private final BroadcastReceiver mReceiver = new BaseBleService$mReceiver$1(this);
    public PushManager pushManager;
    private RemoteViews remoteView;

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, mo51343d2 = {"Lru/unicorn/ujin/data/service/location/BaseBleService$BleAvailableTrigger;", "", "(Ljava/lang/String;I)V", "Geo", "Ble", "BleAndGeo", "ScreenOn", "ScreenOff", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.data.service.location.BaseBleService$BleAvailableTrigger */
    /* compiled from: BaseBleService.kt */
    public enum BleAvailableTrigger {
        Geo,
        Ble,
        BleAndGeo,
        ScreenOn,
        ScreenOff
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, mo51343d2 = {"Lru/unicorn/ujin/data/service/location/BaseBleService$BleType;", "", "(Ljava/lang/String;I)V", "Beacon", "Gate", "Nedap", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.data.service.location.BaseBleService$BleType */
    /* compiled from: BaseBleService.kt */
    public enum BleType {
        Beacon,
        Gate,
        Nedap
    }

    static {
        Class<BaseBleService> cls = BaseBleService.class;
        $$delegatedProperties = new KProperty[]{Reflection.mutableProperty1(new MutablePropertyReference1Impl(cls, "isLocationEnable", "isLocationEnable()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(cls, "isBleEnable", "isBleEnable()Z", 0))};
    }

    public final boolean isBleEnable() {
        return ((Boolean) this.isBleEnable$delegate.getValue(this, $$delegatedProperties[1])).booleanValue();
    }

    public final boolean isLocationEnable() {
        return ((Boolean) this.isLocationEnable$delegate.getValue(this, $$delegatedProperties[0])).booleanValue();
    }

    public final void setBleEnable(boolean z) {
        this.isBleEnable$delegate.setValue(this, $$delegatedProperties[1], Boolean.valueOf(z));
    }

    public final void setLocationEnable(boolean z) {
        this.isLocationEnable$delegate.setValue(this, $$delegatedProperties[0], Boolean.valueOf(z));
    }

    public BaseBleService() {
        PublishSubject<Pair<BleAvailableTrigger, Boolean>> create = PublishSubject.create();
        Intrinsics.checkNotNullExpressionValue(create, "PublishSubject.create<Pa…ilableTrigger,Boolean>>()");
        this.isServiceAvailableSubject = create;
    }

    /* access modifiers changed from: protected */
    public final PublishSubject<Pair<BleAvailableTrigger, Boolean>> isServiceAvailableSubject() {
        return this.isServiceAvailableSubject;
    }

    public final PushManager getPushManager() {
        PushManager pushManager2 = this.pushManager;
        if (pushManager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pushManager");
        }
        return pushManager2;
    }

    public final void setPushManager(PushManager pushManager2) {
        Intrinsics.checkNotNullParameter(pushManager2, "<set-?>");
        this.pushManager = pushManager2;
    }

    public final RemoteViews getRemoteView() {
        return this.remoteView;
    }

    public final void setRemoteView(RemoteViews remoteViews) {
        this.remoteView = remoteViews;
    }

    public void onCreate() {
        init();
        createCustomNotificationViewIfNeeded();
        startForeground(101, createNotificationForServiceDefault());
        onCreateService();
    }

    private final void init() {
        Context context = this;
        this.pushManager = new PushManager(context);
        PushManager pushManager2 = this.pushManager;
        if (pushManager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pushManager");
        }
        pushManager2.createNotificationChannel();
        setLocationEnable(LocationHelper.isLocationEnabled(context));
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        setBleEnable(defaultAdapter != null ? defaultAdapter.isEnabled() : false);
    }

    private final void createCustomNotificationViewIfNeeded() {
        this.remoteView = new RemoteViews(getPackageName(), R.layout.push_notification_for_ble_devices);
    }

    /* access modifiers changed from: protected */
    public final Notification createNotificationForServiceDefault() {
        PushUISetting pushUISetting = new PushUISetting(false, (String) null, 0, (String) null, 15, (DefaultConstructorMarker) null);
        pushUISetting.setError(false);
        pushUISetting.setMessage("Поиск ...");
        pushUISetting.setShowButton(4);
        Unit unit = Unit.INSTANCE;
        return createNotificationForService("", pushUISetting, (Bundle) null);
    }

    /* access modifiers changed from: protected */
    public final Notification createNotificationForService(boolean z, String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "message");
        Intrinsics.checkNotNullParameter(str2, "clickAction");
        PushUISetting pushUISetting = new PushUISetting(false, (String) null, 0, (String) null, 15, (DefaultConstructorMarker) null);
        pushUISetting.setError(z);
        pushUISetting.setMessage(str);
        Unit unit = Unit.INSTANCE;
        return createNotificationForService(str2, pushUISetting, (Bundle) null);
    }

    /* access modifiers changed from: protected */
    public final Notification createNotificationForService(String str, PushUISetting pushUISetting, Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "clickAction");
        Intrinsics.checkNotNullParameter(pushUISetting, "pushUISetting");
        PushManager pushManager2 = this.pushManager;
        if (pushManager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pushManager");
        }
        Notification.Builder notificationBuilder = pushManager2.getNotificationBuilder();
        if (this.remoteView == null || Build.VERSION.SDK_INT < 26) {
            notificationBuilder.setContentTitle(pushUISetting.getMessage());
            notificationBuilder.setContentText("");
            notificationBuilder.setOngoing(true);
            notificationBuilder.setCategory(NotificationCompat.CATEGORY_SERVICE);
            notificationBuilder.setAutoCancel(true);
            notificationBuilder.setSmallIcon(R.mipmap.ic_launcher_app);
        } else {
            RemoteViews remoteViews = this.remoteView;
            if (remoteViews != null) {
                remoteViews.setTextViewText(R.id.status_description, pushUISetting.getMessage());
            }
            RemoteViews remoteViews2 = this.remoteView;
            if (remoteViews2 != null) {
                remoteViews2.setTextViewText(R.id.settings, pushUISetting.getButtonMessage());
            }
            RemoteViews remoteViews3 = this.remoteView;
            if (remoteViews3 != null) {
                remoteViews3.setViewVisibility(R.id.settings, pushUISetting.getShowButton());
            }
            notificationBuilder.setSmallIcon(R.mipmap.ic_launcher_app);
            notificationBuilder.setCustomBigContentView(this.remoteView);
        }
        Notification build = notificationBuilder.build();
        Intrinsics.checkNotNullExpressionValue(build, "notificationBuilder.build()");
        return build;
    }

    /* access modifiers changed from: protected */
    public final void registerBroadcastReceivers() {
        IntentFilter intentFilter = new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED");
        IntentFilter intentFilter2 = new IntentFilter("android.location.PROVIDERS_CHANGED");
        IntentFilter intentFilter3 = new IntentFilter();
        intentFilter3.addAction("android.intent.action.SCREEN_ON");
        intentFilter3.addAction("android.intent.action.SCREEN_OFF");
        registerReceiver(this.mReceiver, intentFilter);
        registerReceiver(this.mReceiver, intentFilter2);
        registerReceiver(this.mReceiver, intentFilter3);
        updateBleStatus();
    }

    private final void unregisterBroadcastReceivers() {
        unregisterReceiver(this.mReceiver);
    }

    public void onDestroy() {
        super.onDestroy();
        unregisterBroadcastReceivers();
    }

    /* access modifiers changed from: protected */
    public final void updateBleStatus() {
        boolean z = false;
        if (!isLocationEnable()) {
            this.isServiceAvailableSubject.onNext(new Pair(BleAvailableTrigger.Geo, false));
        } else if (!isBleEnable()) {
            this.isServiceAvailableSubject.onNext(new Pair(BleAvailableTrigger.Ble, false));
        } else {
            PublishSubject<Pair<BleAvailableTrigger, Boolean>> publishSubject = this.isServiceAvailableSubject;
            BleAvailableTrigger bleAvailableTrigger = BleAvailableTrigger.BleAndGeo;
            if (isLocationEnable() && isBleEnable()) {
                z = true;
            }
            publishSubject.onNext(new Pair(bleAvailableTrigger, Boolean.valueOf(z)));
        }
    }

    /* access modifiers changed from: protected */
    public final void notifyScreenStatus(boolean z) {
        if (z) {
            this.isServiceAvailableSubject.onNext(new Pair(BleAvailableTrigger.ScreenOn, true));
        } else {
            this.isServiceAvailableSubject.onNext(new Pair(BleAvailableTrigger.ScreenOff, true));
        }
    }

    /* access modifiers changed from: protected */
    public final void updatePushInfo(Notification notification) {
        Intrinsics.checkNotNullParameter(notification, "notification");
        PushManager pushManager2 = this.pushManager;
        if (pushManager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pushManager");
        }
        pushManager2.getManager().notify(101, notification);
    }
}
