package p033co.infinum.goldeneye;

import kotlin.Metadata;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, mo51343d2 = {"Lco/infinum/goldeneye/IllegalEnumException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "()V", "goldeneye_release"}, mo51344k = 1, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.IllegalEnumException */
/* compiled from: Exceptions.kt */
public final class IllegalEnumException extends Exception {
    public static final IllegalEnumException INSTANCE = new IllegalEnumException();

    private IllegalEnumException() {
        super("Trying to convert illegal enum to Camera value. This is library error that should be reported.");
    }
}
