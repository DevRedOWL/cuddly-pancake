package p035ru.unicorn.ujin.view.customViews.fields;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.textfield.TextInputEditText;
import com.redmadrobot.inputmask.MaskedTextChangedListener;
import com.redmadrobot.inputmask.helper.AffinityCalculationStrategy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\t\"\u0004\b\n\u0010\u000bR5\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00110\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R5\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00110\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0013\"\u0004\b\u001a\u0010\u0015R\u001a\u0010\u0018\u001a\u00020\u0017X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006 "}, mo51343d2 = {"Lru/unicorn/ujin/view/customViews/fields/PhoneMaskedEditText;", "Lcom/google/android/material/textfield/TextInputEditText;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "isValid", "", "()Z", "setValid", "(Z)V", "onTextChangedListener", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "maskFilled", "", "getOnTextChangedListener", "()Lkotlin/jvm/functions/Function1;", "setOnTextChangedListener", "(Lkotlin/jvm/functions/Function1;)V", "onTextCompletedListener", "", "value", "getOnTextCompletedListener", "setOnTextCompletedListener", "getValue", "()Ljava/lang/String;", "setValue", "(Ljava/lang/String;)V", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.customViews.fields.PhoneMaskedEditText */
/* compiled from: PhoneMaskedEditText.kt */
public final class PhoneMaskedEditText extends TextInputEditText {
    public static final String AFFINE_INPUT_PHONE_MASK = "8 ([000]) [000]-[00]-[00]";
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String INPUT_PHONE_MASK = "+7 ([000]) [000]-[00]-[00]";
    private HashMap _$_findViewCache;
    private boolean isValid;
    private Function1<? super Boolean, Unit> onTextChangedListener = PhoneMaskedEditText$onTextChangedListener$1.INSTANCE;
    private Function1<? super String, Unit> onTextCompletedListener = PhoneMaskedEditText$onTextCompletedListener$1.INSTANCE;
    private String value = "";

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PhoneMaskedEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        List arrayList = new ArrayList();
        arrayList.add("8 ([000]) [000]-[00]-[00]");
        MaskedTextChangedListener.Companion.installOn(this, "+7 ([000]) [000]-[00]-[00]", arrayList, AffinityCalculationStrategy.PREFIX, new MaskedTextChangedListener.ValueListener(this) {
            final /* synthetic */ PhoneMaskedEditText this$0;

            {
                this.this$0 = r1;
            }

            public void onTextChanged(boolean z, String str, String str2) {
                Intrinsics.checkNotNullParameter(str, "extractedValue");
                Intrinsics.checkNotNullParameter(str2, "formattedValue");
                if (z) {
                    PhoneMaskedEditText phoneMaskedEditText = this.this$0;
                    phoneMaskedEditText.setValue('7' + str);
                    this.this$0.getOnTextCompletedListener().invoke(str);
                } else {
                    this.this$0.setValue("");
                }
                this.this$0.setValid(z);
                this.this$0.getOnTextChangedListener().invoke(Boolean.valueOf(z));
            }
        });
    }

    public final Function1<String, Unit> getOnTextCompletedListener() {
        return this.onTextCompletedListener;
    }

    public final void setOnTextCompletedListener(Function1<? super String, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.onTextCompletedListener = function1;
    }

    public final Function1<Boolean, Unit> getOnTextChangedListener() {
        return this.onTextChangedListener;
    }

    public final void setOnTextChangedListener(Function1<? super Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.onTextChangedListener = function1;
    }

    public final String getValue() {
        return this.value;
    }

    public final void setValue(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.value = str;
    }

    public final boolean isValid() {
        return this.isValid;
    }

    public final void setValid(boolean z) {
        this.isValid = z;
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, mo51343d2 = {"Lru/unicorn/ujin/view/customViews/fields/PhoneMaskedEditText$Companion;", "", "()V", "AFFINE_INPUT_PHONE_MASK", "", "INPUT_PHONE_MASK", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.customViews.fields.PhoneMaskedEditText$Companion */
    /* compiled from: PhoneMaskedEditText.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
