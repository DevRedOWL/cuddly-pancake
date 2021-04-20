package androidx.core.app;

import android.app.job.JobParameters;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import androidx.core.app.JobIntentService;

public abstract class AppMetricaPushJobIntentService extends JobIntentService {
    /* access modifiers changed from: package-private */
    public JobIntentService.GenericWorkItem dequeueWork() {
        try {
            return super.dequeueWork();
        } catch (Throwable unused) {
            return null;
        }
    }

    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            this.mJobImpl = new C0206a(this);
        }
    }

    /* renamed from: androidx.core.app.AppMetricaPushJobIntentService$a */
    static final class C0206a extends JobServiceEngine implements JobIntentService.CompatJobEngine {

        /* renamed from: a */
        final JobIntentService f53a;

        /* renamed from: b */
        final Object f54b = new Object();

        /* renamed from: c */
        volatile JobParameters f55c;

        C0206a(JobIntentService jobIntentService) {
            super(jobIntentService);
            this.f53a = jobIntentService;
        }

        public IBinder compatGetBinder() {
            return getBinder();
        }

        public boolean onStartJob(JobParameters jobParameters) {
            this.f55c = jobParameters;
            this.f53a.ensureProcessorRunningLocked(false);
            return true;
        }

        public boolean onStopJob(JobParameters jobParameters) {
            boolean doStopCurrentWork = this.f53a.doStopCurrentWork();
            synchronized (this.f54b) {
                this.f55c = null;
            }
            return doStopCurrentWork;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0015, code lost:
            if (r1 == null) goto L_0x002a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0017, code lost:
            r1.getIntent().setExtrasClassLoader(r3.f53a.getClassLoader());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0029, code lost:
            return new androidx.core.app.AppMetricaPushJobIntentService.C0206a.C0207a(r3, r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x002a, code lost:
            return null;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public androidx.core.app.JobIntentService.GenericWorkItem dequeueWork() {
            /*
                r3 = this;
                java.lang.Object r0 = r3.f54b
                monitor-enter(r0)
                android.app.job.JobParameters r1 = r3.f55c     // Catch:{ all -> 0x002b }
                r2 = 0
                if (r1 != 0) goto L_0x000a
                monitor-exit(r0)     // Catch:{ all -> 0x002b }
                return r2
            L_0x000a:
                android.app.job.JobParameters r1 = r3.f55c     // Catch:{ all -> 0x0013 }
                if (r1 == 0) goto L_0x0013
                android.app.job.JobWorkItem r1 = r1.dequeueWork()     // Catch:{ all -> 0x0013 }
                goto L_0x0014
            L_0x0013:
                r1 = r2
            L_0x0014:
                monitor-exit(r0)     // Catch:{ all -> 0x002b }
                if (r1 == 0) goto L_0x002a
                android.content.Intent r0 = r1.getIntent()
                androidx.core.app.JobIntentService r2 = r3.f53a
                java.lang.ClassLoader r2 = r2.getClassLoader()
                r0.setExtrasClassLoader(r2)
                androidx.core.app.AppMetricaPushJobIntentService$a$a r0 = new androidx.core.app.AppMetricaPushJobIntentService$a$a
                r0.<init>(r1)
                return r0
            L_0x002a:
                return r2
            L_0x002b:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x002b }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.AppMetricaPushJobIntentService.C0206a.dequeueWork():androidx.core.app.JobIntentService$GenericWorkItem");
        }

        /* renamed from: androidx.core.app.AppMetricaPushJobIntentService$a$a */
        final class C0207a implements JobIntentService.GenericWorkItem {

            /* renamed from: a */
            final JobWorkItem f56a;

            C0207a(JobWorkItem jobWorkItem) {
                this.f56a = jobWorkItem;
            }

            public Intent getIntent() {
                return this.f56a.getIntent();
            }

            /* JADX WARNING: Can't wrap try/catch for region: R(5:2|3|(3:5|6|(1:8))|9|10) */
            /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0016 */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void complete() {
                /*
                    r3 = this;
                    androidx.core.app.AppMetricaPushJobIntentService$a r0 = androidx.core.app.AppMetricaPushJobIntentService.C0206a.this
                    java.lang.Object r0 = r0.f54b
                    monitor-enter(r0)
                    androidx.core.app.AppMetricaPushJobIntentService$a r1 = androidx.core.app.AppMetricaPushJobIntentService.C0206a.this     // Catch:{ all -> 0x0018 }
                    android.app.job.JobParameters r1 = r1.f55c     // Catch:{ all -> 0x0018 }
                    if (r1 == 0) goto L_0x0016
                    androidx.core.app.AppMetricaPushJobIntentService$a r1 = androidx.core.app.AppMetricaPushJobIntentService.C0206a.this     // Catch:{ all -> 0x0016 }
                    android.app.job.JobParameters r1 = r1.f55c     // Catch:{ all -> 0x0016 }
                    if (r1 == 0) goto L_0x0016
                    android.app.job.JobWorkItem r2 = r3.f56a     // Catch:{ all -> 0x0016 }
                    r1.completeWork(r2)     // Catch:{ all -> 0x0016 }
                L_0x0016:
                    monitor-exit(r0)     // Catch:{ all -> 0x0018 }
                    return
                L_0x0018:
                    r1 = move-exception
                    monitor-exit(r0)     // Catch:{ all -> 0x0018 }
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.AppMetricaPushJobIntentService.C0206a.C0207a.complete():void");
            }
        }
    }
}
