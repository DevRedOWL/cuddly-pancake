package p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Predicate;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.myrenta.-$$Lambda$MyRentaViewModel$UXSDmvDOJcOrZTNWJ2NB7hCDNyQ  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$MyRentaViewModel$UXSDmvDOJcOrZTNWJ2NB7hCDNyQ implements Predicate {
    public static final /* synthetic */ $$Lambda$MyRentaViewModel$UXSDmvDOJcOrZTNWJ2NB7hCDNyQ INSTANCE = new $$Lambda$MyRentaViewModel$UXSDmvDOJcOrZTNWJ2NB7hCDNyQ();

    private /* synthetic */ $$Lambda$MyRentaViewModel$UXSDmvDOJcOrZTNWJ2NB7hCDNyQ() {
    }

    public final boolean test(Object obj) {
        return ((Resource) obj).getStatus().equals(Resource.Status.SUCCESS);
    }
}
