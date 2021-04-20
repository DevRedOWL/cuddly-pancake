package p035ru.unicorn.ujin.data.api.response;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p042cz.msebera.android.httpclient.cookie.ClientCookie;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012>\u0010\u0007\u001a:\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\t0\bj$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\tj\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001`\u000b`\n¢\u0006\u0002\u0010\fRN\u0010\u0007\u001a:\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\t0\bj$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\tj\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001`\u000b`\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, mo51343d2 = {"Lru/unicorn/ujin/data/api/response/Layout;", "", "version", "", "id", "", "title", "componentList", "Ljava/util/ArrayList;", "Ljava/util/HashMap;", "Lkotlin/collections/ArrayList;", "Lkotlin/collections/HashMap;", "(Ljava/lang/String;ILjava/lang/String;Ljava/util/ArrayList;)V", "getComponentList", "()Ljava/util/ArrayList;", "getId", "()I", "getTitle", "()Ljava/lang/String;", "getVersion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.api.response.Layout */
/* compiled from: GetLayoutResponse.kt */
public final class Layout {
    @SerializedName("components")
    private final ArrayList<HashMap<String, Object>> componentList;

    /* renamed from: id */
    private final int f6614id;
    private final String title;
    private final String version;

    public Layout(String str, int i, String str2, ArrayList<HashMap<String, Object>> arrayList) {
        Intrinsics.checkNotNullParameter(str, ClientCookie.VERSION_ATTR);
        Intrinsics.checkNotNullParameter(str2, "title");
        Intrinsics.checkNotNullParameter(arrayList, "componentList");
        this.version = str;
        this.f6614id = i;
        this.title = str2;
        this.componentList = arrayList;
    }

    public final String getVersion() {
        return this.version;
    }

    public final int getId() {
        return this.f6614id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final ArrayList<HashMap<String, Object>> getComponentList() {
        return this.componentList;
    }
}
