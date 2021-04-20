package p035ru.unicorn.ujin.view.fragments.oss.response;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.data.realm.marketplace.CategoryItem;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.navigation.SmartNavFragment;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B'\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u000fH\u0016J\u0018\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000fH\u0016R\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/oss/response/OssListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lru/unicorn/ujin/view/fragments/oss/response/OssListAdapter$ViewHolder;", "ossList", "", "Lru/unicorn/ujin/view/fragments/oss/response/Oss;", "clickListener", "Lkotlin/Function1;", "", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "getClickListener", "()Lkotlin/jvm/functions/Function1;", "getOssList", "()Ljava/util/List;", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.oss.response.OssListAdapter */
/* compiled from: OssListAdapter.kt */
public final class OssListAdapter extends RecyclerView.Adapter<ViewHolder> {
    private final Function1<Oss, Unit> clickListener;
    private final List<Oss> ossList;

    public OssListAdapter(List<Oss> list, Function1<? super Oss, Unit> function1) {
        Intrinsics.checkNotNullParameter(list, "ossList");
        Intrinsics.checkNotNullParameter(function1, "clickListener");
        this.ossList = list;
        this.clickListener = function1;
    }

    public final Function1<Oss, Unit> getClickListener() {
        return this.clickListener;
    }

    public final List<Oss> getOssList() {
        return this.ossList;
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, CategoryItem.Fields.parent);
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_oss, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "LayoutInflater.from(pare….item_oss, parent, false)");
        return new ViewHolder(inflate);
    }

    public int getItemCount() {
        return this.ossList.size();
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "holder");
        viewHolder.bind(this.ossList.get(i));
        viewHolder.itemView.setOnClickListener(new OssListAdapter$onBindViewHolder$1(this, i));
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/oss/response/OssListAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "bind", "", "oss", "Lru/unicorn/ujin/view/fragments/oss/response/Oss;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.oss.response.OssListAdapter$ViewHolder */
    /* compiled from: OssListAdapter.kt */
    public static final class ViewHolder extends RecyclerView.ViewHolder {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "itemView");
        }

        public final void bind(Oss oss) {
            Intrinsics.checkNotNullParameter(oss, SmartNavFragment.OSS);
            View view = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "itemView");
            TextView textView = (TextView) view.findViewById(C5619R.C5622id.tvOssTitle);
            Intrinsics.checkNotNullExpressionValue(textView, "itemView.tvOssTitle");
            textView.setText(String.valueOf(oss.getTitle()));
            View view2 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view2, "itemView");
            TextView textView2 = (TextView) view2.findViewById(C5619R.C5622id.tvOssDescription);
            Intrinsics.checkNotNullExpressionValue(textView2, "itemView.tvOssDescription");
            textView2.setText(oss.getDescription());
            View view3 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view3, "itemView");
            TextView textView3 = (TextView) view3.findViewById(C5619R.C5622id.tvOssDateFrom);
            Intrinsics.checkNotNullExpressionValue(textView3, "itemView.tvOssDateFrom");
            textView3.setText(oss.getStartDate());
            if (!StringsKt.isBlank(oss.getEndDate())) {
                View view4 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view4, "itemView");
                TextView textView4 = (TextView) view4.findViewById(C5619R.C5622id.tvOssDateTo);
                Intrinsics.checkNotNullExpressionValue(textView4, "itemView.tvOssDateTo");
                View view5 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view5, "itemView");
                Context context = view5.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "itemView.context");
                textView4.setText(context.getResources().getString(R.string.label_date_to, new Object[]{oss.getEndDate()}));
            }
            View view6 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view6, "itemView");
            TextView textView5 = (TextView) view6.findViewById(C5619R.C5622id.tvOssStatus);
            Intrinsics.checkNotNullExpressionValue(textView5, "itemView.tvOssStatus");
            textView5.setText(oss.getStatusTitle());
            List listOf = CollectionsKt.listOf(Boolean.valueOf(oss.isVoted()), Boolean.valueOf(oss.isVerified()), oss.getStatus());
            if (Intrinsics.areEqual((Object) listOf, (Object) CollectionsKt.listOf(Boolean.valueOf(oss.isVoted()), Boolean.valueOf(oss.isVerified()), "canceled"))) {
                View view7 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view7, "itemView");
                ((TextView) view7.findViewById(C5619R.C5622id.tvOssStatus)).setTextColor(Color.parseColor("#ff0000"));
                return;
            }
            if (Intrinsics.areEqual((Object) listOf, (Object) CollectionsKt.listOf(false, false, "published"))) {
                View view8 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view8, "itemView");
                ((TextView) view8.findViewById(C5619R.C5622id.tvOssStatus)).setTextColor(Color.parseColor("#ff0000"));
                return;
            }
            if (Intrinsics.areEqual((Object) listOf, (Object) CollectionsKt.listOf(true, false, "published"))) {
                View view9 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view9, "itemView");
                ((TextView) view9.findViewById(C5619R.C5622id.tvOssStatus)).setTextColor(Color.parseColor("#ff0000"));
                return;
            }
            if (Intrinsics.areEqual((Object) listOf, (Object) CollectionsKt.listOf(true, true, "published"))) {
                View view10 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view10, "itemView");
                ((TextView) view10.findViewById(C5619R.C5622id.tvOssStatus)).setTextColor(Color.parseColor("#2158E4"));
                View view11 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view11, "itemView");
                AppCompatImageView appCompatImageView = (AppCompatImageView) view11.findViewById(C5619R.C5622id.ivCheck);
                appCompatImageView.setVisibility(0);
                appCompatImageView.setImageResource(R.drawable.icon_oss_check_saved);
                return;
            }
            if (Intrinsics.areEqual((Object) listOf, (Object) CollectionsKt.listOf(false, false, "closed_counting"))) {
                View view12 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view12, "itemView");
                View view13 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view13, "itemView");
                Context context2 = view13.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "itemView.context");
                ((TextView) view12.findViewById(C5619R.C5622id.tvOssStatus)).setTextColor(context2.getResources().getColor(R.color.brandTextSecondary));
                View view14 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view14, "itemView");
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) view14.findViewById(C5619R.C5622id.ivCheck);
                appCompatImageView2.setVisibility(0);
                appCompatImageView2.setImageResource(R.drawable.icon_oss_check_ended);
                return;
            }
            if (Intrinsics.areEqual((Object) listOf, (Object) CollectionsKt.listOf(true, true, "closed_counting"))) {
                View view15 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view15, "itemView");
                ((TextView) view15.findViewById(C5619R.C5622id.tvOssStatus)).setTextColor(Color.parseColor("#0CC108"));
                View view16 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view16, "itemView");
                AppCompatImageView appCompatImageView3 = (AppCompatImageView) view16.findViewById(C5619R.C5622id.ivCheck);
                appCompatImageView3.setVisibility(0);
                appCompatImageView3.setImageResource(R.drawable.icon_oss_check_ended_saved);
                return;
            }
            View view17 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view17, "itemView");
            View view18 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view18, "itemView");
            Context context3 = view18.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "itemView.context");
            ((TextView) view17.findViewById(C5619R.C5622id.tvOssStatus)).setTextColor(context3.getResources().getColor(R.color.brandTextSecondary));
        }
    }
}
