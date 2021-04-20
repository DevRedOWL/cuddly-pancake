package p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta;

import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.Talking;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.myrenta.-$$Lambda$RentaRepository$K6HplQeOP7_YnMsrCoYBEWOeYno  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$RentaRepository$K6HplQeOP7_YnMsrCoYBEWOeYno implements Function {
    public static final /* synthetic */ $$Lambda$RentaRepository$K6HplQeOP7_YnMsrCoYBEWOeYno INSTANCE = new $$Lambda$RentaRepository$K6HplQeOP7_YnMsrCoYBEWOeYno();

    private /* synthetic */ $$Lambda$RentaRepository$K6HplQeOP7_YnMsrCoYBEWOeYno() {
    }

    public final Object apply(Object obj) {
        return Resource.success(((Resource) obj).getError(), ((Resource) obj).getMessage(), ((Talking) ((Resource) obj).getData()).getData());
    }
}
