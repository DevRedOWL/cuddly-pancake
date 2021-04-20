package p035ru.unicorn.ujin.data.service.location;

import java.util.List;
import p035ru.unicorn.ujin.data.realm.Points;
import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.data.service.location.-$$Lambda$LocationRepository$ug2SWWPKPtfRn21_BaWWAmZfeWA  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$LocationRepository$ug2SWWPKPtfRn21_BaWWAmZfeWA implements Function {
    public static final /* synthetic */ $$Lambda$LocationRepository$ug2SWWPKPtfRn21_BaWWAmZfeWA INSTANCE = new $$Lambda$LocationRepository$ug2SWWPKPtfRn21_BaWWAmZfeWA();

    private /* synthetic */ $$Lambda$LocationRepository$ug2SWWPKPtfRn21_BaWWAmZfeWA() {
    }

    public final Object apply(Object obj) {
        return Resource.success(0, "", new Points((List) obj));
    }
}
