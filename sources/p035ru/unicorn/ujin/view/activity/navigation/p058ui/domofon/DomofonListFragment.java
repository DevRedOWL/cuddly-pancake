package p035ru.unicorn.ujin.view.activity.navigation.p058ui.domofon;

import android.content.Context;
import android.view.View;
import android.widget.ProgressBar;
import androidx.lifecycle.MutableLiveData;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.data.realm.Intercom;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.activity.navigation.helper.DialogHelper;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.BaseSectionFragment;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.navigation.SimpleViewModel;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0014J\b\u0010\f\u001a\u00020\rH\u0014J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u001a\u0010\u0011\u001a\u00020\r2\u0010\u0010\u0012\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u0013H\u0002J\u0012\u0010\u0015\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002H\u0014J\u0016\u0010\u0017\u001a\u00020\r2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00180\u0013H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0019"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/domofon/DomofonListFragment;", "Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/BaseSectionFragment;", "Lru/unicorn/ujin/view/activity/navigation/ui/navigation/SimpleViewModel;", "()V", "domofonListSection", "Lru/unicorn/ujin/view/activity/navigation/ui/domofon/DomofonListSection;", "getDomofonListSection", "()Lru/unicorn/ujin/view/activity/navigation/ui/domofon/DomofonListSection;", "domofonListSection$delegate", "Lkotlin/Lazy;", "getMyToolbarTitle", "", "initSections", "", "onItemClick", "data", "Lru/unicorn/ujin/data/realm/IntercomVal;", "onOpenDoorHandler", "resource", "Lru/unicorn/ujin/data/realm/Resource;", "Ljava/lang/Void;", "onViewCreated", "vm", "showVideo", "Lru/unicorn/ujin/data/realm/Intercom;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.domofon.DomofonListFragment */
/* compiled from: DomofonListFragment.kt */
public final class DomofonListFragment extends BaseSectionFragment<SimpleViewModel> {
    private HashMap _$_findViewCache;
    private final Lazy domofonListSection$delegate = LazyKt.lazy(DomofonListFragment$domofonListSection$2.INSTANCE);

    @Metadata(mo51341bv = {1, 0, 3}, mo51344k = 3, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.domofon.DomofonListFragment$WhenMappings */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[Resource.Status.values().length];
        public static final /* synthetic */ int[] $EnumSwitchMapping$1 = new int[Resource.Status.values().length];

        static {
            $EnumSwitchMapping$0[Resource.Status.LOADING.ordinal()] = 1;
            $EnumSwitchMapping$0[Resource.Status.SUCCESS.ordinal()] = 2;
            $EnumSwitchMapping$0[Resource.Status.ERROR.ordinal()] = 3;
            $EnumSwitchMapping$1[Resource.Status.LOADING.ordinal()] = 1;
            $EnumSwitchMapping$1[Resource.Status.SUCCESS.ordinal()] = 2;
            $EnumSwitchMapping$1[Resource.Status.ERROR.ordinal()] = 3;
        }
    }

