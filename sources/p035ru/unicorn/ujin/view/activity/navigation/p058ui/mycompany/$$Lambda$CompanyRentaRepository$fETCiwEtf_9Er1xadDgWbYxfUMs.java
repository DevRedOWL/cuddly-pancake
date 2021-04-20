package p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.mycompany.-$$Lambda$CompanyRentaRepository$fETCiwEtf_9Er1xadDgWbYxfUMs  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$CompanyRentaRepository$fETCiwEtf_9Er1xadDgWbYxfUMs implements Function {
    public static final /* synthetic */ $$Lambda$CompanyRentaRepository$fETCiwEtf_9Er1xadDgWbYxfUMs INSTANCE = new $$Lambda$CompanyRentaRepository$fETCiwEtf_9Er1xadDgWbYxfUMs();

    private /* synthetic */ $$Lambda$CompanyRentaRepository$fETCiwEtf_9Er1xadDgWbYxfUMs() {
    }

    public final Object apply(Object obj) {
        return Resource.success(0, "", ((CompanyListUno) ((Resource) obj).getData()).getRentCompany());
    }
}
