package p007at.nineyards.anyline.core;

/* renamed from: at.nineyards.anyline.core.Map_String_String */
public class Map_String_String {

    /* renamed from: a */
    private transient long f455a;
    protected transient boolean swigCMemOwn;

    protected Map_String_String(long j, boolean z) {
        this.swigCMemOwn = z;
        this.f455a = j;
    }

    protected static long getCPtr(Map_String_String map_String_String) {
        if (map_String_String == null) {
            return 0;
        }
        return map_String_String.f455a;
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        delete();
    }

    public synchronized void delete() {
        if (this.f455a != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                anyline_coreJNI.delete_Map_String_String(this.f455a);
            }
            this.f455a = 0;
        }
    }

    public Map_String_String() {
        this(anyline_coreJNI.new_Map_String_String__SWIG_0(), true);
    }

    public Map_String_String(Map_String_String map_String_String) {
        this(anyline_coreJNI.new_Map_String_String__SWIG_1(getCPtr(map_String_String), map_String_String), true);
    }

    public long size() {
        return anyline_coreJNI.Map_String_String_size(this.f455a, this);
    }

    public boolean empty() {
        return anyline_coreJNI.Map_String_String_empty(this.f455a, this);
    }

    public void clear() {
        anyline_coreJNI.Map_String_String_clear(this.f455a, this);
    }

    public String get(String str) {
        return anyline_coreJNI.Map_String_String_get(this.f455a, this, str);
    }

    public void set(String str, String str2) {
        anyline_coreJNI.Map_String_String_set(this.f455a, this, str, str2);
    }

    public void del(String str) {
        anyline_coreJNI.Map_String_String_del(this.f455a, this, str);
    }

    public boolean has_key(String str) {
        return anyline_coreJNI.Map_String_String_has_key(this.f455a, this, str);
    }
}
