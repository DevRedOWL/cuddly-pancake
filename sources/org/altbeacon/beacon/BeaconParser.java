package org.altbeacon.beacon;

import android.bluetooth.BluetoothDevice;
import android.util.Log;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.altbeacon.beacon.logging.LogManager;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.MapPoint;

public class BeaconParser implements Serializable {
    public static final String ALTBEACON_LAYOUT = "m:2-3=beac,i:4-19,i:20-21,i:22-23,p:24-24,d:25-25";
    private static final Pattern D_PATTERN = Pattern.compile("d\\:(\\d+)\\-(\\d+)([bl]*)?");
    public static final String EDDYSTONE_TLM_LAYOUT = "x,s:0-1=feaa,m:2-2=20,d:3-3,d:4-5,d:6-7,d:8-11,d:12-15";
    public static final String EDDYSTONE_UID_LAYOUT = "s:0-1=feaa,m:2-2=00,p:3-3:-41,i:4-13,i:14-19";
    public static final String EDDYSTONE_URL_LAYOUT = "s:0-1=feaa,m:2-2=10,p:3-3:-41,i:4-21v";
    private static final char[] HEX_ARRAY = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private static final Pattern I_PATTERN = Pattern.compile("i\\:(\\d+)\\-(\\d+)([blv]*)?");
    private static final String LITTLE_ENDIAN_SUFFIX = "l";
    private static final Pattern M_PATTERN = Pattern.compile("m\\:(\\d+)-(\\d+)\\=([0-9A-Fa-f]+)");
    private static final Pattern P_PATTERN = Pattern.compile("p\\:(\\d+)?\\-(\\d+)?\\:?([\\-\\d]+)?");
    private static final Pattern S_PATTERN = Pattern.compile("s\\:(\\d+)-(\\d+)\\=([0-9A-Fa-f]+)");
    private static final String TAG = "BeaconParser";
    public static final String URI_BEACON_LAYOUT = "s:0-1=fed8,m:2-2=00,p:3-3:-41,i:4-21v";
    private static final String VARIABLE_LENGTH_SUFFIX = "v";
    private static final Pattern X_PATTERN = Pattern.compile(MapPoint.JsonFields.f6911x);
    protected List<BeaconParser> extraParsers = new ArrayList();
    protected Boolean mAllowPduOverflow = true;
    protected String mBeaconLayout;
    protected Integer mDBmCorrection;
    protected final List<Integer> mDataEndOffsets = new ArrayList();
    protected final List<Boolean> mDataLittleEndianFlags = new ArrayList();
    protected final List<Integer> mDataStartOffsets = new ArrayList();
    protected Boolean mExtraFrame;
    protected int[] mHardwareAssistManufacturers = {76};
    protected String mIdentifier;
    protected final List<Integer> mIdentifierEndOffsets = new ArrayList();
    protected final List<Boolean> mIdentifierLittleEndianFlags = new ArrayList();
    protected final List<Integer> mIdentifierStartOffsets = new ArrayList();
    protected final List<Boolean> mIdentifierVariableLengthFlags = new ArrayList();
    protected Integer mLayoutSize;
    private Long mMatchingBeaconTypeCode;
    protected Integer mMatchingBeaconTypeCodeEndOffset;
    protected Integer mMatchingBeaconTypeCodeStartOffset;
    protected Integer mPowerEndOffset;
    protected Integer mPowerStartOffset;
    protected Long mServiceUuid;
    protected Integer mServiceUuidEndOffset;
    protected Integer mServiceUuidStartOffset;

    public BeaconParser() {
    }

    public BeaconParser(String str) {
        this.mIdentifier = str;
    }

