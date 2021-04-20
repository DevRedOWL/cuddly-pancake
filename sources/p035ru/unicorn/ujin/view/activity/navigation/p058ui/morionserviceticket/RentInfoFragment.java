package p035ru.unicorn.ujin.view.activity.navigation.p058ui.morionserviceticket;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.afollestad.materialdialogs.DialogBehavior;
import com.afollestad.materialdialogs.MaterialDialog;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.SectionedAdapter;
import p035ru.unicorn.ujin.view.activity.navigation.entity.scenario.SomeString;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.base.ViewmodelFactorys;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.HelpDeskViewModel;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.ServiceTicket;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.MyRentaSection;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.MyRentaViewModel;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.PropertyRenta;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentInfo;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentInfoObject;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.StateRenta;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.Rent;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.TalkingInfo;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.rentaticketlist.RentAttributes;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.rooms.TitleSection;
import p035ru.unicorn.ujin.view.customViews.CenteredImageSpan;
import p035ru.unicorn.ujin.view.fragments.BaseFragment;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;
import p046io.realm.RealmList;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 52\u00020\u0001:\u00015B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0018\u001a\u00020\u00192\u0010\u0010\u001a\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0018\u00010\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u0019H\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0014J&\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\u001a\u0010'\u001a\u00020\u00192\u0006\u0010(\u001a\u00020 2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\u0016\u0010)\u001a\u00020\u00192\f\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\u0012H\u0002J\u0010\u0010,\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020-H\u0002J\u0016\u0010.\u001a\u00020\u00192\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002J\b\u0010/\u001a\u00020\u0019H\u0002J\u0016\u00100\u001a\u00020\u00192\f\u00101\u001a\b\u0012\u0004\u0012\u00020302H\u0002J\b\u00104\u001a\u00020\u0019H\u0014R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000¨\u00066"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/morionserviceticket/RentInfoFragment;", "Lru/unicorn/ujin/view/fragments/BaseFragment;", "()V", "adapter", "Lru/unicorn/ujin/view/activity/navigation/adapter/sectionedadapter/SectionedAdapter;", "getAdapter", "()Lru/unicorn/ujin/view/activity/navigation/adapter/sectionedadapter/SectionedAdapter;", "setAdapter", "(Lru/unicorn/ujin/view/activity/navigation/adapter/sectionedadapter/SectionedAdapter;)V", "desireAttributeSection", "Lru/unicorn/ujin/view/activity/navigation/ui/morionserviceticket/DesireAttributeSection;", "helpdeskViewModel", "Lru/unicorn/ujin/view/activity/navigation/ui/helpdesk/HelpDeskViewModel;", "myRentaSection", "Lru/unicorn/ujin/view/activity/navigation/ui/myrenta/MyRentaSection;", "objectId", "", "rentList", "", "Lru/unicorn/ujin/view/activity/navigation/ui/myrenta/RentInfo;", "rentaViewModel", "Lru/unicorn/ujin/view/activity/navigation/ui/myrenta/MyRentaViewModel;", "titleSection", "Lru/unicorn/ujin/view/activity/navigation/ui/rooms/TitleSection;", "handleMyRentInfo", "", "data", "", "initAdapter", "metricsScreenName", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "showDesireAttribute", "desiredAttributes", "Lru/unicorn/ujin/view/activity/navigation/ui/rentaticketlist/RentAttributes;", "showRentInfo", "Lru/unicorn/ujin/view/activity/navigation/ui/myrentatype/talkingroom/Rent;", "showRentList", "showRentTitle", "showServiceTicket", "resource", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/view/activity/navigation/ui/helpdesk/ServiceTicket;", "showToolbar", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.morionserviceticket.RentInfoFragment */
/* compiled from: RentInfoFragment.kt */
public final class RentInfoFragment extends BaseFragment {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private HashMap _$_findViewCache;
    private SectionedAdapter adapter = new SectionedAdapter();
    private final DesireAttributeSection desireAttributeSection = new DesireAttributeSection();
    private HelpDeskViewModel helpdeskViewModel;
    private final MyRentaSection myRentaSection = new MyRentaSection();
    /* access modifiers changed from: private */
    public int objectId;
    private List<RentInfo> rentList = new ArrayList();
    private MyRentaViewModel rentaViewModel;
    private final TitleSection titleSection = new TitleSection(true, 16);

