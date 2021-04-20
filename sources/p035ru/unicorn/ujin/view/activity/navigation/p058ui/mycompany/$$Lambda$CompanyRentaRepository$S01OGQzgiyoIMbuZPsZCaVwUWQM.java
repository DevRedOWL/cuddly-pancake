package p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.mycompany.-$$Lambda$CompanyRentaRepository$S01OGQzgiyoIMbuZPsZCaVwUWQM  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$CompanyRentaRepository$S01OGQzgiyoIMbuZPsZCaVwUWQM implements Function {
    public static final /* synthetic */ $$Lambda$CompanyRentaRepository$S01OGQzgiyoIMbuZPsZCaVwUWQM INSTANCE = new $$Lambda$CompanyRentaRepository$S01OGQzgiyoIMbuZPsZCaVwUWQM();

    private /* synthetic */ $$Lambda$CompanyRentaRepository$S01OGQzgiyoIMbuZPsZCaVwUWQM() {
    }

    public final Object apply(Object obj) {
        return Resource.success(0, "", ((CompanyList) ((Resource) obj).getData()).getRentCompany());
    }
}
