package com.yandex.metrica.impl.p039ob;

import java.util.Arrays;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.dp */
public class C3345dp implements C4233wl<Thread, StackTraceElement[], C3604kk> {
    /* renamed from: a */
    public C3604kk mo39919a(Thread thread, StackTraceElement[] stackTraceElementArr) {
        List list;
        String name = thread.getName();
        int priority = thread.getPriority();
        long id = thread.getId();
        String a = m3031a(thread);
        Integer valueOf = Integer.valueOf(thread.getState().ordinal());
        if (stackTraceElementArr == null) {
            list = null;
        } else {
            list = Arrays.asList(stackTraceElementArr);
        }
        return new C3604kk(name, priority, id, a, valueOf, list);
    }

    /* renamed from: a */
    static String m3031a(Thread thread) {
        ThreadGroup threadGroup = thread.getThreadGroup();
        return threadGroup != null ? threadGroup.getName() : "";
    }
}
