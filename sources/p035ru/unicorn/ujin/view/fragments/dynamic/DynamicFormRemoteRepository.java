package p035ru.unicorn.ujin.view.fragments.dynamic;

import kotlin.Metadata;
import p035ru.unicorn.ujin.data.repository.BaseRemoteRepository;
import p035ru.unicorn.ujin.viewModel.events.RegisterGhostEvent;
import p046io.reactivex.android.schedulers.AndroidSchedulers;
import p046io.reactivex.schedulers.Schedulers;
import p046io.reactivex.subjects.PublishSubject;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR5\u0010\u0003\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR5\u0010\t\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\n0\n \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\n0\n\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\b¨\u0006\u0010"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/dynamic/DynamicFormRemoteRepository;", "Lru/unicorn/ujin/data/repository/BaseRemoteRepository;", "()V", "ghostRegisterSubject", "Lio/reactivex/subjects/PublishSubject;", "Lru/unicorn/ujin/viewModel/events/RegisterGhostEvent;", "kotlin.jvm.PlatformType", "getGhostRegisterSubject", "()Lio/reactivex/subjects/PublishSubject;", "layoutSubject", "Lru/unicorn/ujin/view/fragments/dynamic/DynamicFormEvent;", "getLayoutSubject", "getLayout", "", "id", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.dynamic.DynamicFormRemoteRepository */
/* compiled from: DynamicFormRemoteRepository.kt */
public final class DynamicFormRemoteRepository extends BaseRemoteRepository {
    private final PublishSubject<RegisterGhostEvent> ghostRegisterSubject = PublishSubject.create();
    private final PublishSubject<DynamicFormEvent> layoutSubject = PublishSubject.create();

    public final PublishSubject<DynamicFormEvent> getLayoutSubject() {
        return this.layoutSubject;
    }

    public final PublishSubject<RegisterGhostEvent> getGhostRegisterSubject() {
        return this.ghostRegisterSubject;
    }

    public final void getLayout(int i) {
        getApi().getLayout(getToken(), i).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new DynamicFormRemoteRepository$getLayout$1(this), new DynamicFormRemoteRepository$getLayout$2(this));
    }
}
