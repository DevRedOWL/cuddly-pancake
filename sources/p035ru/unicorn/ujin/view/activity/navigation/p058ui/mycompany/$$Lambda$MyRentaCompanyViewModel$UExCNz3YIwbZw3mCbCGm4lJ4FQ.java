package p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Predicate;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.mycompany.-$$Lambda$MyRentaCompanyViewModel$UE-xCNz3YIwbZw3mCbCGm4lJ4FQ  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$MyRentaCompanyViewModel$UExCNz3YIwbZw3mCbCGm4lJ4FQ implements Predicate {
    public static final /* synthetic */ $$Lambda$MyRentaCompanyViewModel$UExCNz3YIwbZw3mCbCGm4lJ4FQ INSTANCE = new $$Lambda$MyRentaCompanyViewModel$UExCNz3YIwbZw3mCbCGm4lJ4FQ();

    private /* synthetic */ $$Lambda$MyRentaCompanyViewModel$UExCNz3YIwbZw3mCbCGm4lJ4FQ() {
    }

    public final boolean test(Object obj) {
        return ((Resource) obj).getStatus().equals(Resource.Status.SUCCESS);
    }
}
