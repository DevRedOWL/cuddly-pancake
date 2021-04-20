package p035ru.unicorn.ujin.view.fragments.profileselection.view.sections;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.SingleSection;
import p035ru.unicorn.ujin.view.fragments.profileselection.data.CityDTO;
import p046io.reactivex.subjects.PublishSubject;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u00012\u00020\u0004:\u0001\u001dB\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J.\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0018\u00010\u0003R\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00022\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013H\u0014J\u000e\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0006J\u0014\u0010\u0017\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0019H\u0014J\b\u0010\u001a\u001a\u00020\u0006H\u0016J\u0012\u0010\u001b\u001a\u00020\u000f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0019H\u0016R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001e"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/profileselection/view/sections/ChooseCitySection;", "Lru/unicorn/ujin/view/activity/navigation/adapter/sectionedadapter/SingleSection;", "Lru/unicorn/ujin/view/fragments/profileselection/data/CityDTO;", "Lru/unicorn/ujin/view/fragments/profileselection/view/sections/ChooseCitySection$ViewHolder;", "Landroid/view/View$OnClickListener;", "labelId", "", "(I)V", "itemClick", "Lio/reactivex/subjects/PublishSubject;", "getItemClick", "()Lio/reactivex/subjects/PublishSubject;", "getLabelId", "()I", "bindViewHolder", "", "vh", "data", "payloads", "", "", "chooseItem", "i", "createViewHolder", "view", "Landroid/view/View;", "getLayoutId", "onClick", "v", "ViewHolder", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.profileselection.view.sections.ChooseCitySection */
/* compiled from: ChooseCitySection.kt */
public final class ChooseCitySection extends SingleSection<CityDTO, ViewHolder> implements View.OnClickListener {
    private final PublishSubject<CityDTO> itemClick;
    private final int labelId;

    public final void chooseItem(int i) {
    }

    public int getLayoutId() {
        return R.layout.item_choose_city;
    }

    public final int getLabelId() {
        return this.labelId;
    }

    public ChooseCitySection(int i) {
        this.labelId = i;
        PublishSubject<CityDTO> create = PublishSubject.create();
        Intrinsics.checkNotNullExpressionValue(create, "PublishSubject.create()");
        this.itemClick = create;
    }

    public final PublishSubject<CityDTO> getItemClick() {
        return this.itemClick;
    }

    public void onClick(View view) {
        Object tag = view != null ? view.getTag() : null;
        if (tag != null) {
            getAdapterPositionForViewHolder((ViewHolder) tag);
            this.itemClick.onNext(getData());
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type ru.unicorn.ujin.view.fragments.profileselection.view.sections.ChooseCitySection.ViewHolder");
    }

    /* access modifiers changed from: protected */
    public ViewHolder createViewHolder(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        return new ViewHolder(this, view, this);
    }

    /* access modifiers changed from: protected */
    public void bindViewHolder(ViewHolder viewHolder, CityDTO cityDTO, List<Object> list) {
        Intrinsics.checkNotNullParameter(cityDTO, "data");
        if (viewHolder != null) {
            viewHolder.bind(cityDTO);
        }
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n¨\u0006\u000b"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/profileselection/view/sections/ChooseCitySection$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "onClickListener", "Landroid/view/View$OnClickListener;", "(Lru/unicorn/ujin/view/fragments/profileselection/view/sections/ChooseCitySection;Landroid/view/View;Landroid/view/View$OnClickListener;)V", "bind", "", "data", "Lru/unicorn/ujin/view/fragments/profileselection/data/CityDTO;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.profileselection.view.sections.ChooseCitySection$ViewHolder */
    /* compiled from: ChooseCitySection.kt */
    public final class ViewHolder extends RecyclerView.ViewHolder {
        final /* synthetic */ ChooseCitySection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(ChooseCitySection chooseCitySection, View view, View.OnClickListener onClickListener) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "itemView");
            Intrinsics.checkNotNullParameter(onClickListener, "onClickListener");
            this.this$0 = chooseCitySection;
            view.setOnClickListener(onClickListener);
            view.setTag(this);
        }

        public final void bind(CityDTO cityDTO) {
            View view = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "itemView");
            TextView textView = (TextView) view.findViewById(C5619R.C5622id.labelSection);
            Intrinsics.checkNotNullExpressionValue(textView, "itemView.labelSection");
            View view2 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view2, "itemView");
            textView.setText(view2.getResources().getString(this.this$0.getLabelId()));
            if (cityDTO == null || cityDTO.getId() != -1) {
                View view3 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view3, "itemView");
                TextView textView2 = (TextView) view3.findViewById(C5619R.C5622id.title);
                Intrinsics.checkNotNullExpressionValue(textView2, "itemView.title");
                textView2.setText(cityDTO != null ? cityDTO.getName() : null);
            } else {
                View view4 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view4, "itemView");
                TextView textView3 = (TextView) view4.findViewById(C5619R.C5622id.title);
                Intrinsics.checkNotNullExpressionValue(textView3, "itemView.title");
                View view5 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view5, "itemView");
                textView3.setText(view5.getContext().getString(R.string.choose));
            }
            View view6 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view6, "itemView");
            View view7 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view7, "itemView");
            Context context = view7.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "itemView.context");
            ((ImageView) view6.findViewById(C5619R.C5622id.arrow)).setColorFilter(context.getResources().getColor(R.color.tutorial_text_color));
        }
    }
}
