package p035ru.unicorn.ujin.view.activity.navigation.p058ui.mainsmart.section;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import java.util.List;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.MultiSection;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.mainsmart.section.ProblemSection */
public class ProblemSection extends MultiSection<MoreIconsInfo, ViewHolder> implements View.OnClickListener {
    public int getLayoutId() {
        return R.layout.error_item;
    }

    /* access modifiers changed from: protected */
    public void bindViewHolder(ViewHolder viewHolder, MoreIconsInfo moreIconsInfo, int i, List<Object> list) {
        viewHolder.error.setText(moreIconsInfo.getTitle() + " , " + moreIconsInfo.getState());
        viewHolder.error.setCompoundDrawables(AppCompatResources.getDrawable(viewHolder.error.getContext(), R.drawable.ic_svg_plug_device), (Drawable) null, (Drawable) null, (Drawable) null);
    }

    /* access modifiers changed from: protected */
    public ViewHolder createViewHolder(View view) {
        return new ViewHolder(view, this);
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.mainsmart.section.ProblemSection$ViewHolder */
    public static class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(2131363948)
        TextView error = ((TextView) this.itemView.findViewById(R.id.tv_error));

        public ViewHolder(View view, View.OnClickListener onClickListener) {
            super(view);
            ButterKnife.bind((Object) this, view);
        }
    }

    public void onClick(View view) {
        if (!(view.getTag() instanceof ViewHolder) || getAdapterPositionForViewHolder((ViewHolder) view.getTag()) == -1) {
        }
    }
}
