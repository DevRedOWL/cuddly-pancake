package org.linphone.core;

public class LinphoneConferenceImpl implements LinphoneConference {
    private final long nativePtr;

    private native LinphoneAddress[] getParticipants(long j);

    private native int removeParticipant(long j, LinphoneAddress linphoneAddress);

    private LinphoneConferenceImpl(long j) {
        this.nativePtr = j;
    }

    public LinphoneAddress[] getParticipants() {
        return getParticipants(this.nativePtr);
    }

    public int removeParticipant(LinphoneAddress linphoneAddress) {
        return removeParticipant(this.nativePtr, linphoneAddress);
    }
}
