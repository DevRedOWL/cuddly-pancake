package p035ru.unicorn.ujin.view.activity.navigation.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import butterknife.BindView;
import p035ru.mysmartflat.kortros.R;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.adapter.SimpleHolder */
public class SimpleHolder extends BaseHolder {
    @BindView(2131363481)
    public TextView descr;
    @BindView(2131362679)
    public ImageView icon;
    public AppCompatImageView iconProvider;
    @BindView(2131363684)
    public TextView title;

    public SimpleHolder(View view, View.OnClickListener onClickListener) {
        super(view);
        this.title = (TextView) view.findViewById(R.id.title);
        this.descr = (TextView) view.findViewById(R.id.state);
        this.icon = (ImageView) view.findViewById(R.id.icon);
        this.iconProvider = (AppCompatImageView) view.findViewById(R.id.ivProvider);
        view.setOnClickListener(onClickListener);
        view.setTag(this);
    }
}
