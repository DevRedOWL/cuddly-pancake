package com.google.firebase.iid;

/* compiled from: com.google.firebase:firebase-iid@@21.0.1 */
final class InstanceIdResultImpl implements InstanceIdResult {

    /* renamed from: id */
    private final String f2232id;
    private final String token;

    InstanceIdResultImpl(String str, String str2) {
        this.f2232id = str;
        this.token = str2;
    }

    public String getId() {
        return this.f2232id;
    }

    public String getToken() {
        return this.token;
    }
}
