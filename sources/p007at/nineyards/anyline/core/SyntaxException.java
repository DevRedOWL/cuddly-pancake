package p007at.nineyards.anyline.core;

/* renamed from: at.nineyards.anyline.core.SyntaxException */
public class SyntaxException extends AnylineException {

    /* renamed from: a */
    private final int f462a;

    /* renamed from: b */
    private final String f463b;

    /* renamed from: c */
    private final String f464c;

    public SyntaxException(int i, String str, int i2, String str2, String str3) {
        super(i, str);
        this.f462a = i2;
        this.f463b = str2;
        this.f464c = str3;
    }

    public int lineNumber() {
        return this.f462a;
    }

    public String lineString() {
        return this.f463b;
    }

    public String parameterName() {
        return this.f464c;
    }
}
