package p035ru.unicorn.ujin.view.fragments.makearecord.sections;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.MultiSection;
import p035ru.unicorn.ujin.view.fragments.makearecord.model.ScheduleCellsIn;
import p059rx.subjects.PublishSubject;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u00012\u00020\u0004:\u0001&B\u0005¢\u0006\u0002\u0010\u0005J8\u0010\u0016\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0018\u00010\u0003R\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u001a\u001a\u00020\u000b2\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cH\u0014J\u0018\u0010\u001e\u001a\b\u0018\u00010\u0003R\u00020\u00002\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0014J\b\u0010!\u001a\u00020\u000bH\u0016J\u0012\u0010\"\u001a\u00020\u00172\b\u0010#\u001a\u0004\u0018\u00010 H\u0016J\u000e\u0010$\u001a\u00020\u00172\u0006\u0010%\u001a\u00020\u0011R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006'"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/makearecord/sections/CellsItemSection;", "Lru/unicorn/ujin/view/activity/navigation/adapter/sectionedadapter/MultiSection;", "Lru/unicorn/ujin/view/fragments/makearecord/model/ScheduleCellsIn;", "Lru/unicorn/ujin/view/fragments/makearecord/sections/CellsItemSection$ViewHolder;", "Landroid/view/View$OnClickListener;", "()V", "clickSubject", "Lrx/subjects/PublishSubject;", "getClickSubject", "()Lrx/subjects/PublishSubject;", "selectedPosition", "", "getSelectedPosition", "()I", "setSelectedPosition", "(I)V", "stateLoading", "", "getStateLoading", "()Z", "setStateLoading", "(Z)V", "bindViewHolder", "", "viewHolder", "data", "position", "payloads", "", "", "createViewHolder", "view", "Landroid/view/View;", "getLayoutId", "onClick", "v", "shimmer", "show", "ViewHolder", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.makearecord.sections.CellsItemSection */
/* compiled from: CellsItemSection.kt */
public final class CellsItemSection extends MultiSection<ScheduleCellsIn, ViewHolder> implements View.OnClickListener {
    private final PublishSubject<ScheduleCellsIn> clickSubject;
    private int selectedPosition = -1;
    private boolean stateLoading = true;

    public int getLayoutId() {
        return R.layout.item_schedule_cells;
    }

    public CellsItemSection() {
        PublishSubject<ScheduleCellsIn> create = PublishSubject.create();
        Intrinsics.checkNotNullExpressionValue(create, "PublishSubject.create()");
        this.clickSubject = create;
    }

    public final PublishSubject<ScheduleCellsIn> getClickSubject() {
        return this.clickSubject;
    }

    public final int getSelectedPosition() {
        return this.selectedPosition;
    }

    public final void setSelectedPosition(int i) {
        this.selectedPosition = i;
    }

    public final boolean getStateLoading() {
        return this.stateLoading;
    }

    public final void setStateLoading(boolean z) {
        this.stateLoading = z;
    }

    public final void shimmer(boolean z) {
        this.stateLoading = z;
        List data = getData();
        onChanged(0, data != null ? data.size() : 10, (Object) null);
    }

