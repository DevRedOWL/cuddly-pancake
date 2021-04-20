package com.yandex.metrica.impl.p039ob;

import android.content.ContentValues;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.ResultReceiver;
import android.text.TextUtils;
import com.yandex.metrica.C4297j;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.yandex.metrica.impl.ob.ee */
public class C3370ee implements Parcelable {
    public static final Parcelable.Creator<C3370ee> CREATOR = new Parcelable.Creator<C3370ee>() {
        /* renamed from: a */
        public C3370ee createFromParcel(Parcel parcel) {
            Bundle readBundle = parcel.readBundle(C4248x.class.getClassLoader());
            return new C3370ee((ContentValues) readBundle.getParcelable("CFG_KEY_PROCESS_ENVIRONMENT"), (ResultReceiver) readBundle.getParcelable("CFG_KEY_PROCESS_ENVIRONMENT_RECEIVER"));
        }

        /* renamed from: a */
        public C3370ee[] newArray(int i) {
            return new C3370ee[i];
        }
    };

    /* renamed from: a */
    public static final String f3101a = UUID.randomUUID().toString();

    /* renamed from: b */
    private final ContentValues f3102b;

    /* renamed from: c */
    private ResultReceiver f3103c;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("CFG_KEY_PROCESS_ENVIRONMENT", this.f3102b);
        bundle.putParcelable("CFG_KEY_PROCESS_ENVIRONMENT_RECEIVER", this.f3103c);
        parcel.writeBundle(bundle);
    }

    public String toString() {
        return "ProcessConfiguration{mParamsMapping=" + this.f3102b + ", mDataResultReceiver=" + this.f3103c + '}';
    }

    /* renamed from: a */
    public static C3370ee m3073a(Bundle bundle) {
        if (bundle != null) {
            try {
                return (C3370ee) bundle.getParcelable("PROCESS_CFG_OBJ");
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public C3370ee(Context context, ResultReceiver resultReceiver) {
        this.f3102b = new ContentValues();
        this.f3102b.put("PROCESS_CFG_PROCESS_ID", Integer.valueOf(Process.myPid()));
        this.f3102b.put("PROCESS_CFG_PROCESS_SESSION_ID", f3101a);
        this.f3102b.put("PROCESS_CFG_SDK_API_LEVEL", 85);
        this.f3102b.put("PROCESS_CFG_PACKAGE_NAME", context.getPackageName());
        this.f3103c = resultReceiver;
    }

    public C3370ee(C3370ee eeVar) {
        synchronized (eeVar) {
            this.f3102b = new ContentValues(eeVar.f3102b);
            this.f3103c = eeVar.f3103c;
        }
    }

    public C3370ee(ContentValues contentValues, ResultReceiver resultReceiver) {
        this.f3102b = contentValues == null ? new ContentValues() : contentValues;
        this.f3103c = resultReceiver;
    }

    /* renamed from: a */
    public void mo39949a(C4297j jVar) {
        if (jVar != null) {
            synchronized (this) {
                m3074b(jVar);
                m3075c(jVar);
                m3076d(jVar);
            }
        }
    }

    /* renamed from: b */
    private void m3074b(C4297j jVar) {
        if (C3306cx.m2858a((Object) jVar.f5361d)) {
            mo39951a(jVar.f5361d);
        }
    }

    /* renamed from: c */
    private void m3075c(C4297j jVar) {
        if (C3306cx.m2858a((Object) jVar.f5359b)) {
            mo39952a(C4225we.m6012c(jVar.f5359b));
        }
    }

    /* renamed from: d */
    private void m3076d(C4297j jVar) {
        if (C3306cx.m2858a((Object) jVar.f5360c)) {
            mo39950a(jVar.f5360c);
        }
    }

    /* renamed from: a */
    public boolean mo39953a() {
        return this.f3102b.containsKey("PROCESS_CFG_CUSTOM_HOSTS");
    }

    /* renamed from: b */
    public List<String> mo39954b() {
        String asString = this.f3102b.getAsString("PROCESS_CFG_CUSTOM_HOSTS");
        if (TextUtils.isEmpty(asString)) {
            return null;
        }
        return C4204vq.m5897c(asString);
    }

    /* renamed from: a */
    public synchronized void mo39951a(List<String> list) {
        this.f3102b.put("PROCESS_CFG_CUSTOM_HOSTS", C4204vq.m5882a(list));
    }

    /* renamed from: c */
    public Map<String, String> mo39956c() {
        return C4204vq.m5884a(this.f3102b.getAsString("PROCESS_CFG_CLIDS"));
    }

    /* renamed from: a */
    public synchronized void mo39952a(Map<String, String> map) {
        this.f3102b.put("PROCESS_CFG_CLIDS", C4204vq.m5894b((Map) map));
    }

    /* renamed from: d */
    public String mo39957d() {
        return this.f3102b.getAsString("PROCESS_CFG_DISTRIBUTION_REFERRER");
    }

    /* renamed from: a */
    public synchronized void mo39950a(String str) {
        this.f3102b.put("PROCESS_CFG_DISTRIBUTION_REFERRER", str);
    }

    /* renamed from: e */
    public Integer mo39959e() {
        return this.f3102b.getAsInteger("PROCESS_CFG_PROCESS_ID");
    }

    /* renamed from: f */
    public String mo39960f() {
        return this.f3102b.getAsString("PROCESS_CFG_PROCESS_SESSION_ID");
    }

    /* renamed from: g */
    public int mo39961g() {
        return this.f3102b.getAsInteger("PROCESS_CFG_SDK_API_LEVEL").intValue();
    }

    /* renamed from: h */
    public String mo39962h() {
        return this.f3102b.getAsString("PROCESS_CFG_PACKAGE_NAME");
    }

    /* renamed from: i */
    public ResultReceiver mo39963i() {
        return this.f3103c;
    }

    /* renamed from: b */
    public synchronized void mo39955b(Bundle bundle) {
        bundle.putParcelable("PROCESS_CFG_OBJ", this);
    }
}
