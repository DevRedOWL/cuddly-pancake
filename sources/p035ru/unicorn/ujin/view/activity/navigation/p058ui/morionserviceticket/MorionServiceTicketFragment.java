package p035ru.unicorn.ujin.view.activity.navigation.p058ui.morionserviceticket;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.karumi.dexter.Dexter;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.apache.commons.lang3.StringUtils;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.databinding.FragmentMorionServiceTicketBinding;
import p035ru.unicorn.ujin.data.Constants;
import p035ru.unicorn.ujin.data.profile.repository.ProfileLocalRepository;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.activity.BaseActivity;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.SectionedAdapter;
import p035ru.unicorn.ujin.view.activity.navigation.entity.KolyaSuccesModel;
import p035ru.unicorn.ujin.view.activity.navigation.helper.DialogHelper;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.DownLoadSection;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.HelpDeskViewModel;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.ServiceFile;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.ServiceTicket;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.BaseBindingFragment;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;
import p035ru.unicorn.ujin.view.fragments.chats.ChatFragment;
import p035ru.unicorn.ujin.view.service.DownloadService;
import p046io.realm.RealmList;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 02\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u00010B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u0015\u001a\u00020\u0016H\u0014J\u0010\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0016H\u0002J\b\u0010\u0019\u001a\u00020\u0014H\u0014J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u001a\u0010\u001c\u001a\u00020\u001b2\u0010\u0010\u001d\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0018\u00010\u001eH\u0002J\u0010\u0010 \u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\"H\u0002J\u0010\u0010#\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020\u0014H\u0016J\u0012\u0010%\u001a\u00020\u001b2\b\u0010&\u001a\u0004\u0018\u00010\u0002H\u0014J\u0010\u0010'\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020\u0012H\u0002J\b\u0010)\u001a\u00020\u001bH\u0002J\b\u0010*\u001a\u00020\u001bH\u0002J\u0016\u0010+\u001a\u00020\u001b2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\"0-H\u0002J\u0016\u0010.\u001a\u00020\u001b2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00120\u001eH\u0002J\u0010\u0010/\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\"H\u0002R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000¨\u00061"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/morionserviceticket/MorionServiceTicketFragment;", "Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/BaseBindingFragment;", "Lru/unicorn/ujin/view/activity/navigation/ui/helpdesk/HelpDeskViewModel;", "Lru/unicorn/databinding/FragmentMorionServiceTicketBinding;", "()V", "downloadSection", "Lru/unicorn/ujin/view/activity/navigation/ui/helpdesk/DownLoadSection;", "getDownloadSection", "()Lru/unicorn/ujin/view/activity/navigation/ui/helpdesk/DownLoadSection;", "openFromPush", "", "sectionedAdapter", "Lru/unicorn/ujin/view/activity/navigation/adapter/sectionedadapter/SectionedAdapter;", "getSectionedAdapter", "()Lru/unicorn/ujin/view/activity/navigation/adapter/sectionedadapter/SectionedAdapter;", "setSectionedAdapter", "(Lru/unicorn/ujin/view/activity/navigation/adapter/sectionedadapter/SectionedAdapter;)V", "ticket", "Lru/unicorn/ujin/view/activity/navigation/ui/helpdesk/ServiceTicket;", "ticketId", "", "getLayoutRes", "", "getMessageByActionId", "actionId", "getMyToolbarTitle", "makeTicketAction", "", "onChangeTicketStatus", "resource", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/view/activity/navigation/entity/KolyaSuccesModel;", "onDownloadClick", "serviceFile", "Lru/unicorn/ujin/view/activity/navigation/ui/helpdesk/ServiceFile;", "onFileChoose", "filePath", "onViewCreated", "viewModell", "openChat", "serviceTicket", "showActionButtons", "showChatButton", "showFileList", "fileList", "Lio/realm/RealmList;", "showServiceTicket", "startDownload", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.morionserviceticket.MorionServiceTicketFragment */
/* compiled from: MorionServiceTicketFragment.kt */
public final class MorionServiceTicketFragment extends BaseBindingFragment<HelpDeskViewModel, FragmentMorionServiceTicketBinding> {
    public static final int ACTION_CANCEL_ID = 2;
    public static final int ACTION_CONFIRM_ID = 1;
    public static final int ACTION_RETURN_ID = 0;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String TICKET_STATE_ID_CLOSE = "5";
    private HashMap _$_findViewCache;
    private final DownLoadSection downloadSection = new DownLoadSection();
    private boolean openFromPush;
    private SectionedAdapter sectionedAdapter = new SectionedAdapter();
    private ServiceTicket ticket;
    private String ticketId;

