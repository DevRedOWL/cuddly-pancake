package p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Predicate;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.myrenta.-$$Lambda$MyRentaViewModel$LjI5woUwp9hPFgquPp0yvg1z3hg  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$MyRentaViewModel$LjI5woUwp9hPFgquPp0yvg1z3hg implements Predicate {
    public static final /* synthetic */ $$Lambda$MyRentaViewModel$LjI5woUwp9hPFgquPp0yvg1z3hg INSTANCE = new $$Lambda$MyRentaViewModel$LjI5woUwp9hPFgquPp0yvg1z3hg();

    private /* synthetic */ $$Lambda$MyRentaViewModel$LjI5woUwp9hPFgquPp0yvg1z3hg() {
    }

    public final boolean test(Object obj) {
        return ((Resource) obj).getStatus().equals(Resource.Status.SUCCESS);
    }
}
