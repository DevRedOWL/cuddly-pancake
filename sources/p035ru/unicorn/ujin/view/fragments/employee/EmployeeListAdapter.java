package p035ru.unicorn.ujin.view.fragments.employee;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.data.realm.marketplace.CategoryItem;
import p035ru.unicorn.ujin.util.AppUtils;
import p035ru.unicorn.ujin.util.TextUtils;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.UserCompany;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.UserData;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.UserProfile;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\n\u0012\b\u0018\u00010\u0002R\u00020\u00000\u00012\u00020\u0003:\u0002\u0019\u001aB#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u001c\u0010\u0011\u001a\u00020\u00122\n\u0010\u0013\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0010H\u0016J\u001c\u0010\u0015\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0010H\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/employee/EmployeeListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lru/unicorn/ujin/view/fragments/employee/EmployeeListAdapter$ViewHolder;", "Landroid/widget/Filterable;", "employeeList", "", "Lru/unicorn/ujin/view/activity/navigation/ui/profile_my/kotlin/UserProfile;", "mode", "", "listener", "Lru/unicorn/ujin/view/fragments/employee/EmployeeListAdapter$EmployeeListAdapterListener;", "(Ljava/util/List;Ljava/lang/String;Lru/unicorn/ujin/view/fragments/employee/EmployeeListAdapter$EmployeeListAdapterListener;)V", "employeeListFiltered", "getFilter", "Landroid/widget/Filter;", "getItemCount", "", "onBindViewHolder", "", "vh", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "EmployeeListAdapterListener", "ViewHolder", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.employee.EmployeeListAdapter */
/* compiled from: EmployeeListAdapter.kt */
public final class EmployeeListAdapter extends RecyclerView.Adapter<ViewHolder> implements Filterable {
    /* access modifiers changed from: private */
    public final List<UserProfile> employeeList;
    /* access modifiers changed from: private */
    public List<? extends UserProfile> employeeListFiltered = this.employeeList;
    /* access modifiers changed from: private */
    public final EmployeeListAdapterListener listener;
    /* access modifiers changed from: private */
    public String mode;

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0007"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/employee/EmployeeListAdapter$EmployeeListAdapterListener;", "", "onEmployeeRemoved", "", "employee", "Lru/unicorn/ujin/view/activity/navigation/ui/profile_my/kotlin/UserProfile;", "onEmployeeSelected", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.employee.EmployeeListAdapter$EmployeeListAdapterListener */
    /* compiled from: EmployeeListAdapter.kt */
    public interface EmployeeListAdapterListener {
        void onEmployeeRemoved(UserProfile userProfile);

        void onEmployeeSelected(UserProfile userProfile);
    }

