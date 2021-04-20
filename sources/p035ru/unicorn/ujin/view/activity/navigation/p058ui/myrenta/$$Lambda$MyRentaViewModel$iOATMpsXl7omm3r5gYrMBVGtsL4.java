package p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta;

import android.util.Log;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.Rent;
import p046io.reactivex.functions.Consumer;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.myrenta.-$$Lambda$MyRentaViewModel$iOATMpsXl7omm3r5gYrMBVGtsL4  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$MyRentaViewModel$iOATMpsXl7omm3r5gYrMBVGtsL4 implements Consumer {
    public static final /* synthetic */ $$Lambda$MyRentaViewModel$iOATMpsXl7omm3r5gYrMBVGtsL4 INSTANCE = new $$Lambda$MyRentaViewModel$iOATMpsXl7omm3r5gYrMBVGtsL4();

    private /* synthetic */ $$Lambda$MyRentaViewModel$iOATMpsXl7omm3r5gYrMBVGtsL4() {
    }

    public final void accept(Object obj) {
        Log.d("TAG", "XXX 1 1 " + ((Resource) obj).getStatus() + " " + ((Rent) ((Resource) obj).getData()).toString());
    }
}