    @Metadata(mo51341bv = {1, 0, 3}, mo51344k = 3, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.morionserviceticket.RentInfoFragment$WhenMappings */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[Resource.Status.values().length];

        static {
            $EnumSwitchMapping$0[Resource.Status.SUCCESS.ordinal()] = 1;
            $EnumSwitchMapping$0[Resource.Status.ERROR.ordinal()] = 2;
            $EnumSwitchMapping$0[Resource.Status.LOADING.ordinal()] = 3;
        }
    }

    @JvmStatic
    public static final RentInfoFragment newInstance(int i) {
        return Companion.newInstance(i);
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

    /* access modifiers changed from: protected */
    public String metricsScreenName() {
        return "Информация об арендуемом помещении";
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public final SectionedAdapter getAdapter() {
        return this.adapter;
    }

    public final void setAdapter(SectionedAdapter sectionedAdapter) {
        Intrinsics.checkNotNullParameter(sectionedAdapter, "<set-?>");
        this.adapter = sectionedAdapter;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_rent_info, viewGroup, false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        Fragment fragment = this;
        ViewModel viewModel = ViewModelProviders.m11of(fragment, (ViewModelProvider.Factory) ViewmodelFactorys.getInstance()).get(MyRentaViewModel.class);
        Intrinsics.checkNotNullExpressionValue(viewModel, "ViewModelProviders.of(th…ntaViewModel::class.java]");
        this.rentaViewModel = (MyRentaViewModel) viewModel;
        ViewModel viewModel2 = ViewModelProviders.m11of(fragment, (ViewModelProvider.Factory) ViewmodelFactorys.getInstance()).get(HelpDeskViewModel.class);
        Intrinsics.checkNotNullExpressionValue(viewModel2, "ViewModelProviders.of(th…eskViewModel::class.java]");
        this.helpdeskViewModel = (HelpDeskViewModel) viewModel2;
        ScrollView scrollView = (ScrollView) _$_findCachedViewById(C5619R.C5622id.rentInfoLayout);
        Intrinsics.checkNotNullExpressionValue(scrollView, "rentInfoLayout");
        scrollView.setVisibility(8);
        ProgressBar progressBar = (ProgressBar) _$_findCachedViewById(C5619R.C5622id.progressBar);
        Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
        progressBar.setVisibility(0);
        MyRentaViewModel myRentaViewModel = this.rentaViewModel;
        if (myRentaViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rentaViewModel");
        }
        myRentaViewModel.getMyRentaUniqe();
        MyRentaViewModel myRentaViewModel2 = this.rentaViewModel;
        if (myRentaViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rentaViewModel");
        }
        myRentaViewModel2.getMyRentLiveData().observe(getViewLifecycleOwner(), new RentInfoFragment$onViewCreated$1(this));
        initAdapter();
    }

    /* access modifiers changed from: private */
    public final void handleMyRentInfo(List<? extends RentInfo> list) {
        PropertyRenta propRenta;
        Collection collection = list;
        if (!(collection == null || collection.isEmpty())) {
            Collection arrayList = new ArrayList();
            for (Object next : list) {
                RentInfo rentInfo = (RentInfo) next;
                Integer id = (rentInfo == null || (propRenta = rentInfo.getPropRenta()) == null) ? null : propRenta.getId();
                if (id != null && id.intValue() == this.objectId) {
                    arrayList.add(next);
                }
            }
            this.rentList = CollectionsKt.toMutableList(CollectionsKt.filterNotNull((List) arrayList));
        }
        if (!this.rentList.isEmpty()) {
            MyRentaViewModel myRentaViewModel = this.rentaViewModel;
            if (myRentaViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rentaViewModel");
            }
            myRentaViewModel.getRentById(this.rentList.get(0).getId());
            MyRentaViewModel myRentaViewModel2 = this.rentaViewModel;
            if (myRentaViewModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rentaViewModel");
            }
            myRentaViewModel2.getRentInfoLiveData().observe(getViewLifecycleOwner(), new RentInfoFragment$handleMyRentInfo$2(this));
            return;
        }
        HelpDeskViewModel helpDeskViewModel = this.helpdeskViewModel;
        if (helpDeskViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("helpdeskViewModel");
        }
        helpDeskViewModel.getTicketMutableLiveData().observe(getViewLifecycleOwner(), new RentInfoFragment$handleMyRentInfo$3(this));
    }

    /* access modifiers changed from: private */
    public final void showRentInfo(Rent rent) {
        ProgressBar progressBar = (ProgressBar) _$_findCachedViewById(C5619R.C5622id.progressBar);
        Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
        progressBar.setVisibility(8);
        ScrollView scrollView = (ScrollView) _$_findCachedViewById(C5619R.C5622id.rentInfoLayout);
        Intrinsics.checkNotNullExpressionValue(scrollView, "rentInfoLayout");
        scrollView.setVisibility(0);
        TextView textView = (TextView) _$_findCachedViewById(C5619R.C5622id.tvObjectTitle);
        Intrinsics.checkNotNullExpressionValue(textView, "tvObjectTitle");
        textView.setVisibility(0);
        StringBuilder sb = new StringBuilder();
        TalkingInfo talkingInfo = rent.getTalkingInfo();
        Intrinsics.checkNotNullExpressionValue(talkingInfo, "data.talkingInfo");
        sb.append(talkingInfo.getTitle());
        sb.append("   ");
        TalkingInfo talkingInfo2 = rent.getTalkingInfo();
        Intrinsics.checkNotNullExpressionValue(talkingInfo2, "data.talkingInfo");
        StateRenta stateRenta = talkingInfo2.getStateRenta();
        Intrinsics.checkNotNullExpressionValue(stateRenta, "data.talkingInfo.stateRenta");
        sb.append(stateRenta.getDisplayName());
        CharSequence sb2 = sb.toString();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb2);
        Drawable drawable = ContextCompat.getDrawable(getBaseActivity(), R.drawable.ic_svg_dot);
        if (drawable != null) {
            drawable.setBounds(0, 0, (int) (((double) drawable.getIntrinsicWidth()) * 0.6d), (int) (((double) drawable.getIntrinsicHeight()) * 0.6d));
        }
        CenteredImageSpan centeredImageSpan = new CenteredImageSpan(drawable);
        TalkingInfo talkingInfo3 = rent.getTalkingInfo();
        Intrinsics.checkNotNullExpressionValue(talkingInfo3, "data.talkingInfo");
        String title = talkingInfo3.getTitle();
        Intrinsics.checkNotNullExpressionValue(title, "data.talkingInfo.title");
        int indexOf$default = StringsKt.indexOf$default(sb2, title, 0, false, 6, (Object) null);
        TalkingInfo talkingInfo4 = rent.getTalkingInfo();
        Intrinsics.checkNotNullExpressionValue(talkingInfo4, "data.talkingInfo");
        int length = indexOf$default + talkingInfo4.getTitle().length() + 1;
        TalkingInfo talkingInfo5 = rent.getTalkingInfo();
        Intrinsics.checkNotNullExpressionValue(talkingInfo5, "data.talkingInfo");
        String title2 = talkingInfo5.getTitle();
        Intrinsics.checkNotNullExpressionValue(title2, "data.talkingInfo.title");
        int indexOf$default2 = StringsKt.indexOf$default(sb2, title2, 0, false, 6, (Object) null);
        TalkingInfo talkingInfo6 = rent.getTalkingInfo();
        Intrinsics.checkNotNullExpressionValue(talkingInfo6, "data.talkingInfo");
        spannableStringBuilder.setSpan(centeredImageSpan, length, indexOf$default2 + talkingInfo6.getTitle().length() + 2, 33);
        TextView textView2 = (TextView) _$_findCachedViewById(C5619R.C5622id.tvObjectTitle);
        Intrinsics.checkNotNullExpressionValue(textView2, "tvObjectTitle");
        textView2.setText(spannableStringBuilder);
        TalkingInfo talkingInfo7 = rent.getTalkingInfo();
        Intrinsics.checkNotNullExpressionValue(talkingInfo7, "data.talkingInfo");
        Collection rentAttributes = talkingInfo7.getRentAttributes();
        if (rentAttributes == null || rentAttributes.isEmpty()) {
            RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C5619R.C5622id.f6518rv);
            Intrinsics.checkNotNullExpressionValue(recyclerView, "rv");
            recyclerView.setVisibility(8);
        } else {
            RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(C5619R.C5622id.f6518rv);
            Intrinsics.checkNotNullExpressionValue(recyclerView2, "rv");
            recyclerView2.setVisibility(0);
            TalkingInfo talkingInfo8 = rent.getTalkingInfo();
            Intrinsics.checkNotNullExpressionValue(talkingInfo8, "data.talkingInfo");
            List<RentAttributes> rentAttributes2 = talkingInfo8.getRentAttributes();
            Intrinsics.checkNotNullExpressionValue(rentAttributes2, "data.talkingInfo.rentAttributes");
            showDesireAttribute(CollectionsKt.toMutableList(CollectionsKt.filterNotNull(rentAttributes2)));
        }
        if (!this.rentList.isEmpty()) {
            showRentTitle();
            showRentList(this.rentList);
        }
    }

