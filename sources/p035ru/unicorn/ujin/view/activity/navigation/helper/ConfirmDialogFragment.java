package p035ru.unicorn.ujin.view.activity.navigation.helper;

import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.util.Linkify;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.core.view.ViewCompat;
import p035ru.mysmartflat.kortros.R;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.helper.ConfirmDialogFragment */
public class ConfirmDialogFragment extends DialogFragment {
    public static final String ARG_MESSAGE = "arg_message";
    private DialogListener listener;

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.helper.ConfirmDialogFragment$DialogListener */
    public interface DialogListener {
        void onCamcel();

        void onConfirm();
    }

    public void setListener(DialogListener dialogListener) {
        this.listener = dialogListener;
    }

    public static ConfirmDialogFragment showDialog(String str) {
        Bundle bundle = new Bundle();
        bundle.putString(ARG_MESSAGE, str);
        ConfirmDialogFragment confirmDialogFragment = new ConfirmDialogFragment();
        confirmDialogFragment.setArguments(bundle);
        return confirmDialogFragment;
    }

    public Dialog onCreateDialog(Bundle bundle) {
        if (getArguments() != null) {
            Linkify.addLinks(new SpannableString(getArguments().getString(ARG_MESSAGE)), 15);
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setMessage((CharSequence) Html.fromHtml(getString(R.string.message_confirm)));
        builder.setPositiveButton((int) R.string.button_confirm, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                ConfirmDialogFragment.this.lambda$onCreateDialog$0$ConfirmDialogFragment(dialogInterface, i);
            }
        });
        builder.setNegativeButton((int) R.string.button_cancel, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                ConfirmDialogFragment.this.lambda$onCreateDialog$1$ConfirmDialogFragment(dialogInterface, i);
            }
        });
        return builder.create();
    }

    public /* synthetic */ void lambda$onCreateDialog$0$ConfirmDialogFragment(DialogInterface dialogInterface, int i) {
        this.listener.onConfirm();
    }

    public /* synthetic */ void lambda$onCreateDialog$1$ConfirmDialogFragment(DialogInterface dialogInterface, int i) {
        this.listener.onCamcel();
    }

    public void onStart() {
        super.onStart();
        ((AlertDialog) getDialog()).getButton(-1).setTextColor(ViewCompat.MEASURED_STATE_MASK);
        ((AlertDialog) getDialog()).getButton(-2).setTextColor(ViewCompat.MEASURED_STATE_MASK);
        ((TextView) getDialog().findViewById(16908299)).setMovementMethod(LinkMovementMethod.getInstance());
    }
}
