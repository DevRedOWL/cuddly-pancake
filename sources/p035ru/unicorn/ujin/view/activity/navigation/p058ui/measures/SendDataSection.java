package p035ru.unicorn.ujin.view.activity.navigation.p058ui.measures;

import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.util.List;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.MultiSection;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.TextChangedListener;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.measures.SendDataSection */
class SendDataSection extends MultiSection<MeasuresData, ViewHolder> {
    public int getLayoutId() {
        return R.layout.item_send_mesuares_value;
    }

    SendDataSection() {
    }

    /* access modifiers changed from: protected */
    public ViewHolder createViewHolder(View view) {
        return new ViewHolder(view);
    }

    /* access modifiers changed from: protected */
    public void bindViewHolder(ViewHolder viewHolder, MeasuresData measuresData, final int i, List<Object> list) {
        StringBuilder sb = new StringBuilder();
        sb.append(measuresData.getTitle());
        sb.append(" (S/N ");
        sb.append(measuresData.getSerialNumber());
        sb.append(")");
        viewHolder.title.setText(sb);
        viewHolder.til.setHint((CharSequence) makeHint(measuresData, viewHolder));
        viewHolder.value.setText(String.valueOf((measuresData.getCurrentValue().doubleValue() == -1.0d ? measuresData.getCurrentValueCounter() : measuresData.getCurrentValue()).doubleValue()));
        viewHolder.value.addTextChangedListener(new TextChangedListener<EditText>(viewHolder.value) {
            private Integer currentPosition = 0;
            private String currentValue = "";

            private boolean isValueValid(String str) {
                return str.isEmpty() || str.matches("^[0-9]+?[.,]?[0-9]*?$");
            }

            public void onTextChanged(EditText editText, Editable editable) {
                MeasuresData measuresData = (MeasuresData) SendDataSection.this.getData(i);
                if (!isValueValid(editText.getText().toString())) {
                    editText.removeTextChangedListener(this);
                    editText.setText(this.currentValue);
                    editText.setSelection(this.currentPosition.intValue());
                    editText.addTextChangedListener(this);
                }
                if (!editText.getText().toString().equals("") && isValueValid(editText.getText().toString())) {
                    measuresData.setCurrentValue(Double.valueOf(Double.parseDouble(editText.getText().toString().replace(",", "."))));
                    SendDataSection.this.onChanged(i, 0, (Object) null);
                }
            }

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                this.currentValue = isValueValid(charSequence.toString()) ? charSequence.toString() : this.currentValue;
                this.currentPosition = Integer.valueOf(i);
            }
        });
    }

    private String makeHint(MeasuresData measuresData, ViewHolder viewHolder) {
        Context context = viewHolder.title.getContext();
        String string = context.getString(R.string.counter_hint_date, new Object[]{measuresData.getLastDateCurrentValue()});
        String string2 = context.getString(R.string.dot);
        Double lastValueCounter = measuresData.getLastValueCounter();
        String unitName = measuresData.getUnitName();
        measuresData.getLastDateCurrentValue();
        return string + " " + string2 + " " + lastValueCounter + " " + string2 + " " + unitName;
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.measures.SendDataSection$ViewHolder */
    public class ViewHolder extends RecyclerView.ViewHolder {
        TextInputLayout til;
        TextView title;
        TextInputEditText value;

        public ViewHolder(View view) {
            super(view);
            this.value = (TextInputEditText) view.findViewById(R.id.et_title_ticket);
            this.til = (TextInputLayout) view.findViewById(R.id.til_title);
            this.title = (TextView) view.findViewById(R.id.title);
        }
    }
}
