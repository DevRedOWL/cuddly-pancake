package p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_settings.ble;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/pass_settings/ble/BleResult;", "", "request", "", "isEnable", "Lkotlin/Function0;", "", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "()Lkotlin/jvm/functions/Function0;", "getRequest", "()Ljava/lang/String;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass_settings.ble.BleResult */
/* compiled from: BleResult.kt */
public final class BleResult {
    private final Function0<Boolean> isEnable;
    private final String request;

    public BleResult(String str, Function0<Boolean> function0) {
        Intrinsics.checkNotNullParameter(str, "request");
        Intrinsics.checkNotNullParameter(function0, "isEnable");
        this.request = str;
        this.isEnable = function0;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BleResult(String str, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? C59091.INSTANCE : function0);
    }

    public final String getRequest() {
        return this.request;
    }

    public final Function0<Boolean> isEnable() {
        return this.isEnable;
    }
}
