package org.videolan.libvlc.util;

import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.jvm.internal.ByteCompanionObject;
import org.videolan.libvlc.LibVLC;
import org.videolan.libvlc.Media;

public class VLCUtil {
    private static final String[] CPU_archs = {"*Pre-v4", "*v4", "*v4T", "v5T", "v5TE", "v5TEJ", "v6", "v6KZ", "v6T2", "v6K", "v7", "*v6-M", "*v6S-M", "*v7E-M", "*v8"};
    private static final int ELF_HEADER_SIZE = 52;
    private static final int EM_386 = 3;
    private static final int EM_AARCH64 = 183;
    private static final int EM_ARM = 40;
    private static final int EM_MIPS = 8;
    private static final int EM_X86_64 = 62;
    private static final int SECTION_HEADER_SIZE = 40;
    private static final int SHT_ARM_ATTRIBUTES = 1879048195;
    public static final String TAG = "VLC/LibVLC/Util";
    private static final String URI_AUTHORIZED_CHARS = "'()*";
    private static String errorMsg = null;
    private static boolean isCompatible = false;
    private static MachineSpecs machineSpecs;

    public static class MachineSpecs {
        public float bogoMIPS;
        public float frequency;
        public boolean hasArmV6;
        public boolean hasArmV7;
        public boolean hasFpu;
        public boolean hasMips;
        public boolean hasNeon;
        public boolean hasX86;
        public boolean is64bits;
        public int processors;
    }

    private static native byte[] nativeGetThumbnail(Media media, int i, int i2);

    public static String getErrorMsg() {
        return errorMsg;
    }

    public static String[] getABIList21() {
        String[] strArr = Build.SUPPORTED_ABIS;
        if (strArr == null || strArr.length == 0) {
            return getABIList();
        }
        return strArr;
    }

    public static String[] getABIList() {
        return new String[]{Build.CPU_ABI, Build.CPU_ABI2};
    }

