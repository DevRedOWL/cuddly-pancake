package p007at.nineyards.anyline.core;

/* renamed from: at.nineyards.anyline.core.ArgumentException */
public class ArgumentException extends AnylineException {

    /* renamed from: a */
    private final String f445a;

    public ArgumentException(int i, String str, String str2) {
        super(i, str);
        this.f445a = str2;
    }

    public String parameterName() {
        return this.f445a;
    }
}
