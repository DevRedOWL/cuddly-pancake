package p007at.nineyards.anyline;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p007at.nineyards.anyline.camera.AnylineBaseView;
import p007at.nineyards.anyline.core.AnylineCore;
import p007at.nineyards.anyline.core.AnylineCoreDelegate;
import p007at.nineyards.anyline.core.AnylineException;
import p007at.nineyards.anyline.core.ArgumentException;
import p007at.nineyards.anyline.core.LicenseException;
import p007at.nineyards.anyline.core.Map_String_Shared_ptr_Variable;
import p007at.nineyards.anyline.core.RunFailure;
import p007at.nineyards.anyline.core.SyntaxException;
import p007at.nineyards.anyline.core.Variable;
import p007at.nineyards.anyline.models.AnylineImage;
import p007at.nineyards.anyline.reporter.ReportingService;
import p007at.nineyards.anyline.util.AssetUtil;

/* renamed from: at.nineyards.anyline.a */
final class C0722a extends Thread {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final String f152a;

    /* renamed from: b */
    private final Object f153b = new Object();

    /* renamed from: c */
    private final File f154c;

    /* renamed from: d */
    private final Context f155d;

    /* renamed from: e */
    private final String f156e;

    /* renamed from: f */
    private final String f157f;

    /* renamed from: g */
    private AnylineCore f158g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final Handler f159h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final AnylineListener f160i;

    /* renamed from: j */
    private boolean f161j = false;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f162k;

    /* renamed from: l */
    private String f163l = null;

    /* renamed from: m */
    private String f164m = null;

    /* renamed from: n */
    private String f165n = null;

    /* renamed from: o */
    private ImageProvider f166o;

    /* renamed from: p */
    private Map_String_Shared_ptr_Variable f167p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public boolean f168q = true;

    /* renamed from: r */
    private boolean f169r = true;

    /* renamed from: s */
    private boolean f170s = false;

    /* renamed from: t */
    private boolean f171t = false;

    /* renamed from: u */
    private boolean f172u = false;

    /* renamed from: v */
    private List<String> f173v;

    /* renamed from: w */
    private String[] f174w = new String[0];

    /* renamed from: x */
    private String f175x;

    /* renamed from: y */
    private final AnylineCoreDelegate f176y = new AnylineCoreDelegate() {
        public final void anylineCoreReport(Variable variable, final String str) {
            if (!C0722a.this.mo11888c()) {
                try {
                    final Object object = variable.getObject();
                    if (object != null && str != null) {
                        C0722a.this.f159h.post(new Runnable() {
                            public final void run() {
                                C0722a.this.f160i.onReportsVariable(str, object);
                            }
                        });
                    }
                } catch (AnylineException e) {
                    throw new RuntimeException(e.reason());
                }
            }
        }

        public final void anylineCoreReturn(Variable variable) {
            if (!C0722a.this.mo11888c()) {
                if (C0722a.this.f168q) {
                    if (C0722a.this.f162k) {
                        Log.d(C0722a.this.f152a, "Canceling worker thread because a result was found and isCancelOnResult is true");
                    }
                    C0722a.this.mo11884b();
                }
                try {
                    final Object object = variable.getObject();
                    if (object != null) {
                        C0722a.this.f159h.post(new Runnable() {
                            public final void run() {
                                C0722a.this.f160i.onFinishedWithOutput(object);
                            }
                        });
                        return;
                    }
                    throw new IllegalArgumentException("Returned Variable type has no java representation");
                } catch (AnylineException e) {
                    throw new RuntimeException(e.reason());
                }
            }
        }
    };

