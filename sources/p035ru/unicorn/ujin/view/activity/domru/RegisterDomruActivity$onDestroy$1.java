package p035ru.unicorn.ujin.view.activity.domru;

import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import p035ru.unicorn.ujin.view.activity.domru.RegisterDomruActivity;

@Metadata(mo51341bv = {1, 0, 3}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.domru.RegisterDomruActivity$onDestroy$1 */
/* compiled from: RegisterDomruActivity.kt */
final /* synthetic */ class RegisterDomruActivity$onDestroy$1 extends MutablePropertyReference0Impl {
    RegisterDomruActivity$onDestroy$1(RegisterDomruActivity registerDomruActivity) {
        super(registerDomruActivity, RegisterDomruActivity.class, "searchBroadcastReceiver", "getSearchBroadcastReceiver()Lru/unicorn/ujin/view/activity/domru/RegisterDomruActivity$SearchBroadcastReceiver;", 0);
    }

    public Object get() {
        return RegisterDomruActivity.access$getSearchBroadcastReceiver$p((RegisterDomruActivity) this.receiver);
    }

    public void set(Object obj) {
        ((RegisterDomruActivity) this.receiver).searchBroadcastReceiver = (RegisterDomruActivity.SearchBroadcastReceiver) obj;
    }
}