    private final DomofonListSection getDomofonListSection() {
        return (DomofonListSection) this.domofonListSection$delegate.getValue();
    }

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    /* access modifiers changed from: protected */
    public void initSections() {
        if (!this.sectionedAdapter.contains(getDomofonListSection()).booleanValue()) {
            this.sectionedAdapter.addSection(getDomofonListSection());
            this.disposable.add(getDomofonListSection().getSpecialClick().subscribe(new DomofonListFragment$initSections$1(this)));
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x007f, code lost:
        if ((r3 == null || kotlin.text.StringsKt.isBlank(r3)) == false) goto L_0x0083;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onItemClick(p035ru.unicorn.ujin.data.realm.IntercomVal r11) {
        /*
            r10 = this;
            boolean r0 = r11.isOpenDoor()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x005a
            java.lang.String r11 = r11.getOpenUrl()
            java.lang.String r0 = "data.openUrl"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r0)
            r3 = r11
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            java.lang.String r11 = "api/"
            java.lang.String[] r4 = new java.lang.String[]{r11}
            r5 = 0
            r6 = 0
            r7 = 6
            r8 = 0
            java.util.List r11 = kotlin.text.StringsKt.split$default((java.lang.CharSequence) r3, (java.lang.String[]) r4, (boolean) r5, (int) r6, (int) r7, (java.lang.Object) r8)
            java.util.Collection r11 = (java.util.Collection) r11
            java.lang.String[] r0 = new java.lang.String[r1]
            java.lang.Object[] r11 = r11.toArray(r0)
            if (r11 == 0) goto L_0x0052
            java.lang.String[] r11 = (java.lang.String[]) r11
            r11 = r11[r2]
            ru.unicorn.ujin.view.activity.navigation.viewmodel.BaseViewModel r0 = r10.viewModell
            ru.unicorn.ujin.view.activity.navigation.ui.navigation.SimpleViewModel r0 = (p035ru.unicorn.ujin.view.activity.navigation.p058ui.navigation.SimpleViewModel) r0
            r0.sendDynamicRequest(r11)
            ru.unicorn.ujin.view.activity.navigation.viewmodel.BaseViewModel r11 = r10.viewModell
            java.lang.String r0 = "viewModell"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r0)
            ru.unicorn.ujin.view.activity.navigation.ui.navigation.SimpleViewModel r11 = (p035ru.unicorn.ujin.view.activity.navigation.p058ui.navigation.SimpleViewModel) r11
            ru.unicorn.ujin.view.activity.navigation.viewmodel.SingleLiveEvent r11 = r11.getSendDynamiceRequest()
            r0 = r10
            androidx.lifecycle.LifecycleOwner r0 = (androidx.lifecycle.LifecycleOwner) r0
            ru.unicorn.ujin.view.activity.navigation.ui.domofon.DomofonListFragment$onItemClick$1 r1 = new ru.unicorn.ujin.view.activity.navigation.ui.domofon.DomofonListFragment$onItemClick$1
            r1.<init>(r10)
            androidx.lifecycle.Observer r1 = (androidx.lifecycle.Observer) r1
            r11.observe(r0, r1)
            goto L_0x00a7
        L_0x0052:
            java.lang.NullPointerException r11 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Array<T>"
            r11.<init>(r0)
            throw r11
        L_0x005a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            java.lang.Boolean r3 = r11.getArchiveAvailable()
            java.lang.String r4 = "data.archiveAvailable"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x0082
            java.lang.String r3 = r11.getIdCamera()
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            if (r3 == 0) goto L_0x007e
            boolean r3 = kotlin.text.StringsKt.isBlank(r3)
            if (r3 == 0) goto L_0x007c
            goto L_0x007e
        L_0x007c:
            r3 = 0
            goto L_0x007f
        L_0x007e:
            r3 = 1
        L_0x007f:
            if (r3 != 0) goto L_0x0082
            goto L_0x0083
        L_0x0082:
            r2 = 0
        L_0x0083:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r2)
            java.lang.String r4 = r11.getName()
            java.lang.String r5 = r11.getIdCamera()
            java.lang.String r6 = r11.getOpenUrl()
            java.lang.String r7 = r11.getMjpegNew()
            boolean r8 = r11.isButtonNeedHide()
            java.lang.String r9 = ""
            r2 = r0
            ru.unicorn.ujin.view.activity.navigation.ui.video.VideoFragment r11 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.video.VideoFragment.start(r2, r3, r4, r5, r6, r7, r8, r9)
            androidx.fragment.app.Fragment r11 = (androidx.fragment.app.Fragment) r11
            r10.nextFragment(r11, r1)
        L_0x00a7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.activity.navigation.p058ui.domofon.DomofonListFragment.onItemClick(ru.unicorn.ujin.data.realm.IntercomVal):void");
    }

    /* access modifiers changed from: private */
    public final void onOpenDoorHandler(Resource<Void> resource) {
        Resource.Status status = resource != null ? resource.getStatus() : null;
        if (status != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
            if (i == 1) {
                ProgressBar progressBar = this.f6913pb;
                Intrinsics.checkNotNullExpressionValue(progressBar, "pb");
                progressBar.setVisibility(0);
            } else if (i == 2) {
                ProgressBar progressBar2 = this.f6913pb;
                Intrinsics.checkNotNullExpressionValue(progressBar2, "pb");
                progressBar2.setVisibility(8);
            } else if (i == 3) {
                ProgressBar progressBar3 = this.f6913pb;
                Intrinsics.checkNotNullExpressionValue(progressBar3, "pb");
                progressBar3.setVisibility(8);
                DialogHelper.showDialog((Context) getActivity(), resource.getMessage());
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onViewCreated(SimpleViewModel simpleViewModel) {
        MutableLiveData<Resource<Intercom>> intercomSingleLiveEvent;
        if (simpleViewModel != null) {
            simpleViewModel.getDomofonVideo();
        }
        if (simpleViewModel != null && (intercomSingleLiveEvent = simpleViewModel.getIntercomSingleLiveEvent()) != null) {
            intercomSingleLiveEvent.observe(getViewLifecycleOwner(), new DomofonListFragment$onViewCreated$1(this));
        }
    }

    /* access modifiers changed from: private */
    public final void showVideo(Resource<Intercom> resource) {
        Resource.Status status = resource.getStatus();
        if (status != null) {
            int i = WhenMappings.$EnumSwitchMapping$1[status.ordinal()];
            if (i == 1) {
                ProgressBar progressBar = this.f6913pb;
                if (progressBar != null) {
                    progressBar.setVisibility(0);
                }
            } else if (i == 2) {
                ProgressBar progressBar2 = this.f6913pb;
                if (progressBar2 != null) {
                    progressBar2.setVisibility(4);
                }
                DomofonListSection domofonListSection = getDomofonListSection();
                Intercom data = resource.getData();
                Intrinsics.checkNotNullExpressionValue(data, "resource.data");
                domofonListSection.setData(data.getIntercom());
            } else if (i == 3) {
                showMessage((int) R.string.internalError);
            }
        }
    }

    /* access modifiers changed from: protected */
    public String getMyToolbarTitle() {
        String string = getString(R.string.label_domofon_list);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.label_domofon_list)");
        return string;
    }
}
