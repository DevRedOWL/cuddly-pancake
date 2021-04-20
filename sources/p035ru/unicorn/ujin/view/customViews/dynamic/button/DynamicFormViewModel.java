package p035ru.unicorn.ujin.view.customViews.dynamic.button;

import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p035ru.unicorn.ujin.data.profile.repository.ProfileLocalRepository;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.data.realm.ResourceV2;
import p035ru.unicorn.ujin.view.activity.navigation.viewmodel.BaseViewModel;
import p035ru.unicorn.ujin.view.activity.navigation.viewmodel.SingleLiveEvent;
import p046io.reactivex.android.schedulers.AndroidSchedulers;
import p046io.reactivex.disposables.Disposable;
import p046io.reactivex.schedulers.Schedulers;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002JJ\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u00152&\u0010\u0016\u001a\"\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017j\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n\u0018\u0001`\u0018R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u000e0\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\f¨\u0006\u0019"}, mo51343d2 = {"Lru/unicorn/ujin/view/customViews/dynamic/button/DynamicFormViewModel;", "Lru/unicorn/ujin/view/activity/navigation/viewmodel/BaseViewModel;", "()V", "remoteRepository", "Lru/unicorn/ujin/view/customViews/dynamic/button/ButtonRemoteRepository;", "getRemoteRepository", "()Lru/unicorn/ujin/view/customViews/dynamic/button/ButtonRemoteRepository;", "sendDynamicRequestV1", "Lru/unicorn/ujin/view/activity/navigation/viewmodel/SingleLiveEvent;", "Lru/unicorn/ujin/data/realm/Resource;", "", "getSendDynamicRequestV1", "()Lru/unicorn/ujin/view/activity/navigation/viewmodel/SingleLiveEvent;", "sendDynamicRequestV2", "Lru/unicorn/ujin/data/realm/ResourceV2;", "getSendDynamicRequestV2", "sendDynamicRequest", "", "url", "", "params", "", "dataFields", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.customViews.dynamic.button.DynamicFormViewModel */
/* compiled from: DynamicFormViewModel.kt */
public final class DynamicFormViewModel extends BaseViewModel {
    private final ButtonRemoteRepository remoteRepository = new ButtonRemoteRepository();
    private final SingleLiveEvent<Resource<Object>> sendDynamicRequestV1 = new SingleLiveEvent<>();
    private final SingleLiveEvent<ResourceV2<Object>> sendDynamicRequestV2 = new SingleLiveEvent<>();

    public final SingleLiveEvent<ResourceV2<Object>> getSendDynamicRequestV2() {
        return this.sendDynamicRequestV2;
    }

    public final SingleLiveEvent<Resource<Object>> getSendDynamicRequestV1() {
        return this.sendDynamicRequestV1;
    }

    public final ButtonRemoteRepository getRemoteRepository() {
        return this.remoteRepository;
    }

    public final void sendDynamicRequest(String str, Map<String, String> map, HashMap<String, Object> hashMap) {
        Intrinsics.checkNotNullParameter(str, "url");
        Intrinsics.checkNotNullParameter(map, "params");
        HashMap hashMap2 = new HashMap();
        for (Map.Entry next : map.entrySet()) {
            if (StringsKt.isBlank((CharSequence) next.getKey())) {
                String str2 = (String) next.getKey();
                if (str2.hashCode() == -523324507 && str2.equals("userdata_id")) {
                    hashMap2.put(next.getKey(), String.valueOf(ProfileLocalRepository.Companion.getInstance().getUser().getId()));
                }
            } else {
                hashMap2.put(next.getKey(), next.getValue());
            }
        }
        if (StringsKt.contains$default((CharSequence) str, (CharSequence) "v2", false, 2, (Object) null)) {
            Disposable subscribe = this.remoteRepository.sendDynamicRequestV2(str, hashMap2, hashMap).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new DynamicFormViewModel$sendDynamicRequest$subscribe$1(this));
            Intrinsics.checkNotNullExpressionValue(subscribe, "remoteRepository\n       …stV2.setValue(resource) }");
            this.compositeDisposable.add(subscribe);
            return;
        }
        Disposable subscribe2 = this.remoteRepository.sendDynamicRequestV1(str, hashMap2, hashMap).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new DynamicFormViewModel$sendDynamicRequest$subscribe$2(this));
        Intrinsics.checkNotNullExpressionValue(subscribe2, "remoteRepository\n       …stV1.setValue(resource) }");
        this.compositeDisposable.add(subscribe2);
    }
}
