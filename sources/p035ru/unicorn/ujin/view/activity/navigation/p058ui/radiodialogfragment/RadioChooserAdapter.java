package p035ru.unicorn.ujin.view.activity.navigation.p058ui.radiodialogfragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import butterknife.BindView;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.BaseAdapter;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.BaseHolder;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.radiodialogfragment.RadioChooserAdapter */
public class RadioChooserAdapter extends BaseAdapter<RadioChooserObject, ViewHolder> implements View.OnClickListener, CompoundButton.OnCheckedChangeListener {
    private int currentChoosen = 0;

    /* access modifiers changed from: protected */
    public ViewHolder getViewHolder(View view, int i, int i2) {
        return new ViewHolder(LayoutInflater.from(view.getContext()).inflate(R.layout.radio_dialog_item, (ViewGroup) view, false), this, this);
    }

    /* access modifiers changed from: protected */
    public void onBindViewHolder(ViewHolder viewHolder, RadioChooserObject radioChooserObject, int i, int i2) {
        viewHolder.radioButton.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        viewHolder.radioButton.setChecked(this.currentChoosen == i2);
        viewHolder.radioButton.setOnCheckedChangeListener(this);
        viewHolder.label.setText(radioChooserObject.getTitle());
        viewHolder.image.setVisibility(getType());
    }

    public RadioChooserObject getItemById(String str) {
        return (RadioChooserObject) getItem(this.currentChoosen);
    }

    public void onClick(View view) {
        refresh(view);
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        refresh(compoundButton);
    }

    private void refresh(View view) {
        int adapterPosition = ((ViewHolder) view.getTag()).getAdapterPosition();
        if (adapterPosition != -1) {
            this.currentChoosen = adapterPosition;
            notifyDataSetChanged();
            RadioChooserObject radioChooserObject = (RadioChooserObject) getItem(adapterPosition);
        }
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.radiodialogfragment.RadioChooserAdapter$ViewHolder */
    public class ViewHolder extends BaseHolder {
        @BindView(2131362691)
        ImageView image;
        @BindView(2131362821)
        TextView label;
        @BindView(2131363235)
        RadioButton radioButton;

        public ViewHolder(View view, View.OnClickListener onClickListener, CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
            super(view);
            this.label = (TextView) view.findViewById(R.id.label);
            this.image = (ImageView) view.findViewById(R.id.image);
            this.radioButton = (RadioButton) view.findViewById(R.id.radioButton);
            this.radioButton.setTag(this);
            this.radioButton.setOnCheckedChangeListener(onCheckedChangeListener);
            view.setOnClickListener(onClickListener);
            view.setTag(this);
        }
    }
}
