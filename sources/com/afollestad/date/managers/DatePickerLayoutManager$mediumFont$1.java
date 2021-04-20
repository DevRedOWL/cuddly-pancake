package com.afollestad.date.managers;

import android.graphics.Typeface;
import com.afollestad.date.util.TypefaceHelper;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo51343d2 = {"<anonymous>", "Landroid/graphics/Typeface;", "invoke"}, mo51344k = 3, mo51345mv = {1, 1, 15})
/* compiled from: DatePickerLayoutManager.kt */
final class DatePickerLayoutManager$mediumFont$1 extends Lambda implements Function0<Typeface> {
    public static final DatePickerLayoutManager$mediumFont$1 INSTANCE = new DatePickerLayoutManager$mediumFont$1();

    DatePickerLayoutManager$mediumFont$1() {
        super(0);
    }

    public final Typeface invoke() {
        return TypefaceHelper.INSTANCE.create("sans-serif-medium");
    }
}
