package p035ru.unicorn.ujin.view.activity.navigation.p058ui.domservice;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Predicate;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.domservice.-$$Lambda$DomServiceViewModel$ZSZMIX840qmZKmVX1K1PWoZGMj4  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$DomServiceViewModel$ZSZMIX840qmZKmVX1K1PWoZGMj4 implements Predicate {
    public static final /* synthetic */ $$Lambda$DomServiceViewModel$ZSZMIX840qmZKmVX1K1PWoZGMj4 INSTANCE = new $$Lambda$DomServiceViewModel$ZSZMIX840qmZKmVX1K1PWoZGMj4();

    private /* synthetic */ $$Lambda$DomServiceViewModel$ZSZMIX840qmZKmVX1K1PWoZGMj4() {
    }

    public final boolean test(Object obj) {
        return ((Resource) obj).getStatus().equals(Resource.Status.SUCCESS);
    }
}
