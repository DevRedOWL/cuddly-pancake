package p035ru.unicorn.ujin.view.fragments.makearecord.sections;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.util.DateUtils;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.MultiSection;
import p035ru.unicorn.ujin.view.fragments.makearecord.model.OpenDatesIn;
import p059rx.subjects.PublishSubject;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u00012\u00020\u0004:\u0001 B\u0005¢\u0006\u0002\u0010\u0005J8\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0018\u00010\u0003R\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0016\u001a\u00020\u000b2\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018H\u0014J\u0018\u0010\u001a\u001a\b\u0018\u00010\u0003R\u00020\u00002\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0014J\b\u0010\u001d\u001a\u00020\u000bH\u0016J\u0012\u0010\u001e\u001a\u00020\u00132\b\u0010\u001f\u001a\u0004\u0018\u00010\u001cH\u0016R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\tR\u001a\u0010\r\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006!"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/makearecord/sections/DatesItemSection;", "Lru/unicorn/ujin/view/activity/navigation/adapter/sectionedadapter/MultiSection;", "Lru/unicorn/ujin/view/fragments/makearecord/model/OpenDatesIn;", "Lru/unicorn/ujin/view/fragments/makearecord/sections/DatesItemSection$ViewHolder;", "Landroid/view/View$OnClickListener;", "()V", "clickSubject", "Lrx/subjects/PublishSubject;", "getClickSubject", "()Lrx/subjects/PublishSubject;", "itemClickSubject", "", "getItemClickSubject", "selectedPosition", "getSelectedPosition", "()I", "setSelectedPosition", "(I)V", "bindViewHolder", "", "viewHolder", "data", "position", "payloads", "", "", "createViewHolder", "view", "Landroid/view/View;", "getLayoutId", "onClick", "v", "ViewHolder", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.makearecord.sections.DatesItemSection */
/* compiled from: DatesItemSection.kt */
public final class DatesItemSection extends MultiSection<OpenDatesIn, ViewHolder> implements View.OnClickListener {
    private final PublishSubject<OpenDatesIn> clickSubject;
    private final PublishSubject<Integer> itemClickSubject;
    private int selectedPosition;

    public int getLayoutId() {
        return R.layout.item_dates_cells;
    }

    public DatesItemSection() {
        PublishSubject<OpenDatesIn> create = PublishSubject.create();
        Intrinsics.checkNotNullExpressionValue(create, "PublishSubject.create()");
        this.clickSubject = create;
        PublishSubject<Integer> create2 = PublishSubject.create();
        Intrinsics.checkNotNullExpressionValue(create2, "PublishSubject.create()");
        this.itemClickSubject = create2;
    }

    public final PublishSubject<OpenDatesIn> getClickSubject() {
        return this.clickSubject;
    }

    public final PublishSubject<Integer> getItemClickSubject() {
        return this.itemClickSubject;
    }

    public final int getSelectedPosition() {
        return this.selectedPosition;
    }

    public final void setSelectedPosition(int i) {
        this.selectedPosition = i;
    }

