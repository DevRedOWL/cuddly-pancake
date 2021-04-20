package p035ru.unicorn.ujin.data.service.location;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.data.service.location.-$$Lambda$LocationRepository$6schXk2GrhGFO_e8cAGhmPdlDDg  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$LocationRepository$6schXk2GrhGFO_e8cAGhmPdlDDg implements Function {
    public static final /* synthetic */ $$Lambda$LocationRepository$6schXk2GrhGFO_e8cAGhmPdlDDg INSTANCE = new $$Lambda$LocationRepository$6schXk2GrhGFO_e8cAGhmPdlDDg();

    private /* synthetic */ $$Lambda$LocationRepository$6schXk2GrhGFO_e8cAGhmPdlDDg() {
    }

    public final Object apply(Object obj) {
        return Resource.error(((Throwable) obj).getMessage());
    }
}
