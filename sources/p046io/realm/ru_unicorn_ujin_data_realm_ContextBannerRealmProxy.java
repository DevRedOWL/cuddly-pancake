package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p035ru.unicorn.ujin.data.realm.ContextBanner;
import p035ru.unicorn.ujin.data.realm.Layout;
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
import p046io.realm.ru_unicorn_ujin_data_realm_LayoutRealmProxy;

/* renamed from: io.realm.ru_unicorn_ujin_data_realm_ContextBannerRealmProxy */
public class ru_unicorn_ujin_data_realm_ContextBannerRealmProxy extends ContextBanner implements RealmObjectProxy, ru_unicorn_ujin_data_realm_ContextBannerRealmProxyInterface {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private ContextBannerColumnInfo columnInfo;
    private ProxyState<ContextBanner> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_ContextBannerRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "ContextBanner";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_ContextBannerRealmProxy$ContextBannerColumnInfo */
    static final class ContextBannerColumnInfo extends ColumnInfo {
        long idIndex;
        long layoutIndex;
        long maxColumnIndexValue;
        long typeIndex;

        ContextBannerColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(3);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.layoutIndex = addColumnDetails("layout", "layout", objectSchemaInfo);
            this.typeIndex = addColumnDetails("type", "type", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        ContextBannerColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new ContextBannerColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            ContextBannerColumnInfo contextBannerColumnInfo = (ContextBannerColumnInfo) columnInfo;
            ContextBannerColumnInfo contextBannerColumnInfo2 = (ContextBannerColumnInfo) columnInfo2;
            contextBannerColumnInfo2.idIndex = contextBannerColumnInfo.idIndex;
            contextBannerColumnInfo2.layoutIndex = contextBannerColumnInfo.layoutIndex;
            contextBannerColumnInfo2.typeIndex = contextBannerColumnInfo.typeIndex;
            contextBannerColumnInfo2.maxColumnIndexValue = contextBannerColumnInfo.maxColumnIndexValue;
        }
    }

    ru_unicorn_ujin_data_realm_ContextBannerRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (ContextBannerColumnInfo) realmObjectContext.getColumnInfo();
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

