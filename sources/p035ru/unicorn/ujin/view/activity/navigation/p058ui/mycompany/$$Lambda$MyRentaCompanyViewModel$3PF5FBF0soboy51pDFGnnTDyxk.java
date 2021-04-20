package p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany;

import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my_team.ContactData;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.mycompany.-$$Lambda$MyRentaCompanyViewModel$3PF5FBF0soboy5-1pDFGnnTDyxk  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$MyRentaCompanyViewModel$3PF5FBF0soboy51pDFGnnTDyxk implements Function {
    public static final /* synthetic */ $$Lambda$MyRentaCompanyViewModel$3PF5FBF0soboy51pDFGnnTDyxk INSTANCE = new $$Lambda$MyRentaCompanyViewModel$3PF5FBF0soboy51pDFGnnTDyxk();

    private /* synthetic */ $$Lambda$MyRentaCompanyViewModel$3PF5FBF0soboy51pDFGnnTDyxk() {
    }

    public final Object apply(Object obj) {
        return ((ContactData) ((Resource) obj).getData()).getEmployee();
    }
}