    public BeaconParser setBeaconLayout(String str) {
        String str2 = str;
        this.mBeaconLayout = str2;
        Log.d(TAG, "Parsing beacon layout: " + str2);
        String[] split = str2.split(",");
        this.mExtraFrame = false;
        int length = split.length;
        int i = 0;
        while (i < length) {
            String str3 = split[i];
            Matcher matcher = I_PATTERN.matcher(str3);
            boolean z = false;
            while (matcher.find()) {
                try {
                    int parseInt = Integer.parseInt(matcher.group(1));
                    int parseInt2 = Integer.parseInt(matcher.group(2));
                    this.mIdentifierLittleEndianFlags.add(Boolean.valueOf(matcher.group(3).contains(LITTLE_ENDIAN_SUFFIX)));
                    this.mIdentifierVariableLengthFlags.add(Boolean.valueOf(matcher.group(3).contains(VARIABLE_LENGTH_SUFFIX)));
                    this.mIdentifierStartOffsets.add(Integer.valueOf(parseInt));
                    this.mIdentifierEndOffsets.add(Integer.valueOf(parseInt2));
                    z = true;
                } catch (NumberFormatException unused) {
                    throw new BeaconLayoutException("Cannot parse integer byte offset in term: " + str3);
                }
            }
            Matcher matcher2 = D_PATTERN.matcher(str3);
            while (matcher2.find()) {
                try {
                    int parseInt3 = Integer.parseInt(matcher2.group(1));
                    int parseInt4 = Integer.parseInt(matcher2.group(2));
                    this.mDataLittleEndianFlags.add(Boolean.valueOf(matcher2.group(3).contains(LITTLE_ENDIAN_SUFFIX)));
                    this.mDataStartOffsets.add(Integer.valueOf(parseInt3));
                    this.mDataEndOffsets.add(Integer.valueOf(parseInt4));
                    z = true;
                } catch (NumberFormatException unused2) {
                    throw new BeaconLayoutException("Cannot parse integer byte offset in term: " + str3);
                }
            }
            Matcher matcher3 = P_PATTERN.matcher(str3);
            while (matcher3.find()) {
                try {
                    if (!(matcher3.group(1) == null || matcher3.group(2) == null)) {
                        int parseInt5 = Integer.parseInt(matcher3.group(1));
                        int parseInt6 = Integer.parseInt(matcher3.group(2));
                        this.mPowerStartOffset = Integer.valueOf(parseInt5);
                        this.mPowerEndOffset = Integer.valueOf(parseInt6);
                    }
                    this.mDBmCorrection = Integer.valueOf(matcher3.group(3) != null ? Integer.parseInt(matcher3.group(3)) : 0);
                    z = true;
                } catch (NumberFormatException unused3) {
                    throw new BeaconLayoutException("Cannot parse integer power byte offset (" + "none" + ") in term: " + str3);
                }
            }
            Matcher matcher4 = M_PATTERN.matcher(str3);
            while (matcher4.find()) {
                try {
                    int parseInt7 = Integer.parseInt(matcher4.group(1));
                    int parseInt8 = Integer.parseInt(matcher4.group(2));
                    this.mMatchingBeaconTypeCodeStartOffset = Integer.valueOf(parseInt7);
                    this.mMatchingBeaconTypeCodeEndOffset = Integer.valueOf(parseInt8);
                    String group = matcher4.group(3);
                    try {
                        this.mMatchingBeaconTypeCode = Long.decode("0x" + group);
                        z = true;
                    } catch (NumberFormatException unused4) {
                        throw new BeaconLayoutException("Cannot parse beacon type code: " + group + " in term: " + str3);
                    }
                } catch (NumberFormatException unused5) {
                    throw new BeaconLayoutException("Cannot parse integer byte offset in term: " + str3);
                }
            }
            Matcher matcher5 = S_PATTERN.matcher(str3);
            while (matcher5.find()) {
                try {
                    int parseInt9 = Integer.parseInt(matcher5.group(1));
                    int parseInt10 = Integer.parseInt(matcher5.group(2));
                    this.mServiceUuidStartOffset = Integer.valueOf(parseInt9);
                    this.mServiceUuidEndOffset = Integer.valueOf(parseInt10);
                    String group2 = matcher5.group(3);
                    try {
                        this.mServiceUuid = Long.decode("0x" + group2);
                        z = true;
                    } catch (NumberFormatException unused6) {
                        throw new BeaconLayoutException("Cannot parse serviceUuid: " + group2 + " in term: " + str3);
                    }
                } catch (NumberFormatException unused7) {
                    throw new BeaconLayoutException("Cannot parse integer byte offset in term: " + str3);
                }
            }
            Matcher matcher6 = X_PATTERN.matcher(str3);
            while (matcher6.find()) {
                this.mExtraFrame = true;
                z = true;
            }
            if (z) {
                i++;
            } else {
                LogManager.m6834d(TAG, "cannot parse term %s", str3);
                throw new BeaconLayoutException("Cannot parse beacon layout term: " + str3);
            }
        }
        this.mLayoutSize = Integer.valueOf(calculateLayoutSize());
        return this;
    }

    public boolean addExtraDataParser(BeaconParser beaconParser) {
        return beaconParser != null && beaconParser.mExtraFrame.booleanValue() && this.extraParsers.add(beaconParser);
    }

    public List<BeaconParser> getExtraDataParsers() {
        return new ArrayList(this.extraParsers);
    }

    public String getIdentifier() {
        return this.mIdentifier;
    }

    public int[] getHardwareAssistManufacturers() {
        return this.mHardwareAssistManufacturers;
    }

    public void setHardwareAssistManufacturerCodes(int[] iArr) {
        this.mHardwareAssistManufacturers = iArr;
    }

    public void setAllowPduOverflow(Boolean bool) {
        this.mAllowPduOverflow = bool;
    }

    public Long getMatchingBeaconTypeCode() {
        Long l = this.mMatchingBeaconTypeCode;
        if (l == null) {
            return -1L;
        }
        return l;
    }