    public void onClick(View view) {
        Object tag = view != null ? view.getTag() : null;
        if (tag != null) {
            int adapterPositionForViewHolder = getAdapterPositionForViewHolder((ViewHolder) tag);
            int i = this.selectedPosition;
            this.selectedPosition = adapterPositionForViewHolder;
            onItemChanged(i);
            onItemChanged(this.selectedPosition);
            this.itemClickSubject.onNext(Integer.valueOf(this.selectedPosition));
            this.clickSubject.onNext(getData(adapterPositionForViewHolder));
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type ru.unicorn.ujin.view.fragments.makearecord.sections.DatesItemSection.ViewHolder");
    }

    /* access modifiers changed from: protected */
    public ViewHolder createViewHolder(View view) {
        if (view != null) {
            return new ViewHolder(this, view, this);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void bindViewHolder(ViewHolder viewHolder, OpenDatesIn openDatesIn, int i, List<Object> list) {
        if (viewHolder != null) {
            viewHolder.bind(openDatesIn, i);
        }
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eJ\"\u0010\u0010\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u000e\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e¨\u0006\u0012"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/makearecord/sections/DatesItemSection$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "onClickListener", "Landroid/view/View$OnClickListener;", "(Lru/unicorn/ujin/view/fragments/makearecord/sections/DatesItemSection;Landroid/view/View;Landroid/view/View$OnClickListener;)V", "bind", "", "data", "Lru/unicorn/ujin/view/fragments/makearecord/model/OpenDatesIn;", "position", "", "parseDate", "", "date", "setItemBackground", "weekDay", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.makearecord.sections.DatesItemSection$ViewHolder */
    /* compiled from: DatesItemSection.kt */
    public final class ViewHolder extends RecyclerView.ViewHolder {
        final /* synthetic */ DatesItemSection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(DatesItemSection datesItemSection, View view, View.OnClickListener onClickListener) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "itemView");
            Intrinsics.checkNotNullParameter(onClickListener, "onClickListener");
            this.this$0 = datesItemSection;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            Resources system = Resources.getSystem();
            Intrinsics.checkNotNullExpressionValue(system, "Resources.getSystem()");
            layoutParams.width = system.getDisplayMetrics().widthPixels / 2;
            view.setTag(this);
            view.setOnClickListener(onClickListener);
        }

        public final void bind(OpenDatesIn openDatesIn, int i) {
            String str;
            String date;
            View view = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "itemView");
            TextView textView = (TextView) view.findViewById(C5619R.C5622id.title);
            Intrinsics.checkNotNullExpressionValue(textView, "itemView.title");
            String str2 = "";
            if (openDatesIn == null || (str = openDatesIn.getDate()) == null) {
                str = str2;
            }
            textView.setText(parseDate(str));
            View view2 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view2, "itemView");
            TextView textView2 = (TextView) view2.findViewById(C5619R.C5622id.state);
            Intrinsics.checkNotNullExpressionValue(textView2, "itemView.state");
            if (!(openDatesIn == null || (date = openDatesIn.getDate()) == null)) {
                str2 = date;
            }
            textView2.setText(weekDay(str2));
            View view3 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view3, "itemView");
            setItemBackground(openDatesIn, i, view3);
        }

        private final void setItemBackground(OpenDatesIn openDatesIn, int i, View view) {
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "itemView.context");
            int color = context.getResources().getColor(R.color.text_color_selected_date_top);
            int color2 = context.getResources().getColor(R.color.text_color_selected_date_bottom);
            int color3 = context.getResources().getColor(R.color.text_color_none_selected_date_top);
            int color4 = context.getResources().getColor(R.color.text_color_none_selected_date_bottom);
            if (this.this$0.getSelectedPosition() != i) {
                CardView cardView = (CardView) view.findViewById(C5619R.C5622id.f6509cl);
                Intrinsics.checkNotNullExpressionValue(cardView, "itemView.cl");
                cardView.setElevation(16.0f);
                ((TextView) view.findViewById(C5619R.C5622id.title)).setTextColor(color3);
                ((TextView) view.findViewById(C5619R.C5622id.state)).setTextColor(color4);
                ((CardView) view.findViewById(C5619R.C5622id.f6509cl)).setBackgroundResource(R.drawable.background_border_makearecord_date_inactive);
                return;
            }
            CardView cardView2 = (CardView) view.findViewById(C5619R.C5622id.f6509cl);
            Intrinsics.checkNotNullExpressionValue(cardView2, "itemView.cl");
            cardView2.setElevation(24.0f);
            ((TextView) view.findViewById(C5619R.C5622id.title)).setTextColor(color);
            ((TextView) view.findViewById(C5619R.C5622id.state)).setTextColor(color2);
            ((CardView) view.findViewById(C5619R.C5622id.f6509cl)).setBackgroundResource(R.drawable.background_border_makearecord_date_active);
        }

        public final String parseDate(String str) {
            Intrinsics.checkNotNullParameter(str, "date");
            try {
                Date formatDateFromString = DateUtils.formatDateFromString(str);
                Intrinsics.checkNotNullExpressionValue(formatDateFromString, "DateUtils.formatDateFromString(date)");
                String formatDateShortFromUnix = DateUtils.formatDateShortFromUnix(formatDateFromString.getTime());
                Intrinsics.checkNotNullExpressionValue(formatDateShortFromUnix, "DateUtils.formatDateShortFromUnix(dateAsLong)");
                return formatDateShortFromUnix;
            } catch (Exception unused) {
                return str;
            }
        }

        public final String weekDay(String str) {
            Intrinsics.checkNotNullParameter(str, "date");
            try {
                Date formatDateFromString = DateUtils.formatDateFromString(str);
                Intrinsics.checkNotNullExpressionValue(formatDateFromString, "DateUtils.formatDateFromString(date)");
                String displayNameFromTimeStamp = DateUtils.getDisplayNameFromTimeStamp(formatDateFromString.getTime());
                Intrinsics.checkNotNullExpressionValue(displayNameFromTimeStamp, "DateUtils.getDisplayNameFromTimeStamp(dateAsLong)");
                return displayNameFromTimeStamp;
            } catch (Exception unused) {
                return str;
            }
        }
    }
}
