package p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_settings.ble;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.mobileid.Api;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016\u0001\u0007\u0006\u0007\b\t\n\u000b\f¨\u0006\r"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/pass_settings/ble/RequestAccessState;", "", "()V", "toString", "", "Companion", "Lru/unicorn/ujin/view/activity/navigation/ui/pass_settings/ble/Started;", "Lru/unicorn/ujin/view/activity/navigation/ui/pass_settings/ble/Accepted;", "Lru/unicorn/ujin/view/activity/navigation/ui/pass_settings/ble/Granted;", "Lru/unicorn/ujin/view/activity/navigation/ui/pass_settings/ble/Denied;", "Lru/unicorn/ujin/view/activity/navigation/ui/pass_settings/ble/Unidentified;", "Lru/unicorn/ujin/view/activity/navigation/ui/pass_settings/ble/Unknown;", "Lru/unicorn/ujin/view/activity/navigation/ui/pass_settings/ble/Empty;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass_settings.ble.RequestAccessState */
/* compiled from: RequestAccessState.kt */
public abstract class RequestAccessState {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    private RequestAccessState() {
    }

    public /* synthetic */ RequestAccessState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public String toString() {
        String simpleName = getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "javaClass.simpleName");
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "Locale.getDefault()");
        if (simpleName != null) {
            String upperCase = simpleName.toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase, "(this as java.lang.String).toUpperCase(locale)");
            return upperCase;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/pass_settings/ble/RequestAccessState$Companion;", "", "()V", "valueOf", "Lru/unicorn/ujin/view/activity/navigation/ui/pass_settings/ble/RequestAccessState;", "result", "Lorg/mobileid/Api$RequestAccessResult;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass_settings.ble.RequestAccessState$Companion */
    /* compiled from: RequestAccessState.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final RequestAccessState valueOf(Api.RequestAccessResult requestAccessResult) {
            Intrinsics.checkNotNullParameter(requestAccessResult, "result");
            switch (requestAccessResult) {
                case ACCEPTED:
                    return Accepted.INSTANCE;
                case GRANTED:
                    return Granted.INSTANCE;
                case DENIED:
                    return Denied.INSTANCE;
                case UNIDENTIFIED:
                    return Unidentified.INSTANCE;
                case UNKNOWN:
                    return Unknown.INSTANCE;
                case EMPTY:
                    return Empty.INSTANCE;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }
}
