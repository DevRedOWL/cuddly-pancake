package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.bms.BMSInfo;
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

/* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_bms_BMSInfoRealmProxy */
public class C4680x20fc7e06 extends BMSInfo implements RealmObjectProxy, C4681xaf5175d3 {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private BMSInfoColumnInfo columnInfo;
    private ProxyState<BMSInfo> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_bms_BMSInfoRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "BMSInfo";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_bms_BMSInfoRealmProxy$BMSInfoColumnInfo */
    static final class BMSInfoColumnInfo extends ColumnInfo {
        long maxColumnIndexValue;
        long textIndex;
        long titleIndex;

        BMSInfoColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(2);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.titleIndex = addColumnDetails("title", "title", objectSchemaInfo);
            this.textIndex = addColumnDetails("text", "text", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        BMSInfoColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new BMSInfoColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            BMSInfoColumnInfo bMSInfoColumnInfo = (BMSInfoColumnInfo) columnInfo;
            BMSInfoColumnInfo bMSInfoColumnInfo2 = (BMSInfoColumnInfo) columnInfo2;
            bMSInfoColumnInfo2.titleIndex = bMSInfoColumnInfo.titleIndex;
            bMSInfoColumnInfo2.textIndex = bMSInfoColumnInfo.textIndex;
            bMSInfoColumnInfo2.maxColumnIndexValue = bMSInfoColumnInfo.maxColumnIndexValue;
        }
    }

