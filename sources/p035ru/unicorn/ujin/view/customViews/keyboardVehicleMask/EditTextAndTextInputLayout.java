package p035ru.unicorn.ujin.view.customViews.keyboardVehicleMask;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, mo51343d2 = {"Lru/unicorn/ujin/view/customViews/keyboardVehicleMask/EditTextAndTextInputLayout;", "", "editText", "Landroid/widget/EditText;", "textInputLayout", "Lcom/google/android/material/textfield/TextInputLayout;", "(Landroid/widget/EditText;Lcom/google/android/material/textfield/TextInputLayout;)V", "getEditText", "()Landroid/widget/EditText;", "getTextInputLayout", "()Lcom/google/android/material/textfield/TextInputLayout;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.customViews.keyboardVehicleMask.EditTextAndTextInputLayout */
/* compiled from: EditTextAndTextInputLayout.kt */
public final class EditTextAndTextInputLayout {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final EditText editText;
    private final TextInputLayout textInputLayout;

    public static /* synthetic */ EditTextAndTextInputLayout copy$default(EditTextAndTextInputLayout editTextAndTextInputLayout, EditText editText2, TextInputLayout textInputLayout2, int i, Object obj) {
        if ((i & 1) != 0) {
            editText2 = editTextAndTextInputLayout.editText;
        }
        if ((i & 2) != 0) {
            textInputLayout2 = editTextAndTextInputLayout.textInputLayout;
        }
        return editTextAndTextInputLayout.copy(editText2, textInputLayout2);
    }

    @JvmStatic
    public static final ArrayList<EditTextAndTextInputLayout> removeByEditText(ArrayList<EditTextAndTextInputLayout> arrayList, EditText editText2) {
        return Companion.removeByEditText(arrayList, editText2);
    }

    public final EditText component1() {
        return this.editText;
    }

    public final TextInputLayout component2() {
        return this.textInputLayout;
    }

    public final EditTextAndTextInputLayout copy(EditText editText2, TextInputLayout textInputLayout2) {
        Intrinsics.checkNotNullParameter(editText2, "editText");
        Intrinsics.checkNotNullParameter(textInputLayout2, "textInputLayout");
        return new EditTextAndTextInputLayout(editText2, textInputLayout2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditTextAndTextInputLayout)) {
            return false;
        }
        EditTextAndTextInputLayout editTextAndTextInputLayout = (EditTextAndTextInputLayout) obj;
        return Intrinsics.areEqual((Object) this.editText, (Object) editTextAndTextInputLayout.editText) && Intrinsics.areEqual((Object) this.textInputLayout, (Object) editTextAndTextInputLayout.textInputLayout);
    }

    public int hashCode() {
        EditText editText2 = this.editText;
        int i = 0;
        int hashCode = (editText2 != null ? editText2.hashCode() : 0) * 31;
        TextInputLayout textInputLayout2 = this.textInputLayout;
        if (textInputLayout2 != null) {
            i = textInputLayout2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "EditTextAndTextInputLayout(editText=" + this.editText + ", textInputLayout=" + this.textInputLayout + ")";
    }

    public EditTextAndTextInputLayout(EditText editText2, TextInputLayout textInputLayout2) {
        Intrinsics.checkNotNullParameter(editText2, "editText");
        Intrinsics.checkNotNullParameter(textInputLayout2, "textInputLayout");
        this.editText = editText2;
        this.textInputLayout = textInputLayout2;
    }

    public final EditText getEditText() {
        return this.editText;
    }

    public final TextInputLayout getTextInputLayout() {
        return this.textInputLayout;
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, mo51343d2 = {"Lru/unicorn/ujin/view/customViews/keyboardVehicleMask/EditTextAndTextInputLayout$Companion;", "", "()V", "removeByEditText", "Ljava/util/ArrayList;", "Lru/unicorn/ujin/view/customViews/keyboardVehicleMask/EditTextAndTextInputLayout;", "editTextList", "editText", "Landroid/widget/EditText;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.customViews.keyboardVehicleMask.EditTextAndTextInputLayout$Companion */
    /* compiled from: EditTextAndTextInputLayout.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final ArrayList<EditTextAndTextInputLayout> removeByEditText(ArrayList<EditTextAndTextInputLayout> arrayList, EditText editText) {
            Intrinsics.checkNotNullParameter(arrayList, "editTextList");
            Intrinsics.checkNotNullParameter(editText, "editText");
            Collection arrayList2 = new ArrayList();
            for (Object next : arrayList) {
                if (!((EditTextAndTextInputLayout) next).getEditText().equals(editText)) {
                    arrayList2.add(next);
                }
            }
            return (ArrayList) ((List) arrayList2);
        }
    }
}
