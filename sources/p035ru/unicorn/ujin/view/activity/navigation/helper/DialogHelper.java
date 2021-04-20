package p035ru.unicorn.ujin.view.activity.navigation.helper;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import com.google.android.material.textfield.TextInputEditText;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.helper.DialogHelper;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mainsmart.Rooms;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.helper.DialogHelper */
public class DialogHelper {
    public static final String EMPTY = "";

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.helper.DialogHelper$OnButtonDialogClick */
    public interface OnButtonDialogClick {
        void onNegativeClick();

        void onPositiveClick();
    }

    static /* synthetic */ void lambda$showDialog$4(DialogInterface dialogInterface, int i) {
    }

    public static void showDialogWithTimeout(Context context, String str) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setMessage((CharSequence) str);
        builder.setPositiveButton((int) R.string.button_ok, (DialogInterface.OnClickListener) $$Lambda$DialogHelper$sTymBYeUAELi7aIwud256cyZBeY.INSTANCE);
        AlertDialog create = builder.create();
        create.show();
        new Handler().postDelayed(new Runnable() {
            public final void run() {
                DialogHelper.lambda$showDialogWithTimeout$1(AlertDialog.this);
            }
        }, 2000);
    }

    static /* synthetic */ void lambda$showDialogWithTimeout$1(AlertDialog alertDialog) {
        if (alertDialog != null && alertDialog.isShowing()) {
            alertDialog.dismiss();
        }
    }

    public static void showDialog(Context context, String str) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setMessage((CharSequence) str);
        builder.setPositiveButton((int) R.string.button_ok, (DialogInterface.OnClickListener) $$Lambda$DialogHelper$Eb4LcTZExQTJ_B10P4YrdQmrqc.INSTANCE);
        builder.create().show();
    }

    public static AlertDialog showDialog2(Context context, String str) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setMessage((CharSequence) str);
        builder.setPositiveButton((int) R.string.button_ok, (DialogInterface.OnClickListener) $$Lambda$DialogHelper$zKg62ujd4xzi2iWmdKC_RN1W8c.INSTANCE);
        return builder.create();
    }

    public static AlertDialog createDialog(Context context, String str) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setMessage((CharSequence) str);
        return builder.create();
    }

    public static void createDialogAndShow(Context context, String str) {
        createDialog(context, str).show();
    }

    public static AlertDialog.Builder createDialogBuilder(Context context, String str) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setMessage((CharSequence) str);
        return builder;
    }

    public static void showDialog(Context context, String str, String str2) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setMessage((CharSequence) str);
        builder.setTitle((CharSequence) str2);
        builder.setPositiveButton((int) R.string.button_ok, (DialogInterface.OnClickListener) $$Lambda$DialogHelper$QHiClFPMvpB_CfMJDevyEK0lFmE.INSTANCE);
        builder.create().show();
    }

    public static void showDialog(Context context) {
        new AlertDialog.Builder(context).create().show();
    }

    public static void showDialog(Context context, Throwable th) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setPositiveButton((int) R.string.button_ok, (DialogInterface.OnClickListener) $$Lambda$DialogHelper$gex48mGdQHTH8UkbaQ1u24fG2I.INSTANCE);
        builder.setMessage((CharSequence) th != null ? th.getMessage() : "Произошла непредвиденная ошибка");
        builder.create().show();
    }

    public static void showDialog(Context context, String str, int i, int i2) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setPositiveButton(i, (DialogInterface.OnClickListener) $$Lambda$DialogHelper$z7BjK02pFbR_sKjXHCCN3fbc5ZU.INSTANCE);
        builder.setNegativeButton(i2, (DialogInterface.OnClickListener) $$Lambda$DialogHelper$nPL3lRSLFm7lkllezJ8B2y58q0.INSTANCE);
        builder.setMessage((CharSequence) str);
        builder.create().show();
    }

    public static void showDialog(Context context, String str, int i, int i2, OnButtonDialogClick onButtonDialogClick) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setPositiveButton(i, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                DialogHelper.lambda$showDialog$8(DialogHelper.OnButtonDialogClick.this, dialogInterface, i);
            }
        });
        builder.setNegativeButton(i2, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                DialogHelper.lambda$showDialog$9(DialogHelper.OnButtonDialogClick.this, dialogInterface, i);
            }
        });
        builder.setMessage((CharSequence) str);
        builder.setCancelable(false);
        builder.create().show();
    }

    static /* synthetic */ void lambda$showDialog$8(OnButtonDialogClick onButtonDialogClick, DialogInterface dialogInterface, int i) {
        onButtonDialogClick.onPositiveClick();
        dialogInterface.dismiss();
    }

    static /* synthetic */ void lambda$showDialog$9(OnButtonDialogClick onButtonDialogClick, DialogInterface dialogInterface, int i) {
        onButtonDialogClick.onNegativeClick();
        dialogInterface.dismiss();
    }

    public static void showDialog(Context context, String str, OnButtonDialogClick onButtonDialogClick) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setPositiveButton((int) R.string.button_ok, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                DialogHelper.lambda$showDialog$10(DialogHelper.OnButtonDialogClick.this, dialogInterface, i);
            }
        });
        builder.setMessage((CharSequence) str);
        builder.setCancelable(false);
        builder.create().show();
    }

    static /* synthetic */ void lambda$showDialog$10(OnButtonDialogClick onButtonDialogClick, DialogInterface dialogInterface, int i) {
        onButtonDialogClick.onPositiveClick();
        dialogInterface.dismiss();
    }

    public static void showEdittableDialog(final Context context, String str, String str2, final OnDialogClick onDialogClick) {
        final EditText editText = new EditText(context);
        if (str != null) {
            editText.setText(str);
            int i = (int) ((((float) 16) * context.getResources().getDisplayMetrics().density) + 0.5f);
            editText.setPadding(i, 0, i, i);
            editText.setSelection(editText.getText().length());
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setView((View) editText).setPositiveButton((CharSequence) Rooms.ADD_ROOM, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                String obj = editText.getText().toString();
                if (!obj.isEmpty()) {
                    onDialogClick.onPositiveClick(obj, editText);
                } else {
                    DialogHelper.showDialog(context, "Название не может быть пустым");
                }
            }
        });
        builder.setTitle((CharSequence) str2);
        AlertDialog create = builder.create();
        create.show();
        create.setOnDismissListener(new DialogInterface.OnDismissListener(context, editText) {
            private final /* synthetic */ Context f$0;
            private final /* synthetic */ EditText f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            public final void onDismiss(DialogInterface dialogInterface) {
                UIHelper.hideKeyboard(this.f$0, this.f$1);
            }
        });
    }

    public static void showEdittableDialog2(Context context, String str, String str2, String str3, OnDialogClick onDialogClick, int i) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        View inflate = LayoutInflater.from(context).inflate(R.layout.item_dialogue, (ViewGroup) null);
        TextInputEditText textInputEditText = (TextInputEditText) inflate.findViewById(R.id.et);
        ((TextView) inflate.findViewById(R.id.title)).setText(str2);
        TextView textView = (TextView) inflate.findViewById(R.id.positive);
        TextView textView2 = (TextView) inflate.findViewById(R.id.negative);
        if (str3 != null) {
            textInputEditText.setHint(str3);
        }
        if (i != -1) {
            textInputEditText.setInputType(i);
        }
        builder.setView(inflate);
        AlertDialog create = builder.create();
        create.show();
        textView2.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                AlertDialog.this.dismiss();
            }
        });
        textView.setOnClickListener(new View.OnClickListener(onDialogClick, create, context) {
            private final /* synthetic */ OnDialogClick f$1;
            private final /* synthetic */ AlertDialog f$2;
            private final /* synthetic */ Context f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void onClick(View view) {
                DialogHelper.lambda$showEdittableDialog2$13(TextInputEditText.this, this.f$1, this.f$2, this.f$3, view);
            }
        });
        create.setOnDismissListener(new DialogInterface.OnDismissListener(context, textInputEditText) {
            private final /* synthetic */ Context f$0;
            private final /* synthetic */ TextInputEditText f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            public final void onDismiss(DialogInterface dialogInterface) {
                UIHelper.hideKeyboard(this.f$0, this.f$1);
            }
        });
    }

    static /* synthetic */ void lambda$showEdittableDialog2$13(TextInputEditText textInputEditText, OnDialogClick onDialogClick, AlertDialog alertDialog, Context context, View view) {
        String obj = textInputEditText.getText().toString();
        if (!obj.isEmpty()) {
            onDialogClick.onPositiveClick(obj, textInputEditText);
            alertDialog.dismiss();
            return;
        }
        showDialog(context, "Название не может быть пустым");
    }

    public static void showTextbleDialog(Context context, String str, String str2, OnButtonDialogClick onButtonDialogClick) {
        showTextbleDialog(context, str, str2, "Понятно", "Отмена", onButtonDialogClick);
    }

    public static void showTextbleDialog(Context context, String str, String str2, String str3, String str4, OnButtonDialogClick onButtonDialogClick) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        View inflate = LayoutInflater.from(context).inflate(R.layout.item_simple_dialogue, (ViewGroup) null);
        ((TextView) inflate.findViewById(R.id.title)).setText(str);
        ((TextView) inflate.findViewById(R.id.subtitle)).setText(str2);
        TextView textView = (TextView) inflate.findViewById(R.id.positive);
        textView.setText(str3);
        TextView textView2 = (TextView) inflate.findViewById(R.id.negative);
        textView2.setText(str4);
        builder.setView(inflate);
        builder.create().show();
        textView.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                DialogHelper.OnButtonDialogClick.this.onPositiveClick();
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                DialogHelper.OnButtonDialogClick.this.onNegativeClick();
            }
        });
    }
}
