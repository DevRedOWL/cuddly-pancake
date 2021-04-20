package com.yandex.metrica.push.impl;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.Context;
import androidx.core.app.NotificationManagerCompat;
import com.yandex.metrica.push.impl.C4413w;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.yandex.metrica.push.impl.x */
public class C4416x {

    /* renamed from: a */
    final NotificationManager f5663a;

    /* renamed from: b */
    final NotificationManagerCompat f5664b;

    /* renamed from: c */
    final C4391h f5665c;

    /* renamed from: d */
    private final C4420d f5666d;

    /* renamed from: com.yandex.metrica.push.impl.x$d */
    interface C4420d {
        /* renamed from: a */
        C4413w mo42218a();
    }

    public C4416x(Context context) {
        this((NotificationManager) context.getSystemService("notification"), NotificationManagerCompat.from(context), new C4391h(context, ".NOTIFICATION_STATUS"));
    }

    /* renamed from: a */
    public C4413w mo42217a() {
        return this.f5666d.mo42218a();
    }

    /* renamed from: com.yandex.metrica.push.impl.x$b */
    class C4418b extends C4417a {
        protected C4418b() {
            super();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public boolean mo42220a(NotificationChannelGroup notificationChannelGroup) {
            return !notificationChannelGroup.isBlocked();
        }
    }

    /* renamed from: com.yandex.metrica.push.impl.x$a */
    class C4417a extends C4419c {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public boolean mo42220a(NotificationChannelGroup notificationChannelGroup) {
            return true;
        }

        protected C4417a() {
            super();
        }

        /* renamed from: a */
        public C4413w mo42218a() {
            List<NotificationChannel> c = mo42224c();
            List<NotificationChannelGroup> b = mo42222b();
            HashMap hashMap = new HashMap();
            HashSet hashSet = new HashSet();
            for (NotificationChannel next : c) {
                boolean a = mo42219a(next);
                boolean b2 = mo42223b(next.getId(), a);
                if (next.getGroup() == null) {
                    hashSet.add(new C4413w.C4414a(next.getId(), a, b2));
                } else {
                    Set set = (Set) hashMap.get(next.getGroup());
                    if (set == null) {
                        set = new HashSet();
                        hashMap.put(next.getGroup(), set);
                    }
                    set.add(new C4413w.C4414a(next.getId(), a, b2));
                }
            }
            HashSet hashSet2 = new HashSet();
            for (NotificationChannelGroup next2 : b) {
                boolean a2 = mo42220a(next2);
                hashSet2.add(new C4413w.C4415b(next2.getId(), (Set) hashMap.get(next2.getId()), a2, mo42221a(next2.getId(), a2)));
            }
            boolean d = mo42226d();
            return new C4413w(hashSet2, hashSet, d, mo42225a(d));
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public List<NotificationChannelGroup> mo42222b() {
            if (C4416x.this.f5663a != null) {
                try {
                    return C4416x.this.f5663a.getNotificationChannelGroups();
                } catch (Exception e) {
                    C4376by.m6445a(e, e.getMessage(), new Object[0]);
                }
            }
            return Collections.emptyList();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public boolean mo42221a(String str, boolean z) {
            Boolean h = C4416x.this.f5665c.mo42080h(str);
            C4416x.this.f5665c.mo42072c(str, z);
            return (h == null || h.booleanValue() == z) ? false : true;
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public List<NotificationChannel> mo42224c() {
            if (C4416x.this.f5663a != null) {
                try {
                    return C4416x.this.f5663a.getNotificationChannels();
                } catch (Exception e) {
                    C4376by.m6445a(e, e.getMessage(), new Object[0]);
                }
            }
            return Collections.emptyList();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public boolean mo42219a(NotificationChannel notificationChannel) {
            return notificationChannel.getImportance() != 0;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public boolean mo42223b(String str, boolean z) {
            Boolean g = C4416x.this.f5665c.mo42079g(str);
            C4416x.this.f5665c.mo42064b(str, z);
            return (g == null || g.booleanValue() == z) ? false : true;
        }
    }

    /* renamed from: com.yandex.metrica.push.impl.x$c */
    class C4419c implements C4420d {
        protected C4419c() {
        }

        /* renamed from: a */
        public C4413w mo42218a() {
            boolean d = mo42226d();
            return new C4413w(d, mo42225a(d));
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public boolean mo42226d() {
            return C4416x.this.f5664b.areNotificationsEnabled();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public boolean mo42225a(boolean z) {
            Boolean d = C4416x.this.f5665c.mo42074d();
            C4416x.this.f5665c.mo42062a(z);
            return (d == null || d.booleanValue() == z) ? false : true;
        }
    }

    C4416x(NotificationManager notificationManager, NotificationManagerCompat notificationManagerCompat, C4391h hVar) {
        this.f5663a = notificationManager;
        this.f5664b = notificationManagerCompat;
        this.f5665c = hVar;
        if (C4380cb.m6470a(28)) {
            this.f5666d = new C4418b();
        } else if (C4380cb.m6470a(26)) {
            this.f5666d = new C4417a();
        } else {
            this.f5666d = new C4419c();
        }
    }
}