    public EmployeeListAdapter(List<? extends UserProfile> list, String str, EmployeeListAdapterListener employeeListAdapterListener) {
        Intrinsics.checkNotNullParameter(list, "employeeList");
        Intrinsics.checkNotNullParameter(str, "mode");
        Intrinsics.checkNotNullParameter(employeeListAdapterListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.employeeList = list;
        this.mode = str;
        this.listener = employeeListAdapterListener;
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/employee/EmployeeListAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lru/unicorn/ujin/view/fragments/employee/EmployeeListAdapter;Landroid/view/View;)V", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.employee.EmployeeListAdapter$ViewHolder */
    /* compiled from: EmployeeListAdapter.kt */
    public final class ViewHolder extends RecyclerView.ViewHolder {
        final /* synthetic */ EmployeeListAdapter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(EmployeeListAdapter employeeListAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.this$0 = employeeListAdapter;
            if (Intrinsics.areEqual((Object) employeeListAdapter.mode, (Object) EmployeeListFragment.COMPANY_EMPLOYEES)) {
                view.setOnClickListener(new View.OnClickListener(this) {
                    final /* synthetic */ ViewHolder this$0;

                    {
                        this.this$0 = r1;
                    }

                    public final void onClick(View view) {
                        this.this$0.this$0.listener.onEmployeeSelected((UserProfile) this.this$0.this$0.employeeListFiltered.get(this.this$0.getAdapterPosition()));
                    }
                });
            }
        }
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, CategoryItem.Fields.parent);
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_profile_team, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "LayoutInflater.from(pare…file_team, parent, false)");
        return new ViewHolder(this, inflate);
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        CharSequence charSequence;
        CharSequence charSequence2;
        Intrinsics.checkNotNullParameter(viewHolder, "vh");
        UserProfile userProfile = (UserProfile) this.employeeListFiltered.get(i);
        View view = viewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "vh.itemView");
        TextView textView = (TextView) view.findViewById(C5619R.C5622id.title);
        Intrinsics.checkNotNullExpressionValue(textView, "vh.itemView.title");
        UserData userdata = userProfile.getUserdata();
        String str = null;
        CharSequence fullname = userdata != null ? userdata.getFullname() : null;
        if (fullname == null || StringsKt.isBlank(fullname)) {
            View view2 = viewHolder.itemView;
            Intrinsics.checkNotNullExpressionValue(view2, "vh.itemView");
            charSequence = view2.getResources().getString(R.string.undefined_name);
        } else {
            UserData userdata2 = userProfile.getUserdata();
            charSequence = userdata2 != null ? userdata2.getFullname() : null;
        }
        textView.setText(charSequence);
        View view3 = viewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(view3, "vh.itemView");
        TextView textView2 = (TextView) view3.findViewById(C5619R.C5622id.subtitle);
        Intrinsics.checkNotNullExpressionValue(textView2, "vh.itemView.subtitle");
        UserCompany position = userProfile.getPosition();
        CharSequence title = position != null ? position.getTitle() : null;
        if (title == null || StringsKt.isBlank(title)) {
            View view4 = viewHolder.itemView;
            Intrinsics.checkNotNullExpressionValue(view4, "vh.itemView");
            charSequence2 = view4.getResources().getString(R.string.undefined_position);
        } else {
            UserCompany position2 = userProfile.getPosition();
            charSequence2 = position2 != null ? position2.getTitle() : null;
        }
        textView2.setText(charSequence2);
        UserData userdata3 = userProfile.getUserdata();
        CharSequence phone = userdata3 != null ? userdata3.getPhone() : null;
        if (phone == null || StringsKt.isBlank(phone)) {
            View view5 = viewHolder.itemView;
            Intrinsics.checkNotNullExpressionValue(view5, "vh.itemView");
            TextView textView3 = (TextView) view5.findViewById(C5619R.C5622id.phone);
            Intrinsics.checkNotNullExpressionValue(textView3, "vh.itemView.phone");
            View view6 = viewHolder.itemView;
            Intrinsics.checkNotNullExpressionValue(view6, "vh.itemView");
            textView3.setText(view6.getResources().getString(R.string.undefined_phone));
        } else {
            View view7 = viewHolder.itemView;
            Intrinsics.checkNotNullExpressionValue(view7, "vh.itemView");
            TextView textView4 = (TextView) view7.findViewById(C5619R.C5622id.phone);
            Intrinsics.checkNotNullExpressionValue(textView4, "vh.itemView.phone");
            UserData userdata4 = userProfile.getUserdata();
            if (userdata4 != null) {
                str = userdata4.getPhone();
            }
            textView4.setText(TextUtils.formatPhoneNumber(str));
        }
        View view8 = viewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(view8, "vh.itemView");
        TextView textView5 = (TextView) view8.findViewById(C5619R.C5622id.subtitle);
        Intrinsics.checkNotNullExpressionValue(textView5, "vh.itemView.subtitle");
        textView5.setVisibility(0);
        View view9 = viewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(view9, "vh.itemView");
        TextView textView6 = (TextView) view9.findViewById(C5619R.C5622id.phone);
        Intrinsics.checkNotNullExpressionValue(textView6, "vh.itemView.phone");
        textView6.setVisibility(0);
        if (Intrinsics.areEqual((Object) this.mode, (Object) EmployeeListFragment.COMPANY_EMPLOYEES)) {
            View view10 = viewHolder.itemView;
            Intrinsics.checkNotNullExpressionValue(view10, "vh.itemView");
            ImageView imageView = (ImageView) view10.findViewById(C5619R.C5622id.arrow);
            Intrinsics.checkNotNullExpressionValue(imageView, "vh.itemView.arrow");
            imageView.setVisibility(0);
            View view11 = viewHolder.itemView;
            Intrinsics.checkNotNullExpressionValue(view11, "vh.itemView");
            ImageView imageView2 = (ImageView) view11.findViewById(C5619R.C5622id.ivRemove);
            Intrinsics.checkNotNullExpressionValue(imageView2, "vh.itemView.ivRemove");
            imageView2.setVisibility(8);
            if (i == getItemCount() - 1) {
                View view12 = viewHolder.itemView;
                Intrinsics.checkNotNullExpressionValue(view12, "vh.itemView");
                ViewGroup.LayoutParams layoutParams = view12.getLayoutParams();
                if (layoutParams != null) {
                    View view13 = viewHolder.itemView;
                    Intrinsics.checkNotNullExpressionValue(view13, "vh.itemView");
                    ((RecyclerView.LayoutParams) layoutParams).bottomMargin = AppUtils.dpToPx(view13.getContext(), 70);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
            }
            View view14 = viewHolder.itemView;
            Intrinsics.checkNotNullExpressionValue(view14, "vh.itemView");
            ViewGroup.LayoutParams layoutParams2 = view14.getLayoutParams();
            if (layoutParams2 != null) {
                View view15 = viewHolder.itemView;
                Intrinsics.checkNotNullExpressionValue(view15, "vh.itemView");
                ((RecyclerView.LayoutParams) layoutParams2).bottomMargin = AppUtils.dpToPx(view15.getContext(), 0);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
        }
        View view16 = viewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(view16, "vh.itemView");
        ImageView imageView3 = (ImageView) view16.findViewById(C5619R.C5622id.arrow);
        Intrinsics.checkNotNullExpressionValue(imageView3, "vh.itemView.arrow");
        imageView3.setVisibility(8);
        View view17 = viewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(view17, "vh.itemView");
        ImageView imageView4 = (ImageView) view17.findViewById(C5619R.C5622id.ivRemove);
        imageView4.setVisibility(0);
        imageView4.setOnClickListener(new EmployeeListAdapter$onBindViewHolder$$inlined$apply$lambda$1(this, userProfile));
    }

    public int getItemCount() {
        return this.employeeListFiltered.size();
    }

    public Filter getFilter() {
        return new EmployeeListAdapter$getFilter$1(this);
    }
}