    /* JADX WARNING: Removed duplicated region for block: B:107:0x01ad A[Catch:{ IOException -> 0x01ff, all -> 0x01db }] */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0212  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0219  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x02b3 A[Catch:{ IOException -> 0x02e8, NumberFormatException -> 0x02cc }] */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x02bb  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x01ff A[EDGE_INSN: B:218:0x01ff->B:131:0x01ff ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x011f A[Catch:{ IOException -> 0x01ff, all -> 0x01db }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean hasCompatibleCPU(android.content.Context r22) {
        /*
            java.lang.String r0 = errorMsg
            if (r0 != 0) goto L_0x0349
            boolean r0 = isCompatible
            if (r0 == 0) goto L_0x000a
            goto L_0x0349
        L_0x000a:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 < r1) goto L_0x0015
            java.lang.String[] r0 = getABIList21()
            goto L_0x0019
        L_0x0015:
            java.lang.String[] r0 = getABIList()
        L_0x0019:
            int r1 = r0.length
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
        L_0x0020:
            java.lang.String r9 = "x86"
            if (r3 >= r1) goto L_0x005e
            r11 = r0[r3]
            boolean r9 = r11.equals(r9)
            if (r9 == 0) goto L_0x002f
            r4 = 1
            goto L_0x005b
        L_0x002f:
            java.lang.String r9 = "x86_64"
            boolean r9 = r11.equals(r9)
            if (r9 == 0) goto L_0x003b
            r4 = 1
            r5 = 1
            goto L_0x005b
        L_0x003b:
            java.lang.String r9 = "armeabi-v7a"
            boolean r9 = r11.equals(r9)
            if (r9 == 0) goto L_0x0046
        L_0x0043:
            r7 = 1
            r8 = 1
            goto L_0x005b
        L_0x0046:
            java.lang.String r9 = "armeabi"
            boolean r9 = r11.equals(r9)
            if (r9 == 0) goto L_0x0050
            r7 = 1
            goto L_0x005b
        L_0x0050:
            java.lang.String r9 = "arm64-v8a"
            boolean r9 = r11.equals(r9)
            if (r9 == 0) goto L_0x005b
            r5 = 1
            r6 = 1
            goto L_0x0043
        L_0x005b:
            int r3 = r3 + 1
            goto L_0x0020
        L_0x005e:
            android.content.pm.ApplicationInfo r0 = r22.getApplicationInfo()
            java.io.File r0 = searchLibrary(r0)
            r1 = 40
            java.lang.String r11 = "VLC/LibVLC/Util"
            if (r0 == 0) goto L_0x00f4
            org.videolan.libvlc.util.VLCUtil$ElfData r0 = readLib(r0)
            if (r0 == 0) goto L_0x00f5
            int r12 = r0.e_machine
            r13 = 3
            if (r12 == r13) goto L_0x0080
            int r12 = r0.e_machine
            r13 = 62
            if (r12 != r13) goto L_0x007e
            goto L_0x0080
        L_0x007e:
            r12 = 0
            goto L_0x0081
        L_0x0080:
            r12 = 1
        L_0x0081:
            int r13 = r0.e_machine
            if (r13 == r1) goto L_0x008e
            int r13 = r0.e_machine
            r14 = 183(0xb7, float:2.56E-43)
            if (r13 != r14) goto L_0x008c
            goto L_0x008e
        L_0x008c:
            r13 = 0
            goto L_0x008f
        L_0x008e:
            r13 = 1
        L_0x008f:
            int r14 = r0.e_machine
            r15 = 8
            if (r14 != r15) goto L_0x0097
            r14 = 1
            goto L_0x0098
        L_0x0097:
            r14 = 0
        L_0x0098:
            boolean r15 = r0.is64bits
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r1 = "ELF ABI = "
            r3.append(r1)
            if (r13 == 0) goto L_0x00a9
            java.lang.String r9 = "arm"
            goto L_0x00ae
        L_0x00a9:
            if (r12 == 0) goto L_0x00ac
            goto L_0x00ae
        L_0x00ac:
            java.lang.String r9 = "mips"
        L_0x00ae:
            r3.append(r9)
            java.lang.String r1 = ", "
            r3.append(r1)
            if (r15 == 0) goto L_0x00bb
            java.lang.String r1 = "64bits"
            goto L_0x00bd
        L_0x00bb:
            java.lang.String r1 = "32bits"
        L_0x00bd:
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            android.util.Log.i(r11, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "ELF arch = "
            r1.append(r3)
            java.lang.String r3 = r0.att_arch
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            android.util.Log.i(r11, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "ELF fpu = "
            r1.append(r3)
            boolean r3 = r0.att_fpu
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            android.util.Log.i(r11, r1)
            goto L_0x00fe
        L_0x00f4:
            r0 = 0
        L_0x00f5:
            java.lang.String r1 = "WARNING: Unable to read libvlcjni.so; cannot check device ABI!"
            android.util.Log.w(r11, r1)
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
        L_0x00fe:
            java.io.FileReader r3 = new java.io.FileReader     // Catch:{ IOException -> 0x01ee, all -> 0x01e4 }
            java.lang.String r9 = "/proc/cpuinfo"
            r3.<init>(r9)     // Catch:{ IOException -> 0x01ee, all -> 0x01e4 }
            java.io.BufferedReader r9 = new java.io.BufferedReader     // Catch:{ IOException -> 0x01df, all -> 0x01dd }
            r9.<init>(r3)     // Catch:{ IOException -> 0x01df, all -> 0x01dd }
            r21 = r6
            r18 = r8
            r6 = 0
            r16 = 0
            r17 = 0
            r19 = 0
            r20 = -1082130432(0xffffffffbf800000, float:-1.0)
            r8 = r7
            r7 = 0
        L_0x0119:
            java.lang.String r1 = r9.readLine()     // Catch:{ IOException -> 0x01ff, all -> 0x01db }
            if (r1 == 0) goto L_0x01ff
            java.lang.String r2 = "AArch64"
            boolean r2 = r1.contains(r2)     // Catch:{ IOException -> 0x01ff, all -> 0x01db }
            if (r2 == 0) goto L_0x012b
        L_0x0127:
            r8 = 1
            r18 = 1
            goto L_0x0178
        L_0x012b:
            java.lang.String r2 = "ARMv7"
            boolean r2 = r1.contains(r2)     // Catch:{ IOException -> 0x01ff, all -> 0x01db }
            if (r2 == 0) goto L_0x0134
            goto L_0x0127
        L_0x0134:
            java.lang.String r2 = "ARMv6"
            boolean r2 = r1.contains(r2)     // Catch:{ IOException -> 0x01ff, all -> 0x01db }
            if (r2 == 0) goto L_0x013e
            r8 = 1
            goto L_0x0178
        L_0x013e:
            java.lang.String r2 = "clflush size"
            boolean r2 = r1.contains(r2)     // Catch:{ IOException -> 0x01ff, all -> 0x01db }
            if (r2 == 0) goto L_0x0148
        L_0x0146:
            r4 = 1
            goto L_0x0178
        L_0x0148:
            java.lang.String r2 = "GenuineIntel"
            boolean r2 = r1.contains(r2)     // Catch:{ IOException -> 0x01ff, all -> 0x01db }
            if (r2 == 0) goto L_0x0151
            goto L_0x0146
        L_0x0151:
            java.lang.String r2 = "placeholder"
            boolean r2 = r1.contains(r2)     // Catch:{ IOException -> 0x01ff, all -> 0x01db }
            if (r2 == 0) goto L_0x015c
            r16 = 1
            goto L_0x0178
        L_0x015c:
            java.lang.String r2 = "CPU implementer"
            boolean r2 = r1.contains(r2)     // Catch:{ IOException -> 0x01ff, all -> 0x01db }
            if (r2 == 0) goto L_0x016e
            java.lang.String r2 = "0x69"
            boolean r2 = r1.contains(r2)     // Catch:{ IOException -> 0x01ff, all -> 0x01db }
            if (r2 == 0) goto L_0x016e
            r6 = 1
            goto L_0x0178
        L_0x016e:
            java.lang.String r2 = "microsecond timers"
            boolean r2 = r1.contains(r2)     // Catch:{ IOException -> 0x01ff, all -> 0x01db }
            if (r2 == 0) goto L_0x0178
            r17 = 1
        L_0x0178:
            java.lang.String r2 = "neon"
            boolean r2 = r1.contains(r2)     // Catch:{ IOException -> 0x01ff, all -> 0x01db }
            if (r2 != 0) goto L_0x0188
            java.lang.String r2 = "asimd"
            boolean r2 = r1.contains(r2)     // Catch:{ IOException -> 0x01ff, all -> 0x01db }
            if (r2 == 0) goto L_0x018a
        L_0x0188:
            r21 = 1
        L_0x018a:
            java.lang.String r2 = "vfp"
            boolean r2 = r1.contains(r2)     // Catch:{ IOException -> 0x01ff, all -> 0x01db }
            if (r2 != 0) goto L_0x01a3
            java.lang.String r2 = "Features"
            boolean r2 = r1.contains(r2)     // Catch:{ IOException -> 0x01ff, all -> 0x01db }
            if (r2 == 0) goto L_0x01a5
            java.lang.String r2 = "fp"
            boolean r2 = r1.contains(r2)     // Catch:{ IOException -> 0x01ff, all -> 0x01db }
            if (r2 == 0) goto L_0x01a5
        L_0x01a3:
            r19 = 1
        L_0x01a5:
            java.lang.String r2 = "processor"
            boolean r2 = r1.startsWith(r2)     // Catch:{ IOException -> 0x01ff, all -> 0x01db }
            if (r2 == 0) goto L_0x01af
            int r7 = r7 + 1
        L_0x01af:
            r2 = 0
            int r2 = (r20 > r2 ? 1 : (r20 == r2 ? 0 : -1))
            if (r2 >= 0) goto L_0x0119
            java.util.Locale r2 = java.util.Locale.ENGLISH     // Catch:{ IOException -> 0x01ff, all -> 0x01db }
            java.lang.String r2 = r1.toLowerCase(r2)     // Catch:{ IOException -> 0x01ff, all -> 0x01db }
            java.lang.String r10 = "bogomips"
            boolean r2 = r2.contains(r10)     // Catch:{ IOException -> 0x01ff, all -> 0x01db }
            if (r2 == 0) goto L_0x0119
            java.lang.String r2 = ":"
            java.lang.String[] r1 = r1.split(r2)     // Catch:{ IOException -> 0x01ff, all -> 0x01db }
            r2 = 1
            r1 = r1[r2]     // Catch:{ NumberFormatException -> 0x01d7 }
            java.lang.String r1 = r1.trim()     // Catch:{ NumberFormatException -> 0x01d7 }
            float r1 = java.lang.Float.parseFloat(r1)     // Catch:{ NumberFormatException -> 0x01d7 }
            r20 = r1
            goto L_0x0119
        L_0x01d7:
            r20 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L_0x0119
        L_0x01db:
            r0 = move-exception
            goto L_0x01e7
        L_0x01dd:
            r0 = move-exception
            goto L_0x01e6
        L_0x01df:
            r21 = r6
            r18 = r8
            goto L_0x01f3
        L_0x01e4:
            r0 = move-exception
            r3 = 0
        L_0x01e6:
            r9 = 0
        L_0x01e7:
            close(r9)
            close(r3)
            throw r0
        L_0x01ee:
            r21 = r6
            r18 = r8
            r3 = 0
        L_0x01f3:
            r6 = 0
            r9 = 0
            r16 = 0
            r17 = 0
            r19 = 0
            r20 = -1082130432(0xffffffffbf800000, float:-1.0)
            r8 = r7
            r7 = 0
        L_0x01ff:
            close(r9)
            close(r3)
            r10 = r7
            r1 = r17
            r2 = r18
            r3 = r19
            r7 = r20
            r9 = r21
            if (r10 != 0) goto L_0x0213
            r10 = 1
        L_0x0213:
            r17 = 1
            isCompatible = r17
            if (r0 == 0) goto L_0x029f
            if (r12 == 0) goto L_0x0231
            if (r4 != 0) goto L_0x0231
            if (r16 == 0) goto L_0x0228
            if (r6 == 0) goto L_0x0228
            java.lang.String r6 = "Emulated armv7 detected, trying to launch x86 libraries"
            android.util.Log.d(r11, r6)
            r6 = 0
            goto L_0x023c
        L_0x0228:
            java.lang.String r6 = "x86 build on non-x86 device"
            errorMsg = r6
            r6 = 0
            isCompatible = r6
            goto L_0x023c
        L_0x0231:
            r6 = 0
            if (r13 == 0) goto L_0x023c
            if (r8 != 0) goto L_0x023c
            java.lang.String r12 = "ARM build on non ARM device"
            errorMsg = r12
            isCompatible = r6
        L_0x023c:
            if (r14 == 0) goto L_0x0247
            if (r1 != 0) goto L_0x0247
            java.lang.String r12 = "MIPS build on non-MIPS device"
            errorMsg = r12
            isCompatible = r6
            goto L_0x0251
        L_0x0247:
            if (r13 == 0) goto L_0x0251
            if (r1 == 0) goto L_0x0251
            java.lang.String r12 = "ARM build on MIPS device"
            errorMsg = r12
            isCompatible = r6
        L_0x0251:
            int r6 = r0.e_machine
            r12 = 40
            if (r6 != r12) goto L_0x026b
            java.lang.String r6 = r0.att_arch
            java.lang.String r12 = "v7"
            boolean r6 = r6.startsWith(r12)
            if (r6 == 0) goto L_0x026b
            if (r2 != 0) goto L_0x026b
            java.lang.String r6 = "ARMv7 build on non-ARMv7 device"
            errorMsg = r6
            r6 = 0
            isCompatible = r6
        L_0x026b:
            int r6 = r0.e_machine
            r12 = 40
            if (r6 != r12) goto L_0x0294
            java.lang.String r6 = r0.att_arch
            java.lang.String r12 = "v6"
            boolean r6 = r6.startsWith(r12)
            if (r6 == 0) goto L_0x0286
            if (r8 != 0) goto L_0x0286
            java.lang.String r0 = "ARMv6 build on non-ARMv6 device"
            errorMsg = r0
            r6 = 0
            isCompatible = r6
            goto L_0x0295
        L_0x0286:
            r6 = 0
            boolean r0 = r0.att_fpu
            if (r0 == 0) goto L_0x0295
            if (r3 != 0) goto L_0x0295
            java.lang.String r0 = "FPU-enabled build on non-FPU device"
            errorMsg = r0
            isCompatible = r6
            goto L_0x0295
        L_0x0294:
            r6 = 0
        L_0x0295:
            if (r15 == 0) goto L_0x029f
            if (r5 != 0) goto L_0x029f
            java.lang.String r0 = "64bits build on 32bits device"
            errorMsg = r0
            isCompatible = r6
        L_0x029f:
            java.lang.String r0 = ""
            java.io.FileReader r6 = new java.io.FileReader     // Catch:{ IOException -> 0x02e6, NumberFormatException -> 0x02ca, all -> 0x02c6 }
            java.lang.String r12 = "/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq"
            r6.<init>(r12)     // Catch:{ IOException -> 0x02e6, NumberFormatException -> 0x02ca, all -> 0x02c6 }
            java.io.BufferedReader r12 = new java.io.BufferedReader     // Catch:{ IOException -> 0x02e7, NumberFormatException -> 0x02cb, all -> 0x02c4 }
            r12.<init>(r6)     // Catch:{ IOException -> 0x02e7, NumberFormatException -> 0x02cb, all -> 0x02c4 }
            java.lang.String r0 = r12.readLine()     // Catch:{ IOException -> 0x02e8, NumberFormatException -> 0x02cc }
            if (r0 == 0) goto L_0x02bb
            float r0 = java.lang.Float.parseFloat(r0)     // Catch:{ IOException -> 0x02e8, NumberFormatException -> 0x02cc }
            r13 = 1148846080(0x447a0000, float:1000.0)
            float r0 = r0 / r13
            goto L_0x02bd
        L_0x02bb:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x02bd:
            close(r12)
            close(r6)
            goto L_0x02f5
        L_0x02c4:
            r0 = move-exception
            goto L_0x02c8
        L_0x02c6:
            r0 = move-exception
            r6 = 0
        L_0x02c8:
            r12 = 0
            goto L_0x0342
        L_0x02ca:
            r6 = 0
        L_0x02cb:
            r12 = 0
        L_0x02cc:
            java.lang.String r13 = "Could not parse maximum CPU frequency!"
            android.util.Log.w(r11, r13)     // Catch:{ all -> 0x0341 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x0341 }
            r13.<init>()     // Catch:{ all -> 0x0341 }
            java.lang.String r14 = "Failed to parse: "
            r13.append(r14)     // Catch:{ all -> 0x0341 }
            r13.append(r0)     // Catch:{ all -> 0x0341 }
            java.lang.String r0 = r13.toString()     // Catch:{ all -> 0x0341 }
            android.util.Log.w(r11, r0)     // Catch:{ all -> 0x0341 }
            goto L_0x02ed
        L_0x02e6:
            r6 = 0
        L_0x02e7:
            r12 = 0
        L_0x02e8:
            java.lang.String r0 = "Could not find maximum CPU frequency!"
            android.util.Log.w(r11, r0)     // Catch:{ all -> 0x0341 }
        L_0x02ed:
            close(r12)
            close(r6)
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x02f5:
            org.videolan.libvlc.util.VLCUtil$MachineSpecs r6 = new org.videolan.libvlc.util.VLCUtil$MachineSpecs
            r6.<init>()
            machineSpecs = r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r12 = "machineSpecs: hasArmV6: "
            r6.append(r12)
            r6.append(r8)
            java.lang.String r12 = ", hasArmV7: "
            r6.append(r12)
            r6.append(r2)
            java.lang.String r12 = ", hasX86: "
            r6.append(r12)
            r6.append(r4)
            java.lang.String r12 = ", is64bits: "
            r6.append(r12)
            r6.append(r5)
            java.lang.String r6 = r6.toString()
            android.util.Log.d(r11, r6)
            org.videolan.libvlc.util.VLCUtil$MachineSpecs r6 = machineSpecs
            r6.hasArmV6 = r8
            r6.hasArmV7 = r2
            r6.hasFpu = r3
            r6.hasMips = r1
            r6.hasNeon = r9
            r6.hasX86 = r4
            r6.is64bits = r5
            r6.bogoMIPS = r7
            r6.processors = r10
            r6.frequency = r0
            boolean r0 = isCompatible
            return r0
        L_0x0341:
            r0 = move-exception
        L_0x0342:
            close(r12)
            close(r6)
            throw r0
        L_0x0349:
            boolean r0 = isCompatible
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.videolan.libvlc.util.VLCUtil.hasCompatibleCPU(android.content.Context):boolean");
    }

    public static MachineSpecs getMachineSpecs() {
        return machineSpecs;
    }

    private static class ElfData {
        String att_arch;
        boolean att_fpu;
        int e_machine;
        int e_shnum;
        int e_shoff;
        boolean is64bits;
        ByteOrder order;
        int sh_offset;
        int sh_size;

        private ElfData() {
        }
    }

    private static File searchLibrary(ApplicationInfo applicationInfo) {
        String[] strArr;
        if ((applicationInfo.flags & 1) != 0) {
            strArr = System.getProperty("java.library.path").split(":");
        } else {
            strArr = new String[]{applicationInfo.nativeLibraryDir};
        }
        if (strArr[0] == null) {
            Log.e(TAG, "can't find library path");
            return null;
        }
        for (String file : strArr) {
            File file2 = new File(file, "libvlcjni.so");
            if (file2.exists() && file2.canRead()) {
                return file2;
            }
        }
        Log.e(TAG, "WARNING: Can't find shared library");
        return null;
    }

    private static ElfData readLib(File file) {
        RandomAccessFile randomAccessFile;
        try {
            randomAccessFile = new RandomAccessFile(file, "r");
            try {
                ElfData elfData = new ElfData();
                if (!readHeader(randomAccessFile, elfData)) {
                    close(randomAccessFile);
                    return null;
                }
                int i = elfData.e_machine;
                if (!(i == 3 || i == 8)) {
                    if (i == 40) {
                        randomAccessFile.close();
                        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "r");
                        try {
                            if (!readSection(randomAccessFile2, elfData)) {
                                close(randomAccessFile2);
                                return null;
                            }
                            randomAccessFile2.close();
                            randomAccessFile = new RandomAccessFile(file, "r");
                            if (!readArmAttributes(randomAccessFile, elfData)) {
                                close(randomAccessFile);
                                return null;
                            }
                            close(randomAccessFile);
                            return elfData;
                        } catch (IOException e) {
                            e = e;
                            randomAccessFile = randomAccessFile2;
                            try {
                                e.printStackTrace();
                                close(randomAccessFile);
                                return null;
                            } catch (Throwable th) {
                                th = th;
                                close(randomAccessFile);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            randomAccessFile = randomAccessFile2;
                            close(randomAccessFile);
                            throw th;
                        }
                    } else if (!(i == 62 || i == 183)) {
                        close(randomAccessFile);
                        return null;
                    }
                }
                close(randomAccessFile);
                return elfData;
            } catch (IOException e2) {
                e = e2;
                e.printStackTrace();
                close(randomAccessFile);
                return null;
            }
        } catch (IOException e3) {
            e = e3;
            randomAccessFile = null;
            e.printStackTrace();
            close(randomAccessFile);
            return null;
        } catch (Throwable th3) {
            th = th3;
            randomAccessFile = null;
            close(randomAccessFile);
            throw th;
        }
    }

    private static boolean readHeader(RandomAccessFile randomAccessFile, ElfData elfData) throws IOException {
        byte[] bArr = new byte[52];
        randomAccessFile.readFully(bArr);
        boolean z = false;
        if (bArr[0] == Byte.MAX_VALUE && bArr[1] == 69 && bArr[2] == 76 && bArr[3] == 70 && (bArr[4] == 1 || bArr[4] == 2)) {
            if (bArr[4] == 2) {
                z = true;
            }
            elfData.is64bits = z;
            elfData.order = bArr[5] == 1 ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            wrap.order(elfData.order);
            elfData.e_machine = wrap.getShort(18);
            elfData.e_shoff = wrap.getInt(32);
            elfData.e_shnum = wrap.getShort(48);
            return true;
        }
        Log.e(TAG, "ELF header invalid");
        return false;
    }

    private static boolean readSection(RandomAccessFile randomAccessFile, ElfData elfData) throws IOException {
        byte[] bArr = new byte[40];
        randomAccessFile.seek((long) elfData.e_shoff);
        int i = 0;
        while (i < elfData.e_shnum) {
            randomAccessFile.readFully(bArr);
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            wrap.order(elfData.order);
            if (wrap.getInt(4) != SHT_ARM_ATTRIBUTES) {
                i++;
            } else {
                elfData.sh_offset = wrap.getInt(16);
                elfData.sh_size = wrap.getInt(20);
                return true;
            }
        }
        return false;
    }

    private static boolean readArmAttributes(RandomAccessFile randomAccessFile, ElfData elfData) throws IOException {
        byte[] bArr = new byte[elfData.sh_size];
        randomAccessFile.seek((long) elfData.sh_offset);
        randomAccessFile.readFully(bArr);
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.order(elfData.order);
        if (wrap.get() != 65) {
            return false;
        }
        while (true) {
            if (wrap.remaining() <= 0) {
                break;
            }
            int position = wrap.position();
            int i = wrap.getInt();
            if (getString(wrap).equals("aeabi")) {
                while (wrap.position() < position + i) {
                    int position2 = wrap.position();
                    byte b = wrap.get();
                    int i2 = wrap.getInt();
                    if (b != 1) {
                        wrap.position(position2 + i2);
                    } else {
                        while (wrap.position() < position2 + i2) {
                            int uleb128 = getUleb128(wrap);
                            if (uleb128 == 6) {
                                elfData.att_arch = CPU_archs[getUleb128(wrap)];
                            } else if (uleb128 == 27) {
                                getUleb128(wrap);
                                elfData.att_fpu = true;
                            } else {
                                int i3 = uleb128 % 128;
                                if (i3 == 4 || i3 == 5 || i3 == 32 || (i3 > 32 && (i3 & 1) != 0)) {
                                    getString(wrap);
                                } else {
                                    getUleb128(wrap);
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    private static String getString(ByteBuffer byteBuffer) {
        char c;
        StringBuilder sb = new StringBuilder(byteBuffer.limit());
        while (byteBuffer.remaining() > 0 && (c = (char) byteBuffer.get()) != 0) {
            sb.append(c);
        }
        return sb.toString();
    }

    private static int getUleb128(ByteBuffer byteBuffer) {
        byte b;
        byte b2 = 0;
        do {
            b = byteBuffer.get();
            b2 = (b2 << 7) | (b & ByteCompanionObject.MAX_VALUE);
        } while ((b & ByteCompanionObject.MIN_VALUE) > 0);
        return b2;
    }

    public static Uri UriFromMrl(String str) {
        char[] charArray = str.toCharArray();
        StringBuilder sb = new StringBuilder(charArray.length * 2);
        int i = 0;
        while (i < charArray.length) {
            char c = charArray[i];
            if (c == '%' && charArray.length - i >= 3) {
                try {
                    int parseInt = Integer.parseInt(new String(charArray, i + 1, 2), 16);
                    if (URI_AUTHORIZED_CHARS.indexOf(parseInt) != -1) {
                        sb.append((char) parseInt);
                        i += 2;
                        i++;
                    }
                } catch (NumberFormatException unused) {
                }
            }
            sb.append(c);
            i++;
        }
        return Uri.parse(sb.toString());
    }

    public static String encodeVLCUri(Uri uri) {
        return encodeVLCString(uri.toString());
    }

    public static String encodeVLCString(String str) {
        char[] charArray = str.toCharArray();
        StringBuilder sb = new StringBuilder(charArray.length * 2);
        for (char c : charArray) {
            if (URI_AUTHORIZED_CHARS.indexOf(c) != -1) {
                sb.append("%");
                sb.append(Integer.toHexString(c));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static byte[] getThumbnail(LibVLC libVLC, Uri uri, int i, int i2) {
        if (uri.getLastPathSegment().endsWith(".iso")) {
            uri = Uri.parse("dvdsimple://" + uri.getEncodedPath());
        }
        Media media = new Media(libVLC, uri);
        byte[] thumbnail = getThumbnail(media, i, i2);
        media.release();
        return thumbnail;
    }

    public static byte[] getThumbnail(Media media, int i, int i2) {
        media.addOption(":no-audio");
        media.addOption(":no-spu");
        media.addOption(":no-osd");
        media.addOption(":input-fast-seek");
        return nativeGetThumbnail(media, i, i2);
    }

    private static void close(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
