package com.yandex.metrica.push;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.app.JobIntentService;
import androidx.core.util.Consumer;
import com.yandex.metrica.push.CommandIntentService;
import com.yandex.metrica.push.impl.C4371bu;
import com.yandex.metrica.push.impl.C4376by;
import com.yandex.metrica.push.impl.C4379ca;
import com.yandex.metrica.push.impl.C4389f;
import com.yandex.metrica.push.impl.C4391h;
import com.yandex.metrica.push.impl.C4394j;
import java.util.concurrent.TimeUnit;

public class PushService extends CommandIntentService {

    /* renamed from: a */
    private static C4306c f5399a = new C4306c();

    /* renamed from: com.yandex.metrica.push.PushService$e */
    abstract class C4308e implements CommandIntentService.C4302a {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo41943a(Context context, String str, boolean z);

        C4308e() {
        }

        /* renamed from: a */
        public void mo41942a(Context context, Intent intent) {
            mo41943a(context, C4389f.m6484a(context).mo42032g() ? C4389f.m6484a(context).mo42026b().mo41987b() : null, intent.getBooleanExtra("com.yandex.metrica.push.command.FORCE_UPDATE_TOKEN", false));
        }
    }

    /* renamed from: com.yandex.metrica.push.PushService$b */
    class C4304b extends C4308e {
        C4304b() {
            super();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo41943a(final Context context, String str, boolean z) {
            PushService.m6274a(context, z, str, new Consumer<String>() {
                /* renamed from: a */
                public void accept(String str) {
                    C4376by.m6447c("Will send token %s to server!", str);
                    C4389f.m6484a(context).mo42025a(str);
                }
            });
        }
    }

    /* renamed from: com.yandex.metrica.push.PushService$f */
    class C4309f extends C4308e {
        C4309f() {
            super();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo41943a(final Context context, String str, boolean z) {
            PushService.m6274a(context, z, str, new Consumer<String>() {
                /* renamed from: a */
                public void accept(String str) {
                    C4376by.m6447c("Will send token %s to server!", str);
                    C4389f.m6484a(context).mo42027b(str);
                }
            });
        }
    }

    /* renamed from: com.yandex.metrica.push.PushService$d */
    class C4307d implements CommandIntentService.C4302a {
        C4307d() {
        }

        /* renamed from: a */
        public void mo41942a(Context context, Intent intent) {
            C4389f.m6484a(context).mo42031f().mo42039b().mo41960a(context, intent.getExtras());
        }
    }

    /* renamed from: com.yandex.metrica.push.PushService$a */
    class C4303a implements CommandIntentService.C4302a {
        C4303a() {
        }

        /* renamed from: a */
        public void mo41942a(Context context, Intent intent) {
            C4394j b = C4389f.m6484a(context).mo42026b();
            if (b != null) {
                b.mo41986a();
            }
        }
    }

    public void onCreate() {
        super.onCreate();
        mo41941a("com.yandex.metrica.push.command.INIT_PUSH_SERVICE", new C4303a());
        mo41941a("com.yandex.metrica.push.command.INIT_PUSH_TOKEN", new C4304b());
        mo41941a("com.yandex.metrica.push.command.REFRESH_TOKEN", new C4309f());
        mo41941a("com.yandex.metrica.push.command.PROCESS_PUSH", new C4307d());
    }

    /* renamed from: a */
    public static void m6271a(Context context) {
        f5399a.mo41945a(context, new Intent().putExtras(m6268a("com.yandex.metrica.push.command.INIT_PUSH_SERVICE")));
    }

    /* renamed from: c */
    public static void m6276c(Context context) {
        m6273a(context, false);
    }

    /* renamed from: a */
    public static void m6273a(Context context, boolean z) {
        Intent putExtras = new Intent().putExtras(m6268a("com.yandex.metrica.push.command.REFRESH_TOKEN"));
        putExtras.putExtra("com.yandex.metrica.push.command.FORCE_UPDATE_TOKEN", z);
        f5399a.mo41945a(context, putExtras);
    }

    /* renamed from: a */
    public static void m6272a(Context context, Bundle bundle) {
        f5399a.mo41945a(context, new Intent().putExtras(m6268a("com.yandex.metrica.push.command.PROCESS_PUSH")).putExtras(bundle));
    }

    /* renamed from: com.yandex.metrica.push.PushService$c */
    public static class C4306c {
        /* renamed from: a */
        public void mo41945a(Context context, Intent intent) {
            try {
                JobIntentService.enqueueWork(context, (Class<?>) PushService.class, 123890, intent);
            } catch (Throwable th) {
                C4379ca.m6456c().mo42016a("Start JobIntentService failed", th);
            }
        }
    }

    /* renamed from: b */
    public static void m6275b(Context context) {
        Intent putExtras = new Intent().putExtras(m6268a("com.yandex.metrica.push.command.INIT_PUSH_TOKEN"));
        putExtras.putExtra("com.yandex.metrica.push.command.FORCE_UPDATE_TOKEN", false);
        f5399a.mo41945a(context, putExtras);
    }

    /* renamed from: a */
    static /* synthetic */ void m6274a(Context context, boolean z, String str, Consumer consumer) {
        C4391h e = C4389f.m6484a(context).mo42030e();
        String b = e.mo42067b();
        long longValue = e.mo42073c().longValue();
        long currentTimeMillis = System.currentTimeMillis();
        if (z || longValue == -1 || !TextUtils.equals(b, str) || currentTimeMillis - longValue > TimeUnit.DAYS.toMillis(1)) {
            e.mo42056a(currentTimeMillis);
            e.mo42078f(str);
            consumer.accept(str);
            C4371bu.m6425b("New token was saved to PreferenceManager and sent", new Object[0]);
            return;
        }
        C4371bu.m6425b("Received old token", new Object[0]);
    }
}