    C0722a(Context context, String str, String str2, AnylineListener anylineListener) {
        this.f154c = context.getFilesDir();
        this.f155d = context;
        this.f167p = new Map_String_Shared_ptr_Variable();
        this.f159h = new Handler(Looper.getMainLooper());
        this.f160i = anylineListener;
        this.f156e = str;
        this.f157f = str2;
        this.f152a = "AnylineWorkerThread " + str2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo11877a(C0722a aVar, boolean z) {
        synchronized (this.f153b) {
            this.f166o = aVar.f166o;
            this.f162k = aVar.f162k;
            this.f168q = aVar.f168q;
            this.f169r = aVar.f169r;
            setUncaughtExceptionHandler(aVar.getUncaughtExceptionHandler());
            if (z) {
                this.f167p = aVar.f167p;
                this.f164m = aVar.f164m;
                this.f165n = aVar.f165n;
                this.f163l = aVar.f163l;
                this.f175x = aVar.f175x;
                this.f173v = aVar.f173v;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo11882a(boolean z) {
        synchronized (this.f153b) {
            this.f168q = z;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo11886b(boolean z) {
        synchronized (this.f153b) {
            this.f169r = z;
            if (this.f158g != null) {
                this.f158g.enableOptOutDebugReporting(z);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo11878a(String str) {
        synchronized (this.f153b) {
            if (this.f158g == null || this.f161j) {
                if (this.f173v == null) {
                    this.f173v = new ArrayList();
                }
                this.f173v.add(str);
            } else {
                this.f158g.reportIncludeValues(str);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo11875a() {
        synchronized (this.f153b) {
            if (this.f158g != null) {
                this.f158g.reportTriggerScanningCanceled();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo11880a(String str, String str2) {
        synchronized (this.f153b) {
            if (getState() == Thread.State.NEW) {
                this.f163l = str;
                this.f164m = null;
                this.f165n = str2;
            } else {
                throw new IllegalThreadStateException("Loading a script is only allowed before starting the thread. Use a new thread to start a new script.");
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo11881a(String str, String str2, String str3) {
        synchronized (this.f153b) {
            if (getState() == Thread.State.NEW) {
                this.f175x = str;
                this.f163l = str2;
                this.f164m = null;
                this.f165n = str3;
            } else {
                throw new IllegalThreadStateException("Loading a script is only allowed before starting the thread. Use a new thread to start a new script.");
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo11885b(String str, String str2) {
        synchronized (this.f153b) {
            if (getState() == Thread.State.NEW) {
                this.f164m = str;
                this.f165n = str2;
            } else {
                throw new IllegalThreadStateException("Loading a script is only allowed before starting the thread. Use a new thread to start a new script.");
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo11883a(String... strArr) {
        this.f174w = strArr;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo11884b() {
        synchronized (this.f153b) {
            this.f161j = true;
            Log.d(this.f152a, "Worker thread canceled");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo11888c() {
        boolean z;
        synchronized (this.f153b) {
            z = this.f161j;
        }
        return z;
    }

    /* renamed from: c */
    public final void mo11887c(boolean z) {
        synchronized (this.f153b) {
            this.f162k = z;
        }
    }

    /* renamed from: d */
    public final boolean mo11889d() {
        boolean z;
        synchronized (this.f153b) {
            z = this.f162k;
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001f, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0021, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002b, code lost:
        throw new java.lang.IllegalArgumentException(r3.reason());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002d, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:3:0x0005, B:9:0x0014] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11879a(java.lang.String r3, java.lang.Object r4) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f153b
            monitor-enter(r0)
            if (r4 != 0) goto L_0x0014
            at.nineyards.anyline.core.Map_String_Shared_ptr_Variable r4 = r2.f167p     // Catch:{ all -> 0x001f }
            boolean r4 = r4.has_key(r3)     // Catch:{ all -> 0x001f }
            if (r4 == 0) goto L_0x0012
            at.nineyards.anyline.core.Map_String_Shared_ptr_Variable r4 = r2.f167p     // Catch:{ all -> 0x001f }
            r4.del(r3)     // Catch:{ all -> 0x001f }
        L_0x0012:
            monitor-exit(r0)     // Catch:{ all -> 0x001f }
            return
        L_0x0014:
            at.nineyards.anyline.core.Map_String_Shared_ptr_Variable r1 = r2.f167p     // Catch:{ ArgumentException -> 0x0021 }
            at.nineyards.anyline.core.Variable r4 = p007at.nineyards.anyline.core.Variable.getVariableFromObject(r4)     // Catch:{ ArgumentException -> 0x0021 }
            r1.set(r3, r4)     // Catch:{ ArgumentException -> 0x0021 }
            monitor-exit(r0)     // Catch:{ all -> 0x001f }
            return
        L_0x001f:
            r3 = move-exception
            goto L_0x002c
        L_0x0021:
            r3 = move-exception
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x001f }
            java.lang.String r3 = r3.reason()     // Catch:{ all -> 0x001f }
            r4.<init>(r3)     // Catch:{ all -> 0x001f }
            throw r4     // Catch:{ all -> 0x001f }
        L_0x002c:
            monitor-exit(r0)     // Catch:{ all -> 0x001f }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p007at.nineyards.anyline.C0722a.mo11879a(java.lang.String, java.lang.Object):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo11876a(ImageProvider imageProvider) {
        synchronized (this.f153b) {
            this.f166o = imageProvider;
        }
    }

    public final void run() {
        String str;
        Log.d(this.f152a, "Worker thread started");
        try {
            Class<?> cls = Class.forName("at.nineyards.anyline.BuildConfig");
            str = (String) cls.getField("VERSION_NAME").get(cls);
        } catch (Exception unused) {
            str = "3.0";
        }
        try {
            this.f158g = new AnylineCore(this.f156e, this.f155d.getPackageName(), str.substring(0, 1), this.f157f.toUpperCase(), "Android", this.f155d.getFilesDir().getAbsolutePath(), this.f176y);
            this.f158g.enableOptOutDebugReporting(this.f169r);
            this.f158g.reportIncludeValues(ReportingService.getInstance(this.f155d).createStartValues());
            List<String> list = this.f173v;
            if (list != null && !list.isEmpty()) {
                for (String reportIncludeValues : this.f173v) {
                    this.f158g.reportIncludeValues(reportIncludeValues);
                }
                this.f173v.clear();
            }
            try {
                long currentTimeMillis = System.currentTimeMillis();
                for (String anylineAssetsJson : this.f174w) {
                    JSONObject anylineAssetsJson2 = AssetUtil.getAnylineAssetsJson(this.f155d, anylineAssetsJson);
                    AssetUtil.copyAnylineAssets(this.f155d, anylineAssetsJson2, "immediateAssets", this.f154c, false);
                    AssetUtil.copyAnylineAssets(this.f155d, anylineAssetsJson2, "lazyAssets", this.f154c, false);
                }
                if (this.f162k && this.f174w.length > 0) {
                    Log.d(this.f152a, "Check/Copy assets duration(ms): " + (System.currentTimeMillis() - currentTimeMillis));
                }
            } catch (IOException unused2) {
            } catch (JSONException e) {
                throw new RuntimeException("anyline_assets.json exists but is malformed. File should be auto generated in build.gradle.", e);
            }
            if (mo11888c()) {
                Log.d(this.f152a, "Worker thread finishing");
                return;
            }
            long currentTimeMillis2 = System.currentTimeMillis();
            try {
                File file = this.f154c;
                if (this.f165n != null && !this.f165n.isEmpty() && !this.f165n.equals("/")) {
                    file = new File(this.f154c, this.f165n);
                }
                if (this.f163l != null) {
                    if (this.f175x != null) {
                        this.f158g.loadScript(this.f175x, this.f163l, file.getAbsolutePath());
                    } else {
                        this.f158g.loadScript(this.f163l, file.getAbsolutePath());
                    }
                } else if (this.f164m != null) {
                    this.f158g.loadCmdFile(this.f164m, file.getAbsolutePath());
                } else {
                    throw new IllegalStateException("Cannot start the worker thread with no script loaded. Load script or cmd file before calling start.");
                }
                if (this.f162k) {
                    Log.d(this.f152a, "Loading alc/ale script duration(ms): " + (System.currentTimeMillis() - currentTimeMillis2));
                }
                while (!mo11888c()) {
                    while (!mo11888c() && ((r0 = this.f166o) == null || !r0.hasNewImage())) {
                        try {
                            Thread.sleep(200);
                        } catch (InterruptedException unused3) {
                        }
                    }
                    ImageProvider imageProvider = this.f166o;
                    if (imageProvider instanceof AnylineBaseView) {
                        if (this.f156e.equals(((AnylineBaseView) imageProvider).getLicenseKey())) {
                            if (!this.f170s) {
                                this.f170s = true;
                                JSONObject jSONObject = new JSONObject();
                                try {
                                    jSONObject.put("cameraParameters", ((AnylineBaseView) this.f166o).getCameraController().getCameraConfig().toString());
                                } catch (JSONException e2) {
                                    Log.e(this.f152a, "Error while preparing the camera settings for reporting: " + e2.getMessage());
                                }
                                this.f158g.reportIncludeValues(jSONObject.toString());
                            }
                            ImageProvider imageProvider2 = this.f166o;
                            if (imageProvider2 instanceof AnylineBaseView) {
                                AnylineBaseView anylineBaseView = (AnylineBaseView) imageProvider2;
                                if (!(this.f171t == anylineBaseView.isBarcodeDetectionEnabled() && this.f172u == anylineBaseView.isBarcodeDetectionOperational())) {
                                    this.f171t = anylineBaseView.isBarcodeDetectionEnabled();
                                    this.f172u = anylineBaseView.isBarcodeDetectionOperational();
                                    JSONObject jSONObject2 = new JSONObject();
                                    JSONObject jSONObject3 = new JSONObject();
                                    try {
                                        jSONObject3.put("nativeBarcodeScannerEnabled", this.f171t);
                                        if (this.f171t) {
                                            jSONObject3.put("isOperational", this.f172u);
                                        }
                                        jSONObject2.put("nativeBarcodeScanner", jSONObject3.toString());
                                        this.f158g.reportIncludeValues(jSONObject2.toString());
                                    } catch (JSONException unused4) {
                                    }
                                }
                            }
                        } else {
                            throw new RuntimeException("Illegal usage.");
                        }
                    }
                    AnylineImage newImage = this.f166o.getNewImage();
                    if (newImage != null) {
                        if (this.f162k) {
                            Log.d(this.f152a, "Start processing an image");
                        }
                        long currentTimeMillis3 = System.currentTimeMillis();
                        if (newImage.getWidth() == 0 || newImage.getHeight() == 0) {
                            newImage.release();
                            if (this.f162k) {
                                Log.d(this.f152a, "Received invalid image: " + newImage.toString());
                            }
                        } else {
                            try {
                                this.f158g.process(new Variable(newImage.getCvMat()), this.f167p);
                            } catch (SyntaxException e3) {
                                throw new RuntimeException("Syntax Error (line: " + e3.lineNumber() + "): " + e3.reason());
                            } catch (RunFailure e4) {
                                if (!mo11888c()) {
                                    this.f159h.post(new Runnable() {
                                        public final void run() {
                                            C0722a.this.f160i.onAbortRun(e4);
                                        }
                                    });
                                }
                            } catch (LicenseException unused5) {
                                throw new RuntimeException("License verification failed");
                            }
                            if (this.f162k) {
                                Log.d(this.f152a, "Processed one image in " + (System.currentTimeMillis() - currentTimeMillis3) + "ms");
                            }
                        }
                    }
                }
                Log.d(this.f152a, "Worker thread finishing");
            } catch (ArgumentException e5) {
                throw new RuntimeException("Script not set or does not exist in the required path. \nAre you auto generating the anyline_assets.json in your build.gradle? Or use the AssetUtil to copy the required stuff out of the apk manually?\nCore Exception: " + e5.getMessage());
            } catch (SyntaxException e6) {
                throw new RuntimeException("Syntax error: " + e6.reason() + " In Line Number: " + e6.lineNumber());
            }
        } catch (ArgumentException e7) {
            throw new IllegalArgumentException(e7.reason());
        } catch (LicenseException e8) {
            throw new RuntimeException(e8.reason());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final String mo11890e() {
        return this.f157f;
    }
}
