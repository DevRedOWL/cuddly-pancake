package p008c.p009a.p014b;

import android.app.AlarmManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.core.app.NotificationCompat;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Random;
import java.util.UUID;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.altbeacon.bluetooth.Pdu;
import p008c.p009a.p014b.C0871f;
import p008c.p009a.p014b.C0882h;
import p008c.p009a.p017d.p019b.C0911a;
import p008c.p009a.p017d.p019b.C0929d;
import p008c.p009a.p024e.p026b.C0962a;
import p008c.p009a.p031f.C0985a;
import p008c.p009a.p031f.C0986b;
import p008c.p009a.p031f.C0988c;

/* renamed from: c.a.b.g */
public class C0878g {

    /* renamed from: a */
    public static C0929d.C0930a f853a;

    /* renamed from: c.a.b.g$a */
    public static class C0879a implements C0871f {

        /* renamed from: f */
        public static final C0882h.C0886c f854f = new C0882h.C0886c(0, 80);

        /* renamed from: a */
        public final C0986b.C0987a f855a = new C0986b.C0987a(-2084658916, -1523279691, 227976017, 1331110099, 2137325827, -1050070171, 1349831955, -1612217311);

        /* renamed from: b */
        public C0871f.C0877c f856b;

        /* renamed from: c */
        public C0882h.C0886c f857c;

        /* renamed from: d */
        public final C0871f.C0876b f858d;

        /* renamed from: e */
        public final C0871f.C0872a f859e;

        /* renamed from: c.a.b.g$a$a */
        public class C0880a implements C0871f.C0876b {
            public C0880a() {
            }
        }

        /* renamed from: c.a.b.g$a$b */
        public class C0881b extends C0871f.C0872a {
            public C0881b(C0879a aVar, byte b, int i, int i2, int i3, C0871f.C0876b bVar) {
                super(b, i, i2, i3, bVar);
            }
        }

        public C0879a() {
            C0880a aVar = new C0880a();
            this.f858d = aVar;
            this.f859e = new C0881b(this, (byte) -66, 1, 1, 16, aVar);
        }

        /* renamed from: a */
        public int mo12968a() {
            return 80;
        }

        /* renamed from: a */
        public void mo12969a(C0871f.C0877c cVar) {
            this.f856b = cVar;
        }

        /* renamed from: a */
        public void mo12970a(byte[] bArr) {
            if (this.f857c.f869c) {
                this.f856b.mo12949a(bArr);
                return;
            }
            C0871f.C0872a aVar = this.f859e;
            if (aVar != null) {
                aVar.mo12966a(bArr, 0, bArr.length);
                return;
            }
            throw null;
        }

        /* renamed from: a */
        public byte[] mo12971a(byte[] bArr, C0882h.C0886c cVar) {
            this.f857c = cVar;
            if (cVar.f869c) {
                return bArr;
            }
            if (bArr.length < 1 || bArr.length > 13) {
                throw new IllegalArgumentException();
            }
            byte[] bArr2 = new byte[18];
            byte[] bArr3 = new byte[16];
            new Random().nextBytes(bArr3);
            bArr3[1] = (byte) (bArr.length & 255);
            System.arraycopy(bArr, 0, bArr3, 2, bArr.length);
            bArr3[bArr.length + 2] = (byte) (C0985a.Dallas.mo13041a(bArr, 0, bArr.length - 1) & 255);
            byte[] b = C0986b.m581b(this.f855a, bArr3);
            System.arraycopy(b, 0, bArr2, 1, b.length);
            bArr2[0] = -66;
            bArr2[17] = (byte) (C0985a.Dallas.mo13041a(bArr2, 0, 16) & 255);
            return bArr2;
        }
    }

