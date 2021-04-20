package p008c.p009a.p014b;

import p008c.p009a.p014b.C0871f;
import p008c.p009a.p014b.C0878g;

/* renamed from: c.a.b.h */
public interface C0882h {

    /* renamed from: c.a.b.h$a */
    public static class C0883a {

        /* renamed from: a */
        public final C0882h f861a;

        /* renamed from: b */
        public final C0871f f862b;

        /* renamed from: c */
        public final C0886c f863c;

        /* renamed from: d */
        public C0887d f864d;

        /* renamed from: c.a.b.h$a$a */
        public class C0884a implements C0871f.C0877c {
            public C0884a() {
            }

            /* renamed from: a */
            public void mo12949a(byte[] bArr) {
                C0887d dVar = C0883a.this.f864d;
                if (dVar != null) {
                    dVar.mo12949a(bArr);
                }
            }
        }

        public C0883a(C0882h hVar, C0871f fVar, C0886c cVar) {
            this.f861a = hVar;
            this.f862b = fVar;
            this.f863c = cVar;
            ((C0878g.C0879a) fVar).mo12969a((C0871f.C0877c) new C0884a());
        }

        /* renamed from: a */
        public C0886c mo12972a() {
            return this.f863c;
        }

        /* renamed from: a */
        public void mo12973a(C0887d dVar) {
            this.f864d = dVar;
        }

        /* renamed from: b */
        public C0871f mo12974b() {
            return this.f862b;
        }
    }

    /* renamed from: c.a.b.h$b */
    public static class C0885b extends Exception {

        /* renamed from: a */
        public final int f866a;

        public C0885b(int i) {
            this.f866a = i;
        }

        public C0885b(int i, String str) {
            super(str);
            this.f866a = i;
        }

        public String toString() {
            String str;
            String str2;
            StringBuilder sb;
            if (getMessage() != null) {
                str = ", " + getMessage();
            } else {
                str = "";
            }
            switch (this.f866a) {
                case 1:
                    sb = new StringBuilder();
                    str2 = "Access denied";
                    break;
                case 2:
                    sb = new StringBuilder();
                    str2 = "Authorization required";
                    break;
                case 4:
                    sb = new StringBuilder();
                    str2 = "Connection busy";
                    break;
                case 5:
                    sb = new StringBuilder();
                    str2 = "Connection lost";
                    break;
                case 6:
                    sb = new StringBuilder();
                    str2 = "Command error";
                    break;
                case 7:
                    sb = new StringBuilder();
                    str2 = "Timeout exhausted";
                    break;
                case 9:
                    sb = new StringBuilder();
                    str2 = "No master card error";
                    break;
                case 10:
                    sb = new StringBuilder();
                    str2 = "No key error";
                    break;
                default:
                    sb = new StringBuilder();
                    str2 = "Internal error";
                    break;
            }
            sb.append(str2);
            sb.append(str);
            return sb.toString();
        }
    }

    /* renamed from: c.a.b.h$c */
    public static class C0886c {

        /* renamed from: a */
        public final int f867a;

        /* renamed from: b */
        public final int f868b;

        /* renamed from: c */
        public boolean f869c = false;

        public C0886c(int i, int i2) {
            this.f867a = i;
            this.f868b = i2;
        }
    }

    /* renamed from: c.a.b.h$d */
    public interface C0887d extends C0871f.C0877c {
        /* renamed from: a */
        void mo12947a(C0885b bVar);

        /* renamed from: b */
        void mo12950b();
    }

    /* renamed from: a */
    void mo12939a();

    /* renamed from: b */
    void mo12942b(byte[] bArr);

    /* renamed from: c */
    void mo12943c();
}
