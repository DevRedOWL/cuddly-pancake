package org.linphone.core;

public enum PublishState {
    None(0),
    Progress(1),
    Ok(2),
    Error(3),
    Expiring(4),
    Cleared(5);
    
    protected final int mValue;

    private PublishState(int i) {
        this.mValue = i;
    }

    protected static PublishState fromInt(int i) throws LinphoneCoreException {
        if (i == 0) {
            return None;
        }
        if (i == 1) {
            return Progress;
        }
        if (i == 2) {
            return Ok;
        }
        if (i == 3) {
            return Error;
        }
        if (i == 4) {
            return Expiring;
        }
        if (i == 5) {
            return Cleared;
        }
        throw new LinphoneCoreException("Unhandled enum value " + i + " for PublishState");
    }
}
