package p007at.nineyards.anyline;

import android.content.Context;
import android.util.Log;
import java.lang.Thread;
import p007at.nineyards.anyline.camera.AnylineBaseView;
import p007at.nineyards.anyline.modules.barcode.BarcodeScanView;
import p007at.nineyards.anyline.modules.debitcard.DebitCardScanView;
import p007at.nineyards.anyline.modules.document.DocumentScanView;
import p007at.nineyards.anyline.modules.energy.EnergyScanView;
import p007at.nineyards.anyline.modules.licenseplate.LicensePlateScanView;
import p007at.nineyards.anyline.modules.mrz.MrzScanView;
import p007at.nineyards.anyline.modules.ocr.AnylineOcrScanView;

/* renamed from: at.nineyards.anyline.AnylineController */
public class AnylineController {
    public static final String ANYLINE_OCR_MODULE_IDENTIFIER = "ANYLINE_OCR";
    public static final String BARCODE_MODULE_IDENTIFIER = "BARCODE";
    public static final String DEBITCARD_MODULE_IDENTIFIER = "DEBITCARD";
    public static final String DOCUMENT_MODULE_IDENTIFIER = "DOCUMENT";
    public static final String ENERGY_MODULE_IDENTIFIER = "ENERGY";
    public static final String GENERIC_MODULE_IDENTIFIER = "GENERIC";
    public static final String LICENSE_PLATE_MODULE_IDENTIFIER = "LICENSE_PLATE";
    public static final String MRZ_MODULE_IDENTIFIER = "MRZ";

    /* renamed from: a */
    private static final String f142a = AnylineController.class.getSimpleName();

    /* renamed from: b */
    private final Object f143b = new Object();

    /* renamed from: c */
    private final Context f144c;

    /* renamed from: d */
    private final String f145d;

    /* renamed from: e */
    private final AnylineListener f146e;

    /* renamed from: f */
    private final String f147f;

    /* renamed from: g */
    private C0722a f148g;

    static {
        System.loadLibrary("gnustl_shared");
        System.loadLibrary("opencv_java3");
        System.loadLibrary("anylineCore");
    }