    /* renamed from: a */
    public static int m455a(byte[] bArr, int i) {
        if (bArr.length < i + 4) {
            return 0;
        }
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: a */
    public static final AlarmManager m456a(Context context) {
        Object systemService;
        Intrinsics.checkNotNullParameter(context, "$this$getAlarmManager");
        if (Build.VERSION.SDK_INT >= 23) {
            systemService = context.getSystemService(AlarmManager.class);
        } else {
            systemService = context.getSystemService(NotificationCompat.CATEGORY_ALARM);
            if (!(systemService instanceof AlarmManager)) {
                systemService = null;
            }
        }
        return (AlarmManager) systemService;
    }

    /* renamed from: a */
    public static /* synthetic */ Object m457a(C0962a aVar, String str, boolean z, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return aVar.mo13023a(str, z, continuation);
    }

    /* renamed from: a */
    public static void m458a() {
        C0929d.C0930a aVar = f853a;
        if (aVar != null) {
            C0929d.C0930a.m514a(aVar);
            f853a = null;
        }
    }

    /* renamed from: a */
    public static void m460a(C0929d.C0932c cVar, C0911a.C0914c cVar2) {
        m458a();
        f853a = new C0929d.C0930a(cVar, cVar2);
    }

    /* renamed from: a */
    public static boolean m461a(byte[] bArr) {
        return bArr.length >= 5 && bArr[0] == 21;
    }

    /* renamed from: a */
    public static boolean m462a(byte[] bArr, byte[] bArr2) {
        if (bArr.length < bArr2.length) {
            return false;
        }
        for (int i = 0; i < bArr2.length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static byte[] m463a(int i) {
        return ByteBuffer.allocate(7).order(ByteOrder.LITTLE_ENDIAN).put((byte) 3).putInt(i).put((byte) 0).put((byte) 0).array();
    }

    /* renamed from: a */
    public static byte[] m464a(int i, String str) {
        return ByteBuffer.allocate(12).order(ByteOrder.LITTLE_ENDIAN).put(Pdu.GATT_SERVICE_UUID_PDU_TYPE).putShort((short) (i & 65535)).put(C0988c.m584a(str)).array();
    }

    /* renamed from: a */
    public static byte[] m465a(String str) {
        byte[] a = C0988c.m584a(str);
        if (a.length >= 8) {
            byte[] bArr = new byte[((a.length > 8 ? 9 : 8) + 2)];
            bArr[0] = 1;
            bArr[1] = 8;
            System.arraycopy(a, 0, bArr, 2, 8);
            if (a.length > 8) {
                bArr[10] = a[8];
            }
            return bArr;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: b */
    public static long m466b(byte[] bArr, int i) {
        if (bArr.length < i + 8) {
            return 0;
        }
        return (((long) (bArr[i + 7] & 255)) << 56) | ((long) (bArr[i] & 255)) | (((long) (bArr[i + 1] & 255)) << 8) | (((long) (bArr[i + 2] & 255)) << 16) | (((long) (bArr[i + 3] & 255)) << 24) | (((long) (bArr[i + 4] & 255)) << 32) | (((long) (bArr[i + 5] & 255)) << 40) | (((long) (bArr[i + 6] & 255)) << 48);
    }

    /* renamed from: b */
    public static boolean m467b(byte[] bArr) {
        return bArr.length >= 5 && bArr[0] == 2;
    }

    /* renamed from: c */
    public static UUID m468c(byte[] bArr, int i) {
        if (i + 16 > bArr.length) {
            return null;
        }
        ByteBuffer wrap = ByteBuffer.wrap(bArr, i, bArr.length - i);
        return new UUID(wrap.getLong(), wrap.getLong());
    }

    /* renamed from: c */
    public static boolean m469c(byte[] bArr) {
        return bArr.length >= 10 && bArr[0] == 13;
    }

    /* renamed from: d */
    public static boolean m470d(byte[] bArr) {
        return bArr.length >= 8 && bArr[0] == 4 && bArr[7] == 4;
    }

    /* renamed from: e */
    public static boolean m471e(byte[] bArr) {
        return bArr.length >= 4 && bArr[0] == 23 && bArr[3] == 4;
    }

    /* renamed from: f */
    public static boolean m472f(byte[] bArr) {
        return bArr.length >= 4 && bArr[0] == 23 && bArr[3] == 1;
    }

    /* renamed from: g */
    public static boolean m473g(byte[] bArr) {
        return bArr.length >= 8 && bArr[0] == 4 && bArr[7] == 1;
    }

    /* renamed from: a */
    public static final void m459a(Context context, String str, String str2, String str3, int i) {
        Object systemService;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(str, "notificationChannelId");
        Intrinsics.checkNotNullParameter(str2, "notificationTitle");
        Intrinsics.checkNotNullParameter(str3, "notificationText");
        Intrinsics.checkNotNullParameter(context, "$this$getNotificationManager");
        Intent intent = null;
        if (Build.VERSION.SDK_INT >= 23) {
            systemService = context.getSystemService(NotificationManager.class);
        } else {
            systemService = context.getSystemService("notification");
            if (!(systemService instanceof NotificationManager)) {
                systemService = null;
            }
        }
        NotificationManager notificationManager = (NotificationManager) systemService;
        if (notificationManager != null) {
            Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (launchIntentForPackage != null) {
                intent = launchIntentForPackage.addFlags(67108864);
            }
            PendingIntent activity = PendingIntent.getActivity(context, 0, intent, 268435456);
            if (Build.VERSION.SDK_INT >= 26 && notificationManager.getNotificationChannel(str) == null) {
                NotificationChannel notificationChannel = new NotificationChannel(str, str, 3);
                notificationChannel.setVibrationPattern(new long[]{0, 350, 200, 350});
                notificationChannel.enableVibration(true);
                notificationManager.createNotificationChannel(notificationChannel);
            }
            Notification build = new NotificationCompat.Builder(context, str).setSmallIcon(i).setColor(0).setContentTitle(str2).setContentText(str3).setContentIntent(activity).setVibrate(new long[]{0, 350, 200, 350}).setAutoCancel(true).build();
            Intrinsics.checkNotNullExpressionValue(build, "NotificationCompat.Build…rue)\n            .build()");
            notificationManager.notify(0, build);
        }
    }
}
