package p035ru.unicorn.ujin.data.service.location;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.data.service.location.-$$Lambda$LocationRepository$q115WkJlKvU3Pc2TfBTGtStno44  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$LocationRepository$q115WkJlKvU3Pc2TfBTGtStno44 implements Function {
    public static final /* synthetic */ $$Lambda$LocationRepository$q115WkJlKvU3Pc2TfBTGtStno44 INSTANCE = new $$Lambda$LocationRepository$q115WkJlKvU3Pc2TfBTGtStno44();

    private /* synthetic */ $$Lambda$LocationRepository$q115WkJlKvU3Pc2TfBTGtStno44() {
    }

    public final Object apply(Object obj) {
        return Resource.success(((Resource) obj).getError(), ((Resource) obj).getMessage(), ((Resource) obj).getData());
    }
}
