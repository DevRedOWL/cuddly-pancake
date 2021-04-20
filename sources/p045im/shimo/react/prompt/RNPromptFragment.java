package p045im.shimo.react.prompt;

import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.EditText;
import javax.annotation.Nullable;
import p045im.shimo.react.prompt.RNPromptModule;

/* renamed from: im.shimo.react.prompt.RNPromptFragment */
public class RNPromptFragment extends DialogFragment implements DialogInterface.OnClickListener {
    static final String ARG_BUTTON_NEGATIVE = "button_negative";
    static final String ARG_BUTTON_NEUTRAL = "button_neutral";
    static final String ARG_BUTTON_POSITIVE = "button_positive";
    static final String ARG_DEFAULT_VALUE = "defaultValue";
    static final String ARG_ITEMS = "items";
    static final String ARG_MESSAGE = "message";
    static final String ARG_PLACEHOLDER = "placeholder";
    static final String ARG_STYLE = "style";
    static final String ARG_TITLE = "title";
    static final String ARG_TYPE = "type";
    private EditText mInputText;
    @Nullable
    private RNPromptModule.PromptFragmentListener mListener = null;

    /* renamed from: im.shimo.react.prompt.RNPromptFragment$PromptTypes */
    public enum PromptTypes {
        TYPE_DEFAULT("default"),
        PLAIN_TEXT("plain-text"),
        SECURE_TEXT("secure-text"),
        NUMERIC("numeric"),
        EMAIL_ADDRESS("email-address"),
        PHONE_PAD("phone-pad");
        
        private final String mName;

        private PromptTypes(String str) {
            this.mName = str;
        }

        public String toString() {
            return this.mName;
        }
    }

