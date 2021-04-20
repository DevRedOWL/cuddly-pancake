package p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Predicate;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.myrenta.-$$Lambda$MyRentaViewModel$8E5yXj7ZSkZ6ysHSwBbVhebUGCo  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$MyRentaViewModel$8E5yXj7ZSkZ6ysHSwBbVhebUGCo implements Predicate {
    public static final /* synthetic */ $$Lambda$MyRentaViewModel$8E5yXj7ZSkZ6ysHSwBbVhebUGCo INSTANCE = new $$Lambda$MyRentaViewModel$8E5yXj7ZSkZ6ysHSwBbVhebUGCo();

    private /* synthetic */ $$Lambda$MyRentaViewModel$8E5yXj7ZSkZ6ysHSwBbVhebUGCo() {
    }

    public final boolean test(Object obj) {
        return ((Resource) obj).getStatus().equals(Resource.Status.SUCCESS);
    }
}
