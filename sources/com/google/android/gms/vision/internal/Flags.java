package com.google.android.gms.vision.internal;

import com.google.android.gms.flags.Flag;

public class Flags {
    private static final Flag<Boolean> zzdg = Flag.define(0, "vision:product_barcode_value_logging_enabled", (Boolean) true);

    private Flags() {
    }
}
