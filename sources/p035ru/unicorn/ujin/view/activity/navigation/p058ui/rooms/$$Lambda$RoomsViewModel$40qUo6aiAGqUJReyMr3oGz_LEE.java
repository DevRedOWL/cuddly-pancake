package p035ru.unicorn.ujin.view.activity.navigation.p058ui.rooms;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Predicate;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.rooms.-$$Lambda$RoomsViewModel$40-qUo6aiAGqUJReyMr3oGz_LEE  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$RoomsViewModel$40qUo6aiAGqUJReyMr3oGz_LEE implements Predicate {
    public static final /* synthetic */ $$Lambda$RoomsViewModel$40qUo6aiAGqUJReyMr3oGz_LEE INSTANCE = new $$Lambda$RoomsViewModel$40qUo6aiAGqUJReyMr3oGz_LEE();

    private /* synthetic */ $$Lambda$RoomsViewModel$40qUo6aiAGqUJReyMr3oGz_LEE() {
    }

    public final boolean test(Object obj) {
        return ((Resource) obj).getStatus().equals(Resource.Status.SUCCESS);
    }
}
