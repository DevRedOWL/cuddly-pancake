package p035ru.unicorn.ujin.data.repository;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, mo51343d2 = {"Lru/unicorn/ujin/data/repository/ResourceProvider;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getString", "", "resId", "", "value", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.repository.ResourceProvider */
/* compiled from: ResouceProvider.kt */
public final class ResourceProvider {
    private final Context context;

    public ResourceProvider(Context context2) {
        Intrinsics.checkNotNullParameter(context2, "context");
        this.context = context2;
    }

    public final String getString(int i) {
        String string = this.context.getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(resId)");
        return string;
    }

    public final String getString(int i, String str) {
        Intrinsics.checkNotNullParameter(str, "value");
        String string = this.context.getString(i, new Object[]{str});
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(resId, value)");
        return string;
    }
}
