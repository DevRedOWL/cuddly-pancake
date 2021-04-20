package p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kyleduo.switchbutton.SwitchButton;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.data.realm.marketplace.CategoryItem;
import p035ru.unicorn.ujin.util.TextUtils;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.RentCompany;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.Renters;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.UserCompany;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.UserData;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.UserProfile;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0003!\"#B3\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0006J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0016J\u0018\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0016H\u0016J\u0018\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0016H\u0016J\u0014\u0010\u001f\u001a\u00020\u00112\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00060\u0005R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/myrenta/RentEmployeeListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/widget/Filterable;", "data", "", "Lru/unicorn/ujin/view/activity/navigation/ui/myrenta/EmployeeDataType;", "renters", "", "Lru/unicorn/ujin/view/activity/navigation/ui/myrentatype/talkingroom/Renters;", "canManage", "", "listener", "Lru/unicorn/ujin/view/activity/navigation/ui/myrenta/RentEmployeeListAdapter$RentEmployeeListAdapterListener;", "(Ljava/util/List;Ljava/util/List;ZLru/unicorn/ujin/view/activity/navigation/ui/myrenta/RentEmployeeListAdapter$RentEmployeeListAdapterListener;)V", "dataFiltered", "addItem", "", "item", "getFilter", "Landroid/widget/Filter;", "getItemCount", "", "getItemViewType", "position", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setItems", "items", "ItemViewHolder", "RentEmployeeListAdapterListener", "TitleViewHolder", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentEmployeeListAdapter */
/* compiled from: RentEmployeeListAdapter.kt */
public final class RentEmployeeListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> implements Filterable {
    private final boolean canManage;
    /* access modifiers changed from: private */
    public List<EmployeeDataType> data;
    /* access modifiers changed from: private */
    public List<EmployeeDataType> dataFiltered = this.data;
    private final RentEmployeeListAdapterListener listener;
    private List<? extends Renters> renters;

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/myrenta/RentEmployeeListAdapter$RentEmployeeListAdapterListener;", "", "onOnCheckedChange", "", "employee", "Lru/unicorn/ujin/view/activity/navigation/ui/profile_my/kotlin/UserProfile;", "isChecked", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentEmployeeListAdapter$RentEmployeeListAdapterListener */
    /* compiled from: RentEmployeeListAdapter.kt */
    public interface RentEmployeeListAdapterListener {
        void onOnCheckedChange(UserProfile userProfile, boolean z);
    }

