package p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany;

import android.app.Dialog;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.jakewharton.rxbinding2.view.RxView;
import com.jakewharton.rxbinding2.widget.RxTextView;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.CreateUserCompany;
import p035ru.unicorn.ujin.view.customViews.fields.PhoneMaskedEditText;
import p046io.reactivex.BackpressureStrategy;
import p046io.reactivex.functions.Consumer;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.mycompany.AddEmployerDialogFragment */
public class AddEmployerDialogFragment extends DialogFragment {
    private EditText name;
    private OnAddPersonClick onAddPersonClick;
    private EditText patronymic;
    private PhoneMaskedEditText phone;
    private EditText position;
    private EditText surname;

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.mycompany.AddEmployerDialogFragment$OnAddPersonClick */
    public interface OnAddPersonClick {
        void onAddPersonCLick(CreateUserCompany createUserCompany);
    }

    public AddEmployerDialogFragment(OnAddPersonClick onAddPersonClick2) {
        this.onAddPersonClick = onAddPersonClick2;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.dialog_add_employer, viewGroup);
        inflate.findViewById(R.id.btn_cancel).setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                AddEmployerDialogFragment.this.lambda$onCreateView$0$AddEmployerDialogFragment(view);
            }
        });
        this.phone = (PhoneMaskedEditText) inflate.findViewById(R.id.et_title);
        this.position = (EditText) inflate.findViewById(R.id.et_tel);
        this.name = (EditText) inflate.findViewById(R.id.etName);
        this.surname = (EditText) inflate.findViewById(R.id.etSurname);
        this.patronymic = (EditText) inflate.findViewById(R.id.etPatronymic);
        RxView.clicks((TextView) inflate.findViewById(R.id.btn_add)).map(new Function() {
            public final Object apply(Object obj) {
                return AddEmployerDialogFragment.this.lambda$onCreateView$1$AddEmployerDialogFragment(obj);
            }
        }).doOnNext($$Lambda$AddEmployerDialogFragment$_V6nqZbisZlZwryljRoeF57FGqA.INSTANCE).filter($$Lambda$AddEmployerDialogFragment$B5eeLU_N7vh1yBB69_Sfa4DnXrU.INSTANCE).map(new Function() {
            public final Object apply(Object obj) {
                return AddEmployerDialogFragment.this.lambda$onCreateView$4$AddEmployerDialogFragment((String) obj);
            }
        }).filter($$Lambda$AddEmployerDialogFragment$spByUMJlWsHoy0VcL87k5AQwddE.INSTANCE).subscribe(new Consumer() {
            public final void accept(Object obj) {
                AddEmployerDialogFragment.this.lambda$onCreateView$6$AddEmployerDialogFragment((Editable) obj);
            }
        });
        RxTextView.textChanges(this.phone).filter($$Lambda$AddEmployerDialogFragment$XqOpu_lgNi8h5rdrWHc4_vkFWbQ.INSTANCE).filter($$Lambda$AddEmployerDialogFragment$2URy9h_4BEAUARzqpoj2o6jJU.INSTANCE).map($$Lambda$o0pFIlsUNXLvEOX1QJRnwdVBJFE.INSTANCE).toFlowable(BackpressureStrategy.BUFFER);
        RxTextView.textChanges(this.phone).filter($$Lambda$AddEmployerDialogFragment$FSx9uHF5p3sMCrL0x7vT9tRnzA0.INSTANCE).map($$Lambda$o0pFIlsUNXLvEOX1QJRnwdVBJFE.INSTANCE).toFlowable(BackpressureStrategy.BUFFER);
        return inflate;
    }

    public /* synthetic */ void lambda$onCreateView$0$AddEmployerDialogFragment(View view) {
        dismiss();
    }

    public /* synthetic */ String lambda$onCreateView$1$AddEmployerDialogFragment(Object obj) throws Exception {
        return this.phone.getText().toString().replaceAll("\\D+", "");
    }

    public /* synthetic */ Editable lambda$onCreateView$4$AddEmployerDialogFragment(String str) throws Exception {
        return this.position.getText();
    }

    static /* synthetic */ boolean lambda$onCreateView$5(Editable editable) throws Exception {
        return editable != null && editable.length() > 0;
    }

    public /* synthetic */ void lambda$onCreateView$6$AddEmployerDialogFragment(Editable editable) throws Exception {
        this.onAddPersonClick.onAddPersonCLick(new CreateUserCompany(this.phone.getText().toString(), this.position.getText().toString(), this.name.getText().toString(), this.surname.getText().toString(), this.patronymic.getText().toString()));
    }

    static /* synthetic */ boolean lambda$onCreateView$7(CharSequence charSequence) throws Exception {
        return charSequence != null && charSequence.length() > 0;
    }

    static /* synthetic */ boolean lambda$onCreateView$9(CharSequence charSequence) throws Exception {
        return charSequence != null && charSequence.length() > 0;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public void onStart() {
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.getWindow().setLayout(-1, -2);
        }
    }
}
