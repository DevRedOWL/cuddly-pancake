package com.yandex.metrica.impl.p039ob;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.yandex.metrica.ConfigurationJobService;

/* renamed from: com.yandex.metrica.impl.ob.jl */
public class C3561jl implements C3566jm, C3574jp {

    /* renamed from: a */
    private final Context f3480a;

    /* renamed from: b */
    private final JobScheduler f3481b;

    public C3561jl(Context context) {
        this(context, (JobScheduler) context.getSystemService("jobscheduler"));
    }

    /* renamed from: a */
    public void mo40310a(long j, boolean z) {
        final JobInfo.Builder minimumLatency = new JobInfo.Builder(1512302345, new ComponentName(this.f3480a.getPackageName(), ConfigurationJobService.class.getName())).setMinimumLatency(j);
        if (z) {
            minimumLatency.setOverrideDeadline(j);
        }
        C3306cx.m2854a(new C4235wn<JobScheduler>() {
            /* renamed from: a */
            public void mo39902a(JobScheduler jobScheduler) throws Throwable {
                jobScheduler.schedule(minimumLatency.build());
            }
        }, this.f3481b, "scheduling wakeup in [ConfigurationJobServiceController]", "JobScheduler");
    }

    /* renamed from: a */
    public void mo40309a() {
        C3306cx.m2854a(new C4235wn<JobScheduler>() {
            /* renamed from: a */
            public void mo39902a(JobScheduler jobScheduler) {
                jobScheduler.cancel(1512302345);
            }
        }, this.f3481b, "cancelling scheduled wakeup in [ConfigurationJobServiceController]", "JobScheduler");
    }

    /* renamed from: a */
    public void mo40311a(Bundle bundle) {
        final JobInfo build = new JobInfo.Builder(1512302346, new ComponentName(this.f3480a.getPackageName(), ConfigurationJobService.class.getName())).setTransientExtras(bundle).setOverrideDeadline(10).build();
        C3306cx.m2854a(new C4235wn<JobScheduler>() {
            /* renamed from: a */
            public void mo39902a(JobScheduler jobScheduler) throws Throwable {
                jobScheduler.schedule(build);
            }
        }, this.f3481b, "launching [ConfigurationJobServiceController] command", "JobScheduler");
    }

    /* renamed from: b */
    public void mo40312b(Bundle bundle) {
        Intent intent = new Intent("com.yandex.metrica.configuration.service.PLC");
        if (bundle == null) {
            bundle = new Bundle();
        }
        final JobWorkItem jobWorkItem = new JobWorkItem(intent.putExtras(bundle));
        final JobInfo build = new JobInfo.Builder(1512302347, new ComponentName(this.f3480a.getPackageName(), ConfigurationJobService.class.getName())).setOverrideDeadline(10).build();
        C3306cx.m2854a(new C4235wn<JobScheduler>() {
            /* renamed from: a */
            public void mo39902a(JobScheduler jobScheduler) {
                jobScheduler.enqueue(build, jobWorkItem);
            }
        }, this.f3481b, "ble callback", "JobScheduler");
    }

    C3561jl(Context context, JobScheduler jobScheduler) {
        this.f3480a = context;
        this.f3481b = jobScheduler;
    }
}
