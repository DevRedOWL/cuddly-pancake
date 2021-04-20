package p035ru.unicorn.ujin.data.service.location;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;
import org.altbeacon.beacon.Beacon;
import org.altbeacon.beacon.BeaconManager;
import org.altbeacon.beacon.Identifier;
import org.altbeacon.beacon.RangeNotifier;
import org.altbeacon.beacon.Region;
import org.apache.commons.lang3.time.DateUtils;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.data.realm.BeaconAction;
import p035ru.unicorn.ujin.data.realm.MyBeacon;
import p035ru.unicorn.ujin.data.realm.Point;
import p035ru.unicorn.ujin.data.service.location.NotificationHelper;
import p035ru.unicorn.ujin.view.activity.navigation.repository.LocalRepository;
import p046io.reactivex.functions.Consumer;
import p046io.realm.RealmList;

/* renamed from: ru.unicorn.ujin.data.service.location.BeaconHelper */
class BeaconHelper {
    static final String ACTION_SEND = "action_send";
    static final String ARG_ACTION_ID = "arg_action_id";
    private static final String ARG_AUTO_ACTION = "arg_auto_action";
    static final String ARG_PUSH_ID = "arg_push_id";
    static final String BEACON_TEMPLATE = "m:0-3=4c000215,i:4-19,i:20-21,i:22-23,p:24-24";
    public static final int DURATION_IN_SEC = 15;
    private static final String MY_RANGING_UNIQUE_ID = "myRangingUniqueId";
    public static final String PUSH_ACTION = "push_action";
    public static final int PUSH_LIVE_TIME_IN_MILLIS = 60000;
    private Map<String, Long> actionINwasActivate = new TreeMap();
    private BeaconManager beaconManager;
    private Context context;
    private boolean isInProgress = false;
    private LocalRepository localRepository;

    BeaconHelper(Context context2, LocalRepository localRepository2, BeaconManager beaconManager2) {
        this.context = context2;
        this.localRepository = localRepository2;
        this.beaconManager = beaconManager2;
        if (beaconManager2 != null) {
            startMonitoring();
        }
    }

