package p035ru.unicorn.ujin.view.activity.navigation.p058ui.domofonprikamya;

import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.MultiSection;
import p046io.reactivex.processors.PublishProcessor;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.domofonprikamya.ZayavkaDomofonSection */
class ZayavkaDomofonSection extends MultiSection<ServiceFields, ViewHolder> implements View.OnClickListener {
    public static final String TYPE_PHONE = "phone";
    public static final String TYPE_SELECTOR = "select";
    private int selectorPosition = -1;
    private boolean showError = false;
    private PublishProcessor<Integer> specialClicks = PublishProcessor.create();
    TextWatcher textWatcher;
    /* access modifiers changed from: private */
    public Map<Integer, String> xxx = new HashMap();

    public int getLayoutId() {
        return R.layout.zayavka_section;
    }

    ZayavkaDomofonSection() {
    }

    public PublishProcessor<Integer> getSpecialClicks() {
        return this.specialClicks;
    }

    /* access modifiers changed from: protected */
    public void bindViewHolder(final ViewHolder viewHolder, ServiceFields serviceFields, final int i, List<Object> list) {
        this.textWatcher = new TextWatcher() {
            public void afterTextChanged(Editable editable) {
            }

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                ZayavkaDomofonSection.this.xxx.put(Integer.valueOf(ZayavkaDomofonSection.this.getAdapterPositionForViewHolder(viewHolder)), charSequence.toString());
                Log.d("TAG", "XXX put " + i + " " + ZayavkaDomofonSection.this.getAdapterPositionForViewHolder(viewHolder) + " " + charSequence.toString());
            }
        };
        Log.d("TAG", "XXX " + serviceFields.getValue() + " p1  " + i + "    p2 " + viewHolder.getAdapterPosition());
        viewHolder.value.setText("");
        viewHolder.value.addTextChangedListener(this.textWatcher);
        if (this.xxx.containsKey(Integer.valueOf(getAdapterPositionForViewHolder(viewHolder)))) {
            viewHolder.value.setText(this.xxx.get(Integer.valueOf(getAdapterPositionForViewHolder(viewHolder))));
        } else if (serviceFields.getDefaultValue() != null) {
            viewHolder.value.setText(serviceFields.getDefaultValue());
        } else if (serviceFields.getValue() != null) {
            viewHolder.value.setText(serviceFields.getValue());
        }
        if (serviceFields.getType().equals("phone")) {
            viewHolder.value.setInputType(3);
        } else {
            viewHolder.value.setInputType(1);
        }
        int i2 = 0;
        if (serviceFields.getType().equals("select")) {
            viewHolder.til.setEnabled(false);
        }
        viewHolder.til.setEnabled(true ^ serviceFields.getReadonly().booleanValue());
        viewHolder.til.setHint((CharSequence) serviceFields.getLabel());
        ImageView imageView = viewHolder.arrow;
        if (!serviceFields.getType().equals("select")) {
            i2 = 8;
        }
        imageView.setVisibility(i2);
    }

    /* access modifiers changed from: protected */
    public ViewHolder createViewHolder(View view) {
        return new ViewHolder(view, this);
    }

    public void onClick(View view) {
        ViewHolder viewHolder = (ViewHolder) view.getTag();
        if (viewHolder != null) {
            this.selectorPosition = getAdapterPositionForViewHolder(viewHolder);
            this.specialClicks.onNext(Integer.valueOf(this.selectorPosition));
        }
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.domofonprikamya.ZayavkaDomofonSection$ViewHolder */
    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView arrow;
        TextInputLayout til;
        TextInputEditText value;

        public ViewHolder(View view, View.OnClickListener onClickListener) {
            super(view);
            this.value = (TextInputEditText) view.findViewById(R.id.et_title_ticket);
            this.til = (TextInputLayout) view.findViewById(R.id.til_title);
            this.arrow = (ImageView) view.findViewById(R.id.arrow);
            this.arrow.setOnClickListener(onClickListener);
            this.arrow.setTag(this);
        }
    }
}
