package com.yandex.metrica;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.app.job.JobWorkItem;
import android.content.Context;
import android.content.Intent;
import android.util.SparseArray;
import com.yandex.metrica.impl.p039ob.C3136al;
import com.yandex.metrica.impl.p039ob.C3329de;
import com.yandex.metrica.impl.p039ob.C3333dg;
import com.yandex.metrica.impl.p039ob.C3561jl;
import com.yandex.metrica.impl.p039ob.C3576jr;
import com.yandex.metrica.impl.p039ob.C3584jv;
import com.yandex.metrica.impl.p039ob.C3587jw;
import com.yandex.metrica.impl.p039ob.C3588jx;
import com.yandex.metrica.impl.p039ob.C3590jy;
import com.yandex.metrica.impl.p039ob.C3591jz;
import com.yandex.metrica.impl.p039ob.C3593ka;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class ConfigurationJobService extends JobService {

    /* renamed from: a */
    SparseArray<C3590jy> f2347a = new SparseArray<>();

    /* renamed from: b */
    Map<String, C3590jy> f2348b = new HashMap();

    /* renamed from: c */
    private C3576jr f2349c;

    /* renamed from: d */
    private String f2350d;

    public boolean complexJob(int i) {
        return i == 1512302347;
    }

    public void onCreate() {
        super.onCreate();
        C3136al.m1994a(getApplicationContext());
        Context applicationContext = getApplicationContext();
        this.f2350d = String.format(Locale.US, "[ConfigurationJobService:%s]", new Object[]{applicationContext.getPackageName()});
        this.f2349c = new C3576jr();
        C3584jv jvVar = new C3584jv(getApplicationContext(), this.f2349c.mo40322a(), new C3561jl(applicationContext));
        C3329de deVar = new C3329de(applicationContext, new C3333dg(applicationContext));
        this.f2347a.append(1512302345, new C3591jz(getApplicationContext(), jvVar));
        this.f2347a.append(1512302346, new C3593ka(getApplicationContext(), jvVar, deVar));
        this.f2348b.put("com.yandex.metrica.configuration.service.PLC", new C3588jx(applicationContext, this.f2349c.mo40322a()));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        jobFinished(r3, false);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0017 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onStartJob(android.app.job.JobParameters r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L_0x001a
            int r1 = r3.getJobId()     // Catch:{ all -> 0x0017 }
            boolean r1 = r2.complexJob(r1)     // Catch:{ all -> 0x0017 }
            if (r1 == 0) goto L_0x0012
            r2.m1676a(r3)     // Catch:{ all -> 0x0017 }
            r0 = 1
            goto L_0x001a
        L_0x0012:
            boolean r0 = r2.m1679b(r3)     // Catch:{ all -> 0x0017 }
            goto L_0x001a
        L_0x0017:
            r2.jobFinished(r3, r0)     // Catch:{ all -> 0x001a }
        L_0x001a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.ConfigurationJobService.onStartJob(android.app.job.JobParameters):boolean");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m1676a(final JobParameters jobParameters) {
        this.f2349c.mo40322a().mo41808a((Runnable) new Runnable() {
            public void run() {
                ConfigurationJobService.this.m1680c(jobParameters);
            }
        });
    }

    /* renamed from: b */
    private boolean m1679b(final JobParameters jobParameters) {
        C3590jy jyVar = this.f2347a.get(jobParameters.getJobId());
        if (jyVar == null) {
            return false;
        }
        this.f2349c.mo40324a(jyVar, jobParameters.getTransientExtras(), new C3587jw() {
            /* renamed from: a */
            public void mo39216a() {
                try {
                    ConfigurationJobService.this.jobFinished(jobParameters, false);
                } catch (Throwable unused) {
                }
            }
        });
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m1680c(final JobParameters jobParameters) {
        while (true) {
            try {
                final JobWorkItem dequeueWork = jobParameters.dequeueWork();
                if (dequeueWork != null) {
                    Intent intent = dequeueWork.getIntent();
                    if (intent != null) {
                        C3590jy jyVar = this.f2348b.get(intent.getAction());
                        if (jyVar != null) {
                            this.f2349c.mo40324a(jyVar, intent.getExtras(), new C3587jw() {
                                /* renamed from: a */
                                public void mo39216a() {
                                    try {
                                        jobParameters.completeWork(dequeueWork);
                                        ConfigurationJobService.this.m1676a(jobParameters);
                                    } catch (Throwable unused) {
                                    }
                                }
                            });
                        } else {
                            jobParameters.completeWork(dequeueWork);
                        }
                    } else {
                        jobParameters.completeWork(dequeueWork);
                    }
                } else {
                    return;
                }
            } catch (Throwable unused) {
                jobFinished(jobParameters, true);
                return;
            }
        }
    }

    public boolean onStopJob(JobParameters jobParameters) {
        return jobParameters != null && complexJob(jobParameters.getJobId());
    }
}
