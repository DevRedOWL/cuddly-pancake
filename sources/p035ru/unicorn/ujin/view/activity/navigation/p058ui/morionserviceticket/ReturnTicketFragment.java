package p035ru.unicorn.ujin.view.activity.navigation.p058ui.morionserviceticket;

import android.content.Context;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;
import androidx.databinding.ObservableField;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.apache.commons.lang3.StringUtils;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.databinding.FragmentReturnTicketBinding;
import p035ru.unicorn.ujin.data.profile.repository.ProfileLocalRepository;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.activity.BaseActivity;
import p035ru.unicorn.ujin.view.activity.navigation.entity.KolyaSuccesModel;
import p035ru.unicorn.ujin.view.activity.navigation.helper.DialogHelper;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.HelpDeskViewModel;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.ServiceTicket;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.BaseBindingFragment;
import p035ru.unicorn.ujin.view.fragments.chats.ChatFragment;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0018B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0014J\b\u0010\t\u001a\u00020\nH\u0014J\u001a\u0010\u000b\u001a\u00020\f2\u0010\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\u000eH\u0002J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\nH\u0016J\u0012\u0010\u0012\u001a\u00020\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002H\u0014J\u0018\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\nH\u0002J\b\u0010\u0017\u001a\u00020\fH\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/morionserviceticket/ReturnTicketFragment;", "Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/BaseBindingFragment;", "Lru/unicorn/ujin/view/activity/navigation/ui/helpdesk/HelpDeskViewModel;", "Lru/unicorn/databinding/FragmentReturnTicketBinding;", "()V", "ticket", "Lru/unicorn/ujin/view/activity/navigation/ui/helpdesk/ServiceTicket;", "getLayoutRes", "", "getMyToolbarTitle", "", "onChangeTicketStatus", "", "resource", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/view/activity/navigation/entity/KolyaSuccesModel;", "onFileChoose", "filePath", "onViewCreated", "viewModell", "openChat", "serviceTicket", "serviceMessage", "returnTicket", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.morionserviceticket.ReturnTicketFragment */
/* compiled from: ReturnTicketFragment.kt */
public final class ReturnTicketFragment extends BaseBindingFragment<HelpDeskViewModel, FragmentReturnTicketBinding> {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private HashMap _$_findViewCache;
    /* access modifiers changed from: private */
    public ServiceTicket ticket;

