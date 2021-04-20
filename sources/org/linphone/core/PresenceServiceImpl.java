package org.linphone.core;

public class PresenceServiceImpl implements PresenceService {
    private long mNativePtr;

    private native int addNote(long j, long j2);

    private native int clearNotes(long j);

    private native int getBasicStatus(long j);

    private native String getContact(long j);

    private native String getId(long j);

    private native long getNbNotes(long j);

    private native Object getNthNote(long j, long j2);

    private native long newPresenceServiceImpl(String str, int i, String str2);

    private native int setBasicStatus(long j, int i);

    private native int setContact(long j, String str);

    private native int setId(long j, String str);

    private native void unref(long j);

    protected PresenceServiceImpl(long j) {
        this.mNativePtr = j;
    }

    protected PresenceServiceImpl(String str, PresenceBasicStatus presenceBasicStatus, String str2) {
        this.mNativePtr = newPresenceServiceImpl(str, presenceBasicStatus.toInt(), str2);
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        unref(this.mNativePtr);
    }

    public String getId() {
        return getId(this.mNativePtr);
    }

    public int setId(String str) {
        return setId(this.mNativePtr, str);
    }

    public PresenceBasicStatus getBasicStatus() {
        return PresenceBasicStatus.fromInt(getBasicStatus(this.mNativePtr));
    }

    public int setBasicStatus(PresenceBasicStatus presenceBasicStatus) {
        return setBasicStatus(this.mNativePtr, presenceBasicStatus.toInt());
    }

    public String getContact() {
        return getContact(this.mNativePtr);
    }

    public int setContact(String str) {
        return setContact(this.mNativePtr, str);
    }

    public long getNbNotes() {
        return getNbNotes(this.mNativePtr);
    }

    public PresenceNote getNthNote(long j) {
        return (PresenceNote) getNthNote(this.mNativePtr, j);
    }

    public int addNote(PresenceNote presenceNote) {
        return addNote(this.mNativePtr, presenceNote.getNativePtr());
    }

    public int clearNotes() {
        return clearNotes(this.mNativePtr);
    }

    public long getNativePtr() {
        return this.mNativePtr;
    }
}
