package p035ru.unicorn.ujin.data.service.location;

import android.content.Intent;
import android.os.Build;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.altbeacon.beacon.BeaconConsumer;
import org.altbeacon.beacon.BeaconManager;
import org.altbeacon.beacon.BeaconParser;
import org.mobileid.Api;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.data.service.FCM;
import p035ru.unicorn.ujin.data.service.location.BaseBleService;
import p035ru.unicorn.ujin.p057di.koin.KoinData;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona.PassDetailFragment2;
import p035ru.unicorn.ujin.view.activity.navigation.repository.LocalRepository;
import p046io.reactivex.android.schedulers.AndroidSchedulers;
import p046io.reactivex.disposables.CompositeDisposable;
import p046io.reactivex.disposables.Disposable;
import p046io.reactivex.rxkotlin.DisposableKt;
import p046io.reactivex.schedulers.Schedulers;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 12\u00020\u00012\u00020\u0002:\u00011B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\"\u001a\u00020\u0005H\u0002J\b\u0010#\u001a\u00020\u0005H\u0016J\b\u0010$\u001a\u00020\u0005H\u0016J\b\u0010%\u001a\u00020\u0005H\u0016J \u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020'2\u0006\u0010+\u001a\u00020'H\u0016J\b\u0010,\u001a\u00020\u0005H\u0002J\b\u0010-\u001a\u00020\u0005H\u0002J\b\u0010.\u001a\u00020\u0005H\u0002J\b\u0010/\u001a\u00020\u0005H\u0002J\b\u00100\u001a\u00020\u0005H\u0002R\u0014\u0010\u0004\u001a\u00020\u00058BX\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\b\u001a\u00020\t8BX\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0002¢\u0006\f\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0002¢\u0006\f\n\u0004\b\u001c\u0010\r\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001d\u001a\u00020\u001e8BX\u0002¢\u0006\f\n\u0004\b!\u0010\r\u001a\u0004\b\u001f\u0010 ¨\u00062"}, mo51343d2 = {"Lru/unicorn/ujin/data/service/location/LocationService;", "Lru/unicorn/ujin/data/service/location/BaseBleService;", "Lorg/altbeacon/beacon/BeaconConsumer;", "()V", "alarmPoints", "", "getAlarmPoints", "()Lkotlin/Unit;", "beaconHelper", "Lru/unicorn/ujin/data/service/location/BeaconHelper;", "getBeaconHelper", "()Lru/unicorn/ujin/data/service/location/BeaconHelper;", "beaconHelper$delegate", "Lkotlin/Lazy;", "beaconManager", "Lorg/altbeacon/beacon/BeaconManager;", "getBeaconManager", "()Lorg/altbeacon/beacon/BeaconManager;", "beaconManager$delegate", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "getCompositeDisposable", "()Lio/reactivex/disposables/CompositeDisposable;", "compositeDisposable$delegate", "localRepository", "Lru/unicorn/ujin/view/activity/navigation/repository/LocalRepository;", "getLocalRepository", "()Lru/unicorn/ujin/view/activity/navigation/repository/LocalRepository;", "localRepository$delegate", "remoteRepository", "Lru/unicorn/ujin/data/service/location/LocationRepository;", "getRemoteRepository", "()Lru/unicorn/ujin/data/service/location/LocationRepository;", "remoteRepository$delegate", "initBluetoothMonitor", "onBeaconServiceConnect", "onCreateService", "onDestroy", "onStartCommand", "", "intent", "Landroid/content/Intent;", "flags", "startId", "openGate", "stopLocationService", "stopScan", "stopScanTempory", "subscribeOnStateChange", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.service.location.LocationService */
/* compiled from: LocationService.kt */
public final class LocationService extends BaseBleService implements BeaconConsumer {
    public static final String ACTION_URL = "ACTION_URL";
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String SAVE_PLACE = "save";
    public static final String SHOW_GEOFENCES = "show_geofences";
    public static final String START_UPDATE_POINT = "start_update_point";
    private final Lazy beaconHelper$delegate = LazyKt.lazy(new LocationService$beaconHelper$2(this));
    private final Lazy beaconManager$delegate = LazyKt.lazy(new LocationService$beaconManager$2(this));
    private final Lazy compositeDisposable$delegate = LazyKt.lazy(LocationService$compositeDisposable$2.INSTANCE);
    private final Lazy localRepository$delegate = LazyKt.lazy(LocationService$localRepository$2.INSTANCE);
    private final Lazy remoteRepository$delegate = LazyKt.lazy(LocationService$remoteRepository$2.INSTANCE);

    @Metadata(mo51341bv = {1, 0, 3}, mo51344k = 3, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.data.service.location.LocationService$WhenMappings */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[BaseBleService.BleAvailableTrigger.values().length];

        static {
            $EnumSwitchMapping$0[BaseBleService.BleAvailableTrigger.Ble.ordinal()] = 1;
            $EnumSwitchMapping$0[BaseBleService.BleAvailableTrigger.Geo.ordinal()] = 2;
            $EnumSwitchMapping$0[BaseBleService.BleAvailableTrigger.BleAndGeo.ordinal()] = 3;
            $EnumSwitchMapping$0[BaseBleService.BleAvailableTrigger.ScreenOff.ordinal()] = 4;
            $EnumSwitchMapping$0[BaseBleService.BleAvailableTrigger.ScreenOn.ordinal()] = 5;
        }
    }

    /* access modifiers changed from: private */
    public final BeaconHelper getBeaconHelper() {
        return (BeaconHelper) this.beaconHelper$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final BeaconManager getBeaconManager() {
        return (BeaconManager) this.beaconManager$delegate.getValue();
    }

    private final CompositeDisposable getCompositeDisposable() {
        return (CompositeDisposable) this.compositeDisposable$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final LocalRepository getLocalRepository() {
        return (LocalRepository) this.localRepository$delegate.getValue();
    }

    private final LocationRepository getRemoteRepository() {
        return (LocationRepository) this.remoteRepository$delegate.getValue();
    }

    public void onBeaconServiceConnect() {
    }

    public void onCreateService() {
        initBluetoothMonitor();
        getAlarmPoints();
        subscribeOnStateChange();
        registerBroadcastReceivers();
    }

    private final void initBluetoothMonitor() {
        getBeaconManager().getBeaconParsers().add(new BeaconParser().setBeaconLayout("m:0-3=4c000215,i:4-19,i:20-21,i:22-23,p:24-24"));
        getBeaconManager().setForegroundScanPeriod(1000);
        getBeaconManager().setForegroundBetweenScanPeriod(PassDetailFragment2.CANCEL_DIALOG_DELAY);
        if (Build.VERSION.SDK_INT >= 26 && !getBeaconManager().isAnyConsumerBound()) {
            getBeaconManager().enableForegroundServiceScanning(createNotificationForServiceDefault(), 101);
            getBeaconManager().setEnableScheduledScanJobs(false);
        }
        getBeaconManager().setBackgroundScanPeriod(1000);
        getBeaconManager().setBackgroundBetweenScanPeriod(PassDetailFragment2.CANCEL_DIALOG_DELAY);
        BeaconConsumer beaconConsumer = this;
        if (!getBeaconManager().isBound(beaconConsumer)) {
            getBeaconManager().bind(beaconConsumer);
        }
    }

    private final void subscribeOnStateChange() {
        Disposable subscribe = isServiceAvailableSubject().subscribe(new LocationService$subscribeOnStateChange$1(this));
        Intrinsics.checkNotNullExpressionValue(subscribe, "isServiceAvailableSubjec…      }\n                }");
        CompositeDisposable compositeDisposable = this.disposable;
        Intrinsics.checkNotNullExpressionValue(compositeDisposable, "disposable");
        DisposableKt.addTo(subscribe, compositeDisposable);
    }

    /* access modifiers changed from: private */
    public final void openGate() {
        if (KoinData.INSTANCE.isInit()) {
            Api.requestAccess$default(Api.INSTANCE, this, (String) null, 2, (Object) null);
        }
    }

    private final Unit getAlarmPoints() {
        LocationRepository remoteRepository = getRemoteRepository();
        getCompositeDisposable().add((remoteRepository != null ? remoteRepository.reloadPoints() : null).filter(LocationService$alarmPoints$subscribe$1.INSTANCE).doOnNext(new LocationService$alarmPoints$subscribe$2(this)).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe());
        return Unit.INSTANCE;
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        int intExtra;
        String stringExtra;
        Intrinsics.checkNotNullParameter(intent, "intent");
        String action = intent.getAction();
        if (action == null || !Intrinsics.areEqual((Object) action, (Object) getString(R.string.action_stop_foreground_service))) {
            if (!(action == null || !Intrinsics.areEqual((Object) FCM.ACTION_OPEN_DOOR, (Object) intent.getAction()) || (stringExtra = intent.getStringExtra(ACTION_URL)) == null)) {
                getCompositeDisposable().add(getRemoteRepository().sendActionCommand(new Regex("https://api-product.mysmartflat.ru/api/geo/action/\\?").replace((CharSequence) stringExtra, "")).subscribe());
            }
            if (!(action == null || !Intrinsics.areEqual((Object) "action_send", (Object) intent.getAction()) || (intExtra = intent.getIntExtra("arg_action_id", 0)) == 0)) {
                getCompositeDisposable().add(getRemoteRepository().sendActionWithId(Integer.valueOf(intExtra)).subscribe());
                NotificationHelper.cancelNotificationById(this, intent.getIntExtra("arg_push_id", -1));
            }
            return 2;
        }
        stopScan();
        stopLocationService();
        return 2;
    }

    /* access modifiers changed from: private */
    public final void stopScanTempory() {
        if (getBeaconManager().isBound(this)) {
            getBeaconManager().removeAllMonitorNotifiers();
            getBeaconManager().removeAllRangeNotifiers();
        }
    }

    private final void stopScan() {
        BeaconConsumer beaconConsumer = this;
        if (getBeaconManager().isBound(beaconConsumer)) {
            getBeaconManager().removeAllMonitorNotifiers();
            getBeaconManager().removeAllRangeNotifiers();
            getBeaconManager().unbind(beaconConsumer);
            getBeaconManager().disableForegroundServiceScanning();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        if (!getCompositeDisposable().isDisposed()) {
            getCompositeDisposable().clear();
        }
    }

    private final void stopLocationService() {
        if (Build.VERSION.SDK_INT >= 24) {
            stopForeground(true);
            stopForeground(2);
            stopForeground(1);
        } else {
            stopForeground(true);
        }
        stopSelf();
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, mo51343d2 = {"Lru/unicorn/ujin/data/service/location/LocationService$Companion;", "", "()V", "ACTION_URL", "", "SAVE_PLACE", "SHOW_GEOFENCES", "START_UPDATE_POINT", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.data.service.location.LocationService$Companion */
    /* compiled from: LocationService.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
