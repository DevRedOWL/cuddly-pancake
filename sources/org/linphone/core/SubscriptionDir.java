package org.linphone.core;

public enum SubscriptionDir {
    Incoming(0),
    Outgoing(1),
    Invalid(2);
    
    protected final int mValue;

    private SubscriptionDir(int i) {
        this.mValue = i;
    }

    protected static SubscriptionDir fromInt(int i) {
        if (i == 0) {
            return Incoming;
        }
        if (i != 1) {
            return Invalid;
        }
        return Outgoing;
    }
}
