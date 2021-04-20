package p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.mycompany.-$$Lambda$CompanyRentaRepository$U_axtZDGzsb1SM9QCnmWaqjhXSo  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$CompanyRentaRepository$U_axtZDGzsb1SM9QCnmWaqjhXSo implements Function {
    public static final /* synthetic */ $$Lambda$CompanyRentaRepository$U_axtZDGzsb1SM9QCnmWaqjhXSo INSTANCE = new $$Lambda$CompanyRentaRepository$U_axtZDGzsb1SM9QCnmWaqjhXSo();

    private /* synthetic */ $$Lambda$CompanyRentaRepository$U_axtZDGzsb1SM9QCnmWaqjhXSo() {
    }

    public final Object apply(Object obj) {
        return Resource.success(((Resource) obj).getError(), ((Resource) obj).getMessage(), ((Resource) obj).getData());
    }
}
