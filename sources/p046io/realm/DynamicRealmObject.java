package p046io.realm;

import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import javax.annotation.Nullable;
import p046io.realm.internal.CheckedRow;
import p046io.realm.internal.OsList;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.UncheckedRow;
import p046io.realm.internal.android.JsonUtils;

/* renamed from: io.realm.DynamicRealmObject */
public class DynamicRealmObject extends RealmObject implements RealmObjectProxy {
    static final String MSG_LINK_QUERY_NOT_SUPPORTED = "Queries across relationships are not supported";
    private final ProxyState<DynamicRealmObject> proxyState = new ProxyState<>(this);

    public void realm$injectObjectContext() {
    }

    public DynamicRealmObject(RealmModel realmModel) {
        if (realmModel == null) {
            throw new IllegalArgumentException("A non-null object must be provided.");
        } else if (realmModel instanceof DynamicRealmObject) {
            throw new IllegalArgumentException("The object is already a DynamicRealmObject: " + realmModel);
        } else if (!RealmObject.isManaged(realmModel)) {
            throw new IllegalArgumentException("An object managed by Realm must be provided. This is an unmanaged object.");
        } else if (RealmObject.isValid(realmModel)) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) realmModel;
            Row row$realm = realmObjectProxy.realmGet$proxyState().getRow$realm();
            this.proxyState.setRealm$realm(realmObjectProxy.realmGet$proxyState().getRealm$realm());
            this.proxyState.setRow$realm(((UncheckedRow) row$realm).convertToChecked());
            this.proxyState.setConstructionFinished();
        } else {
            throw new IllegalArgumentException("A valid object managed by Realm must be provided. This object was deleted.");
        }
    }

    DynamicRealmObject(BaseRealm baseRealm, Row row) {
        this.proxyState.setRealm$realm(baseRealm);
        this.proxyState.setRow$realm(row);
        this.proxyState.setConstructionFinished();
    }

    public <E> E get(String str) {
        this.proxyState.getRealm$realm().checkIfValid();
        long columnIndex = this.proxyState.getRow$realm().getColumnIndex(str);
        RealmFieldType columnType = this.proxyState.getRow$realm().getColumnType(columnIndex);
        switch (columnType) {
            case BOOLEAN:
                return Boolean.valueOf(this.proxyState.getRow$realm().getBoolean(columnIndex));
            case INTEGER:
                return Long.valueOf(this.proxyState.getRow$realm().getLong(columnIndex));
            case FLOAT:
                return Float.valueOf(this.proxyState.getRow$realm().getFloat(columnIndex));
            case DOUBLE:
                return Double.valueOf(this.proxyState.getRow$realm().getDouble(columnIndex));
            case STRING:
                return this.proxyState.getRow$realm().getString(columnIndex);
            case BINARY:
                return this.proxyState.getRow$realm().getBinaryByteArray(columnIndex);
            case DATE:
                return this.proxyState.getRow$realm().getDate(columnIndex);
            case OBJECT:
                return getObject(str);
            case LIST:
                return getList(str);
            default:
                throw new IllegalStateException("Field type not supported: " + columnType);
        }
    }

    public boolean getBoolean(String str) {
        this.proxyState.getRealm$realm().checkIfValid();
        long columnIndex = this.proxyState.getRow$realm().getColumnIndex(str);
        try {
            return this.proxyState.getRow$realm().getBoolean(columnIndex);
        } catch (IllegalArgumentException e) {
            checkFieldType(str, columnIndex, RealmFieldType.BOOLEAN);
            throw e;
        }
    }

    public int getInt(String str) {
        return (int) getLong(str);
    }

    public short getShort(String str) {
        return (short) ((int) getLong(str));
    }

    public long getLong(String str) {
        this.proxyState.getRealm$realm().checkIfValid();
        long columnIndex = this.proxyState.getRow$realm().getColumnIndex(str);
        try {
            return this.proxyState.getRow$realm().getLong(columnIndex);
        } catch (IllegalArgumentException e) {
            checkFieldType(str, columnIndex, RealmFieldType.INTEGER);
            throw e;
        }
    }

    public byte getByte(String str) {
        return (byte) ((int) getLong(str));
    }

    public float getFloat(String str) {
        this.proxyState.getRealm$realm().checkIfValid();
        long columnIndex = this.proxyState.getRow$realm().getColumnIndex(str);
        try {
            return this.proxyState.getRow$realm().getFloat(columnIndex);
        } catch (IllegalArgumentException e) {
            checkFieldType(str, columnIndex, RealmFieldType.FLOAT);
            throw e;
        }
    }

    public double getDouble(String str) {
        this.proxyState.getRealm$realm().checkIfValid();
        long columnIndex = this.proxyState.getRow$realm().getColumnIndex(str);
        try {
            return this.proxyState.getRow$realm().getDouble(columnIndex);
        } catch (IllegalArgumentException e) {
            checkFieldType(str, columnIndex, RealmFieldType.DOUBLE);
            throw e;
        }
    }

    public byte[] getBlob(String str) {
        this.proxyState.getRealm$realm().checkIfValid();
        long columnIndex = this.proxyState.getRow$realm().getColumnIndex(str);
        try {
            return this.proxyState.getRow$realm().getBinaryByteArray(columnIndex);
        } catch (IllegalArgumentException e) {
            checkFieldType(str, columnIndex, RealmFieldType.BINARY);
            throw e;
        }
    }

    public String getString(String str) {
        this.proxyState.getRealm$realm().checkIfValid();
        long columnIndex = this.proxyState.getRow$realm().getColumnIndex(str);
        try {
            return this.proxyState.getRow$realm().getString(columnIndex);
        } catch (IllegalArgumentException e) {
            checkFieldType(str, columnIndex, RealmFieldType.STRING);
            throw e;
        }
    }

    public Date getDate(String str) {
        this.proxyState.getRealm$realm().checkIfValid();
        long columnIndex = this.proxyState.getRow$realm().getColumnIndex(str);
        checkFieldType(str, columnIndex, RealmFieldType.DATE);
        if (this.proxyState.getRow$realm().isNull(columnIndex)) {
            return null;
        }
        return this.proxyState.getRow$realm().getDate(columnIndex);
    }

    @Nullable
    public DynamicRealmObject getObject(String str) {
        this.proxyState.getRealm$realm().checkIfValid();
        long columnIndex = this.proxyState.getRow$realm().getColumnIndex(str);
        checkFieldType(str, columnIndex, RealmFieldType.OBJECT);
        if (this.proxyState.getRow$realm().isNullLink(columnIndex)) {
            return null;
        }
        return new DynamicRealmObject(this.proxyState.getRealm$realm(), this.proxyState.getRow$realm().getTable().getLinkTarget(columnIndex).getCheckedRow(this.proxyState.getRow$realm().getLink(columnIndex)));
    }

    public RealmList<DynamicRealmObject> getList(String str) {
        this.proxyState.getRealm$realm().checkIfValid();
        long columnIndex = this.proxyState.getRow$realm().getColumnIndex(str);
        try {
            OsList modelList = this.proxyState.getRow$realm().getModelList(columnIndex);
            return new RealmList<>(modelList.getTargetTable().getClassName(), modelList, this.proxyState.getRealm$realm());
        } catch (IllegalArgumentException e) {
            checkFieldType(str, columnIndex, RealmFieldType.LIST);
            throw e;
        }
    }

    public <E> RealmList<E> getList(String str, Class<E> cls) {
        this.proxyState.getRealm$realm().checkIfValid();
        if (cls != null) {
            long columnIndex = this.proxyState.getRow$realm().getColumnIndex(str);
            RealmFieldType classToRealmType = classToRealmType(cls);
            try {
                return new RealmList<>(cls, this.proxyState.getRow$realm().getValueList(columnIndex, classToRealmType), this.proxyState.getRealm$realm());
            } catch (IllegalArgumentException e) {
                checkFieldType(str, columnIndex, classToRealmType);
                throw e;
            }
        } else {
            throw new IllegalArgumentException("Non-null 'primitiveType' required.");
        }
    }

    private <E> RealmFieldType classToRealmType(Class<E> cls) {
        if (cls.equals(Integer.class) || cls.equals(Long.class) || cls.equals(Short.class) || cls.equals(Byte.class)) {
            return RealmFieldType.INTEGER_LIST;
        }
        if (cls.equals(Boolean.class)) {
            return RealmFieldType.BOOLEAN_LIST;
        }
        if (cls.equals(String.class)) {
            return RealmFieldType.STRING_LIST;
        }
        if (cls.equals(byte[].class)) {
            return RealmFieldType.BINARY_LIST;
        }
        if (cls.equals(Date.class)) {
            return RealmFieldType.DATE_LIST;
        }
        if (cls.equals(Float.class)) {
            return RealmFieldType.FLOAT_LIST;
        }
        if (cls.equals(Double.class)) {
            return RealmFieldType.DOUBLE_LIST;
        }
        throw new IllegalArgumentException("Unsupported element type. Only primitive types supported. Yours was: " + cls);
    }

    public boolean isNull(String str) {
        this.proxyState.getRealm$realm().checkIfValid();
        long columnIndex = this.proxyState.getRow$realm().getColumnIndex(str);
        switch (this.proxyState.getRow$realm().getColumnType(columnIndex)) {
            case BOOLEAN:
            case INTEGER:
            case FLOAT:
            case DOUBLE:
            case STRING:
            case BINARY:
            case DATE:
                return this.proxyState.getRow$realm().isNull(columnIndex);
            case OBJECT:
                return this.proxyState.getRow$realm().isNullLink(columnIndex);
            default:
                return false;
        }
    }

    public boolean hasField(String str) {
        this.proxyState.getRealm$realm().checkIfValid();
        if (str == null || str.isEmpty()) {
            return false;
        }
        return this.proxyState.getRow$realm().hasColumn(str);
    }

    public String[] getFieldNames() {
        this.proxyState.getRealm$realm().checkIfValid();
        String[] strArr = new String[((int) this.proxyState.getRow$realm().getColumnCount())];
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = this.proxyState.getRow$realm().getColumnName((long) i);
        }
        return strArr;
    }

    public void set(String str, Object obj) {
        this.proxyState.getRealm$realm().checkIfValid();
        boolean z = obj instanceof String;
        String str2 = z ? (String) obj : null;
        RealmFieldType columnType = this.proxyState.getRow$realm().getColumnType(this.proxyState.getRow$realm().getColumnIndex(str));
        if (z && columnType != RealmFieldType.STRING) {
            int i = C45301.$SwitchMap$io$realm$RealmFieldType[columnType.ordinal()];
            if (i == 1) {
                obj = Boolean.valueOf(Boolean.parseBoolean(str2));
            } else if (i == 2) {
                obj = Long.valueOf(Long.parseLong(str2));
            } else if (i == 3) {
                obj = Float.valueOf(Float.parseFloat(str2));
            } else if (i == 4) {
                obj = Double.valueOf(Double.parseDouble(str2));
            } else if (i == 7) {
                obj = JsonUtils.stringToDate(str2);
            } else {
                throw new IllegalArgumentException(String.format(Locale.US, "Field %s is not a String field, and the provide value could not be automatically converted: %s. Use a typedsetter instead", new Object[]{str, obj}));
            }
        }
        if (obj == null) {
            setNull(str);
        } else {
            setValue(str, obj);
        }
    }

    private void setValue(String str, Object obj) {
        Class<?> cls = obj.getClass();
        if (cls == Boolean.class) {
            setBoolean(str, ((Boolean) obj).booleanValue());
        } else if (cls == Short.class) {
            setShort(str, ((Short) obj).shortValue());
        } else if (cls == Integer.class) {
            setInt(str, ((Integer) obj).intValue());
        } else if (cls == Long.class) {
            setLong(str, ((Long) obj).longValue());
        } else if (cls == Byte.class) {
            setByte(str, ((Byte) obj).byteValue());
        } else if (cls == Float.class) {
            setFloat(str, ((Float) obj).floatValue());
        } else if (cls == Double.class) {
            setDouble(str, ((Double) obj).doubleValue());
        } else if (cls == String.class) {
            setString(str, (String) obj);
        } else if (obj instanceof Date) {
            setDate(str, (Date) obj);
        } else if (obj instanceof byte[]) {
            setBlob(str, (byte[]) obj);
        } else if (cls == DynamicRealmObject.class) {
            setObject(str, (DynamicRealmObject) obj);
        } else if (cls == RealmList.class) {
            setList(str, (RealmList) obj);
        } else {
            throw new IllegalArgumentException("Value is of an type not supported: " + obj.getClass());
        }
    }

    public void setBoolean(String str, boolean z) {
        this.proxyState.getRealm$realm().checkIfValid();
        this.proxyState.getRow$realm().setBoolean(this.proxyState.getRow$realm().getColumnIndex(str), z);
    }

    public void setShort(String str, short s) {
        this.proxyState.getRealm$realm().checkIfValid();
        checkIsPrimaryKey(str);
        this.proxyState.getRow$realm().setLong(this.proxyState.getRow$realm().getColumnIndex(str), (long) s);
    }

    public void setInt(String str, int i) {
        this.proxyState.getRealm$realm().checkIfValid();
        checkIsPrimaryKey(str);
        this.proxyState.getRow$realm().setLong(this.proxyState.getRow$realm().getColumnIndex(str), (long) i);
    }

    public void setLong(String str, long j) {
        this.proxyState.getRealm$realm().checkIfValid();
        checkIsPrimaryKey(str);
        this.proxyState.getRow$realm().setLong(this.proxyState.getRow$realm().getColumnIndex(str), j);
    }

    public void setByte(String str, byte b) {
        this.proxyState.getRealm$realm().checkIfValid();
        checkIsPrimaryKey(str);
        this.proxyState.getRow$realm().setLong(this.proxyState.getRow$realm().getColumnIndex(str), (long) b);
    }

    public void setFloat(String str, float f) {
        this.proxyState.getRealm$realm().checkIfValid();
        this.proxyState.getRow$realm().setFloat(this.proxyState.getRow$realm().getColumnIndex(str), f);
    }

    public void setDouble(String str, double d) {
        this.proxyState.getRealm$realm().checkIfValid();
        this.proxyState.getRow$realm().setDouble(this.proxyState.getRow$realm().getColumnIndex(str), d);
    }

    public void setString(String str, @Nullable String str2) {
        this.proxyState.getRealm$realm().checkIfValid();
        checkIsPrimaryKey(str);
        this.proxyState.getRow$realm().setString(this.proxyState.getRow$realm().getColumnIndex(str), str2);
    }

    public void setBlob(String str, @Nullable byte[] bArr) {
        this.proxyState.getRealm$realm().checkIfValid();
        this.proxyState.getRow$realm().setBinaryByteArray(this.proxyState.getRow$realm().getColumnIndex(str), bArr);
    }

    public void setDate(String str, @Nullable Date date) {
        this.proxyState.getRealm$realm().checkIfValid();
        long columnIndex = this.proxyState.getRow$realm().getColumnIndex(str);
        if (date == null) {
            this.proxyState.getRow$realm().setNull(columnIndex);
        } else {
            this.proxyState.getRow$realm().setDate(columnIndex, date);
        }
    }

    public void setObject(String str, @Nullable DynamicRealmObject dynamicRealmObject) {
        this.proxyState.getRealm$realm().checkIfValid();
        long columnIndex = this.proxyState.getRow$realm().getColumnIndex(str);
        if (dynamicRealmObject == null) {
            this.proxyState.getRow$realm().nullifyLink(columnIndex);
        } else if (dynamicRealmObject.proxyState.getRealm$realm() == null || dynamicRealmObject.proxyState.getRow$realm() == null) {
            throw new IllegalArgumentException("Cannot link to objects that are not part of the Realm.");
        } else if (this.proxyState.getRealm$realm() == dynamicRealmObject.proxyState.getRealm$realm()) {
            Table linkTarget = this.proxyState.getRow$realm().getTable().getLinkTarget(columnIndex);
            Table table = dynamicRealmObject.proxyState.getRow$realm().getTable();
            if (linkTarget.hasSameSchema(table)) {
                this.proxyState.getRow$realm().setLink(columnIndex, dynamicRealmObject.proxyState.getRow$realm().getIndex());
                return;
            }
            throw new IllegalArgumentException(String.format(Locale.US, "Type of object is wrong. Was %s, expected %s", new Object[]{table.getName(), linkTarget.getName()}));
        } else {
            throw new IllegalArgumentException("Cannot add an object from another Realm instance.");
        }
    }

    public <E> void setList(String str, RealmList<E> realmList) {
        this.proxyState.getRealm$realm().checkIfValid();
        if (realmList != null) {
            RealmFieldType columnType = this.proxyState.getRow$realm().getColumnType(this.proxyState.getRow$realm().getColumnIndex(str));
            switch (columnType) {
                case LIST:
                    if (!realmList.isEmpty()) {
                        E first = realmList.first();
                        if (!(first instanceof DynamicRealmObject) && RealmModel.class.isAssignableFrom(first.getClass())) {
                            throw new IllegalArgumentException("RealmList must contain `DynamicRealmObject's, not Java model classes.");
                        }
                    }
                    setModelList(str, realmList);
                    return;
                case INTEGER_LIST:
                case BOOLEAN_LIST:
                case STRING_LIST:
                case BINARY_LIST:
                case DATE_LIST:
                case FLOAT_LIST:
                case DOUBLE_LIST:
                    setValueList(str, realmList, columnType);
                    return;
                default:
                    throw new IllegalArgumentException(String.format("Field '%s' is not a list but a %s", new Object[]{str, columnType}));
            }
        } else {
            throw new IllegalArgumentException("Non-null 'list' required");
        }
    }

    private void setModelList(String str, RealmList<DynamicRealmObject> realmList) {
        boolean z;
        String str2;
        OsList modelList = this.proxyState.getRow$realm().getModelList(this.proxyState.getRow$realm().getColumnIndex(str));
        Table targetTable = modelList.getTargetTable();
        String className = targetTable.getClassName();
        if (realmList.className == null && realmList.clazz == null) {
            z = false;
        } else {
            if (realmList.className != null) {
                str2 = realmList.className;
            } else {
                str2 = this.proxyState.getRealm$realm().getSchema().getTable((Class<? extends RealmModel>) realmList.clazz).getClassName();
            }
            if (className.equals(str2)) {
                z = true;
            } else {
                throw new IllegalArgumentException(String.format(Locale.US, "The elements in the list are not the proper type. Was %s expected %s.", new Object[]{str2, className}));
            }
        }
        int size = realmList.size();
        long[] jArr = new long[size];
        int i = 0;
        while (i < size) {
            RealmObjectProxy realmObjectProxy = realmList.get(i);
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != this.proxyState.getRealm$realm()) {
                throw new IllegalArgumentException("Each element in 'list' must belong to the same Realm instance.");
            } else if (z || targetTable.hasSameSchema(realmObjectProxy.realmGet$proxyState().getRow$realm().getTable())) {
                jArr[i] = realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
                i++;
            } else {
                throw new IllegalArgumentException(String.format(Locale.US, "Element at index %d is not the proper type. Was '%s' expected '%s'.", new Object[]{Integer.valueOf(i), realmObjectProxy.realmGet$proxyState().getRow$realm().getTable().getClassName(), className}));
            }
        }
        modelList.removeAll();
        for (int i2 = 0; i2 < size; i2++) {
            modelList.addRow(jArr[i2]);
        }
    }

    private <E> void setValueList(String str, RealmList<E> realmList, RealmFieldType realmFieldType) {
        Class cls;
        OsList valueList = this.proxyState.getRow$realm().getValueList(this.proxyState.getRow$realm().getColumnIndex(str), realmFieldType);
        switch (realmFieldType) {
            case INTEGER_LIST:
                cls = Long.class;
                break;
            case BOOLEAN_LIST:
                cls = Boolean.class;
                break;
            case STRING_LIST:
                cls = String.class;
                break;
            case BINARY_LIST:
                cls = byte[].class;
                break;
            case DATE_LIST:
                cls = Date.class;
                break;
            case FLOAT_LIST:
                cls = Float.class;
                break;
            case DOUBLE_LIST:
                cls = Double.class;
                break;
            default:
                throw new IllegalArgumentException("Unsupported type: " + realmFieldType);
        }
        ManagedListOperator operator = getOperator(this.proxyState.getRealm$realm(), valueList, realmFieldType, cls);
        if (!realmList.isManaged() || valueList.size() != ((long) realmList.size())) {
            valueList.removeAll();
            Iterator<E> it = realmList.iterator();
            while (it.hasNext()) {
                operator.append(it.next());
            }
            return;
        }
        int size = realmList.size();
        Iterator<E> it2 = realmList.iterator();
        for (int i = 0; i < size; i++) {
            operator.set(i, it2.next());
        }
    }

    private <E> ManagedListOperator<E> getOperator(BaseRealm baseRealm, OsList osList, RealmFieldType realmFieldType, Class<E> cls) {
        if (realmFieldType == RealmFieldType.STRING_LIST) {
            return new StringListOperator(baseRealm, osList, cls);
        }
        if (realmFieldType == RealmFieldType.INTEGER_LIST) {
            return new LongListOperator(baseRealm, osList, cls);
        }
        if (realmFieldType == RealmFieldType.BOOLEAN_LIST) {
            return new BooleanListOperator(baseRealm, osList, cls);
        }
        if (realmFieldType == RealmFieldType.BINARY_LIST) {
            return new BinaryListOperator(baseRealm, osList, cls);
        }
        if (realmFieldType == RealmFieldType.DOUBLE_LIST) {
            return new DoubleListOperator(baseRealm, osList, cls);
        }
        if (realmFieldType == RealmFieldType.FLOAT_LIST) {
            return new FloatListOperator(baseRealm, osList, cls);
        }
        if (realmFieldType == RealmFieldType.DATE_LIST) {
            return new DateListOperator(baseRealm, osList, cls);
        }
        throw new IllegalArgumentException("Unexpected list type: " + realmFieldType.name());
    }

    public void setNull(String str) {
        this.proxyState.getRealm$realm().checkIfValid();
        long columnIndex = this.proxyState.getRow$realm().getColumnIndex(str);
        if (this.proxyState.getRow$realm().getColumnType(columnIndex) == RealmFieldType.OBJECT) {
            this.proxyState.getRow$realm().nullifyLink(columnIndex);
            return;
        }
        checkIsPrimaryKey(str);
        this.proxyState.getRow$realm().setNull(columnIndex);
    }

    public String getType() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getTable().getClassName();
    }

    public RealmFieldType getFieldType(String str) {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getColumnType(this.proxyState.getRow$realm().getColumnIndex(str));
    }

    private void checkFieldType(String str, long j, RealmFieldType realmFieldType) {
        RealmFieldType columnType = this.proxyState.getRow$realm().getColumnType(j);
        if (columnType != realmFieldType) {
            String str2 = "n";
            String str3 = (realmFieldType == RealmFieldType.INTEGER || realmFieldType == RealmFieldType.OBJECT) ? str2 : "";
            if (!(columnType == RealmFieldType.INTEGER || columnType == RealmFieldType.OBJECT)) {
                str2 = "";
            }
            throw new IllegalArgumentException(String.format(Locale.US, "'%s' is not a%s '%s', but a%s '%s'.", new Object[]{str, str3, realmFieldType, str2, columnType}));
        }
    }

    public int hashCode() {
        this.proxyState.getRealm$realm().checkIfValid();
        String path = this.proxyState.getRealm$realm().getPath();
        String name = this.proxyState.getRow$realm().getTable().getName();
        long index = this.proxyState.getRow$realm().getIndex();
        int i = 0;
        int hashCode = (527 + (path != null ? path.hashCode() : 0)) * 31;
        if (name != null) {
            i = name.hashCode();
        }
        return ((hashCode + i) * 31) + ((int) ((index >>> 32) ^ index));
    }

    public boolean equals(Object obj) {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DynamicRealmObject dynamicRealmObject = (DynamicRealmObject) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = dynamicRealmObject.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = dynamicRealmObject.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 != null : !name.equals(name2)) {
            return false;
        }
        if (this.proxyState.getRow$realm().getIndex() == dynamicRealmObject.proxyState.getRow$realm().getIndex()) {
            return true;
        }
        return false;
    }

    public String toString() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (!this.proxyState.getRow$realm().isAttached()) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder(this.proxyState.getRow$realm().getTable().getClassName() + " = dynamic[");
        for (String str : getFieldNames()) {
            long columnIndex = this.proxyState.getRow$realm().getColumnIndex(str);
            RealmFieldType columnType = this.proxyState.getRow$realm().getColumnType(columnIndex);
            sb.append("{");
            sb.append(str);
            sb.append(":");
            Object obj = "null";
            switch (columnType) {
                case BOOLEAN:
                    Object obj2 = obj;
                    if (!this.proxyState.getRow$realm().isNull(columnIndex)) {
                        obj2 = Boolean.valueOf(this.proxyState.getRow$realm().getBoolean(columnIndex));
                    }
                    sb.append(obj2);
                    break;
                case INTEGER:
                    Object obj3 = obj;
                    if (!this.proxyState.getRow$realm().isNull(columnIndex)) {
                        obj3 = Long.valueOf(this.proxyState.getRow$realm().getLong(columnIndex));
                    }
                    sb.append(obj3);
                    break;
                case FLOAT:
                    Object obj4 = obj;
                    if (!this.proxyState.getRow$realm().isNull(columnIndex)) {
                        obj4 = Float.valueOf(this.proxyState.getRow$realm().getFloat(columnIndex));
                    }
                    sb.append(obj4);
                    break;
                case DOUBLE:
                    Object obj5 = obj;
                    if (!this.proxyState.getRow$realm().isNull(columnIndex)) {
                        obj5 = Double.valueOf(this.proxyState.getRow$realm().getDouble(columnIndex));
                    }
                    sb.append(obj5);
                    break;
                case STRING:
                    sb.append(this.proxyState.getRow$realm().getString(columnIndex));
                    break;
                case BINARY:
                    sb.append(Arrays.toString(this.proxyState.getRow$realm().getBinaryByteArray(columnIndex)));
                    break;
                case DATE:
                    Object obj6 = obj;
                    if (!this.proxyState.getRow$realm().isNull(columnIndex)) {
                        obj6 = this.proxyState.getRow$realm().getDate(columnIndex);
                    }
                    sb.append(obj6);
                    break;
                case OBJECT:
                    String str2 = obj;
                    if (!this.proxyState.getRow$realm().isNullLink(columnIndex)) {
                        str2 = this.proxyState.getRow$realm().getTable().getLinkTarget(columnIndex).getClassName();
                    }
                    sb.append(str2);
                    break;
                case LIST:
                    sb.append(String.format(Locale.US, "RealmList<%s>[%s]", new Object[]{this.proxyState.getRow$realm().getTable().getLinkTarget(columnIndex).getClassName(), Long.valueOf(this.proxyState.getRow$realm().getModelList(columnIndex).size())}));
                    break;
                case INTEGER_LIST:
                    sb.append(String.format(Locale.US, "RealmList<Long>[%s]", new Object[]{Long.valueOf(this.proxyState.getRow$realm().getValueList(columnIndex, columnType).size())}));
                    break;
                case BOOLEAN_LIST:
                    sb.append(String.format(Locale.US, "RealmList<Boolean>[%s]", new Object[]{Long.valueOf(this.proxyState.getRow$realm().getValueList(columnIndex, columnType).size())}));
                    break;
                case STRING_LIST:
                    sb.append(String.format(Locale.US, "RealmList<String>[%s]", new Object[]{Long.valueOf(this.proxyState.getRow$realm().getValueList(columnIndex, columnType).size())}));
                    break;
                case BINARY_LIST:
                    sb.append(String.format(Locale.US, "RealmList<byte[]>[%s]", new Object[]{Long.valueOf(this.proxyState.getRow$realm().getValueList(columnIndex, columnType).size())}));
                    break;
                case DATE_LIST:
                    sb.append(String.format(Locale.US, "RealmList<Date>[%s]", new Object[]{Long.valueOf(this.proxyState.getRow$realm().getValueList(columnIndex, columnType).size())}));
                    break;
                case FLOAT_LIST:
                    sb.append(String.format(Locale.US, "RealmList<Float>[%s]", new Object[]{Long.valueOf(this.proxyState.getRow$realm().getValueList(columnIndex, columnType).size())}));
                    break;
                case DOUBLE_LIST:
                    sb.append(String.format(Locale.US, "RealmList<Double>[%s]", new Object[]{Long.valueOf(this.proxyState.getRow$realm().getValueList(columnIndex, columnType).size())}));
                    break;
                default:
                    sb.append("?");
                    break;
            }
            sb.append("},");
        }
        sb.replace(sb.length() - 1, sb.length(), "");
        sb.append("]");
        return sb.toString();
    }

    public RealmResults<DynamicRealmObject> linkingObjects(String str, String str2) {
        DynamicRealm dynamicRealm = (DynamicRealm) this.proxyState.getRealm$realm();
        dynamicRealm.checkIfValid();
        this.proxyState.getRow$realm().checkIfAttached();
        RealmObjectSchema realmObjectSchema = dynamicRealm.getSchema().get(str);
        if (realmObjectSchema == null) {
            throw new IllegalArgumentException("Class not found: " + str);
        } else if (str2 == null) {
            throw new IllegalArgumentException("Non-null 'srcFieldName' required.");
        } else if (!str2.contains(".")) {
            RealmFieldType fieldType = realmObjectSchema.getFieldType(str2);
            if (fieldType == RealmFieldType.OBJECT || fieldType == RealmFieldType.LIST) {
                return RealmResults.createDynamicBacklinkResults(dynamicRealm, (CheckedRow) this.proxyState.getRow$realm(), realmObjectSchema.getTable(), str2);
            }
            throw new IllegalArgumentException(String.format(Locale.US, "Unexpected field type: %1$s. Field type should be either %2$s.%3$s or %2$s.%4$s.", new Object[]{fieldType.name(), RealmFieldType.class.getSimpleName(), RealmFieldType.OBJECT.name(), RealmFieldType.LIST.name()}));
        } else {
            throw new IllegalArgumentException(MSG_LINK_QUERY_NOT_SUPPORTED);
        }
    }

    public DynamicRealm getDynamicRealm() {
        BaseRealm realm$realm = realmGet$proxyState().getRealm$realm();
        realm$realm.checkIfValid();
        if (isValid()) {
            return (DynamicRealm) realm$realm;
        }
        throw new IllegalStateException("the object is already deleted.");
    }

    public ProxyState realmGet$proxyState() {
        return this.proxyState;
    }

    private void checkIsPrimaryKey(String str) {
        RealmObjectSchema schemaForClass = this.proxyState.getRealm$realm().getSchema().getSchemaForClass(getType());
        if (schemaForClass.hasPrimaryKey() && schemaForClass.getPrimaryKey().equals(str)) {
            throw new IllegalArgumentException(String.format(Locale.US, "Primary key field '%s' cannot be changed after object was created.", new Object[]{str}));
        }
    }
}
