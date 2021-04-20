package p035ru.unicorn.ujin.view.dialogs;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.Toast;
import androidx.fragment.app.DialogFragment;
import androidx.lifecycle.Observer;
import com.google.android.material.textfield.TextInputLayout;
import org.apache.commons.lang3.StringUtils;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.data.profile.ProfileViewModel;
import p035ru.unicorn.ujin.view.activity.BaseActivity;
import p035ru.unicorn.ujin.viewModel.events.UpdateEvent;

/* renamed from: ru.unicorn.ujin.view.dialogs.RestorePassDialog */
public class RestorePassDialog extends DialogFragment {
    private Button button;
    private EditText editText;
    private String login;
    private ProceedDueToAppLvl proceedDueToAppLvl;
    ProfileViewModel profileViewModel;
    private ProgressBar progressBar;
    private int step = 1;
    private TextInputLayout textInputLayout;

    /* renamed from: ru.unicorn.ujin.view.dialogs.RestorePassDialog$ProceedDueToAppLvl */
    public interface ProceedDueToAppLvl {
        void proceed();
    }

    public ProceedDueToAppLvl getProceedDueToAppLvl() {
        return this.proceedDueToAppLvl;
    }

    public void setProceedDueToAppLvl(ProceedDueToAppLvl proceedDueToAppLvl2) {
        this.proceedDueToAppLvl = proceedDueToAppLvl2;
    }

    public void onStart() {
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.getWindow().setLayout(-1, -1);
            this.editText.requestFocus();
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        getDialog().getWindow().setBackgroundDrawable(new ColorDrawable(0));
        this.profileViewModel = ((BaseActivity) getActivity()).profileViewModel;
        this.profileViewModel.getShowProgressLiveData().observe(getViewLifecycleOwner(), new Observer() {
            public final void onChanged(Object obj) {
                RestorePassDialog.this.handleProgressVisibility((Boolean) obj);
            }
        });
        this.profileViewModel.getLoginMutableLiveData().observe(getViewLifecycleOwner(), new Observer() {
            public final void onChanged(Object obj) {
                RestorePassDialog.this.handleUserData((UpdateEvent) obj);
            }
        });
        View inflate = layoutInflater.inflate(R.layout.dialog_restore_pass, viewGroup);
        inflate.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        this.editText = (EditText) inflate.findViewById(R.id.editLoginCode);
        this.textInputLayout = (TextInputLayout) inflate.findViewById(R.id.inputLoginCode);
        this.progressBar = (ProgressBar) inflate.findViewById(R.id.pbLoadingRestore);
        this.progressBar.setVisibility(8);
        this.button = (Button) inflate.findViewById(R.id.buttonNext);
        this.button.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                RestorePassDialog.this.lambda$onCreateView$0$RestorePassDialog(view);
            }
        });
        inflate.findViewById(R.id.textCancel).setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                RestorePassDialog.this.lambda$onCreateView$1$RestorePassDialog(view);
            }
        });
        return inflate;
    }

    public /* synthetic */ void lambda$onCreateView$0$RestorePassDialog(View view) {
        nextClickListener();
    }

    public /* synthetic */ void lambda$onCreateView$1$RestorePassDialog(View view) {
        dismiss();
    }

    /* access modifiers changed from: private */
    public void handleProgressVisibility(Boolean bool) {
        if (bool == null) {
            return;
        }
        if (bool.booleanValue()) {
            this.button.setEnabled(false);
            this.progressBar.setVisibility(0);
            return;
        }
        this.button.setEnabled(true);
        this.progressBar.setVisibility(8);
    }

    private void nextClickListener() {
        if (StringUtils.isEmpty(this.editText.getText().toString())) {
            int i = this.step;
            if (i == 1) {
                Toast.makeText(getActivity(), R.string.label_login, 1).show();
            } else if (i == 2) {
                Toast.makeText(getActivity(), R.string.enterCode, 1).show();
            }
        } else {
            if (this.step == 1) {
                this.login = this.editText.getText().toString();
            }
            String obj = this.step == 2 ? this.editText.getText().toString() : null;
            this.profileViewModel.getPasswordRestoreLiveData().removeObservers(this);
            this.profileViewModel.getPasswordRestoreLiveData().observe(this, this.step == 1 ? new Observer() {
                public final void onChanged(Object obj) {
                    RestorePassDialog.this.handleStep1((UpdateEvent) obj);
                }
            } : new Observer() {
                public final void onChanged(Object obj) {
                    RestorePassDialog.this.handleStep2((UpdateEvent) obj);
                }
            });
            this.profileViewModel.requestRestorePassword(this.login, this.step, obj);
        }
    }

    /* access modifiers changed from: private */
    public void handleStep1(UpdateEvent updateEvent) {
        if (updateEvent.getSuccess()) {
            this.editText.setText("");
            this.step = 2;
            this.textInputLayout.setHint((CharSequence) getActivity().getString(R.string.enterCode));
            return;
        }
        Toast.makeText(getActivity(), updateEvent.getMessage(), 1).show();
    }

    /* access modifiers changed from: private */
    public void handleStep2(UpdateEvent updateEvent) {
        if (updateEvent.getSuccess()) {
            Toast.makeText(getActivity(), R.string.passRestored, 1).show();
            dismiss();
            return;
        }
        Toast.makeText(getActivity(), updateEvent.getMessage(), 1).show();
    }

    /* access modifiers changed from: private */
    public void handleUserData(UpdateEvent updateEvent) {
        if (updateEvent.getSuccess()) {
            this.proceedDueToAppLvl.proceed();
            dismiss();
            return;
        }
        Toast.makeText(getContext(), updateEvent.getMessage(), 1).show();
    }
}
