package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p035ru.unicorn.ujin.data.realm.FileData;
import p035ru.unicorn.ujin.data.realm.FileMeta;
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
import p046io.realm.ru_unicorn_ujin_data_realm_FileMetaRealmProxy;

/* renamed from: io.realm.ru_unicorn_ujin_data_realm_FileDataRealmProxy */
public class ru_unicorn_ujin_data_realm_FileDataRealmProxy extends FileData implements RealmObjectProxy, ru_unicorn_ujin_data_realm_FileDataRealmProxyInterface {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private FileDataColumnInfo columnInfo;
    private ProxyState<FileData> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_FileDataRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "FileData";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_FileDataRealmProxy$FileDataColumnInfo */
    static final class FileDataColumnInfo extends ColumnInfo {
        long bytesIndex;
        long idIndex;
        long maxColumnIndexValue;
        long metaIndex;
        long mimeTypeIndex;
        long nameIndex;
        long urlIndex;

        FileDataColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(6);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.nameIndex = addColumnDetails("name", "name", objectSchemaInfo);
            this.mimeTypeIndex = addColumnDetails("mimeType", "mimeType", objectSchemaInfo);
            this.bytesIndex = addColumnDetails("bytes", "bytes", objectSchemaInfo);
            this.metaIndex = addColumnDetails("meta", "meta", objectSchemaInfo);
            this.urlIndex = addColumnDetails("url", "url", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        FileDataColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new FileDataColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            FileDataColumnInfo fileDataColumnInfo = (FileDataColumnInfo) columnInfo;
            FileDataColumnInfo fileDataColumnInfo2 = (FileDataColumnInfo) columnInfo2;
            fileDataColumnInfo2.idIndex = fileDataColumnInfo.idIndex;
            fileDataColumnInfo2.nameIndex = fileDataColumnInfo.nameIndex;
            fileDataColumnInfo2.mimeTypeIndex = fileDataColumnInfo.mimeTypeIndex;
            fileDataColumnInfo2.bytesIndex = fileDataColumnInfo.bytesIndex;
            fileDataColumnInfo2.metaIndex = fileDataColumnInfo.metaIndex;
            fileDataColumnInfo2.urlIndex = fileDataColumnInfo.urlIndex;
            fileDataColumnInfo2.maxColumnIndexValue = fileDataColumnInfo.maxColumnIndexValue;
        }
    }

    ru_unicorn_ujin_data_realm_FileDataRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (FileDataColumnInfo) realmObjectContext.getColumnInfo();
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

