package p035ru.unicorn.ujin.view.activity.navigation.p058ui.card;

import android.graphics.PorterDuff;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.data.realm.CardData;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.MultiSection;
import p035ru.unicorn.ujin.view.activity.navigation.repository.RemoteRepository;
import p046io.reactivex.processors.PublishProcessor;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.card.CardListSection */
public class CardListSection extends MultiSection<CardData, ViewHolder> implements View.OnClickListener {
    private SimpleDateFormat dateFormatEnd = new SimpleDateFormat("до dd.MM.yyyy", Locale.getDefault());
    private SimpleDateFormat dateFormatStart = new SimpleDateFormat("c dd.MM.yyyy", Locale.getDefault());
    private PublishProcessor<CardData> simpleClick = PublishProcessor.create();

    public int getLayoutId() {
        return R.layout.item_list_card;
    }

    public PublishProcessor<CardData> simpleClicks() {
        return this.simpleClick;
    }

    /* access modifiers changed from: protected */
    public void bindViewHolder(ViewHolder viewHolder, CardData cardData, int i, List<Object> list) {
        TextView textView = viewHolder.title;
        textView.setText("Пропуск №" + cardData.getId());
        viewHolder.icon.setImageResource(cardData.getType().equals(RemoteRepository.GUEST) ? R.drawable.ic_svg_guest : R.drawable.ic_svg_vehicle);
        viewHolder.icon.setColorFilter(viewHolder.icon.getResources().getColor(R.color.brandAppSchemaIconColor), PorterDuff.Mode.SRC_ATOP);
        if (new Date().getTime() / 1000 < cardData.getDateStart()) {
            TextView textView2 = viewHolder.date;
            textView2.setText(this.dateFormatStart.format(new Date(cardData.getDateStart() * 1000)) + "\n" + this.dateFormatEnd.format(new Date(cardData.getDateEnd() * 1000)));
            return;
        }
        viewHolder.date.setText(this.dateFormatEnd.format(new Date(cardData.getDateEnd() * 1000)));
    }

    /* access modifiers changed from: protected */
    public ViewHolder createViewHolder(View view) {
        return new ViewHolder(view, this);
    }

    public void onClick(View view) {
        view.getId();
        actionCard(view);
    }

    private void actionCard(View view) {
        ViewHolder viewHolder = (ViewHolder) view.getTag();
        if (viewHolder != null) {
            CardData cardData = (CardData) getData(getAdapterPositionForViewHolder(viewHolder));
            cardData.setViewId(Integer.valueOf(view.getId()));
            this.simpleClick.onNext(cardData);
        }
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.card.CardListSection$ViewHolder */
    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView date;
        ImageView delete;
        ImageView icon;
        TextView title;

        public ViewHolder(View view, View.OnClickListener onClickListener) {
            super(view);
            this.icon = (ImageView) view.findViewById(R.id.icon);
            this.title = (TextView) view.findViewById(R.id.title);
            this.date = (TextView) view.findViewById(R.id.date);
            this.delete = (ImageView) view.findViewById(R.id.delete_card);
            this.delete.setTag(this);
            this.delete.setOnClickListener(onClickListener);
            this.title.setTag(this);
            this.title.setOnClickListener(onClickListener);
            view.setTag(this);
            view.setOnClickListener(onClickListener);
        }
    }
}