    public RentEmployeeListAdapter(List<EmployeeDataType> list, List<? extends Renters> list2, boolean z, RentEmployeeListAdapterListener rentEmployeeListAdapterListener) {
        Intrinsics.checkNotNullParameter(list, "data");
        Intrinsics.checkNotNullParameter(rentEmployeeListAdapterListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.data = list;
        this.renters = list2;
        this.canManage = z;
        this.listener = rentEmployeeListAdapterListener;
    }

    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, CategoryItem.Fields.parent);
        if (i != 0) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_profile_team_permission, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "LayoutInflater.from(pare…ermission, parent, false)");
            return new ItemViewHolder(inflate);
        }
        View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.enterprise_section, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate2, "LayoutInflater.from(pare…e_section, parent, false)");
        return new TitleViewHolder(inflate2);
    }

    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "holder");
        if (viewHolder.getItemViewType() != 0) {
            boolean z = i == this.dataFiltered.size() - 1 || (this.dataFiltered.get(i + 1) instanceof RentCompany);
            ItemViewHolder itemViewHolder = (ItemViewHolder) viewHolder;
            EmployeeDataType employeeDataType = this.dataFiltered.get(i);
            if (employeeDataType != null) {
                itemViewHolder.bind((UserProfile) employeeDataType, this.canManage, this.listener, this.renters, z);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type ru.unicorn.ujin.view.activity.navigation.ui.profile_my.kotlin.UserProfile");
        }
        TitleViewHolder titleViewHolder = (TitleViewHolder) viewHolder;
        EmployeeDataType employeeDataType2 = this.dataFiltered.get(i);
        if (employeeDataType2 != null) {
            titleViewHolder.bind((RentCompany) employeeDataType2);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type ru.unicorn.ujin.view.activity.navigation.ui.mycompany.RentCompany");
    }

    public int getItemViewType(int i) {
        return this.dataFiltered.get(i).getDataType();
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/myrenta/RentEmployeeListAdapter$TitleViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "bind", "", "item", "Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/RentCompany;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentEmployeeListAdapter$TitleViewHolder */
    /* compiled from: RentEmployeeListAdapter.kt */
    public static final class TitleViewHolder extends RecyclerView.ViewHolder {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public TitleViewHolder(View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "itemView");
        }

        public final void bind(RentCompany rentCompany) {
            Intrinsics.checkNotNullParameter(rentCompany, "item");
            View view = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "itemView");
            TextView textView = (TextView) view.findViewById(C5619R.C5622id.title);
            Intrinsics.checkNotNullExpressionValue(textView, "itemView.title");
            textView.setText(rentCompany.getTitle());
        }
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J6\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\nJ'\u0010\u0011\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eH\u0002¢\u0006\u0002\u0010\u0014¨\u0006\u0015"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/myrenta/RentEmployeeListAdapter$ItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "bind", "", "item", "Lru/unicorn/ujin/view/activity/navigation/ui/profile_my/kotlin/UserProfile;", "canManage", "", "listener", "Lru/unicorn/ujin/view/activity/navigation/ui/myrenta/RentEmployeeListAdapter$RentEmployeeListAdapterListener;", "renters", "", "Lru/unicorn/ujin/view/activity/navigation/ui/myrentatype/talkingroom/Renters;", "isLast", "hasInRenters", "id", "", "(Ljava/lang/Integer;Ljava/util/List;)Z", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentEmployeeListAdapter$ItemViewHolder */
    /* compiled from: RentEmployeeListAdapter.kt */
    public static final class ItemViewHolder extends RecyclerView.ViewHolder {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ItemViewHolder(View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "itemView");
        }

        public final void bind(UserProfile userProfile, boolean z, RentEmployeeListAdapterListener rentEmployeeListAdapterListener, List<? extends Renters> list, boolean z2) {
            CharSequence charSequence;
            CharSequence charSequence2;
            Intrinsics.checkNotNullParameter(userProfile, "item");
            Intrinsics.checkNotNullParameter(rentEmployeeListAdapterListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            View view = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "itemView");
            TextView textView = (TextView) view.findViewById(C5619R.C5622id.title);
            Intrinsics.checkNotNullExpressionValue(textView, "itemView.title");
            UserData userdata = userProfile.getUserdata();
            CharSequence fullname = userdata != null ? userdata.getFullname() : null;
            if (fullname == null || StringsKt.isBlank(fullname)) {
                View view2 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view2, "itemView");
                charSequence = view2.getResources().getString(R.string.undefined_name);
            } else {
                UserData userdata2 = userProfile.getUserdata();
                charSequence = userdata2 != null ? userdata2.getFullname() : null;
            }
            textView.setText(charSequence);
            View view3 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view3, "itemView");
            TextView textView2 = (TextView) view3.findViewById(C5619R.C5622id.subtitle);
            Intrinsics.checkNotNullExpressionValue(textView2, "itemView.subtitle");
            UserCompany position = userProfile.getPosition();
            CharSequence title = position != null ? position.getTitle() : null;
            if (title == null || StringsKt.isBlank(title)) {
                View view4 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view4, "itemView");
                charSequence2 = view4.getResources().getString(R.string.undefined_position);
            } else {
                UserCompany position2 = userProfile.getPosition();
                charSequence2 = position2 != null ? position2.getTitle() : null;
            }
            textView2.setText(charSequence2);
            UserData userdata3 = userProfile.getUserdata();
            CharSequence phone = userdata3 != null ? userdata3.getPhone() : null;
            if (phone == null || StringsKt.isBlank(phone)) {
                View view5 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view5, "itemView");
                TextView textView3 = (TextView) view5.findViewById(C5619R.C5622id.phone);
                Intrinsics.checkNotNullExpressionValue(textView3, "itemView.phone");
                View view6 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view6, "itemView");
                textView3.setText(view6.getResources().getString(R.string.undefined_phone));
            } else {
                View view7 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view7, "itemView");
                TextView textView4 = (TextView) view7.findViewById(C5619R.C5622id.phone);
                Intrinsics.checkNotNullExpressionValue(textView4, "itemView.phone");
                UserData userdata4 = userProfile.getUserdata();
                textView4.setText(TextUtils.formatPhoneNumber(userdata4 != null ? userdata4.getPhone() : null));
            }
            View view8 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view8, "itemView");
            ((SwitchButton) view8.findViewById(C5619R.C5622id.switchButton)).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
            View view9 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view9, "itemView");
            SwitchButton switchButton = (SwitchButton) view9.findViewById(C5619R.C5622id.switchButton);
            UserData userdata5 = userProfile.getUserdata();
            switchButton.setCheckedImmediately(hasInRenters(userdata5 != null ? userdata5.getId() : null, list));
            if (z) {
                View view10 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view10, "itemView");
                ((SwitchButton) view10.findViewById(C5619R.C5622id.switchButton)).setOnCheckedChangeListener(new RentEmployeeListAdapter$ItemViewHolder$bind$1(rentEmployeeListAdapterListener, userProfile));
                View view11 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view11, "itemView");
                SwitchButton switchButton2 = (SwitchButton) view11.findViewById(C5619R.C5622id.switchButton);
                Intrinsics.checkNotNullExpressionValue(switchButton2, "itemView.switchButton");
                switchButton2.setEnabled(true);
                View view12 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view12, "itemView");
                SwitchButton switchButton3 = (SwitchButton) view12.findViewById(C5619R.C5622id.switchButton);
                Intrinsics.checkNotNullExpressionValue(switchButton3, "itemView.switchButton");
                switchButton3.setFocusable(true);
            } else {
                View view13 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view13, "itemView");
                ((SwitchButton) view13.findViewById(C5619R.C5622id.switchButton)).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
                View view14 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view14, "itemView");
                SwitchButton switchButton4 = (SwitchButton) view14.findViewById(C5619R.C5622id.switchButton);
                Intrinsics.checkNotNullExpressionValue(switchButton4, "itemView.switchButton");
                switchButton4.setEnabled(false);
                View view15 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view15, "itemView");
                SwitchButton switchButton5 = (SwitchButton) view15.findViewById(C5619R.C5622id.switchButton);
                Intrinsics.checkNotNullExpressionValue(switchButton5, "itemView.switchButton");
                switchButton5.setFocusable(false);
            }
            if (z2) {
                View view16 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view16, "itemView");
                View findViewById = view16.findViewById(C5619R.C5622id.view4);
                View view17 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view17, "itemView");
                Context context = view17.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "itemView.context");
                findViewById.setBackgroundColor(context.getResources().getColor(R.color.transparent));
                return;
            }
            View view18 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view18, "itemView");
            View findViewById2 = view18.findViewById(C5619R.C5622id.view4);
            View view19 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view19, "itemView");
            Context context2 = view19.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "itemView.context");
            findViewById2.setBackgroundColor(context2.getResources().getColor(R.color.brandTextPrimary));
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x0013 A[Catch:{ Exception -> 0x0034 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final boolean hasInRenters(java.lang.Integer r6, java.util.List<? extends p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.Renters> r7) {
            /*
                r5 = this;
                r0 = 0
                r1 = r7
                java.util.Collection r1 = (java.util.Collection) r1     // Catch:{ Exception -> 0x0034 }
                r2 = 1
                if (r1 == 0) goto L_0x0010
                boolean r1 = r1.isEmpty()     // Catch:{ Exception -> 0x0034 }
                if (r1 == 0) goto L_0x000e
                goto L_0x0010
            L_0x000e:
                r1 = 0
                goto L_0x0011
            L_0x0010:
                r1 = 1
            L_0x0011:
                if (r1 != 0) goto L_0x0034
                if (r6 != 0) goto L_0x0016
                goto L_0x0034
            L_0x0016:
                r1 = r7
                java.util.Collection r1 = (java.util.Collection) r1     // Catch:{ Exception -> 0x0034 }
                int r1 = r1.size()     // Catch:{ Exception -> 0x0034 }
                r3 = 0
            L_0x001e:
                if (r3 >= r1) goto L_0x0034
                java.lang.Object r4 = r7.get(r3)     // Catch:{ Exception -> 0x0034 }
                ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.Renters r4 = (p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.Renters) r4     // Catch:{ Exception -> 0x0034 }
                java.lang.Integer r4 = r4.getUserdataId()     // Catch:{ Exception -> 0x0034 }
                boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r6)     // Catch:{ Exception -> 0x0034 }
                if (r4 == 0) goto L_0x0031
                return r2
            L_0x0031:
                int r3 = r3 + 1
                goto L_0x001e
            L_0x0034:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentEmployeeListAdapter.ItemViewHolder.hasInRenters(java.lang.Integer, java.util.List):boolean");
        }
    }

    public int getItemCount() {
        return this.dataFiltered.size();
    }

    public final void setItems(List<EmployeeDataType> list) {
        Intrinsics.checkNotNullParameter(list, FirebaseAnalytics.Param.ITEMS);
        this.data = list;
        notifyDataSetChanged();
    }

    public final void addItem(EmployeeDataType employeeDataType) {
        Intrinsics.checkNotNullParameter(employeeDataType, "item");
        this.data.add(employeeDataType);
        notifyItemInserted(getItemCount() - 1);
    }

    public Filter getFilter() {
        return new RentEmployeeListAdapter$getFilter$1(this);
    }
}