    public Layout realmGet$layout() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.layoutIndex)) {
            return null;
        }
        return (Layout) this.proxyState.getRealm$realm().get(Layout.class, this.proxyState.getRow$realm().getLink(this.columnInfo.layoutIndex), false, Collections.emptyList());
    }

    public void realmSet$layout(Layout layout) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (layout == null) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.layoutIndex);
                return;
            }
            this.proxyState.checkValidObject(layout);
            this.proxyState.getRow$realm().setLink(this.columnInfo.layoutIndex, ((RealmObjectProxy) layout).realmGet$proxyState().getRow$realm().getIndex());
        } else if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("layout")) {
            if (layout != null && !RealmObject.isManaged(layout)) {
                layout = (Layout) ((Realm) this.proxyState.getRealm$realm()).copyToRealm(layout, new ImportFlag[0]);
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (layout == null) {
                row$realm.nullifyLink(this.columnInfo.layoutIndex);
                return;
            }
            this.proxyState.checkValidObject(layout);
            row$realm.getTable().setLink(this.columnInfo.layoutIndex, row$realm.getIndex(), ((RealmObjectProxy) layout).realmGet$proxyState().getRow$realm().getIndex(), true);
        }
    }

    public String realmGet$type() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.typeIndex);
    }

    public void realmSet$type(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.typeIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.typeIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.typeIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.typeIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 3, 0);
        builder.addPersistedProperty("id", RealmFieldType.STRING, true, true, false);
        builder.addPersistedLinkProperty("layout", RealmFieldType.OBJECT, ru_unicorn_ujin_data_realm_LayoutRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME);
        builder.addPersistedProperty("type", RealmFieldType.STRING, false, false, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static ContextBannerColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new ContextBannerColumnInfo(osSchemaInfo);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ca  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.data.realm.ContextBanner createOrUpdateUsingJsonObject(p046io.realm.Realm r14, org.json.JSONObject r15, boolean r16) throws org.json.JSONException {
        /*
            r0 = r14
            r7 = r15
            r8 = r16
            java.util.ArrayList r9 = new java.util.ArrayList
            r10 = 1
            r9.<init>(r10)
            r11 = 0
            java.lang.String r12 = "id"
            if (r8 == 0) goto L_0x006b
            java.lang.Class<ru.unicorn.ujin.data.realm.ContextBanner> r1 = p035ru.unicorn.ujin.data.realm.ContextBanner.class
            io.realm.internal.Table r1 = r14.getTable(r1)
            io.realm.RealmSchema r2 = r14.getSchema()
            java.lang.Class<ru.unicorn.ujin.data.realm.ContextBanner> r3 = p035ru.unicorn.ujin.data.realm.ContextBanner.class
            io.realm.internal.ColumnInfo r2 = r2.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r3)
            io.realm.ru_unicorn_ujin_data_realm_ContextBannerRealmProxy$ContextBannerColumnInfo r2 = (p046io.realm.ru_unicorn_ujin_data_realm_ContextBannerRealmProxy.ContextBannerColumnInfo) r2
            long r2 = r2.idIndex
            boolean r4 = r15.isNull(r12)
            if (r4 == 0) goto L_0x002e
            long r2 = r1.findFirstNull(r2)
            goto L_0x0036
        L_0x002e:
            java.lang.String r4 = r15.getString(r12)
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
            java.lang.Class<ru.unicorn.ujin.data.realm.ContextBanner> r2 = p035ru.unicorn.ujin.data.realm.ContextBanner.class
            io.realm.internal.ColumnInfo r4 = r1.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r2)     // Catch:{ all -> 0x0066 }
            r5 = 0
            java.util.List r6 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0066 }
            r1 = r13
            r2 = r14
            r1.set(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0066 }
            io.realm.ru_unicorn_ujin_data_realm_ContextBannerRealmProxy r1 = new io.realm.ru_unicorn_ujin_data_realm_ContextBannerRealmProxy     // Catch:{ all -> 0x0066 }
            r1.<init>()     // Catch:{ all -> 0x0066 }
            r13.clear()
            goto L_0x006c
        L_0x0066:
            r0 = move-exception
            r13.clear()
            throw r0
        L_0x006b:
            r1 = r11
        L_0x006c:
            java.lang.String r2 = "layout"
            if (r1 != 0) goto L_0x00a3
            boolean r1 = r15.has(r2)
            if (r1 == 0) goto L_0x0079
            r9.add(r2)
        L_0x0079:
            boolean r1 = r15.has(r12)
            if (r1 == 0) goto L_0x009b
            boolean r1 = r15.isNull(r12)
            if (r1 == 0) goto L_0x008e
            java.lang.Class<ru.unicorn.ujin.data.realm.ContextBanner> r1 = p035ru.unicorn.ujin.data.realm.ContextBanner.class
            io.realm.RealmModel r1 = r14.createObjectInternal(r1, r11, r10, r9)
            io.realm.ru_unicorn_ujin_data_realm_ContextBannerRealmProxy r1 = (p046io.realm.ru_unicorn_ujin_data_realm_ContextBannerRealmProxy) r1
            goto L_0x00a3
        L_0x008e:
            java.lang.Class<ru.unicorn.ujin.data.realm.ContextBanner> r1 = p035ru.unicorn.ujin.data.realm.ContextBanner.class
            java.lang.String r3 = r15.getString(r12)
            io.realm.RealmModel r1 = r14.createObjectInternal(r1, r3, r10, r9)
            io.realm.ru_unicorn_ujin_data_realm_ContextBannerRealmProxy r1 = (p046io.realm.ru_unicorn_ujin_data_realm_ContextBannerRealmProxy) r1
            goto L_0x00a3
        L_0x009b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "JSON object doesn't have the primary key field 'id'."
            r0.<init>(r1)
            throw r0
        L_0x00a3:
            r3 = r1
            io.realm.ru_unicorn_ujin_data_realm_ContextBannerRealmProxyInterface r3 = (p046io.realm.ru_unicorn_ujin_data_realm_ContextBannerRealmProxyInterface) r3
            boolean r4 = r15.has(r2)
            if (r4 == 0) goto L_0x00c1
            boolean r4 = r15.isNull(r2)
            if (r4 == 0) goto L_0x00b6
            r3.realmSet$layout(r11)
            goto L_0x00c1
        L_0x00b6:
            org.json.JSONObject r2 = r15.getJSONObject(r2)
            ru.unicorn.ujin.data.realm.Layout r0 = p046io.realm.ru_unicorn_ujin_data_realm_LayoutRealmProxy.createOrUpdateUsingJsonObject(r14, r2, r8)
            r3.realmSet$layout(r0)
        L_0x00c1:
            java.lang.String r0 = "type"
            boolean r2 = r15.has(r0)
            if (r2 == 0) goto L_0x00db
            boolean r2 = r15.isNull(r0)
            if (r2 == 0) goto L_0x00d4
            r3.realmSet$type(r11)
            goto L_0x00db
        L_0x00d4:
            java.lang.String r0 = r15.getString(r0)
            r3.realmSet$type(r0)
        L_0x00db:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.ru_unicorn_ujin_data_realm_ContextBannerRealmProxy.createOrUpdateUsingJsonObject(io.realm.Realm, org.json.JSONObject, boolean):ru.unicorn.ujin.data.realm.ContextBanner");
    }

    public static ContextBanner createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        ContextBanner contextBanner = new ContextBanner();
        ru_unicorn_ujin_data_realm_ContextBannerRealmProxyInterface ru_unicorn_ujin_data_realm_contextbannerrealmproxyinterface = contextBanner;
        jsonReader.beginObject();
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("id")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_contextbannerrealmproxyinterface.realmSet$id(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_contextbannerrealmproxyinterface.realmSet$id((String) null);
                }
                z = true;
            } else if (nextName.equals("layout")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_contextbannerrealmproxyinterface.realmSet$layout((Layout) null);
                } else {
                    ru_unicorn_ujin_data_realm_contextbannerrealmproxyinterface.realmSet$layout(ru_unicorn_ujin_data_realm_LayoutRealmProxy.createUsingJsonStream(realm, jsonReader));
                }
            } else if (!nextName.equals("type")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_data_realm_contextbannerrealmproxyinterface.realmSet$type(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_data_realm_contextbannerrealmproxyinterface.realmSet$type((String) null);
            }
        }
        jsonReader.endObject();
        if (z) {
            return (ContextBanner) realm.copyToRealm(contextBanner, new ImportFlag[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
    }

    private static ru_unicorn_ujin_data_realm_ContextBannerRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) ContextBanner.class), false, Collections.emptyList());
        ru_unicorn_ujin_data_realm_ContextBannerRealmProxy ru_unicorn_ujin_data_realm_contextbannerrealmproxy = new ru_unicorn_ujin_data_realm_ContextBannerRealmProxy();
        realmObjectContext.clear();
        return ru_unicorn_ujin_data_realm_contextbannerrealmproxy;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.data.realm.ContextBanner copyOrUpdate(p046io.realm.Realm r8, p046io.realm.ru_unicorn_ujin_data_realm_ContextBannerRealmProxy.ContextBannerColumnInfo r9, p035ru.unicorn.ujin.data.realm.ContextBanner r10, boolean r11, java.util.Map<p046io.realm.RealmModel, p046io.realm.internal.RealmObjectProxy> r12, java.util.Set<p046io.realm.ImportFlag> r13) {
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
            ru.unicorn.ujin.data.realm.ContextBanner r1 = (p035ru.unicorn.ujin.data.realm.ContextBanner) r1
            return r1
        L_0x004b:
            r1 = 0
            if (r11 == 0) goto L_0x0093
            java.lang.Class<ru.unicorn.ujin.data.realm.ContextBanner> r2 = p035ru.unicorn.ujin.data.realm.ContextBanner.class
            io.realm.internal.Table r2 = r8.getTable(r2)
            long r3 = r9.idIndex
            r5 = r10
            io.realm.ru_unicorn_ujin_data_realm_ContextBannerRealmProxyInterface r5 = (p046io.realm.ru_unicorn_ujin_data_realm_ContextBannerRealmProxyInterface) r5
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
            io.realm.ru_unicorn_ujin_data_realm_ContextBannerRealmProxy r1 = new io.realm.ru_unicorn_ujin_data_realm_ContextBannerRealmProxy     // Catch:{ all -> 0x008e }
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
            ru.unicorn.ujin.data.realm.ContextBanner r8 = update(r1, r2, r3, r4, r5, r6)
            goto L_0x00a5
        L_0x00a1:
            ru.unicorn.ujin.data.realm.ContextBanner r8 = copy(r8, r9, r10, r11, r12, r13)
        L_0x00a5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.ru_unicorn_ujin_data_realm_ContextBannerRealmProxy.copyOrUpdate(io.realm.Realm, io.realm.ru_unicorn_ujin_data_realm_ContextBannerRealmProxy$ContextBannerColumnInfo, ru.unicorn.ujin.data.realm.ContextBanner, boolean, java.util.Map, java.util.Set):ru.unicorn.ujin.data.realm.ContextBanner");
    }

    public static ContextBanner copy(Realm realm, ContextBannerColumnInfo contextBannerColumnInfo, ContextBanner contextBanner, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(contextBanner);
        if (realmObjectProxy != null) {
            return (ContextBanner) realmObjectProxy;
        }
        ru_unicorn_ujin_data_realm_ContextBannerRealmProxyInterface ru_unicorn_ujin_data_realm_contextbannerrealmproxyinterface = contextBanner;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(ContextBanner.class), contextBannerColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(contextBannerColumnInfo.idIndex, ru_unicorn_ujin_data_realm_contextbannerrealmproxyinterface.realmGet$id());
        osObjectBuilder.addString(contextBannerColumnInfo.typeIndex, ru_unicorn_ujin_data_realm_contextbannerrealmproxyinterface.realmGet$type());
        ru_unicorn_ujin_data_realm_ContextBannerRealmProxy newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(contextBanner, newProxyInstance);
        Layout realmGet$layout = ru_unicorn_ujin_data_realm_contextbannerrealmproxyinterface.realmGet$layout();
        if (realmGet$layout == null) {
            newProxyInstance.realmSet$layout((Layout) null);
        } else {
            Layout layout = (Layout) map.get(realmGet$layout);
            if (layout != null) {
                newProxyInstance.realmSet$layout(layout);
            } else {
                newProxyInstance.realmSet$layout(ru_unicorn_ujin_data_realm_LayoutRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_LayoutRealmProxy.LayoutColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Layout.class), realmGet$layout, z, map, set));
            }
        }
        return newProxyInstance;
    }

    public static long insert(Realm realm, ContextBanner contextBanner, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Realm realm2 = realm;
        ContextBanner contextBanner2 = contextBanner;
        Map<RealmModel, Long> map2 = map;
        if (contextBanner2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) contextBanner2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(ContextBanner.class);
        long nativePtr = table.getNativePtr();
        ContextBannerColumnInfo contextBannerColumnInfo = (ContextBannerColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ContextBanner.class);
        long j3 = contextBannerColumnInfo.idIndex;
        ru_unicorn_ujin_data_realm_ContextBannerRealmProxyInterface ru_unicorn_ujin_data_realm_contextbannerrealmproxyinterface = contextBanner2;
        String realmGet$id = ru_unicorn_ujin_data_realm_contextbannerrealmproxyinterface.realmGet$id();
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
        map2.put(contextBanner2, Long.valueOf(j2));
        Layout realmGet$layout = ru_unicorn_ujin_data_realm_contextbannerrealmproxyinterface.realmGet$layout();
        if (realmGet$layout != null) {
            Long l = map2.get(realmGet$layout);
            if (l == null) {
                l = Long.valueOf(ru_unicorn_ujin_data_realm_LayoutRealmProxy.insert(realm2, realmGet$layout, map2));
            }
            Table.nativeSetLink(nativePtr, contextBannerColumnInfo.layoutIndex, j2, l.longValue(), false);
        }
        String realmGet$type = ru_unicorn_ujin_data_realm_contextbannerrealmproxyinterface.realmGet$type();
        if (realmGet$type != null) {
            Table.nativeSetString(nativePtr, contextBannerColumnInfo.typeIndex, j2, realmGet$type, false);
        }
        return j2;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(ContextBanner.class);
        long nativePtr = table.getNativePtr();
        ContextBannerColumnInfo contextBannerColumnInfo = (ContextBannerColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ContextBanner.class);
        long j3 = contextBannerColumnInfo.idIndex;
        while (it.hasNext()) {
            ContextBanner contextBanner = (ContextBanner) it.next();
            if (!map2.containsKey(contextBanner)) {
                if (contextBanner instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) contextBanner;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(contextBanner, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                ru_unicorn_ujin_data_realm_ContextBannerRealmProxyInterface ru_unicorn_ujin_data_realm_contextbannerrealmproxyinterface = contextBanner;
                String realmGet$id = ru_unicorn_ujin_data_realm_contextbannerrealmproxyinterface.realmGet$id();
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
                map2.put(contextBanner, Long.valueOf(j2));
                Layout realmGet$layout = ru_unicorn_ujin_data_realm_contextbannerrealmproxyinterface.realmGet$layout();
                if (realmGet$layout != null) {
                    Long l = map2.get(realmGet$layout);
                    if (l == null) {
                        l = Long.valueOf(ru_unicorn_ujin_data_realm_LayoutRealmProxy.insert(realm2, realmGet$layout, map2));
                    }
                    table.setLink(contextBannerColumnInfo.layoutIndex, j2, l.longValue(), false);
                }
                String realmGet$type = ru_unicorn_ujin_data_realm_contextbannerrealmproxyinterface.realmGet$type();
                if (realmGet$type != null) {
                    Table.nativeSetString(nativePtr, contextBannerColumnInfo.typeIndex, j2, realmGet$type, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, ContextBanner contextBanner, Map<RealmModel, Long> map) {
        long j;
        Realm realm2 = realm;
        ContextBanner contextBanner2 = contextBanner;
        Map<RealmModel, Long> map2 = map;
        if (contextBanner2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) contextBanner2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(ContextBanner.class);
        long nativePtr = table.getNativePtr();
        ContextBannerColumnInfo contextBannerColumnInfo = (ContextBannerColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ContextBanner.class);
        long j2 = contextBannerColumnInfo.idIndex;
        ru_unicorn_ujin_data_realm_ContextBannerRealmProxyInterface ru_unicorn_ujin_data_realm_contextbannerrealmproxyinterface = contextBanner2;
        String realmGet$id = ru_unicorn_ujin_data_realm_contextbannerrealmproxyinterface.realmGet$id();
        if (realmGet$id == null) {
            j = Table.nativeFindFirstNull(nativePtr, j2);
        } else {
            j = Table.nativeFindFirstString(nativePtr, j2, realmGet$id);
        }
        long createRowWithPrimaryKey = j == -1 ? OsObject.createRowWithPrimaryKey(table, j2, realmGet$id) : j;
        map2.put(contextBanner2, Long.valueOf(createRowWithPrimaryKey));
        Layout realmGet$layout = ru_unicorn_ujin_data_realm_contextbannerrealmproxyinterface.realmGet$layout();
        if (realmGet$layout != null) {
            Long l = map2.get(realmGet$layout);
            if (l == null) {
                l = Long.valueOf(ru_unicorn_ujin_data_realm_LayoutRealmProxy.insertOrUpdate(realm2, realmGet$layout, map2));
            }
            Table.nativeSetLink(nativePtr, contextBannerColumnInfo.layoutIndex, createRowWithPrimaryKey, l.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, contextBannerColumnInfo.layoutIndex, createRowWithPrimaryKey);
        }
        String realmGet$type = ru_unicorn_ujin_data_realm_contextbannerrealmproxyinterface.realmGet$type();
        if (realmGet$type != null) {
            Table.nativeSetString(nativePtr, contextBannerColumnInfo.typeIndex, createRowWithPrimaryKey, realmGet$type, false);
        } else {
            Table.nativeSetNull(nativePtr, contextBannerColumnInfo.typeIndex, createRowWithPrimaryKey, false);
        }
        return createRowWithPrimaryKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(ContextBanner.class);
        long nativePtr = table.getNativePtr();
        ContextBannerColumnInfo contextBannerColumnInfo = (ContextBannerColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ContextBanner.class);
        long j3 = contextBannerColumnInfo.idIndex;
        while (it.hasNext()) {
            ContextBanner contextBanner = (ContextBanner) it.next();
            if (!map2.containsKey(contextBanner)) {
                if (contextBanner instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) contextBanner;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(contextBanner, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                ru_unicorn_ujin_data_realm_ContextBannerRealmProxyInterface ru_unicorn_ujin_data_realm_contextbannerrealmproxyinterface = contextBanner;
                String realmGet$id = ru_unicorn_ujin_data_realm_contextbannerrealmproxyinterface.realmGet$id();
                if (realmGet$id == null) {
                    j = Table.nativeFindFirstNull(nativePtr, j3);
                } else {
                    j = Table.nativeFindFirstString(nativePtr, j3, realmGet$id);
                }
                long createRowWithPrimaryKey = j == -1 ? OsObject.createRowWithPrimaryKey(table, j3, realmGet$id) : j;
                map2.put(contextBanner, Long.valueOf(createRowWithPrimaryKey));
                Layout realmGet$layout = ru_unicorn_ujin_data_realm_contextbannerrealmproxyinterface.realmGet$layout();
                if (realmGet$layout != null) {
                    Long l = map2.get(realmGet$layout);
                    if (l == null) {
                        l = Long.valueOf(ru_unicorn_ujin_data_realm_LayoutRealmProxy.insertOrUpdate(realm2, realmGet$layout, map2));
                    }
                    j2 = j3;
                    Table.nativeSetLink(nativePtr, contextBannerColumnInfo.layoutIndex, createRowWithPrimaryKey, l.longValue(), false);
                } else {
                    j2 = j3;
                    Table.nativeNullifyLink(nativePtr, contextBannerColumnInfo.layoutIndex, createRowWithPrimaryKey);
                }
                String realmGet$type = ru_unicorn_ujin_data_realm_contextbannerrealmproxyinterface.realmGet$type();
                if (realmGet$type != null) {
                    Table.nativeSetString(nativePtr, contextBannerColumnInfo.typeIndex, createRowWithPrimaryKey, realmGet$type, false);
                } else {
                    Table.nativeSetNull(nativePtr, contextBannerColumnInfo.typeIndex, createRowWithPrimaryKey, false);
                }
                j3 = j2;
            }
        }
    }

    public static ContextBanner createDetachedCopy(ContextBanner contextBanner, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        ContextBanner contextBanner2;
        if (i > i2 || contextBanner == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(contextBanner);
        if (cacheData == null) {
            contextBanner2 = new ContextBanner();
            map.put(contextBanner, new RealmObjectProxy.CacheData(i, contextBanner2));
        } else if (i >= cacheData.minDepth) {
            return (ContextBanner) cacheData.object;
        } else {
            cacheData.minDepth = i;
            contextBanner2 = (ContextBanner) cacheData.object;
        }
        ru_unicorn_ujin_data_realm_ContextBannerRealmProxyInterface ru_unicorn_ujin_data_realm_contextbannerrealmproxyinterface = contextBanner2;
        ru_unicorn_ujin_data_realm_ContextBannerRealmProxyInterface ru_unicorn_ujin_data_realm_contextbannerrealmproxyinterface2 = contextBanner;
        ru_unicorn_ujin_data_realm_contextbannerrealmproxyinterface.realmSet$id(ru_unicorn_ujin_data_realm_contextbannerrealmproxyinterface2.realmGet$id());
        ru_unicorn_ujin_data_realm_contextbannerrealmproxyinterface.realmSet$layout(ru_unicorn_ujin_data_realm_LayoutRealmProxy.createDetachedCopy(ru_unicorn_ujin_data_realm_contextbannerrealmproxyinterface2.realmGet$layout(), i + 1, i2, map));
        ru_unicorn_ujin_data_realm_contextbannerrealmproxyinterface.realmSet$type(ru_unicorn_ujin_data_realm_contextbannerrealmproxyinterface2.realmGet$type());
        return contextBanner2;
    }

    static ContextBanner update(Realm realm, ContextBannerColumnInfo contextBannerColumnInfo, ContextBanner contextBanner, ContextBanner contextBanner2, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        ru_unicorn_ujin_data_realm_ContextBannerRealmProxyInterface ru_unicorn_ujin_data_realm_contextbannerrealmproxyinterface = contextBanner;
        ru_unicorn_ujin_data_realm_ContextBannerRealmProxyInterface ru_unicorn_ujin_data_realm_contextbannerrealmproxyinterface2 = contextBanner2;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(ContextBanner.class), contextBannerColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(contextBannerColumnInfo.idIndex, ru_unicorn_ujin_data_realm_contextbannerrealmproxyinterface2.realmGet$id());
        Layout realmGet$layout = ru_unicorn_ujin_data_realm_contextbannerrealmproxyinterface2.realmGet$layout();
        if (realmGet$layout == null) {
            osObjectBuilder.addNull(contextBannerColumnInfo.layoutIndex);
        } else {
            Layout layout = (Layout) map.get(realmGet$layout);
            if (layout != null) {
                osObjectBuilder.addObject(contextBannerColumnInfo.layoutIndex, layout);
            } else {
                osObjectBuilder.addObject(contextBannerColumnInfo.layoutIndex, ru_unicorn_ujin_data_realm_LayoutRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_LayoutRealmProxy.LayoutColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Layout.class), realmGet$layout, true, map, set));
            }
        }
        osObjectBuilder.addString(contextBannerColumnInfo.typeIndex, ru_unicorn_ujin_data_realm_contextbannerrealmproxyinterface2.realmGet$type());
        osObjectBuilder.updateExistingObject();
        return contextBanner;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("ContextBanner = proxy[");
        sb.append("{id:");
        String str = "null";
        sb.append(realmGet$id() != null ? realmGet$id() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{layout:");
        sb.append(realmGet$layout() != null ? ru_unicorn_ujin_data_realm_LayoutRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME : str);
        sb.append("}");
        sb.append(",");
        sb.append("{type:");
        if (realmGet$type() != null) {
            str = realmGet$type();
        }
        sb.append(str);
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
        ru_unicorn_ujin_data_realm_ContextBannerRealmProxy ru_unicorn_ujin_data_realm_contextbannerrealmproxy = (ru_unicorn_ujin_data_realm_ContextBannerRealmProxy) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_data_realm_contextbannerrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_data_realm_contextbannerrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_data_realm_contextbannerrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
