package p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Predicate;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.myrenta.-$$Lambda$MyRentaViewModel$8yze0mkjNqA7FJtjLANEd_uw5y0  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$MyRentaViewModel$8yze0mkjNqA7FJtjLANEd_uw5y0 implements Predicate {
    public static final /* synthetic */ $$Lambda$MyRentaViewModel$8yze0mkjNqA7FJtjLANEd_uw5y0 INSTANCE = new $$Lambda$MyRentaViewModel$8yze0mkjNqA7FJtjLANEd_uw5y0();

    private /* synthetic */ $$Lambda$MyRentaViewModel$8yze0mkjNqA7FJtjLANEd_uw5y0() {
    }

    public final boolean test(Object obj) {
        return ((Resource) obj).getStatus().equals(Resource.Status.SUCCESS);
    }
}
