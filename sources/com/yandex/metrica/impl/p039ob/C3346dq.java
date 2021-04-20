package com.yandex.metrica.impl.p039ob;

import android.os.Looper;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.yandex.metrica.impl.ob.dq */
public class C3346dq {

    /* renamed from: a */
    private final C3349a f3070a;

    /* renamed from: b */
    private final C4233wl<Thread, StackTraceElement[], C3604kk> f3071b;

    /* renamed from: com.yandex.metrica.impl.ob.dq$a */
    interface C3349a {
        /* renamed from: a */
        Thread mo39922a();

        /* renamed from: b */
        Map<Thread, StackTraceElement[]> mo39923b();
    }

    public C3346dq() {
        this(new C3349a() {
            /* renamed from: a */
            public Thread mo39922a() {
                return Looper.getMainLooper().getThread();
            }

            /* renamed from: b */
            public Map<Thread, StackTraceElement[]> mo39923b() {
                return Thread.getAllStackTraces();
            }
        }, new C3345dp());
    }

    C3346dq(C3349a aVar, C4233wl<Thread, StackTraceElement[], C3604kk> wlVar) {
        this.f3070a = aVar;
        this.f3071b = wlVar;
    }

    /* renamed from: a */
    public C3599kg mo39920a() {
        Thread a = this.f3070a.mo39922a();
        return new C3599kg(m3035b(a), m3034a(a, (Thread) null));
    }

    /* renamed from: a */
    public List<C3604kk> mo39921a(Thread thread) {
        Thread a = this.f3070a.mo39922a();
        List<C3604kk> a2 = m3034a(a, thread);
        if (thread != a) {
            a2.add(0, m3035b(a));
        }
        return a2;
    }

    /* renamed from: b */
    private C3604kk m3035b(Thread thread) {
        StackTraceElement[] stackTraceElementArr;
        try {
            stackTraceElementArr = thread.getStackTrace();
        } catch (SecurityException unused) {
            stackTraceElementArr = null;
        }
        return this.f3071b.mo39919a(thread, stackTraceElementArr);
    }

    /* renamed from: a */
    private List<C3604kk> m3034a(Thread thread, Thread thread2) {
        Map<Thread, StackTraceElement[]> map;
        ArrayList arrayList = new ArrayList();
        TreeMap treeMap = new TreeMap(new Comparator<Thread>() {
            /* renamed from: a */
            public int compare(Thread thread, Thread thread2) {
                if (thread == thread2) {
                    return 0;
                }
                return C3303cu.m2830d(thread.getName(), thread2.getName());
            }
        });
        try {
            map = this.f3070a.mo39923b();
        } catch (SecurityException unused) {
            map = null;
        }
        if (map != null) {
            treeMap.putAll(map);
        }
        if (thread2 != null) {
            treeMap.remove(thread2);
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            Thread thread3 = (Thread) entry.getKey();
            if (!(thread3 == thread || thread3 == thread2)) {
                arrayList.add(this.f3071b.mo39919a(thread3, (StackTraceElement[]) entry.getValue()));
            }
        }
        return arrayList;
    }
}
