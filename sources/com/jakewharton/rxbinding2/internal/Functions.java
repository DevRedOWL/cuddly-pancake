package com.jakewharton.rxbinding2.internal;

import java.util.concurrent.Callable;
import p046io.reactivex.functions.Predicate;

public final class Functions {
    private static final Always ALWAYS_TRUE = new Always(true);
    public static final Callable<Boolean> CALLABLE_ALWAYS_TRUE;
    public static final Predicate<Object> PREDICATE_ALWAYS_TRUE;

    static {
        Always always = ALWAYS_TRUE;
        CALLABLE_ALWAYS_TRUE = always;
        PREDICATE_ALWAYS_TRUE = always;
    }

    private static final class Always implements Callable<Boolean>, Predicate<Object> {
        private final Boolean value;

        Always(Boolean bool) {
            this.value = bool;
        }

        public Boolean call() {
            return this.value;
        }

        public boolean test(Object obj) throws Exception {
            return this.value.booleanValue();
        }
    }

    private Functions() {
        throw new AssertionError("No instances.");
    }
}
