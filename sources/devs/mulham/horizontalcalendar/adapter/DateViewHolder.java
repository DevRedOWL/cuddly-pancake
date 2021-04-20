package devs.mulham.horizontalcalendar.adapter;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import devs.mulham.horizontalcalendar.C4489R;

class DateViewHolder extends RecyclerView.ViewHolder {
    RecyclerView eventsRecyclerView;
    View layoutContent;
    View selectionView;
    TextView textBottom;
    TextView textMiddle;
    TextView textTop;

    DateViewHolder(View view) {
        super(view);
        this.textTop = (TextView) view.findViewById(C4489R.C4492id.hc_text_top);
        this.textMiddle = (TextView) view.findViewById(C4489R.C4492id.hc_text_middle);
        this.textBottom = (TextView) view.findViewById(C4489R.C4492id.hc_text_bottom);
        this.layoutContent = view.findViewById(C4489R.C4492id.hc_layoutContent);
        this.selectionView = view.findViewById(C4489R.C4492id.hc_selector);
        this.eventsRecyclerView = (RecyclerView) view.findViewById(C4489R.C4492id.hc_events_recyclerView);
    }
}
