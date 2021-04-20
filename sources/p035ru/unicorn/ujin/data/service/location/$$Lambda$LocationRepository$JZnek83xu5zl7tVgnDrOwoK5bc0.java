package p035ru.unicorn.ujin.data.service.location;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.data.service.location.-$$Lambda$LocationRepository$JZnek83xu5zl7tVgnDrOwoK5bc0  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$LocationRepository$JZnek83xu5zl7tVgnDrOwoK5bc0 implements Function {
    public static final /* synthetic */ $$Lambda$LocationRepository$JZnek83xu5zl7tVgnDrOwoK5bc0 INSTANCE = new $$Lambda$LocationRepository$JZnek83xu5zl7tVgnDrOwoK5bc0();

    private /* synthetic */ $$Lambda$LocationRepository$JZnek83xu5zl7tVgnDrOwoK5bc0() {
    }

    public final Object apply(Object obj) {
        return Resource.success(((Resource) obj).getError(), ((Resource) obj).getMessage(), ((Resource) obj).getData());
    }
}
