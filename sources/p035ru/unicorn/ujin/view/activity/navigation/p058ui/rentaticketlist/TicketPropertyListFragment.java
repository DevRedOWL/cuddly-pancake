package p035ru.unicorn.ujin.view.activity.navigation.p058ui.rentaticketlist;

import android.view.View;
import android.widget.ProgressBar;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.entity.IKeyValueData;
import p035ru.unicorn.ujin.view.activity.navigation.entity.scenario.SomeString;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.base.ViewmodelFactorys;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.EmptySection;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.HelpDeskViewModel;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.BaseSectionFragment;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.MyRentaViewModel;
import p035ru.unicorn.ujin.view.activity.navigation.viewmodel.SingleLiveEvent;
import p046io.reactivex.Flowable;
import p046io.reactivex.functions.Consumer;
import p046io.reactivex.processors.PublishProcessor;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH\u0014J\n\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u000b\u001a\u00020\fH\u0014J\b\u0010\r\u001a\u00020\tH\u0014J\u0010\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0012\u0010\u0011\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002H\u0014J\u0016\u0010\u0013\u001a\u00020\f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u0015H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/rentaticketlist/TicketPropertyListFragment;", "Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/BaseSectionFragment;", "Lru/unicorn/ujin/view/activity/navigation/ui/myrenta/MyRentaViewModel;", "()V", "emptySection", "Lru/unicorn/ujin/view/activity/navigation/ui/helpdesk/EmptySection;", "propertyObjectsSection", "Lru/unicorn/ujin/view/activity/navigation/ui/rentaticketlist/SelectSection;", "getMyToolbarTitle", "", "getViewModell", "initSections", "", "metricsScreenName", "onObjectClick", "data", "Lru/unicorn/ujin/view/activity/navigation/entity/IKeyValueData;", "onViewCreated", "viewModell", "showPropertyObjects", "propertyObjects", "Ljava/util/ArrayList;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.rentaticketlist.TicketPropertyListFragment */
/* compiled from: TicketPropertyListFragment.kt */
public final class TicketPropertyListFragment extends BaseSectionFragment<MyRentaViewModel> {
    private HashMap _$_findViewCache;
    private EmptySection emptySection;
    private SelectSection propertyObjectsSection;

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

    /* access modifiers changed from: protected */
    public String getMyToolbarTitle() {
        return "Выбор помещения";
    }

    /* access modifiers changed from: protected */
    public String metricsScreenName() {
        return "Экран списка помещений для сервисной заявки";
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    /* access modifiers changed from: protected */
    public void initSections() {
        PublishProcessor<IKeyValueData> specialClicks;
        Flowable<IKeyValueData> distinct;
        if (this.propertyObjectsSection == null) {
            this.propertyObjectsSection = new SelectSection();
            SelectSection selectSection = this.propertyObjectsSection;
            if (selectSection != null) {
                selectSection.setArrowVisibility(false);
            }
            SelectSection selectSection2 = this.propertyObjectsSection;
            if (!(selectSection2 == null || (specialClicks = selectSection2.specialClicks()) == null || (distinct = specialClicks.distinct()) == null)) {
                distinct.subscribe((Consumer<? super IKeyValueData>) new TicketPropertyListFragment$initSections$1(this));
            }
        }
        if (this.emptySection == null) {
            this.emptySection = new EmptySection(false, 14);
            EmptySection emptySection2 = this.emptySection;
            if (emptySection2 != null) {
                emptySection2.setData(new SomeString(getString(R.string.no_property_objects)));
            }
            EmptySection emptySection3 = this.emptySection;
            if (emptySection3 != null) {
                emptySection3.show(false);
            }
        }
        this.sectionedAdapter.addSection(this.emptySection);
        this.sectionedAdapter.addSection(this.propertyObjectsSection);
    }

    /* access modifiers changed from: protected */
    public void onViewCreated(MyRentaViewModel myRentaViewModel) {
        MutableLiveData<ArrayList<IKeyValueData>> ticketPropertyObjectMutableLiveData;
        ProgressBar progressBar = this.f6913pb;
        Intrinsics.checkNotNullExpressionValue(progressBar, "pb");
        progressBar.setVisibility(0);
        if (!(myRentaViewModel == null || (ticketPropertyObjectMutableLiveData = myRentaViewModel.getTicketPropertyObjectMutableLiveData()) == null)) {
            ticketPropertyObjectMutableLiveData.observe(getViewLifecycleOwner(), new TicketPropertyListFragment$onViewCreated$1(this));
        }
        if (myRentaViewModel != null) {
            myRentaViewModel.getAvailableProperties();
        }
    }

    /* access modifiers changed from: private */
    public final void showPropertyObjects(ArrayList<IKeyValueData> arrayList) {
        ProgressBar progressBar = this.f6913pb;
        Intrinsics.checkNotNullExpressionValue(progressBar, "pb");
        progressBar.setVisibility(8);
        Collection collection = arrayList;
        if (collection == null || collection.isEmpty()) {
            SelectSection selectSection = this.propertyObjectsSection;
            if (selectSection != null) {
                selectSection.setData(new ArrayList());
            }
            EmptySection emptySection2 = this.emptySection;
            if (emptySection2 != null) {
                emptySection2.show(true);
                return;
            }
            return;
        }
        EmptySection emptySection3 = this.emptySection;
        if (emptySection3 != null) {
            emptySection3.show(false);
        }
        SelectSection selectSection2 = this.propertyObjectsSection;
        if (selectSection2 != null) {
            selectSection2.setData(arrayList);
        }
    }

    /* access modifiers changed from: private */
    public final void onObjectClick(IKeyValueData iKeyValueData) {
        ViewModel viewModel = ViewModelProviders.m11of((Fragment) this, (ViewModelProvider.Factory) ViewmodelFactorys.getInstance()).get(HelpDeskViewModel.class);
        Intrinsics.checkNotNullExpressionValue(viewModel, "ViewModelProviders.of(th…eskViewModel::class.java]");
        SingleLiveEvent<IKeyValueData> currentTicketProperty = ((HelpDeskViewModel) viewModel).getCurrentTicketProperty();
        Intrinsics.checkNotNullExpressionValue(currentTicketProperty, "helpDeskViewModel.currentTicketProperty");
        currentTicketProperty.setValue(iKeyValueData);
        backFragment();
    }

    public MyRentaViewModel getViewModell() {
        return (MyRentaViewModel) ViewModelProviders.m11of((Fragment) this, (ViewModelProvider.Factory) ViewmodelFactorys.getInstance()).get(MyRentaViewModel.class);
    }
}