    public int getMatchingBeaconTypeCodeStartOffset() {
        Integer num = this.mMatchingBeaconTypeCodeStartOffset;
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    public int getMatchingBeaconTypeCodeEndOffset() {
        Integer num = this.mMatchingBeaconTypeCodeEndOffset;
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    public Long getServiceUuid() {
        return this.mServiceUuid;
    }

    public int getMServiceUuidStartOffset() {
        return this.mServiceUuidStartOffset.intValue();
    }

    public int getServiceUuidEndOffset() {
        return this.mServiceUuidEndOffset.intValue();
    }

    public Beacon fromScanData(byte[] bArr, int i, BluetoothDevice bluetoothDevice, long j) {
        return fromScanData(bArr, i, bluetoothDevice, j, new Beacon());
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x014c, code lost:
        if (r6.getType() == 22) goto L_0x0165;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0163, code lost:
        if (byteArraysMatch(r5, r0.mMatchingBeaconTypeCodeStartOffset.intValue() + r10, r14) != false) goto L_0x0165;
     */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x045c  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x045e  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0459 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01e1  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x020d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.altbeacon.beacon.Beacon fromScanData(byte[] r28, int r29, android.bluetooth.BluetoothDevice r30, long r31, org.altbeacon.beacon.Beacon r33) {
        /*
            r27 = this;
            r0 = r27
            r1 = r31
            r3 = r33
            org.altbeacon.bluetooth.BleAdvertisement r4 = new org.altbeacon.bluetooth.BleAdvertisement
            r5 = r28
            r4.<init>(r5)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.List r4 = r4.getPdus()
            java.util.Iterator r4 = r4.iterator()
        L_0x0024:
            boolean r9 = r4.hasNext()
            r12 = 22
            r14 = -1
            java.lang.String r15 = "BeaconParser"
            r10 = 1
            r13 = 0
            if (r9 == 0) goto L_0x0094
            java.lang.Object r9 = r4.next()
            org.altbeacon.bluetooth.Pdu r9 = (org.altbeacon.bluetooth.Pdu) r9
            byte r11 = r9.getType()
            if (r11 == r12) goto L_0x005c
            byte r11 = r9.getType()
            if (r11 != r14) goto L_0x0044
            goto L_0x005c
        L_0x0044:
            boolean r11 = org.altbeacon.beacon.logging.LogManager.isVerboseLoggingEnabled()
            if (r11 == 0) goto L_0x0024
            java.lang.Object[] r10 = new java.lang.Object[r10]
            byte r9 = r9.getType()
            java.lang.Byte r9 = java.lang.Byte.valueOf(r9)
            r10[r13] = r9
            java.lang.String r9 = "Ignoring pdu type %02X"
            org.altbeacon.beacon.logging.LogManager.m6834d(r15, r9, r10)
            goto L_0x0024
        L_0x005c:
            r6.add(r9)
            boolean r11 = org.altbeacon.beacon.logging.LogManager.isVerboseLoggingEnabled()
            if (r11 == 0) goto L_0x0024
            r11 = 4
            java.lang.Object[] r11 = new java.lang.Object[r11]
            byte r12 = r9.getType()
            java.lang.Byte r12 = java.lang.Byte.valueOf(r12)
            r11[r13] = r12
            java.lang.String r12 = bytesToHex(r28)
            r11[r10] = r12
            int r10 = r9.getStartIndex()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r12 = 2
            r11[r12] = r10
            int r9 = r9.getEndIndex()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r10 = 3
            r11[r10] = r9
            java.lang.String r9 = "Processing pdu type %02X: %s with startIndex: %d, endIndex: %d"
            org.altbeacon.beacon.logging.LogManager.m6834d(r15, r9, r11)
            goto L_0x0024
        L_0x0094:
            int r4 = r6.size()
            if (r4 != 0) goto L_0x00ab
            boolean r4 = org.altbeacon.beacon.logging.LogManager.isVerboseLoggingEnabled()
            if (r4 == 0) goto L_0x00a7
            java.lang.Object[] r4 = new java.lang.Object[r13]
            java.lang.String r6 = "No PDUs to process in this packet."
            org.altbeacon.beacon.logging.LogManager.m6834d(r15, r6, r4)
        L_0x00a7:
            r4 = 0
            r10 = 0
            goto L_0x0470
        L_0x00ab:
            java.util.Iterator r4 = r6.iterator()
            r6 = 0
            r11 = 0
            r19 = 0
        L_0x00b3:
            boolean r20 = r4.hasNext()
            if (r20 == 0) goto L_0x046a
            java.lang.Object r6 = r4.next()
            org.altbeacon.bluetooth.Pdu r6 = (org.altbeacon.bluetooth.Pdu) r6
            byte[] r14 = new byte[r13]
            java.lang.Integer r9 = r0.mMatchingBeaconTypeCodeEndOffset
            if (r9 == 0) goto L_0x00e7
            java.lang.Integer r9 = r0.mMatchingBeaconTypeCodeStartOffset
            int r9 = r9.intValue()
            if (r9 < 0) goto L_0x00e7
            java.lang.Long r9 = r27.getMatchingBeaconTypeCode()
            long r12 = r9.longValue()
            java.lang.Integer r9 = r0.mMatchingBeaconTypeCodeEndOffset
            int r9 = r9.intValue()
            java.lang.Integer r14 = r0.mMatchingBeaconTypeCodeStartOffset
            int r14 = r14.intValue()
            int r9 = r9 - r14
            int r9 = r9 + r10
            byte[] r14 = longToByteArray(r12, r9)
        L_0x00e7:
            java.lang.Long r9 = r27.getServiceUuid()
            if (r9 == 0) goto L_0x010a
            java.lang.Long r9 = r27.getServiceUuid()
            long r12 = r9.longValue()
            java.lang.Integer r9 = r0.mServiceUuidEndOffset
            int r9 = r9.intValue()
            java.lang.Integer r10 = r0.mServiceUuidStartOffset
            int r10 = r10.intValue()
            int r9 = r9 - r10
            r10 = 1
            int r9 = r9 + r10
            r10 = 0
            byte[] r9 = longToByteArray(r12, r9, r10)
            goto L_0x010b
        L_0x010a:
            r9 = 0
        L_0x010b:
            int r10 = r6.getStartIndex()
            java.lang.Long r12 = r27.getServiceUuid()
            if (r12 == 0) goto L_0x0152
            java.lang.Long r12 = r27.getServiceUuid()
            long r12 = r12.longValue()
            r24 = -1
            int r26 = (r12 > r24 ? 1 : (r12 == r24 ? 0 : -1))
            if (r26 != 0) goto L_0x0124
            goto L_0x0152
        L_0x0124:
            java.lang.Integer r12 = r0.mServiceUuidStartOffset
            int r12 = r12.intValue()
            int r12 = r12 + r10
            boolean r12 = r0.byteArraysMatch(r5, r12, r9)
            if (r12 == 0) goto L_0x014f
            java.lang.Integer r12 = r0.mMatchingBeaconTypeCodeEndOffset
            if (r12 == 0) goto L_0x0146
            java.lang.Integer r12 = r0.mMatchingBeaconTypeCodeStartOffset
            int r12 = r12.intValue()
            int r12 = r12 + r10
            boolean r12 = r0.byteArraysMatch(r5, r12, r14)
            if (r12 == 0) goto L_0x014f
            r12 = 1
            r13 = 22
            goto L_0x0168
        L_0x0146:
            byte r12 = r6.getType()
            r13 = 22
            if (r12 != r13) goto L_0x0167
            goto L_0x0165
        L_0x014f:
            r13 = 22
            goto L_0x0167
        L_0x0152:
            r13 = 22
            java.lang.Integer r12 = r0.mMatchingBeaconTypeCodeEndOffset
            if (r12 == 0) goto L_0x0167
            java.lang.Integer r12 = r0.mMatchingBeaconTypeCodeStartOffset
            int r12 = r12.intValue()
            int r12 = r12 + r10
            boolean r12 = r0.byteArraysMatch(r5, r12, r14)
            if (r12 == 0) goto L_0x0167
        L_0x0165:
            r12 = 1
            goto L_0x0168
        L_0x0167:
            r12 = 0
        L_0x0168:
            if (r12 != 0) goto L_0x01e1
            java.lang.Long r22 = r27.getServiceUuid()
            if (r22 != 0) goto L_0x018d
            boolean r9 = org.altbeacon.beacon.logging.LogManager.isVerboseLoggingEnabled()
            if (r9 == 0) goto L_0x01d9
            r9 = 2
            java.lang.Object[] r13 = new java.lang.Object[r9]
            java.lang.String r9 = r0.byteArrayToString(r14)
            r14 = 0
            r13[r14] = r9
            java.lang.String r9 = bytesToHex(r5)
            r14 = 1
            r13[r14] = r9
            java.lang.String r9 = "This is not a matching Beacon advertisement. (Was expecting %s.  The bytes I see are: %s"
            org.altbeacon.beacon.logging.LogManager.m6834d(r15, r9, r13)
            goto L_0x01d9
        L_0x018d:
            boolean r13 = org.altbeacon.beacon.logging.LogManager.isVerboseLoggingEnabled()
            if (r13 == 0) goto L_0x01d9
            java.lang.Integer r13 = r0.mMatchingBeaconTypeCodeStartOffset
            if (r13 == 0) goto L_0x019e
            int r13 = r13.intValue()
            r24 = r4
            goto L_0x01a1
        L_0x019e:
            r24 = r4
            r13 = 0
        L_0x01a1:
            r4 = 5
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r9 = r0.byteArrayToString(r9)
            r21 = 0
            r4[r21] = r9
            java.lang.Integer r9 = r0.mServiceUuidStartOffset
            int r9 = r9.intValue()
            int r9 = r9 + r10
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r23 = 1
            r4[r23] = r9
            java.lang.String r9 = r0.byteArrayToString(r14)
            r17 = 2
            r4[r17] = r9
            int r13 = r13 + r10
            java.lang.Integer r9 = java.lang.Integer.valueOf(r13)
            r13 = 3
            r4[r13] = r9
            java.lang.String r9 = bytesToHex(r5)
            r16 = 4
            r4[r16] = r9
            java.lang.String r9 = "This is not a matching Beacon advertisement. Was expecting %s at offset %d and %s at offset %d.  The bytes I see are: %s"
            org.altbeacon.beacon.logging.LogManager.m6834d(r15, r9, r4)
            goto L_0x020b
        L_0x01d9:
            r24 = r4
            r13 = 3
            r16 = 4
            r17 = 2
            goto L_0x020b
        L_0x01e1:
            r24 = r4
            r13 = 3
            r16 = 4
            r17 = 2
            boolean r4 = org.altbeacon.beacon.logging.LogManager.isVerboseLoggingEnabled()
            if (r4 == 0) goto L_0x020b
            r4 = 1
            java.lang.Object[] r9 = new java.lang.Object[r4]
            java.lang.String r14 = r0.byteArrayToString(r14)
            r18 = 0
            r9[r18] = r14
            java.lang.String r14 = "This is a recognized beacon advertisement -- %s seen"
            org.altbeacon.beacon.logging.LogManager.m6834d(r15, r14, r9)
            java.lang.Object[] r9 = new java.lang.Object[r4]
            java.lang.String r4 = bytesToHex(r5)
            r9[r18] = r4
            java.lang.String r4 = "Bytes are: %s"
            org.altbeacon.beacon.logging.LogManager.m6834d(r15, r4, r9)
        L_0x020b:
            if (r12 == 0) goto L_0x045e
            int r4 = r5.length
            java.lang.Integer r9 = r0.mLayoutSize
            int r9 = r9.intValue()
            int r9 = r9 + r10
            if (r4 > r9) goto L_0x0258
            java.lang.Boolean r4 = r0.mAllowPduOverflow
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x0258
            boolean r4 = org.altbeacon.beacon.logging.LogManager.isVerboseLoggingEnabled()
            if (r4 == 0) goto L_0x024c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r9 = "Expanding buffer because it is too short to parse: "
            r4.append(r9)
            int r9 = r5.length
            r4.append(r9)
            java.lang.String r9 = ", needed: "
            r4.append(r9)
            java.lang.Integer r9 = r0.mLayoutSize
            int r9 = r9.intValue()
            int r9 = r9 + r10
            r4.append(r9)
            java.lang.String r4 = r4.toString()
            r9 = 0
            java.lang.Object[] r12 = new java.lang.Object[r9]
            org.altbeacon.beacon.logging.LogManager.m6834d(r15, r4, r12)
        L_0x024c:
            java.lang.Integer r4 = r0.mLayoutSize
            int r4 = r4.intValue()
            int r4 = r4 + r10
            byte[] r4 = r0.ensureMaxSize(r5, r4)
            goto L_0x0259
        L_0x0258:
            r4 = r5
        L_0x0259:
            r5 = 0
        L_0x025a:
            java.util.List<java.lang.Integer> r9 = r0.mIdentifierEndOffsets
            int r9 = r9.size()
            java.lang.String r12 = " because PDU is too short.  endIndex: "
            java.lang.String r14 = " PDU endIndex: "
            if (r5 >= r9) goto L_0x034c
            java.util.List<java.lang.Integer> r9 = r0.mIdentifierEndOffsets
            java.lang.Object r9 = r9.get(r5)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            int r9 = r9 + r10
            int r13 = r6.getEndIndex()
            if (r9 <= r13) goto L_0x02de
            java.util.List<java.lang.Boolean> r13 = r0.mIdentifierVariableLengthFlags
            java.lang.Object r13 = r13.get(r5)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto L_0x02de
            boolean r12 = org.altbeacon.beacon.logging.LogManager.isVerboseLoggingEnabled()
            if (r12 == 0) goto L_0x02a9
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "Need to truncate identifier by "
            r12.append(r13)
            int r13 = r6.getEndIndex()
            int r9 = r9 - r13
            r12.append(r9)
            java.lang.String r9 = r12.toString()
            r12 = 0
            java.lang.Object[] r13 = new java.lang.Object[r12]
            org.altbeacon.beacon.logging.LogManager.m6834d(r15, r9, r13)
        L_0x02a9:
            java.util.List<java.lang.Integer> r9 = r0.mIdentifierStartOffsets
            java.lang.Object r9 = r9.get(r5)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            int r9 = r9 + r10
            int r12 = r6.getEndIndex()
            r13 = 1
            int r12 = r12 + r13
            if (r12 > r9) goto L_0x02c8
            r13 = 0
            java.lang.Object[] r1 = new java.lang.Object[r13]
            java.lang.String r2 = "PDU is too short for identifer.  Packet is malformed"
            org.altbeacon.beacon.logging.LogManager.m6834d(r15, r2, r1)
            r1 = 0
            return r1
        L_0x02c8:
            java.util.List<java.lang.Boolean> r13 = r0.mIdentifierLittleEndianFlags
            java.lang.Object r13 = r13.get(r5)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            org.altbeacon.beacon.Identifier r9 = org.altbeacon.beacon.Identifier.fromBytes(r4, r9, r12, r13)
            r7.add(r9)
            r18 = r11
            goto L_0x0345
        L_0x02de:
            int r13 = r6.getEndIndex()
            if (r9 <= r13) goto L_0x0321
            java.lang.Boolean r13 = r0.mAllowPduOverflow
            boolean r13 = r13.booleanValue()
            if (r13 != 0) goto L_0x0321
            boolean r13 = org.altbeacon.beacon.logging.LogManager.isVerboseLoggingEnabled()
            if (r13 == 0) goto L_0x031c
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r18 = r11
            java.lang.String r11 = "Cannot parse identifier "
            r13.append(r11)
            r13.append(r5)
            r13.append(r12)
            r13.append(r9)
            r13.append(r14)
            int r9 = r6.getEndIndex()
            r13.append(r9)
            java.lang.String r9 = r13.toString()
            r11 = 0
            java.lang.Object[] r12 = new java.lang.Object[r11]
            org.altbeacon.beacon.logging.LogManager.m6834d(r15, r9, r12)
            goto L_0x031e
        L_0x031c:
            r18 = r11
        L_0x031e:
            r19 = 1
            goto L_0x0345
        L_0x0321:
            r18 = r11
            java.util.List<java.lang.Integer> r11 = r0.mIdentifierStartOffsets
            java.lang.Object r11 = r11.get(r5)
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            int r11 = r11 + r10
            int r9 = r9 + 1
            java.util.List<java.lang.Boolean> r12 = r0.mIdentifierLittleEndianFlags
            java.lang.Object r12 = r12.get(r5)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            org.altbeacon.beacon.Identifier r9 = org.altbeacon.beacon.Identifier.fromBytes(r4, r11, r9, r12)
            r7.add(r9)
        L_0x0345:
            int r5 = r5 + 1
            r11 = r18
            r13 = 3
            goto L_0x025a
        L_0x034c:
            r18 = r11
            r5 = 0
        L_0x034f:
            java.util.List<java.lang.Integer> r9 = r0.mDataEndOffsets
            int r9 = r9.size()
            if (r5 >= r9) goto L_0x03da
            java.util.List<java.lang.Integer> r9 = r0.mDataEndOffsets
            java.lang.Object r9 = r9.get(r5)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            int r9 = r9 + r10
            int r11 = r6.getEndIndex()
            if (r9 <= r11) goto L_0x03b0
            java.lang.Boolean r11 = r0.mAllowPduOverflow
            boolean r11 = r11.booleanValue()
            if (r11 != 0) goto L_0x03b0
            boolean r11 = org.altbeacon.beacon.logging.LogManager.isVerboseLoggingEnabled()
            if (r11 == 0) goto L_0x03a4
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r13 = "Cannot parse data field "
            r11.append(r13)
            r11.append(r5)
            r11.append(r12)
            r11.append(r9)
            r11.append(r14)
            int r9 = r6.getEndIndex()
            r11.append(r9)
            java.lang.String r9 = ".  Setting value to 0"
            r11.append(r9)
            java.lang.String r9 = r11.toString()
            r11 = 0
            java.lang.Object[] r13 = new java.lang.Object[r11]
            org.altbeacon.beacon.logging.LogManager.m6834d(r15, r9, r13)
        L_0x03a4:
            java.lang.Long r9 = new java.lang.Long
            r13 = r12
            r11 = 0
            r9.<init>(r11)
            r8.add(r9)
            goto L_0x03d5
        L_0x03b0:
            r13 = r12
            java.util.List<java.lang.Integer> r11 = r0.mDataStartOffsets
            java.lang.Object r11 = r11.get(r5)
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            int r11 = r11 + r10
            java.util.List<java.lang.Boolean> r12 = r0.mDataLittleEndianFlags
            java.lang.Object r12 = r12.get(r5)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            java.lang.String r9 = r0.byteArrayToFormattedString(r4, r11, r9, r12)
            java.lang.Long r9 = java.lang.Long.decode(r9)
            r8.add(r9)
        L_0x03d5:
            int r5 = r5 + 1
            r12 = r13
            goto L_0x034f
        L_0x03da:
            java.lang.Integer r5 = r0.mPowerStartOffset
            if (r5 == 0) goto L_0x044a
            java.lang.Integer r5 = r0.mPowerEndOffset
            int r5 = r5.intValue()
            int r5 = r5 + r10
            int r9 = r6.getEndIndex()     // Catch:{ NullPointerException | NumberFormatException -> 0x0454 }
            if (r5 <= r9) goto L_0x0422
            java.lang.Boolean r9 = r0.mAllowPduOverflow     // Catch:{ NullPointerException | NumberFormatException -> 0x0454 }
            boolean r9 = r9.booleanValue()     // Catch:{ NullPointerException | NumberFormatException -> 0x0454 }
            if (r9 != 0) goto L_0x0422
            boolean r9 = org.altbeacon.beacon.logging.LogManager.isVerboseLoggingEnabled()     // Catch:{ NullPointerException | NumberFormatException -> 0x041f }
            if (r9 == 0) goto L_0x041a
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ NullPointerException | NumberFormatException -> 0x041f }
            r9.<init>()     // Catch:{ NullPointerException | NumberFormatException -> 0x041f }
            java.lang.String r11 = "Cannot parse power field because PDU is too short.  endIndex: "
            r9.append(r11)     // Catch:{ NullPointerException | NumberFormatException -> 0x041f }
            r9.append(r5)     // Catch:{ NullPointerException | NumberFormatException -> 0x041f }
            r9.append(r14)     // Catch:{ NullPointerException | NumberFormatException -> 0x041f }
            int r5 = r6.getEndIndex()     // Catch:{ NullPointerException | NumberFormatException -> 0x041f }
            r9.append(r5)     // Catch:{ NullPointerException | NumberFormatException -> 0x041f }
            java.lang.String r5 = r9.toString()     // Catch:{ NullPointerException | NumberFormatException -> 0x041f }
            r6 = 0
            java.lang.Object[] r9 = new java.lang.Object[r6]     // Catch:{ NullPointerException | NumberFormatException -> 0x041f }
            org.altbeacon.beacon.logging.LogManager.m6834d(r15, r5, r9)     // Catch:{ NullPointerException | NumberFormatException -> 0x041f }
        L_0x041a:
            r11 = r18
            r19 = 1
            goto L_0x0447
        L_0x041f:
            r19 = 1
            goto L_0x0454
        L_0x0422:
            java.lang.Integer r5 = r0.mPowerStartOffset     // Catch:{ NullPointerException | NumberFormatException -> 0x0454 }
            int r5 = r5.intValue()     // Catch:{ NullPointerException | NumberFormatException -> 0x0454 }
            int r5 = r5 + r10
            java.lang.Integer r6 = r0.mPowerEndOffset     // Catch:{ NullPointerException | NumberFormatException -> 0x0454 }
            int r6 = r6.intValue()     // Catch:{ NullPointerException | NumberFormatException -> 0x0454 }
            int r6 = r6 + r10
            r9 = 0
            java.lang.String r5 = r0.byteArrayToFormattedString(r4, r5, r6, r9)     // Catch:{ NullPointerException | NumberFormatException -> 0x0454 }
            int r5 = java.lang.Integer.parseInt(r5)     // Catch:{ NullPointerException | NumberFormatException -> 0x0454 }
            java.lang.Integer r6 = r0.mDBmCorrection     // Catch:{ NullPointerException | NumberFormatException -> 0x0454 }
            int r6 = r6.intValue()     // Catch:{ NullPointerException | NumberFormatException -> 0x0454 }
            int r5 = r5 + r6
            r6 = 127(0x7f, float:1.78E-43)
            if (r5 <= r6) goto L_0x0446
            int r5 = r5 + -256
        L_0x0446:
            r11 = r5
        L_0x0447:
            r18 = r11
            goto L_0x0454
        L_0x044a:
            java.lang.Integer r5 = r0.mDBmCorrection
            if (r5 == 0) goto L_0x0454
            int r5 = r5.intValue()
            r13 = r5
            goto L_0x0456
        L_0x0454:
            r13 = r18
        L_0x0456:
            r5 = r4
            if (r19 != 0) goto L_0x045c
            r4 = r13
            r13 = 1
            goto L_0x0470
        L_0x045c:
            r11 = r13
            goto L_0x0460
        L_0x045e:
            r18 = r11
        L_0x0460:
            r6 = r10
            r4 = r24
            r10 = 1
            r12 = 22
            r13 = 0
            r14 = -1
            goto L_0x00b3
        L_0x046a:
            r18 = r11
            r10 = r6
            r4 = r18
            r13 = 0
        L_0x0470:
            if (r13 == 0) goto L_0x04e6
            java.lang.Integer r6 = r0.mMatchingBeaconTypeCodeEndOffset
            if (r6 == 0) goto L_0x048e
            java.lang.Integer r6 = r0.mMatchingBeaconTypeCodeStartOffset
            int r6 = r6.intValue()
            int r6 = r6 + r10
            java.lang.Integer r9 = r0.mMatchingBeaconTypeCodeEndOffset
            int r9 = r9.intValue()
            int r9 = r9 + r10
            r11 = 0
            java.lang.String r6 = r0.byteArrayToFormattedString(r5, r6, r9, r11)
            int r14 = java.lang.Integer.parseInt(r6)
            goto L_0x0490
        L_0x048e:
            r11 = 0
            r14 = -1
        L_0x0490:
            int r6 = r10 + 1
            r9 = 1
            java.lang.String r5 = r0.byteArrayToFormattedString(r5, r10, r6, r9)
            int r5 = java.lang.Integer.parseInt(r5)
            if (r30 == 0) goto L_0x04a6
            java.lang.String r6 = r30.getAddress()
            java.lang.String r10 = r30.getName()
            goto L_0x04a8
        L_0x04a6:
            r6 = 0
            r10 = 0
        L_0x04a8:
            r3.mIdentifiers = r7
            r3.mDataFields = r8
            r7 = r29
            r3.mRssi = r7
            r3.mBeaconTypeCode = r14
            java.lang.Long r7 = r0.mServiceUuid
            if (r7 == 0) goto L_0x04be
            long r7 = r7.longValue()
            int r8 = (int) r7
            r3.mServiceUuid = r8
            goto L_0x04c1
        L_0x04be:
            r7 = -1
            r3.mServiceUuid = r7
        L_0x04c1:
            r3.mBluetoothAddress = r6
            r3.mBluetoothName = r10
            r3.mManufacturer = r5
            java.lang.String r5 = r0.mIdentifier
            r3.mParserIdentifier = r5
            java.util.List<org.altbeacon.beacon.BeaconParser> r5 = r0.extraParsers
            int r5 = r5.size()
            if (r5 > 0) goto L_0x04dd
            java.lang.Boolean r5 = r0.mExtraFrame
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x04dc
            goto L_0x04dd
        L_0x04dc:
            r9 = 0
        L_0x04dd:
            r3.mMultiFrameBeacon = r9
            r3.mFirstCycleDetectionTimestamp = r1
            r3.mLastCycleDetectionTimestamp = r1
            r3.mTxPower = r4
            return r3
        L_0x04e6:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.altbeacon.beacon.BeaconParser.fromScanData(byte[], int, android.bluetooth.BluetoothDevice, long, org.altbeacon.beacon.Beacon):org.altbeacon.beacon.Beacon");
    }

    public byte[] getBeaconAdvertisementData(Beacon beacon) {
        if (beacon.getIdentifiers().size() == getIdentifierCount()) {
            int i = -1;
            Integer num = this.mMatchingBeaconTypeCodeEndOffset;
            if (num != null && num.intValue() > -1) {
                i = this.mMatchingBeaconTypeCodeEndOffset.intValue();
            }
            Integer num2 = this.mPowerEndOffset;
            if (num2 != null && num2.intValue() > i) {
                i = this.mPowerEndOffset.intValue();
            }
            int i2 = i;
            for (int i3 = 0; i3 < this.mIdentifierEndOffsets.size(); i3++) {
                if (this.mIdentifierEndOffsets.get(i3) != null && this.mIdentifierEndOffsets.get(i3).intValue() > i2) {
                    i2 = this.mIdentifierEndOffsets.get(i3).intValue();
                }
            }
            for (int i4 = 0; i4 < this.mDataEndOffsets.size(); i4++) {
                if (this.mDataEndOffsets.get(i4) != null && this.mDataEndOffsets.get(i4).intValue() > i2) {
                    i2 = this.mDataEndOffsets.get(i4).intValue();
                }
            }
            int i5 = 0;
            for (int i6 = 0; i6 < this.mIdentifierStartOffsets.size(); i6++) {
                if (this.mIdentifierVariableLengthFlags.get(i6).booleanValue()) {
                    i5 = (i5 + beacon.getIdentifier(i6).getByteCount()) - ((this.mIdentifierEndOffsets.get(i6).intValue() - this.mIdentifierStartOffsets.get(i6).intValue()) + 1);
                }
            }
            byte[] bArr = new byte[(((i2 + i5) + 1) - 2)];
            if (this.mMatchingBeaconTypeCodeEndOffset != null) {
                getMatchingBeaconTypeCode().longValue();
                for (int intValue = this.mMatchingBeaconTypeCodeStartOffset.intValue(); intValue <= this.mMatchingBeaconTypeCodeEndOffset.intValue(); intValue++) {
                    bArr[intValue - 2] = (byte) ((int) ((getMatchingBeaconTypeCode().longValue() >> ((this.mMatchingBeaconTypeCodeEndOffset.intValue() - intValue) * 8)) & 255));
                }
            }
            for (int i7 = 0; i7 < this.mIdentifierStartOffsets.size(); i7++) {
                byte[] byteArrayOfSpecifiedEndianness = beacon.getIdentifier(i7).toByteArrayOfSpecifiedEndianness(!this.mIdentifierLittleEndianFlags.get(i7).booleanValue());
                if (byteArrayOfSpecifiedEndianness.length < getIdentifierByteCount(i7)) {
                    if (!this.mIdentifierVariableLengthFlags.get(i7).booleanValue()) {
                        if (this.mIdentifierLittleEndianFlags.get(i7).booleanValue()) {
                            byteArrayOfSpecifiedEndianness = Arrays.copyOf(byteArrayOfSpecifiedEndianness, getIdentifierByteCount(i7));
                        } else {
                            byte[] bArr2 = new byte[getIdentifierByteCount(i7)];
                            System.arraycopy(byteArrayOfSpecifiedEndianness, 0, bArr2, getIdentifierByteCount(i7) - byteArrayOfSpecifiedEndianness.length, byteArrayOfSpecifiedEndianness.length);
                            byteArrayOfSpecifiedEndianness = bArr2;
                        }
                    }
                    LogManager.m6834d(TAG, "Expanded identifier because it is too short.  It is now: " + byteArrayToString(byteArrayOfSpecifiedEndianness), new Object[0]);
                } else if (byteArrayOfSpecifiedEndianness.length > getIdentifierByteCount(i7)) {
                    if (this.mIdentifierLittleEndianFlags.get(i7).booleanValue()) {
                        byteArrayOfSpecifiedEndianness = Arrays.copyOfRange(byteArrayOfSpecifiedEndianness, getIdentifierByteCount(i7) - byteArrayOfSpecifiedEndianness.length, getIdentifierByteCount(i7));
                    } else {
                        byteArrayOfSpecifiedEndianness = Arrays.copyOf(byteArrayOfSpecifiedEndianness, getIdentifierByteCount(i7));
                    }
                    LogManager.m6834d(TAG, "Truncated identifier because it is too long.  It is now: " + byteArrayToString(byteArrayOfSpecifiedEndianness), new Object[0]);
                } else {
                    LogManager.m6834d(TAG, "Identifier size is just right: " + byteArrayToString(byteArrayOfSpecifiedEndianness), new Object[0]);
                }
                for (int intValue2 = this.mIdentifierStartOffsets.get(i7).intValue(); intValue2 <= (this.mIdentifierStartOffsets.get(i7).intValue() + byteArrayOfSpecifiedEndianness.length) - 1; intValue2++) {
                    bArr[intValue2 - 2] = byteArrayOfSpecifiedEndianness[intValue2 - this.mIdentifierStartOffsets.get(i7).intValue()];
                }
            }
            Integer num3 = this.mPowerStartOffset;
            if (!(num3 == null || this.mPowerEndOffset == null || num3.intValue() < 2)) {
                for (int intValue3 = this.mPowerStartOffset.intValue(); intValue3 <= this.mPowerEndOffset.intValue(); intValue3++) {
                    bArr[intValue3 - 2] = (byte) ((beacon.getTxPower() >> ((intValue3 - this.mPowerStartOffset.intValue()) * 8)) & 255);
                }
            }
            for (int i8 = 0; i8 < this.mDataStartOffsets.size(); i8++) {
                long longValue = beacon.getDataFields().get(i8).longValue();
                int intValue4 = this.mDataEndOffsets.get(i8).intValue() - this.mDataStartOffsets.get(i8).intValue();
                for (int i9 = 0; i9 <= intValue4; i9++) {
                    bArr[(this.mDataStartOffsets.get(i8).intValue() - 2) + (!this.mDataLittleEndianFlags.get(i8).booleanValue() ? intValue4 - i9 : i9)] = (byte) ((int) ((longValue >> (i9 * 8)) & 255));
                }
            }
            return bArr;
        }
        throw new IllegalArgumentException("Beacon has " + beacon.getIdentifiers().size() + " identifiers but format requires " + getIdentifierCount());
    }

    public BeaconParser setMatchingBeaconTypeCode(Long l) {
        this.mMatchingBeaconTypeCode = l;
        return this;
    }

    public int getIdentifierByteCount(int i) {
        return (this.mIdentifierEndOffsets.get(i).intValue() - this.mIdentifierStartOffsets.get(i).intValue()) + 1;
    }

    public int getIdentifierCount() {
        return this.mIdentifierStartOffsets.size();
    }

    public int getDataFieldCount() {
        return this.mDataStartOffsets.size();
    }

    public String getLayout() {
        return this.mBeaconLayout;
    }

    public int getPowerCorrection() {
        return this.mDBmCorrection.intValue();
    }

    protected static String bytesToHex(byte[] bArr) {
        char[] cArr = new char[(bArr.length * 2)];
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i] & 255;
            int i2 = i * 2;
            char[] cArr2 = HEX_ARRAY;
            cArr[i2] = cArr2[b >>> 4];
            cArr[i2 + 1] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    public static class BeaconLayoutException extends RuntimeException {
        public BeaconLayoutException(String str) {
            super(str);
        }
    }

    public static byte[] longToByteArray(long j, int i) {
        return longToByteArray(j, i, true);
    }

    public static byte[] longToByteArray(long j, int i, boolean z) {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = ((i - (z ? i2 : (i - i2) - 1)) - 1) * 8;
            bArr[i2] = (byte) ((int) ((j & (255 << i3)) >> ((int) ((long) i3))));
        }
        return bArr;
    }

    private int calculateLayoutSize() {
        List<Integer> list = this.mIdentifierEndOffsets;
        int i = 0;
        if (list != null) {
            for (Integer intValue : list) {
                int intValue2 = intValue.intValue();
                if (intValue2 > i) {
                    i = intValue2;
                }
            }
        }
        List<Integer> list2 = this.mDataEndOffsets;
        if (list2 != null) {
            for (Integer intValue3 : list2) {
                int intValue4 = intValue3.intValue();
                if (intValue4 > i) {
                    i = intValue4;
                }
            }
        }
        Integer num = this.mPowerEndOffset;
        if (num != null && num.intValue() > i) {
            i = this.mPowerEndOffset.intValue();
        }
        Integer num2 = this.mServiceUuidEndOffset;
        if (num2 != null && num2.intValue() > i) {
            i = this.mServiceUuidEndOffset.intValue();
        }
        return i + 1;
    }

    private boolean byteArraysMatch(byte[] bArr, int i, byte[] bArr2) {
        int length = bArr2.length;
        if (bArr.length - i < length) {
            return false;
        }
        for (int i2 = 0; i2 < length; i2++) {
            if (bArr[i + i2] != bArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    private String byteArrayToString(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < bArr.length; i++) {
            sb.append(String.format("%02x", new Object[]{Byte.valueOf(bArr[i])}));
            sb.append(" ");
        }
        return sb.toString().trim();
    }

    private String byteArrayToFormattedString(byte[] bArr, int i, int i2, boolean z) {
        int i3 = i2 - i;
        int i4 = i3 + 1;
        byte[] bArr2 = new byte[i4];
        if (z) {
            for (int i5 = 0; i5 <= i3; i5++) {
                bArr2[i5] = bArr[((bArr2.length + i) - 1) - i5];
            }
        } else {
            for (int i6 = 0; i6 <= i3; i6++) {
                bArr2[i6] = bArr[i + i6];
            }
        }
        if (i4 < 5) {
            long j = 0;
            for (int i7 = 0; i7 < bArr2.length; i7++) {
                j += ((long) (bArr2[(bArr2.length - i7) - 1] & 255)) * ((long) Math.pow(256.0d, ((double) i7) * 1.0d));
            }
            return Long.toString(j);
        }
        String bytesToHex = bytesToHex(bArr2);
        if (bArr2.length == 16) {
            return bytesToHex.substring(0, 8) + "-" + bytesToHex.substring(8, 12) + "-" + bytesToHex.substring(12, 16) + "-" + bytesToHex.substring(16, 20) + "-" + bytesToHex.substring(20, 32);
        }
        return "0x" + bytesToHex;
    }

    private byte[] ensureMaxSize(byte[] bArr, int i) {
        if (bArr.length >= i) {
            return bArr;
        }
        return Arrays.copyOf(bArr, i);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.mMatchingBeaconTypeCode, this.mIdentifierStartOffsets, this.mIdentifierEndOffsets, this.mIdentifierLittleEndianFlags, this.mDataStartOffsets, this.mDataEndOffsets, this.mDataLittleEndianFlags, this.mIdentifierVariableLengthFlags, this.mMatchingBeaconTypeCodeStartOffset, this.mMatchingBeaconTypeCodeEndOffset, this.mServiceUuidStartOffset, this.mServiceUuidEndOffset, this.mServiceUuid, this.mExtraFrame, this.mPowerStartOffset, this.mPowerEndOffset, this.mDBmCorrection, this.mLayoutSize, this.mAllowPduOverflow, this.mIdentifier, this.mHardwareAssistManufacturers, this.extraParsers});
    }

    public boolean equals(Object obj) {
        try {
            BeaconParser beaconParser = (BeaconParser) obj;
            return beaconParser.mBeaconLayout != null && beaconParser.mBeaconLayout.equals(this.mBeaconLayout) && beaconParser.mIdentifier != null && beaconParser.mIdentifier.equals(this.mIdentifier);
        } catch (ClassCastException unused) {
            return false;
        }
    }
}
