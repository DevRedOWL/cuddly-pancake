package org.altbeacon.beacon.service;

import android.content.Context;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.altbeacon.beacon.BeaconManager;
import org.altbeacon.beacon.BeaconParser;
import org.altbeacon.beacon.Region;
import org.altbeacon.beacon.logging.LogManager;

public class ScanState implements Serializable {
    public static int MIN_SCAN_JOB_INTERVAL_MILLIS = 300000;
    private static final String STATUS_PRESERVATION_FILE_NAME = "android-beacon-library-scan-state";
    private static final String TAG = ScanState.class.getSimpleName();
    private static final String TEMP_STATUS_PRESERVATION_FILE_NAME = "android-beacon-library-scan-state-temp";
    private long mBackgroundBetweenScanPeriod;
    private boolean mBackgroundMode;
    private long mBackgroundScanPeriod;
    private Set<BeaconParser> mBeaconParsers = new HashSet();
    private transient Context mContext;
    private ExtraDataBeaconTracker mExtraBeaconDataTracker = new ExtraDataBeaconTracker();
    private long mForegroundBetweenScanPeriod;
    private long mForegroundScanPeriod;
    private long mLastScanStartTimeMillis = 0;
    private transient MonitoringStatus mMonitoringStatus;
    private Map<Region, RangeState> mRangedRegionState = new HashMap();

    public Boolean getBackgroundMode() {
        return Boolean.valueOf(this.mBackgroundMode);
    }

    public void setBackgroundMode(Boolean bool) {
        this.mBackgroundMode = bool.booleanValue();
    }

    public Long getBackgroundBetweenScanPeriod() {
        return Long.valueOf(this.mBackgroundBetweenScanPeriod);
    }

    public void setBackgroundBetweenScanPeriod(Long l) {
        this.mBackgroundBetweenScanPeriod = l.longValue();
    }

    public Long getBackgroundScanPeriod() {
        return Long.valueOf(this.mBackgroundScanPeriod);
    }

    public void setBackgroundScanPeriod(Long l) {
        this.mBackgroundScanPeriod = l.longValue();
    }

    public Long getForegroundBetweenScanPeriod() {
        return Long.valueOf(this.mForegroundBetweenScanPeriod);
    }

    public void setForegroundBetweenScanPeriod(Long l) {
        this.mForegroundBetweenScanPeriod = l.longValue();
    }

    public Long getForegroundScanPeriod() {
        return Long.valueOf(this.mForegroundScanPeriod);
    }

    public void setForegroundScanPeriod(Long l) {
        this.mForegroundScanPeriod = l.longValue();
    }

    public ScanState(Context context) {
        this.mContext = context;
    }

    public MonitoringStatus getMonitoringStatus() {
        return this.mMonitoringStatus;
    }

    public void setMonitoringStatus(MonitoringStatus monitoringStatus) {
        this.mMonitoringStatus = monitoringStatus;
    }

    public Map<Region, RangeState> getRangedRegionState() {
        return this.mRangedRegionState;
    }

    public void setRangedRegionState(Map<Region, RangeState> map) {
        this.mRangedRegionState = map;
    }

    public ExtraDataBeaconTracker getExtraBeaconDataTracker() {
        return this.mExtraBeaconDataTracker;
    }

    public void setExtraBeaconDataTracker(ExtraDataBeaconTracker extraDataBeaconTracker) {
        this.mExtraBeaconDataTracker = extraDataBeaconTracker;
    }

    public Set<BeaconParser> getBeaconParsers() {
        return this.mBeaconParsers;
    }

    public void setBeaconParsers(Set<BeaconParser> set) {
        this.mBeaconParsers = set;
    }

    public long getLastScanStartTimeMillis() {
        return this.mLastScanStartTimeMillis;
    }

