package p035ru.unicorn.ujin.view.activity.navigation.repository;

import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.repository.-$$Lambda$RemoteRepository$UUT4aYSnaKfVbpoji9dG3niwDiQ  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$RemoteRepository$UUT4aYSnaKfVbpoji9dG3niwDiQ implements Function {
    public static final /* synthetic */ $$Lambda$RemoteRepository$UUT4aYSnaKfVbpoji9dG3niwDiQ INSTANCE = new $$Lambda$RemoteRepository$UUT4aYSnaKfVbpoji9dG3niwDiQ();

    private /* synthetic */ $$Lambda$RemoteRepository$UUT4aYSnaKfVbpoji9dG3niwDiQ() {
    }

    public final Object apply(Object obj) {
        return Resource.success(((Resource) obj).getError(), ((Resource) obj).getMessage(), ((Resource) obj).getData());
    }
}
