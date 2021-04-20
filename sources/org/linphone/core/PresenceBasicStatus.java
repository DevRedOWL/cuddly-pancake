package org.linphone.core;

public enum PresenceBasicStatus {
    Open(0),
    Closed(1),
    Invalid(2);
    
    protected final int mValue;

    private PresenceBasicStatus(int i) {
        this.mValue = i;
    }

    public int toInt() {
        return this.mValue;
    }

    protected static PresenceBasicStatus fromInt(int i) {
        if (i == 0) {
            return Open;
        }
        if (i != 1) {
            return Invalid;
        }
        return Closed;
    }
}