    /* access modifiers changed from: protected */
    public void startMonitoring() {
        this.beaconManager.addRangeNotifier(new RangeNotifier() {
            public final void didRangeBeaconsInRegion(Collection collection, Region region) {
                BeaconHelper.this.lambda$startMonitoring$1$BeaconHelper(collection, region);
            }
        });
        try {
            this.beaconManager.startRangingBeaconsInRegion(new Region(MY_RANGING_UNIQUE_ID, (Identifier) null, (Identifier) null, (Identifier) null));
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public /* synthetic */ void lambda$startMonitoring$1$BeaconHelper(Collection collection, Region region) {
        if (collection.size() > 0) {
            List<Point> beacon = this.localRepository.getBeacon();
            if (!beacon.isEmpty() && !this.isInProgress) {
                this.isInProgress = true;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    Beacon beacon2 = (Beacon) it.next();
                    Identifier id3 = beacon2.getId3();
                    beacon2.getBluetoothAddress().toLowerCase();
                    MyBeacon findBeaconFromEtelonList = findBeaconFromEtelonList(Integer.valueOf(id3.toString()), beacon);
                    BeaconAction findBeaconAction = findBeaconAction(Integer.valueOf(id3.toString()).intValue(), beacon);
                    if (!(findBeaconAction == null || findBeaconFromEtelonList == null)) {
                        String num = findBeaconAction.getBeaconActionDescriptionIn().getId().toString();
                        boolean z = !this.actionINwasActivate.containsKey(num) || (this.actionINwasActivate.containsKey(num) && this.actionINwasActivate.get(num).longValue() + TimeUnit.SECONDS.toMillis(15) < System.currentTimeMillis());
                        Identifier identifier = id3;
                        if ((findBeaconFromEtelonList.getRadius().doubleValue() >= beacon2.getDistance() || beacon2.getRssi() > findBeaconFromEtelonList.getLevel().intValue()) && z) {
                            Integer id = findBeaconAction.getBeaconActionDescriptionIn().getId();
                            Boolean valueOf = Boolean.valueOf(findBeaconFromEtelonList.getAutoAction().intValue() == 1);
                            Intent intent = new Intent(this.context, LocationService.class);
                            intent.setAction(ACTION_SEND);
                            intent.putExtra(ARG_ACTION_ID, id);
                            intent.putExtra(ARG_AUTO_ACTION, valueOf);
                            PendingIntent creaatePendingIntent = creaatePendingIntent(findBeaconAction, findBeaconFromEtelonList, true);
                            if (valueOf.booleanValue()) {
                                this.context.startService(intent);
                            } else {
                                String title = findBeaconAction.getBeaconActionDescriptionIn().getTitle();
                                " in" + ((int) beacon2.getDistance()) + " ?< " + findBeaconFromEtelonList.getRadius() + " " + beacon2.getRssi() + "  ?< " + findBeaconFromEtelonList.getLevelOut();
                                new NotificationHelper.Builder(this.context).title(title).body(title).actionIcon(Integer.valueOf(R.drawable.icon_key_small)).actionPendingIntent(creaatePendingIntent).contentPendingIntent(creaatePendingIntent).actionTitle(title).timeOutInMillis(DateUtils.MILLIS_PER_MINUTE).pushId(Integer.valueOf(num)).build();
                                this.localRepository.isFavoriteBeacon(identifier.toInt()).subscribe(new Consumer(intent) {
                                    private final /* synthetic */ Intent f$1;

                                    {
                                        this.f$1 = r2;
                                    }

                                    public final void accept(Object obj) {
                                        BeaconHelper.this.lambda$null$0$BeaconHelper(this.f$1, (Boolean) obj);
                                    }
                                });
                            }
                            this.actionINwasActivate.put(num, Long.valueOf(System.currentTimeMillis()));
                        } else if ((beacon2.getDistance() > findBeaconFromEtelonList.getRadiusOut().doubleValue() || beacon2.getRssi() < findBeaconFromEtelonList.getLevelOut().intValue()) && !z) {
                            this.actionINwasActivate.remove(num);
                            String title2 = findBeaconAction.getBeaconActionDescriptionOut().getTitle();
                            PendingIntent creaatePendingIntent2 = creaatePendingIntent(findBeaconAction, findBeaconFromEtelonList, false);
                            new NotificationHelper.Builder(this.context).title(title2).body(title2).actionIcon(Integer.valueOf(R.drawable.icon_key_small)).actionPendingIntent(creaatePendingIntent2).contentPendingIntent(creaatePendingIntent2).actionTitle(title2).timeOutInMillis(DateUtils.MILLIS_PER_MINUTE).build();
                        } else if (z) {
                            this.actionINwasActivate.remove(num);
                        }
                    }
                }
                this.isInProgress = false;
            }
        }
    }

    public /* synthetic */ void lambda$null$0$BeaconHelper(Intent intent, Boolean bool) throws Exception {
        starty(intent);
    }

    private void starty(Intent intent) {
        this.context.startService(intent);
    }

    private void testBeacon(Beacon beacon, MyBeacon myBeacon, boolean z, boolean z2) {
        NotificationHelper.Builder builder = new NotificationHelper.Builder(this.context);
        NotificationHelper.Builder title = builder.title(beacon.getId3().toString() + " test " + myBeacon.getRadius());
        title.body(beacon.getRssi() + " " + beacon.getDistance() + " inarea = " + z + " timeOut " + z2).actionIcon(Integer.valueOf(R.drawable.icon_key_small)).timeOutInMillis(DateUtils.MILLIS_PER_MINUTE).pushId(Integer.valueOf(Integer.valueOf(beacon.getId3().toString()).intValue() + Integer.valueOf(beacon.getId3().toString()).intValue())).build();
    }

    private PendingIntent creaatePendingIntent(BeaconAction beaconAction, MyBeacon myBeacon, boolean z) {
        Integer id = (z ? beaconAction.getBeaconActionDescriptionIn() : beaconAction.getBeaconActionDescriptionOut()).getId();
        boolean z2 = true;
        if (myBeacon.getAutoAction().intValue() != 1) {
            z2 = false;
        }
        Boolean valueOf = Boolean.valueOf(z2);
        Intent intent = new Intent(this.context, LocationService.class);
        intent.setAction(ACTION_SEND);
        intent.putExtra(ARG_PUSH_ID, myBeacon.getMinor());
        intent.putExtra(ARG_ACTION_ID, id);
        intent.putExtra(ARG_AUTO_ACTION, valueOf);
        return PendingIntent.getService(this.context, id.intValue(), intent, 134217728);
    }

    private MyBeacon findBeaconFromEtelonList(Integer num, List<Point> list) {
        for (int i = 0; i < list.size(); i++) {
            RealmList<MyBeacon> beacons = list.get(i).getBeacons();
            if (beacons != null && !list.isEmpty()) {
                for (int i2 = 0; i2 < beacons.size(); i2++) {
                    if (beacons.get(i2).getMinor().equals(num)) {
                        return beacons.get(i2);
                    }
                }
                continue;
            }
        }
        return null;
    }

    private BeaconAction findBeaconAction(int i, List<Point> list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            RealmList<MyBeacon> beacons = list.get(i2).getBeacons();
            if (beacons != null && !list.isEmpty()) {
                for (int i3 = 0; i3 < beacons.size(); i3++) {
                    if (beacons.get(i3).getMinor().equals(Integer.valueOf(i))) {
                        return list.get(i2).getBeaconAction();
                    }
                }
                continue;
            }
        }
        return null;
    }

    public void stop() {
        BeaconManager beaconManager2 = this.beaconManager;
        if (beaconManager2 != null) {
            beaconManager2.removeAllMonitorNotifiers();
            this.beaconManager.removeAllRangeNotifiers();
            this.beaconManager.disableForegroundServiceScanning();
        }
    }
}
