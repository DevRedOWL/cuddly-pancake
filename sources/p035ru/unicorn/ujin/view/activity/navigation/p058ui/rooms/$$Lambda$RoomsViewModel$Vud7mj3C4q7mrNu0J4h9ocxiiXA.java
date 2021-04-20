package p035ru.unicorn.ujin.view.activity.navigation.p058ui.rooms;

import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mainsmart.Room;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.rooms.-$$Lambda$RoomsViewModel$Vud7mj3C4q7mrNu0J4h9ocxiiXA  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$RoomsViewModel$Vud7mj3C4q7mrNu0J4h9ocxiiXA implements Function {
    public static final /* synthetic */ $$Lambda$RoomsViewModel$Vud7mj3C4q7mrNu0J4h9ocxiiXA INSTANCE = new $$Lambda$RoomsViewModel$Vud7mj3C4q7mrNu0J4h9ocxiiXA();

    private /* synthetic */ $$Lambda$RoomsViewModel$Vud7mj3C4q7mrNu0J4h9ocxiiXA() {
    }

    public final Object apply(Object obj) {
        return ((Room) ((Resource) obj).getData()).getList();
    }
}
