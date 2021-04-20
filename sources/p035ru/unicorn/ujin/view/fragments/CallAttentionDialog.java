package p035ru.unicorn.ujin.view.fragments;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.DialogFragment;
import javax.annotation.Nullable;
import p035ru.mysmartflat.kortros.R;

/* renamed from: ru.unicorn.ujin.view.fragments.CallAttentionDialog */
public class CallAttentionDialog extends DialogFragment {
    private DialogListener listener;

    /* renamed from: ru.unicorn.ujin.view.fragments.CallAttentionDialog$DialogListener */
    public interface DialogListener {
        void onCancel();

        void onReady();
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_dialog_attention_call, viewGroup);
        inflate.findViewById(R.id.cancel).setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                CallAttentionDialog.this.lambda$onCreateView$0$CallAttentionDialog(view);
            }
        });
        inflate.findViewById(R.id.goToSettings).setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                CallAttentionDialog.this.lambda$onCreateView$1$CallAttentionDialog(view);
            }
        });
        return inflate;
    }

    public /* synthetic */ void lambda$onCreateView$0$CallAttentionDialog(View view) {
        this.listener.onCancel();
    }

    public /* synthetic */ void lambda$onCreateView$1$CallAttentionDialog(View view) {
        this.listener.onReady();
    }

    public void onStart() {
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.getWindow().setLayout(-1, -1);
        }
    }

    public void setListener(DialogListener dialogListener) {
        this.listener = dialogListener;
    }
}
