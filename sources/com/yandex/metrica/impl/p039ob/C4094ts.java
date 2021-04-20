package com.yandex.metrica.impl.p039ob;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.TrafficStats;
import android.net.Uri;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import com.yandex.metrica.MetricaService;
import com.yandex.metrica.impl.p039ob.C3129ai;
import com.zhihu.matisse.internal.loader.AlbumLoader;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p042cz.msebera.android.httpclient.cookie.ClientCookie;

/* renamed from: com.yandex.metrica.impl.ob.ts */
public class C4094ts implements C4093tr, Runnable {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final ServiceConnection f4929a;

    /* renamed from: b */
    private final Handler f4930b;

    /* renamed from: c */
    private HashMap<String, C4091tp> f4931c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Context f4932d;

    /* renamed from: e */
    private boolean f4933e;

    /* renamed from: f */
    private ServerSocket f4934f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C4089tn f4935g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C4129ub f4936h;

    /* renamed from: i */
    private C4261xl f4937i;

    /* renamed from: j */
    private long f4938j;

    /* renamed from: k */
    private long f4939k;

    /* renamed from: l */
    private final C4228wh f4940l;

    /* renamed from: m */
    private final C4226wf f4941m;

    /* renamed from: n */
    private final C3129ai.C3133c f4942n;

    /* renamed from: com.yandex.metrica.impl.ob.ts$a */
    public static class C4106a {
        /* renamed from: a */
        public C4094ts mo41483a(Context context) {
            return new C4094ts(context);
        }
    }

    public C4094ts(Context context) {
        this(context, C3136al.m1993a().mo39492g(), C3136al.m1993a().mo39495j().mo41837i(), new C4227wg(), new C4226wf());
    }

