package p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Predicate;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.mycompany.-$$Lambda$MyRentaCompanyViewModel$O8plStI0X-9Vt2K66Cp3YqvwNyQ  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$MyRentaCompanyViewModel$O8plStI0X9Vt2K66Cp3YqvwNyQ implements Predicate {
    public static final /* synthetic */ $$Lambda$MyRentaCompanyViewModel$O8plStI0X9Vt2K66Cp3YqvwNyQ INSTANCE = new $$Lambda$MyRentaCompanyViewModel$O8plStI0X9Vt2K66Cp3YqvwNyQ();

    private /* synthetic */ $$Lambda$MyRentaCompanyViewModel$O8plStI0X9Vt2K66Cp3YqvwNyQ() {
    }

    public final boolean test(Object obj) {
        return ((Resource) obj).getStatus().equals(Resource.Status.SUCCESS);
    }
}
