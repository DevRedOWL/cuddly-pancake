package com.redmadrobot.inputmask.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, mo51343d2 = {"Lcom/redmadrobot/inputmask/model/CaretString;", "", "string", "", "caretPosition", "", "(Ljava/lang/String;I)V", "getCaretPosition", "()I", "getString", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "input-mask-android_release"}, mo51344k = 1, mo51345mv = {1, 1, 13})
/* compiled from: CaretString.kt */
public final class CaretString {
    private final int caretPosition;
    private final String string;

    public static /* synthetic */ CaretString copy$default(CaretString caretString, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = caretString.string;
        }
        if ((i2 & 2) != 0) {
            i = caretString.caretPosition;
        }
        return caretString.copy(str, i);
    }

    public final String component1() {
        return this.string;
    }

    public final int component2() {
        return this.caretPosition;
    }

    public final CaretString copy(String str, int i) {
        Intrinsics.checkParameterIsNotNull(str, "string");
        return new CaretString(str, i);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CaretString) {
                CaretString caretString = (CaretString) obj;
                if (Intrinsics.areEqual((Object) this.string, (Object) caretString.string)) {
                    if (this.caretPosition == caretString.caretPosition) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.string;
        return ((str != null ? str.hashCode() : 0) * 31) + this.caretPosition;
    }

    public String toString() {
        return "CaretString(string=" + this.string + ", caretPosition=" + this.caretPosition + ")";
    }

    public CaretString(String str, int i) {
        Intrinsics.checkParameterIsNotNull(str, "string");
        this.string = str;
        this.caretPosition = i;
    }

    public final int getCaretPosition() {
        return this.caretPosition;
    }

    public final String getString() {
        return this.string;
    }
}
