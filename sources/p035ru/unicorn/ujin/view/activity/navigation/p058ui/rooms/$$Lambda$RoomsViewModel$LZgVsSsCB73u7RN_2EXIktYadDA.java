package p035ru.unicorn.ujin.view.activity.navigation.p058ui.rooms;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Predicate;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.rooms.-$$Lambda$RoomsViewModel$LZgVsSsCB73u7RN_2EXIktYadDA  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$RoomsViewModel$LZgVsSsCB73u7RN_2EXIktYadDA implements Predicate {
    public static final /* synthetic */ $$Lambda$RoomsViewModel$LZgVsSsCB73u7RN_2EXIktYadDA INSTANCE = new $$Lambda$RoomsViewModel$LZgVsSsCB73u7RN_2EXIktYadDA();

    private /* synthetic */ $$Lambda$RoomsViewModel$LZgVsSsCB73u7RN_2EXIktYadDA() {
    }

    public final boolean test(Object obj) {
        return ((Resource) obj).getStatus().equals(Resource.Status.SUCCESS);
    }
}