    public void setListener(@Nullable RNPromptModule.PromptFragmentListener promptFragmentListener) {
        this.mListener = promptFragmentListener;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00d9, code lost:
        if (r0.equals("secure-text") != false) goto L_0x0105;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x010d, code lost:
        if (r4 != 3) goto L_0x0117;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.Dialog createDialog(android.content.Context r14, android.os.Bundle r15) {
        /*
            r13 = this;
            java.lang.String r0 = "style"
            boolean r1 = r15.containsKey(r0)
            java.lang.String r2 = "default"
            if (r1 == 0) goto L_0x000f
            java.lang.String r0 = r15.getString(r0)
            goto L_0x0010
        L_0x000f:
            r0 = r2
        L_0x0010:
            if (r0 == 0) goto L_0x0013
            goto L_0x0014
        L_0x0013:
            r0 = r2
        L_0x0014:
            int r1 = r0.hashCode()
            java.lang.String r2 = "shimo"
            r3 = 109407574(0x6856d56, float:5.0189694E-35)
            r4 = 0
            r5 = -1
            if (r1 == r3) goto L_0x0022
            goto L_0x002a
        L_0x0022:
            boolean r1 = r0.equals(r2)
            if (r1 == 0) goto L_0x002a
            r1 = 0
            goto L_0x002b
        L_0x002a:
            r1 = -1
        L_0x002b:
            if (r1 == 0) goto L_0x0033
            androidx.appcompat.app.AlertDialog$Builder r1 = new androidx.appcompat.app.AlertDialog$Builder
            r1.<init>(r14)
            goto L_0x003a
        L_0x0033:
            androidx.appcompat.app.AlertDialog$Builder r1 = new androidx.appcompat.app.AlertDialog$Builder
            int r6 = p045im.shimo.react.prompt.C4494R.style.ShimoAlertDialogStyle
            r1.<init>(r14, r6)
        L_0x003a:
            java.lang.String r6 = "title"
            java.lang.String r6 = r15.getString(r6)
            r1.setTitle((java.lang.CharSequence) r6)
            java.lang.String r6 = "button_positive"
            boolean r7 = r15.containsKey(r6)
            if (r7 == 0) goto L_0x0052
            java.lang.String r6 = r15.getString(r6)
            r1.setPositiveButton((java.lang.CharSequence) r6, (android.content.DialogInterface.OnClickListener) r13)
        L_0x0052:
            java.lang.String r6 = "button_negative"
            boolean r7 = r15.containsKey(r6)
            if (r7 == 0) goto L_0x0061
            java.lang.String r6 = r15.getString(r6)
            r1.setNegativeButton((java.lang.CharSequence) r6, (android.content.DialogInterface.OnClickListener) r13)
        L_0x0061:
            java.lang.String r6 = "button_neutral"
            boolean r7 = r15.containsKey(r6)
            if (r7 == 0) goto L_0x0070
            java.lang.String r6 = r15.getString(r6)
            r1.setNeutralButton((java.lang.CharSequence) r6, (android.content.DialogInterface.OnClickListener) r13)
        L_0x0070:
            java.lang.String r6 = "message"
            boolean r7 = r15.containsKey(r6)
            if (r7 == 0) goto L_0x007f
            java.lang.String r6 = r15.getString(r6)
            r1.setMessage((java.lang.CharSequence) r6)
        L_0x007f:
            java.lang.String r6 = "items"
            boolean r7 = r15.containsKey(r6)
            if (r7 == 0) goto L_0x008e
            java.lang.CharSequence[] r6 = r15.getCharSequenceArray(r6)
            r1.setItems((java.lang.CharSequence[]) r6, (android.content.DialogInterface.OnClickListener) r13)
        L_0x008e:
            androidx.appcompat.app.AlertDialog r1 = r1.create()
            android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r14)
            int r7 = r0.hashCode()
            if (r7 == r3) goto L_0x009d
            goto L_0x00a5
        L_0x009d:
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00a5
            r0 = 0
            goto L_0x00a6
        L_0x00a5:
            r0 = -1
        L_0x00a6:
            if (r0 == 0) goto L_0x00af
            android.widget.EditText r0 = new android.widget.EditText
            r0.<init>(r14)
            r14 = r0
            goto L_0x00b8
        L_0x00af:
            int r14 = p045im.shimo.react.prompt.C4494R.layout.edit_text
            r0 = 0
            android.view.View r14 = r6.inflate(r14, r0)
            android.widget.EditText r14 = (android.widget.EditText) r14
        L_0x00b8:
            java.lang.String r0 = "type"
            boolean r2 = r15.containsKey(r0)
            r3 = 524289(0x80001, float:7.34685E-40)
            r6 = 3
            if (r2 == 0) goto L_0x0117
            java.lang.String r0 = r15.getString(r0)
            if (r0 == 0) goto L_0x0117
            int r2 = r0.hashCode()
            switch(r2) {
                case -2010681661: goto L_0x00fa;
                case -2000413939: goto L_0x00f0;
                case -1030161484: goto L_0x00e6;
                case 975575888: goto L_0x00dc;
                case 1369873859: goto L_0x00d3;
                default: goto L_0x00d2;
            }
        L_0x00d2:
            goto L_0x0104
        L_0x00d3:
            java.lang.String r2 = "secure-text"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0104
            goto L_0x0105
        L_0x00dc:
            java.lang.String r2 = "plain-text"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0104
            r4 = 4
            goto L_0x0105
        L_0x00e6:
            java.lang.String r2 = "phone-pad"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0104
            r4 = 3
            goto L_0x0105
        L_0x00f0:
            java.lang.String r2 = "numeric"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0104
            r4 = 1
            goto L_0x0105
        L_0x00fa:
            java.lang.String r2 = "email-address"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0104
            r4 = 2
            goto L_0x0105
        L_0x0104:
            r4 = -1
        L_0x0105:
            if (r4 == 0) goto L_0x0115
            r0 = 1
            if (r4 == r0) goto L_0x0113
            r0 = 2
            if (r4 == r0) goto L_0x0110
            if (r4 == r6) goto L_0x0113
            goto L_0x0117
        L_0x0110:
            r3 = 33
            goto L_0x0117
        L_0x0113:
            r3 = 3
            goto L_0x0117
        L_0x0115:
            r3 = 129(0x81, float:1.81E-43)
        L_0x0117:
            r14.setInputType(r3)
            java.lang.String r0 = "defaultValue"
            boolean r2 = r15.containsKey(r0)
            if (r2 == 0) goto L_0x0136
            java.lang.String r0 = r15.getString(r0)
            if (r0 == 0) goto L_0x0136
            r14.setText(r0)
            android.text.Editable r0 = r14.getText()
            int r0 = r0.length()
            r14.setSelection(r0, r0)
        L_0x0136:
            java.lang.String r0 = "placeholder"
            boolean r0 = r15.containsKey(r0)
            if (r0 == 0) goto L_0x0147
            java.lang.String r0 = "placeholder"
            java.lang.String r15 = r15.getString(r0)
            r14.setHint(r15)
        L_0x0147:
            r9 = 50
            r10 = 15
            r11 = 50
            r12 = 0
            r7 = r1
            r8 = r14
            r7.setView(r8, r9, r10, r11, r12)
            r13.mInputText = r14
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p045im.shimo.react.prompt.RNPromptFragment.createDialog(android.content.Context, android.os.Bundle):android.app.Dialog");
    }

    public Dialog onCreateDialog(Bundle bundle) {
        Dialog createDialog = createDialog(getActivity(), getArguments());
        if (this.mInputText.requestFocus()) {
            createDialog.getWindow().setSoftInputMode(5);
        }
        return createDialog;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        RNPromptModule.PromptFragmentListener promptFragmentListener = this.mListener;
        if (promptFragmentListener != null) {
            promptFragmentListener.onConfirm(i, this.mInputText.getText().toString());
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        RNPromptModule.PromptFragmentListener promptFragmentListener = this.mListener;
        if (promptFragmentListener != null) {
            promptFragmentListener.onDismiss(dialogInterface);
        }
    }
}
