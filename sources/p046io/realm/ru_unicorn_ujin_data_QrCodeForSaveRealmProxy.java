package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p035ru.unicorn.ujin.data.QrCodeForSave;
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

/* renamed from: io.realm.ru_unicorn_ujin_data_QrCodeForSaveRealmProxy */
public class ru_unicorn_ujin_data_QrCodeForSaveRealmProxy extends QrCodeForSave implements RealmObjectProxy, ru_unicorn_ujin_data_QrCodeForSaveRealmProxyInterface {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private QrCodeForSaveColumnInfo columnInfo;
    private ProxyState<QrCodeForSave> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_data_QrCodeForSaveRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "QrCodeForSave";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_data_QrCodeForSaveRealmProxy$QrCodeForSaveColumnInfo */
    static final class QrCodeForSaveColumnInfo extends ColumnInfo {
        long idIndex;
        long maxColumnIndexValue;
        long qrIndex;

        QrCodeForSaveColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(2);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.qrIndex = addColumnDetails("qr", "qr", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        QrCodeForSaveColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new QrCodeForSaveColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            QrCodeForSaveColumnInfo qrCodeForSaveColumnInfo = (QrCodeForSaveColumnInfo) columnInfo;
            QrCodeForSaveColumnInfo qrCodeForSaveColumnInfo2 = (QrCodeForSaveColumnInfo) columnInfo2;
            qrCodeForSaveColumnInfo2.idIndex = qrCodeForSaveColumnInfo.idIndex;
            qrCodeForSaveColumnInfo2.qrIndex = qrCodeForSaveColumnInfo.qrIndex;
            qrCodeForSaveColumnInfo2.maxColumnIndexValue = qrCodeForSaveColumnInfo.maxColumnIndexValue;
        }
    }

    ru_unicorn_ujin_data_QrCodeForSaveRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (QrCodeForSaveColumnInfo) realmObjectContext.getColumnInfo();
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