    /* access modifiers changed from: private */
    public final void showServiceTicket(Resource<ServiceTicket> resource) {
        String str;
        RentInfoObject rentInfoObject;
        RealmList<RentAttributes> desiredAttributes;
        RentInfoObject rentInfoObject2;
        RealmList<RentAttributes> desiredAttributes2;
        Resource.Status status = resource.getStatus();
        if (status != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
            if (i == 1) {
                ProgressBar progressBar = (ProgressBar) _$_findCachedViewById(C5619R.C5622id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
                progressBar.setVisibility(8);
                ServiceTicket data = resource.getData();
                if (data == null || (str = data.getObjectTitle()) == null) {
                    str = "";
                }
                CharSequence charSequence = str;
                if (StringsKt.isBlank(charSequence)) {
                    TextView textView = (TextView) _$_findCachedViewById(C5619R.C5622id.tvObjectTitle);
                    Intrinsics.checkNotNullExpressionValue(textView, "tvObjectTitle");
                    textView.setVisibility(8);
                } else {
                    TextView textView2 = (TextView) _$_findCachedViewById(C5619R.C5622id.tvObjectTitle);
                    Intrinsics.checkNotNullExpressionValue(textView2, "tvObjectTitle");
                    textView2.setVisibility(0);
                    TextView textView3 = (TextView) _$_findCachedViewById(C5619R.C5622id.tvObjectTitle);
                    Intrinsics.checkNotNullExpressionValue(textView3, "tvObjectTitle");
                    textView3.setText(charSequence);
                }
                ServiceTicket data2 = resource.getData();
                if (!(data2 == null || (rentInfoObject2 = data2.getRentInfoObject()) == null || (desiredAttributes2 = rentInfoObject2.getDesiredAttributes()) == null)) {
                    ScrollView scrollView = (ScrollView) _$_findCachedViewById(C5619R.C5622id.rentInfoLayout);
                    Intrinsics.checkNotNullExpressionValue(scrollView, "rentInfoLayout");
                    scrollView.setVisibility(0);
                    showDesireAttribute(CollectionsKt.toMutableList(CollectionsKt.filterNotNull(desiredAttributes2)));
                }
                ServiceTicket data3 = resource.getData();
                if (data3 == null || (rentInfoObject = data3.getRentInfoObject()) == null || (desiredAttributes = rentInfoObject.getDesiredAttributes()) == null || !desiredAttributes.isEmpty()) {
                    TextView textView4 = (TextView) _$_findCachedViewById(C5619R.C5622id.tvNoInfo);
                    Intrinsics.checkNotNullExpressionValue(textView4, "tvNoInfo");
                    textView4.setVisibility(8);
                    return;
                }
                TextView textView5 = (TextView) _$_findCachedViewById(C5619R.C5622id.tvNoInfo);
                Intrinsics.checkNotNullExpressionValue(textView5, "tvNoInfo");
                textView5.setVisibility(0);
            } else if (i == 2) {
                ProgressBar progressBar2 = (ProgressBar) _$_findCachedViewById(C5619R.C5622id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar2, "progressBar");
                progressBar2.setVisibility(8);
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    Intrinsics.checkNotNullExpressionValue(activity, "it");
                    MaterialDialog.positiveButton$default(MaterialDialog.message$default(new MaterialDialog(activity, (DialogBehavior) null, 2, (DefaultConstructorMarker) null), Integer.valueOf(R.string.loading_error), (CharSequence) null, (Function1) null, 6, (Object) null), Integer.valueOf(R.string.button_OK), (CharSequence) null, new RentInfoFragment$showServiceTicket$$inlined$let$lambda$1(this), 2, (Object) null).show();
                }
            }
        }
    }

