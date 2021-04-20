package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p035ru.unicorn.ujin.data.realm.marketplace.Category;
import p035ru.unicorn.ujin.data.realm.marketplace.CategoryItem;
import p046io.realm.BaseRealm;
import p046io.realm.exceptions.RealmException;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsList;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;
import p046io.realm.ru_unicorn_ujin_data_realm_marketplace_CategoryRealmProxy;

/* renamed from: io.realm.ru_unicorn_ujin_data_realm_marketplace_CategoryItemRealmProxy */
public class ru_unicorn_ujin_data_realm_marketplace_CategoryItemRealmProxy extends CategoryItem implements RealmObjectProxy, C4607xaf5ee912 {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private RealmList<Category> childrenRealmList;
    private CategoryItemColumnInfo columnInfo;
    private ProxyState<CategoryItem> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_marketplace_CategoryItemRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "CategoryItem";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_marketplace_CategoryItemRealmProxy$CategoryItemColumnInfo */
    static final class CategoryItemColumnInfo extends ColumnInfo {
        long childrenIndex;
        long contentTypeIndex;
        long iconIndex;
        long idIndex;
        long maxColumnIndexValue;
        long parentIndex;
        long titleIndex;

        CategoryItemColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(6);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.titleIndex = addColumnDetails("title", "title", objectSchemaInfo);
            this.parentIndex = addColumnDetails(CategoryItem.Fields.parent, CategoryItem.Fields.parent, objectSchemaInfo);
            this.iconIndex = addColumnDetails("icon", "icon", objectSchemaInfo);
            this.contentTypeIndex = addColumnDetails("contentType", "contentType", objectSchemaInfo);
            this.childrenIndex = addColumnDetails("children", "children", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        CategoryItemColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new CategoryItemColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            CategoryItemColumnInfo categoryItemColumnInfo = (CategoryItemColumnInfo) columnInfo;
            CategoryItemColumnInfo categoryItemColumnInfo2 = (CategoryItemColumnInfo) columnInfo2;
            categoryItemColumnInfo2.idIndex = categoryItemColumnInfo.idIndex;
            categoryItemColumnInfo2.titleIndex = categoryItemColumnInfo.titleIndex;
            categoryItemColumnInfo2.parentIndex = categoryItemColumnInfo.parentIndex;
            categoryItemColumnInfo2.iconIndex = categoryItemColumnInfo.iconIndex;
            categoryItemColumnInfo2.contentTypeIndex = categoryItemColumnInfo.contentTypeIndex;
            categoryItemColumnInfo2.childrenIndex = categoryItemColumnInfo.childrenIndex;
            categoryItemColumnInfo2.maxColumnIndexValue = categoryItemColumnInfo.maxColumnIndexValue;
        }
    }

    ru_unicorn_ujin_data_realm_marketplace_CategoryItemRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (CategoryItemColumnInfo) realmObjectContext.getColumnInfo();
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