    C4094ts(Context context, C3129ai aiVar, C4257xh xhVar, C4228wh whVar, C4226wf wfVar) {
        this.f4929a = new ServiceConnection() {
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            }

            public void onServiceDisconnected(ComponentName componentName) {
            }
        };
        this.f4930b = new Handler(Looper.getMainLooper()) {
            public void handleMessage(Message message) {
                super.handleMessage(message);
                if (message.what == 100) {
                    C4094ts.this.mo41470e();
                    try {
                        C4094ts.this.f4932d.unbindService(C4094ts.this.f4929a);
                    } catch (Throwable unused) {
                        C4085tl.m5459a(C4094ts.this.f4932d).reportEvent("socket_unbind_has_thrown_exception");
                    }
                }
            }
        };
        this.f4931c = new HashMap<String, C4091tp>() {
            {
                put("p", new C4091tp() {
                    /* renamed from: a */
                    public C4090to mo41457a(Socket socket, Uri uri) {
                        return new C4087tm(socket, uri, C4094ts.this, C4094ts.this.f4936h, C4094ts.this.f4935g);
                    }
                });
            }
        };
        this.f4935g = new C4089tn();
        this.f4932d = context;
        this.f4940l = whVar;
        this.f4941m = wfVar;
        this.f4942n = aiVar.mo39472a(new Runnable() {
            public void run() {
                C4094ts.this.m5492h();
            }
        }, xhVar);
        m5491g();
    }

    /* renamed from: g */
    private void m5491g() {
        C3350dr.m3043a().mo39930a(this, C3368ec.class, C3358dv.m3057a(new C3357du<C3368ec>() {
            /* renamed from: a */
            public void mo39399a(C3368ec ecVar) {
                C4094ts.this.f4935g.mo41452a(ecVar.f3097a);
            }
        }).mo39938a(new C3355ds<C3368ec>() {
            /* renamed from: a */
            public boolean mo39612a(C3368ec ecVar) {
                return !C4094ts.this.f4932d.getPackageName().equals(ecVar.f3098b);
            }
        }).mo39939a());
        C3350dr.m3043a().mo39930a(this, C3363dy.class, C3358dv.m3057a(new C3357du<C3363dy>() {
            /* renamed from: a */
            public void mo39399a(C3363dy dyVar) {
                C4094ts.this.f4935g.mo41453b(dyVar.f3091a);
            }
        }).mo39939a());
        C3350dr.m3043a().mo39930a(this, C3361dw.class, C3358dv.m3057a(new C3357du<C3361dw>() {
            /* renamed from: a */
            public void mo39399a(C3361dw dwVar) {
                C4094ts.this.f4935g.mo41454c(dwVar.f3089a);
            }
        }).mo39939a());
        C3350dr.m3043a().mo39930a(this, C3362dx.class, C3358dv.m3057a(new C3357du<C3362dx>() {
            /* renamed from: a */
            public void mo39399a(C3362dx dxVar) {
                C4094ts.this.f4935g.mo41455d(dxVar.f3090a);
            }
        }).mo39939a());
        C3350dr.m3043a().mo39930a(this, C3366ea.class, C3358dv.m3057a(new C3357du<C3366ea>() {
            /* renamed from: a */
            public void mo39399a(C3366ea eaVar) {
                C4094ts.this.mo41464a(eaVar.f3094a);
                C4094ts.this.mo41468c();
            }
        }).mo39939a());
    }

    /* renamed from: a */
    public void mo41463a() {
        if (this.f4933e) {
            mo41467b();
            Handler handler = this.f4930b;
            handler.sendMessageDelayed(handler.obtainMessage(100), TimeUnit.SECONDS.toMillis(this.f4936h.f5047a));
            this.f4939k = this.f4940l.mo41768a();
        }
    }

    /* renamed from: b */
    public void mo41467b() {
        this.f4930b.removeMessages(100);
        this.f4939k = 0;
    }

    /* renamed from: c */
    public synchronized void mo41468c() {
        if (!(this.f4933e || this.f4936h == null || !this.f4942n.mo39481a(this.f4936h.f5051e))) {
            this.f4933e = true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m5492h() {
        mo41469d();
        this.f4937i = C3136al.m1993a().mo39495j().mo41829a(this);
        this.f4937i.start();
        this.f4938j = this.f4940l.mo41768a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo41464a(C4129ub ubVar) {
        this.f4936h = ubVar;
        C4129ub ubVar2 = this.f4936h;
        if (ubVar2 != null) {
            this.f4942n.mo39479a(ubVar2.f5050d);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo41469d() {
        Intent intent = new Intent(this.f4932d, MetricaService.class);
        intent.setAction("com.yandex.metrica.ACTION_BIND_TO_LOCAL_SERVER");
        try {
            if (!this.f4932d.bindService(intent, this.f4929a, 1)) {
                C4085tl.m5459a(this.f4932d).reportEvent("socket_bind_has_failed");
            }
        } catch (Throwable unused) {
            C4085tl.m5459a(this.f4932d).reportEvent("socket_bind_has_thrown_exception");
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo41470e() {
        /*
            r2 = this;
            monitor-enter(r2)
            r0 = 0
            r2.f4933e = r0     // Catch:{ IOException -> 0x001f, all -> 0x001c }
            com.yandex.metrica.impl.ob.xl r0 = r2.f4937i     // Catch:{ IOException -> 0x001f, all -> 0x001c }
            r1 = 0
            if (r0 == 0) goto L_0x0010
            com.yandex.metrica.impl.ob.xl r0 = r2.f4937i     // Catch:{ IOException -> 0x001f, all -> 0x001c }
            r0.mo41814b()     // Catch:{ IOException -> 0x001f, all -> 0x001c }
            r2.f4937i = r1     // Catch:{ IOException -> 0x001f, all -> 0x001c }
        L_0x0010:
            java.net.ServerSocket r0 = r2.f4934f     // Catch:{ IOException -> 0x001f, all -> 0x001c }
            if (r0 == 0) goto L_0x001f
            java.net.ServerSocket r0 = r2.f4934f     // Catch:{ IOException -> 0x001f, all -> 0x001c }
            r0.close()     // Catch:{ IOException -> 0x001f, all -> 0x001c }
            r2.f4934f = r1     // Catch:{ IOException -> 0x001f, all -> 0x001c }
            goto L_0x001f
        L_0x001c:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x001f:
            monitor-exit(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p039ob.C4094ts.mo41470e():void");
    }

    public void run() {
        ServerSocket serverSocket;
        this.f4934f = mo41471f();
        if (C3306cx.m2857a(26)) {
            TrafficStats.setThreadStatsTag(40230);
        }
        if (this.f4934f != null) {
            while (this.f4933e) {
                synchronized (this) {
                    serverSocket = this.f4934f;
                }
                if (serverSocket != null) {
                    Socket socket = null;
                    try {
                        socket = serverSocket.accept();
                        if (C3306cx.m2857a(26)) {
                            TrafficStats.tagSocket(socket);
                        }
                        m5483a(socket);
                        if (socket == null) {
                        }
                    } catch (Throwable unused) {
                        if (0 == 0) {
                        }
                    }
                    try {
                        socket.close();
                    } catch (IOException unused2) {
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public ServerSocket mo41471f() {
        Iterator<Integer> it = this.f4936h.f5049c.iterator();
        ServerSocket serverSocket = null;
        Integer num = null;
        while (serverSocket == null && it.hasNext()) {
            try {
                Integer next = it.next();
                if (next != null) {
                    try {
                        serverSocket = mo41466b(next.intValue());
                    } catch (SocketException unused) {
                        num = next;
                        mo41465a("port_already_in_use", num.intValue());
                    } catch (IOException unused2) {
                    }
                }
                num = next;
            } catch (SocketException unused3) {
                mo41465a("port_already_in_use", num.intValue());
            } catch (IOException unused4) {
            }
        }
        return serverSocket;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public ServerSocket mo41466b(int i) throws IOException {
        return new ServerSocket(i);
    }

    /* renamed from: c */
    private Map<String, Object> m5487c(int i) {
        HashMap hashMap = new HashMap();
        hashMap.put(ClientCookie.PORT_ATTR, String.valueOf(i));
        return hashMap;
    }

    /* renamed from: d */
    private Map<String, Object> m5489d(int i) {
        Map<String, Object> c = m5487c(i);
        c.put("idle_interval", Double.valueOf(m5481a(this.f4938j)));
        c.put("background_interval", Double.valueOf(m5481a(this.f4939k)));
        return c;
    }

    /* renamed from: a */
    private double m5481a(long j) {
        long j2 = 0;
        if (j != 0) {
            j2 = this.f4941m.mo41767e(j, TimeUnit.MILLISECONDS);
        }
        return (double) j2;
    }

    /* renamed from: a */
    private void m5483a(Socket socket) {
        new C4092tq(socket, this, this.f4931c).mo41458a();
    }

    /* renamed from: a */
    public void mo41461a(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put(AlbumLoader.COLUMN_URI, str2);
        C3139an a = C4085tl.m5459a(this.f4932d);
        a.reportEvent("socket_" + str, (Map<String, Object>) hashMap);
    }

    /* renamed from: a */
    public void mo41460a(String str) {
        C4085tl.m5459a(this.f4932d).reportEvent(m5485b(str));
    }

    /* renamed from: a */
    public void mo41462a(String str, Throwable th) {
        C4085tl.m5459a(this.f4932d).reportError(m5485b(str), th);
    }

    /* renamed from: a */
    public void mo41465a(String str, int i) {
        C4085tl.m5459a(this.f4932d).reportEvent(m5485b(str), m5487c(i));
    }

    /* renamed from: a */
    public void mo41459a(int i) {
        C4085tl.m5459a(this.f4932d).reportEvent(m5485b("sync_succeed"), m5489d(i));
    }

    /* renamed from: b */
    private String m5485b(String str) {
        return "socket_" + str;
    }
}
