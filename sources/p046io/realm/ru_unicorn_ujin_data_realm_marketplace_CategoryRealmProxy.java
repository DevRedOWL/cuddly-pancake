package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p035ru.unicorn.ujin.data.realm.FileData;
import p035ru.unicorn.ujin.data.realm.marketplace.Category;
import p046io.realm.BaseRealm;
import p046io.realm.exceptions.RealmException;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;
import p046io.realm.ru_unicorn_ujin_data_realm_FileDataRealmProxy;

/* renamed from: io.realm.ru_unicorn_ujin_data_realm_marketplace_CategoryRealmProxy */
public class ru_unicorn_ujin_data_realm_marketplace_CategoryRealmProxy extends Category implements RealmObjectProxy, C4608x56dd70a5 {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private CategoryColumnInfo columnInfo;
    private ProxyState<Category> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_marketplace_CategoryRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Category";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_marketplace_CategoryRealmProxy$CategoryColumnInfo */
    static final class CategoryColumnInfo extends ColumnInfo {
        long hasContentIndex;
        long iconIndex;
        long idIndex;
        long maxColumnIndexValue;
        long titleIndex;

        CategoryColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(4);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.titleIndex = addColumnDetails("title", "title", objectSchemaInfo);
            this.iconIndex = addColumnDetails("icon", "icon", objectSchemaInfo);
            this.hasContentIndex = addColumnDetails("hasContent", "hasContent", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        CategoryColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new CategoryColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            CategoryColumnInfo categoryColumnInfo = (CategoryColumnInfo) columnInfo;
            CategoryColumnInfo categoryColumnInfo2 = (CategoryColumnInfo) columnInfo2;
            categoryColumnInfo2.idIndex = categoryColumnInfo.idIndex;
            categoryColumnInfo2.titleIndex = categoryColumnInfo.titleIndex;
            categoryColumnInfo2.iconIndex = categoryColumnInfo.iconIndex;
            categoryColumnInfo2.hasContentIndex = categoryColumnInfo.hasContentIndex;
            categoryColumnInfo2.maxColumnIndexValue = categoryColumnInfo.maxColumnIndexValue;
        }
    }

