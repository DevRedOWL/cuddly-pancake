package p035ru.unicorn.ujin.view.adapters;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.data.profile.ProfileViewModel;
import p035ru.unicorn.ujin.data.profile.repository.ProfileLocalRepository;
import p035ru.unicorn.ujin.data.realm.TimeSlot;
import p035ru.unicorn.ujin.data.realm.marketplace.CategoryItem;
import p035ru.unicorn.ujin.data.realm.profile.User;
import p035ru.unicorn.ujin.view.activity.BaseActivity;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.DataEntryDialog;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.EditField;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.Field;
import p035ru.unicorn.ujin.viewModel.RealmViewModel;
import p035ru.unicorn.ujin.viewModel.SingleLiveEvent;
import p035ru.unicorn.ujin.viewModel.events.ProfileUpdateEvent;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010 \n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 `2\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0003`abB3\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\b\u0010A\u001a\u00020BH\u0002J\u000e\u0010C\u001a\u00020\u00052\u0006\u0010D\u001a\u00020\u0012J\b\u0010E\u001a\u00020\u0012H\u0016J\u000e\u0010F\u001a\b\u0012\u0004\u0012\u00020G0\u0004H\u0002J\u0010\u0010H\u001a\u00020B2\b\u0010I\u001a\u0004\u0018\u00010JJ\u0010\u0010K\u001a\u00020B2\u0006\u0010L\u001a\u00020MH\u0002J\u0010\u0010N\u001a\u00020B2\u0006\u0010O\u001a\u00020PH\u0002J\u0010\u0010Q\u001a\u00020B2\u0006\u0010O\u001a\u00020PH\u0002J\u0010\u0010R\u001a\u00020B2\u0006\u0010O\u001a\u00020PH\u0002J\u001c\u0010S\u001a\u00020B2\n\u0010T\u001a\u00060\u0002R\u00020\u00002\u0006\u0010D\u001a\u00020\u0012H\u0016J\u001c\u0010U\u001a\u00060\u0002R\u00020\u00002\u0006\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u00020\u0012H\u0016J \u0010Y\u001a\u00020B2\u0006\u0010D\u001a\u00020\u00122\u0006\u0010Z\u001a\u00020\t2\u0006\u0010[\u001a\u00020\tH\u0002J\b\u0010\\\u001a\u00020BH\u0002J\u0010\u0010]\u001a\u00020B2\u0006\u0010Z\u001a\u00020\tH\u0002J\u0016\u0010^\u001a\u00020B2\u0006\u0010D\u001a\u00020\u00122\u0006\u0010_\u001a\u00020\u0005R\u000e\u0010\u000f\u001a\u00020\u0010X.¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u001cX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001c\u0010)\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001c\u0010.\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010+\"\u0004\b0\u0010-R\"\u00101\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u000102X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u0018\"\u0004\b4\u0010\u001aR\u001a\u00105\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u0014\"\u0004\b7\u0010\u0016R\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010+\"\u0004\b9\u0010-R\u000e\u0010:\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@¨\u0006c"}, mo51343d2 = {"Lru/unicorn/ujin/view/adapters/TimeSlotsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lru/unicorn/ujin/view/adapters/TimeSlotsAdapter$ViewHolder;", "data", "", "Lru/unicorn/ujin/data/realm/TimeSlot;", "viewModel", "Lru/unicorn/ujin/viewModel/RealmViewModel;", "token", "", "profileViewModel", "Lru/unicorn/ujin/data/profile/ProfileViewModel;", "listener", "Lru/unicorn/ujin/view/adapters/TimeSlotsAdapter$TimeSlotsAdapterListener;", "(Ljava/util/List;Lru/unicorn/ujin/viewModel/RealmViewModel;Ljava/lang/String;Lru/unicorn/ujin/data/profile/ProfileViewModel;Lru/unicorn/ujin/view/adapters/TimeSlotsAdapter$TimeSlotsAdapterListener;)V", "context", "Landroid/content/Context;", "currentPosition", "", "getCurrentPosition", "()I", "setCurrentPosition", "(I)V", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "date", "Ljava/util/Date;", "getDate", "()Ljava/util/Date;", "setDate", "(Ljava/util/Date;)V", "mMessage", "mTimeSlot", "profileLocalRepository", "Lru/unicorn/ujin/data/profile/repository/ProfileLocalRepository;", "getProfileViewModel", "()Lru/unicorn/ujin/data/profile/ProfileViewModel;", "setProfileViewModel", "(Lru/unicorn/ujin/data/profile/ProfileViewModel;)V", "reservedDate", "getReservedDate", "()Ljava/lang/String;", "setReservedDate", "(Ljava/lang/String;)V", "reservedWindowId", "getReservedWindowId", "setReservedWindowId", "reservedWindowList", "", "getReservedWindowList", "setReservedWindowList", "selectedPosition", "getSelectedPosition", "setSelectedPosition", "getToken", "setToken", "userName", "userPhone", "userSurname", "getViewModel", "()Lru/unicorn/ujin/viewModel/RealmViewModel;", "setViewModel", "(Lru/unicorn/ujin/viewModel/RealmViewModel;)V", "askUserToEnterName", "", "getItem", "position", "getItemCount", "getUserInfoData", "Lru/unicorn/ujin/view/dialogs/dataEntry/EditField;", "handleEvent", "updateEvent", "Lru/unicorn/ujin/viewModel/events/ProfileUpdateEvent;", "handleSave", "dialog", "Lru/unicorn/ujin/view/dialogs/dataEntry/DataEntryDialog;", "markAvailableView", "view", "Landroid/view/View;", "markDisableView", "markReservedView", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "showConfirmationDialog", "message", "title", "showEnabledTimeMessage", "showMessage", "updateItem", "item", "Companion", "TimeSlotsAdapterListener", "ViewHolder", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.adapters.TimeSlotsAdapter */
/* compiled from: TimeSlotsAdapter.kt */
public final class TimeSlotsAdapter extends RecyclerView.Adapter<ViewHolder> {
    public static final String AVAILABLE = "available";
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String DISABLED = "disable";
    public static final String RESERVED = "reserve";
    /* access modifiers changed from: private */
    public Context context;
    private int currentPosition = -1;
    private List<TimeSlot> data;
    public Date date;
    /* access modifiers changed from: private */
    public final TimeSlotsAdapterListener listener;
    /* access modifiers changed from: private */
    public String mMessage = "";
    /* access modifiers changed from: private */
    public TimeSlot mTimeSlot = new TimeSlot((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public final ProfileLocalRepository profileLocalRepository = ProfileLocalRepository.Companion.getInstance();
    private ProfileViewModel profileViewModel;
    private String reservedDate;
    private String reservedWindowId;
    private List<String> reservedWindowList;
    private int selectedPosition = -1;
    private String token;
    /* access modifiers changed from: private */
    public String userName = "";
    /* access modifiers changed from: private */
    public String userPhone = "";
    /* access modifiers changed from: private */
    public String userSurname = "";
    private RealmViewModel viewModel;

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, mo51343d2 = {"Lru/unicorn/ujin/view/adapters/TimeSlotsAdapter$TimeSlotsAdapterListener;", "", "onStateChanged", "", "position", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.adapters.TimeSlotsAdapter$TimeSlotsAdapterListener */
    /* compiled from: TimeSlotsAdapter.kt */
    public interface TimeSlotsAdapterListener {
        void onStateChanged(int i);
    }

    public TimeSlotsAdapter(List<TimeSlot> list, RealmViewModel realmViewModel, String str, ProfileViewModel profileViewModel2, TimeSlotsAdapterListener timeSlotsAdapterListener) {
        Intrinsics.checkNotNullParameter(list, "data");
        Intrinsics.checkNotNullParameter(realmViewModel, "viewModel");
        Intrinsics.checkNotNullParameter(str, "token");
        Intrinsics.checkNotNullParameter(profileViewModel2, "profileViewModel");
        Intrinsics.checkNotNullParameter(timeSlotsAdapterListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.data = list;
        this.viewModel = realmViewModel;
        this.token = str;
        this.profileViewModel = profileViewModel2;
        this.listener = timeSlotsAdapterListener;
    }

    public static final /* synthetic */ Context access$getContext$p(TimeSlotsAdapter timeSlotsAdapter) {
        Context context2 = timeSlotsAdapter.context;
        if (context2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
        }
        return context2;
    }

    public final List<TimeSlot> getData() {
        return this.data;
    }

    public final ProfileViewModel getProfileViewModel() {
        return this.profileViewModel;
    }

    public final String getToken() {
        return this.token;
    }

    public final RealmViewModel getViewModel() {
        return this.viewModel;
    }

    public final void setData(List<TimeSlot> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.data = list;
    }

    public final void setProfileViewModel(ProfileViewModel profileViewModel2) {
        Intrinsics.checkNotNullParameter(profileViewModel2, "<set-?>");
        this.profileViewModel = profileViewModel2;
    }

    public final void setToken(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.token = str;
    }

    public final void setViewModel(RealmViewModel realmViewModel) {
        Intrinsics.checkNotNullParameter(realmViewModel, "<set-?>");
        this.viewModel = realmViewModel;
    }

    public final Date getDate() {
        Date date2 = this.date;
        if (date2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("date");
        }
        return date2;
    }

    public final void setDate(Date date2) {
        Intrinsics.checkNotNullParameter(date2, "<set-?>");
        this.date = date2;
    }

    public final String getReservedDate() {
        return this.reservedDate;
    }

    public final void setReservedDate(String str) {
        this.reservedDate = str;
    }

    public final String getReservedWindowId() {
        return this.reservedWindowId;
    }

    public final void setReservedWindowId(String str) {
        this.reservedWindowId = str;
    }

    public final List<String> getReservedWindowList() {
        return this.reservedWindowList;
    }

    public final void setReservedWindowList(List<String> list) {
        this.reservedWindowList = list;
    }

    public final int getCurrentPosition() {
        return this.currentPosition;
    }

    public final void setCurrentPosition(int i) {
        this.currentPosition = i;
    }

    public final int getSelectedPosition() {
        return this.selectedPosition;
    }

    public final void setSelectedPosition(int i) {
        this.selectedPosition = i;
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, CategoryItem.Fields.parent);
        Context context2 = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "parent.context");
        this.context = context2;
        Context context3 = this.context;
        if (context3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
        }
        View inflate = LayoutInflater.from(context3).inflate(R.layout.item_time_slot, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "LayoutInflater.from(cont…time_slot, parent, false)");
        return new ViewHolder(this, inflate);
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "holder");
        viewHolder.bind(i);
    }

    public int getItemCount() {
        return this.data.size();
    }

    public final void updateItem(int i, TimeSlot timeSlot) {
        Intrinsics.checkNotNullParameter(timeSlot, "item");
        this.data.set(i, timeSlot);
        notifyItemChanged(i);
    }

    public final TimeSlot getItem(int i) {
        return this.data.get(i);
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, mo51343d2 = {"Lru/unicorn/ujin/view/adapters/TimeSlotsAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lru/unicorn/ujin/view/adapters/TimeSlotsAdapter;Landroid/view/View;)V", "bind", "", "position", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.adapters.TimeSlotsAdapter$ViewHolder */
    /* compiled from: TimeSlotsAdapter.kt */
    public final class ViewHolder extends RecyclerView.ViewHolder {
        final /* synthetic */ TimeSlotsAdapter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(TimeSlotsAdapter timeSlotsAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "itemView");
            this.this$0 = timeSlotsAdapter;
        }

        public final void bind(int i) {
            List<String> reservedWindowList;
            List<String> reservedWindowList2;
            List<String> reservedWindowList3;
            TimeSlot timeSlot = this.this$0.getData().get(i);
            View view = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "itemView");
            DynamicBackgroundButton dynamicBackgroundButton = (DynamicBackgroundButton) view.findViewById(C5619R.C5622id.timeSlotButton);
            Intrinsics.checkNotNullExpressionValue(dynamicBackgroundButton, "itemView.timeSlotButton");
            dynamicBackgroundButton.setText(timeSlot.getStartTime() + " - " + timeSlot.getEndTime());
            String state = timeSlot.getState();
            if (state != null) {
                int hashCode = state.hashCode();
                if (hashCode != -733902135) {
                    if (hashCode != 1097075900) {
                        if (hashCode != 1671308008 || !state.equals(TimeSlotsAdapter.DISABLED)) {
                            return;
                        }
                        if (Intrinsics.areEqual((Object) timeSlot.getId(), (Object) this.this$0.getReservedWindowId()) || ((reservedWindowList3 = this.this$0.getReservedWindowList()) != null && CollectionsKt.contains(reservedWindowList3, timeSlot.getId()))) {
                            this.this$0.setCurrentPosition(i);
                            TimeSlotsAdapter timeSlotsAdapter = this.this$0;
                            View view2 = this.itemView;
                            Intrinsics.checkNotNullExpressionValue(view2, "itemView");
                            timeSlotsAdapter.markReservedView(view2);
                            View view3 = this.itemView;
                            Intrinsics.checkNotNullExpressionValue(view3, "itemView");
                            ((DynamicBackgroundButton) view3.findViewById(C5619R.C5622id.timeSlotButton)).setOnClickListener(new TimeSlotsAdapter$ViewHolder$bind$5(this, i));
                            return;
                        }
                        TimeSlotsAdapter timeSlotsAdapter2 = this.this$0;
                        View view4 = this.itemView;
                        Intrinsics.checkNotNullExpressionValue(view4, "itemView");
                        timeSlotsAdapter2.markDisableView(view4);
                        View view5 = this.itemView;
                        Intrinsics.checkNotNullExpressionValue(view5, "itemView");
                        ((DynamicBackgroundButton) view5.findViewById(C5619R.C5622id.timeSlotButton)).setOnClickListener(new TimeSlotsAdapter$ViewHolder$bind$6(this));
                    } else if (!state.equals(TimeSlotsAdapter.RESERVED)) {
                    } else {
                        if (Intrinsics.areEqual((Object) timeSlot.getId(), (Object) this.this$0.getReservedWindowId()) || ((reservedWindowList2 = this.this$0.getReservedWindowList()) != null && CollectionsKt.contains(reservedWindowList2, timeSlot.getId()))) {
                            this.this$0.setCurrentPosition(i);
                            TimeSlotsAdapter timeSlotsAdapter3 = this.this$0;
                            View view6 = this.itemView;
                            Intrinsics.checkNotNullExpressionValue(view6, "itemView");
                            timeSlotsAdapter3.markReservedView(view6);
                            View view7 = this.itemView;
                            Intrinsics.checkNotNullExpressionValue(view7, "itemView");
                            ((DynamicBackgroundButton) view7.findViewById(C5619R.C5622id.timeSlotButton)).setOnClickListener(new TimeSlotsAdapter$ViewHolder$bind$3(this, i));
                            return;
                        }
                        TimeSlotsAdapter timeSlotsAdapter4 = this.this$0;
                        View view8 = this.itemView;
                        Intrinsics.checkNotNullExpressionValue(view8, "itemView");
                        timeSlotsAdapter4.markDisableView(view8);
                        View view9 = this.itemView;
                        Intrinsics.checkNotNullExpressionValue(view9, "itemView");
                        ((DynamicBackgroundButton) view9.findViewById(C5619R.C5622id.timeSlotButton)).setOnClickListener(new TimeSlotsAdapter$ViewHolder$bind$4(this));
                    }
                } else if (!state.equals("available")) {
                } else {
                    if (Intrinsics.areEqual((Object) timeSlot.getId(), (Object) this.this$0.getReservedWindowId()) || ((reservedWindowList = this.this$0.getReservedWindowList()) != null && CollectionsKt.contains(reservedWindowList, timeSlot.getId()))) {
                        this.this$0.setCurrentPosition(i);
                        TimeSlotsAdapter timeSlotsAdapter5 = this.this$0;
                        View view10 = this.itemView;
                        Intrinsics.checkNotNullExpressionValue(view10, "itemView");
                        timeSlotsAdapter5.markReservedView(view10);
                        View view11 = this.itemView;
                        Intrinsics.checkNotNullExpressionValue(view11, "itemView");
                        ((DynamicBackgroundButton) view11.findViewById(C5619R.C5622id.timeSlotButton)).setOnClickListener(new TimeSlotsAdapter$ViewHolder$bind$1(this, i));
                        return;
                    }
                    TimeSlotsAdapter timeSlotsAdapter6 = this.this$0;
                    View view12 = this.itemView;
                    Intrinsics.checkNotNullExpressionValue(view12, "itemView");
                    timeSlotsAdapter6.markAvailableView(view12);
                    View view13 = this.itemView;
                    Intrinsics.checkNotNullExpressionValue(view13, "itemView");
                    ((DynamicBackgroundButton) view13.findViewById(C5619R.C5622id.timeSlotButton)).setOnClickListener(new TimeSlotsAdapter$ViewHolder$bind$2(this, timeSlot, i));
                }
            }
        }
    }

    public final void handleEvent(ProfileUpdateEvent profileUpdateEvent) {
        if (profileUpdateEvent == null) {
            return;
        }
        if (profileUpdateEvent.getSuccess()) {
            int i = this.selectedPosition;
            String str = this.mMessage;
            Context context2 = this.context;
            if (context2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("context");
            }
            String string = context2.getResources().getString(R.string.confirm_acceptance);
            Intrinsics.checkNotNullExpressionValue(string, "context.resources.getStr…tring.confirm_acceptance)");
            showConfirmationDialog(i, str, string);
            this.profileViewModel.requestUser();
            return;
        }
        showMessage(profileUpdateEvent.getMessage());
    }

    /* access modifiers changed from: private */
    public final void askUserToEnterName() {
        SingleLiveEvent<ProfileUpdateEvent> profileUpdateMutableLiveData = this.viewModel.getProfileUpdateMutableLiveData();
        Context context2 = this.context;
        if (context2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
        }
        if (context2 != null) {
            profileUpdateMutableLiveData.observe((BaseActivity) context2, new TimeSlotsAdapter$askUserToEnterName$1(this));
            DataEntryDialog newInstance = DataEntryDialog.Companion.newInstance((int) R.string.enterContactInfo, (List<? extends Field>) getUserInfoData(), (int) R.string.profileSave);
            newInstance.setLambdaSave(new TimeSlotsAdapter$askUserToEnterName$2(this, newInstance));
            Context context3 = this.context;
            if (context3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("context");
            }
            if (context3 != null) {
                newInstance.show(((BaseActivity) context3).getSupportFragmentManager(), "");
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type ru.unicorn.ujin.view.activity.BaseActivity");
        }
        throw new NullPointerException("null cannot be cast to non-null type ru.unicorn.ujin.view.activity.BaseActivity");
    }

    /* access modifiers changed from: private */
    public final void handleSave(DataEntryDialog dataEntryDialog) {
        User user = this.profileLocalRepository.getUser();
        Context context2 = this.context;
        if (context2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
        }
        if (context2 != null) {
            ((BaseActivity) context2).getViewModel().requestUpdateProfile(user.getToken(), dataEntryDialog.getValuesList()[1], dataEntryDialog.getValuesList()[0], (String) null, dataEntryDialog.getValuesList()[2], (String) null, (Integer) null, (String) null, (String) null, user.getBirthday());
            dataEntryDialog.dismiss();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type ru.unicorn.ujin.view.activity.BaseActivity");
    }

    private final List<EditField> getUserInfoData() {
        EditField[] editFieldArr = new EditField[3];
        Context context2 = this.context;
        if (context2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
        }
        EditField editField = new EditField("name", context2.getResources().getString(R.string.enterName), this.userName, "", (Function2) null, (Function1) null, 48, (DefaultConstructorMarker) null);
        editField.setName("name");
        editField.setRequired(true);
        Unit unit = Unit.INSTANCE;
        editFieldArr[0] = editField;
        Context context3 = this.context;
        if (context3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
        }
        EditField editField2 = new EditField("name", context3.getResources().getString(R.string.enterSurname), this.userSurname, "", (Function2) null, (Function1) null, 48, (DefaultConstructorMarker) null);
        editField2.setName("surname");
        editField2.setRequired(true);
        Unit unit2 = Unit.INSTANCE;
        editFieldArr[1] = editField2;
        Context context4 = this.context;
        if (context4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
        }
        EditField editField3 = new EditField("name", context4.getResources().getString(R.string.enterPhone), this.userPhone, "", (Function2) null, (Function1) null, 48, (DefaultConstructorMarker) null);
        editField3.setName("phone");
        editField3.setRequired(true);
        Unit unit3 = Unit.INSTANCE;
        editFieldArr[2] = editField3;
        return CollectionsKt.mutableListOf(editFieldArr);
    }

    /* access modifiers changed from: private */
    public final void showConfirmationDialog(int i, String str, String str2) {
        TimeSlot timeSlot = this.data.get(i);
        Context context2 = this.context;
        if (context2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(context2);
        AlertDialog.Builder message = builder.setTitle((CharSequence) str2).setMessage((CharSequence) str);
        Context context3 = this.context;
        if (context3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
        }
        AlertDialog.Builder positiveButton = message.setPositiveButton((CharSequence) context3.getResources().getString(R.string.confirm), (DialogInterface.OnClickListener) new TimeSlotsAdapter$showConfirmationDialog$1(this, i, timeSlot));
        Context context4 = this.context;
        if (context4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
        }
        positiveButton.setNegativeButton((CharSequence) context4.getResources().getString(R.string.button_cancel), (DialogInterface.OnClickListener) TimeSlotsAdapter$showConfirmationDialog$2.INSTANCE);
        builder.show();
    }

    private final void showMessage(String str) {
        Context context2 = this.context;
        if (context2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(context2);
        AlertDialog.Builder message = builder.setMessage((CharSequence) str);
        Context context3 = this.context;
        if (context3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
        }
        message.setPositiveButton((CharSequence) context3.getResources().getString(R.string.button_OK), (DialogInterface.OnClickListener) TimeSlotsAdapter$showMessage$1.INSTANCE);
        builder.show();
    }

    /* access modifiers changed from: private */
    public final void markReservedView(View view) {
        ((DynamicBackgroundButton) view.findViewById(C5619R.C5622id.timeSlotButton)).setType(DynamicBackgroundButton.Type.PRIMARY);
    }

    /* access modifiers changed from: private */
    public final void markAvailableView(View view) {
        ((DynamicBackgroundButton) view.findViewById(C5619R.C5622id.timeSlotButton)).setType(DynamicBackgroundButton.Type.OUTLINED);
    }

    /* access modifiers changed from: private */
    public final void markDisableView(View view) {
        ((DynamicBackgroundButton) view.findViewById(C5619R.C5622id.timeSlotButton)).setType(DynamicBackgroundButton.Type.OUTLINED);
    }

    /* access modifiers changed from: private */
    public final void showEnabledTimeMessage() {
        Context context2 = this.context;
        if (context2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
        }
        Context context3 = this.context;
        if (context3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
        }
        Toast.makeText(context2, context3.getResources().getString(R.string.enabledTimeMessage), 1).show();
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, mo51343d2 = {"Lru/unicorn/ujin/view/adapters/TimeSlotsAdapter$Companion;", "", "()V", "AVAILABLE", "", "DISABLED", "RESERVED", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.adapters.TimeSlotsAdapter$Companion */
    /* compiled from: TimeSlotsAdapter.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
