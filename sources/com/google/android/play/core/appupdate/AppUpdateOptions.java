package com.google.android.play.core.appupdate;

public abstract class AppUpdateOptions {

    public static abstract class Builder {
        public abstract AppUpdateOptions build();

        public abstract Builder setAllowAssetPackDeletion(boolean z);

        public abstract Builder setAppUpdateType(int i);
    }

    public static AppUpdateOptions defaultOptions(int i) {
        return newBuilder(i).build();
    }

    public static Builder newBuilder(int i) {
        C2113s sVar = new C2113s();
        sVar.setAppUpdateType(i);
        sVar.setAllowAssetPackDeletion(false);
        return sVar;
    }

    public abstract boolean allowAssetPackDeletion();

    public abstract int appUpdateType();
}
