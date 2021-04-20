package p033co.infinum.goldeneye;

import kotlin.Metadata;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, mo51343d2 = {"Lco/infinum/goldeneye/ThreadNotStartedException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "()V", "goldeneye_release"}, mo51344k = 1, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.ThreadNotStartedException */
/* compiled from: Exceptions.kt */
public final class ThreadNotStartedException extends Exception {
    public static final ThreadNotStartedException INSTANCE = new ThreadNotStartedException();

    private ThreadNotStartedException() {
        super("Trying to fetch [backgroundHandler] but background Thread is not started.");
    }
}
