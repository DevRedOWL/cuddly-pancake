package com.afollestad.materialdialogs.files;

import android.text.InputFilter;
import android.text.Spanned;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0007\u001a\n \u0003*\u0004\u0018\u00010\b0\b2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005H\n¢\u0006\u0002\b\u000b"}, mo51343d2 = {"<anonymous>", "", "source", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "<anonymous parameter 2>", "<anonymous parameter 3>", "Landroid/text/Spanned;", "<anonymous parameter 4>", "<anonymous parameter 5>", "filter"}, mo51344k = 3, mo51345mv = {1, 1, 16})
/* compiled from: DialogFileChooserExt.kt */
final class DialogFileChooserExtKt$blockReservedCharacters$1 implements InputFilter {
    public static final DialogFileChooserExtKt$blockReservedCharacters$1 INSTANCE = new DialogFileChooserExtKt$blockReservedCharacters$1();

    DialogFileChooserExtKt$blockReservedCharacters$1() {
    }

    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        Intrinsics.checkExpressionValueIsNotNull(charSequence, "source");
        if (charSequence.length() == 0) {
            return null;
        }
        if (StringsKt.indexOf$default((CharSequence) "?:\"*|/\\<>", charSequence.charAt(charSequence.length() - 1), 0, false, 6, (Object) null) > -1) {
            return charSequence.subSequence(0, charSequence.length() - 1);
        }
        return null;
    }
}
