package p035ru.unicorn.ujin.view.activity.navigation.p058ui.rooms;

import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mainsmart.Room;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.rooms.-$$Lambda$RoomsViewModel$RM3slXg45wwypF30tbjdZOFpSA8  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$RoomsViewModel$RM3slXg45wwypF30tbjdZOFpSA8 implements Function {
    public static final /* synthetic */ $$Lambda$RoomsViewModel$RM3slXg45wwypF30tbjdZOFpSA8 INSTANCE = new $$Lambda$RoomsViewModel$RM3slXg45wwypF30tbjdZOFpSA8();

    private /* synthetic */ $$Lambda$RoomsViewModel$RM3slXg45wwypF30tbjdZOFpSA8() {
    }

    public final Object apply(Object obj) {
        return ((Room) ((Resource) obj).getData()).getList();
    }
}
