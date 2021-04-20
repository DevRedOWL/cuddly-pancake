package p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.myrenta.-$$Lambda$RentaRepository$CNLI0vuP9OwyOwWZ_eDPcie3Qg4  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$RentaRepository$CNLI0vuP9OwyOwWZ_eDPcie3Qg4 implements Function {
    public static final /* synthetic */ $$Lambda$RentaRepository$CNLI0vuP9OwyOwWZ_eDPcie3Qg4 INSTANCE = new $$Lambda$RentaRepository$CNLI0vuP9OwyOwWZ_eDPcie3Qg4();

    private /* synthetic */ $$Lambda$RentaRepository$CNLI0vuP9OwyOwWZ_eDPcie3Qg4() {
    }

    public final Object apply(Object obj) {
        return Resource.success(((Resource) obj).getError(), ((Resource) obj).getMessage(), ((Rents) ((Resource) obj).getData()).getRents());
    }
}