    public void onClick(View view) {
        Object tag = view != null ? view.getTag() : null;
        if (tag != null) {
            int adapterPositionForViewHolder = getAdapterPositionForViewHolder((ViewHolder) tag);
            int i = this.selectedPosition;
            this.selectedPosition = adapterPositionForViewHolder;
            onItemChanged(i);
            onItemChanged(this.selectedPosition);
            this.clickSubject.onNext(getData(adapterPositionForViewHolder));
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type ru.unicorn.ujin.view.fragments.makearecord.sections.CellsItemSection.ViewHolder");
    }

    /* access modifiers changed from: protected */
    public ViewHolder createViewHolder(View view) {
        if (view != null) {
            return new ViewHolder(this, view, this);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void bindViewHolder(ViewHolder viewHolder, ScheduleCellsIn scheduleCellsIn, int i, List<Object> list) {
        CellsItemSection cellsItemSection = null;
        View view = viewHolder != null ? viewHolder.itemView : null;
        if (view != null) {
            ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) view;
            if (this.stateLoading) {
                shimmerFrameLayout.showShimmer(true);
                return;
            }
            shimmerFrameLayout.hideShimmer();
            viewHolder.bind(scheduleCellsIn, i);
            View view2 = viewHolder.itemView;
            if (scheduleCellsIn != null && scheduleCellsIn.isOpen()) {
                cellsItemSection = this;
            }
            view2.setOnClickListener(cellsItemSection);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.facebook.shimmer.ShimmerFrameLayout");
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fJ\"\u0010\r\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002¨\u0006\u000e"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/makearecord/sections/CellsItemSection$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "onClickListener", "Landroid/view/View$OnClickListener;", "(Lru/unicorn/ujin/view/fragments/makearecord/sections/CellsItemSection;Landroid/view/View;Landroid/view/View$OnClickListener;)V", "bind", "", "data", "Lru/unicorn/ujin/view/fragments/makearecord/model/ScheduleCellsIn;", "position", "", "setItemBackground", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.makearecord.sections.CellsItemSection$ViewHolder */
    /* compiled from: CellsItemSection.kt */
    public final class ViewHolder extends RecyclerView.ViewHolder {
        final /* synthetic */ CellsItemSection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(CellsItemSection cellsItemSection, View view, View.OnClickListener onClickListener) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "itemView");
            Intrinsics.checkNotNullParameter(onClickListener, "onClickListener");
            this.this$0 = cellsItemSection;
            view.setTag(this);
            view.setOnClickListener(onClickListener);
        }

        public final void bind(ScheduleCellsIn scheduleCellsIn, int i) {
            View view = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "itemView");
            CardView cardView = (CardView) view.findViewById(C5619R.C5622id.f6509cl);
            Intrinsics.checkNotNullExpressionValue(cardView, "itemView.cl");
            TextView textView = (TextView) cardView.findViewById(C5619R.C5622id.title);
            Intrinsics.checkNotNullExpressionValue(textView, "itemView.cl.title");
            textView.setText(scheduleCellsIn != null ? scheduleCellsIn.getTitle() : null);
            View view2 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view2, "itemView");
            CardView cardView2 = (CardView) view2.findViewById(C5619R.C5622id.f6509cl);
            Intrinsics.checkNotNullExpressionValue(cardView2, "itemView.cl");
            TextView textView2 = (TextView) cardView2.findViewById(C5619R.C5622id.state);
            Intrinsics.checkNotNullExpressionValue(textView2, "itemView.cl.state");
            textView2.setText((scheduleCellsIn == null || !scheduleCellsIn.isOpen()) ? "Занято" : "Свободно");
            View view3 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view3, "itemView");
            setItemBackground(scheduleCellsIn, i, view3);
        }

        private final void setItemBackground(ScheduleCellsIn scheduleCellsIn, int i, View view) {
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "itemView.context");
            int color = context.getResources().getColor(R.color.bg_date_none_selected);
            int color2 = context.getResources().getColor(R.color.text_record_top_selected);
            int color3 = context.getResources().getColor(R.color.text_record_bottom_selected);
            int color4 = context.getResources().getColor(R.color.text_record_top_busy);
            int color5 = context.getResources().getColor(R.color.text_record_bottom_busy);
            int color6 = context.getResources().getColor(R.color.text_record_top_free);
            int color7 = context.getResources().getColor(R.color.text_record_bottom_free);
            CardView cardView = (CardView) view.findViewById(C5619R.C5622id.f6509cl);
            Intrinsics.checkNotNullExpressionValue(cardView, "itemView.cl");
            cardView.setElevation(0.0f);
            if (this.this$0.getSelectedPosition() == i) {
                CardView cardView2 = (CardView) view.findViewById(C5619R.C5622id.f6509cl);
                Intrinsics.checkNotNullExpressionValue(cardView2, "itemView.cl");
                cardView2.setElevation(20.0f);
                color = context.getResources().getColor(R.color.bg_record_selected);
                ((TextView) view.findViewById(C5619R.C5622id.title)).setTextColor(color2);
                ((TextView) view.findViewById(C5619R.C5622id.state)).setTextColor(color3);
            } else if (scheduleCellsIn == null || !scheduleCellsIn.isOpen()) {
                ((TextView) view.findViewById(C5619R.C5622id.title)).setTextColor(color4);
                ((TextView) view.findViewById(C5619R.C5622id.state)).setTextColor(color5);
            } else {
                color = context.getResources().getColor(R.color.bg_record_free);
                ((TextView) view.findViewById(C5619R.C5622id.title)).setTextColor(color6);
                ((TextView) view.findViewById(C5619R.C5622id.state)).setTextColor(color7);
            }
            ((CardView) view.findViewById(C5619R.C5622id.f6509cl)).setCardBackgroundColor(color);
        }
    }
}
