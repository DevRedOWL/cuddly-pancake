package p007at.nineyards.anyline.core;

/* renamed from: at.nineyards.anyline.core.Map_String_Shared_ptr_Variable */
public class Map_String_Shared_ptr_Variable {

    /* renamed from: a */
    private transient long f454a;
    protected transient boolean swigCMemOwn;

    protected Map_String_Shared_ptr_Variable(long j, boolean z) {
        this.swigCMemOwn = z;
        this.f454a = j;
    }

    protected static long getCPtr(Map_String_Shared_ptr_Variable map_String_Shared_ptr_Variable) {
        if (map_String_Shared_ptr_Variable == null) {
            return 0;
        }
        return map_String_Shared_ptr_Variable.f454a;
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        delete();
    }

    public synchronized void delete() {
        if (this.f454a != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                anyline_coreJNI.delete_Map_String_Shared_ptr_Variable(this.f454a);
            }
            this.f454a = 0;
        }
    }

    public Map_String_Shared_ptr_Variable() {
        this(anyline_coreJNI.new_Map_String_Shared_ptr_Variable__SWIG_0(), true);
    }

    public Map_String_Shared_ptr_Variable(Map_String_Shared_ptr_Variable map_String_Shared_ptr_Variable) {
        this(anyline_coreJNI.new_Map_String_Shared_ptr_Variable__SWIG_1(getCPtr(map_String_Shared_ptr_Variable), map_String_Shared_ptr_Variable), true);
    }

    public long size() {
        return anyline_coreJNI.Map_String_Shared_ptr_Variable_size(this.f454a, this);
    }

    public boolean empty() {
        return anyline_coreJNI.Map_String_Shared_ptr_Variable_empty(this.f454a, this);
    }

    public void clear() {
        anyline_coreJNI.Map_String_Shared_ptr_Variable_clear(this.f454a, this);
    }

    public Variable get(String str) {
        long Map_String_Shared_ptr_Variable_get = anyline_coreJNI.Map_String_Shared_ptr_Variable_get(this.f454a, this, str);
        if (Map_String_Shared_ptr_Variable_get == 0) {
            return null;
        }
        return new Variable(Map_String_Shared_ptr_Variable_get, true);
    }

    public void set(String str, Variable variable) {
        anyline_coreJNI.Map_String_Shared_ptr_Variable_set(this.f454a, this, str, Variable.getCPtr(variable), variable);
    }

    public void del(String str) {
        anyline_coreJNI.Map_String_Shared_ptr_Variable_del(this.f454a, this, str);
    }

    public boolean has_key(String str) {
        return anyline_coreJNI.Map_String_Shared_ptr_Variable_has_key(this.f454a, this, str);
    }
}
