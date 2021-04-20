package p007at.nineyards.anyline.core;

/* renamed from: at.nineyards.anyline.core.Map_String_Integer */
public class Map_String_Integer {

    /* renamed from: a */
    private transient long f452a;
    protected transient boolean swigCMemOwn;

    protected Map_String_Integer(long j, boolean z) {
        this.swigCMemOwn = z;
        this.f452a = j;
    }

    protected static long getCPtr(Map_String_Integer map_String_Integer) {
        if (map_String_Integer == null) {
            return 0;
        }
        return map_String_Integer.f452a;
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        delete();
    }

    public synchronized void delete() {
        if (this.f452a != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                anyline_coreJNI.delete_Map_String_Integer(this.f452a);
            }
            this.f452a = 0;
        }
    }

    public Map_String_Integer() {
        this(anyline_coreJNI.new_Map_String_Integer__SWIG_0(), true);
    }

    public Map_String_Integer(Map_String_Integer map_String_Integer) {
        this(anyline_coreJNI.new_Map_String_Integer__SWIG_1(getCPtr(map_String_Integer), map_String_Integer), true);
    }

    public long size() {
        return anyline_coreJNI.Map_String_Integer_size(this.f452a, this);
    }

    public boolean empty() {
        return anyline_coreJNI.Map_String_Integer_empty(this.f452a, this);
    }

    public void clear() {
        anyline_coreJNI.Map_String_Integer_clear(this.f452a, this);
    }

    public int get(String str) {
        return anyline_coreJNI.Map_String_Integer_get(this.f452a, this, str);
    }

    public void set(String str, int i) {
        anyline_coreJNI.Map_String_Integer_set(this.f452a, this, str, i);
    }

    public void del(String str) {
        anyline_coreJNI.Map_String_Integer_del(this.f452a, this, str);
    }

    public boolean has_key(String str) {
        return anyline_coreJNI.Map_String_Integer_has_key(this.f452a, this, str);
    }
}
