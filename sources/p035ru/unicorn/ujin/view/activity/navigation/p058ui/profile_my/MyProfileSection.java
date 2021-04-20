package p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.MultiSection;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.card.CardFragment;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.ProfileFieldLabel;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.profile_my.MyProfileSection */
public class MyProfileSection extends MultiSection<FullProfileMapper, ViewHolder> {
    public int getLayoutId() {
        return R.layout.item_profile_my;
    }

    /* access modifiers changed from: protected */
    public void bindViewHolder(ViewHolder viewHolder, FullProfileMapper fullProfileMapper, int i, List<Object> list) {
        viewHolder.label.setText(viewHolder.itemView.getResources().getString(ProfileFieldLabel.Companion.getLabel(fullProfileMapper.getField())));
        if (!fullProfileMapper.getField().equals(CardFragment.ARG_NUMBER) || fullProfileMapper.getValue().length() < 8) {
            viewHolder.description.setText(fullProfileMapper.getValue());
            return;
        }
        String value = fullProfileMapper.getValue();
        viewHolder.description.setText(value.substring(0, 1) + " " + value.substring(1, 4) + " " + value.substring(4, 6) + " " + value.substring(6));
    }

    /* access modifiers changed from: protected */
    public ViewHolder createViewHolder(View view) {
        return new ViewHolder(view);
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.profile_my.MyProfileSection$ViewHolder */
    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView description;
        TextView label;

        public ViewHolder(View view) {
            super(view);
            this.label = (TextView) view.findViewById(R.id.title);
            this.description = (TextView) view.findViewById(R.id.subtitle);
        }
    }
}
