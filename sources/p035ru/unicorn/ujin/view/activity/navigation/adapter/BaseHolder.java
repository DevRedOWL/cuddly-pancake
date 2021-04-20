package p035ru.unicorn.ujin.view.activity.navigation.adapter;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.ButterKnife;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.adapter.BaseHolder */
public abstract class BaseHolder<T> extends RecyclerView.ViewHolder {
    Context context;

    public BaseHolder(View view) {
        super(view);
        ButterKnife.bind((Object) this, view);
        this.context = view.getContext();
    }
}
