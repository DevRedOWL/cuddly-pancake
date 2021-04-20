package org.linphone.core;

public class PresencePersonImpl implements PresencePerson {
    private long mNativePtr;

    private native int addActivitiesNote(long j, long j2);

    private native int addActivity(long j, long j2);

    private native int addNote(long j, long j2);

    private native int clearActivitesNotes(long j);

    private native int clearActivities(long j);

    private native int clearNotes(long j);

    private native String getId(long j);

    private native long getNbActivities(long j);

    private native long getNbActivitiesNotes(long j);

    private native long getNbNotes(long j);

    private native Object getNthActivitiesNote(long j, long j2);

    private native Object getNthActivity(long j, long j2);

    private native Object getNthNote(long j, long j2);

    private native long newPresencePersonImpl(String str);

    private native int setId(long j, String str);

    private native void unref(long j);

    protected PresencePersonImpl(long j) {
        this.mNativePtr = j;
    }

    protected PresencePersonImpl(String str) {
        this.mNativePtr = newPresencePersonImpl(str);
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

    public long getNbActivities() {
        return getNbActivities(this.mNativePtr);
    }

    public PresenceActivity getNthActivity(long j) {
        return (PresenceActivity) getNthActivity(this.mNativePtr, j);
    }

    public int addActivity(PresenceActivity presenceActivity) {
        return addActivity(this.mNativePtr, presenceActivity.getNativePtr());
    }

    public int clearActivities() {
        return clearActivities(this.mNativePtr);
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

    public long getNbActivitiesNotes() {
        return getNbActivitiesNotes(this.mNativePtr);
    }

    public PresenceNote getNthActivitiesNote(long j) {
        return (PresenceNote) getNthActivitiesNote(this.mNativePtr, j);
    }

    public int addActivitiesNote(PresenceNote presenceNote) {
        return addActivitiesNote(this.mNativePtr, presenceNote.getNativePtr());
    }

    public int clearActivitesNotes() {
        return clearActivitesNotes(this.mNativePtr);
    }

    public long getNativePtr() {
        return this.mNativePtr;
    }
}
