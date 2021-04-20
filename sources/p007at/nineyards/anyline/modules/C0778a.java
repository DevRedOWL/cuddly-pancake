package p007at.nineyards.anyline.modules;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build;
import android.util.Log;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.imageutils.JfifUtil;
import p007at.nineyards.anyline.modules.AnylineBaseModuleView;

/* renamed from: at.nineyards.anyline.modules.a */
final class C0778a {
    /* access modifiers changed from: private */

    /* renamed from: A */
    public int f569A = 500;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public int f570B = 3500;

    /* renamed from: C */
    private String f571C = "6";

    /* renamed from: D */
    private String f572D = "5";

    /* renamed from: E */
    private String f573E = ExifInterface.GPS_MEASUREMENT_3D;

    /* renamed from: F */
    private String f574F = "0";

    /* renamed from: G */
    private String f575G = "-4";

    /* renamed from: H */
    private String f576H;

    /* renamed from: I */
    private String f577I;

    /* renamed from: J */
    private boolean f578J;
    /* access modifiers changed from: private */

    /* renamed from: K */
    public boolean f579K;

    /* renamed from: L */
    private final C0780a f580L;

    /* renamed from: a */
    protected int f581a;

    /* renamed from: b */
    private SensorManager f582b;

    /* renamed from: c */
    private SensorEventListener f583c;

    /* renamed from: d */
    private AnylineBaseModuleView.BrightnessFeedback f584d = AnylineBaseModuleView.BrightnessFeedback.OK;

    /* renamed from: e */
    private int f585e = 40;

    /* renamed from: f */
    private int f586f = 125;

    /* renamed from: g */
    private int f587g = 5;

    /* renamed from: h */
    private int f588h = 5;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public int f589i = 5;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public int f590j = 15;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public int f591k = 10;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public int f592l = 20;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public int f593m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public int f594n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public int f595o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public int f596p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public int f597q;

    /* renamed from: r */
    private int f598r;

    /* renamed from: s */
    private int f599s;

    /* renamed from: t */
    private int f600t = 35;

    /* renamed from: u */
    private int f601u = JfifUtil.MARKER_RST7;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public int f602v = 2;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public int f603w = 2;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public int f604x = 2;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public int f605y = 25;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public int f606z = 170;

    /* renamed from: at.nineyards.anyline.modules.a$a */
    interface C0780a {
        /* renamed from: a */
        void mo12573a(AnylineBaseModuleView.BrightnessFeedback brightnessFeedback);
    }

    /* renamed from: A */
    static /* synthetic */ int m176A(C0778a aVar) {
        int i = aVar.f597q;
        aVar.f597q = i + 1;
        return i;
    }

    /* renamed from: B */
    static /* synthetic */ int m177B(C0778a aVar) {
        int i = aVar.f597q;
        aVar.f597q = i - 1;
        return i;
    }

    /* renamed from: d */
    static /* synthetic */ int m183d(C0778a aVar) {
        int i = aVar.f594n;
        aVar.f594n = i + 1;
        return i;
    }

    /* renamed from: e */
    static /* synthetic */ int m185e(C0778a aVar) {
        int i = aVar.f594n;
        aVar.f594n = i - 1;
        return i;
    }

    /* renamed from: i */
    static /* synthetic */ int m189i(C0778a aVar) {
        int i = aVar.f596p;
        aVar.f596p = i + 1;
        return i;
    }

    /* renamed from: j */
    static /* synthetic */ int m190j(C0778a aVar) {
        int i = aVar.f596p;
        aVar.f596p = i - 1;
        return i;
    }

    /* renamed from: p */
    static /* synthetic */ int m196p(C0778a aVar) {
        int i = aVar.f593m;
        aVar.f593m = i + 1;
        return i;
    }

    /* renamed from: q */
    static /* synthetic */ int m197q(C0778a aVar) {
        int i = aVar.f593m;
        aVar.f593m = i - 1;
        return i;
    }

    /* renamed from: v */
    static /* synthetic */ int m202v(C0778a aVar) {
        int i = aVar.f595o;
        aVar.f595o = i + 1;
        return i;
    }

