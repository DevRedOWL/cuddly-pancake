package p046io.realm;

import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;
import p046io.realm.RealmObjectSchema;
import p046io.realm.internal.ColumnIndices;
import p046io.realm.internal.OsObjectStore;
import p046io.realm.internal.Table;

/* renamed from: io.realm.MutableRealmSchema */
class MutableRealmSchema extends RealmSchema {
    MutableRealmSchema(BaseRealm baseRealm) {
        super(baseRealm, (ColumnIndices) null);
    }

    public RealmObjectSchema get(String str) {
        checkNotEmpty(str, "Null or empty class names are not allowed");
        String tableNameForClass = Table.getTableNameForClass(str);
        if (!this.realm.getSharedRealm().hasTable(tableNameForClass)) {
            return null;
        }
        return new MutableRealmObjectSchema(this.realm, this, this.realm.getSharedRealm().getTable(tableNameForClass));
    }

    public Set<RealmObjectSchema> getAll() {
        int size = (int) this.realm.getSharedRealm().size();
        LinkedHashSet linkedHashSet = new LinkedHashSet(size);
        for (int i = 0; i < size; i++) {
            RealmObjectSchema realmObjectSchema = get(Table.getClassNameForTable(this.realm.getSharedRealm().getTableName(i)));
            if (realmObjectSchema != null) {
                linkedHashSet.add(realmObjectSchema);
            }
        }
        return linkedHashSet;
    }

    public RealmObjectSchema create(String str) {
        checkNotEmpty(str, "Null or empty class names are not allowed");
        String tableNameForClass = Table.getTableNameForClass(str);
        if (str.length() <= Table.CLASS_NAME_MAX_LENGTH) {
            return new MutableRealmObjectSchema(this.realm, this, this.realm.getSharedRealm().createTable(tableNameForClass));
        }
        throw new IllegalArgumentException(String.format(Locale.US, "Class name is too long. Limit is %1$d characters: %2$s", new Object[]{Integer.valueOf(Table.CLASS_NAME_MAX_LENGTH), Integer.valueOf(str.length())}));
    }

    public RealmObjectSchema createWithPrimaryKeyField(String str, String str2, Class<?> cls, FieldAttribute... fieldAttributeArr) {
        checkNotEmpty(str, "Null or empty class names are not allowed");
        RealmObjectSchema.checkLegalName(str2);
        String checkAndGetTableNameFromClassName = checkAndGetTableNameFromClassName(str);
        RealmObjectSchema.FieldMetaData fieldMetaData = RealmObjectSchema.getSupportedSimpleFields().get(cls);
        boolean z = true;
        if (fieldMetaData == null || !(fieldMetaData.fieldType == RealmFieldType.STRING || fieldMetaData.fieldType == RealmFieldType.INTEGER)) {
            throw new IllegalArgumentException(String.format("Realm doesn't support primary key field type '%s'.", new Object[]{cls}));
        }
        if (fieldMetaData.fieldType != RealmFieldType.STRING) {
            z = false;
        }
        boolean z2 = fieldMetaData.defaultNullable;
        if (MutableRealmObjectSchema.containsAttribute(fieldAttributeArr, FieldAttribute.REQUIRED)) {
            z2 = false;
        }
        return new MutableRealmObjectSchema(this.realm, this, this.realm.getSharedRealm().createTableWithPrimaryKey(checkAndGetTableNameFromClassName, str2, z, z2));
    }

    public void remove(String str) {
        this.realm.checkNotInSync();
        checkNotEmpty(str, "Null or empty class names are not allowed");
        String tableNameForClass = Table.getTableNameForClass(str);
        if (OsObjectStore.deleteTableForObject(this.realm.getSharedRealm(), str)) {
            removeFromClassNameToSchemaMap(tableNameForClass);
            return;
        }
        throw new IllegalArgumentException("Cannot remove class because it is not in this Realm: " + str);
    }

    public RealmObjectSchema rename(String str, String str2) {
        this.realm.checkNotInSync();
        checkNotEmpty(str, "Class names cannot be empty or null");
        checkNotEmpty(str2, "Class names cannot be empty or null");
        String tableNameForClass = Table.getTableNameForClass(str);
        String tableNameForClass2 = Table.getTableNameForClass(str2);
        checkHasTable(str, "Cannot rename class because it doesn't exist in this Realm: " + str);
        if (!this.realm.getSharedRealm().hasTable(tableNameForClass2)) {
            String primaryKeyForObject = OsObjectStore.getPrimaryKeyForObject(this.realm.sharedRealm, str);
            if (primaryKeyForObject != null) {
                OsObjectStore.setPrimaryKeyForObject(this.realm.sharedRealm, str, (String) null);
            }
            this.realm.getSharedRealm().renameTable(tableNameForClass, tableNameForClass2);
            Table table = this.realm.getSharedRealm().getTable(tableNameForClass2);
            if (primaryKeyForObject != null) {
                OsObjectStore.setPrimaryKeyForObject(this.realm.sharedRealm, str2, primaryKeyForObject);
            }
            RealmObjectSchema removeFromClassNameToSchemaMap = removeFromClassNameToSchemaMap(tableNameForClass);
            if (removeFromClassNameToSchemaMap == null || !removeFromClassNameToSchemaMap.getTable().isValid() || !removeFromClassNameToSchemaMap.getClassName().equals(str2)) {
                removeFromClassNameToSchemaMap = new MutableRealmObjectSchema(this.realm, this, table);
            }
            putToClassNameToSchemaMap(tableNameForClass2, removeFromClassNameToSchemaMap);
            return removeFromClassNameToSchemaMap;
        }
        throw new IllegalArgumentException(str + " cannot be renamed because the new class already exists: " + str2);
    }

    private String checkAndGetTableNameFromClassName(String str) {
        if (str.length() <= Table.CLASS_NAME_MAX_LENGTH) {
            return Table.getTableNameForClass(str);
        }
        throw new IllegalArgumentException(String.format(Locale.US, "Class name is too long. Limit is %1$d characters: %2$s", new Object[]{Integer.valueOf(Table.CLASS_NAME_MAX_LENGTH), Integer.valueOf(str.length())}));
    }
}