    public String realmGet$name() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.nameIndex);
    }

    public void realmSet$name(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.nameIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.nameIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.nameIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.nameIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$mimeType() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.mimeTypeIndex);
    }

    public void realmSet$mimeType(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.mimeTypeIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.mimeTypeIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.mimeTypeIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.mimeTypeIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$bytes() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.bytesIndex);
    }

    public void realmSet$bytes(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.bytesIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.bytesIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.bytesIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.bytesIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public FileMeta realmGet$meta() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.metaIndex)) {
            return null;
        }
        return (FileMeta) this.proxyState.getRealm$realm().get(FileMeta.class, this.proxyState.getRow$realm().getLink(this.columnInfo.metaIndex), false, Collections.emptyList());
    }

    public void realmSet$meta(FileMeta fileMeta) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (fileMeta == null) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.metaIndex);
                return;
            }
            this.proxyState.checkValidObject(fileMeta);
            this.proxyState.getRow$realm().setLink(this.columnInfo.metaIndex, ((RealmObjectProxy) fileMeta).realmGet$proxyState().getRow$realm().getIndex());
        } else if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("meta")) {
            if (fileMeta != null && !RealmObject.isManaged(fileMeta)) {
                fileMeta = (FileMeta) ((Realm) this.proxyState.getRealm$realm()).copyToRealm(fileMeta, new ImportFlag[0]);
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (fileMeta == null) {
                row$realm.nullifyLink(this.columnInfo.metaIndex);
                return;
            }
            this.proxyState.checkValidObject(fileMeta);
            row$realm.getTable().setLink(this.columnInfo.metaIndex, row$realm.getIndex(), ((RealmObjectProxy) fileMeta).realmGet$proxyState().getRow$realm().getIndex(), true);
        }
    }

    public String realmGet$url() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.urlIndex);
    }

    public void realmSet$url(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.urlIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.urlIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.urlIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.urlIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 6, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("id", RealmFieldType.STRING, true, true, false);
        builder2.addPersistedProperty("name", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("mimeType", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("bytes", RealmFieldType.STRING, false, false, false);
        builder.addPersistedLinkProperty("meta", RealmFieldType.OBJECT, ru_unicorn_ujin_data_realm_FileMetaRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME);
        builder.addPersistedProperty("url", RealmFieldType.STRING, false, false, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static FileDataColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new FileDataColumnInfo(osSchemaInfo);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0115  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.data.realm.FileData createOrUpdateUsingJsonObject(p046io.realm.Realm r14, org.json.JSONObject r15, boolean r16) throws org.json.JSONException {
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
            java.lang.Class<ru.unicorn.ujin.data.realm.FileData> r1 = p035ru.unicorn.ujin.data.realm.FileData.class
            io.realm.internal.Table r1 = r14.getTable(r1)
            io.realm.RealmSchema r2 = r14.getSchema()
            java.lang.Class<ru.unicorn.ujin.data.realm.FileData> r3 = p035ru.unicorn.ujin.data.realm.FileData.class
            io.realm.internal.ColumnInfo r2 = r2.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r3)
            io.realm.ru_unicorn_ujin_data_realm_FileDataRealmProxy$FileDataColumnInfo r2 = (p046io.realm.ru_unicorn_ujin_data_realm_FileDataRealmProxy.FileDataColumnInfo) r2
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
            java.lang.Class<ru.unicorn.ujin.data.realm.FileData> r2 = p035ru.unicorn.ujin.data.realm.FileData.class
            io.realm.internal.ColumnInfo r4 = r1.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r2)     // Catch:{ all -> 0x0066 }
            r5 = 0
            java.util.List r6 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0066 }
            r1 = r13
            r2 = r14
            r1.set(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0066 }
            io.realm.ru_unicorn_ujin_data_realm_FileDataRealmProxy r1 = new io.realm.ru_unicorn_ujin_data_realm_FileDataRealmProxy     // Catch:{ all -> 0x0066 }
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
            java.lang.String r2 = "meta"
            if (r1 != 0) goto L_0x00a3
            boolean r1 = r15.has(r2)
            if (r1 == 0) goto L_0x0079
            r9.add(r2)
        L_0x0079:
            boolean r1 = r15.has(r11)
            if (r1 == 0) goto L_0x009b
            boolean r1 = r15.isNull(r11)
            if (r1 == 0) goto L_0x008e
            java.lang.Class<ru.unicorn.ujin.data.realm.FileData> r1 = p035ru.unicorn.ujin.data.realm.FileData.class
            io.realm.RealmModel r1 = r14.createObjectInternal(r1, r12, r10, r9)
            io.realm.ru_unicorn_ujin_data_realm_FileDataRealmProxy r1 = (p046io.realm.ru_unicorn_ujin_data_realm_FileDataRealmProxy) r1
            goto L_0x00a3
        L_0x008e:
            java.lang.Class<ru.unicorn.ujin.data.realm.FileData> r1 = p035ru.unicorn.ujin.data.realm.FileData.class
            java.lang.String r3 = r15.getString(r11)
            io.realm.RealmModel r1 = r14.createObjectInternal(r1, r3, r10, r9)
            io.realm.ru_unicorn_ujin_data_realm_FileDataRealmProxy r1 = (p046io.realm.ru_unicorn_ujin_data_realm_FileDataRealmProxy) r1
            goto L_0x00a3
        L_0x009b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "JSON object doesn't have the primary key field 'id'."
            r0.<init>(r1)
            throw r0
        L_0x00a3:
            r3 = r1
            io.realm.ru_unicorn_ujin_data_realm_FileDataRealmProxyInterface r3 = (p046io.realm.ru_unicorn_ujin_data_realm_FileDataRealmProxyInterface) r3
            java.lang.String r4 = "name"
            boolean r5 = r15.has(r4)
            if (r5 == 0) goto L_0x00bf
            boolean r5 = r15.isNull(r4)
            if (r5 == 0) goto L_0x00b8
            r3.realmSet$name(r12)
            goto L_0x00bf
        L_0x00b8:
            java.lang.String r4 = r15.getString(r4)
            r3.realmSet$name(r4)
        L_0x00bf:
            java.lang.String r4 = "mimeType"
            boolean r5 = r15.has(r4)
            if (r5 == 0) goto L_0x00d8
            boolean r5 = r15.isNull(r4)
            if (r5 == 0) goto L_0x00d1
            r3.realmSet$mimeType(r12)
            goto L_0x00d8
        L_0x00d1:
            java.lang.String r4 = r15.getString(r4)
            r3.realmSet$mimeType(r4)
        L_0x00d8:
            java.lang.String r4 = "bytes"
            boolean r5 = r15.has(r4)
            if (r5 == 0) goto L_0x00f1
            boolean r5 = r15.isNull(r4)
            if (r5 == 0) goto L_0x00ea
            r3.realmSet$bytes(r12)
            goto L_0x00f1
        L_0x00ea:
            java.lang.String r4 = r15.getString(r4)
            r3.realmSet$bytes(r4)
        L_0x00f1:
            boolean r4 = r15.has(r2)
            if (r4 == 0) goto L_0x010c
            boolean r4 = r15.isNull(r2)
            if (r4 == 0) goto L_0x0101
            r3.realmSet$meta(r12)
            goto L_0x010c
        L_0x0101:
            org.json.JSONObject r2 = r15.getJSONObject(r2)
            ru.unicorn.ujin.data.realm.FileMeta r0 = p046io.realm.ru_unicorn_ujin_data_realm_FileMetaRealmProxy.createOrUpdateUsingJsonObject(r14, r2, r8)
            r3.realmSet$meta(r0)
        L_0x010c:
            java.lang.String r0 = "url"
            boolean r2 = r15.has(r0)
            if (r2 == 0) goto L_0x0126
            boolean r2 = r15.isNull(r0)
            if (r2 == 0) goto L_0x011f
            r3.realmSet$url(r12)
            goto L_0x0126
        L_0x011f:
            java.lang.String r0 = r15.getString(r0)
            r3.realmSet$url(r0)
        L_0x0126:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.ru_unicorn_ujin_data_realm_FileDataRealmProxy.createOrUpdateUsingJsonObject(io.realm.Realm, org.json.JSONObject, boolean):ru.unicorn.ujin.data.realm.FileData");
    }

    public static FileData createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        FileData fileData = new FileData();
        ru_unicorn_ujin_data_realm_FileDataRealmProxyInterface ru_unicorn_ujin_data_realm_filedatarealmproxyinterface = fileData;
        jsonReader.beginObject();
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("id")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_filedatarealmproxyinterface.realmSet$id(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_filedatarealmproxyinterface.realmSet$id((String) null);
                }
                z = true;
            } else if (nextName.equals("name")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_filedatarealmproxyinterface.realmSet$name(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_filedatarealmproxyinterface.realmSet$name((String) null);
                }
            } else if (nextName.equals("mimeType")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_filedatarealmproxyinterface.realmSet$mimeType(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_filedatarealmproxyinterface.realmSet$mimeType((String) null);
                }
            } else if (nextName.equals("bytes")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_filedatarealmproxyinterface.realmSet$bytes(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_filedatarealmproxyinterface.realmSet$bytes((String) null);
                }
            } else if (nextName.equals("meta")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_filedatarealmproxyinterface.realmSet$meta((FileMeta) null);
                } else {
                    ru_unicorn_ujin_data_realm_filedatarealmproxyinterface.realmSet$meta(ru_unicorn_ujin_data_realm_FileMetaRealmProxy.createUsingJsonStream(realm, jsonReader));
                }
            } else if (!nextName.equals("url")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_data_realm_filedatarealmproxyinterface.realmSet$url(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_data_realm_filedatarealmproxyinterface.realmSet$url((String) null);
            }
        }
        jsonReader.endObject();
        if (z) {
            return (FileData) realm.copyToRealm(fileData, new ImportFlag[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
    }

    private static ru_unicorn_ujin_data_realm_FileDataRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) FileData.class), false, Collections.emptyList());
        ru_unicorn_ujin_data_realm_FileDataRealmProxy ru_unicorn_ujin_data_realm_filedatarealmproxy = new ru_unicorn_ujin_data_realm_FileDataRealmProxy();
        realmObjectContext.clear();
        return ru_unicorn_ujin_data_realm_filedatarealmproxy;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.data.realm.FileData copyOrUpdate(p046io.realm.Realm r8, p046io.realm.ru_unicorn_ujin_data_realm_FileDataRealmProxy.FileDataColumnInfo r9, p035ru.unicorn.ujin.data.realm.FileData r10, boolean r11, java.util.Map<p046io.realm.RealmModel, p046io.realm.internal.RealmObjectProxy> r12, java.util.Set<p046io.realm.ImportFlag> r13) {
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
            ru.unicorn.ujin.data.realm.FileData r1 = (p035ru.unicorn.ujin.data.realm.FileData) r1
            return r1
        L_0x004b:
            r1 = 0
            if (r11 == 0) goto L_0x0093
            java.lang.Class<ru.unicorn.ujin.data.realm.FileData> r2 = p035ru.unicorn.ujin.data.realm.FileData.class
            io.realm.internal.Table r2 = r8.getTable(r2)
            long r3 = r9.idIndex
            r5 = r10
            io.realm.ru_unicorn_ujin_data_realm_FileDataRealmProxyInterface r5 = (p046io.realm.ru_unicorn_ujin_data_realm_FileDataRealmProxyInterface) r5
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
            io.realm.ru_unicorn_ujin_data_realm_FileDataRealmProxy r1 = new io.realm.ru_unicorn_ujin_data_realm_FileDataRealmProxy     // Catch:{ all -> 0x008e }
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
            ru.unicorn.ujin.data.realm.FileData r8 = update(r1, r2, r3, r4, r5, r6)
            goto L_0x00a5
        L_0x00a1:
            ru.unicorn.ujin.data.realm.FileData r8 = copy(r8, r9, r10, r11, r12, r13)
        L_0x00a5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.ru_unicorn_ujin_data_realm_FileDataRealmProxy.copyOrUpdate(io.realm.Realm, io.realm.ru_unicorn_ujin_data_realm_FileDataRealmProxy$FileDataColumnInfo, ru.unicorn.ujin.data.realm.FileData, boolean, java.util.Map, java.util.Set):ru.unicorn.ujin.data.realm.FileData");
    }

    public static FileData copy(Realm realm, FileDataColumnInfo fileDataColumnInfo, FileData fileData, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(fileData);
        if (realmObjectProxy != null) {
            return (FileData) realmObjectProxy;
        }
        ru_unicorn_ujin_data_realm_FileDataRealmProxyInterface ru_unicorn_ujin_data_realm_filedatarealmproxyinterface = fileData;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(FileData.class), fileDataColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(fileDataColumnInfo.idIndex, ru_unicorn_ujin_data_realm_filedatarealmproxyinterface.realmGet$id());
        osObjectBuilder.addString(fileDataColumnInfo.nameIndex, ru_unicorn_ujin_data_realm_filedatarealmproxyinterface.realmGet$name());
        osObjectBuilder.addString(fileDataColumnInfo.mimeTypeIndex, ru_unicorn_ujin_data_realm_filedatarealmproxyinterface.realmGet$mimeType());
        osObjectBuilder.addString(fileDataColumnInfo.bytesIndex, ru_unicorn_ujin_data_realm_filedatarealmproxyinterface.realmGet$bytes());
        osObjectBuilder.addString(fileDataColumnInfo.urlIndex, ru_unicorn_ujin_data_realm_filedatarealmproxyinterface.realmGet$url());
        ru_unicorn_ujin_data_realm_FileDataRealmProxy newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(fileData, newProxyInstance);
        FileMeta realmGet$meta = ru_unicorn_ujin_data_realm_filedatarealmproxyinterface.realmGet$meta();
        if (realmGet$meta == null) {
            newProxyInstance.realmSet$meta((FileMeta) null);
        } else {
            FileMeta fileMeta = (FileMeta) map.get(realmGet$meta);
            if (fileMeta != null) {
                newProxyInstance.realmSet$meta(fileMeta);
            } else {
                newProxyInstance.realmSet$meta(ru_unicorn_ujin_data_realm_FileMetaRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_FileMetaRealmProxy.FileMetaColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) FileMeta.class), realmGet$meta, z, map, set));
            }
        }
        return newProxyInstance;
    }

    public static long insert(Realm realm, FileData fileData, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Realm realm2 = realm;
        FileData fileData2 = fileData;
        Map<RealmModel, Long> map2 = map;
        if (fileData2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) fileData2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(FileData.class);
        long nativePtr = table.getNativePtr();
        FileDataColumnInfo fileDataColumnInfo = (FileDataColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) FileData.class);
        long j3 = fileDataColumnInfo.idIndex;
        ru_unicorn_ujin_data_realm_FileDataRealmProxyInterface ru_unicorn_ujin_data_realm_filedatarealmproxyinterface = fileData2;
        String realmGet$id = ru_unicorn_ujin_data_realm_filedatarealmproxyinterface.realmGet$id();
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
        map2.put(fileData2, Long.valueOf(j2));
        String realmGet$name = ru_unicorn_ujin_data_realm_filedatarealmproxyinterface.realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(nativePtr, fileDataColumnInfo.nameIndex, j2, realmGet$name, false);
        }
        String realmGet$mimeType = ru_unicorn_ujin_data_realm_filedatarealmproxyinterface.realmGet$mimeType();
        if (realmGet$mimeType != null) {
            Table.nativeSetString(nativePtr, fileDataColumnInfo.mimeTypeIndex, j2, realmGet$mimeType, false);
        }
        String realmGet$bytes = ru_unicorn_ujin_data_realm_filedatarealmproxyinterface.realmGet$bytes();
        if (realmGet$bytes != null) {
            Table.nativeSetString(nativePtr, fileDataColumnInfo.bytesIndex, j2, realmGet$bytes, false);
        }
        FileMeta realmGet$meta = ru_unicorn_ujin_data_realm_filedatarealmproxyinterface.realmGet$meta();
        if (realmGet$meta != null) {
            Long l = map2.get(realmGet$meta);
            if (l == null) {
                l = Long.valueOf(ru_unicorn_ujin_data_realm_FileMetaRealmProxy.insert(realm2, realmGet$meta, map2));
            }
            Table.nativeSetLink(nativePtr, fileDataColumnInfo.metaIndex, j2, l.longValue(), false);
        }
        String realmGet$url = ru_unicorn_ujin_data_realm_filedatarealmproxyinterface.realmGet$url();
        if (realmGet$url != null) {
            Table.nativeSetString(nativePtr, fileDataColumnInfo.urlIndex, j2, realmGet$url, false);
        }
        return j2;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(FileData.class);
        long nativePtr = table.getNativePtr();
        FileDataColumnInfo fileDataColumnInfo = (FileDataColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) FileData.class);
        long j3 = fileDataColumnInfo.idIndex;
        while (it.hasNext()) {
            FileData fileData = (FileData) it.next();
            if (!map2.containsKey(fileData)) {
                if (fileData instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) fileData;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(fileData, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                ru_unicorn_ujin_data_realm_FileDataRealmProxyInterface ru_unicorn_ujin_data_realm_filedatarealmproxyinterface = fileData;
                String realmGet$id = ru_unicorn_ujin_data_realm_filedatarealmproxyinterface.realmGet$id();
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
                map2.put(fileData, Long.valueOf(j2));
                String realmGet$name = ru_unicorn_ujin_data_realm_filedatarealmproxyinterface.realmGet$name();
                if (realmGet$name != null) {
                    Table.nativeSetString(nativePtr, fileDataColumnInfo.nameIndex, j2, realmGet$name, false);
                }
                String realmGet$mimeType = ru_unicorn_ujin_data_realm_filedatarealmproxyinterface.realmGet$mimeType();
                if (realmGet$mimeType != null) {
                    Table.nativeSetString(nativePtr, fileDataColumnInfo.mimeTypeIndex, j2, realmGet$mimeType, false);
                }
                String realmGet$bytes = ru_unicorn_ujin_data_realm_filedatarealmproxyinterface.realmGet$bytes();
                if (realmGet$bytes != null) {
                    Table.nativeSetString(nativePtr, fileDataColumnInfo.bytesIndex, j2, realmGet$bytes, false);
                }
                FileMeta realmGet$meta = ru_unicorn_ujin_data_realm_filedatarealmproxyinterface.realmGet$meta();
                if (realmGet$meta != null) {
                    Long l = map2.get(realmGet$meta);
                    if (l == null) {
                        l = Long.valueOf(ru_unicorn_ujin_data_realm_FileMetaRealmProxy.insert(realm2, realmGet$meta, map2));
                    }
                    table.setLink(fileDataColumnInfo.metaIndex, j2, l.longValue(), false);
                }
                String realmGet$url = ru_unicorn_ujin_data_realm_filedatarealmproxyinterface.realmGet$url();
                if (realmGet$url != null) {
                    Table.nativeSetString(nativePtr, fileDataColumnInfo.urlIndex, j2, realmGet$url, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, FileData fileData, Map<RealmModel, Long> map) {
        long j;
        Realm realm2 = realm;
        FileData fileData2 = fileData;
        Map<RealmModel, Long> map2 = map;
        if (fileData2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) fileData2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(FileData.class);
        long nativePtr = table.getNativePtr();
        FileDataColumnInfo fileDataColumnInfo = (FileDataColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) FileData.class);
        long j2 = fileDataColumnInfo.idIndex;
        ru_unicorn_ujin_data_realm_FileDataRealmProxyInterface ru_unicorn_ujin_data_realm_filedatarealmproxyinterface = fileData2;
        String realmGet$id = ru_unicorn_ujin_data_realm_filedatarealmproxyinterface.realmGet$id();
        if (realmGet$id == null) {
            j = Table.nativeFindFirstNull(nativePtr, j2);
        } else {
            j = Table.nativeFindFirstString(nativePtr, j2, realmGet$id);
        }
        long createRowWithPrimaryKey = j == -1 ? OsObject.createRowWithPrimaryKey(table, j2, realmGet$id) : j;
        map2.put(fileData2, Long.valueOf(createRowWithPrimaryKey));
        String realmGet$name = ru_unicorn_ujin_data_realm_filedatarealmproxyinterface.realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(nativePtr, fileDataColumnInfo.nameIndex, createRowWithPrimaryKey, realmGet$name, false);
        } else {
            Table.nativeSetNull(nativePtr, fileDataColumnInfo.nameIndex, createRowWithPrimaryKey, false);
        }
        String realmGet$mimeType = ru_unicorn_ujin_data_realm_filedatarealmproxyinterface.realmGet$mimeType();
        if (realmGet$mimeType != null) {
            Table.nativeSetString(nativePtr, fileDataColumnInfo.mimeTypeIndex, createRowWithPrimaryKey, realmGet$mimeType, false);
        } else {
            Table.nativeSetNull(nativePtr, fileDataColumnInfo.mimeTypeIndex, createRowWithPrimaryKey, false);
        }
        String realmGet$bytes = ru_unicorn_ujin_data_realm_filedatarealmproxyinterface.realmGet$bytes();
        if (realmGet$bytes != null) {
            Table.nativeSetString(nativePtr, fileDataColumnInfo.bytesIndex, createRowWithPrimaryKey, realmGet$bytes, false);
        } else {
            Table.nativeSetNull(nativePtr, fileDataColumnInfo.bytesIndex, createRowWithPrimaryKey, false);
        }
        FileMeta realmGet$meta = ru_unicorn_ujin_data_realm_filedatarealmproxyinterface.realmGet$meta();
        if (realmGet$meta != null) {
            Long l = map2.get(realmGet$meta);
            if (l == null) {
                l = Long.valueOf(ru_unicorn_ujin_data_realm_FileMetaRealmProxy.insertOrUpdate(realm2, realmGet$meta, map2));
            }
            Table.nativeSetLink(nativePtr, fileDataColumnInfo.metaIndex, createRowWithPrimaryKey, l.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, fileDataColumnInfo.metaIndex, createRowWithPrimaryKey);
        }
        String realmGet$url = ru_unicorn_ujin_data_realm_filedatarealmproxyinterface.realmGet$url();
        if (realmGet$url != null) {
            Table.nativeSetString(nativePtr, fileDataColumnInfo.urlIndex, createRowWithPrimaryKey, realmGet$url, false);
        } else {
            Table.nativeSetNull(nativePtr, fileDataColumnInfo.urlIndex, createRowWithPrimaryKey, false);
        }
        return createRowWithPrimaryKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(FileData.class);
        long nativePtr = table.getNativePtr();
        FileDataColumnInfo fileDataColumnInfo = (FileDataColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) FileData.class);
        long j3 = fileDataColumnInfo.idIndex;
        while (it.hasNext()) {
            FileData fileData = (FileData) it.next();
            if (!map2.containsKey(fileData)) {
                if (fileData instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) fileData;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(fileData, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                ru_unicorn_ujin_data_realm_FileDataRealmProxyInterface ru_unicorn_ujin_data_realm_filedatarealmproxyinterface = fileData;
                String realmGet$id = ru_unicorn_ujin_data_realm_filedatarealmproxyinterface.realmGet$id();
                if (realmGet$id == null) {
                    j = Table.nativeFindFirstNull(nativePtr, j3);
                } else {
                    j = Table.nativeFindFirstString(nativePtr, j3, realmGet$id);
                }
                long createRowWithPrimaryKey = j == -1 ? OsObject.createRowWithPrimaryKey(table, j3, realmGet$id) : j;
                map2.put(fileData, Long.valueOf(createRowWithPrimaryKey));
                String realmGet$name = ru_unicorn_ujin_data_realm_filedatarealmproxyinterface.realmGet$name();
                if (realmGet$name != null) {
                    j2 = j3;
                    Table.nativeSetString(nativePtr, fileDataColumnInfo.nameIndex, createRowWithPrimaryKey, realmGet$name, false);
                } else {
                    j2 = j3;
                    Table.nativeSetNull(nativePtr, fileDataColumnInfo.nameIndex, createRowWithPrimaryKey, false);
                }
                String realmGet$mimeType = ru_unicorn_ujin_data_realm_filedatarealmproxyinterface.realmGet$mimeType();
                if (realmGet$mimeType != null) {
                    Table.nativeSetString(nativePtr, fileDataColumnInfo.mimeTypeIndex, createRowWithPrimaryKey, realmGet$mimeType, false);
                } else {
                    Table.nativeSetNull(nativePtr, fileDataColumnInfo.mimeTypeIndex, createRowWithPrimaryKey, false);
                }
                String realmGet$bytes = ru_unicorn_ujin_data_realm_filedatarealmproxyinterface.realmGet$bytes();
                if (realmGet$bytes != null) {
                    Table.nativeSetString(nativePtr, fileDataColumnInfo.bytesIndex, createRowWithPrimaryKey, realmGet$bytes, false);
                } else {
                    Table.nativeSetNull(nativePtr, fileDataColumnInfo.bytesIndex, createRowWithPrimaryKey, false);
                }
                FileMeta realmGet$meta = ru_unicorn_ujin_data_realm_filedatarealmproxyinterface.realmGet$meta();
                if (realmGet$meta != null) {
                    Long l = map2.get(realmGet$meta);
                    if (l == null) {
                        l = Long.valueOf(ru_unicorn_ujin_data_realm_FileMetaRealmProxy.insertOrUpdate(realm2, realmGet$meta, map2));
                    }
                    Table.nativeSetLink(nativePtr, fileDataColumnInfo.metaIndex, createRowWithPrimaryKey, l.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, fileDataColumnInfo.metaIndex, createRowWithPrimaryKey);
                }
                String realmGet$url = ru_unicorn_ujin_data_realm_filedatarealmproxyinterface.realmGet$url();
                if (realmGet$url != null) {
                    Table.nativeSetString(nativePtr, fileDataColumnInfo.urlIndex, createRowWithPrimaryKey, realmGet$url, false);
                } else {
                    Table.nativeSetNull(nativePtr, fileDataColumnInfo.urlIndex, createRowWithPrimaryKey, false);
                }
                j3 = j2;
            }
        }
    }

    public static FileData createDetachedCopy(FileData fileData, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        FileData fileData2;
        if (i > i2 || fileData == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(fileData);
        if (cacheData == null) {
            fileData2 = new FileData();
            map.put(fileData, new RealmObjectProxy.CacheData(i, fileData2));
        } else if (i >= cacheData.minDepth) {
            return (FileData) cacheData.object;
        } else {
            cacheData.minDepth = i;
            fileData2 = (FileData) cacheData.object;
        }
        ru_unicorn_ujin_data_realm_FileDataRealmProxyInterface ru_unicorn_ujin_data_realm_filedatarealmproxyinterface = fileData2;
        ru_unicorn_ujin_data_realm_FileDataRealmProxyInterface ru_unicorn_ujin_data_realm_filedatarealmproxyinterface2 = fileData;
        ru_unicorn_ujin_data_realm_filedatarealmproxyinterface.realmSet$id(ru_unicorn_ujin_data_realm_filedatarealmproxyinterface2.realmGet$id());
        ru_unicorn_ujin_data_realm_filedatarealmproxyinterface.realmSet$name(ru_unicorn_ujin_data_realm_filedatarealmproxyinterface2.realmGet$name());
        ru_unicorn_ujin_data_realm_filedatarealmproxyinterface.realmSet$mimeType(ru_unicorn_ujin_data_realm_filedatarealmproxyinterface2.realmGet$mimeType());
        ru_unicorn_ujin_data_realm_filedatarealmproxyinterface.realmSet$bytes(ru_unicorn_ujin_data_realm_filedatarealmproxyinterface2.realmGet$bytes());
        ru_unicorn_ujin_data_realm_filedatarealmproxyinterface.realmSet$meta(ru_unicorn_ujin_data_realm_FileMetaRealmProxy.createDetachedCopy(ru_unicorn_ujin_data_realm_filedatarealmproxyinterface2.realmGet$meta(), i + 1, i2, map));
        ru_unicorn_ujin_data_realm_filedatarealmproxyinterface.realmSet$url(ru_unicorn_ujin_data_realm_filedatarealmproxyinterface2.realmGet$url());
        return fileData2;
    }

    static FileData update(Realm realm, FileDataColumnInfo fileDataColumnInfo, FileData fileData, FileData fileData2, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        ru_unicorn_ujin_data_realm_FileDataRealmProxyInterface ru_unicorn_ujin_data_realm_filedatarealmproxyinterface = fileData;
        ru_unicorn_ujin_data_realm_FileDataRealmProxyInterface ru_unicorn_ujin_data_realm_filedatarealmproxyinterface2 = fileData2;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(FileData.class), fileDataColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(fileDataColumnInfo.idIndex, ru_unicorn_ujin_data_realm_filedatarealmproxyinterface2.realmGet$id());
        osObjectBuilder.addString(fileDataColumnInfo.nameIndex, ru_unicorn_ujin_data_realm_filedatarealmproxyinterface2.realmGet$name());
        osObjectBuilder.addString(fileDataColumnInfo.mimeTypeIndex, ru_unicorn_ujin_data_realm_filedatarealmproxyinterface2.realmGet$mimeType());
        osObjectBuilder.addString(fileDataColumnInfo.bytesIndex, ru_unicorn_ujin_data_realm_filedatarealmproxyinterface2.realmGet$bytes());
        FileMeta realmGet$meta = ru_unicorn_ujin_data_realm_filedatarealmproxyinterface2.realmGet$meta();
        if (realmGet$meta == null) {
            osObjectBuilder.addNull(fileDataColumnInfo.metaIndex);
        } else {
            FileMeta fileMeta = (FileMeta) map.get(realmGet$meta);
            if (fileMeta != null) {
                osObjectBuilder.addObject(fileDataColumnInfo.metaIndex, fileMeta);
            } else {
                osObjectBuilder.addObject(fileDataColumnInfo.metaIndex, ru_unicorn_ujin_data_realm_FileMetaRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_FileMetaRealmProxy.FileMetaColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) FileMeta.class), realmGet$meta, true, map, set));
            }
        }
        osObjectBuilder.addString(fileDataColumnInfo.urlIndex, ru_unicorn_ujin_data_realm_filedatarealmproxyinterface2.realmGet$url());
        osObjectBuilder.updateExistingObject();
        return fileData;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("FileData = proxy[");
        sb.append("{id:");
        String str = "null";
        sb.append(realmGet$id() != null ? realmGet$id() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{name:");
        sb.append(realmGet$name() != null ? realmGet$name() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{mimeType:");
        sb.append(realmGet$mimeType() != null ? realmGet$mimeType() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{bytes:");
        sb.append(realmGet$bytes() != null ? realmGet$bytes() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{meta:");
        sb.append(realmGet$meta() != null ? ru_unicorn_ujin_data_realm_FileMetaRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME : str);
        sb.append("}");
        sb.append(",");
        sb.append("{url:");
        if (realmGet$url() != null) {
            str = realmGet$url();
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
        ru_unicorn_ujin_data_realm_FileDataRealmProxy ru_unicorn_ujin_data_realm_filedatarealmproxy = (ru_unicorn_ujin_data_realm_FileDataRealmProxy) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_data_realm_filedatarealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_data_realm_filedatarealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_data_realm_filedatarealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
