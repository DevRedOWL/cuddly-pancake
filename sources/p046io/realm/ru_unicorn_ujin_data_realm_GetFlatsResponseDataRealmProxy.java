package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p035ru.unicorn.ujin.data.realm.Flat;
import p035ru.unicorn.ujin.data.realm.GetFlatsResponseData;
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
import p046io.realm.ru_unicorn_ujin_data_realm_FlatRealmProxy;

/* renamed from: io.realm.ru_unicorn_ujin_data_realm_GetFlatsResponseDataRealmProxy */
public class ru_unicorn_ujin_data_realm_GetFlatsResponseDataRealmProxy extends GetFlatsResponseData implements RealmObjectProxy, C4599xaf1d1de8 {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private GetFlatsResponseDataColumnInfo columnInfo;
    private RealmList<Flat> flatListRealmList;
    private ProxyState<GetFlatsResponseData> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_GetFlatsResponseDataRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "GetFlatsResponseData";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_GetFlatsResponseDataRealmProxy$GetFlatsResponseDataColumnInfo */
    static final class GetFlatsResponseDataColumnInfo extends ColumnInfo {
        long countIndex;
        long endingIndex;
        long flatListIndex;
        long idIndex;
        long maxColumnIndexValue;
        long rootIndex;

        GetFlatsResponseDataColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(5);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.countIndex = addColumnDetails("count", "count", objectSchemaInfo);
            this.flatListIndex = addColumnDetails("flatList", "flatList", objectSchemaInfo);
            this.endingIndex = addColumnDetails("ending", "ending", objectSchemaInfo);
            this.rootIndex = addColumnDetails("root", "root", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        GetFlatsResponseDataColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new GetFlatsResponseDataColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            GetFlatsResponseDataColumnInfo getFlatsResponseDataColumnInfo = (GetFlatsResponseDataColumnInfo) columnInfo;
            GetFlatsResponseDataColumnInfo getFlatsResponseDataColumnInfo2 = (GetFlatsResponseDataColumnInfo) columnInfo2;
            getFlatsResponseDataColumnInfo2.idIndex = getFlatsResponseDataColumnInfo.idIndex;
            getFlatsResponseDataColumnInfo2.countIndex = getFlatsResponseDataColumnInfo.countIndex;
            getFlatsResponseDataColumnInfo2.flatListIndex = getFlatsResponseDataColumnInfo.flatListIndex;
            getFlatsResponseDataColumnInfo2.endingIndex = getFlatsResponseDataColumnInfo.endingIndex;
            getFlatsResponseDataColumnInfo2.rootIndex = getFlatsResponseDataColumnInfo.rootIndex;
            getFlatsResponseDataColumnInfo2.maxColumnIndexValue = getFlatsResponseDataColumnInfo.maxColumnIndexValue;
        }
    }

    ru_unicorn_ujin_data_realm_GetFlatsResponseDataRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (GetFlatsResponseDataColumnInfo) realmObjectContext.getColumnInfo();
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