    private final void initAdapter() {
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C5619R.C5622id.f6518rv);
        Intrinsics.checkNotNullExpressionValue(recyclerView, "rv");
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(C5619R.C5622id.f6518rv);
        Intrinsics.checkNotNullExpressionValue(recyclerView2, "rv");
        recyclerView2.setAdapter(this.adapter);
        this.myRentaSection.setDeleteVisibility(false);
        this.myRentaSection.setShowTitle(false);
    }

    private final void showDesireAttribute(List<RentAttributes> list) {
        if (!this.adapter.contains(this.desireAttributeSection).booleanValue()) {
            this.adapter.addSection(this.desireAttributeSection);
        }
        this.desireAttributeSection.setData(CollectionsKt.toList(list));
    }

    private final void showRentList(List<RentInfo> list) {
        if (!this.adapter.contains(this.myRentaSection).booleanValue()) {
            this.adapter.addSection(this.myRentaSection);
        }
        this.myRentaSection.setData(CollectionsKt.toList(list));
    }

    private final void showRentTitle() {
        if (!this.adapter.contains(this.titleSection).booleanValue()) {
            this.adapter.addSection(this.titleSection);
        }
        this.titleSection.setCustomLayout(R.layout.title_section_custom_3);
        this.titleSection.setData(new SomeString(getResources().getString(R.string.active_rent)));
    }

    /* access modifiers changed from: protected */
    public void showToolbar() {
        getBaseActivity().setToolbarLeft(ToolbarButtons.BACK);
        getBaseActivity().setTextTitle(getString(R.string.label_rent_room));
        getBaseActivity().removeToolbarElevation();
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/morionserviceticket/RentInfoFragment$Companion;", "", "()V", "newInstance", "Lru/unicorn/ujin/view/activity/navigation/ui/morionserviceticket/RentInfoFragment;", "objectId", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.morionserviceticket.RentInfoFragment$Companion */
    /* compiled from: RentInfoFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final RentInfoFragment newInstance(int i) {
            RentInfoFragment rentInfoFragment = new RentInfoFragment();
            rentInfoFragment.objectId = i;
            return rentInfoFragment;
        }
    }
}
