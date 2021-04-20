package com.google.firebase.crashlytics.internal.common;

public enum DeliveryMechanism {
    DEVELOPER(1),
    USER_SIDELOAD(2),
    TEST_DISTRIBUTION(3),
    APP_STORE(4);
    

    /* renamed from: id */
    private final int f2226id;

    private DeliveryMechanism(int i) {
        this.f2226id = i;
    }

    public int getId() {
        return this.f2226id;
    }

    public String toString() {
        return Integer.toString(this.f2226id);
    }

    public static DeliveryMechanism determineFrom(String str) {
        return str != null ? APP_STORE : DEVELOPER;
    }
}