    /* renamed from: w */
    static /* synthetic */ int m203w(C0778a aVar) {
        int i = aVar.f595o;
        aVar.f595o = i - 1;
        return i;
    }

    C0778a(C0780a aVar) {
        String str = this.f571C;
        this.f576H = str;
        this.f577I = str;
        this.f578J = false;
        this.f579K = false;
        this.f580L = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo12615a(boolean z) {
        this.f579K = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo12613a(int i, int i2, int i3, int i4) {
        this.f585e = i;
        this.f586f = i2;
        this.f589i = i3;
        this.f590j = i4;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo12617b(int i, int i2, int i3, int i4) {
        this.f587g = i;
        this.f588h = i2;
        this.f591k = i3;
        this.f592l = i4;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo12611a() {
        this.f598r = 0;
        this.f599s = 0;
        this.f596p = 0;
        this.f594n = 0;
        this.f595o = 0;
        this.f593m = 0;
        this.f597q = 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public AnylineBaseModuleView.BrightnessFeedback m184d() {
        if (this.f598r == this.f587g || (this.f578J && this.f594n == this.f591k)) {
            return AnylineBaseModuleView.BrightnessFeedback.TOO_DARK;
        }
        if (this.f599s == this.f588h && this.f578J && this.f596p == this.f592l) {
            return AnylineBaseModuleView.BrightnessFeedback.TOO_BRIGHT;
        }
        return AnylineBaseModuleView.BrightnessFeedback.OK;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo12612a(double d) {
        if (!Build.MODEL.contains("bt2pro")) {
            this.f584d = AnylineBaseModuleView.BrightnessFeedback.OK;
            m180a(d, this.f585e, this.f586f);
            AnylineBaseModuleView.BrightnessFeedback d2 = m184d();
            if (this.f584d != d2) {
                this.f584d = d2;
                this.f580L.mo12573a(d2);
                return;
            }
            return;
        }
        m180a(d, this.f600t, this.f601u);
    }

    /* renamed from: a */
    private void m180a(double d, int i, int i2) {
        if (d < ((double) i)) {
            int i3 = this.f598r;
            if (i3 < this.f587g) {
                this.f598r = i3 + 1;
            }
        } else {
            int i4 = this.f598r;
            if (i4 > 0) {
                this.f598r = i4 - 1;
            }
        }
        if (d > ((double) i2)) {
            int i5 = this.f599s;
            if (i5 < this.f588h) {
                this.f599s = i5 + 1;
            }
        } else {
            int i6 = this.f599s;
            if (i6 > 0) {
                this.f599s = i6 - 1;
            }
        }
        if (this.f579K) {
            Log.d("BrightnessHelper", "LightLevel - brightness: " + d + " count low (min value): " + this.f598r + "(" + i + "), high: " + this.f599s + "(" + i2 + ")");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo12614a(Context context) {
        if (this.f582b == null) {
            this.f582b = (SensorManager) context.getSystemService("sensor");
            this.f583c = new SensorEventListener() {
                public final void onAccuracyChanged(Sensor sensor, int i) {
                }

                public final void onSensorChanged(SensorEvent sensorEvent) {
                    C0778a.this.f581a = (int) sensorEvent.values[0];
                    if (!Build.MODEL.contains("bt2pro")) {
                        if (C0778a.this.f581a < C0778a.this.f589i) {
                            if (C0778a.this.f594n < C0778a.this.f591k) {
                                C0778a.m183d(C0778a.this);
                            }
                        } else if (C0778a.this.f594n > 0) {
                            C0778a.m185e(C0778a.this);
                        }
                        if (C0778a.this.f581a > C0778a.this.f590j) {
                            if (C0778a.this.f596p < C0778a.this.f592l) {
                                C0778a.m189i(C0778a.this);
                            }
                        } else if (C0778a.this.f596p > 0) {
                            C0778a.m190j(C0778a.this);
                        }
                        if (C0778a.this.f579K) {
                            Log.d("BrightnessHelper", "LightLevel - ambient: " + C0778a.this.f581a + " Count low (min count):  " + C0778a.this.f594n + "(" + C0778a.this.f591k + ") , high (max count) : " + C0778a.this.f596p + " (" + C0778a.this.f592l + ")");
                        }
                        AnylineBaseModuleView.BrightnessFeedback unused = C0778a.this.m184d();
                        return;
                    }
                    if (C0778a.this.f581a <= C0778a.this.f605y) {
                        if (C0778a.this.f593m < C0778a.this.f603w) {
                            C0778a.m196p(C0778a.this);
                        }
                    } else if (C0778a.this.f593m > 0) {
                        C0778a.m197q(C0778a.this);
                    }
                    if (C0778a.this.f581a <= C0778a.this.f605y || C0778a.this.f581a >= C0778a.this.f606z) {
                        if (C0778a.this.f594n > 0) {
                            C0778a.m185e(C0778a.this);
                        }
                    } else if (C0778a.this.f594n < C0778a.this.f602v) {
                        C0778a.m183d(C0778a.this);
                    }
                    if (C0778a.this.f581a < C0778a.this.f606z || C0778a.this.f581a >= C0778a.this.f569A) {
                        if (C0778a.this.f595o > 0) {
                            C0778a.m203w(C0778a.this);
                        }
                    } else if (C0778a.this.f595o < C0778a.this.f603w) {
                        C0778a.m202v(C0778a.this);
                    }
                    if (C0778a.this.f581a < C0778a.this.f569A || C0778a.this.f581a >= C0778a.this.f570B) {
                        if (C0778a.this.f596p > 0) {
                            C0778a.m190j(C0778a.this);
                        }
                    } else if (C0778a.this.f596p < C0778a.this.f604x) {
                        C0778a.m189i(C0778a.this);
                    }
                    if (C0778a.this.f581a >= C0778a.this.f570B) {
                        if (C0778a.this.f597q < C0778a.this.f603w) {
                            C0778a.m176A(C0778a.this);
                        }
                    } else if (C0778a.this.f597q > 0) {
                        C0778a.m177B(C0778a.this);
                    }
                    if (C0778a.this.f579K) {
                        Log.d("BrightnessHelper", "LightLevel - ambient: " + C0778a.this.f581a + " Count extralow (min count):  " + C0778a.this.f593m + "(" + C0778a.this.f603w + ") , low (max count) : " + C0778a.this.f594n + "(" + C0778a.this.f602v + ") , medium (max count) : " + C0778a.this.f595o + " (" + C0778a.this.f603w + ") , high (max count) : " + C0778a.this.f596p + " (" + C0778a.this.f604x + ") , extra high (max count) : " + C0778a.this.f597q + " (" + C0778a.this.f603w + ")");
                    }
                    C0778a.m178C(C0778a.this);
                }
            };
        }
        this.f582b.registerListener(this.f583c, this.f582b.getDefaultSensor(5), 3);
        this.f578J = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo12616b() {
        SensorEventListener sensorEventListener;
        SensorManager sensorManager = this.f582b;
        if (sensorManager != null && (sensorEventListener = this.f583c) != null) {
            sensorManager.unregisterListener(sensorEventListener);
        }
    }

    /* renamed from: c */
    public final AnylineBaseModuleView.BrightnessFeedback mo12618c() {
        return this.f584d;
    }

    /* renamed from: C */
    static /* synthetic */ void m178C(C0778a aVar) {
        if (aVar.f595o == aVar.f603w) {
            aVar.f577I = aVar.f573E;
        }
        if (aVar.f594n == aVar.f602v || aVar.f598r == aVar.f587g) {
            aVar.f577I = aVar.f572D;
        } else if (aVar.f596p == aVar.f604x && aVar.f599s == aVar.f588h) {
            aVar.f577I = aVar.f574F;
        }
        if (aVar.f593m == aVar.f603w) {
            aVar.f577I = aVar.f571C;
        }
        if (aVar.f597q == aVar.f603w) {
            aVar.f577I = aVar.f575G;
        }
        if (!aVar.f576H.equals(aVar.f577I)) {
            aVar.f576H = aVar.f577I;
        }
    }
}