    C4680x20fc7e06() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (BMSInfoColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public String realmGet$title() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.titleIndex);
    }

    public void realmSet$title(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            throw new RealmException("Primary key field 'title' cannot be changed after object was created.");
        }
    }

    public String realmGet$text() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.textIndex);
    }

    public void realmSet$text(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.textIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.textIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.textIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.textIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 2, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("title", RealmFieldType.STRING, true, true, false);
        builder2.addPersistedProperty("text", RealmFieldType.STRING, false, false, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static BMSInfoColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new BMSInfoColumnInfo(osSchemaInfo);
    }

    /* JADX WARNING: type inference failed for: r12v4, types: [io.realm.RealmModel] */
    /* JADX WARNING: type inference failed for: r12v5, types: [io.realm.RealmModel] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x009f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.view.activity.navigation.p058ui.bms.BMSInfo createOrUpdateUsingJsonObject(p046io.realm.Realm r12, org.json.JSONObject r13, boolean r14) throws org.json.JSONException {
        /*
            java.util.List r0 = java.util.Collections.emptyList()
            r1 = 0
            java.lang.String r2 = "title"
            if (r14 == 0) goto L_0x0064
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.bms.BMSInfo> r14 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.bms.BMSInfo.class
            io.realm.internal.Table r14 = r12.getTable(r14)
            io.realm.RealmSchema r3 = r12.getSchema()
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.bms.BMSInfo> r4 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.bms.BMSInfo.class
            io.realm.internal.ColumnInfo r3 = r3.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r4)
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_bms_BMSInfoRealmProxy$BMSInfoColumnInfo r3 = (p046io.realm.C4680x20fc7e06.BMSInfoColumnInfo) r3
            long r3 = r3.titleIndex
            boolean r5 = r13.isNull(r2)
            if (r5 == 0) goto L_0x0028
            long r3 = r14.findFirstNull(r3)
            goto L_0x0030
        L_0x0028:
            java.lang.String r5 = r13.getString(r2)
            long r3 = r14.findFirstString(r3, r5)
        L_0x0030:
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0064
            io.realm.BaseRealm$ThreadLocalRealmObjectContext r5 = p046io.realm.BaseRealm.objectContext
            java.lang.Object r5 = r5.get()
            io.realm.BaseRealm$RealmObjectContext r5 = (p046io.realm.BaseRealm.RealmObjectContext) r5
            io.realm.internal.UncheckedRow r8 = r14.getUncheckedRow(r3)     // Catch:{ all -> 0x005f }
            io.realm.RealmSchema r14 = r12.getSchema()     // Catch:{ all -> 0x005f }
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.bms.BMSInfo> r3 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.bms.BMSInfo.class
            io.realm.internal.ColumnInfo r9 = r14.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r3)     // Catch:{ all -> 0x005f }
            r10 = 0
            java.util.List r11 = java.util.Collections.emptyList()     // Catch:{ all -> 0x005f }
            r6 = r5
            r7 = r12
            r6.set(r7, r8, r9, r10, r11)     // Catch:{ all -> 0x005f }
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_bms_BMSInfoRealmProxy r14 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_bms_BMSInfoRealmProxy     // Catch:{ all -> 0x005f }
            r14.<init>()     // Catch:{ all -> 0x005f }
            r5.clear()
            goto L_0x0065
        L_0x005f:
            r12 = move-exception
            r5.clear()
            throw r12
        L_0x0064:
            r14 = r1
        L_0x0065:
            if (r14 != 0) goto L_0x0094
            boolean r14 = r13.has(r2)
            if (r14 == 0) goto L_0x008c
            boolean r14 = r13.isNull(r2)
            r3 = 1
            if (r14 == 0) goto L_0x007e
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.bms.BMSInfo> r14 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.bms.BMSInfo.class
            io.realm.RealmModel r12 = r12.createObjectInternal(r14, r1, r3, r0)
            r14 = r12
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_bms_BMSInfoRealmProxy r14 = (p046io.realm.C4680x20fc7e06) r14
            goto L_0x0094
        L_0x007e:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.bms.BMSInfo> r14 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.bms.BMSInfo.class
            java.lang.String r2 = r13.getString(r2)
            io.realm.RealmModel r12 = r12.createObjectInternal(r14, r2, r3, r0)
            r14 = r12
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_bms_BMSInfoRealmProxy r14 = (p046io.realm.C4680x20fc7e06) r14
            goto L_0x0094
        L_0x008c:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = "JSON object doesn't have the primary key field 'title'."
            r12.<init>(r13)
            throw r12
        L_0x0094:
            r12 = r14
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_bms_BMSInfoRealmProxyInterface r12 = (p046io.realm.C4681xaf5175d3) r12
            java.lang.String r0 = "text"
            boolean r2 = r13.has(r0)
            if (r2 == 0) goto L_0x00b0
            boolean r2 = r13.isNull(r0)
            if (r2 == 0) goto L_0x00a9
            r12.realmSet$text(r1)
            goto L_0x00b0
        L_0x00a9:
            java.lang.String r13 = r13.getString(r0)
            r12.realmSet$text(r13)
        L_0x00b0:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.C4680x20fc7e06.createOrUpdateUsingJsonObject(io.realm.Realm, org.json.JSONObject, boolean):ru.unicorn.ujin.view.activity.navigation.ui.bms.BMSInfo");
    }

    public static BMSInfo createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        BMSInfo bMSInfo = new BMSInfo();
        C4681xaf5175d3 ru_unicorn_ujin_view_activity_navigation_ui_bms_bmsinforealmproxyinterface = bMSInfo;
        jsonReader.beginObject();
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("title")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_bms_bmsinforealmproxyinterface.realmSet$title(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_bms_bmsinforealmproxyinterface.realmSet$title((String) null);
                }
                z = true;
            } else if (!nextName.equals("text")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_view_activity_navigation_ui_bms_bmsinforealmproxyinterface.realmSet$text(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_view_activity_navigation_ui_bms_bmsinforealmproxyinterface.realmSet$text((String) null);
            }
        }
        jsonReader.endObject();
        if (z) {
            return (BMSInfo) realm.copyToRealm(bMSInfo, new ImportFlag[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'title'.");
    }

    private static C4680x20fc7e06 newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) BMSInfo.class), false, Collections.emptyList());
        C4680x20fc7e06 ru_unicorn_ujin_view_activity_navigation_ui_bms_bmsinforealmproxy = new C4680x20fc7e06();
        realmObjectContext.clear();
        return ru_unicorn_ujin_view_activity_navigation_ui_bms_bmsinforealmproxy;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.view.activity.navigation.p058ui.bms.BMSInfo copyOrUpdate(p046io.realm.Realm r8, p046io.realm.C4680x20fc7e06.BMSInfoColumnInfo r9, p035ru.unicorn.ujin.view.activity.navigation.p058ui.bms.BMSInfo r10, boolean r11, java.util.Map<p046io.realm.RealmModel, p046io.realm.internal.RealmObjectProxy> r12, java.util.Set<p046io.realm.ImportFlag> r13) {
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
            ru.unicorn.ujin.view.activity.navigation.ui.bms.BMSInfo r1 = (p035ru.unicorn.ujin.view.activity.navigation.p058ui.bms.BMSInfo) r1
            return r1
        L_0x004b:
            r1 = 0
            if (r11 == 0) goto L_0x0093
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.bms.BMSInfo> r2 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.bms.BMSInfo.class
            io.realm.internal.Table r2 = r8.getTable(r2)
            long r3 = r9.titleIndex
            r5 = r10
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_bms_BMSInfoRealmProxyInterface r5 = (p046io.realm.C4681xaf5175d3) r5
            java.lang.String r5 = r5.realmGet$title()
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
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_bms_BMSInfoRealmProxy r1 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_bms_BMSInfoRealmProxy     // Catch:{ all -> 0x008e }
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
            ru.unicorn.ujin.view.activity.navigation.ui.bms.BMSInfo r8 = update(r1, r2, r3, r4, r5, r6)
            goto L_0x00a5
        L_0x00a1:
            ru.unicorn.ujin.view.activity.navigation.ui.bms.BMSInfo r8 = copy(r8, r9, r10, r11, r12, r13)
        L_0x00a5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.C4680x20fc7e06.copyOrUpdate(io.realm.Realm, io.realm.ru_unicorn_ujin_view_activity_navigation_ui_bms_BMSInfoRealmProxy$BMSInfoColumnInfo, ru.unicorn.ujin.view.activity.navigation.ui.bms.BMSInfo, boolean, java.util.Map, java.util.Set):ru.unicorn.ujin.view.activity.navigation.ui.bms.BMSInfo");
    }

    public static BMSInfo copy(Realm realm, BMSInfoColumnInfo bMSInfoColumnInfo, BMSInfo bMSInfo, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(bMSInfo);
        if (realmObjectProxy != null) {
            return (BMSInfo) realmObjectProxy;
        }
        C4681xaf5175d3 ru_unicorn_ujin_view_activity_navigation_ui_bms_bmsinforealmproxyinterface = bMSInfo;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(BMSInfo.class), bMSInfoColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(bMSInfoColumnInfo.titleIndex, ru_unicorn_ujin_view_activity_navigation_ui_bms_bmsinforealmproxyinterface.realmGet$title());
        osObjectBuilder.addString(bMSInfoColumnInfo.textIndex, ru_unicorn_ujin_view_activity_navigation_ui_bms_bmsinforealmproxyinterface.realmGet$text());
        C4680x20fc7e06 newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(bMSInfo, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, BMSInfo bMSInfo, Map<RealmModel, Long> map) {
        long j;
        long j2;
        if (bMSInfo instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) bMSInfo;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(BMSInfo.class);
        long nativePtr = table.getNativePtr();
        BMSInfoColumnInfo bMSInfoColumnInfo = (BMSInfoColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) BMSInfo.class);
        long j3 = bMSInfoColumnInfo.titleIndex;
        C4681xaf5175d3 ru_unicorn_ujin_view_activity_navigation_ui_bms_bmsinforealmproxyinterface = bMSInfo;
        String realmGet$title = ru_unicorn_ujin_view_activity_navigation_ui_bms_bmsinforealmproxyinterface.realmGet$title();
        if (realmGet$title == null) {
            j = Table.nativeFindFirstNull(nativePtr, j3);
        } else {
            j = Table.nativeFindFirstString(nativePtr, j3, realmGet$title);
        }
        if (j == -1) {
            j2 = OsObject.createRowWithPrimaryKey(table, j3, realmGet$title);
        } else {
            Table.throwDuplicatePrimaryKeyException(realmGet$title);
            j2 = j;
        }
        map.put(bMSInfo, Long.valueOf(j2));
        String realmGet$text = ru_unicorn_ujin_view_activity_navigation_ui_bms_bmsinforealmproxyinterface.realmGet$text();
        if (realmGet$text != null) {
            Table.nativeSetString(nativePtr, bMSInfoColumnInfo.textIndex, j2, realmGet$text, false);
        }
        return j2;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(BMSInfo.class);
        long nativePtr = table.getNativePtr();
        BMSInfoColumnInfo bMSInfoColumnInfo = (BMSInfoColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) BMSInfo.class);
        long j3 = bMSInfoColumnInfo.titleIndex;
        while (it.hasNext()) {
            BMSInfo bMSInfo = (BMSInfo) it.next();
            if (!map2.containsKey(bMSInfo)) {
                if (bMSInfo instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) bMSInfo;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(bMSInfo, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                C4681xaf5175d3 ru_unicorn_ujin_view_activity_navigation_ui_bms_bmsinforealmproxyinterface = bMSInfo;
                String realmGet$title = ru_unicorn_ujin_view_activity_navigation_ui_bms_bmsinforealmproxyinterface.realmGet$title();
                if (realmGet$title == null) {
                    j = Table.nativeFindFirstNull(nativePtr, j3);
                } else {
                    j = Table.nativeFindFirstString(nativePtr, j3, realmGet$title);
                }
                if (j == -1) {
                    j2 = OsObject.createRowWithPrimaryKey(table, j3, realmGet$title);
                } else {
                    Table.throwDuplicatePrimaryKeyException(realmGet$title);
                    j2 = j;
                }
                map2.put(bMSInfo, Long.valueOf(j2));
                String realmGet$text = ru_unicorn_ujin_view_activity_navigation_ui_bms_bmsinforealmproxyinterface.realmGet$text();
                if (realmGet$text != null) {
                    Table.nativeSetString(nativePtr, bMSInfoColumnInfo.textIndex, j2, realmGet$text, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, BMSInfo bMSInfo, Map<RealmModel, Long> map) {
        long j;
        if (bMSInfo instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) bMSInfo;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(BMSInfo.class);
        long nativePtr = table.getNativePtr();
        BMSInfoColumnInfo bMSInfoColumnInfo = (BMSInfoColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) BMSInfo.class);
        long j2 = bMSInfoColumnInfo.titleIndex;
        C4681xaf5175d3 ru_unicorn_ujin_view_activity_navigation_ui_bms_bmsinforealmproxyinterface = bMSInfo;
        String realmGet$title = ru_unicorn_ujin_view_activity_navigation_ui_bms_bmsinforealmproxyinterface.realmGet$title();
        if (realmGet$title == null) {
            j = Table.nativeFindFirstNull(nativePtr, j2);
        } else {
            j = Table.nativeFindFirstString(nativePtr, j2, realmGet$title);
        }
        long createRowWithPrimaryKey = j == -1 ? OsObject.createRowWithPrimaryKey(table, j2, realmGet$title) : j;
        map.put(bMSInfo, Long.valueOf(createRowWithPrimaryKey));
        String realmGet$text = ru_unicorn_ujin_view_activity_navigation_ui_bms_bmsinforealmproxyinterface.realmGet$text();
        if (realmGet$text != null) {
            Table.nativeSetString(nativePtr, bMSInfoColumnInfo.textIndex, createRowWithPrimaryKey, realmGet$text, false);
        } else {
            Table.nativeSetNull(nativePtr, bMSInfoColumnInfo.textIndex, createRowWithPrimaryKey, false);
        }
        return createRowWithPrimaryKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(BMSInfo.class);
        long nativePtr = table.getNativePtr();
        BMSInfoColumnInfo bMSInfoColumnInfo = (BMSInfoColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) BMSInfo.class);
        long j2 = bMSInfoColumnInfo.titleIndex;
        while (it.hasNext()) {
            BMSInfo bMSInfo = (BMSInfo) it.next();
            if (!map2.containsKey(bMSInfo)) {
                if (bMSInfo instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) bMSInfo;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(bMSInfo, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                C4681xaf5175d3 ru_unicorn_ujin_view_activity_navigation_ui_bms_bmsinforealmproxyinterface = bMSInfo;
                String realmGet$title = ru_unicorn_ujin_view_activity_navigation_ui_bms_bmsinforealmproxyinterface.realmGet$title();
                if (realmGet$title == null) {
                    j = Table.nativeFindFirstNull(nativePtr, j2);
                } else {
                    j = Table.nativeFindFirstString(nativePtr, j2, realmGet$title);
                }
                long createRowWithPrimaryKey = j == -1 ? OsObject.createRowWithPrimaryKey(table, j2, realmGet$title) : j;
                map2.put(bMSInfo, Long.valueOf(createRowWithPrimaryKey));
                String realmGet$text = ru_unicorn_ujin_view_activity_navigation_ui_bms_bmsinforealmproxyinterface.realmGet$text();
                if (realmGet$text != null) {
                    Table.nativeSetString(nativePtr, bMSInfoColumnInfo.textIndex, createRowWithPrimaryKey, realmGet$text, false);
                } else {
                    Table.nativeSetNull(nativePtr, bMSInfoColumnInfo.textIndex, createRowWithPrimaryKey, false);
                }
            }
        }
    }

    public static BMSInfo createDetachedCopy(BMSInfo bMSInfo, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        BMSInfo bMSInfo2;
        if (i > i2 || bMSInfo == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(bMSInfo);
        if (cacheData == null) {
            bMSInfo2 = new BMSInfo();
            map.put(bMSInfo, new RealmObjectProxy.CacheData(i, bMSInfo2));
        } else if (i >= cacheData.minDepth) {
            return (BMSInfo) cacheData.object;
        } else {
            cacheData.minDepth = i;
            bMSInfo2 = (BMSInfo) cacheData.object;
        }
        C4681xaf5175d3 ru_unicorn_ujin_view_activity_navigation_ui_bms_bmsinforealmproxyinterface = bMSInfo2;
        C4681xaf5175d3 ru_unicorn_ujin_view_activity_navigation_ui_bms_bmsinforealmproxyinterface2 = bMSInfo;
        ru_unicorn_ujin_view_activity_navigation_ui_bms_bmsinforealmproxyinterface.realmSet$title(ru_unicorn_ujin_view_activity_navigation_ui_bms_bmsinforealmproxyinterface2.realmGet$title());
        ru_unicorn_ujin_view_activity_navigation_ui_bms_bmsinforealmproxyinterface.realmSet$text(ru_unicorn_ujin_view_activity_navigation_ui_bms_bmsinforealmproxyinterface2.realmGet$text());
        return bMSInfo2;
    }

    static BMSInfo update(Realm realm, BMSInfoColumnInfo bMSInfoColumnInfo, BMSInfo bMSInfo, BMSInfo bMSInfo2, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        C4681xaf5175d3 ru_unicorn_ujin_view_activity_navigation_ui_bms_bmsinforealmproxyinterface = bMSInfo;
        C4681xaf5175d3 ru_unicorn_ujin_view_activity_navigation_ui_bms_bmsinforealmproxyinterface2 = bMSInfo2;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(BMSInfo.class), bMSInfoColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(bMSInfoColumnInfo.titleIndex, ru_unicorn_ujin_view_activity_navigation_ui_bms_bmsinforealmproxyinterface2.realmGet$title());
        osObjectBuilder.addString(bMSInfoColumnInfo.textIndex, ru_unicorn_ujin_view_activity_navigation_ui_bms_bmsinforealmproxyinterface2.realmGet$text());
        osObjectBuilder.updateExistingObject();
        return bMSInfo;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("BMSInfo = proxy[");
        sb.append("{title:");
        String str = "null";
        sb.append(realmGet$title() != null ? realmGet$title() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{text:");
        if (realmGet$text() != null) {
            str = realmGet$text();
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
        C4680x20fc7e06 ru_unicorn_ujin_view_activity_navigation_ui_bms_bmsinforealmproxy = (C4680x20fc7e06) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_view_activity_navigation_ui_bms_bmsinforealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_view_activity_navigation_ui_bms_bmsinforealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_view_activity_navigation_ui_bms_bmsinforealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
