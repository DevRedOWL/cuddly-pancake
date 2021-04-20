package p007at.nineyards.anyline.modules.ocr;

/* renamed from: at.nineyards.anyline.modules.ocr.a */
final class C0804a {

    /* renamed from: a */
    private String f721a;

    /* renamed from: b */
    private String f722b;

    /* renamed from: c */
    private C0805a f723c;

    /* renamed from: d */
    private String f724d;

    /* renamed from: at.nineyards.anyline.modules.ocr.a$a */
    enum C0805a {
        ANY("any"),
        TESSERACT("traineddata");
        

        /* renamed from: c */
        private final String f728c;

        private C0805a(String str) {
            this.f728c = str;
        }

        public final String toString() {
            return this.f728c;
        }

        /* renamed from: a */
        public static C0805a m355a(String str) throws IllegalArgumentException {
            if (str.equalsIgnoreCase(ANY.toString())) {
                return ANY;
            }
            if (str.equalsIgnoreCase(TESSERACT.toString())) {
                return TESSERACT;
            }
            throw new IllegalArgumentException("Unknown file extension " + str);
        }
    }

    C0804a() {
    }

    C0804a(String str) throws IllegalArgumentException {
        String str2;
        this.f721a = str;
        this.f722b = null;
        int lastIndexOf = str.lastIndexOf(".");
        if (lastIndexOf != -1) {
            this.f723c = C0805a.m355a(str.substring(lastIndexOf + 1));
            int lastIndexOf2 = str.lastIndexOf(".");
            int lastIndexOf3 = str.lastIndexOf("/");
            if (lastIndexOf2 != -1) {
                str2 = str.substring(lastIndexOf3 + 1, lastIndexOf2);
            } else {
                str2 = str.substring(lastIndexOf3 + 1);
            }
            this.f724d = str2;
            return;
        }
        throw new IllegalArgumentException("No file extension given");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String mo12767a() {
        return this.f721a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final String mo12770b() {
        return this.f724d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo12769a(String str) {
        this.f724d = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo12768a(C0805a aVar) {
        this.f723c = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final C0805a mo12771c() {
        return this.f723c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final String mo12772d() {
        String str = this.f721a;
        if (str == null) {
            return "";
        }
        return str.substring(str.lastIndexOf("/") + 1);
    }
}