    public String realmGet$parent() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.parentIndex);
    }

    public void realmSet$parent(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.parentIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.parentIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.parentIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.parentIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$icon() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.iconIndex);
    }

    public void realmSet$icon(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.iconIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.iconIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.iconIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.iconIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$contentType() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.contentTypeIndex);
    }

    public void realmSet$contentType(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.contentTypeIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.contentTypeIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.contentTypeIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.contentTypeIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public RealmList<Category> realmGet$children() {
        this.proxyState.getRealm$realm().checkIfValid();
        RealmList<Category> realmList = this.childrenRealmList;
        if (realmList != null) {
            return realmList;
        }
        this.childrenRealmList = new RealmList<>(Category.class, this.proxyState.getRow$realm().getModelList(this.columnInfo.childrenIndex), this.proxyState.getRealm$realm());
        return this.childrenRealmList;
    }

    public void realmSet$children(RealmList<Category> realmList) {
        int i = 0;
        if (this.proxyState.isUnderConstruction()) {
            if (!this.proxyState.getAcceptDefaultValue$realm() || this.proxyState.getExcludeFields$realm().contains("children")) {
                return;
            }
            if (realmList != null && !realmList.isManaged()) {
                Realm realm = (Realm) this.proxyState.getRealm$realm();
                RealmList<Category> realmList2 = new RealmList<>();
                Iterator<Category> it = realmList.iterator();
                while (it.hasNext()) {
                    Category next = it.next();
                    if (next == null || RealmObject.isManaged(next)) {
                        realmList2.add(next);
                    } else {
                        realmList2.add(realm.copyToRealm(next, new ImportFlag[0]));
                    }
                }
                realmList = realmList2;
            }
        }
        this.proxyState.getRealm$realm().checkIfValid();
        OsList modelList = this.proxyState.getRow$realm().getModelList(this.columnInfo.childrenIndex);
        if (realmList == null || ((long) realmList.size()) != modelList.size()) {
            modelList.removeAll();
            if (realmList != null) {
                int size = realmList.size();
                while (i < size) {
                    Category category = realmList.get(i);
                    this.proxyState.checkValidObject(category);
                    modelList.addRow(((RealmObjectProxy) category).realmGet$proxyState().getRow$realm().getIndex());
                    i++;
                }
                return;
            }
            return;
        }
        int size2 = realmList.size();
        while (i < size2) {
            Category category2 = realmList.get(i);
            this.proxyState.checkValidObject(category2);
            modelList.setRow((long) i, ((RealmObjectProxy) category2).realmGet$proxyState().getRow$realm().getIndex());
            i++;
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 6, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("id", RealmFieldType.STRING, true, true, false);
        builder2.addPersistedProperty("title", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty(CategoryItem.Fields.parent, RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("icon", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("contentType", RealmFieldType.STRING, false, false, false);
        builder.addPersistedLinkProperty("children", RealmFieldType.LIST, ru_unicorn_ujin_data_realm_marketplace_CategoryRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static CategoryItemColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new CategoryItemColumnInfo(osSchemaInfo);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0110  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.data.realm.marketplace.CategoryItem createOrUpdateUsingJsonObject(p046io.realm.Realm r14, org.json.JSONObject r15, boolean r16) throws org.json.JSONException {
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
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.CategoryItem> r1 = p035ru.unicorn.ujin.data.realm.marketplace.CategoryItem.class
            io.realm.internal.Table r1 = r14.getTable(r1)
            io.realm.RealmSchema r2 = r14.getSchema()
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.CategoryItem> r3 = p035ru.unicorn.ujin.data.realm.marketplace.CategoryItem.class
            io.realm.internal.ColumnInfo r2 = r2.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r3)
            io.realm.ru_unicorn_ujin_data_realm_marketplace_CategoryItemRealmProxy$CategoryItemColumnInfo r2 = (p046io.realm.ru_unicorn_ujin_data_realm_marketplace_CategoryItemRealmProxy.CategoryItemColumnInfo) r2
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
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.CategoryItem> r2 = p035ru.unicorn.ujin.data.realm.marketplace.CategoryItem.class
            io.realm.internal.ColumnInfo r4 = r1.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r2)     // Catch:{ all -> 0x0066 }
            r5 = 0
            java.util.List r6 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0066 }
            r1 = r13
            r2 = r14
            r1.set(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0066 }
            io.realm.ru_unicorn_ujin_data_realm_marketplace_CategoryItemRealmProxy r1 = new io.realm.ru_unicorn_ujin_data_realm_marketplace_CategoryItemRealmProxy     // Catch:{ all -> 0x0066 }
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
            java.lang.String r2 = "children"
            if (r1 != 0) goto L_0x00a3
            boolean r1 = r15.has(r2)
            if (r1 == 0) goto L_0x0079
            r9.add(r2)
        L_0x0079:
            boolean r1 = r15.has(r11)
            if (r1 == 0) goto L_0x009b
            boolean r1 = r15.isNull(r11)
            if (r1 == 0) goto L_0x008e
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.CategoryItem> r1 = p035ru.unicorn.ujin.data.realm.marketplace.CategoryItem.class
            io.realm.RealmModel r1 = r14.createObjectInternal(r1, r12, r10, r9)
            io.realm.ru_unicorn_ujin_data_realm_marketplace_CategoryItemRealmProxy r1 = (p046io.realm.ru_unicorn_ujin_data_realm_marketplace_CategoryItemRealmProxy) r1
            goto L_0x00a3
        L_0x008e:
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.CategoryItem> r1 = p035ru.unicorn.ujin.data.realm.marketplace.CategoryItem.class
            java.lang.String r3 = r15.getString(r11)
            io.realm.RealmModel r1 = r14.createObjectInternal(r1, r3, r10, r9)
            io.realm.ru_unicorn_ujin_data_realm_marketplace_CategoryItemRealmProxy r1 = (p046io.realm.ru_unicorn_ujin_data_realm_marketplace_CategoryItemRealmProxy) r1
            goto L_0x00a3
        L_0x009b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "JSON object doesn't have the primary key field 'id'."
            r0.<init>(r1)
            throw r0
        L_0x00a3:
            r3 = r1
            io.realm.ru_unicorn_ujin_data_realm_marketplace_CategoryItemRealmProxyInterface r3 = (p046io.realm.C4607xaf5ee912) r3
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
            java.lang.String r4 = "parent"
            boolean r5 = r15.has(r4)
            if (r5 == 0) goto L_0x00d8
            boolean r5 = r15.isNull(r4)
            if (r5 == 0) goto L_0x00d1
            r3.realmSet$parent(r12)
            goto L_0x00d8
        L_0x00d1:
            java.lang.String r4 = r15.getString(r4)
            r3.realmSet$parent(r4)
        L_0x00d8:
            java.lang.String r4 = "icon"
            boolean r5 = r15.has(r4)
            if (r5 == 0) goto L_0x00f1
            boolean r5 = r15.isNull(r4)
            if (r5 == 0) goto L_0x00ea
            r3.realmSet$icon(r12)
            goto L_0x00f1
        L_0x00ea:
            java.lang.String r4 = r15.getString(r4)
            r3.realmSet$icon(r4)
        L_0x00f1:
            java.lang.String r4 = "contentType"
            boolean r5 = r15.has(r4)
            if (r5 == 0) goto L_0x010a
            boolean r5 = r15.isNull(r4)
            if (r5 == 0) goto L_0x0103
            r3.realmSet$contentType(r12)
            goto L_0x010a
        L_0x0103:
            java.lang.String r4 = r15.getString(r4)
            r3.realmSet$contentType(r4)
        L_0x010a:
            boolean r4 = r15.has(r2)
            if (r4 == 0) goto L_0x013e
            boolean r4 = r15.isNull(r2)
            if (r4 == 0) goto L_0x011a
            r3.realmSet$children(r12)
            goto L_0x013e
        L_0x011a:
            io.realm.RealmList r4 = r3.realmGet$children()
            r4.clear()
            org.json.JSONArray r2 = r15.getJSONArray(r2)
            r4 = 0
        L_0x0126:
            int r5 = r2.length()
            if (r4 >= r5) goto L_0x013e
            org.json.JSONObject r5 = r2.getJSONObject(r4)
            ru.unicorn.ujin.data.realm.marketplace.Category r5 = p046io.realm.ru_unicorn_ujin_data_realm_marketplace_CategoryRealmProxy.createOrUpdateUsingJsonObject(r14, r5, r8)
            io.realm.RealmList r6 = r3.realmGet$children()
            r6.add(r5)
            int r4 = r4 + 1
            goto L_0x0126
        L_0x013e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.ru_unicorn_ujin_data_realm_marketplace_CategoryItemRealmProxy.createOrUpdateUsingJsonObject(io.realm.Realm, org.json.JSONObject, boolean):ru.unicorn.ujin.data.realm.marketplace.CategoryItem");
    }

    public static CategoryItem createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        CategoryItem categoryItem = new CategoryItem();
        C4607xaf5ee912 ru_unicorn_ujin_data_realm_marketplace_categoryitemrealmproxyinterface = categoryItem;
        jsonReader.beginObject();
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("id")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_marketplace_categoryitemrealmproxyinterface.realmSet$id(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_categoryitemrealmproxyinterface.realmSet$id((String) null);
                }
                z = true;
            } else if (nextName.equals("title")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_marketplace_categoryitemrealmproxyinterface.realmSet$title(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_categoryitemrealmproxyinterface.realmSet$title((String) null);
                }
            } else if (nextName.equals(CategoryItem.Fields.parent)) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_marketplace_categoryitemrealmproxyinterface.realmSet$parent(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_categoryitemrealmproxyinterface.realmSet$parent((String) null);
                }
            } else if (nextName.equals("icon")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_marketplace_categoryitemrealmproxyinterface.realmSet$icon(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_categoryitemrealmproxyinterface.realmSet$icon((String) null);
                }
            } else if (nextName.equals("contentType")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_marketplace_categoryitemrealmproxyinterface.realmSet$contentType(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_categoryitemrealmproxyinterface.realmSet$contentType((String) null);
                }
            } else if (!nextName.equals("children")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.skipValue();
                ru_unicorn_ujin_data_realm_marketplace_categoryitemrealmproxyinterface.realmSet$children((RealmList<Category>) null);
            } else {
                ru_unicorn_ujin_data_realm_marketplace_categoryitemrealmproxyinterface.realmSet$children(new RealmList());
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    ru_unicorn_ujin_data_realm_marketplace_categoryitemrealmproxyinterface.realmGet$children().add(ru_unicorn_ujin_data_realm_marketplace_CategoryRealmProxy.createUsingJsonStream(realm, jsonReader));
                }
                jsonReader.endArray();
            }
        }
        jsonReader.endObject();
        if (z) {
            return (CategoryItem) realm.copyToRealm(categoryItem, new ImportFlag[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
    }

    private static ru_unicorn_ujin_data_realm_marketplace_CategoryItemRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) CategoryItem.class), false, Collections.emptyList());
        ru_unicorn_ujin_data_realm_marketplace_CategoryItemRealmProxy ru_unicorn_ujin_data_realm_marketplace_categoryitemrealmproxy = new ru_unicorn_ujin_data_realm_marketplace_CategoryItemRealmProxy();
        realmObjectContext.clear();
        return ru_unicorn_ujin_data_realm_marketplace_categoryitemrealmproxy;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.data.realm.marketplace.CategoryItem copyOrUpdate(p046io.realm.Realm r8, p046io.realm.ru_unicorn_ujin_data_realm_marketplace_CategoryItemRealmProxy.CategoryItemColumnInfo r9, p035ru.unicorn.ujin.data.realm.marketplace.CategoryItem r10, boolean r11, java.util.Map<p046io.realm.RealmModel, p046io.realm.internal.RealmObjectProxy> r12, java.util.Set<p046io.realm.ImportFlag> r13) {
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
            ru.unicorn.ujin.data.realm.marketplace.CategoryItem r1 = (p035ru.unicorn.ujin.data.realm.marketplace.CategoryItem) r1
            return r1
        L_0x004b:
            r1 = 0
            if (r11 == 0) goto L_0x0093
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.CategoryItem> r2 = p035ru.unicorn.ujin.data.realm.marketplace.CategoryItem.class
            io.realm.internal.Table r2 = r8.getTable(r2)
            long r3 = r9.idIndex
            r5 = r10
            io.realm.ru_unicorn_ujin_data_realm_marketplace_CategoryItemRealmProxyInterface r5 = (p046io.realm.C4607xaf5ee912) r5
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
            io.realm.ru_unicorn_ujin_data_realm_marketplace_CategoryItemRealmProxy r1 = new io.realm.ru_unicorn_ujin_data_realm_marketplace_CategoryItemRealmProxy     // Catch:{ all -> 0x008e }
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
            ru.unicorn.ujin.data.realm.marketplace.CategoryItem r8 = update(r1, r2, r3, r4, r5, r6)
            goto L_0x00a5
        L_0x00a1:
            ru.unicorn.ujin.data.realm.marketplace.CategoryItem r8 = copy(r8, r9, r10, r11, r12, r13)
        L_0x00a5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.ru_unicorn_ujin_data_realm_marketplace_CategoryItemRealmProxy.copyOrUpdate(io.realm.Realm, io.realm.ru_unicorn_ujin_data_realm_marketplace_CategoryItemRealmProxy$CategoryItemColumnInfo, ru.unicorn.ujin.data.realm.marketplace.CategoryItem, boolean, java.util.Map, java.util.Set):ru.unicorn.ujin.data.realm.marketplace.CategoryItem");
    }

    public static CategoryItem copy(Realm realm, CategoryItemColumnInfo categoryItemColumnInfo, CategoryItem categoryItem, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(categoryItem);
        if (realmObjectProxy != null) {
            return (CategoryItem) realmObjectProxy;
        }
        C4607xaf5ee912 ru_unicorn_ujin_data_realm_marketplace_categoryitemrealmproxyinterface = categoryItem;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(CategoryItem.class), categoryItemColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(categoryItemColumnInfo.idIndex, ru_unicorn_ujin_data_realm_marketplace_categoryitemrealmproxyinterface.realmGet$id());
        osObjectBuilder.addString(categoryItemColumnInfo.titleIndex, ru_unicorn_ujin_data_realm_marketplace_categoryitemrealmproxyinterface.realmGet$title());
        osObjectBuilder.addString(categoryItemColumnInfo.parentIndex, ru_unicorn_ujin_data_realm_marketplace_categoryitemrealmproxyinterface.realmGet$parent());
        osObjectBuilder.addString(categoryItemColumnInfo.iconIndex, ru_unicorn_ujin_data_realm_marketplace_categoryitemrealmproxyinterface.realmGet$icon());
        osObjectBuilder.addString(categoryItemColumnInfo.contentTypeIndex, ru_unicorn_ujin_data_realm_marketplace_categoryitemrealmproxyinterface.realmGet$contentType());
        ru_unicorn_ujin_data_realm_marketplace_CategoryItemRealmProxy newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(categoryItem, newProxyInstance);
        RealmList<Category> realmGet$children = ru_unicorn_ujin_data_realm_marketplace_categoryitemrealmproxyinterface.realmGet$children();
        if (realmGet$children != null) {
            RealmList<Category> realmGet$children2 = newProxyInstance.realmGet$children();
            realmGet$children2.clear();
            for (int i = 0; i < realmGet$children.size(); i++) {
                Category category = realmGet$children.get(i);
                Category category2 = (Category) map.get(category);
                if (category2 != null) {
                    realmGet$children2.add(category2);
                } else {
                    realmGet$children2.add(ru_unicorn_ujin_data_realm_marketplace_CategoryRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_marketplace_CategoryRealmProxy.CategoryColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Category.class), category, z, map, set));
                }
            }
        }
        return newProxyInstance;
    }

    public static long insert(Realm realm, CategoryItem categoryItem, Map<RealmModel, Long> map) {
        long j;
        long j2;
        long j3;
        Realm realm2 = realm;
        CategoryItem categoryItem2 = categoryItem;
        Map<RealmModel, Long> map2 = map;
        if (categoryItem2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) categoryItem2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(CategoryItem.class);
        long nativePtr = table.getNativePtr();
        CategoryItemColumnInfo categoryItemColumnInfo = (CategoryItemColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) CategoryItem.class);
        long j4 = categoryItemColumnInfo.idIndex;
        C4607xaf5ee912 ru_unicorn_ujin_data_realm_marketplace_categoryitemrealmproxyinterface = categoryItem2;
        String realmGet$id = ru_unicorn_ujin_data_realm_marketplace_categoryitemrealmproxyinterface.realmGet$id();
        if (realmGet$id == null) {
            j = Table.nativeFindFirstNull(nativePtr, j4);
        } else {
            j = Table.nativeFindFirstString(nativePtr, j4, realmGet$id);
        }
        if (j == -1) {
            j2 = OsObject.createRowWithPrimaryKey(table, j4, realmGet$id);
        } else {
            Table.throwDuplicatePrimaryKeyException(realmGet$id);
            j2 = j;
        }
        map2.put(categoryItem2, Long.valueOf(j2));
        String realmGet$title = ru_unicorn_ujin_data_realm_marketplace_categoryitemrealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            j3 = j2;
            Table.nativeSetString(nativePtr, categoryItemColumnInfo.titleIndex, j2, realmGet$title, false);
        } else {
            j3 = j2;
        }
        String realmGet$parent = ru_unicorn_ujin_data_realm_marketplace_categoryitemrealmproxyinterface.realmGet$parent();
        if (realmGet$parent != null) {
            Table.nativeSetString(nativePtr, categoryItemColumnInfo.parentIndex, j3, realmGet$parent, false);
        }
        String realmGet$icon = ru_unicorn_ujin_data_realm_marketplace_categoryitemrealmproxyinterface.realmGet$icon();
        if (realmGet$icon != null) {
            Table.nativeSetString(nativePtr, categoryItemColumnInfo.iconIndex, j3, realmGet$icon, false);
        }
        String realmGet$contentType = ru_unicorn_ujin_data_realm_marketplace_categoryitemrealmproxyinterface.realmGet$contentType();
        if (realmGet$contentType != null) {
            Table.nativeSetString(nativePtr, categoryItemColumnInfo.contentTypeIndex, j3, realmGet$contentType, false);
        }
        RealmList<Category> realmGet$children = ru_unicorn_ujin_data_realm_marketplace_categoryitemrealmproxyinterface.realmGet$children();
        if (realmGet$children == null) {
            return j3;
        }
        long j5 = j3;
        OsList osList = new OsList(table.getUncheckedRow(j5), categoryItemColumnInfo.childrenIndex);
        Iterator<Category> it = realmGet$children.iterator();
        while (it.hasNext()) {
            Category next = it.next();
            Long l = map2.get(next);
            if (l == null) {
                l = Long.valueOf(ru_unicorn_ujin_data_realm_marketplace_CategoryRealmProxy.insert(realm2, next, map2));
            }
            osList.addRow(l.longValue());
        }
        return j5;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        long j3;
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(CategoryItem.class);
        long nativePtr = table.getNativePtr();
        CategoryItemColumnInfo categoryItemColumnInfo = (CategoryItemColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) CategoryItem.class);
        long j4 = categoryItemColumnInfo.idIndex;
        while (it.hasNext()) {
            CategoryItem categoryItem = (CategoryItem) it.next();
            if (!map2.containsKey(categoryItem)) {
                if (categoryItem instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) categoryItem;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(categoryItem, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                C4607xaf5ee912 ru_unicorn_ujin_data_realm_marketplace_categoryitemrealmproxyinterface = categoryItem;
                String realmGet$id = ru_unicorn_ujin_data_realm_marketplace_categoryitemrealmproxyinterface.realmGet$id();
                if (realmGet$id == null) {
                    j = Table.nativeFindFirstNull(nativePtr, j4);
                } else {
                    j = Table.nativeFindFirstString(nativePtr, j4, realmGet$id);
                }
                if (j == -1) {
                    j2 = OsObject.createRowWithPrimaryKey(table, j4, realmGet$id);
                } else {
                    Table.throwDuplicatePrimaryKeyException(realmGet$id);
                    j2 = j;
                }
                map2.put(categoryItem, Long.valueOf(j2));
                String realmGet$title = ru_unicorn_ujin_data_realm_marketplace_categoryitemrealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    j3 = j2;
                    Table.nativeSetString(nativePtr, categoryItemColumnInfo.titleIndex, j2, realmGet$title, false);
                } else {
                    j3 = j2;
                }
                String realmGet$parent = ru_unicorn_ujin_data_realm_marketplace_categoryitemrealmproxyinterface.realmGet$parent();
                if (realmGet$parent != null) {
                    Table.nativeSetString(nativePtr, categoryItemColumnInfo.parentIndex, j3, realmGet$parent, false);
                }
                String realmGet$icon = ru_unicorn_ujin_data_realm_marketplace_categoryitemrealmproxyinterface.realmGet$icon();
                if (realmGet$icon != null) {
                    Table.nativeSetString(nativePtr, categoryItemColumnInfo.iconIndex, j3, realmGet$icon, false);
                }
                String realmGet$contentType = ru_unicorn_ujin_data_realm_marketplace_categoryitemrealmproxyinterface.realmGet$contentType();
                if (realmGet$contentType != null) {
                    Table.nativeSetString(nativePtr, categoryItemColumnInfo.contentTypeIndex, j3, realmGet$contentType, false);
                }
                RealmList<Category> realmGet$children = ru_unicorn_ujin_data_realm_marketplace_categoryitemrealmproxyinterface.realmGet$children();
                if (realmGet$children != null) {
                    OsList osList = new OsList(table.getUncheckedRow(j3), categoryItemColumnInfo.childrenIndex);
                    Iterator<Category> it2 = realmGet$children.iterator();
                    while (it2.hasNext()) {
                        Category next = it2.next();
                        Long l = map2.get(next);
                        if (l == null) {
                            l = Long.valueOf(ru_unicorn_ujin_data_realm_marketplace_CategoryRealmProxy.insert(realm2, next, map2));
                        }
                        osList.addRow(l.longValue());
                    }
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, CategoryItem categoryItem, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Realm realm2 = realm;
        CategoryItem categoryItem2 = categoryItem;
        Map<RealmModel, Long> map2 = map;
        if (categoryItem2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) categoryItem2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(CategoryItem.class);
        long nativePtr = table.getNativePtr();
        CategoryItemColumnInfo categoryItemColumnInfo = (CategoryItemColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) CategoryItem.class);
        long j3 = categoryItemColumnInfo.idIndex;
        C4607xaf5ee912 ru_unicorn_ujin_data_realm_marketplace_categoryitemrealmproxyinterface = categoryItem2;
        String realmGet$id = ru_unicorn_ujin_data_realm_marketplace_categoryitemrealmproxyinterface.realmGet$id();
        if (realmGet$id == null) {
            j = Table.nativeFindFirstNull(nativePtr, j3);
        } else {
            j = Table.nativeFindFirstString(nativePtr, j3, realmGet$id);
        }
        long createRowWithPrimaryKey = j == -1 ? OsObject.createRowWithPrimaryKey(table, j3, realmGet$id) : j;
        map2.put(categoryItem2, Long.valueOf(createRowWithPrimaryKey));
        String realmGet$title = ru_unicorn_ujin_data_realm_marketplace_categoryitemrealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            j2 = createRowWithPrimaryKey;
            Table.nativeSetString(nativePtr, categoryItemColumnInfo.titleIndex, createRowWithPrimaryKey, realmGet$title, false);
        } else {
            j2 = createRowWithPrimaryKey;
            Table.nativeSetNull(nativePtr, categoryItemColumnInfo.titleIndex, j2, false);
        }
        String realmGet$parent = ru_unicorn_ujin_data_realm_marketplace_categoryitemrealmproxyinterface.realmGet$parent();
        if (realmGet$parent != null) {
            Table.nativeSetString(nativePtr, categoryItemColumnInfo.parentIndex, j2, realmGet$parent, false);
        } else {
            Table.nativeSetNull(nativePtr, categoryItemColumnInfo.parentIndex, j2, false);
        }
        String realmGet$icon = ru_unicorn_ujin_data_realm_marketplace_categoryitemrealmproxyinterface.realmGet$icon();
        if (realmGet$icon != null) {
            Table.nativeSetString(nativePtr, categoryItemColumnInfo.iconIndex, j2, realmGet$icon, false);
        } else {
            Table.nativeSetNull(nativePtr, categoryItemColumnInfo.iconIndex, j2, false);
        }
        String realmGet$contentType = ru_unicorn_ujin_data_realm_marketplace_categoryitemrealmproxyinterface.realmGet$contentType();
        if (realmGet$contentType != null) {
            Table.nativeSetString(nativePtr, categoryItemColumnInfo.contentTypeIndex, j2, realmGet$contentType, false);
        } else {
            Table.nativeSetNull(nativePtr, categoryItemColumnInfo.contentTypeIndex, j2, false);
        }
        long j4 = j2;
        OsList osList = new OsList(table.getUncheckedRow(j4), categoryItemColumnInfo.childrenIndex);
        RealmList<Category> realmGet$children = ru_unicorn_ujin_data_realm_marketplace_categoryitemrealmproxyinterface.realmGet$children();
        if (realmGet$children == null || ((long) realmGet$children.size()) != osList.size()) {
            osList.removeAll();
            if (realmGet$children != null) {
                Iterator<Category> it = realmGet$children.iterator();
                while (it.hasNext()) {
                    Category next = it.next();
                    Long l = map2.get(next);
                    if (l == null) {
                        l = Long.valueOf(ru_unicorn_ujin_data_realm_marketplace_CategoryRealmProxy.insertOrUpdate(realm2, next, map2));
                    }
                    osList.addRow(l.longValue());
                }
            }
        } else {
            int size = realmGet$children.size();
            for (int i = 0; i < size; i++) {
                Category category = realmGet$children.get(i);
                Long l2 = map2.get(category);
                if (l2 == null) {
                    l2 = Long.valueOf(ru_unicorn_ujin_data_realm_marketplace_CategoryRealmProxy.insertOrUpdate(realm2, category, map2));
                }
                osList.setRow((long) i, l2.longValue());
            }
        }
        return j4;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(CategoryItem.class);
        long nativePtr = table.getNativePtr();
        CategoryItemColumnInfo categoryItemColumnInfo = (CategoryItemColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) CategoryItem.class);
        long j3 = categoryItemColumnInfo.idIndex;
        while (it.hasNext()) {
            CategoryItem categoryItem = (CategoryItem) it.next();
            if (!map2.containsKey(categoryItem)) {
                if (categoryItem instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) categoryItem;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(categoryItem, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                C4607xaf5ee912 ru_unicorn_ujin_data_realm_marketplace_categoryitemrealmproxyinterface = categoryItem;
                String realmGet$id = ru_unicorn_ujin_data_realm_marketplace_categoryitemrealmproxyinterface.realmGet$id();
                if (realmGet$id == null) {
                    j = Table.nativeFindFirstNull(nativePtr, j3);
                } else {
                    j = Table.nativeFindFirstString(nativePtr, j3, realmGet$id);
                }
                long createRowWithPrimaryKey = j == -1 ? OsObject.createRowWithPrimaryKey(table, j3, realmGet$id) : j;
                map2.put(categoryItem, Long.valueOf(createRowWithPrimaryKey));
                String realmGet$title = ru_unicorn_ujin_data_realm_marketplace_categoryitemrealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    j2 = createRowWithPrimaryKey;
                    Table.nativeSetString(nativePtr, categoryItemColumnInfo.titleIndex, createRowWithPrimaryKey, realmGet$title, false);
                } else {
                    j2 = createRowWithPrimaryKey;
                    Table.nativeSetNull(nativePtr, categoryItemColumnInfo.titleIndex, j2, false);
                }
                String realmGet$parent = ru_unicorn_ujin_data_realm_marketplace_categoryitemrealmproxyinterface.realmGet$parent();
                if (realmGet$parent != null) {
                    Table.nativeSetString(nativePtr, categoryItemColumnInfo.parentIndex, j2, realmGet$parent, false);
                } else {
                    Table.nativeSetNull(nativePtr, categoryItemColumnInfo.parentIndex, j2, false);
                }
                String realmGet$icon = ru_unicorn_ujin_data_realm_marketplace_categoryitemrealmproxyinterface.realmGet$icon();
                if (realmGet$icon != null) {
                    Table.nativeSetString(nativePtr, categoryItemColumnInfo.iconIndex, j2, realmGet$icon, false);
                } else {
                    Table.nativeSetNull(nativePtr, categoryItemColumnInfo.iconIndex, j2, false);
                }
                String realmGet$contentType = ru_unicorn_ujin_data_realm_marketplace_categoryitemrealmproxyinterface.realmGet$contentType();
                if (realmGet$contentType != null) {
                    Table.nativeSetString(nativePtr, categoryItemColumnInfo.contentTypeIndex, j2, realmGet$contentType, false);
                } else {
                    Table.nativeSetNull(nativePtr, categoryItemColumnInfo.contentTypeIndex, j2, false);
                }
                OsList osList = new OsList(table.getUncheckedRow(j2), categoryItemColumnInfo.childrenIndex);
                RealmList<Category> realmGet$children = ru_unicorn_ujin_data_realm_marketplace_categoryitemrealmproxyinterface.realmGet$children();
                if (realmGet$children == null || ((long) realmGet$children.size()) != osList.size()) {
                    osList.removeAll();
                    if (realmGet$children != null) {
                        Iterator<Category> it2 = realmGet$children.iterator();
                        while (it2.hasNext()) {
                            Category next = it2.next();
                            Long l = map2.get(next);
                            if (l == null) {
                                l = Long.valueOf(ru_unicorn_ujin_data_realm_marketplace_CategoryRealmProxy.insertOrUpdate(realm2, next, map2));
                            }
                            osList.addRow(l.longValue());
                        }
                    }
                } else {
                    int size = realmGet$children.size();
                    for (int i = 0; i < size; i++) {
                        Category category = realmGet$children.get(i);
                        Long l2 = map2.get(category);
                        if (l2 == null) {
                            l2 = Long.valueOf(ru_unicorn_ujin_data_realm_marketplace_CategoryRealmProxy.insertOrUpdate(realm2, category, map2));
                        }
                        osList.setRow((long) i, l2.longValue());
                    }
                }
            }
        }
    }

    public static CategoryItem createDetachedCopy(CategoryItem categoryItem, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        CategoryItem categoryItem2;
        if (i > i2 || categoryItem == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(categoryItem);
        if (cacheData == null) {
            categoryItem2 = new CategoryItem();
            map.put(categoryItem, new RealmObjectProxy.CacheData(i, categoryItem2));
        } else if (i >= cacheData.minDepth) {
            return (CategoryItem) cacheData.object;
        } else {
            cacheData.minDepth = i;
            categoryItem2 = (CategoryItem) cacheData.object;
        }
        C4607xaf5ee912 ru_unicorn_ujin_data_realm_marketplace_categoryitemrealmproxyinterface = categoryItem2;
        C4607xaf5ee912 ru_unicorn_ujin_data_realm_marketplace_categoryitemrealmproxyinterface2 = categoryItem;
        ru_unicorn_ujin_data_realm_marketplace_categoryitemrealmproxyinterface.realmSet$id(ru_unicorn_ujin_data_realm_marketplace_categoryitemrealmproxyinterface2.realmGet$id());
        ru_unicorn_ujin_data_realm_marketplace_categoryitemrealmproxyinterface.realmSet$title(ru_unicorn_ujin_data_realm_marketplace_categoryitemrealmproxyinterface2.realmGet$title());
        ru_unicorn_ujin_data_realm_marketplace_categoryitemrealmproxyinterface.realmSet$parent(ru_unicorn_ujin_data_realm_marketplace_categoryitemrealmproxyinterface2.realmGet$parent());
        ru_unicorn_ujin_data_realm_marketplace_categoryitemrealmproxyinterface.realmSet$icon(ru_unicorn_ujin_data_realm_marketplace_categoryitemrealmproxyinterface2.realmGet$icon());
        ru_unicorn_ujin_data_realm_marketplace_categoryitemrealmproxyinterface.realmSet$contentType(ru_unicorn_ujin_data_realm_marketplace_categoryitemrealmproxyinterface2.realmGet$contentType());
        if (i == i2) {
            ru_unicorn_ujin_data_realm_marketplace_categoryitemrealmproxyinterface.realmSet$children((RealmList<Category>) null);
        } else {
            RealmList<Category> realmGet$children = ru_unicorn_ujin_data_realm_marketplace_categoryitemrealmproxyinterface2.realmGet$children();
            RealmList realmList = new RealmList();
            ru_unicorn_ujin_data_realm_marketplace_categoryitemrealmproxyinterface.realmSet$children(realmList);
            int i3 = i + 1;
            int size = realmGet$children.size();
            for (int i4 = 0; i4 < size; i4++) {
                realmList.add(ru_unicorn_ujin_data_realm_marketplace_CategoryRealmProxy.createDetachedCopy(realmGet$children.get(i4), i3, i2, map));
            }
        }
        return categoryItem2;
    }

    static CategoryItem update(Realm realm, CategoryItemColumnInfo categoryItemColumnInfo, CategoryItem categoryItem, CategoryItem categoryItem2, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        C4607xaf5ee912 ru_unicorn_ujin_data_realm_marketplace_categoryitemrealmproxyinterface = categoryItem;
        C4607xaf5ee912 ru_unicorn_ujin_data_realm_marketplace_categoryitemrealmproxyinterface2 = categoryItem2;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(CategoryItem.class), categoryItemColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(categoryItemColumnInfo.idIndex, ru_unicorn_ujin_data_realm_marketplace_categoryitemrealmproxyinterface2.realmGet$id());
        osObjectBuilder.addString(categoryItemColumnInfo.titleIndex, ru_unicorn_ujin_data_realm_marketplace_categoryitemrealmproxyinterface2.realmGet$title());
        osObjectBuilder.addString(categoryItemColumnInfo.parentIndex, ru_unicorn_ujin_data_realm_marketplace_categoryitemrealmproxyinterface2.realmGet$parent());
        osObjectBuilder.addString(categoryItemColumnInfo.iconIndex, ru_unicorn_ujin_data_realm_marketplace_categoryitemrealmproxyinterface2.realmGet$icon());
        osObjectBuilder.addString(categoryItemColumnInfo.contentTypeIndex, ru_unicorn_ujin_data_realm_marketplace_categoryitemrealmproxyinterface2.realmGet$contentType());
        RealmList<Category> realmGet$children = ru_unicorn_ujin_data_realm_marketplace_categoryitemrealmproxyinterface2.realmGet$children();
        if (realmGet$children != null) {
            RealmList realmList = new RealmList();
            for (int i = 0; i < realmGet$children.size(); i++) {
                Category category = realmGet$children.get(i);
                Category category2 = (Category) map.get(category);
                if (category2 != null) {
                    realmList.add(category2);
                } else {
                    realmList.add(ru_unicorn_ujin_data_realm_marketplace_CategoryRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_marketplace_CategoryRealmProxy.CategoryColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Category.class), category, true, map, set));
                }
            }
            osObjectBuilder.addObjectList(categoryItemColumnInfo.childrenIndex, realmList);
        } else {
            osObjectBuilder.addObjectList(categoryItemColumnInfo.childrenIndex, new RealmList());
        }
        osObjectBuilder.updateExistingObject();
        return categoryItem;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("CategoryItem = proxy[");
        sb.append("{id:");
        String str = "null";
        sb.append(realmGet$id() != null ? realmGet$id() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{title:");
        sb.append(realmGet$title() != null ? realmGet$title() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{parent:");
        sb.append(realmGet$parent() != null ? realmGet$parent() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{icon:");
        sb.append(realmGet$icon() != null ? realmGet$icon() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{contentType:");
        if (realmGet$contentType() != null) {
            str = realmGet$contentType();
        }
        sb.append(str);
        sb.append("}");
        sb.append(",");
        sb.append("{children:");
        sb.append("RealmList<Category>[");
        sb.append(realmGet$children().size());
        sb.append("]");
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
        ru_unicorn_ujin_data_realm_marketplace_CategoryItemRealmProxy ru_unicorn_ujin_data_realm_marketplace_categoryitemrealmproxy = (ru_unicorn_ujin_data_realm_marketplace_CategoryItemRealmProxy) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_data_realm_marketplace_categoryitemrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_data_realm_marketplace_categoryitemrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_data_realm_marketplace_categoryitemrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
