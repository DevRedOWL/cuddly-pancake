package p033co.infinum.goldeneye.utils;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p033co.infinum.goldeneye.Logger;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0010"}, mo51343d2 = {"Lco/infinum/goldeneye/utils/LogDelegate;", "", "()V", "logger", "Lco/infinum/goldeneye/Logger;", "getLogger", "()Lco/infinum/goldeneye/Logger;", "setLogger", "(Lco/infinum/goldeneye/Logger;)V", "log", "", "message", "", "(Ljava/lang/String;)Lkotlin/Unit;", "t", "", "goldeneye_release"}, mo51344k = 1, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.utils.LogDelegate */
/* compiled from: LogDelegate.kt */
public final class LogDelegate {
    public static final LogDelegate INSTANCE = new LogDelegate();
    private static Logger logger;

    private LogDelegate() {
    }

    public final Logger getLogger() {
        return logger;
    }

    public final void setLogger(Logger logger2) {
        logger = logger2;
    }

    public final Unit log(String str) {
        Intrinsics.checkParameterIsNotNull(str, "message");
        Logger logger2 = logger;
        if (logger2 == null) {
            return null;
        }
        logger2.log(str);
        return Unit.INSTANCE;
    }

    public final void log(String str, Throwable th) {
        Intrinsics.checkParameterIsNotNull(str, "message");
        Intrinsics.checkParameterIsNotNull(th, "t");
        Logger logger2 = logger;
        if (logger2 != null) {
            logger2.log(str);
        }
        Logger logger3 = logger;
        if (logger3 != null) {
            logger3.log(th);
        }
    }
}