    ru_unicorn_ujin_data_realm_marketplace_CategoryRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (CategoryColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public String realmGet$id() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.idIndex);
    }

    public void realmSet$id(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            throw new RealmException("Primary key field 'id' cannot be changed after object was created.");
        }
    }

    public String realmGet$title() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.titleIndex);
    }

    public void realmSet$title(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.titleIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.titleIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.titleIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.titleIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public FileData realmGet$icon() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.iconIndex)) {
            return null;
        }
        return (FileData) this.proxyState.getRealm$realm().get(FileData.class, this.proxyState.getRow$realm().getLink(this.columnInfo.iconIndex), false, Collections.emptyList());
    }

    public void realmSet$icon(FileData fileData) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (fileData == null) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.iconIndex);
                return;
            }
            this.proxyState.checkValidObject(fileData);
            this.proxyState.getRow$realm().setLink(this.columnInfo.iconIndex, ((RealmObjectProxy) fileData).realmGet$proxyState().getRow$realm().getIndex());
        } else if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("icon")) {
            if (fileData != null && !RealmObject.isManaged(fileData)) {
                fileData = (FileData) ((Realm) this.proxyState.getRealm$realm()).copyToRealm(fileData, new ImportFlag[0]);
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (fileData == null) {
                row$realm.nullifyLink(this.columnInfo.iconIndex);
                return;
            }
            this.proxyState.checkValidObject(fileData);
            row$realm.getTable().setLink(this.columnInfo.iconIndex, row$realm.getIndex(), ((RealmObjectProxy) fileData).realmGet$proxyState().getRow$realm().getIndex(), true);
        }
    }

    public Boolean realmGet$hasContent() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.hasContentIndex)) {
            return null;
        }
        return Boolean.valueOf(this.proxyState.getRow$realm().getBoolean(this.columnInfo.hasContentIndex));
    }

    public void realmSet$hasContent(Boolean bool) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (bool == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.hasContentIndex);
            } else {
                this.proxyState.getRow$realm().setBoolean(this.columnInfo.hasContentIndex, bool.booleanValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (bool == null) {
                row$realm.getTable().setNull(this.columnInfo.hasContentIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setBoolean(this.columnInfo.hasContentIndex, row$realm.getIndex(), bool.booleanValue(), true);
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 4, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("id", RealmFieldType.STRING, true, true, false);
        builder2.addPersistedProperty("title", RealmFieldType.STRING, false, false, false);
        builder.addPersistedLinkProperty("icon", RealmFieldType.OBJECT, ru_unicorn_ujin_data_realm_FileDataRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME);
        builder.addPersistedProperty("hasContent", RealmFieldType.BOOLEAN, false, false, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static CategoryColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new CategoryColumnInfo(osSchemaInfo);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00e2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.data.realm.marketplace.Category createOrUpdateUsingJsonObject(p046io.realm.Realm r14, org.json.JSONObject r15, boolean r16) throws org.json.JSONException {
        /*
            r0 = r14
            r7 = r15
            r8 = r16
            java.util.ArrayList r9 = new java.util.ArrayList
            r10 = 1
            r9.<init>(r10)
            java.lang.String r11 = "id"
            r12 = 0
            if (r8 == 0) goto L_0x006b
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.Category> r1 = p035ru.unicorn.ujin.data.realm.marketplace.Category.class
            io.realm.internal.Table r1 = r14.getTable(r1)
            io.realm.RealmSchema r2 = r14.getSchema()
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.Category> r3 = p035ru.unicorn.ujin.data.realm.marketplace.Category.class
            io.realm.internal.ColumnInfo r2 = r2.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r3)
            io.realm.ru_unicorn_ujin_data_realm_marketplace_CategoryRealmProxy$CategoryColumnInfo r2 = (p046io.realm.ru_unicorn_ujin_data_realm_marketplace_CategoryRealmProxy.CategoryColumnInfo) r2
            long r2 = r2.idIndex
            boolean r4 = r15.isNull(r11)
            if (r4 == 0) goto L_0x002e
            long r2 = r1.findFirstNull(r2)
            goto L_0x0036
        L_0x002e:
            java.lang.String r4 = r15.getString(r11)
            long r2 = r1.findFirstString(r2, r4)
        L_0x0036:
            r4 = -1
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x006b
            io.realm.BaseRealm$ThreadLocalRealmObjectContext r4 = p046io.realm.BaseRealm.objectContext
            java.lang.Object r4 = r4.get()
            r13 = r4
            io.realm.BaseRealm$RealmObjectContext r13 = (p046io.realm.BaseRealm.RealmObjectContext) r13
            io.realm.internal.UncheckedRow r3 = r1.getUncheckedRow(r2)     // Catch:{ all -> 0x0066 }
            io.realm.RealmSchema r1 = r14.getSchema()     // Catch:{ all -> 0x0066 }
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.Category> r2 = p035ru.unicorn.ujin.data.realm.marketplace.Category.class
            io.realm.internal.ColumnInfo r4 = r1.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r2)     // Catch:{ all -> 0x0066 }
            r5 = 0
            java.util.List r6 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0066 }
            r1 = r13
            r2 = r14
            r1.set(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0066 }
            io.realm.ru_unicorn_ujin_data_realm_marketplace_CategoryRealmProxy r1 = new io.realm.ru_unicorn_ujin_data_realm_marketplace_CategoryRealmProxy     // Catch:{ all -> 0x0066 }
            r1.<init>()     // Catch:{ all -> 0x0066 }
            r13.clear()
            goto L_0x006c
        L_0x0066:
            r0 = move-exception
            r13.clear()
            throw r0
        L_0x006b:
            r1 = r12
        L_0x006c:
            java.lang.String r2 = "icon"
            if (r1 != 0) goto L_0x00a3
            boolean r1 = r15.has(r2)
            if (r1 == 0) goto L_0x0079
            r9.add(r2)
        L_0x0079:
            boolean r1 = r15.has(r11)
            if (r1 == 0) goto L_0x009b
            boolean r1 = r15.isNull(r11)
            if (r1 == 0) goto L_0x008e
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.Category> r1 = p035ru.unicorn.ujin.data.realm.marketplace.Category.class
            io.realm.RealmModel r1 = r14.createObjectInternal(r1, r12, r10, r9)
            io.realm.ru_unicorn_ujin_data_realm_marketplace_CategoryRealmProxy r1 = (p046io.realm.ru_unicorn_ujin_data_realm_marketplace_CategoryRealmProxy) r1
            goto L_0x00a3
        L_0x008e:
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.Category> r1 = p035ru.unicorn.ujin.data.realm.marketplace.Category.class
            java.lang.String r3 = r15.getString(r11)
            io.realm.RealmModel r1 = r14.createObjectInternal(r1, r3, r10, r9)
            io.realm.ru_unicorn_ujin_data_realm_marketplace_CategoryRealmProxy r1 = (p046io.realm.ru_unicorn_ujin_data_realm_marketplace_CategoryRealmProxy) r1
            goto L_0x00a3
        L_0x009b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "JSON object doesn't have the primary key field 'id'."
            r0.<init>(r1)
            throw r0
        L_0x00a3:
            r3 = r1
            io.realm.ru_unicorn_ujin_data_realm_marketplace_CategoryRealmProxyInterface r3 = (p046io.realm.C4608x56dd70a5) r3
            java.lang.String r4 = "title"
            boolean r5 = r15.has(r4)
            if (r5 == 0) goto L_0x00bf
            boolean r5 = r15.isNull(r4)
            if (r5 == 0) goto L_0x00b8
            r3.realmSet$title(r12)
            goto L_0x00bf
        L_0x00b8:
            java.lang.String r4 = r15.getString(r4)
            r3.realmSet$title(r4)
        L_0x00bf:
            boolean r4 = r15.has(r2)
            if (r4 == 0) goto L_0x00da
            boolean r4 = r15.isNull(r2)
            if (r4 == 0) goto L_0x00cf
            r3.realmSet$icon(r12)
            goto L_0x00da
        L_0x00cf:
            org.json.JSONObject r2 = r15.getJSONObject(r2)
            ru.unicorn.ujin.data.realm.FileData r0 = p046io.realm.ru_unicorn_ujin_data_realm_FileDataRealmProxy.createOrUpdateUsingJsonObject(r14, r2, r8)
            r3.realmSet$icon(r0)
        L_0x00da:
            java.lang.String r0 = "hasContent"
            boolean r2 = r15.has(r0)
            if (r2 == 0) goto L_0x00f7
            boolean r2 = r15.isNull(r0)
            if (r2 == 0) goto L_0x00ec
            r3.realmSet$hasContent(r12)
            goto L_0x00f7
        L_0x00ec:
            boolean r0 = r15.getBoolean(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.realmSet$hasContent(r0)
        L_0x00f7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.ru_unicorn_ujin_data_realm_marketplace_CategoryRealmProxy.createOrUpdateUsingJsonObject(io.realm.Realm, org.json.JSONObject, boolean):ru.unicorn.ujin.data.realm.marketplace.Category");
    }

    public static Category createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        Category category = new Category();
        C4608x56dd70a5 ru_unicorn_ujin_data_realm_marketplace_categoryrealmproxyinterface = category;
        jsonReader.beginObject();
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("id")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_marketplace_categoryrealmproxyinterface.realmSet$id(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_categoryrealmproxyinterface.realmSet$id((String) null);
                }
                z = true;
            } else if (nextName.equals("title")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_marketplace_categoryrealmproxyinterface.realmSet$title(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_categoryrealmproxyinterface.realmSet$title((String) null);
                }
            } else if (nextName.equals("icon")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_categoryrealmproxyinterface.realmSet$icon((FileData) null);
                } else {
                    ru_unicorn_ujin_data_realm_marketplace_categoryrealmproxyinterface.realmSet$icon(ru_unicorn_ujin_data_realm_FileDataRealmProxy.createUsingJsonStream(realm, jsonReader));
                }
            } else if (!nextName.equals("hasContent")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_data_realm_marketplace_categoryrealmproxyinterface.realmSet$hasContent(Boolean.valueOf(jsonReader.nextBoolean()));
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_data_realm_marketplace_categoryrealmproxyinterface.realmSet$hasContent((Boolean) null);
            }
        }
        jsonReader.endObject();
        if (z) {
            return (Category) realm.copyToRealm(category, new ImportFlag[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
    }

    private static ru_unicorn_ujin_data_realm_marketplace_CategoryRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) Category.class), false, Collections.emptyList());
        ru_unicorn_ujin_data_realm_marketplace_CategoryRealmProxy ru_unicorn_ujin_data_realm_marketplace_categoryrealmproxy = new ru_unicorn_ujin_data_realm_marketplace_CategoryRealmProxy();
        realmObjectContext.clear();
        return ru_unicorn_ujin_data_realm_marketplace_categoryrealmproxy;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.data.realm.marketplace.Category copyOrUpdate(p046io.realm.Realm r8, p046io.realm.ru_unicorn_ujin_data_realm_marketplace_CategoryRealmProxy.CategoryColumnInfo r9, p035ru.unicorn.ujin.data.realm.marketplace.Category r10, boolean r11, java.util.Map<p046io.realm.RealmModel, p046io.realm.internal.RealmObjectProxy> r12, java.util.Set<p046io.realm.ImportFlag> r13) {
        /*
            boolean r0 = r10 instanceof p046io.realm.internal.RealmObjectProxy
            if (r0 == 0) goto L_0x0038
            r0 = r10
            io.realm.internal.RealmObjectProxy r0 = (p046io.realm.internal.RealmObjectProxy) r0
            io.realm.ProxyState r1 = r0.realmGet$proxyState()
            io.realm.BaseRealm r1 = r1.getRealm$realm()
            if (r1 == 0) goto L_0x0038
            io.realm.ProxyState r0 = r0.realmGet$proxyState()
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            long r1 = r0.threadId
            long r3 = r8.threadId
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x0030
            java.lang.String r0 = r0.getPath()
            java.lang.String r1 = r8.getPath()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0038
            return r10
        L_0x0030:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Objects which belong to Realm instances in other threads cannot be copied into this Realm instance."
            r8.<init>(r9)
            throw r8
        L_0x0038:
            io.realm.BaseRealm$ThreadLocalRealmObjectContext r0 = p046io.realm.BaseRealm.objectContext
            java.lang.Object r0 = r0.get()
            io.realm.BaseRealm$RealmObjectContext r0 = (p046io.realm.BaseRealm.RealmObjectContext) r0
            java.lang.Object r1 = r12.get(r10)
            io.realm.internal.RealmObjectProxy r1 = (p046io.realm.internal.RealmObjectProxy) r1
            if (r1 == 0) goto L_0x004b
            ru.unicorn.ujin.data.realm.marketplace.Category r1 = (p035ru.unicorn.ujin.data.realm.marketplace.Category) r1
            return r1
        L_0x004b:
            r1 = 0
            if (r11 == 0) goto L_0x0093
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.Category> r2 = p035ru.unicorn.ujin.data.realm.marketplace.Category.class
            io.realm.internal.Table r2 = r8.getTable(r2)
            long r3 = r9.idIndex
            r5 = r10
            io.realm.ru_unicorn_ujin_data_realm_marketplace_CategoryRealmProxyInterface r5 = (p046io.realm.C4608x56dd70a5) r5
            java.lang.String r5 = r5.realmGet$id()
            if (r5 != 0) goto L_0x0064
            long r3 = r2.findFirstNull(r3)
            goto L_0x0068
        L_0x0064:
            long r3 = r2.findFirstString(r3, r5)
        L_0x0068:
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0070
            r0 = 0
            goto L_0x0094
        L_0x0070:
            io.realm.internal.UncheckedRow r3 = r2.getUncheckedRow(r3)     // Catch:{ all -> 0x008e }
            r5 = 0
            java.util.List r6 = java.util.Collections.emptyList()     // Catch:{ all -> 0x008e }
            r1 = r0
            r2 = r8
            r4 = r9
            r1.set(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x008e }
            io.realm.ru_unicorn_ujin_data_realm_marketplace_CategoryRealmProxy r1 = new io.realm.ru_unicorn_ujin_data_realm_marketplace_CategoryRealmProxy     // Catch:{ all -> 0x008e }
            r1.<init>()     // Catch:{ all -> 0x008e }
            r2 = r1
            io.realm.internal.RealmObjectProxy r2 = (p046io.realm.internal.RealmObjectProxy) r2     // Catch:{ all -> 0x008e }
            r12.put(r10, r2)     // Catch:{ all -> 0x008e }
            r0.clear()
            goto L_0x0093
        L_0x008e:
            r8 = move-exception
            r0.clear()
            throw r8
        L_0x0093:
            r0 = r11
        L_0x0094:
            r3 = r1
            if (r0 == 0) goto L_0x00a1
            r1 = r8
            r2 = r9
            r4 = r10
            r5 = r12
            r6 = r13
            ru.unicorn.ujin.data.realm.marketplace.Category r8 = update(r1, r2, r3, r4, r5, r6)
            goto L_0x00a5
        L_0x00a1:
            ru.unicorn.ujin.data.realm.marketplace.Category r8 = copy(r8, r9, r10, r11, r12, r13)
        L_0x00a5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.ru_unicorn_ujin_data_realm_marketplace_CategoryRealmProxy.copyOrUpdate(io.realm.Realm, io.realm.ru_unicorn_ujin_data_realm_marketplace_CategoryRealmProxy$CategoryColumnInfo, ru.unicorn.ujin.data.realm.marketplace.Category, boolean, java.util.Map, java.util.Set):ru.unicorn.ujin.data.realm.marketplace.Category");
    }

    public static Category copy(Realm realm, CategoryColumnInfo categoryColumnInfo, Category category, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(category);
        if (realmObjectProxy != null) {
            return (Category) realmObjectProxy;
        }
        C4608x56dd70a5 ru_unicorn_ujin_data_realm_marketplace_categoryrealmproxyinterface = category;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(Category.class), categoryColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(categoryColumnInfo.idIndex, ru_unicorn_ujin_data_realm_marketplace_categoryrealmproxyinterface.realmGet$id());
        osObjectBuilder.addString(categoryColumnInfo.titleIndex, ru_unicorn_ujin_data_realm_marketplace_categoryrealmproxyinterface.realmGet$title());
        osObjectBuilder.addBoolean(categoryColumnInfo.hasContentIndex, ru_unicorn_ujin_data_realm_marketplace_categoryrealmproxyinterface.realmGet$hasContent());
        ru_unicorn_ujin_data_realm_marketplace_CategoryRealmProxy newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(category, newProxyInstance);
        FileData realmGet$icon = ru_unicorn_ujin_data_realm_marketplace_categoryrealmproxyinterface.realmGet$icon();
        if (realmGet$icon == null) {
            newProxyInstance.realmSet$icon((FileData) null);
        } else {
            FileData fileData = (FileData) map.get(realmGet$icon);
            if (fileData != null) {
                newProxyInstance.realmSet$icon(fileData);
            } else {
                newProxyInstance.realmSet$icon(ru_unicorn_ujin_data_realm_FileDataRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_FileDataRealmProxy.FileDataColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) FileData.class), realmGet$icon, z, map, set));
            }
        }
        return newProxyInstance;
    }

    public static long insert(Realm realm, Category category, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Realm realm2 = realm;
        Category category2 = category;
        Map<RealmModel, Long> map2 = map;
        if (category2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) category2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(Category.class);
        long nativePtr = table.getNativePtr();
        CategoryColumnInfo categoryColumnInfo = (CategoryColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Category.class);
        long j3 = categoryColumnInfo.idIndex;
        C4608x56dd70a5 ru_unicorn_ujin_data_realm_marketplace_categoryrealmproxyinterface = category2;
        String realmGet$id = ru_unicorn_ujin_data_realm_marketplace_categoryrealmproxyinterface.realmGet$id();
        if (realmGet$id == null) {
            j = Table.nativeFindFirstNull(nativePtr, j3);
        } else {
            j = Table.nativeFindFirstString(nativePtr, j3, realmGet$id);
        }
        if (j == -1) {
            j2 = OsObject.createRowWithPrimaryKey(table, j3, realmGet$id);
        } else {
            Table.throwDuplicatePrimaryKeyException(realmGet$id);
            j2 = j;
        }
        map2.put(category2, Long.valueOf(j2));
        String realmGet$title = ru_unicorn_ujin_data_realm_marketplace_categoryrealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, categoryColumnInfo.titleIndex, j2, realmGet$title, false);
        }
        FileData realmGet$icon = ru_unicorn_ujin_data_realm_marketplace_categoryrealmproxyinterface.realmGet$icon();
        if (realmGet$icon != null) {
            Long l = map2.get(realmGet$icon);
            if (l == null) {
                l = Long.valueOf(ru_unicorn_ujin_data_realm_FileDataRealmProxy.insert(realm2, realmGet$icon, map2));
            }
            Table.nativeSetLink(nativePtr, categoryColumnInfo.iconIndex, j2, l.longValue(), false);
        }
        Boolean realmGet$hasContent = ru_unicorn_ujin_data_realm_marketplace_categoryrealmproxyinterface.realmGet$hasContent();
        if (realmGet$hasContent != null) {
            Table.nativeSetBoolean(nativePtr, categoryColumnInfo.hasContentIndex, j2, realmGet$hasContent.booleanValue(), false);
        }
        return j2;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(Category.class);
        long nativePtr = table.getNativePtr();
        CategoryColumnInfo categoryColumnInfo = (CategoryColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Category.class);
        long j3 = categoryColumnInfo.idIndex;
        while (it.hasNext()) {
            Category category = (Category) it.next();
            if (!map2.containsKey(category)) {
                if (category instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) category;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(category, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                C4608x56dd70a5 ru_unicorn_ujin_data_realm_marketplace_categoryrealmproxyinterface = category;
                String realmGet$id = ru_unicorn_ujin_data_realm_marketplace_categoryrealmproxyinterface.realmGet$id();
                if (realmGet$id == null) {
                    j = Table.nativeFindFirstNull(nativePtr, j3);
                } else {
                    j = Table.nativeFindFirstString(nativePtr, j3, realmGet$id);
                }
                if (j == -1) {
                    j2 = OsObject.createRowWithPrimaryKey(table, j3, realmGet$id);
                } else {
                    Table.throwDuplicatePrimaryKeyException(realmGet$id);
                    j2 = j;
                }
                map2.put(category, Long.valueOf(j2));
                String realmGet$title = ru_unicorn_ujin_data_realm_marketplace_categoryrealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    Table.nativeSetString(nativePtr, categoryColumnInfo.titleIndex, j2, realmGet$title, false);
                }
                FileData realmGet$icon = ru_unicorn_ujin_data_realm_marketplace_categoryrealmproxyinterface.realmGet$icon();
                if (realmGet$icon != null) {
                    Long l = map2.get(realmGet$icon);
                    if (l == null) {
                        l = Long.valueOf(ru_unicorn_ujin_data_realm_FileDataRealmProxy.insert(realm2, realmGet$icon, map2));
                    }
                    table.setLink(categoryColumnInfo.iconIndex, j2, l.longValue(), false);
                }
                Boolean realmGet$hasContent = ru_unicorn_ujin_data_realm_marketplace_categoryrealmproxyinterface.realmGet$hasContent();
                if (realmGet$hasContent != null) {
                    Table.nativeSetBoolean(nativePtr, categoryColumnInfo.hasContentIndex, j2, realmGet$hasContent.booleanValue(), false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, Category category, Map<RealmModel, Long> map) {
        long j;
        Realm realm2 = realm;
        Category category2 = category;
        Map<RealmModel, Long> map2 = map;
        if (category2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) category2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(Category.class);
        long nativePtr = table.getNativePtr();
        CategoryColumnInfo categoryColumnInfo = (CategoryColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Category.class);
        long j2 = categoryColumnInfo.idIndex;
        C4608x56dd70a5 ru_unicorn_ujin_data_realm_marketplace_categoryrealmproxyinterface = category2;
        String realmGet$id = ru_unicorn_ujin_data_realm_marketplace_categoryrealmproxyinterface.realmGet$id();
        if (realmGet$id == null) {
            j = Table.nativeFindFirstNull(nativePtr, j2);
        } else {
            j = Table.nativeFindFirstString(nativePtr, j2, realmGet$id);
        }
        long createRowWithPrimaryKey = j == -1 ? OsObject.createRowWithPrimaryKey(table, j2, realmGet$id) : j;
        map2.put(category2, Long.valueOf(createRowWithPrimaryKey));
        String realmGet$title = ru_unicorn_ujin_data_realm_marketplace_categoryrealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, categoryColumnInfo.titleIndex, createRowWithPrimaryKey, realmGet$title, false);
        } else {
            Table.nativeSetNull(nativePtr, categoryColumnInfo.titleIndex, createRowWithPrimaryKey, false);
        }
        FileData realmGet$icon = ru_unicorn_ujin_data_realm_marketplace_categoryrealmproxyinterface.realmGet$icon();
        if (realmGet$icon != null) {
            Long l = map2.get(realmGet$icon);
            if (l == null) {
                l = Long.valueOf(ru_unicorn_ujin_data_realm_FileDataRealmProxy.insertOrUpdate(realm2, realmGet$icon, map2));
            }
            Table.nativeSetLink(nativePtr, categoryColumnInfo.iconIndex, createRowWithPrimaryKey, l.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, categoryColumnInfo.iconIndex, createRowWithPrimaryKey);
        }
        Boolean realmGet$hasContent = ru_unicorn_ujin_data_realm_marketplace_categoryrealmproxyinterface.realmGet$hasContent();
        if (realmGet$hasContent != null) {
            Table.nativeSetBoolean(nativePtr, categoryColumnInfo.hasContentIndex, createRowWithPrimaryKey, realmGet$hasContent.booleanValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, categoryColumnInfo.hasContentIndex, createRowWithPrimaryKey, false);
        }
        return createRowWithPrimaryKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(Category.class);
        long nativePtr = table.getNativePtr();
        CategoryColumnInfo categoryColumnInfo = (CategoryColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Category.class);
        long j3 = categoryColumnInfo.idIndex;
        while (it.hasNext()) {
            Category category = (Category) it.next();
            if (!map2.containsKey(category)) {
                if (category instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) category;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(category, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                C4608x56dd70a5 ru_unicorn_ujin_data_realm_marketplace_categoryrealmproxyinterface = category;
                String realmGet$id = ru_unicorn_ujin_data_realm_marketplace_categoryrealmproxyinterface.realmGet$id();
                if (realmGet$id == null) {
                    j = Table.nativeFindFirstNull(nativePtr, j3);
                } else {
                    j = Table.nativeFindFirstString(nativePtr, j3, realmGet$id);
                }
                long createRowWithPrimaryKey = j == -1 ? OsObject.createRowWithPrimaryKey(table, j3, realmGet$id) : j;
                map2.put(category, Long.valueOf(createRowWithPrimaryKey));
                String realmGet$title = ru_unicorn_ujin_data_realm_marketplace_categoryrealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    j2 = j3;
                    Table.nativeSetString(nativePtr, categoryColumnInfo.titleIndex, createRowWithPrimaryKey, realmGet$title, false);
                } else {
                    j2 = j3;
                    Table.nativeSetNull(nativePtr, categoryColumnInfo.titleIndex, createRowWithPrimaryKey, false);
                }
                FileData realmGet$icon = ru_unicorn_ujin_data_realm_marketplace_categoryrealmproxyinterface.realmGet$icon();
                if (realmGet$icon != null) {
                    Long l = map2.get(realmGet$icon);
                    if (l == null) {
                        l = Long.valueOf(ru_unicorn_ujin_data_realm_FileDataRealmProxy.insertOrUpdate(realm2, realmGet$icon, map2));
                    }
                    Table.nativeSetLink(nativePtr, categoryColumnInfo.iconIndex, createRowWithPrimaryKey, l.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, categoryColumnInfo.iconIndex, createRowWithPrimaryKey);
                }
                Boolean realmGet$hasContent = ru_unicorn_ujin_data_realm_marketplace_categoryrealmproxyinterface.realmGet$hasContent();
                if (realmGet$hasContent != null) {
                    Table.nativeSetBoolean(nativePtr, categoryColumnInfo.hasContentIndex, createRowWithPrimaryKey, realmGet$hasContent.booleanValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, categoryColumnInfo.hasContentIndex, createRowWithPrimaryKey, false);
                }
                j3 = j2;
            }
        }
    }

    public static Category createDetachedCopy(Category category, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        Category category2;
        if (i > i2 || category == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(category);
        if (cacheData == null) {
            category2 = new Category();
            map.put(category, new RealmObjectProxy.CacheData(i, category2));
        } else if (i >= cacheData.minDepth) {
            return (Category) cacheData.object;
        } else {
            cacheData.minDepth = i;
            category2 = (Category) cacheData.object;
        }
        C4608x56dd70a5 ru_unicorn_ujin_data_realm_marketplace_categoryrealmproxyinterface = category2;
        C4608x56dd70a5 ru_unicorn_ujin_data_realm_marketplace_categoryrealmproxyinterface2 = category;
        ru_unicorn_ujin_data_realm_marketplace_categoryrealmproxyinterface.realmSet$id(ru_unicorn_ujin_data_realm_marketplace_categoryrealmproxyinterface2.realmGet$id());
        ru_unicorn_ujin_data_realm_marketplace_categoryrealmproxyinterface.realmSet$title(ru_unicorn_ujin_data_realm_marketplace_categoryrealmproxyinterface2.realmGet$title());
        ru_unicorn_ujin_data_realm_marketplace_categoryrealmproxyinterface.realmSet$icon(ru_unicorn_ujin_data_realm_FileDataRealmProxy.createDetachedCopy(ru_unicorn_ujin_data_realm_marketplace_categoryrealmproxyinterface2.realmGet$icon(), i + 1, i2, map));
        ru_unicorn_ujin_data_realm_marketplace_categoryrealmproxyinterface.realmSet$hasContent(ru_unicorn_ujin_data_realm_marketplace_categoryrealmproxyinterface2.realmGet$hasContent());
        return category2;
    }

    static Category update(Realm realm, CategoryColumnInfo categoryColumnInfo, Category category, Category category2, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        C4608x56dd70a5 ru_unicorn_ujin_data_realm_marketplace_categoryrealmproxyinterface = category;
        C4608x56dd70a5 ru_unicorn_ujin_data_realm_marketplace_categoryrealmproxyinterface2 = category2;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(Category.class), categoryColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(categoryColumnInfo.idIndex, ru_unicorn_ujin_data_realm_marketplace_categoryrealmproxyinterface2.realmGet$id());
        osObjectBuilder.addString(categoryColumnInfo.titleIndex, ru_unicorn_ujin_data_realm_marketplace_categoryrealmproxyinterface2.realmGet$title());
        FileData realmGet$icon = ru_unicorn_ujin_data_realm_marketplace_categoryrealmproxyinterface2.realmGet$icon();
        if (realmGet$icon == null) {
            osObjectBuilder.addNull(categoryColumnInfo.iconIndex);
        } else {
            FileData fileData = (FileData) map.get(realmGet$icon);
            if (fileData != null) {
                osObjectBuilder.addObject(categoryColumnInfo.iconIndex, fileData);
            } else {
                osObjectBuilder.addObject(categoryColumnInfo.iconIndex, ru_unicorn_ujin_data_realm_FileDataRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_FileDataRealmProxy.FileDataColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) FileData.class), realmGet$icon, true, map, set));
            }
        }
        osObjectBuilder.addBoolean(categoryColumnInfo.hasContentIndex, ru_unicorn_ujin_data_realm_marketplace_categoryrealmproxyinterface2.realmGet$hasContent());
        osObjectBuilder.updateExistingObject();
        return category;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("Category = proxy[");
        sb.append("{id:");
        Object obj = "null";
        sb.append(realmGet$id() != null ? realmGet$id() : obj);
        sb.append("}");
        sb.append(",");
        sb.append("{title:");
        sb.append(realmGet$title() != null ? realmGet$title() : obj);
        sb.append("}");
        sb.append(",");
        sb.append("{icon:");
        sb.append(realmGet$icon() != null ? ru_unicorn_ujin_data_realm_FileDataRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME : obj);
        sb.append("}");
        sb.append(",");
        sb.append("{hasContent:");
        Object obj2 = obj;
        if (realmGet$hasContent() != null) {
            obj2 = realmGet$hasContent();
        }
        sb.append(obj2);
        sb.append("}");
        sb.append("]");
        return sb.toString();
    }

    public ProxyState<?> realmGet$proxyState() {
        return this.proxyState;
    }

    public int hashCode() {
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
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ru_unicorn_ujin_data_realm_marketplace_CategoryRealmProxy ru_unicorn_ujin_data_realm_marketplace_categoryrealmproxy = (ru_unicorn_ujin_data_realm_marketplace_CategoryRealmProxy) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_data_realm_marketplace_categoryrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_data_realm_marketplace_categoryrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_data_realm_marketplace_categoryrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