    public Integer realmGet$count() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.countIndex)) {
            return null;
        }
        return Integer.valueOf((int) this.proxyState.getRow$realm().getLong(this.columnInfo.countIndex));
    }

    public void realmSet$count(Integer num) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (num == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.countIndex);
            } else {
                this.proxyState.getRow$realm().setLong(this.columnInfo.countIndex, (long) num.intValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (num == null) {
                row$realm.getTable().setNull(this.columnInfo.countIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setLong(this.columnInfo.countIndex, row$realm.getIndex(), (long) num.intValue(), true);
            }
        }
    }

    public RealmList<Flat> realmGet$flatList() {
        this.proxyState.getRealm$realm().checkIfValid();
        RealmList<Flat> realmList = this.flatListRealmList;
        if (realmList != null) {
            return realmList;
        }
        this.flatListRealmList = new RealmList<>(Flat.class, this.proxyState.getRow$realm().getModelList(this.columnInfo.flatListIndex), this.proxyState.getRealm$realm());
        return this.flatListRealmList;
    }

    public void realmSet$flatList(RealmList<Flat> realmList) {
        int i = 0;
        if (this.proxyState.isUnderConstruction()) {
            if (!this.proxyState.getAcceptDefaultValue$realm() || this.proxyState.getExcludeFields$realm().contains("flatList")) {
                return;
            }
            if (realmList != null && !realmList.isManaged()) {
                Realm realm = (Realm) this.proxyState.getRealm$realm();
                RealmList<Flat> realmList2 = new RealmList<>();
                Iterator<Flat> it = realmList.iterator();
                while (it.hasNext()) {
                    Flat next = it.next();
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
        OsList modelList = this.proxyState.getRow$realm().getModelList(this.columnInfo.flatListIndex);
        if (realmList == null || ((long) realmList.size()) != modelList.size()) {
            modelList.removeAll();
            if (realmList != null) {
                int size = realmList.size();
                while (i < size) {
                    Flat flat = realmList.get(i);
                    this.proxyState.checkValidObject(flat);
                    modelList.addRow(((RealmObjectProxy) flat).realmGet$proxyState().getRow$realm().getIndex());
                    i++;
                }
                return;
            }
            return;
        }
        int size2 = realmList.size();
        while (i < size2) {
            Flat flat2 = realmList.get(i);
            this.proxyState.checkValidObject(flat2);
            modelList.setRow((long) i, ((RealmObjectProxy) flat2).realmGet$proxyState().getRow$realm().getIndex());
            i++;
        }
    }

    public String realmGet$ending() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.endingIndex);
    }

    public void realmSet$ending(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.endingIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.endingIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.endingIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.endingIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$root() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.rootIndex);
    }

    public void realmSet$root(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.rootIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.rootIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.rootIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.rootIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 5, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("id", RealmFieldType.STRING, true, true, false);
        builder2.addPersistedProperty("count", RealmFieldType.INTEGER, false, false, false);
        builder.addPersistedLinkProperty("flatList", RealmFieldType.LIST, ru_unicorn_ujin_data_realm_FlatRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME);
        OsObjectSchemaInfo.Builder builder3 = builder;
        builder3.addPersistedProperty("ending", RealmFieldType.STRING, false, false, false);
        builder3.addPersistedProperty("root", RealmFieldType.STRING, false, false, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static GetFlatsResponseDataColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new GetFlatsResponseDataColumnInfo(osSchemaInfo);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0118  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.data.realm.GetFlatsResponseData createOrUpdateUsingJsonObject(p046io.realm.Realm r14, org.json.JSONObject r15, boolean r16) throws org.json.JSONException {
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
            java.lang.Class<ru.unicorn.ujin.data.realm.GetFlatsResponseData> r1 = p035ru.unicorn.ujin.data.realm.GetFlatsResponseData.class
            io.realm.internal.Table r1 = r14.getTable(r1)
            io.realm.RealmSchema r2 = r14.getSchema()
            java.lang.Class<ru.unicorn.ujin.data.realm.GetFlatsResponseData> r3 = p035ru.unicorn.ujin.data.realm.GetFlatsResponseData.class
            io.realm.internal.ColumnInfo r2 = r2.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r3)
            io.realm.ru_unicorn_ujin_data_realm_GetFlatsResponseDataRealmProxy$GetFlatsResponseDataColumnInfo r2 = (p046io.realm.ru_unicorn_ujin_data_realm_GetFlatsResponseDataRealmProxy.GetFlatsResponseDataColumnInfo) r2
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
            java.lang.Class<ru.unicorn.ujin.data.realm.GetFlatsResponseData> r2 = p035ru.unicorn.ujin.data.realm.GetFlatsResponseData.class
            io.realm.internal.ColumnInfo r4 = r1.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r2)     // Catch:{ all -> 0x0066 }
            r5 = 0
            java.util.List r6 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0066 }
            r1 = r13
            r2 = r14
            r1.set(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0066 }
            io.realm.ru_unicorn_ujin_data_realm_GetFlatsResponseDataRealmProxy r1 = new io.realm.ru_unicorn_ujin_data_realm_GetFlatsResponseDataRealmProxy     // Catch:{ all -> 0x0066 }
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
            java.lang.String r2 = "flatList"
            if (r1 != 0) goto L_0x00a3
            boolean r1 = r15.has(r2)
            if (r1 == 0) goto L_0x0079
            r9.add(r2)
        L_0x0079:
            boolean r1 = r15.has(r11)
            if (r1 == 0) goto L_0x009b
            boolean r1 = r15.isNull(r11)
            if (r1 == 0) goto L_0x008e
            java.lang.Class<ru.unicorn.ujin.data.realm.GetFlatsResponseData> r1 = p035ru.unicorn.ujin.data.realm.GetFlatsResponseData.class
            io.realm.RealmModel r1 = r14.createObjectInternal(r1, r12, r10, r9)
            io.realm.ru_unicorn_ujin_data_realm_GetFlatsResponseDataRealmProxy r1 = (p046io.realm.ru_unicorn_ujin_data_realm_GetFlatsResponseDataRealmProxy) r1
            goto L_0x00a3
        L_0x008e:
            java.lang.Class<ru.unicorn.ujin.data.realm.GetFlatsResponseData> r1 = p035ru.unicorn.ujin.data.realm.GetFlatsResponseData.class
            java.lang.String r3 = r15.getString(r11)
            io.realm.RealmModel r1 = r14.createObjectInternal(r1, r3, r10, r9)
            io.realm.ru_unicorn_ujin_data_realm_GetFlatsResponseDataRealmProxy r1 = (p046io.realm.ru_unicorn_ujin_data_realm_GetFlatsResponseDataRealmProxy) r1
            goto L_0x00a3
        L_0x009b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "JSON object doesn't have the primary key field 'id'."
            r0.<init>(r1)
            throw r0
        L_0x00a3:
            r3 = r1
            io.realm.ru_unicorn_ujin_data_realm_GetFlatsResponseDataRealmProxyInterface r3 = (p046io.realm.C4599xaf1d1de8) r3
            java.lang.String r4 = "count"
            boolean r5 = r15.has(r4)
            if (r5 == 0) goto L_0x00c3
            boolean r5 = r15.isNull(r4)
            if (r5 == 0) goto L_0x00b8
            r3.realmSet$count(r12)
            goto L_0x00c3
        L_0x00b8:
            int r4 = r15.getInt(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.realmSet$count(r4)
        L_0x00c3:
            boolean r4 = r15.has(r2)
            if (r4 == 0) goto L_0x00f7
            boolean r4 = r15.isNull(r2)
            if (r4 == 0) goto L_0x00d3
            r3.realmSet$flatList(r12)
            goto L_0x00f7
        L_0x00d3:
            io.realm.RealmList r4 = r3.realmGet$flatList()
            r4.clear()
            org.json.JSONArray r2 = r15.getJSONArray(r2)
            r4 = 0
        L_0x00df:
            int r5 = r2.length()
            if (r4 >= r5) goto L_0x00f7
            org.json.JSONObject r5 = r2.getJSONObject(r4)
            ru.unicorn.ujin.data.realm.Flat r5 = p046io.realm.ru_unicorn_ujin_data_realm_FlatRealmProxy.createOrUpdateUsingJsonObject(r14, r5, r8)
            io.realm.RealmList r6 = r3.realmGet$flatList()
            r6.add(r5)
            int r4 = r4 + 1
            goto L_0x00df
        L_0x00f7:
            java.lang.String r0 = "ending"
            boolean r2 = r15.has(r0)
            if (r2 == 0) goto L_0x0110
            boolean r2 = r15.isNull(r0)
            if (r2 == 0) goto L_0x0109
            r3.realmSet$ending(r12)
            goto L_0x0110
        L_0x0109:
            java.lang.String r0 = r15.getString(r0)
            r3.realmSet$ending(r0)
        L_0x0110:
            java.lang.String r0 = "root"
            boolean r2 = r15.has(r0)
            if (r2 == 0) goto L_0x0129
            boolean r2 = r15.isNull(r0)
            if (r2 == 0) goto L_0x0122
            r3.realmSet$root(r12)
            goto L_0x0129
        L_0x0122:
            java.lang.String r0 = r15.getString(r0)
            r3.realmSet$root(r0)
        L_0x0129:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.ru_unicorn_ujin_data_realm_GetFlatsResponseDataRealmProxy.createOrUpdateUsingJsonObject(io.realm.Realm, org.json.JSONObject, boolean):ru.unicorn.ujin.data.realm.GetFlatsResponseData");
    }

    public static GetFlatsResponseData createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        GetFlatsResponseData getFlatsResponseData = new GetFlatsResponseData();
        C4599xaf1d1de8 ru_unicorn_ujin_data_realm_getflatsresponsedatarealmproxyinterface = getFlatsResponseData;
        jsonReader.beginObject();
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("id")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_getflatsresponsedatarealmproxyinterface.realmSet$id(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_getflatsresponsedatarealmproxyinterface.realmSet$id((String) null);
                }
                z = true;
            } else if (nextName.equals("count")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_getflatsresponsedatarealmproxyinterface.realmSet$count(Integer.valueOf(jsonReader.nextInt()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_getflatsresponsedatarealmproxyinterface.realmSet$count((Integer) null);
                }
            } else if (nextName.equals("flatList")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_getflatsresponsedatarealmproxyinterface.realmSet$flatList((RealmList<Flat>) null);
                } else {
                    ru_unicorn_ujin_data_realm_getflatsresponsedatarealmproxyinterface.realmSet$flatList(new RealmList());
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        ru_unicorn_ujin_data_realm_getflatsresponsedatarealmproxyinterface.realmGet$flatList().add(ru_unicorn_ujin_data_realm_FlatRealmProxy.createUsingJsonStream(realm, jsonReader));
                    }
                    jsonReader.endArray();
                }
            } else if (nextName.equals("ending")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_getflatsresponsedatarealmproxyinterface.realmSet$ending(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_getflatsresponsedatarealmproxyinterface.realmSet$ending((String) null);
                }
            } else if (!nextName.equals("root")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_data_realm_getflatsresponsedatarealmproxyinterface.realmSet$root(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_data_realm_getflatsresponsedatarealmproxyinterface.realmSet$root((String) null);
            }
        }
        jsonReader.endObject();
        if (z) {
            return (GetFlatsResponseData) realm.copyToRealm(getFlatsResponseData, new ImportFlag[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
    }

    private static ru_unicorn_ujin_data_realm_GetFlatsResponseDataRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) GetFlatsResponseData.class), false, Collections.emptyList());
        ru_unicorn_ujin_data_realm_GetFlatsResponseDataRealmProxy ru_unicorn_ujin_data_realm_getflatsresponsedatarealmproxy = new ru_unicorn_ujin_data_realm_GetFlatsResponseDataRealmProxy();
        realmObjectContext.clear();
        return ru_unicorn_ujin_data_realm_getflatsresponsedatarealmproxy;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.data.realm.GetFlatsResponseData copyOrUpdate(p046io.realm.Realm r8, p046io.realm.ru_unicorn_ujin_data_realm_GetFlatsResponseDataRealmProxy.GetFlatsResponseDataColumnInfo r9, p035ru.unicorn.ujin.data.realm.GetFlatsResponseData r10, boolean r11, java.util.Map<p046io.realm.RealmModel, p046io.realm.internal.RealmObjectProxy> r12, java.util.Set<p046io.realm.ImportFlag> r13) {
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
            ru.unicorn.ujin.data.realm.GetFlatsResponseData r1 = (p035ru.unicorn.ujin.data.realm.GetFlatsResponseData) r1
            return r1
        L_0x004b:
            r1 = 0
            if (r11 == 0) goto L_0x0093
            java.lang.Class<ru.unicorn.ujin.data.realm.GetFlatsResponseData> r2 = p035ru.unicorn.ujin.data.realm.GetFlatsResponseData.class
            io.realm.internal.Table r2 = r8.getTable(r2)
            long r3 = r9.idIndex
            r5 = r10
            io.realm.ru_unicorn_ujin_data_realm_GetFlatsResponseDataRealmProxyInterface r5 = (p046io.realm.C4599xaf1d1de8) r5
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
            io.realm.ru_unicorn_ujin_data_realm_GetFlatsResponseDataRealmProxy r1 = new io.realm.ru_unicorn_ujin_data_realm_GetFlatsResponseDataRealmProxy     // Catch:{ all -> 0x008e }
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
            ru.unicorn.ujin.data.realm.GetFlatsResponseData r8 = update(r1, r2, r3, r4, r5, r6)
            goto L_0x00a5
        L_0x00a1:
            ru.unicorn.ujin.data.realm.GetFlatsResponseData r8 = copy(r8, r9, r10, r11, r12, r13)
        L_0x00a5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.ru_unicorn_ujin_data_realm_GetFlatsResponseDataRealmProxy.copyOrUpdate(io.realm.Realm, io.realm.ru_unicorn_ujin_data_realm_GetFlatsResponseDataRealmProxy$GetFlatsResponseDataColumnInfo, ru.unicorn.ujin.data.realm.GetFlatsResponseData, boolean, java.util.Map, java.util.Set):ru.unicorn.ujin.data.realm.GetFlatsResponseData");
    }

    public static GetFlatsResponseData copy(Realm realm, GetFlatsResponseDataColumnInfo getFlatsResponseDataColumnInfo, GetFlatsResponseData getFlatsResponseData, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(getFlatsResponseData);
        if (realmObjectProxy != null) {
            return (GetFlatsResponseData) realmObjectProxy;
        }
        C4599xaf1d1de8 ru_unicorn_ujin_data_realm_getflatsresponsedatarealmproxyinterface = getFlatsResponseData;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(GetFlatsResponseData.class), getFlatsResponseDataColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(getFlatsResponseDataColumnInfo.idIndex, ru_unicorn_ujin_data_realm_getflatsresponsedatarealmproxyinterface.realmGet$id());
        osObjectBuilder.addInteger(getFlatsResponseDataColumnInfo.countIndex, ru_unicorn_ujin_data_realm_getflatsresponsedatarealmproxyinterface.realmGet$count());
        osObjectBuilder.addString(getFlatsResponseDataColumnInfo.endingIndex, ru_unicorn_ujin_data_realm_getflatsresponsedatarealmproxyinterface.realmGet$ending());
        osObjectBuilder.addString(getFlatsResponseDataColumnInfo.rootIndex, ru_unicorn_ujin_data_realm_getflatsresponsedatarealmproxyinterface.realmGet$root());
        ru_unicorn_ujin_data_realm_GetFlatsResponseDataRealmProxy newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(getFlatsResponseData, newProxyInstance);
        RealmList<Flat> realmGet$flatList = ru_unicorn_ujin_data_realm_getflatsresponsedatarealmproxyinterface.realmGet$flatList();
        if (realmGet$flatList != null) {
            RealmList<Flat> realmGet$flatList2 = newProxyInstance.realmGet$flatList();
            realmGet$flatList2.clear();
            for (int i = 0; i < realmGet$flatList.size(); i++) {
                Flat flat = realmGet$flatList.get(i);
                Flat flat2 = (Flat) map.get(flat);
                if (flat2 != null) {
                    realmGet$flatList2.add(flat2);
                } else {
                    realmGet$flatList2.add(ru_unicorn_ujin_data_realm_FlatRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_FlatRealmProxy.FlatColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Flat.class), flat, z, map, set));
                }
            }
        }
        return newProxyInstance;
    }

    public static long insert(Realm realm, GetFlatsResponseData getFlatsResponseData, Map<RealmModel, Long> map) {
        long j;
        long j2;
        long j3;
        long j4;
        Realm realm2 = realm;
        GetFlatsResponseData getFlatsResponseData2 = getFlatsResponseData;
        Map<RealmModel, Long> map2 = map;
        if (getFlatsResponseData2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) getFlatsResponseData2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(GetFlatsResponseData.class);
        long nativePtr = table.getNativePtr();
        GetFlatsResponseDataColumnInfo getFlatsResponseDataColumnInfo = (GetFlatsResponseDataColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) GetFlatsResponseData.class);
        long j5 = getFlatsResponseDataColumnInfo.idIndex;
        C4599xaf1d1de8 ru_unicorn_ujin_data_realm_getflatsresponsedatarealmproxyinterface = getFlatsResponseData2;
        String realmGet$id = ru_unicorn_ujin_data_realm_getflatsresponsedatarealmproxyinterface.realmGet$id();
        if (realmGet$id == null) {
            j = Table.nativeFindFirstNull(nativePtr, j5);
        } else {
            j = Table.nativeFindFirstString(nativePtr, j5, realmGet$id);
        }
        if (j == -1) {
            j2 = OsObject.createRowWithPrimaryKey(table, j5, realmGet$id);
        } else {
            Table.throwDuplicatePrimaryKeyException(realmGet$id);
            j2 = j;
        }
        map2.put(getFlatsResponseData2, Long.valueOf(j2));
        Integer realmGet$count = ru_unicorn_ujin_data_realm_getflatsresponsedatarealmproxyinterface.realmGet$count();
        if (realmGet$count != null) {
            long j6 = nativePtr;
            j3 = nativePtr;
            j4 = j2;
            Table.nativeSetLong(j6, getFlatsResponseDataColumnInfo.countIndex, j2, realmGet$count.longValue(), false);
        } else {
            j3 = nativePtr;
            j4 = j2;
        }
        RealmList<Flat> realmGet$flatList = ru_unicorn_ujin_data_realm_getflatsresponsedatarealmproxyinterface.realmGet$flatList();
        if (realmGet$flatList != null) {
            OsList osList = new OsList(table.getUncheckedRow(j4), getFlatsResponseDataColumnInfo.flatListIndex);
            Iterator<Flat> it = realmGet$flatList.iterator();
            while (it.hasNext()) {
                Flat next = it.next();
                Long l = map2.get(next);
                if (l == null) {
                    l = Long.valueOf(ru_unicorn_ujin_data_realm_FlatRealmProxy.insert(realm2, next, map2));
                }
                osList.addRow(l.longValue());
            }
        }
        String realmGet$ending = ru_unicorn_ujin_data_realm_getflatsresponsedatarealmproxyinterface.realmGet$ending();
        if (realmGet$ending != null) {
            Table.nativeSetString(j3, getFlatsResponseDataColumnInfo.endingIndex, j4, realmGet$ending, false);
        }
        String realmGet$root = ru_unicorn_ujin_data_realm_getflatsresponsedatarealmproxyinterface.realmGet$root();
        if (realmGet$root != null) {
            Table.nativeSetString(j3, getFlatsResponseDataColumnInfo.rootIndex, j4, realmGet$root, false);
        }
        return j4;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(GetFlatsResponseData.class);
        long nativePtr = table.getNativePtr();
        GetFlatsResponseDataColumnInfo getFlatsResponseDataColumnInfo = (GetFlatsResponseDataColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) GetFlatsResponseData.class);
        long j7 = getFlatsResponseDataColumnInfo.idIndex;
        while (it.hasNext()) {
            GetFlatsResponseData getFlatsResponseData = (GetFlatsResponseData) it.next();
            if (!map2.containsKey(getFlatsResponseData)) {
                if (getFlatsResponseData instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) getFlatsResponseData;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(getFlatsResponseData, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                C4599xaf1d1de8 ru_unicorn_ujin_data_realm_getflatsresponsedatarealmproxyinterface = getFlatsResponseData;
                String realmGet$id = ru_unicorn_ujin_data_realm_getflatsresponsedatarealmproxyinterface.realmGet$id();
                if (realmGet$id == null) {
                    j = Table.nativeFindFirstNull(nativePtr, j7);
                } else {
                    j = Table.nativeFindFirstString(nativePtr, j7, realmGet$id);
                }
                if (j == -1) {
                    j2 = OsObject.createRowWithPrimaryKey(table, j7, realmGet$id);
                } else {
                    Table.throwDuplicatePrimaryKeyException(realmGet$id);
                    j2 = j;
                }
                map2.put(getFlatsResponseData, Long.valueOf(j2));
                Integer realmGet$count = ru_unicorn_ujin_data_realm_getflatsresponsedatarealmproxyinterface.realmGet$count();
                if (realmGet$count != null) {
                    j4 = j2;
                    j3 = j7;
                    Table.nativeSetLong(nativePtr, getFlatsResponseDataColumnInfo.countIndex, j2, realmGet$count.longValue(), false);
                } else {
                    j4 = j2;
                    j3 = j7;
                }
                RealmList<Flat> realmGet$flatList = ru_unicorn_ujin_data_realm_getflatsresponsedatarealmproxyinterface.realmGet$flatList();
                if (realmGet$flatList != null) {
                    j5 = j4;
                    OsList osList = new OsList(table.getUncheckedRow(j5), getFlatsResponseDataColumnInfo.flatListIndex);
                    Iterator<Flat> it2 = realmGet$flatList.iterator();
                    while (it2.hasNext()) {
                        Flat next = it2.next();
                        Long l = map2.get(next);
                        if (l == null) {
                            l = Long.valueOf(ru_unicorn_ujin_data_realm_FlatRealmProxy.insert(realm2, next, map2));
                        }
                        osList.addRow(l.longValue());
                    }
                } else {
                    j5 = j4;
                }
                String realmGet$ending = ru_unicorn_ujin_data_realm_getflatsresponsedatarealmproxyinterface.realmGet$ending();
                if (realmGet$ending != null) {
                    j6 = j5;
                    Table.nativeSetString(nativePtr, getFlatsResponseDataColumnInfo.endingIndex, j5, realmGet$ending, false);
                } else {
                    j6 = j5;
                }
                String realmGet$root = ru_unicorn_ujin_data_realm_getflatsresponsedatarealmproxyinterface.realmGet$root();
                if (realmGet$root != null) {
                    Table.nativeSetString(nativePtr, getFlatsResponseDataColumnInfo.rootIndex, j6, realmGet$root, false);
                }
                j7 = j3;
            }
        }
    }

    public static long insertOrUpdate(Realm realm, GetFlatsResponseData getFlatsResponseData, Map<RealmModel, Long> map) {
        long j;
        long j2;
        long j3;
        Realm realm2 = realm;
        GetFlatsResponseData getFlatsResponseData2 = getFlatsResponseData;
        Map<RealmModel, Long> map2 = map;
        if (getFlatsResponseData2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) getFlatsResponseData2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(GetFlatsResponseData.class);
        long nativePtr = table.getNativePtr();
        GetFlatsResponseDataColumnInfo getFlatsResponseDataColumnInfo = (GetFlatsResponseDataColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) GetFlatsResponseData.class);
        long j4 = getFlatsResponseDataColumnInfo.idIndex;
        C4599xaf1d1de8 ru_unicorn_ujin_data_realm_getflatsresponsedatarealmproxyinterface = getFlatsResponseData2;
        String realmGet$id = ru_unicorn_ujin_data_realm_getflatsresponsedatarealmproxyinterface.realmGet$id();
        if (realmGet$id == null) {
            j = Table.nativeFindFirstNull(nativePtr, j4);
        } else {
            j = Table.nativeFindFirstString(nativePtr, j4, realmGet$id);
        }
        long createRowWithPrimaryKey = j == -1 ? OsObject.createRowWithPrimaryKey(table, j4, realmGet$id) : j;
        map2.put(getFlatsResponseData2, Long.valueOf(createRowWithPrimaryKey));
        Integer realmGet$count = ru_unicorn_ujin_data_realm_getflatsresponsedatarealmproxyinterface.realmGet$count();
        if (realmGet$count != null) {
            j2 = createRowWithPrimaryKey;
            Table.nativeSetLong(nativePtr, getFlatsResponseDataColumnInfo.countIndex, createRowWithPrimaryKey, realmGet$count.longValue(), false);
        } else {
            j2 = createRowWithPrimaryKey;
            Table.nativeSetNull(nativePtr, getFlatsResponseDataColumnInfo.countIndex, j2, false);
        }
        long j5 = j2;
        OsList osList = new OsList(table.getUncheckedRow(j5), getFlatsResponseDataColumnInfo.flatListIndex);
        RealmList<Flat> realmGet$flatList = ru_unicorn_ujin_data_realm_getflatsresponsedatarealmproxyinterface.realmGet$flatList();
        if (realmGet$flatList == null || ((long) realmGet$flatList.size()) != osList.size()) {
            osList.removeAll();
            if (realmGet$flatList != null) {
                Iterator<Flat> it = realmGet$flatList.iterator();
                while (it.hasNext()) {
                    Flat next = it.next();
                    Long l = map2.get(next);
                    if (l == null) {
                        l = Long.valueOf(ru_unicorn_ujin_data_realm_FlatRealmProxy.insertOrUpdate(realm2, next, map2));
                    }
                    osList.addRow(l.longValue());
                }
            }
        } else {
            int size = realmGet$flatList.size();
            for (int i = 0; i < size; i++) {
                Flat flat = realmGet$flatList.get(i);
                Long l2 = map2.get(flat);
                if (l2 == null) {
                    l2 = Long.valueOf(ru_unicorn_ujin_data_realm_FlatRealmProxy.insertOrUpdate(realm2, flat, map2));
                }
                osList.setRow((long) i, l2.longValue());
            }
        }
        String realmGet$ending = ru_unicorn_ujin_data_realm_getflatsresponsedatarealmproxyinterface.realmGet$ending();
        if (realmGet$ending != null) {
            j3 = j5;
            Table.nativeSetString(nativePtr, getFlatsResponseDataColumnInfo.endingIndex, j5, realmGet$ending, false);
        } else {
            j3 = j5;
            Table.nativeSetNull(nativePtr, getFlatsResponseDataColumnInfo.endingIndex, j3, false);
        }
        String realmGet$root = ru_unicorn_ujin_data_realm_getflatsresponsedatarealmproxyinterface.realmGet$root();
        if (realmGet$root != null) {
            Table.nativeSetString(nativePtr, getFlatsResponseDataColumnInfo.rootIndex, j3, realmGet$root, false);
        } else {
            Table.nativeSetNull(nativePtr, getFlatsResponseDataColumnInfo.rootIndex, j3, false);
        }
        return j3;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(GetFlatsResponseData.class);
        long nativePtr = table.getNativePtr();
        GetFlatsResponseDataColumnInfo getFlatsResponseDataColumnInfo = (GetFlatsResponseDataColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) GetFlatsResponseData.class);
        long j6 = getFlatsResponseDataColumnInfo.idIndex;
        while (it.hasNext()) {
            GetFlatsResponseData getFlatsResponseData = (GetFlatsResponseData) it.next();
            if (!map2.containsKey(getFlatsResponseData)) {
                if (getFlatsResponseData instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) getFlatsResponseData;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(getFlatsResponseData, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                C4599xaf1d1de8 ru_unicorn_ujin_data_realm_getflatsresponsedatarealmproxyinterface = getFlatsResponseData;
                String realmGet$id = ru_unicorn_ujin_data_realm_getflatsresponsedatarealmproxyinterface.realmGet$id();
                if (realmGet$id == null) {
                    j = Table.nativeFindFirstNull(nativePtr, j6);
                } else {
                    j = Table.nativeFindFirstString(nativePtr, j6, realmGet$id);
                }
                long createRowWithPrimaryKey = j == -1 ? OsObject.createRowWithPrimaryKey(table, j6, realmGet$id) : j;
                map2.put(getFlatsResponseData, Long.valueOf(createRowWithPrimaryKey));
                Integer realmGet$count = ru_unicorn_ujin_data_realm_getflatsresponsedatarealmproxyinterface.realmGet$count();
                if (realmGet$count != null) {
                    j3 = createRowWithPrimaryKey;
                    j2 = j6;
                    Table.nativeSetLong(nativePtr, getFlatsResponseDataColumnInfo.countIndex, createRowWithPrimaryKey, realmGet$count.longValue(), false);
                } else {
                    j3 = createRowWithPrimaryKey;
                    j2 = j6;
                    Table.nativeSetNull(nativePtr, getFlatsResponseDataColumnInfo.countIndex, createRowWithPrimaryKey, false);
                }
                long j7 = j3;
                OsList osList = new OsList(table.getUncheckedRow(j7), getFlatsResponseDataColumnInfo.flatListIndex);
                RealmList<Flat> realmGet$flatList = ru_unicorn_ujin_data_realm_getflatsresponsedatarealmproxyinterface.realmGet$flatList();
                if (realmGet$flatList == null || ((long) realmGet$flatList.size()) != osList.size()) {
                    j4 = j7;
                    osList.removeAll();
                    if (realmGet$flatList != null) {
                        Iterator<Flat> it2 = realmGet$flatList.iterator();
                        while (it2.hasNext()) {
                            Flat next = it2.next();
                            Long l = map2.get(next);
                            if (l == null) {
                                l = Long.valueOf(ru_unicorn_ujin_data_realm_FlatRealmProxy.insertOrUpdate(realm2, next, map2));
                            }
                            osList.addRow(l.longValue());
                        }
                    }
                } else {
                    int size = realmGet$flatList.size();
                    int i = 0;
                    while (i < size) {
                        Flat flat = realmGet$flatList.get(i);
                        Long l2 = map2.get(flat);
                        if (l2 == null) {
                            l2 = Long.valueOf(ru_unicorn_ujin_data_realm_FlatRealmProxy.insertOrUpdate(realm2, flat, map2));
                        }
                        osList.setRow((long) i, l2.longValue());
                        i++;
                        j7 = j7;
                    }
                    j4 = j7;
                }
                String realmGet$ending = ru_unicorn_ujin_data_realm_getflatsresponsedatarealmproxyinterface.realmGet$ending();
                if (realmGet$ending != null) {
                    j5 = j4;
                    Table.nativeSetString(nativePtr, getFlatsResponseDataColumnInfo.endingIndex, j4, realmGet$ending, false);
                } else {
                    j5 = j4;
                    Table.nativeSetNull(nativePtr, getFlatsResponseDataColumnInfo.endingIndex, j5, false);
                }
                String realmGet$root = ru_unicorn_ujin_data_realm_getflatsresponsedatarealmproxyinterface.realmGet$root();
                if (realmGet$root != null) {
                    Table.nativeSetString(nativePtr, getFlatsResponseDataColumnInfo.rootIndex, j5, realmGet$root, false);
                } else {
                    Table.nativeSetNull(nativePtr, getFlatsResponseDataColumnInfo.rootIndex, j5, false);
                }
                j6 = j2;
            }
        }
    }

    public static GetFlatsResponseData createDetachedCopy(GetFlatsResponseData getFlatsResponseData, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        GetFlatsResponseData getFlatsResponseData2;
        if (i > i2 || getFlatsResponseData == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(getFlatsResponseData);
        if (cacheData == null) {
            getFlatsResponseData2 = new GetFlatsResponseData();
            map.put(getFlatsResponseData, new RealmObjectProxy.CacheData(i, getFlatsResponseData2));
        } else if (i >= cacheData.minDepth) {
            return (GetFlatsResponseData) cacheData.object;
        } else {
            cacheData.minDepth = i;
            getFlatsResponseData2 = (GetFlatsResponseData) cacheData.object;
        }
        C4599xaf1d1de8 ru_unicorn_ujin_data_realm_getflatsresponsedatarealmproxyinterface = getFlatsResponseData2;
        C4599xaf1d1de8 ru_unicorn_ujin_data_realm_getflatsresponsedatarealmproxyinterface2 = getFlatsResponseData;
        ru_unicorn_ujin_data_realm_getflatsresponsedatarealmproxyinterface.realmSet$id(ru_unicorn_ujin_data_realm_getflatsresponsedatarealmproxyinterface2.realmGet$id());
        ru_unicorn_ujin_data_realm_getflatsresponsedatarealmproxyinterface.realmSet$count(ru_unicorn_ujin_data_realm_getflatsresponsedatarealmproxyinterface2.realmGet$count());
        if (i == i2) {
            ru_unicorn_ujin_data_realm_getflatsresponsedatarealmproxyinterface.realmSet$flatList((RealmList<Flat>) null);
        } else {
            RealmList<Flat> realmGet$flatList = ru_unicorn_ujin_data_realm_getflatsresponsedatarealmproxyinterface2.realmGet$flatList();
            RealmList realmList = new RealmList();
            ru_unicorn_ujin_data_realm_getflatsresponsedatarealmproxyinterface.realmSet$flatList(realmList);
            int i3 = i + 1;
            int size = realmGet$flatList.size();
            for (int i4 = 0; i4 < size; i4++) {
                realmList.add(ru_unicorn_ujin_data_realm_FlatRealmProxy.createDetachedCopy(realmGet$flatList.get(i4), i3, i2, map));
            }
        }
        ru_unicorn_ujin_data_realm_getflatsresponsedatarealmproxyinterface.realmSet$ending(ru_unicorn_ujin_data_realm_getflatsresponsedatarealmproxyinterface2.realmGet$ending());
        ru_unicorn_ujin_data_realm_getflatsresponsedatarealmproxyinterface.realmSet$root(ru_unicorn_ujin_data_realm_getflatsresponsedatarealmproxyinterface2.realmGet$root());
        return getFlatsResponseData2;
    }

    static GetFlatsResponseData update(Realm realm, GetFlatsResponseDataColumnInfo getFlatsResponseDataColumnInfo, GetFlatsResponseData getFlatsResponseData, GetFlatsResponseData getFlatsResponseData2, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        GetFlatsResponseDataColumnInfo getFlatsResponseDataColumnInfo2 = getFlatsResponseDataColumnInfo;
        C4599xaf1d1de8 ru_unicorn_ujin_data_realm_getflatsresponsedatarealmproxyinterface = getFlatsResponseData;
        C4599xaf1d1de8 ru_unicorn_ujin_data_realm_getflatsresponsedatarealmproxyinterface2 = getFlatsResponseData2;
        Realm realm2 = realm;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(GetFlatsResponseData.class), getFlatsResponseDataColumnInfo2.maxColumnIndexValue, set);
        osObjectBuilder.addString(getFlatsResponseDataColumnInfo2.idIndex, ru_unicorn_ujin_data_realm_getflatsresponsedatarealmproxyinterface2.realmGet$id());
        osObjectBuilder.addInteger(getFlatsResponseDataColumnInfo2.countIndex, ru_unicorn_ujin_data_realm_getflatsresponsedatarealmproxyinterface2.realmGet$count());
        RealmList<Flat> realmGet$flatList = ru_unicorn_ujin_data_realm_getflatsresponsedatarealmproxyinterface2.realmGet$flatList();
        if (realmGet$flatList != null) {
            RealmList realmList = new RealmList();
            for (int i = 0; i < realmGet$flatList.size(); i++) {
                Flat flat = realmGet$flatList.get(i);
                Flat flat2 = (Flat) map.get(flat);
                if (flat2 != null) {
                    realmList.add(flat2);
                } else {
                    realmList.add(ru_unicorn_ujin_data_realm_FlatRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_FlatRealmProxy.FlatColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Flat.class), flat, true, map, set));
                }
            }
            osObjectBuilder.addObjectList(getFlatsResponseDataColumnInfo2.flatListIndex, realmList);
        } else {
            osObjectBuilder.addObjectList(getFlatsResponseDataColumnInfo2.flatListIndex, new RealmList());
        }
        osObjectBuilder.addString(getFlatsResponseDataColumnInfo2.endingIndex, ru_unicorn_ujin_data_realm_getflatsresponsedatarealmproxyinterface2.realmGet$ending());
        osObjectBuilder.addString(getFlatsResponseDataColumnInfo2.rootIndex, ru_unicorn_ujin_data_realm_getflatsresponsedatarealmproxyinterface2.realmGet$root());
        osObjectBuilder.updateExistingObject();
        return getFlatsResponseData;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("GetFlatsResponseData = proxy[");
        sb.append("{id:");
        String str = "null";
        sb.append(realmGet$id() != null ? realmGet$id() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{count:");
        sb.append(realmGet$count() != null ? realmGet$count() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{flatList:");
        sb.append("RealmList<Flat>[");
        sb.append(realmGet$flatList().size());
        sb.append("]");
        sb.append("}");
        sb.append(",");
        sb.append("{ending:");
        sb.append(realmGet$ending() != null ? realmGet$ending() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{root:");
        if (realmGet$root() != null) {
            str = realmGet$root();
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
        ru_unicorn_ujin_data_realm_GetFlatsResponseDataRealmProxy ru_unicorn_ujin_data_realm_getflatsresponsedatarealmproxy = (ru_unicorn_ujin_data_realm_GetFlatsResponseDataRealmProxy) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_data_realm_getflatsresponsedatarealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_data_realm_getflatsresponsedatarealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_data_realm_getflatsresponsedatarealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
