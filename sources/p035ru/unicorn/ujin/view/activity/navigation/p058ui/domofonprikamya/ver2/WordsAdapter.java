package p035ru.unicorn.ujin.view.activity.navigation.p058ui.domofonprikamya.ver2;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.util.HashMap;
import java.util.Map;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.domofonprikamya.ServiceFields;
import p046io.reactivex.processors.PublishProcessor;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.domofonprikamya.ver2.WordsAdapter */
public class WordsAdapter extends AbstractRecyclerViewAdapter<ServiceFields, WordsViewHolder> implements View.OnClickListener {
    public static final String TYPE_PHONE = "phone";
    public static final String TYPE_SELECTOR = "select";
    private Map<Integer, String> errorList = new HashMap();
    private PublishProcessor<Integer> specialClicks = PublishProcessor.create();

    public PublishProcessor<Integer> getSpecialClicks() {
        return this.specialClicks;
    }

    /* access modifiers changed from: protected */
    public WordsViewHolder getViewHolder(View view) {
        return new WordsViewHolder(LayoutInflater.from(view.getContext()).inflate(R.layout.zayavka_section, (ViewGroup) view, false), this, new MyCustomEditTextListener());
    }

    /* access modifiers changed from: protected */
    public void onBindViewHolder(WordsViewHolder wordsViewHolder, ServiceFields serviceFields) {
        wordsViewHolder.myCustomEditTextListener.updatePosition(wordsViewHolder.getAdapterPosition());
        wordsViewHolder.myCustomEditTextListener.setTil(wordsViewHolder.til);
        if (serviceFields.getDefaultValue() != null) {
            wordsViewHolder.value.setText(serviceFields.getDefaultValue());
        } else if (serviceFields.getValue() != null) {
            wordsViewHolder.value.setText(serviceFields.getValue());
        }
        if (serviceFields.getType().equals("phone")) {
            wordsViewHolder.value.setInputType(3);
        } else {
            wordsViewHolder.value.setInputType(1);
        }
        int i = 0;
        if (serviceFields.getType().equals("select")) {
            wordsViewHolder.value.setFocusable(false);
            wordsViewHolder.til.setFocusable(false);
        }
        wordsViewHolder.til.setEnabled(true ^ serviceFields.getReadonly().booleanValue());
        wordsViewHolder.til.setHint((CharSequence) serviceFields.getLabel());
        ImageView imageView = wordsViewHolder.arrow;
        if (!serviceFields.getType().equals("select")) {
            i = 8;
        }
        imageView.setVisibility(i);
        if (this.errorList.containsKey(Integer.valueOf(wordsViewHolder.getAdapterPosition()))) {
            wordsViewHolder.value.setText(serviceFields.getValue());
            wordsViewHolder.myCustomEditTextListener.setError(this.errorList.get(Integer.valueOf(wordsViewHolder.getAdapterPosition())));
            this.errorList.remove(Integer.valueOf(wordsViewHolder.getAdapterPosition()));
            wordsViewHolder.til.requestFocus();
        }
    }

    public void onClick(View view) {
        int adapterPosition;
        WordsViewHolder wordsViewHolder = (WordsViewHolder) view.getTag();
        if (wordsViewHolder != null && (adapterPosition = wordsViewHolder.getAdapterPosition()) != -1) {
            getSpecialClicks().onNext(Integer.valueOf(adapterPosition));
        }
    }

    public void showError(int i, String str) {
        this.errorList.put(Integer.valueOf(i), str);
        notifyItemChanged(i);
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.domofonprikamya.ver2.WordsAdapter$WordsViewHolder */
    public class WordsViewHolder extends RecyclerView.ViewHolder {
        ImageView arrow;
        public MyCustomEditTextListener myCustomEditTextListener;
        TextInputLayout til;
        TextInputEditText value;

        public WordsViewHolder(View view, View.OnClickListener onClickListener, MyCustomEditTextListener myCustomEditTextListener2) {
            super(view);
            this.value = (TextInputEditText) view.findViewById(R.id.et_title_ticket);
            this.til = (TextInputLayout) view.findViewById(R.id.til_title);
            this.arrow = (ImageView) view.findViewById(R.id.arrow);
            this.arrow.setOnClickListener(onClickListener);
            this.arrow.setTag(this);
            this.myCustomEditTextListener = myCustomEditTextListener2;
            this.value.addTextChangedListener(myCustomEditTextListener2);
        }
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.domofonprikamya.ver2.WordsAdapter$MyCustomEditTextListener */
    private class MyCustomEditTextListener implements TextWatcher {
        private int position;
        private TextInputLayout til;

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        private MyCustomEditTextListener() {
        }

        public void updatePosition(int i) {
            this.position = i;
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            ((ServiceFields) WordsAdapter.this.getData().get(this.position)).setValue(charSequence.toString());
        }

        public void afterTextChanged(Editable editable) {
            this.til.setError((CharSequence) null);
        }

        public void setTil(TextInputLayout textInputLayout) {
            this.til = textInputLayout;
        }

        public void setError(String str) {
            this.til.setErrorEnabled(true);
            this.til.setError(str);
        }
    }
}
