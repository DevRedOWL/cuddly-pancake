package p046io.realm.internal;

/* renamed from: io.realm.internal.IOException */
public class IOException extends RuntimeException {
    public IOException(Throwable th) {
        super(th);
    }

    public IOException() {
    }

    public IOException(String str) {
        super(str);
    }

    public IOException(String str, Throwable th) {
        super(str, th);
    }
}
