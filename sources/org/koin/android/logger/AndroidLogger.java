package org.koin.android.logger;

import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.koin.core.logger.Level;
import org.koin.core.logger.Logger;
import org.koin.core.logger.LoggerKt;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u00020\u00062\n\u0010\u0007\u001a\u00060\bj\u0002`\tH\u0002J\u001c\u0010\n\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00032\n\u0010\u0007\u001a\u00060\bj\u0002`\tH\u0016¨\u0006\u000b"}, mo51343d2 = {"Lorg/koin/android/logger/AndroidLogger;", "Lorg/koin/core/logger/Logger;", "level", "Lorg/koin/core/logger/Level;", "(Lorg/koin/core/logger/Level;)V", "LogOnLevel", "", "msg", "", "Lorg/koin/core/logger/MESSAGE;", "log", "koin-android_release"}, mo51344k = 1, mo51345mv = {1, 1, 15})
/* compiled from: AndroidLogger.kt */
public final class AndroidLogger extends Logger {

    @Metadata(mo51341bv = {1, 0, 3}, mo51344k = 3, mo51345mv = {1, 1, 15})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[Level.values().length];

        static {
            $EnumSwitchMapping$0[Level.DEBUG.ordinal()] = 1;
            $EnumSwitchMapping$0[Level.INFO.ordinal()] = 2;
            $EnumSwitchMapping$0[Level.ERROR.ordinal()] = 3;
        }
    }

    public AndroidLogger() {
        this((Level) null, 1, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidLogger(Level level) {
        super(level);
        Intrinsics.checkParameterIsNotNull(level, FirebaseAnalytics.Param.LEVEL);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AndroidLogger(Level level, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Level.INFO : level);
    }

    public void log(Level level, String str) {
        Intrinsics.checkParameterIsNotNull(level, FirebaseAnalytics.Param.LEVEL);
        Intrinsics.checkParameterIsNotNull(str, NotificationCompat.CATEGORY_MESSAGE);
        if (getLevel().compareTo(level) <= 0) {
            LogOnLevel(str);
        }
    }

    private final void LogOnLevel(String str) {
        int i = WhenMappings.$EnumSwitchMapping$0[getLevel().ordinal()];
        if (i == 1) {
            Log.d(LoggerKt.KOIN_TAG, str);
        } else if (i == 2) {
            Log.i(LoggerKt.KOIN_TAG, str);
        } else if (i == 3) {
            Log.e(LoggerKt.KOIN_TAG, str);
        }
    }
}
