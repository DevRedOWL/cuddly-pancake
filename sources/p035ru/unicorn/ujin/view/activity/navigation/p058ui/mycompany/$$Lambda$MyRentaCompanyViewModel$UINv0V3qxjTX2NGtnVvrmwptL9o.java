package p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Predicate;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.mycompany.-$$Lambda$MyRentaCompanyViewModel$UINv0V3qxjTX2NGtnVvrmwptL9o  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$MyRentaCompanyViewModel$UINv0V3qxjTX2NGtnVvrmwptL9o implements Predicate {
    public static final /* synthetic */ $$Lambda$MyRentaCompanyViewModel$UINv0V3qxjTX2NGtnVvrmwptL9o INSTANCE = new $$Lambda$MyRentaCompanyViewModel$UINv0V3qxjTX2NGtnVvrmwptL9o();

    private /* synthetic */ $$Lambda$MyRentaCompanyViewModel$UINv0V3qxjTX2NGtnVvrmwptL9o() {
    }

    public final boolean test(Object obj) {
        return ((Resource) obj).getStatus().equals(Resource.Status.SUCCESS);
    }
}
