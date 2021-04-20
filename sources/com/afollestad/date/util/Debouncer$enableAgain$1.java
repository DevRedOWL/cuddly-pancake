package com.afollestad.date.util;

import kotlin.Metadata;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo51343d2 = {"<anonymous>", "", "run"}, mo51344k = 3, mo51345mv = {1, 1, 15})
/* compiled from: Debouncer.kt */
final class Debouncer$enableAgain$1 implements Runnable {
    public static final Debouncer$enableAgain$1 INSTANCE = new Debouncer$enableAgain$1();

    Debouncer$enableAgain$1() {
    }

    public final void run() {
        Debouncer.enabled = true;
    }
}
