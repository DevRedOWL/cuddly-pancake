package p035ru.unicorn.ujin.view.activity.navigation.p058ui.rooms;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Predicate;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.rooms.-$$Lambda$RoomsViewModel$5TchGJiSwJ3nPN2zIYmWatI53aY  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$RoomsViewModel$5TchGJiSwJ3nPN2zIYmWatI53aY implements Predicate {
    public static final /* synthetic */ $$Lambda$RoomsViewModel$5TchGJiSwJ3nPN2zIYmWatI53aY INSTANCE = new $$Lambda$RoomsViewModel$5TchGJiSwJ3nPN2zIYmWatI53aY();

    private /* synthetic */ $$Lambda$RoomsViewModel$5TchGJiSwJ3nPN2zIYmWatI53aY() {
    }

    public final boolean test(Object obj) {
        return ((Resource) obj).getStatus().equals(Resource.Status.SUCCESS);
    }
}
