package p035ru.unicorn.ujin.view.activity.navigation.p058ui.rooms;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Predicate;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.rooms.-$$Lambda$RoomsViewModel$ypUcHJkZhop-vSSrUq8OVdCu3HY  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$RoomsViewModel$ypUcHJkZhopvSSrUq8OVdCu3HY implements Predicate {
    public static final /* synthetic */ $$Lambda$RoomsViewModel$ypUcHJkZhopvSSrUq8OVdCu3HY INSTANCE = new $$Lambda$RoomsViewModel$ypUcHJkZhopvSSrUq8OVdCu3HY();

    private /* synthetic */ $$Lambda$RoomsViewModel$ypUcHJkZhopvSSrUq8OVdCu3HY() {
    }

    public final boolean test(Object obj) {
        return ((Resource) obj).getStatus().equals(Resource.Status.SUCCESS);
    }
}
