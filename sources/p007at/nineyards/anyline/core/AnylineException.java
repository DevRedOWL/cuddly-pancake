package p007at.nineyards.anyline.core;

/* renamed from: at.nineyards.anyline.core.AnylineException */
public class AnylineException extends Exception {

    /* renamed from: a */
    private int f443a;

    /* renamed from: b */
    private String f444b;

    protected AnylineException() {
    }

    public AnylineException(int i, String str) {
        this.f443a = i;
        this.f444b = str;
    }

    public String getMessage() {
        return reason();
    }

    public int errorCode() {
        return this.f443a;
    }

    public String reason() {
        return this.f444b;
    }
}
