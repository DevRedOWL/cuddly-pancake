package p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Predicate;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.myrenta.-$$Lambda$MyRentaViewModel$tDqTiiTJl3znNQgxf7Wi8QjvMJE  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$MyRentaViewModel$tDqTiiTJl3znNQgxf7Wi8QjvMJE implements Predicate {
    public static final /* synthetic */ $$Lambda$MyRentaViewModel$tDqTiiTJl3znNQgxf7Wi8QjvMJE INSTANCE = new $$Lambda$MyRentaViewModel$tDqTiiTJl3znNQgxf7Wi8QjvMJE();

    private /* synthetic */ $$Lambda$MyRentaViewModel$tDqTiiTJl3znNQgxf7Wi8QjvMJE() {
    }

    public final boolean test(Object obj) {
        return ((Resource) obj).getStatus().equals(Resource.Status.SUCCESS);
    }
}
