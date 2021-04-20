package p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my_team;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.util.TextUtils;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.MultiSection;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my_team.TeamMapper;
import p046io.reactivex.processors.PublishProcessor;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.profile_my_team.TeamProfileSection */
public class TeamProfileSection extends MultiSection<TeamMapper, ViewHolder> implements View.OnClickListener {
    private PublishProcessor<TeamMapper> specialClick = PublishProcessor.create();

    public int getLayoutId() {
        return R.layout.item_profile_team;
    }

    public PublishProcessor<TeamMapper> specialClicks() {
        return this.specialClick;
    }

    /* access modifiers changed from: protected */
    public ViewHolder createViewHolder(View view) {
        return new ViewHolder(view, this);
    }

    /* access modifiers changed from: protected */
    public void bindViewHolder(ViewHolder viewHolder, TeamMapper teamMapper, int i, List<Object> list) {
        String str;
        String str2;
        if (teamMapper.getFormat().equals(TeamMapper.Format.SIMPLE)) {
            viewHolder.label.setText(TextUtils.formatPhoneNumber(teamMapper.getPhone()));
            viewHolder.description.setVisibility(8);
            viewHolder.phone.setVisibility(8);
        } else if (teamMapper.getFormat().equals(TeamMapper.Format.FULL)) {
            TextView textView = viewHolder.label;
            if (StringUtils.isBlank(teamMapper.getFio())) {
                str = viewHolder.itemView.getResources().getString(R.string.undefined_name);
            } else {
                str = teamMapper.getFio();
            }
            textView.setText(str);
            TextView textView2 = viewHolder.description;
            if (StringUtils.isBlank(teamMapper.getPosition())) {
                str2 = viewHolder.itemView.getResources().getString(R.string.undefined_position);
            } else {
                str2 = teamMapper.getPosition();
            }
            textView2.setText(str2);
            viewHolder.phone.setText(TextUtils.formatPhoneNumber(teamMapper.getPhone()));
            viewHolder.description.setVisibility(0);
            viewHolder.phone.setVisibility(0);
        }
    }

    public void onClick(View view) {
        ViewHolder viewHolder = (ViewHolder) view.getTag();
        if (viewHolder != null) {
            this.specialClick.onNext((TeamMapper) getData(getAdapterPositionForViewHolder(viewHolder)));
        }
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.profile_my_team.TeamProfileSection$ViewHolder */
    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView description;
        TextView label;
        TextView phone;

        public ViewHolder(View view, View.OnClickListener onClickListener) {
            super(view);
            this.label = (TextView) view.findViewById(R.id.title);
            this.description = (TextView) view.findViewById(R.id.subtitle);
            this.phone = (TextView) view.findViewById(R.id.phone);
            view.setTag(this);
            view.setOnClickListener(onClickListener);
        }
    }
}
