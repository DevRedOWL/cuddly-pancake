package p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany;

import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.response.CompanyObjectsResponse;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.mycompany.-$$Lambda$CompanyRentaRepository$ZNk4eUwTSV0TxeJ_hHSlfBuappI  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$CompanyRentaRepository$ZNk4eUwTSV0TxeJ_hHSlfBuappI implements Function {
    public static final /* synthetic */ $$Lambda$CompanyRentaRepository$ZNk4eUwTSV0TxeJ_hHSlfBuappI INSTANCE = new $$Lambda$CompanyRentaRepository$ZNk4eUwTSV0TxeJ_hHSlfBuappI();

    private /* synthetic */ $$Lambda$CompanyRentaRepository$ZNk4eUwTSV0TxeJ_hHSlfBuappI() {
    }

    public final Object apply(Object obj) {
        return Resource.success(0, "", ((CompanyObjectsResponse) ((Resource) obj).getData()).getObjects());
    }
}