    @Metadata(mo51341bv = {1, 0, 3}, mo51344k = 3, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.morionserviceticket.ReturnTicketFragment$WhenMappings */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[Resource.Status.values().length];

        static {
            $EnumSwitchMapping$0[Resource.Status.LOADING.ordinal()] = 1;
            $EnumSwitchMapping$0[Resource.Status.SUCCESS.ordinal()] = 2;
            $EnumSwitchMapping$0[Resource.Status.ERROR.ordinal()] = 3;
        }
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
        return R.layout.fragment_return_ticket;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public void onFileChoose(String str) {
        Intrinsics.checkNotNullParameter(str, "filePath");
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
        ObservableField<String> observableField;
        FragmentReturnTicketBinding fragmentReturnTicketBinding = (FragmentReturnTicketBinding) getViewDataBinding();
        Intrinsics.checkNotNullExpressionValue(fragmentReturnTicketBinding, "viewDataBinding");
        fragmentReturnTicketBinding.setLifecycleOwner(getViewLifecycleOwner());
        FragmentReturnTicketBinding fragmentReturnTicketBinding2 = (FragmentReturnTicketBinding) getViewDataBinding();
        Intrinsics.checkNotNullExpressionValue(fragmentReturnTicketBinding2, "viewDataBinding");
        fragmentReturnTicketBinding2.setVm(helpDeskViewModel);
        if (!(helpDeskViewModel == null || (observableField = helpDeskViewModel.returnReasonObservable) == null)) {
            observableField.set(getResources().getString(R.string.work_isnt_done));
        }
        ((FragmentReturnTicketBinding) getViewDataBinding()).btnConfirm.setOnClickListener(new ReturnTicketFragment$onViewCreated$1(this));
    }

    /* access modifiers changed from: private */
    public final void returnTicket() {
        HelpDeskViewModel helpDeskViewModel = (HelpDeskViewModel) getViewModell();
        ServiceTicket serviceTicket = this.ticket;
        helpDeskViewModel.makeTicketAction(0, serviceTicket != null ? serviceTicket.getTicketId() : null);
        HelpDeskViewModel helpDeskViewModel2 = (HelpDeskViewModel) getViewModell();
        Intrinsics.checkNotNullExpressionValue(helpDeskViewModel2, "viewModell");
        helpDeskViewModel2.getOnMakeTicketActionLiveData().observe(this, new ReturnTicketFragment$returnTicket$1(this));
    }

    /* access modifiers changed from: private */
    public final void onChangeTicketStatus(Resource<KolyaSuccesModel> resource) {
        Resource.Status status;
        if (resource != null && (status = resource.getStatus()) != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
            if (i == 1) {
                ProgressBar progressBar = ((FragmentReturnTicketBinding) getViewDataBinding()).progressBar;
                Intrinsics.checkNotNullExpressionValue(progressBar, "viewDataBinding.progressBar");
                progressBar.setVisibility(0);
            } else if (i == 2) {
                ProgressBar progressBar2 = ((FragmentReturnTicketBinding) getViewDataBinding()).progressBar;
                Intrinsics.checkNotNullExpressionValue(progressBar2, "viewDataBinding.progressBar");
                progressBar2.setVisibility(8);
                StringBuilder sb = new StringBuilder();
                sb.append("Причина возврата: ");
                sb.append((Intrinsics.areEqual((Object) getResources().getString(R.string.another_reason), (Object) ((HelpDeskViewModel) getViewModell()).returnReasonObservable.get()) ? ((HelpDeskViewModel) getViewModell()).commentReasonObservable : ((HelpDeskViewModel) getViewModell()).returnReasonObservable).get());
                String sb2 = sb.toString();
                ServiceTicket serviceTicket = this.ticket;
                if (serviceTicket != null) {
                    openChat(serviceTicket, sb2);
                }
            } else if (i == 3) {
                ProgressBar progressBar3 = ((FragmentReturnTicketBinding) getViewDataBinding()).progressBar;
                Intrinsics.checkNotNullExpressionValue(progressBar3, "viewDataBinding.progressBar");
                progressBar3.setVisibility(8);
                DialogHelper.showDialog((Context) getActivity(), resource.getMessage());
            }
        }
    }

    private final void openChat(ServiceTicket serviceTicket, String str) {
        ProfileLocalRepository instance = ProfileLocalRepository.Companion.getInstance();
        if (StringUtils.isNotEmpty(serviceTicket.getChatId())) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(BaseActivity.FRAGMENT_RETURN_TICKET);
            ChatFragment.Companion companion = ChatFragment.Companion;
            String chatId = serviceTicket.getChatId();
            Intrinsics.checkNotNullExpressionValue(chatId, "serviceTicket.chatId");
            nextFragmentWithoutStack(companion.newInstance(chatId, String.valueOf(instance.getUser().getId()) + "", true, str), false, arrayList, BaseActivity.FRAGMENT_CHAT);
            return;
        }
        Toast.makeText(getContext(), "Чата по заявке пока нет!", 1).show();
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/morionserviceticket/ReturnTicketFragment$Companion;", "", "()V", "newInstance", "Lru/unicorn/ujin/view/activity/navigation/ui/morionserviceticket/ReturnTicketFragment;", "ticket", "Lru/unicorn/ujin/view/activity/navigation/ui/helpdesk/ServiceTicket;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.morionserviceticket.ReturnTicketFragment$Companion */
    /* compiled from: ReturnTicketFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ReturnTicketFragment newInstance(ServiceTicket serviceTicket) {
            Intrinsics.checkNotNullParameter(serviceTicket, "ticket");
            ReturnTicketFragment returnTicketFragment = new ReturnTicketFragment();
            returnTicketFragment.ticket = serviceTicket;
            return returnTicketFragment;
        }
    }
}
