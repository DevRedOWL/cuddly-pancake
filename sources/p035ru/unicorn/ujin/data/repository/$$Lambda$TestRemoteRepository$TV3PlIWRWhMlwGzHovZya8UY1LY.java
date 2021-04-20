package p035ru.unicorn.ujin.data.repository;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.data.repository.-$$Lambda$TestRemoteRepository$TV3PlIWRWhMlwGzHovZya8UY1LY  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$TestRemoteRepository$TV3PlIWRWhMlwGzHovZya8UY1LY implements Function {
    public static final /* synthetic */ $$Lambda$TestRemoteRepository$TV3PlIWRWhMlwGzHovZya8UY1LY INSTANCE = new $$Lambda$TestRemoteRepository$TV3PlIWRWhMlwGzHovZya8UY1LY();

    private /* synthetic */ $$Lambda$TestRemoteRepository$TV3PlIWRWhMlwGzHovZya8UY1LY() {
    }

    public final Object apply(Object obj) {
        return Resource.error(((Throwable) obj).getMessage());
    }
}
