package p035ru.unicorn.ujin.view.activity.navigation.repository;

import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.activity.navigation.entity.schema.Schemas;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.repository.-$$Lambda$-wBjaGCFaMdic0VcMkC832jR6IA  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$wBjaGCFaMdic0VcMkC832jR6IA implements Function {
    public static final /* synthetic */ $$Lambda$wBjaGCFaMdic0VcMkC832jR6IA INSTANCE = new $$Lambda$wBjaGCFaMdic0VcMkC832jR6IA();

    private /* synthetic */ $$Lambda$wBjaGCFaMdic0VcMkC832jR6IA() {
    }

    public final Object apply(Object obj) {
        return (Schemas) ((Resource) obj).getData();
    }
}