    public AnylineController(Context context, String str, AnylineBaseView anylineBaseView, AnylineListener anylineListener) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Anyline license key must not be null or empty!");
        } else if (anylineListener == null) {
            throw new IllegalArgumentException("AnylineListener must not be null!");
        } else if (context.getPackageManager().checkPermission("android.permission.INTERNET", context.getPackageName()) != -1) {
            this.f144c = context;
            this.f145d = str;
            this.f146e = anylineListener;
            if (anylineBaseView == null) {
                this.f147f = GENERIC_MODULE_IDENTIFIER;
            } else if (anylineBaseView instanceof MrzScanView) {
                this.f147f = MRZ_MODULE_IDENTIFIER;
            } else if (anylineBaseView instanceof EnergyScanView) {
                this.f147f = ENERGY_MODULE_IDENTIFIER;
            } else if (anylineBaseView instanceof BarcodeScanView) {
                this.f147f = BARCODE_MODULE_IDENTIFIER;
            } else if (anylineBaseView instanceof DebitCardScanView) {
                this.f147f = DEBITCARD_MODULE_IDENTIFIER;
            } else if (anylineBaseView instanceof AnylineOcrScanView) {
                this.f147f = ANYLINE_OCR_MODULE_IDENTIFIER;
            } else if (anylineBaseView instanceof DocumentScanView) {
                this.f147f = DOCUMENT_MODULE_IDENTIFIER;
            } else if (anylineBaseView instanceof LicensePlateScanView) {
                this.f147f = LICENSE_PLATE_MODULE_IDENTIFIER;
            } else {
                this.f147f = GENERIC_MODULE_IDENTIFIER;
            }
            this.f148g = new C0722a(context, str, this.f147f, anylineListener);
            this.f148g.mo11883a("anyline_assets.json");
            setImageProvider(anylineBaseView);
        } else {
            throw new RuntimeException("No Internet Permission granted! Please set the permission in the Manifest.");
        }
    }

    public void loadScript(String str) {
        loadScript(str, (String) null);
    }

    public void loadScript(String str, String str2) {
        m20a(false);
        this.f148g.mo11880a(str, str2);
    }

    public void loadScript(String str, String str2, String str3) {
        m20a(false);
        this.f148g.mo11881a(str, str2, str3);
    }

    public void loadCmdFile(String str) {
        loadCmdFile(str, (String) null);
    }

    public void loadCmdFile(String str, String str2) {
        m20a(false);
        this.f148g.mo11885b(str, str2);
    }

    public void setStartVariable(String str, Object obj) {
        synchronized (this.f143b) {
            this.f148g.mo11879a(str, obj);
        }
    }

    public void setCancelOnResult(boolean z) {
        synchronized (this.f143b) {
            this.f148g.mo11882a(z);
        }
    }

    public void setAssetJsonPaths(String... strArr) {
        synchronized (this.f143b) {
            this.f148g.mo11883a(strArr);
        }
    }

    public void start() {
        synchronized (this.f143b) {
            if (this.f148g.getState() == Thread.State.TERMINATED || this.f148g.mo11888c()) {
                m20a(true);
            }
            System.gc();
            if (!this.f148g.isAlive()) {
                this.f148g.start();
            } else {
                Log.e(f142a, "Scanning was already started");
            }
        }
    }

    public void cancel() {
        synchronized (this.f143b) {
            if (this.f148g.getState() != Thread.State.NEW) {
                this.f148g.mo11884b();
            }
        }
    }

    public void setDebug(boolean z) {
        synchronized (this.f143b) {
            this.f148g.mo11887c(z);
        }
    }

    public boolean isDebug() {
        boolean d;
        synchronized (this.f143b) {
            d = this.f148g.mo11889d();
        }
        return d;
    }

    public boolean isRunning() {
        boolean z;
        synchronized (this.f143b) {
            z = this.f148g.isAlive() && !this.f148g.mo11888c();
        }
        return z;
    }

    public void setImageProvider(ImageProvider imageProvider) {
        String str;
        synchronized (this.f143b) {
            this.f148g.mo11876a(imageProvider);
            if (imageProvider instanceof AnylineBaseView) {
                ((AnylineBaseView) imageProvider).setLicenseKey(this.f145d);
                if (imageProvider instanceof MrzScanView) {
                    str = MRZ_MODULE_IDENTIFIER;
                } else if (imageProvider instanceof EnergyScanView) {
                    str = ENERGY_MODULE_IDENTIFIER;
                } else if (imageProvider instanceof BarcodeScanView) {
                    str = BARCODE_MODULE_IDENTIFIER;
                } else if (imageProvider instanceof DebitCardScanView) {
                    str = DEBITCARD_MODULE_IDENTIFIER;
                } else if (imageProvider instanceof AnylineOcrScanView) {
                    str = ANYLINE_OCR_MODULE_IDENTIFIER;
                } else if (imageProvider instanceof DocumentScanView) {
                    str = DOCUMENT_MODULE_IDENTIFIER;
                } else {
                    str = imageProvider instanceof LicensePlateScanView ? LICENSE_PLATE_MODULE_IDENTIFIER : GENERIC_MODULE_IDENTIFIER;
                }
                if (!this.f148g.mo11890e().equals(str)) {
                    throw new RuntimeException("Illegal usage.");
                }
            }
        }
    }

    public void setReportingEnabled(boolean z) {
        synchronized (this.f143b) {
            this.f148g.mo11886b(z);
        }
    }

    public void reportIncludeValues(String str) {
        synchronized (this.f143b) {
            this.f148g.mo11878a(str);
        }
    }

    public void reportTriggerScanningCanceled() {
        synchronized (this.f143b) {
            this.f148g.mo11875a();
        }
    }

    public void setWorkerThreadUncaughtExceptionHandler(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        synchronized (this.f143b) {
            this.f148g.setUncaughtExceptionHandler(uncaughtExceptionHandler);
        }
    }

    /* renamed from: a */
    private void m20a(boolean z) {
        synchronized (this.f143b) {
            if (this.f148g.getState() != Thread.State.NEW) {
                this.f148g.mo11884b();
                C0722a aVar = new C0722a(this.f144c, this.f145d, this.f147f, this.f146e);
                aVar.mo11877a(this.f148g, z);
                this.f148g = aVar;
            }
        }
    }

    public String getLicenseKey() {
        return this.f145d;
    }
}
