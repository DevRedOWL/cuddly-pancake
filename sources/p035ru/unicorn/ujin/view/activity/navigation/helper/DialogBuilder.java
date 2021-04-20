package p035ru.unicorn.ujin.view.activity.navigation.helper;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p035ru.mysmartflat.kortros.R;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.helper.DialogBuilder */
public class DialogBuilder {
    private final int buttonNegativeColor;
    private final int buttonPositiveColor;
    private CardView card;

    /* renamed from: cl */
    private ConstraintLayout f6733cl;
    private final Context context;
    private EditText editText;
    private int layoutRes;
    private final int mainBackGroundColor;
    private TextView negative;
    private final String negativeButtonName;
    private final OnButtonDialogClick onDialogClick;
    private TextView positive;
    private final String positiveButtonName;
    private final int subTiltleTextColor;
    private final String subtitle;
    private final int subtitleGravity;
    private final String title;
    private final int titleTextColor;
    private TextView tvSubtitle;
    private TextView tvTitle;
    private View view;

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.helper.DialogBuilder$OnButtonDialogClick */
    public interface OnButtonDialogClick {
        void onNegativeClick(AlertDialog alertDialog);

        void onPositiveClick(AlertDialog alertDialog);
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.helper.DialogBuilder$Builder */
    public static class Builder {
        /* access modifiers changed from: private */
        public int buttonNegativeColor = -1;
        /* access modifiers changed from: private */
        public int buttonPositiveColor = -1;
        /* access modifiers changed from: private */
        public Context context;
        /* access modifiers changed from: private */
        public int layoutRes = R.layout.item_simple_dialogue;
        /* access modifiers changed from: private */
        public int mainBackGroundColor = -1;
        /* access modifiers changed from: private */
        public String negativeButtonName;
        /* access modifiers changed from: private */
        public OnButtonDialogClick onDialogClick;
        /* access modifiers changed from: private */
        public String positiveButtonName;
        /* access modifiers changed from: private */
        public int subTiltleTextColor = -1;
        /* access modifiers changed from: private */
        public String subtitle = "";
        /* access modifiers changed from: private */
        public int subtitleGravity = -1;
        /* access modifiers changed from: private */
        public String title = "";
        /* access modifiers changed from: private */
        public int titleTextColor = -1;
        /* access modifiers changed from: private */
        public View view;

        public Builder(Context context2) {
            this.context = context2;
            this.positiveButtonName = context2.getString(R.string.ok);
            this.negativeButtonName = context2.getString(R.string.cancel);
        }

        public Builder mainBackGroundColor(int i) {
            this.mainBackGroundColor = i;
            return this;
        }

        public Builder titleTextColor(int i) {
            this.titleTextColor = i;
            return this;
        }

        public Builder subTitleTextColor(int i) {
            this.subTiltleTextColor = i;
            return this;
        }

        public Builder buttonNegativeColor(int i) {
            this.buttonNegativeColor = i;
            return this;
        }

        public Builder buttonPositiveColor(int i) {
            this.buttonPositiveColor = i;
            return this;
        }

        public Builder callback(OnButtonDialogClick onButtonDialogClick) {
            this.onDialogClick = onButtonDialogClick;
            return this;
        }

        public Builder subtitleGravity(int i) {
            this.subtitleGravity = i;
            return this;
        }

        public Builder layoutRes(int i) {
            this.layoutRes = i;
            return this;
        }

        public Builder view(View view2) {
            this.view = view2;
            return this;
        }

        public Builder title(String str) {
            this.title = str;
            return this;
        }

        public Builder subtitle(String str) {
            this.subtitle = str;
            return this;
        }

        public Builder positeButtonName(String str) {
            this.positiveButtonName = str;
            return this;
        }

        public Builder negativeButtonName(String str) {
            this.negativeButtonName = str;
            return this;
        }

        public void build() {
            new DialogBuilder(this);
        }
    }

    private DialogBuilder(Builder builder) {
        this.context = builder.context;
        this.positiveButtonName = builder.positiveButtonName;
        this.negativeButtonName = builder.negativeButtonName;
        this.onDialogClick = builder.onDialogClick;
        this.subtitleGravity = builder.subtitleGravity;
        this.view = builder.view;
        this.layoutRes = builder.layoutRes;
        this.mainBackGroundColor = builder.mainBackGroundColor;
        this.title = builder.title;
        this.subtitle = builder.subtitle;
        this.buttonPositiveColor = builder.buttonPositiveColor;
        this.buttonNegativeColor = builder.buttonNegativeColor;
        this.titleTextColor = builder.titleTextColor;
        this.subTiltleTextColor = builder.subTiltleTextColor;
        if (this.view == null) {
            this.view = LayoutInflater.from(this.context).inflate(this.layoutRes, (ViewGroup) null);
        }
        AlertDialog.Builder builder2 = new AlertDialog.Builder(builder.context);
        builder2.setView(this.view);
        this.tvTitle = (TextView) this.view.findViewById(R.id.title);
        this.tvSubtitle = (TextView) this.view.findViewById(R.id.subtitle);
        this.positive = (TextView) this.view.findViewById(R.id.positive);
        this.negative = (TextView) this.view.findViewById(R.id.negative);
        this.card = (CardView) this.view.findViewById(R.id.card);
        this.f6733cl = (ConstraintLayout) this.view.findViewById(R.id.cl);
        this.editText = (EditText) this.view.findViewById(R.id.et);
        int i = this.mainBackGroundColor;
        if (i != -1) {
            this.f6733cl.setBackgroundColor(i);
        }
        int i2 = this.buttonNegativeColor;
        if (i2 != -1) {
            this.negative.setTextColor(i2);
        }
        int i3 = this.buttonPositiveColor;
        if (i3 != -1) {
            this.positive.setTextColor(i3);
        }
        int i4 = this.titleTextColor;
        if (i4 != -1) {
            this.tvTitle.setTextColor(i4);
        }
        int i5 = this.subTiltleTextColor;
        if (i5 != -1) {
            this.tvSubtitle.setTextColor(i5);
        }
        this.positive.setText(this.positiveButtonName);
        this.negative.setText(this.negativeButtonName);
        if (this.title.isEmpty()) {
            this.tvTitle.setVisibility(8);
        } else {
            this.tvTitle.setText(this.title);
        }
        this.tvSubtitle.setText(this.subtitle);
        int i6 = this.subtitleGravity;
        if (i6 != -1) {
            this.tvSubtitle.setGravity(i6);
        }
        AlertDialog create = builder2.create();
        create.show();
        if (this.onDialogClick != null) {
            this.positive.setOnClickListener(new View.OnClickListener(create) {
                private final /* synthetic */ AlertDialog f$1;

                {
                    this.f$1 = r2;
                }

                public final void onClick(View view) {
                    DialogBuilder.this.lambda$new$0$DialogBuilder(this.f$1, view);
                }
            });
            this.negative.setOnClickListener(new View.OnClickListener(create) {
                private final /* synthetic */ AlertDialog f$1;

                {
                    this.f$1 = r2;
                }

                public final void onClick(View view) {
                    DialogBuilder.this.lambda$new$1$DialogBuilder(this.f$1, view);
                }
            });
        }
    }

    public /* synthetic */ void lambda$new$0$DialogBuilder(AlertDialog alertDialog, View view2) {
        this.onDialogClick.onPositiveClick(alertDialog);
    }

    public /* synthetic */ void lambda$new$1$DialogBuilder(AlertDialog alertDialog, View view2) {
        this.onDialogClick.onNegativeClick(alertDialog);
    }
}
