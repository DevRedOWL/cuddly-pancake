package p007at.nineyards.anyline.camera;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import p007at.nineyards.anyline.C0718R;
import p007at.nineyards.anyline.camera.FlashControl;

/* renamed from: at.nineyards.anyline.camera.SimpleFlashView */
public class SimpleFlashView extends ImageView implements FlashControl {

    /* renamed from: a */
    private static final String f391a = SimpleFlashView.class.getSimpleName();

    /* renamed from: b */
    private final Object f392b;

    /* renamed from: c */
    private boolean f393c;

    /* renamed from: d */
    private int f394d;

    /* renamed from: e */
    private int f395e;

    /* renamed from: f */
    private int f396f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public boolean f397g;

    /* renamed from: h */
    private FlashControl.Mode f398h;

    /* renamed from: i */
    private CameraController f399i;

    public SimpleFlashView(Context context) {
        this(context, (AttributeSet) null);
    }

    public SimpleFlashView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SimpleFlashView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f392b = new Object();
        this.f393c = false;
        this.f397g = false;
        this.f398h = FlashControl.Mode.OFF;
        setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        setBackgroundResource(C0718R.C0720drawable.flash_control_background);
        this.f395e = C0718R.C0720drawable.flash_icon_off;
        this.f394d = C0718R.C0720drawable.flash_icon;
        this.f396f = C0718R.C0720drawable.flash_icon_auto;
        setImageResource(this.f395e);
        setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                SimpleFlashView.m117a(SimpleFlashView.this);
            }
        });
    }

    public void setAutoModeEnabled(boolean z) {
        this.f397g = z;
        if (!z && this.f398h == FlashControl.Mode.AUTO) {
            setMode(FlashControl.Mode.OFF);
        }
        if (z && this.f398h != FlashControl.Mode.AUTO) {
            setMode(FlashControl.Mode.AUTO);
        }
    }

    public void setMode(FlashControl.Mode mode) {
        this.f398h = mode;
        int i = C07615.f405a[this.f398h.ordinal()];
        if (i != 1) {
            if (i == 2) {
                setImageResource(this.f394d);
                setFlash(true);
            } else if (i == 3) {
                setImageResource(this.f395e);
                setFlash(false);
            }
        } else if (this.f397g) {
            setImageResource(this.f396f);
            setFlash(false);
        }
    }

    /* renamed from: at.nineyards.anyline.camera.SimpleFlashView$5 */
    static /* synthetic */ class C07615 {

        /* renamed from: a */
        static final /* synthetic */ int[] f405a = new int[FlashControl.Mode.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                at.nineyards.anyline.camera.FlashControl$Mode[] r0 = p007at.nineyards.anyline.camera.FlashControl.Mode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f405a = r0
                int[] r0 = f405a     // Catch:{ NoSuchFieldError -> 0x0014 }
                at.nineyards.anyline.camera.FlashControl$Mode r1 = p007at.nineyards.anyline.camera.FlashControl.Mode.AUTO     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f405a     // Catch:{ NoSuchFieldError -> 0x001f }
                at.nineyards.anyline.camera.FlashControl$Mode r1 = p007at.nineyards.anyline.camera.FlashControl.Mode.ON     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f405a     // Catch:{ NoSuchFieldError -> 0x002a }
                at.nineyards.anyline.camera.FlashControl$Mode r1 = p007at.nineyards.anyline.camera.FlashControl.Mode.OFF     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p007at.nineyards.anyline.camera.SimpleFlashView.C07615.<clinit>():void");
        }
    }

    public void setFlashOnIfAuto(boolean z) {
        synchronized (this.f392b) {
            if (this.f397g && this.f398h == FlashControl.Mode.AUTO && z != this.f393c) {
                if (z) {
                    setFlash(true);
                    this.f393c = true;
                } else {
                    setFlash(false);
                    this.f393c = false;
                }
            }
        }
    }

    public void setFlashResources(int i, int i2, int i3) {
        if (i == 0 || i2 == 0 || (i3 == 0 && this.f397g)) {
            throw new IllegalArgumentException("Given resources ids are not valid (0).");
        }
        this.f394d = i;
        this.f395e = i2;
        this.f396f = i3;
        setMode(this.f398h);
    }

    public void setCameraController(final CameraController cameraController) {
        this.f399i = cameraController;
        if (this.f398h == FlashControl.Mode.ON) {
            post(new Runnable() {
                public final void run() {
                    SimpleFlashView simpleFlashView = SimpleFlashView.this;
                    simpleFlashView.setMode(simpleFlashView.f397g ? FlashControl.Mode.AUTO : FlashControl.Mode.OFF);
                }
            });
        }
        if (!getContext().getPackageManager().hasSystemFeature("android.hardware.camera.flash")) {
            post(new Runnable() {
                public final void run() {
                    SimpleFlashView.this.setVisibility(8);
                }
            });
        } else {
            post(new Runnable() {
                public final void run() {
                    SimpleFlashView.this.setVisibility(cameraController.getCameraFeatures().isFlashSupported() ? 0 : 8);
                }
            });
        }
    }

    private void setFlash(boolean z) {
        synchronized (this.f392b) {
            if (this.f399i != null) {
                this.f399i.setFlashOn(z);
                this.f393c = z;
            }
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m117a(SimpleFlashView simpleFlashView) {
        int i = C07615.f405a[simpleFlashView.f398h.ordinal()];
        if (i == 1) {
            simpleFlashView.setMode(FlashControl.Mode.ON);
        } else if (i == 2) {
            simpleFlashView.setMode(FlashControl.Mode.OFF);
        } else if (i == 3) {
            if (simpleFlashView.f397g) {
                simpleFlashView.setMode(FlashControl.Mode.AUTO);
            } else {
                simpleFlashView.setMode(FlashControl.Mode.ON);
            }
        }
    }
}
