package p035ru.unicorn.ujin.data.api.response;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo51343d2 = {"Lru/unicorn/ujin/data/api/response/GetLayoutResponseData;", "", "layout", "Lru/unicorn/ujin/data/api/response/Layout;", "(Lru/unicorn/ujin/data/api/response/Layout;)V", "getLayout", "()Lru/unicorn/ujin/data/api/response/Layout;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.api.response.GetLayoutResponseData */
/* compiled from: GetLayoutResponse.kt */
public final class GetLayoutResponseData {
    private final Layout layout;

    public GetLayoutResponseData(Layout layout2) {
        Intrinsics.checkNotNullParameter(layout2, "layout");
        this.layout = layout2;
    }

    public final Layout getLayout() {
        return this.layout;
    }
}