    public void setLastScanStartTimeMillis(long j) {
        this.mLastScanStartTimeMillis = j;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:65|(0)|(0)|74|75) */
    /* JADX WARNING: Can't wrap try/catch for region: R(9:2|(5:3|4|5|6|(5:7|8|9|10|(2:12|13)))|14|15|(2:57|58)|59|(1:61)|62|63) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0025, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002a, code lost:
        r9 = r3;
        r3 = r1;
        r1 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002e, code lost:
        r10 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x007f, code lost:
        if (r4 != null) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0094, code lost:
        if (r4 != null) goto L_0x001d;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x001d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:74:0x00f8 */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x002e A[ExcHandler: all (th java.lang.Throwable), Splitter:B:7:0x0010] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x005e A[Catch:{ all -> 0x00e9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0068 A[Catch:{ all -> 0x00e9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x007a A[SYNTHETIC, Splitter:B:43:0x007a] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x008f A[SYNTHETIC, Splitter:B:52:0x008f] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00ec A[SYNTHETIC, Splitter:B:67:0x00ec] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00f5 A[SYNTHETIC, Splitter:B:72:0x00f5] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:49:0x0084=Splitter:B:49:0x0084, B:37:0x005a=Splitter:B:37:0x005a} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.altbeacon.beacon.service.ScanState restore(android.content.Context r10) {
        /*
            java.lang.Class<org.altbeacon.beacon.service.ScanState> r0 = org.altbeacon.beacon.service.ScanState.class
            monitor-enter(r0)
            r1 = 0
            r2 = 0
            java.lang.String r3 = "android-beacon-library-scan-state"
            java.io.FileInputStream r3 = r10.openFileInput(r3)     // Catch:{ FileNotFoundException -> 0x0082, IOException -> 0x0057, ClassNotFoundException -> 0x0055, ClassCastException -> 0x0053, all -> 0x004f }
            java.io.ObjectInputStream r4 = new java.io.ObjectInputStream     // Catch:{ FileNotFoundException -> 0x004b, IOException -> 0x0045, ClassNotFoundException -> 0x0043, ClassCastException -> 0x0041, all -> 0x003c }
            r4.<init>(r3)     // Catch:{ FileNotFoundException -> 0x004b, IOException -> 0x0045, ClassNotFoundException -> 0x0043, ClassCastException -> 0x0041, all -> 0x003c }
            java.lang.Object r5 = r4.readObject()     // Catch:{ FileNotFoundException -> 0x003a, IOException -> 0x0034, ClassNotFoundException -> 0x0032, ClassCastException -> 0x0030, all -> 0x002e }
            org.altbeacon.beacon.service.ScanState r5 = (org.altbeacon.beacon.service.ScanState) r5     // Catch:{ FileNotFoundException -> 0x003a, IOException -> 0x0034, ClassNotFoundException -> 0x0032, ClassCastException -> 0x0030, all -> 0x002e }
            r5.mContext = r10     // Catch:{ FileNotFoundException -> 0x004d, IOException -> 0x0029, ClassNotFoundException -> 0x0027, ClassCastException -> 0x0025, all -> 0x002e }
            if (r3 == 0) goto L_0x001d
            r3.close()     // Catch:{ IOException -> 0x001d }
        L_0x001d:
            r4.close()     // Catch:{ IOException -> 0x0022 }
            goto L_0x0097
        L_0x0022:
            goto L_0x0097
        L_0x0025:
            r1 = move-exception
            goto L_0x002a
        L_0x0027:
            r1 = move-exception
            goto L_0x002a
        L_0x0029:
            r1 = move-exception
        L_0x002a:
            r9 = r3
            r3 = r1
            r1 = r9
            goto L_0x005a
        L_0x002e:
            r10 = move-exception
            goto L_0x003e
        L_0x0030:
            r5 = move-exception
            goto L_0x0035
        L_0x0032:
            r5 = move-exception
            goto L_0x0035
        L_0x0034:
            r5 = move-exception
        L_0x0035:
            r9 = r5
            r5 = r1
            r1 = r3
            r3 = r9
            goto L_0x005a
        L_0x003a:
            r5 = r1
            goto L_0x004d
        L_0x003c:
            r10 = move-exception
            r4 = r1
        L_0x003e:
            r1 = r3
            goto L_0x00ea
        L_0x0041:
            r4 = move-exception
            goto L_0x0046
        L_0x0043:
            r4 = move-exception
            goto L_0x0046
        L_0x0045:
            r4 = move-exception
        L_0x0046:
            r5 = r1
            r1 = r3
            r3 = r4
            r4 = r5
            goto L_0x005a
        L_0x004b:
            r4 = r1
            r5 = r4
        L_0x004d:
            r1 = r3
            goto L_0x0084
        L_0x004f:
            r10 = move-exception
            r4 = r1
            goto L_0x00ea
        L_0x0053:
            r3 = move-exception
            goto L_0x0058
        L_0x0055:
            r3 = move-exception
            goto L_0x0058
        L_0x0057:
            r3 = move-exception
        L_0x0058:
            r4 = r1
            r5 = r4
        L_0x005a:
            boolean r6 = r3 instanceof java.io.InvalidClassException     // Catch:{ all -> 0x00e9 }
            if (r6 == 0) goto L_0x0068
            java.lang.String r3 = TAG     // Catch:{ all -> 0x00e9 }
            java.lang.String r6 = "Serialized ScanState has wrong class. Just ignoring saved state..."
            java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch:{ all -> 0x00e9 }
            org.altbeacon.beacon.logging.LogManager.m6834d(r3, r6, r7)     // Catch:{ all -> 0x00e9 }
            goto L_0x0078
        L_0x0068:
            java.lang.String r6 = TAG     // Catch:{ all -> 0x00e9 }
            java.lang.String r7 = "Deserialization exception"
            java.lang.Object[] r8 = new java.lang.Object[r2]     // Catch:{ all -> 0x00e9 }
            org.altbeacon.beacon.logging.LogManager.m6836e(r6, r7, r8)     // Catch:{ all -> 0x00e9 }
            java.lang.String r6 = TAG     // Catch:{ all -> 0x00e9 }
            java.lang.String r7 = "error: "
            android.util.Log.e(r6, r7, r3)     // Catch:{ all -> 0x00e9 }
        L_0x0078:
            if (r1 == 0) goto L_0x007f
            r1.close()     // Catch:{ IOException -> 0x007e }
            goto L_0x007f
        L_0x007e:
        L_0x007f:
            if (r4 == 0) goto L_0x0097
            goto L_0x001d
        L_0x0082:
            r4 = r1
            r5 = r4
        L_0x0084:
            java.lang.String r3 = TAG     // Catch:{ all -> 0x00e9 }
            java.lang.String r6 = "Serialized ScanState does not exist.  This may be normal on first run."
            java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch:{ all -> 0x00e9 }
            org.altbeacon.beacon.logging.LogManager.m6842w(r3, r6, r7)     // Catch:{ all -> 0x00e9 }
            if (r1 == 0) goto L_0x0094
            r1.close()     // Catch:{ IOException -> 0x0093 }
            goto L_0x0094
        L_0x0093:
        L_0x0094:
            if (r4 == 0) goto L_0x0097
            goto L_0x001d
        L_0x0097:
            if (r5 != 0) goto L_0x009e
            org.altbeacon.beacon.service.ScanState r5 = new org.altbeacon.beacon.service.ScanState     // Catch:{ all -> 0x00f0 }
            r5.<init>(r10)     // Catch:{ all -> 0x00f0 }
        L_0x009e:
            org.altbeacon.beacon.service.ExtraDataBeaconTracker r1 = r5.mExtraBeaconDataTracker     // Catch:{ all -> 0x00f0 }
            if (r1 != 0) goto L_0x00a9
            org.altbeacon.beacon.service.ExtraDataBeaconTracker r1 = new org.altbeacon.beacon.service.ExtraDataBeaconTracker     // Catch:{ all -> 0x00f0 }
            r1.<init>()     // Catch:{ all -> 0x00f0 }
            r5.mExtraBeaconDataTracker = r1     // Catch:{ all -> 0x00f0 }
        L_0x00a9:
            org.altbeacon.beacon.service.MonitoringStatus r10 = org.altbeacon.beacon.service.MonitoringStatus.getInstanceForApplication(r10)     // Catch:{ all -> 0x00f0 }
            r5.mMonitoringStatus = r10     // Catch:{ all -> 0x00f0 }
            java.lang.String r10 = TAG     // Catch:{ all -> 0x00f0 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f0 }
            r1.<init>()     // Catch:{ all -> 0x00f0 }
            java.lang.String r3 = "Scan state restore regions: monitored="
            r1.append(r3)     // Catch:{ all -> 0x00f0 }
            org.altbeacon.beacon.service.MonitoringStatus r3 = r5.getMonitoringStatus()     // Catch:{ all -> 0x00f0 }
            java.util.Set r3 = r3.regions()     // Catch:{ all -> 0x00f0 }
            int r3 = r3.size()     // Catch:{ all -> 0x00f0 }
            r1.append(r3)     // Catch:{ all -> 0x00f0 }
            java.lang.String r3 = " ranged="
            r1.append(r3)     // Catch:{ all -> 0x00f0 }
            java.util.Map r3 = r5.getRangedRegionState()     // Catch:{ all -> 0x00f0 }
            java.util.Set r3 = r3.keySet()     // Catch:{ all -> 0x00f0 }
            int r3 = r3.size()     // Catch:{ all -> 0x00f0 }
            r1.append(r3)     // Catch:{ all -> 0x00f0 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00f0 }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x00f0 }
            org.altbeacon.beacon.logging.LogManager.m6834d(r10, r1, r2)     // Catch:{ all -> 0x00f0 }
            monitor-exit(r0)     // Catch:{ all -> 0x00f0 }
            return r5
        L_0x00e9:
            r10 = move-exception
        L_0x00ea:
            if (r1 == 0) goto L_0x00f3
            r1.close()     // Catch:{ IOException -> 0x00f2 }
            goto L_0x00f3
        L_0x00f0:
            r10 = move-exception
            goto L_0x00f9
        L_0x00f2:
        L_0x00f3:
            if (r4 == 0) goto L_0x00f8
            r4.close()     // Catch:{ IOException -> 0x00f8 }
        L_0x00f8:
            throw r10     // Catch:{ all -> 0x00f0 }
        L_0x00f9:
            monitor-exit(r0)     // Catch:{ all -> 0x00f0 }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: org.altbeacon.beacon.service.ScanState.restore(android.content.Context):org.altbeacon.beacon.service.ScanState");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(11:2|(5:3|4|5|6|(3:7|8|(2:10|11)))|12|13|34|35|(1:37)|38|(1:40)|41|42) */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:44|(2:46|47)|(2:51|52)|53|54) */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x004e, code lost:
        if (r4 == null) goto L_0x0051;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x001a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x0051 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x00d7 */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0049 A[SYNTHETIC, Splitter:B:30:0x0049] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00cb A[SYNTHETIC, Splitter:B:46:0x00cb] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00d4 A[SYNTHETIC, Splitter:B:51:0x00d4] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:34:0x0051=Splitter:B:34:0x0051, B:53:0x00d7=Splitter:B:53:0x00d7} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void save() {
        /*
            r9 = this;
            java.lang.Class<org.altbeacon.beacon.service.ScanState> r0 = org.altbeacon.beacon.service.ScanState.class
            monitor-enter(r0)
            r1 = 0
            r2 = 0
            android.content.Context r3 = r9.mContext     // Catch:{ IOException -> 0x0035, all -> 0x0031 }
            java.lang.String r4 = "android-beacon-library-scan-state-temp"
            java.io.FileOutputStream r3 = r3.openFileOutput(r4, r2)     // Catch:{ IOException -> 0x0035, all -> 0x0031 }
            java.io.ObjectOutputStream r4 = new java.io.ObjectOutputStream     // Catch:{ IOException -> 0x002b, all -> 0x0026 }
            r4.<init>(r3)     // Catch:{ IOException -> 0x002b, all -> 0x0026 }
            r4.writeObject(r9)     // Catch:{ IOException -> 0x0021, all -> 0x001e }
            if (r3 == 0) goto L_0x001a
            r3.close()     // Catch:{ IOException -> 0x001a }
        L_0x001a:
            r4.close()     // Catch:{ IOException -> 0x0051 }
            goto L_0x0051
        L_0x001e:
            r1 = move-exception
            r2 = r1
            goto L_0x0028
        L_0x0021:
            r1 = move-exception
            r8 = r3
            r3 = r1
            r1 = r8
            goto L_0x0037
        L_0x0026:
            r2 = move-exception
            r4 = r1
        L_0x0028:
            r1 = r3
            goto L_0x00c9
        L_0x002b:
            r4 = move-exception
            r8 = r4
            r4 = r1
            r1 = r3
            r3 = r8
            goto L_0x0037
        L_0x0031:
            r2 = move-exception
            r4 = r1
            goto L_0x00c9
        L_0x0035:
            r3 = move-exception
            r4 = r1
        L_0x0037:
            java.lang.String r5 = TAG     // Catch:{ all -> 0x00c8 }
            java.lang.String r6 = "Error while saving scan status to file: "
            r7 = 1
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ all -> 0x00c8 }
            java.lang.String r3 = r3.getMessage()     // Catch:{ all -> 0x00c8 }
            r7[r2] = r3     // Catch:{ all -> 0x00c8 }
            org.altbeacon.beacon.logging.LogManager.m6836e(r5, r6, r7)     // Catch:{ all -> 0x00c8 }
            if (r1 == 0) goto L_0x004e
            r1.close()     // Catch:{ IOException -> 0x004d }
            goto L_0x004e
        L_0x004d:
        L_0x004e:
            if (r4 == 0) goto L_0x0051
            goto L_0x001a
        L_0x0051:
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x00cf }
            android.content.Context r3 = r9.mContext     // Catch:{ all -> 0x00cf }
            java.io.File r3 = r3.getFilesDir()     // Catch:{ all -> 0x00cf }
            java.lang.String r4 = "android-beacon-library-scan-state"
            r1.<init>(r3, r4)     // Catch:{ all -> 0x00cf }
            java.io.File r3 = new java.io.File     // Catch:{ all -> 0x00cf }
            android.content.Context r4 = r9.mContext     // Catch:{ all -> 0x00cf }
            java.io.File r4 = r4.getFilesDir()     // Catch:{ all -> 0x00cf }
            java.lang.String r5 = "android-beacon-library-scan-state-temp"
            r3.<init>(r4, r5)     // Catch:{ all -> 0x00cf }
            java.lang.String r4 = TAG     // Catch:{ all -> 0x00cf }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00cf }
            r5.<init>()     // Catch:{ all -> 0x00cf }
            java.lang.String r6 = "Temp file is "
            r5.append(r6)     // Catch:{ all -> 0x00cf }
            java.lang.String r6 = r3.getAbsolutePath()     // Catch:{ all -> 0x00cf }
            r5.append(r6)     // Catch:{ all -> 0x00cf }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x00cf }
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch:{ all -> 0x00cf }
            org.altbeacon.beacon.logging.LogManager.m6834d(r4, r5, r6)     // Catch:{ all -> 0x00cf }
            java.lang.String r4 = TAG     // Catch:{ all -> 0x00cf }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00cf }
            r5.<init>()     // Catch:{ all -> 0x00cf }
            java.lang.String r6 = "Perm file is "
            r5.append(r6)     // Catch:{ all -> 0x00cf }
            java.lang.String r6 = r1.getAbsolutePath()     // Catch:{ all -> 0x00cf }
            r5.append(r6)     // Catch:{ all -> 0x00cf }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x00cf }
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch:{ all -> 0x00cf }
            org.altbeacon.beacon.logging.LogManager.m6834d(r4, r5, r6)     // Catch:{ all -> 0x00cf }
            boolean r4 = r1.delete()     // Catch:{ all -> 0x00cf }
            if (r4 != 0) goto L_0x00b2
            java.lang.String r4 = TAG     // Catch:{ all -> 0x00cf }
            java.lang.String r5 = "Error while saving scan status to file: Cannot delete existing file."
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch:{ all -> 0x00cf }
            org.altbeacon.beacon.logging.LogManager.m6836e(r4, r5, r6)     // Catch:{ all -> 0x00cf }
        L_0x00b2:
            boolean r1 = r3.renameTo(r1)     // Catch:{ all -> 0x00cf }
            if (r1 != 0) goto L_0x00c1
            java.lang.String r1 = TAG     // Catch:{ all -> 0x00cf }
            java.lang.String r3 = "Error while saving scan status to file: Cannot rename temp file."
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x00cf }
            org.altbeacon.beacon.logging.LogManager.m6836e(r1, r3, r2)     // Catch:{ all -> 0x00cf }
        L_0x00c1:
            org.altbeacon.beacon.service.MonitoringStatus r1 = r9.mMonitoringStatus     // Catch:{ all -> 0x00cf }
            r1.saveMonitoringStatusIfOn()     // Catch:{ all -> 0x00cf }
            monitor-exit(r0)     // Catch:{ all -> 0x00cf }
            return
        L_0x00c8:
            r2 = move-exception
        L_0x00c9:
            if (r1 == 0) goto L_0x00d2
            r1.close()     // Catch:{ IOException -> 0x00d1 }
            goto L_0x00d2
        L_0x00cf:
            r1 = move-exception
            goto L_0x00d8
        L_0x00d1:
        L_0x00d2:
            if (r4 == 0) goto L_0x00d7
            r4.close()     // Catch:{ IOException -> 0x00d7 }
        L_0x00d7:
            throw r2     // Catch:{ all -> 0x00cf }
        L_0x00d8:
            monitor-exit(r0)     // Catch:{ all -> 0x00cf }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.altbeacon.beacon.service.ScanState.save():void");
    }

    public int getScanJobIntervalMillis() {
        long j;
        long j2;
        if (getBackgroundMode().booleanValue()) {
            j2 = getBackgroundScanPeriod().longValue();
            j = getBackgroundBetweenScanPeriod().longValue();
        } else {
            j2 = getForegroundScanPeriod().longValue();
            j = getForegroundBetweenScanPeriod().longValue();
        }
        long j3 = j2 + j;
        int i = MIN_SCAN_JOB_INTERVAL_MILLIS;
        return j3 > ((long) i) ? (int) j3 : i;
    }

    public int getScanJobRuntimeMillis() {
        long j;
        String str = TAG;
        LogManager.m6834d(str, "ScanState says background mode for ScanJob is " + getBackgroundMode(), new Object[0]);
        if (getBackgroundMode().booleanValue()) {
            j = getBackgroundScanPeriod().longValue();
        } else {
            j = getForegroundScanPeriod().longValue();
        }
        if (!getBackgroundMode().booleanValue()) {
            int i = MIN_SCAN_JOB_INTERVAL_MILLIS;
            if (j < ((long) i)) {
                return i;
            }
        }
        return (int) j;
    }

    public void applyChanges(BeaconManager beaconManager) {
        this.mBeaconParsers = new HashSet(beaconManager.getBeaconParsers());
        this.mForegroundScanPeriod = beaconManager.getForegroundScanPeriod();
        this.mForegroundBetweenScanPeriod = beaconManager.getForegroundBetweenScanPeriod();
        this.mBackgroundScanPeriod = beaconManager.getBackgroundScanPeriod();
        this.mBackgroundBetweenScanPeriod = beaconManager.getBackgroundBetweenScanPeriod();
        this.mBackgroundMode = beaconManager.getBackgroundMode();
        ArrayList arrayList = new ArrayList(this.mMonitoringStatus.regions());
        ArrayList arrayList2 = new ArrayList(this.mRangedRegionState.keySet());
        ArrayList arrayList3 = new ArrayList(beaconManager.getMonitoredRegions());
        ArrayList arrayList4 = new ArrayList(beaconManager.getRangedRegions());
        String str = TAG;
        LogManager.m6834d(str, "ranged regions: old=" + arrayList2.size() + " new=" + arrayList4.size(), new Object[0]);
        String str2 = TAG;
        LogManager.m6834d(str2, "monitored regions: old=" + arrayList.size() + " new=" + arrayList3.size(), new Object[0]);
        Iterator it = arrayList4.iterator();
        while (it.hasNext()) {
            Region region = (Region) it.next();
            if (!arrayList2.contains(region)) {
                String str3 = TAG;
                LogManager.m6834d(str3, "Starting ranging region: " + region, new Object[0]);
                this.mRangedRegionState.put(region, new RangeState(new Callback(this.mContext.getPackageName())));
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Region region2 = (Region) it2.next();
            if (!arrayList4.contains(region2)) {
                String str4 = TAG;
                LogManager.m6834d(str4, "Stopping ranging region: " + region2, new Object[0]);
                this.mRangedRegionState.remove(region2);
            }
        }
        String str5 = TAG;
        LogManager.m6834d(str5, "Updated state with " + arrayList4.size() + " ranging regions and " + arrayList3.size() + " monitoring regions.", new Object[0]);
        save();
    }
}
