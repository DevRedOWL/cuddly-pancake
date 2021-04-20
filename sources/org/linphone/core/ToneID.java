package org.linphone.core;

public enum ToneID {
    Undefined(0),
    Busy(1),
    CallWaiting(2),
    CallOnHold(3),
    CallLost(4);
    
    protected final int mValue;

    private ToneID(int i) {
        this.mValue = i;
    }

    protected static ToneID fromInt(int i) throws LinphoneCoreException {
        if (i == 0) {
            return Undefined;
        }
        if (i == 1) {
            return Busy;
        }
        if (i == 2) {
            return CallWaiting;
        }
        if (i == 3) {
            return CallOnHold;
        }
        if (i == 4) {
            return CallLost;
        }
        throw new LinphoneCoreException("Unhandled enum value " + i + " for LinphoneToneID");
    }
}
