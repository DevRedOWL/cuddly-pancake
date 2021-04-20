package p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Predicate;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.myrenta.-$$Lambda$MyRentaViewModel$yNuTF1OtagC4CsmNJYaoZp9luYw  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$MyRentaViewModel$yNuTF1OtagC4CsmNJYaoZp9luYw implements Predicate {
    public static final /* synthetic */ $$Lambda$MyRentaViewModel$yNuTF1OtagC4CsmNJYaoZp9luYw INSTANCE = new $$Lambda$MyRentaViewModel$yNuTF1OtagC4CsmNJYaoZp9luYw();

    private /* synthetic */ $$Lambda$MyRentaViewModel$yNuTF1OtagC4CsmNJYaoZp9luYw() {
    }

    public final boolean test(Object obj) {
        return ((Resource) obj).getStatus().equals(Resource.Status.SUCCESS);
    }
}