    public String realmGet$qr() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.qrIndex);
    }

    public void realmSet$qr(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str != null) {
                this.proxyState.getRow$realm().setString(this.columnInfo.qrIndex, str);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'qr' to null.");
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str != null) {
                row$realm.getTable().setString(this.columnInfo.qrIndex, row$realm.getIndex(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'qr' to null.");
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 2, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("id", RealmFieldType.STRING, true, true, true);
        builder2.addPersistedProperty("qr", RealmFieldType.STRING, false, false, true);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static QrCodeForSaveColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new QrCodeForSaveColumnInfo(osSchemaInfo);
    }

    /* JADX WARNING: type inference failed for: r12v4, types: [io.realm.RealmModel] */
    /* JADX WARNING: type inference failed for: r12v5, types: [io.realm.RealmModel] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x009c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.data.QrCodeForSave createOrUpdateUsingJsonObject(p046io.realm.Realm r12, org.json.JSONObject r13, boolean r14) throws org.json.JSONException {
        /*
            java.util.List r0 = java.util.Collections.emptyList()
            r1 = 0
            java.lang.String r2 = "id"
            if (r14 == 0) goto L_0x0061
            java.lang.Class<ru.unicorn.ujin.data.QrCodeForSave> r14 = p035ru.unicorn.ujin.data.QrCodeForSave.class
            io.realm.internal.Table r14 = r12.getTable(r14)
            io.realm.RealmSchema r3 = r12.getSchema()
            java.lang.Class<ru.unicorn.ujin.data.QrCodeForSave> r4 = p035ru.unicorn.ujin.data.QrCodeForSave.class
            io.realm.internal.ColumnInfo r3 = r3.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r4)
            io.realm.ru_unicorn_ujin_data_QrCodeForSaveRealmProxy$QrCodeForSaveColumnInfo r3 = (p046io.realm.ru_unicorn_ujin_data_QrCodeForSaveRealmProxy.QrCodeForSaveColumnInfo) r3
            long r3 = r3.idIndex
            boolean r5 = r13.isNull(r2)
            r6 = -1
            if (r5 != 0) goto L_0x002e
            java.lang.String r5 = r13.getString(r2)
            long r3 = r14.findFirstString(r3, r5)
            goto L_0x002f
        L_0x002e:
            r3 = r6
        L_0x002f:
            int r5 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r5 == 0) goto L_0x0061
            io.realm.BaseRealm$ThreadLocalRealmObjectContext r5 = p046io.realm.BaseRealm.objectContext
            java.lang.Object r5 = r5.get()
            io.realm.BaseRealm$RealmObjectContext r5 = (p046io.realm.BaseRealm.RealmObjectContext) r5
            io.realm.internal.UncheckedRow r8 = r14.getUncheckedRow(r3)     // Catch:{ all -> 0x005c }
            io.realm.RealmSchema r14 = r12.getSchema()     // Catch:{ all -> 0x005c }
            java.lang.Class<ru.unicorn.ujin.data.QrCodeForSave> r3 = p035ru.unicorn.ujin.data.QrCodeForSave.class
            io.realm.internal.ColumnInfo r9 = r14.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r3)     // Catch:{ all -> 0x005c }
            r10 = 0
            java.util.List r11 = java.util.Collections.emptyList()     // Catch:{ all -> 0x005c }
            r6 = r5
            r7 = r12
            r6.set(r7, r8, r9, r10, r11)     // Catch:{ all -> 0x005c }
            io.realm.ru_unicorn_ujin_data_QrCodeForSaveRealmProxy r14 = new io.realm.ru_unicorn_ujin_data_QrCodeForSaveRealmProxy     // Catch:{ all -> 0x005c }
            r14.<init>()     // Catch:{ all -> 0x005c }
            r5.clear()
            goto L_0x0062
        L_0x005c:
            r12 = move-exception
            r5.clear()
            throw r12
        L_0x0061:
            r14 = r1
        L_0x0062:
            if (r14 != 0) goto L_0x0091
            boolean r14 = r13.has(r2)
            if (r14 == 0) goto L_0x0089
            boolean r14 = r13.isNull(r2)
            r3 = 1
            if (r14 == 0) goto L_0x007b
            java.lang.Class<ru.unicorn.ujin.data.QrCodeForSave> r14 = p035ru.unicorn.ujin.data.QrCodeForSave.class
            io.realm.RealmModel r12 = r12.createObjectInternal(r14, r1, r3, r0)
            r14 = r12
            io.realm.ru_unicorn_ujin_data_QrCodeForSaveRealmProxy r14 = (p046io.realm.ru_unicorn_ujin_data_QrCodeForSaveRealmProxy) r14
            goto L_0x0091
        L_0x007b:
            java.lang.Class<ru.unicorn.ujin.data.QrCodeForSave> r14 = p035ru.unicorn.ujin.data.QrCodeForSave.class
            java.lang.String r2 = r13.getString(r2)
            io.realm.RealmModel r12 = r12.createObjectInternal(r14, r2, r3, r0)
            r14 = r12
            io.realm.ru_unicorn_ujin_data_QrCodeForSaveRealmProxy r14 = (p046io.realm.ru_unicorn_ujin_data_QrCodeForSaveRealmProxy) r14
            goto L_0x0091
        L_0x0089:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = "JSON object doesn't have the primary key field 'id'."
            r12.<init>(r13)
            throw r12
        L_0x0091:
            r12 = r14
            io.realm.ru_unicorn_ujin_data_QrCodeForSaveRealmProxyInterface r12 = (p046io.realm.ru_unicorn_ujin_data_QrCodeForSaveRealmProxyInterface) r12
            java.lang.String r0 = "qr"
            boolean r2 = r13.has(r0)
            if (r2 == 0) goto L_0x00ad
            boolean r2 = r13.isNull(r0)
            if (r2 == 0) goto L_0x00a6
            r12.realmSet$qr(r1)
            goto L_0x00ad
        L_0x00a6:
            java.lang.String r13 = r13.getString(r0)
            r12.realmSet$qr(r13)
        L_0x00ad:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.ru_unicorn_ujin_data_QrCodeForSaveRealmProxy.createOrUpdateUsingJsonObject(io.realm.Realm, org.json.JSONObject, boolean):ru.unicorn.ujin.data.QrCodeForSave");
    }

    public static QrCodeForSave createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        QrCodeForSave qrCodeForSave = new QrCodeForSave();
        ru_unicorn_ujin_data_QrCodeForSaveRealmProxyInterface ru_unicorn_ujin_data_qrcodeforsaverealmproxyinterface = qrCodeForSave;
        jsonReader.beginObject();
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("id")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_qrcodeforsaverealmproxyinterface.realmSet$id(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_qrcodeforsaverealmproxyinterface.realmSet$id((String) null);
                }
                z = true;
            } else if (!nextName.equals("qr")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_data_qrcodeforsaverealmproxyinterface.realmSet$qr(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_data_qrcodeforsaverealmproxyinterface.realmSet$qr((String) null);
            }
        }
        jsonReader.endObject();
        if (z) {
            return (QrCodeForSave) realm.copyToRealm(qrCodeForSave, new ImportFlag[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
    }

    private static ru_unicorn_ujin_data_QrCodeForSaveRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) QrCodeForSave.class), false, Collections.emptyList());
        ru_unicorn_ujin_data_QrCodeForSaveRealmProxy ru_unicorn_ujin_data_qrcodeforsaverealmproxy = new ru_unicorn_ujin_data_QrCodeForSaveRealmProxy();
        realmObjectContext.clear();
        return ru_unicorn_ujin_data_qrcodeforsaverealmproxy;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x009a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.data.QrCodeForSave copyOrUpdate(p046io.realm.Realm r8, p046io.realm.ru_unicorn_ujin_data_QrCodeForSaveRealmProxy.QrCodeForSaveColumnInfo r9, p035ru.unicorn.ujin.data.QrCodeForSave r10, boolean r11, java.util.Map<p046io.realm.RealmModel, p046io.realm.internal.RealmObjectProxy> r12, java.util.Set<p046io.realm.ImportFlag> r13) {
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
            ru.unicorn.ujin.data.QrCodeForSave r1 = (p035ru.unicorn.ujin.data.QrCodeForSave) r1
            return r1
        L_0x004b:
            r1 = 0
            if (r11 == 0) goto L_0x008c
            java.lang.Class<ru.unicorn.ujin.data.QrCodeForSave> r2 = p035ru.unicorn.ujin.data.QrCodeForSave.class
            io.realm.internal.Table r2 = r8.getTable(r2)
            long r3 = r9.idIndex
            r5 = r10
            io.realm.ru_unicorn_ujin_data_QrCodeForSaveRealmProxyInterface r5 = (p046io.realm.ru_unicorn_ujin_data_QrCodeForSaveRealmProxyInterface) r5
            java.lang.String r5 = r5.realmGet$id()
            long r3 = r2.findFirstString(r3, r5)
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0069
            r0 = 0
            goto L_0x008d
        L_0x0069:
            io.realm.internal.UncheckedRow r3 = r2.getUncheckedRow(r3)     // Catch:{ all -> 0x0087 }
            r5 = 0
            java.util.List r6 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0087 }
            r1 = r0
            r2 = r8
            r4 = r9
            r1.set(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0087 }
            io.realm.ru_unicorn_ujin_data_QrCodeForSaveRealmProxy r1 = new io.realm.ru_unicorn_ujin_data_QrCodeForSaveRealmProxy     // Catch:{ all -> 0x0087 }
            r1.<init>()     // Catch:{ all -> 0x0087 }
            r2 = r1
            io.realm.internal.RealmObjectProxy r2 = (p046io.realm.internal.RealmObjectProxy) r2     // Catch:{ all -> 0x0087 }
            r12.put(r10, r2)     // Catch:{ all -> 0x0087 }
            r0.clear()
            goto L_0x008c
        L_0x0087:
            r8 = move-exception
            r0.clear()
            throw r8
        L_0x008c:
            r0 = r11
        L_0x008d:
            r3 = r1
            if (r0 == 0) goto L_0x009a
            r1 = r8
            r2 = r9
            r4 = r10
            r5 = r12
            r6 = r13
            ru.unicorn.ujin.data.QrCodeForSave r8 = update(r1, r2, r3, r4, r5, r6)
            goto L_0x009e
        L_0x009a:
            ru.unicorn.ujin.data.QrCodeForSave r8 = copy(r8, r9, r10, r11, r12, r13)
        L_0x009e:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.ru_unicorn_ujin_data_QrCodeForSaveRealmProxy.copyOrUpdate(io.realm.Realm, io.realm.ru_unicorn_ujin_data_QrCodeForSaveRealmProxy$QrCodeForSaveColumnInfo, ru.unicorn.ujin.data.QrCodeForSave, boolean, java.util.Map, java.util.Set):ru.unicorn.ujin.data.QrCodeForSave");
    }

    public static QrCodeForSave copy(Realm realm, QrCodeForSaveColumnInfo qrCodeForSaveColumnInfo, QrCodeForSave qrCodeForSave, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(qrCodeForSave);
        if (realmObjectProxy != null) {
            return (QrCodeForSave) realmObjectProxy;
        }
        ru_unicorn_ujin_data_QrCodeForSaveRealmProxyInterface ru_unicorn_ujin_data_qrcodeforsaverealmproxyinterface = qrCodeForSave;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(QrCodeForSave.class), qrCodeForSaveColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(qrCodeForSaveColumnInfo.idIndex, ru_unicorn_ujin_data_qrcodeforsaverealmproxyinterface.realmGet$id());
        osObjectBuilder.addString(qrCodeForSaveColumnInfo.qrIndex, ru_unicorn_ujin_data_qrcodeforsaverealmproxyinterface.realmGet$qr());
        ru_unicorn_ujin_data_QrCodeForSaveRealmProxy newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(qrCodeForSave, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, QrCodeForSave qrCodeForSave, Map<RealmModel, Long> map) {
        if (qrCodeForSave instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) qrCodeForSave;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(QrCodeForSave.class);
        long nativePtr = table.getNativePtr();
        QrCodeForSaveColumnInfo qrCodeForSaveColumnInfo = (QrCodeForSaveColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) QrCodeForSave.class);
        long j = qrCodeForSaveColumnInfo.idIndex;
        ru_unicorn_ujin_data_QrCodeForSaveRealmProxyInterface ru_unicorn_ujin_data_qrcodeforsaverealmproxyinterface = qrCodeForSave;
        String realmGet$id = ru_unicorn_ujin_data_qrcodeforsaverealmproxyinterface.realmGet$id();
        long nativeFindFirstString = realmGet$id != null ? Table.nativeFindFirstString(nativePtr, j, realmGet$id) : -1;
        if (nativeFindFirstString == -1) {
            nativeFindFirstString = OsObject.createRowWithPrimaryKey(table, j, realmGet$id);
        } else {
            Table.throwDuplicatePrimaryKeyException(realmGet$id);
        }
        map.put(qrCodeForSave, Long.valueOf(nativeFindFirstString));
        String realmGet$qr = ru_unicorn_ujin_data_qrcodeforsaverealmproxyinterface.realmGet$qr();
        if (realmGet$qr != null) {
            Table.nativeSetString(nativePtr, qrCodeForSaveColumnInfo.qrIndex, nativeFindFirstString, realmGet$qr, false);
        }
        return nativeFindFirstString;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(QrCodeForSave.class);
        long nativePtr = table.getNativePtr();
        QrCodeForSaveColumnInfo qrCodeForSaveColumnInfo = (QrCodeForSaveColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) QrCodeForSave.class);
        long j2 = qrCodeForSaveColumnInfo.idIndex;
        while (it.hasNext()) {
            QrCodeForSave qrCodeForSave = (QrCodeForSave) it.next();
            if (!map2.containsKey(qrCodeForSave)) {
                if (qrCodeForSave instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) qrCodeForSave;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(qrCodeForSave, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                ru_unicorn_ujin_data_QrCodeForSaveRealmProxyInterface ru_unicorn_ujin_data_qrcodeforsaverealmproxyinterface = qrCodeForSave;
                String realmGet$id = ru_unicorn_ujin_data_qrcodeforsaverealmproxyinterface.realmGet$id();
                long nativeFindFirstString = realmGet$id != null ? Table.nativeFindFirstString(nativePtr, j2, realmGet$id) : -1;
                if (nativeFindFirstString == -1) {
                    j = OsObject.createRowWithPrimaryKey(table, j2, realmGet$id);
                } else {
                    Table.throwDuplicatePrimaryKeyException(realmGet$id);
                    j = nativeFindFirstString;
                }
                map2.put(qrCodeForSave, Long.valueOf(j));
                String realmGet$qr = ru_unicorn_ujin_data_qrcodeforsaverealmproxyinterface.realmGet$qr();
                if (realmGet$qr != null) {
                    Table.nativeSetString(nativePtr, qrCodeForSaveColumnInfo.qrIndex, j, realmGet$qr, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, QrCodeForSave qrCodeForSave, Map<RealmModel, Long> map) {
        if (qrCodeForSave instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) qrCodeForSave;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(QrCodeForSave.class);
        long nativePtr = table.getNativePtr();
        QrCodeForSaveColumnInfo qrCodeForSaveColumnInfo = (QrCodeForSaveColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) QrCodeForSave.class);
        long j = qrCodeForSaveColumnInfo.idIndex;
        ru_unicorn_ujin_data_QrCodeForSaveRealmProxyInterface ru_unicorn_ujin_data_qrcodeforsaverealmproxyinterface = qrCodeForSave;
        String realmGet$id = ru_unicorn_ujin_data_qrcodeforsaverealmproxyinterface.realmGet$id();
        long nativeFindFirstString = realmGet$id != null ? Table.nativeFindFirstString(nativePtr, j, realmGet$id) : -1;
        if (nativeFindFirstString == -1) {
            nativeFindFirstString = OsObject.createRowWithPrimaryKey(table, j, realmGet$id);
        }
        map.put(qrCodeForSave, Long.valueOf(nativeFindFirstString));
        String realmGet$qr = ru_unicorn_ujin_data_qrcodeforsaverealmproxyinterface.realmGet$qr();
        if (realmGet$qr != null) {
            Table.nativeSetString(nativePtr, qrCodeForSaveColumnInfo.qrIndex, nativeFindFirstString, realmGet$qr, false);
        } else {
            Table.nativeSetNull(nativePtr, qrCodeForSaveColumnInfo.qrIndex, nativeFindFirstString, false);
        }
        return nativeFindFirstString;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(QrCodeForSave.class);
        long nativePtr = table.getNativePtr();
        QrCodeForSaveColumnInfo qrCodeForSaveColumnInfo = (QrCodeForSaveColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) QrCodeForSave.class);
        long j = qrCodeForSaveColumnInfo.idIndex;
        while (it.hasNext()) {
            QrCodeForSave qrCodeForSave = (QrCodeForSave) it.next();
            if (!map2.containsKey(qrCodeForSave)) {
                if (qrCodeForSave instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) qrCodeForSave;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(qrCodeForSave, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                ru_unicorn_ujin_data_QrCodeForSaveRealmProxyInterface ru_unicorn_ujin_data_qrcodeforsaverealmproxyinterface = qrCodeForSave;
                String realmGet$id = ru_unicorn_ujin_data_qrcodeforsaverealmproxyinterface.realmGet$id();
                long nativeFindFirstString = realmGet$id != null ? Table.nativeFindFirstString(nativePtr, j, realmGet$id) : -1;
                long createRowWithPrimaryKey = nativeFindFirstString == -1 ? OsObject.createRowWithPrimaryKey(table, j, realmGet$id) : nativeFindFirstString;
                map2.put(qrCodeForSave, Long.valueOf(createRowWithPrimaryKey));
                String realmGet$qr = ru_unicorn_ujin_data_qrcodeforsaverealmproxyinterface.realmGet$qr();
                if (realmGet$qr != null) {
                    Table.nativeSetString(nativePtr, qrCodeForSaveColumnInfo.qrIndex, createRowWithPrimaryKey, realmGet$qr, false);
                } else {
                    Table.nativeSetNull(nativePtr, qrCodeForSaveColumnInfo.qrIndex, createRowWithPrimaryKey, false);
                }
            }
        }
    }

    public static QrCodeForSave createDetachedCopy(QrCodeForSave qrCodeForSave, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        QrCodeForSave qrCodeForSave2;
        if (i > i2 || qrCodeForSave == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(qrCodeForSave);
        if (cacheData == null) {
            qrCodeForSave2 = new QrCodeForSave();
            map.put(qrCodeForSave, new RealmObjectProxy.CacheData(i, qrCodeForSave2));
        } else if (i >= cacheData.minDepth) {
            return (QrCodeForSave) cacheData.object;
        } else {
            cacheData.minDepth = i;
            qrCodeForSave2 = (QrCodeForSave) cacheData.object;
        }
        ru_unicorn_ujin_data_QrCodeForSaveRealmProxyInterface ru_unicorn_ujin_data_qrcodeforsaverealmproxyinterface = qrCodeForSave2;
        ru_unicorn_ujin_data_QrCodeForSaveRealmProxyInterface ru_unicorn_ujin_data_qrcodeforsaverealmproxyinterface2 = qrCodeForSave;
        ru_unicorn_ujin_data_qrcodeforsaverealmproxyinterface.realmSet$id(ru_unicorn_ujin_data_qrcodeforsaverealmproxyinterface2.realmGet$id());
        ru_unicorn_ujin_data_qrcodeforsaverealmproxyinterface.realmSet$qr(ru_unicorn_ujin_data_qrcodeforsaverealmproxyinterface2.realmGet$qr());
        return qrCodeForSave2;
    }

    static QrCodeForSave update(Realm realm, QrCodeForSaveColumnInfo qrCodeForSaveColumnInfo, QrCodeForSave qrCodeForSave, QrCodeForSave qrCodeForSave2, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        ru_unicorn_ujin_data_QrCodeForSaveRealmProxyInterface ru_unicorn_ujin_data_qrcodeforsaverealmproxyinterface = qrCodeForSave;
        ru_unicorn_ujin_data_QrCodeForSaveRealmProxyInterface ru_unicorn_ujin_data_qrcodeforsaverealmproxyinterface2 = qrCodeForSave2;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(QrCodeForSave.class), qrCodeForSaveColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(qrCodeForSaveColumnInfo.idIndex, ru_unicorn_ujin_data_qrcodeforsaverealmproxyinterface2.realmGet$id());
        osObjectBuilder.addString(qrCodeForSaveColumnInfo.qrIndex, ru_unicorn_ujin_data_qrcodeforsaverealmproxyinterface2.realmGet$qr());
        osObjectBuilder.updateExistingObject();
        return qrCodeForSave;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        return "QrCodeForSave = proxy[" + "{id:" + realmGet$id() + "}" + "," + "{qr:" + realmGet$qr() + "}" + "]";
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
        ru_unicorn_ujin_data_QrCodeForSaveRealmProxy ru_unicorn_ujin_data_qrcodeforsaverealmproxy = (ru_unicorn_ujin_data_QrCodeForSaveRealmProxy) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_data_qrcodeforsaverealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_data_qrcodeforsaverealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_data_qrcodeforsaverealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
