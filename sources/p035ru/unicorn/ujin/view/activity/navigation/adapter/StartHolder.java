package p035ru.unicorn.ujin.view.activity.navigation.adapter;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import p035ru.mysmartflat.kortros.R;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.adapter.StartHolder */
public class StartHolder extends BaseHolder {
    private Context context;
    @BindView(2131363481)
    TextView descr;
    @BindView(2131362679)
    ImageView icon;

    public StartHolder(View view, View.OnClickListener onClickListener) {
        super(view);
        this.descr = (TextView) view.findViewById(R.id.state);
        this.icon = (ImageView) view.findViewById(R.id.icon);
        view.setOnClickListener(onClickListener);
        view.setTag(this);
    }
}
