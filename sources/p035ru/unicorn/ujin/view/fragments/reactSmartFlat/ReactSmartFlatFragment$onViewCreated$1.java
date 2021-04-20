package p035ru.unicorn.ujin.view.fragments.reactSmartFlat;

import com.facebook.react.bridge.ReadableMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.ReactEventCallback;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\n¢\u0006\u0002\b\u0007"}, mo51343d2 = {"<anonymous>", "", "reason", "", "kotlin.jvm.PlatformType", "map", "Lcom/facebook/react/bridge/ReadableMap;", "onEventSent"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.reactSmartFlat.ReactSmartFlatFragment$onViewCreated$1 */
/* compiled from: ReactSmartFlatFragment.kt */
final class ReactSmartFlatFragment$onViewCreated$1 implements ReactEventCallback {
    final /* synthetic */ ReactSmartFlatFragment this$0;

    ReactSmartFlatFragment$onViewCreated$1(ReactSmartFlatFragment reactSmartFlatFragment) {
        this.this$0 = reactSmartFlatFragment;
    }

    public final void onEventSent(String str, ReadableMap readableMap) {
        ReactSmartFlatFragment reactSmartFlatFragment = this.this$0;
        Intrinsics.checkNotNullExpressionValue(str, "reason");
        reactSmartFlatFragment.handleEvent(str, readableMap);
    }
}
