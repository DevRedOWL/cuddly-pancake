package p035ru.unicorn.ujin.view.activity.navigation.p058ui.alertpoints;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.alertpoints.-$$Lambda$GatesViewModel$KvrOI5JURGJ2CKWDuHAamfCy_1Y  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$GatesViewModel$KvrOI5JURGJ2CKWDuHAamfCy_1Y implements Function {
    public static final /* synthetic */ $$Lambda$GatesViewModel$KvrOI5JURGJ2CKWDuHAamfCy_1Y INSTANCE = new $$Lambda$GatesViewModel$KvrOI5JURGJ2CKWDuHAamfCy_1Y();

    private /* synthetic */ $$Lambda$GatesViewModel$KvrOI5JURGJ2CKWDuHAamfCy_1Y() {
    }

    public final Object apply(Object obj) {
        return Resource.success(((Resource) obj).getError(), ((Resource) obj).getMessage(), ((Resource) obj).getData());
    }
}