    @Metadata(mo51341bv = {1, 0, 3}, mo51344k = 3, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.morionserviceticket.MorionServiceTicketFragment$WhenMappings */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[Resource.Status.values().length];
        public static final /* synthetic */ int[] $EnumSwitchMapping$1 = new int[Resource.Status.values().length];

        static {
            $EnumSwitchMapping$0[Resource.Status.SUCCESS.ordinal()] = 1;
            $EnumSwitchMapping$0[Resource.Status.ERROR.ordinal()] = 2;
            $EnumSwitchMapping$0[Resource.Status.LOADING.ordinal()] = 3;
            $EnumSwitchMapping$1[Resource.Status.LOADING.ordinal()] = 1;
            $EnumSwitchMapping$1[Resource.Status.SUCCESS.ordinal()] = 2;
            $EnumSwitchMapping$1[Resource.Status.ERROR.ordinal()] = 3;
        }
    }

    private final String getMessageByActionId(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "" : "Вы хотите отменить заявку?" : "Вы хотите подтвердить и закрыть заявку?" : "Вы хотите вернуть заявку в работу?";
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
    public int getLayoutRes() {
        return R.layout.fragment_morion_service_ticket;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public void onFileChoose(String str) {
        Intrinsics.checkNotNullParameter(str, "filePath");
    }

    public final SectionedAdapter getSectionedAdapter() {
        return this.sectionedAdapter;
    }

    public final void setSectionedAdapter(SectionedAdapter sectionedAdapter2) {
        Intrinsics.checkNotNullParameter(sectionedAdapter2, "<set-?>");
        this.sectionedAdapter = sectionedAdapter2;
    }

    public final DownLoadSection getDownloadSection() {
        return this.downloadSection;
    }

    /* access modifiers changed from: protected */
    public String getMyToolbarTitle() {
        ServiceTicket serviceTicket = this.ticket;
        if (serviceTicket == null) {
            return "";
        }
        String str = null;
        if ((serviceTicket != null ? serviceTicket.getNumber() : null) != null) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            BaseActivity baseActivity = getBaseActivity();
            Intrinsics.checkNotNullExpressionValue(baseActivity, "baseActivity");
            String string = baseActivity.getResources().getString(R.string.label_ticket);
            Intrinsics.checkNotNullExpressionValue(string, "baseActivity.resources.g…ng(R.string.label_ticket)");
            Object[] objArr = new Object[1];
            ServiceTicket serviceTicket2 = this.ticket;
            if (serviceTicket2 != null) {
                str = serviceTicket2.getNumber();
            }
            objArr[0] = str;
            String format = String.format(string, Arrays.copyOf(objArr, objArr.length));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
            return format;
        }
        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
        BaseActivity baseActivity2 = getBaseActivity();
        Intrinsics.checkNotNullExpressionValue(baseActivity2, "baseActivity");
        String string2 = baseActivity2.getResources().getString(R.string.label_ticket);
        Intrinsics.checkNotNullExpressionValue(string2, "baseActivity.resources.g…ng(R.string.label_ticket)");
        BaseActivity baseActivity3 = getBaseActivity();
        Intrinsics.checkNotNullExpressionValue(baseActivity3, "baseActivity");
        Object[] objArr2 = {baseActivity3.getResources().getString(R.string.binding_empty_value)};
        String format2 = String.format(string2, Arrays.copyOf(objArr2, objArr2.length));
        Intrinsics.checkNotNullExpressionValue(format2, "java.lang.String.format(format, *args)");
        return format2;
    }

    /* access modifiers changed from: protected */
    public void onViewCreated(HelpDeskViewModel helpDeskViewModel) {
        MutableLiveData<Resource<ServiceTicket>> ticketMutableLiveData;
        Bundle arguments = getArguments();
        this.ticketId = arguments != null ? arguments.getString(Constants.ARG_TICKET_ID) : null;
        Bundle arguments2 = getArguments();
        Intrinsics.checkNotNull(arguments2);
        this.openFromPush = arguments2.getBoolean(Constants.ARG_TICKET_FROM_PUSH, false);
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            arguments3.remove(Constants.ARG_TICKET_FROM_PUSH);
        }
        ((FragmentMorionServiceTicketBinding) getViewDataBinding()).btnGoChat.setOnClickListener(new MorionServiceTicketFragment$onViewCreated$1(this));
        TextView textView = ((FragmentMorionServiceTicketBinding) getViewDataBinding()).tvFilesTitle;
        Intrinsics.checkNotNullExpressionValue(textView, "viewDataBinding.tvFilesTitle");
        textView.setVisibility(8);
        RecyclerView recyclerView = ((FragmentMorionServiceTicketBinding) getViewDataBinding()).rvFileList;
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(this.sectionedAdapter);
        ConstraintLayout constraintLayout = ((FragmentMorionServiceTicketBinding) getViewDataBinding()).ticketLayout;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "viewDataBinding.ticketLayout");
        constraintLayout.setVisibility(8);
        if (helpDeskViewModel != null) {
            helpDeskViewModel.getTicketsByTicketId(this.ticketId);
        }
        if (helpDeskViewModel != null && (ticketMutableLiveData = helpDeskViewModel.getTicketMutableLiveData()) != null) {
            ticketMutableLiveData.observe(getViewLifecycleOwner(), new MorionServiceTicketFragment$onViewCreated$3(this));
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x01b9  */
    /* JADX WARNING: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void showServiceTicket(p035ru.unicorn.ujin.data.realm.Resource<p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.ServiceTicket> r18) {
        /*
            r17 = this;
            r0 = r17
            ru.unicorn.ujin.data.realm.Resource$Status r1 = r18.getStatus()
            if (r1 != 0) goto L_0x000a
            goto L_0x0215
        L_0x000a:
            int[] r2 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.morionserviceticket.MorionServiceTicketFragment.WhenMappings.$EnumSwitchMapping$0
            int r1 = r1.ordinal()
            r1 = r2[r1]
            r2 = 2131886320(0x7f1200f0, float:1.9407216E38)
            r3 = 2131887277(0x7f1204ad, float:1.9409157E38)
            java.lang.String r4 = "it"
            r5 = 8
            r6 = 2
            r7 = 1
            java.lang.String r8 = "viewDataBinding.ticketLayout"
            r9 = 0
            r10 = 0
            if (r1 == r7) goto L_0x0082
            if (r1 == r6) goto L_0x003b
            r2 = 3
            if (r1 == r2) goto L_0x002b
            goto L_0x0215
        L_0x002b:
            androidx.databinding.ViewDataBinding r1 = r17.getViewDataBinding()
            ru.unicorn.databinding.FragmentMorionServiceTicketBinding r1 = (p035ru.unicorn.databinding.FragmentMorionServiceTicketBinding) r1
            androidx.constraintlayout.widget.ConstraintLayout r1 = r1.ticketLayout
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r8)
            r1.setVisibility(r9)
            goto L_0x0215
        L_0x003b:
            androidx.databinding.ViewDataBinding r1 = r17.getViewDataBinding()
            ru.unicorn.databinding.FragmentMorionServiceTicketBinding r1 = (p035ru.unicorn.databinding.FragmentMorionServiceTicketBinding) r1
            androidx.constraintlayout.widget.ConstraintLayout r1 = r1.ticketLayout
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r8)
            r1.setVisibility(r5)
            androidx.fragment.app.FragmentActivity r1 = r17.getActivity()
            if (r1 == 0) goto L_0x0215
            com.afollestad.materialdialogs.MaterialDialog r5 = new com.afollestad.materialdialogs.MaterialDialog
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r4)
            android.content.Context r1 = (android.content.Context) r1
            r5.<init>(r1, r10, r6, r10)
            com.afollestad.materialdialogs.MaterialDialog r11 = r5.cancelOnTouchOutside(r9)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r3)
            r13 = 0
            r14 = 0
            r15 = 6
            r16 = 0
            com.afollestad.materialdialogs.MaterialDialog r3 = com.afollestad.materialdialogs.MaterialDialog.message$default(r11, r12, r13, r14, r15, r16)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            r5 = 0
            ru.unicorn.ujin.view.activity.navigation.ui.morionserviceticket.MorionServiceTicketFragment$showServiceTicket$$inlined$let$lambda$3 r1 = new ru.unicorn.ujin.view.activity.navigation.ui.morionserviceticket.MorionServiceTicketFragment$showServiceTicket$$inlined$let$lambda$3
            r1.<init>(r0)
            r6 = r1
            kotlin.jvm.functions.Function1 r6 = (kotlin.jvm.functions.Function1) r6
            r7 = 2
            r8 = 0
            com.afollestad.materialdialogs.MaterialDialog r1 = com.afollestad.materialdialogs.MaterialDialog.positiveButton$default(r3, r4, r5, r6, r7, r8)
            r1.show()
            goto L_0x0215
        L_0x0082:
            java.lang.Object r1 = r18.getData()
            if (r1 == 0) goto L_0x01e2
            java.lang.Object r1 = r18.getData()
            ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.ServiceTicket r1 = (p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.ServiceTicket) r1
            r0.ticket = r1
            androidx.databinding.ViewDataBinding r1 = r17.getViewDataBinding()
            ru.unicorn.databinding.FragmentMorionServiceTicketBinding r1 = (p035ru.unicorn.databinding.FragmentMorionServiceTicketBinding) r1
            androidx.constraintlayout.widget.ConstraintLayout r1 = r1.ticketLayout
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r8)
            r1.setVisibility(r5)
            androidx.databinding.ViewDataBinding r1 = r17.getViewDataBinding()
            ru.unicorn.databinding.FragmentMorionServiceTicketBinding r1 = (p035ru.unicorn.databinding.FragmentMorionServiceTicketBinding) r1
            androidx.constraintlayout.widget.ConstraintLayout r1 = r1.ticketLayout
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r8)
            r1.setVisibility(r9)
            java.lang.Object r1 = r18.getData()
            java.lang.String r2 = "resource.data"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.ServiceTicket r1 = (p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.ServiceTicket) r1
            java.lang.String r1 = r1.getNumber()
            java.lang.String r3 = "java.lang.String.format(format, *args)"
            java.lang.String r4 = "baseActivity.resources.g…ng(R.string.label_ticket)"
            r5 = 2131887230(0x7f12047e, float:1.9409061E38)
            java.lang.String r6 = "baseActivity"
            if (r1 == 0) goto L_0x00f8
            kotlin.jvm.internal.StringCompanionObject r1 = kotlin.jvm.internal.StringCompanionObject.INSTANCE
            ru.unicorn.ujin.view.activity.BaseActivity r1 = r17.getBaseActivity()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r6)
            android.content.res.Resources r1 = r1.getResources()
            java.lang.String r1 = r1.getString(r5)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r4)
            java.lang.Object[] r4 = new java.lang.Object[r7]
            java.lang.Object r5 = r18.getData()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r2)
            ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.ServiceTicket r5 = (p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.ServiceTicket) r5
            java.lang.String r5 = r5.getNumber()
            r4[r9] = r5
            int r5 = r4.length
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r5)
            java.lang.String r1 = java.lang.String.format(r1, r4)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)
            goto L_0x012e
        L_0x00f8:
            kotlin.jvm.internal.StringCompanionObject r1 = kotlin.jvm.internal.StringCompanionObject.INSTANCE
            ru.unicorn.ujin.view.activity.BaseActivity r1 = r17.getBaseActivity()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r6)
            android.content.res.Resources r1 = r1.getResources()
            java.lang.String r1 = r1.getString(r5)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r4)
            java.lang.Object[] r4 = new java.lang.Object[r7]
            ru.unicorn.ujin.view.activity.BaseActivity r5 = r17.getBaseActivity()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            android.content.res.Resources r5 = r5.getResources()
            r6 = 2131886293(0x7f1200d5, float:1.940716E38)
            java.lang.String r5 = r5.getString(r6)
            r4[r9] = r5
            int r5 = r4.length
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r5)
            java.lang.String r1 = java.lang.String.format(r1, r4)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)
        L_0x012e:
            ru.unicorn.ujin.view.activity.BaseActivity r3 = r17.getBaseActivity()
            r3.setTextTitle(r1)
            androidx.databinding.ViewDataBinding r1 = r17.getViewDataBinding()
            ru.unicorn.databinding.FragmentMorionServiceTicketBinding r1 = (p035ru.unicorn.databinding.FragmentMorionServiceTicketBinding) r1
            java.lang.String r3 = "viewDataBinding"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)
            java.lang.Object r3 = r18.getData()
            ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.ServiceTicket r3 = (p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.ServiceTicket) r3
            r1.setTicket(r3)
            ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.ServiceTicket r1 = r0.ticket
            if (r1 == 0) goto L_0x0165
            int r1 = r1.getObjectId()
            androidx.databinding.ViewDataBinding r3 = r17.getViewDataBinding()
            ru.unicorn.databinding.FragmentMorionServiceTicketBinding r3 = (p035ru.unicorn.databinding.FragmentMorionServiceTicketBinding) r3
            ru.unicorn.databinding.ItemLabelUnderlineWithArrowBinding r3 = r3.first
            androidx.constraintlayout.widget.ConstraintLayout r3 = r3.parent
            ru.unicorn.ujin.view.activity.navigation.ui.morionserviceticket.MorionServiceTicketFragment$showServiceTicket$$inlined$let$lambda$1 r4 = new ru.unicorn.ujin.view.activity.navigation.ui.morionserviceticket.MorionServiceTicketFragment$showServiceTicket$$inlined$let$lambda$1
            r4.<init>(r1, r0)
            android.view.View$OnClickListener r4 = (android.view.View.OnClickListener) r4
            r3.setOnClickListener(r4)
        L_0x0165:
            ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.ServiceTicket r1 = r0.ticket
            if (r1 == 0) goto L_0x016e
            java.lang.String r1 = r1.getTicketStateId()
            goto L_0x016f
        L_0x016e:
            r1 = r10
        L_0x016f:
            java.lang.String r3 = "5"
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r1 != 0) goto L_0x01a7
            ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.ServiceTicket r1 = r0.ticket
            if (r1 == 0) goto L_0x0195
            java.lang.String r1 = r1.getTicketStateTitle()
            if (r1 == 0) goto L_0x0195
            if (r1 == 0) goto L_0x018d
            java.lang.String r10 = r1.toLowerCase()
            java.lang.String r1 = "(this as java.lang.String).toLowerCase()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r1)
            goto L_0x0195
        L_0x018d:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "null cannot be cast to non-null type java.lang.String"
            r1.<init>(r2)
            throw r1
        L_0x0195:
            r1 = 2131886496(0x7f1201a0, float:1.9407572E38)
            java.lang.String r1 = r0.getString(r1)
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r10, (java.lang.Object) r1)
            if (r1 == 0) goto L_0x01a3
            goto L_0x01a7
        L_0x01a3:
            r17.showChatButton()
            goto L_0x01aa
        L_0x01a7:
            r17.showActionButtons()
        L_0x01aa:
            java.lang.Object r1 = r18.getData()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.ServiceTicket r1 = (p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.ServiceTicket) r1
            io.realm.RealmList r1 = r1.getFileList()
            if (r1 == 0) goto L_0x0215
            java.lang.Object r1 = r18.getData()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.ServiceTicket r1 = (p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.ServiceTicket) r1
            io.realm.RealmList r1 = r1.getFileList()
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x0215
            java.lang.Object r1 = r18.getData()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.ServiceTicket r1 = (p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.ServiceTicket) r1
            io.realm.RealmList r1 = r1.getFileList()
            java.lang.String r2 = "resource.data.fileList"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            r0.showFileList(r1)
            goto L_0x0215
        L_0x01e2:
            androidx.fragment.app.FragmentActivity r1 = r17.getActivity()
            if (r1 == 0) goto L_0x0215
            com.afollestad.materialdialogs.MaterialDialog r11 = new com.afollestad.materialdialogs.MaterialDialog
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r4)
            android.content.Context r1 = (android.content.Context) r1
            r11.<init>(r1, r10, r6, r10)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r3)
            r13 = 0
            r14 = 0
            r15 = 6
            r16 = 0
            com.afollestad.materialdialogs.MaterialDialog r3 = com.afollestad.materialdialogs.MaterialDialog.message$default(r11, r12, r13, r14, r15, r16)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            r5 = 0
            ru.unicorn.ujin.view.activity.navigation.ui.morionserviceticket.MorionServiceTicketFragment$showServiceTicket$$inlined$let$lambda$2 r1 = new ru.unicorn.ujin.view.activity.navigation.ui.morionserviceticket.MorionServiceTicketFragment$showServiceTicket$$inlined$let$lambda$2
            r1.<init>(r0)
            r6 = r1
            kotlin.jvm.functions.Function1 r6 = (kotlin.jvm.functions.Function1) r6
            r7 = 2
            r8 = 0
            com.afollestad.materialdialogs.MaterialDialog r1 = com.afollestad.materialdialogs.MaterialDialog.positiveButton$default(r3, r4, r5, r6, r7, r8)
            r1.show()
        L_0x0215:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.activity.navigation.p058ui.morionserviceticket.MorionServiceTicketFragment.showServiceTicket(ru.unicorn.ujin.data.realm.Resource):void");
    }

    private final void showChatButton() {
        DynamicBackgroundButton dynamicBackgroundButton = ((FragmentMorionServiceTicketBinding) getViewDataBinding()).btnGoChat;
        Intrinsics.checkNotNullExpressionValue(dynamicBackgroundButton, "viewDataBinding.btnGoChat");
        dynamicBackgroundButton.setVisibility(0);
    }

    private final void showActionButtons() {
        DynamicBackgroundButton dynamicBackgroundButton = ((FragmentMorionServiceTicketBinding) getViewDataBinding()).btnConfirm;
        dynamicBackgroundButton.setVisibility(0);
        String str = this.ticketId;
        if (str != null) {
            dynamicBackgroundButton.setOnClickListener(new C5853xf8bfe346(str, dynamicBackgroundButton, this));
        }
        DynamicBackgroundButton dynamicBackgroundButton2 = ((FragmentMorionServiceTicketBinding) getViewDataBinding()).btnReturn;
        dynamicBackgroundButton2.setVisibility(0);
        String str2 = this.ticketId;
        if (str2 != null) {
            dynamicBackgroundButton2.setOnClickListener(new C5854xf8bfe347(str2, dynamicBackgroundButton2, this));
        }
    }

    /* access modifiers changed from: private */
    public final void makeTicketAction(int i, String str) {
        if (i == 0) {
            ServiceTicket serviceTicket = this.ticket;
            if (serviceTicket != null) {
                nextFragment(ReturnTicketFragment.Companion.newInstance(serviceTicket), false, BaseActivity.FRAGMENT_RETURN_TICKET);
            }
        } else if (i == 1) {
            new AlertDialog.Builder(getBaseActivity()).setTitle((CharSequence) getString(R.string.title_attention)).setMessage((CharSequence) getMessageByActionId(i)).setPositiveButton((int) R.string.ok, (DialogInterface.OnClickListener) new MorionServiceTicketFragment$makeTicketAction$2(this, i, str)).setNegativeButton((int) R.string.button_no, (DialogInterface.OnClickListener) MorionServiceTicketFragment$makeTicketAction$3.INSTANCE).show();
        }
    }

    /* access modifiers changed from: private */
    public final void onChangeTicketStatus(Resource<KolyaSuccesModel> resource) {
        Resource.Status status;
        if (resource != null && (status = resource.getStatus()) != null) {
            int i = WhenMappings.$EnumSwitchMapping$1[status.ordinal()];
            if (i == 1) {
                ProgressBar progressBar = ((FragmentMorionServiceTicketBinding) getViewDataBinding()).progressBar;
                Intrinsics.checkNotNullExpressionValue(progressBar, "viewDataBinding.progressBar");
                progressBar.setVisibility(0);
            } else if (i == 2) {
                ProgressBar progressBar2 = ((FragmentMorionServiceTicketBinding) getViewDataBinding()).progressBar;
                Intrinsics.checkNotNullExpressionValue(progressBar2, "viewDataBinding.progressBar");
                progressBar2.setVisibility(8);
                DynamicBackgroundButton dynamicBackgroundButton = ((FragmentMorionServiceTicketBinding) getViewDataBinding()).btnReturn;
                Intrinsics.checkNotNullExpressionValue(dynamicBackgroundButton, "viewDataBinding.btnReturn");
                dynamicBackgroundButton.setVisibility(8);
                DynamicBackgroundButton dynamicBackgroundButton2 = ((FragmentMorionServiceTicketBinding) getViewDataBinding()).btnConfirm;
                Intrinsics.checkNotNullExpressionValue(dynamicBackgroundButton2, "viewDataBinding.btnConfirm");
                dynamicBackgroundButton2.setVisibility(8);
                DynamicBackgroundButton dynamicBackgroundButton3 = ((FragmentMorionServiceTicketBinding) getViewDataBinding()).btnGoChat;
                Intrinsics.checkNotNullExpressionValue(dynamicBackgroundButton3, "viewDataBinding.btnGoChat");
                dynamicBackgroundButton3.setVisibility(0);
                ServiceTicket serviceTicket = this.ticket;
                if (serviceTicket != null) {
                    openChat(serviceTicket);
                }
            } else if (i == 3) {
                ProgressBar progressBar3 = ((FragmentMorionServiceTicketBinding) getViewDataBinding()).progressBar;
                Intrinsics.checkNotNullExpressionValue(progressBar3, "viewDataBinding.progressBar");
                progressBar3.setVisibility(8);
                DialogHelper.showDialog((Context) getActivity(), resource.getMessage());
            }
        }
    }

    private final void openChat(ServiceTicket serviceTicket) {
        ProfileLocalRepository instance = ProfileLocalRepository.Companion.getInstance();
        if (StringUtils.isNotEmpty(serviceTicket.getChatId())) {
            ChatFragment.Companion companion = ChatFragment.Companion;
            String chatId = serviceTicket.getChatId();
            Intrinsics.checkNotNullExpressionValue(chatId, "serviceTicket.chatId");
            nextFragment(companion.newInstance(chatId, String.valueOf(instance.getUser().getId()) + "", true), false, BaseActivity.FRAGMENT_CHAT);
            return;
        }
        Toast.makeText(getContext(), "Чата по заявке пока нет!", 1).show();
    }

    private final void showFileList(RealmList<ServiceFile> realmList) {
        if (!this.sectionedAdapter.contains(this.downloadSection).booleanValue()) {
            this.sectionedAdapter.addSection(this.downloadSection);
            this.downloadSection.getOnClick().subscribe(new MorionServiceTicketFragment$showFileList$1(this));
            this.downloadSection.setData(CollectionsKt.toList(realmList));
            this.downloadSection.show(true);
        }
    }

    /* access modifiers changed from: private */
    public final void onDownloadClick(ServiceFile serviceFile) {
        Dexter.withActivity(getActivity()).withPermission("android.permission.WRITE_EXTERNAL_STORAGE").withListener(new MorionServiceTicketFragment$onDownloadClick$1(this, serviceFile)).check();
    }

    /* access modifiers changed from: private */
    public final void startDownload(ServiceFile serviceFile) {
        Intent intent = new Intent(getBaseActivity(), DownloadService.class);
        intent.putExtra(DownloadService.ARG_URL, serviceFile.getFileUrl());
        intent.putExtra(DownloadService.ARG_FILE_NAME, serviceFile.getFileName());
        getBaseActivity().startService(intent);
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000¨\u0006\f"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/morionserviceticket/MorionServiceTicketFragment$Companion;", "", "()V", "ACTION_CANCEL_ID", "", "ACTION_CONFIRM_ID", "ACTION_RETURN_ID", "TICKET_STATE_ID_CLOSE", "", "start", "Lru/unicorn/ujin/view/activity/navigation/ui/morionserviceticket/MorionServiceTicketFragment;", "ticketId", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.morionserviceticket.MorionServiceTicketFragment$Companion */
    /* compiled from: MorionServiceTicketFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final MorionServiceTicketFragment start(String str) {
            Intrinsics.checkNotNullParameter(str, "ticketId");
            Bundle bundle = new Bundle();
            bundle.putString(Constants.ARG_TICKET_ID, str);
            MorionServiceTicketFragment morionServiceTicketFragment = new MorionServiceTicketFragment();
            morionServiceTicketFragment.setArguments(bundle);
            return morionServiceTicketFragment;
        }
    }
}
