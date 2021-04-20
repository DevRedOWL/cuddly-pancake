package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import com.lwansbrough.RCTCamera.RCTCameraModule;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.TalkingPhotosFile;
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

/* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_TalkingPhotosFileRealmProxy */
public class C4776x6ae644c3 extends TalkingPhotosFile implements RealmObjectProxy, C4777xa33ef3b6 {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private TalkingPhotosFileColumnInfo columnInfo;
    private ProxyState<TalkingPhotosFile> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_TalkingPhotosFileRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "TalkingPhotosFile";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_TalkingPhotosFileRealmProxy$TalkingPhotosFileColumnInfo */
    static final class TalkingPhotosFileColumnInfo extends ColumnInfo {
        long bytesIndex;
        long idIndex;
        long maxColumnIndexValue;
        long nameIndex;
        long previewIndex;
        long urlIndex;

        TalkingPhotosFileColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(5);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.bytesIndex = addColumnDetails("bytes", "bytes", objectSchemaInfo);
            this.nameIndex = addColumnDetails("name", "name", objectSchemaInfo);
            this.urlIndex = addColumnDetails("url", "url", objectSchemaInfo);
            this.previewIndex = addColumnDetails(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_PREVIEW, RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_PREVIEW, objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        TalkingPhotosFileColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new TalkingPhotosFileColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            TalkingPhotosFileColumnInfo talkingPhotosFileColumnInfo = (TalkingPhotosFileColumnInfo) columnInfo;
            TalkingPhotosFileColumnInfo talkingPhotosFileColumnInfo2 = (TalkingPhotosFileColumnInfo) columnInfo2;
            talkingPhotosFileColumnInfo2.idIndex = talkingPhotosFileColumnInfo.idIndex;
            talkingPhotosFileColumnInfo2.bytesIndex = talkingPhotosFileColumnInfo.bytesIndex;
            talkingPhotosFileColumnInfo2.nameIndex = talkingPhotosFileColumnInfo.nameIndex;
            talkingPhotosFileColumnInfo2.urlIndex = talkingPhotosFileColumnInfo.urlIndex;
            talkingPhotosFileColumnInfo2.previewIndex = talkingPhotosFileColumnInfo.previewIndex;
            talkingPhotosFileColumnInfo2.maxColumnIndexValue = talkingPhotosFileColumnInfo.maxColumnIndexValue;
        }
    }

    C4776x6ae644c3() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (TalkingPhotosFileColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public int realmGet$id() {
        this.proxyState.getRealm$realm().checkIfValid();
        return (int) this.proxyState.getRow$realm().getLong(this.columnInfo.idIndex);
    }

    public void realmSet$id(int i) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            throw new RealmException("Primary key field 'id' cannot be changed after object was created.");
        }
    }

    public long realmGet$bytes() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getLong(this.columnInfo.bytesIndex);
    }

    public void realmSet$bytes(long j) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            this.proxyState.getRow$realm().setLong(this.columnInfo.bytesIndex, j);
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            row$realm.getTable().setLong(this.columnInfo.bytesIndex, row$realm.getIndex(), j, true);
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

    public TalkingPhotosFile realmGet$preview() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.previewIndex)) {
            return null;
        }
        return (TalkingPhotosFile) this.proxyState.getRealm$realm().get(TalkingPhotosFile.class, this.proxyState.getRow$realm().getLink(this.columnInfo.previewIndex), false, Collections.emptyList());
    }

    public void realmSet$preview(TalkingPhotosFile talkingPhotosFile) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (talkingPhotosFile == null) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.previewIndex);
                return;
            }
            this.proxyState.checkValidObject(talkingPhotosFile);
            this.proxyState.getRow$realm().setLink(this.columnInfo.previewIndex, ((RealmObjectProxy) talkingPhotosFile).realmGet$proxyState().getRow$realm().getIndex());
        } else if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_PREVIEW)) {
            if (talkingPhotosFile != null && !RealmObject.isManaged(talkingPhotosFile)) {
                talkingPhotosFile = (TalkingPhotosFile) ((Realm) this.proxyState.getRealm$realm()).copyToRealm(talkingPhotosFile, new ImportFlag[0]);
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (talkingPhotosFile == null) {
                row$realm.nullifyLink(this.columnInfo.previewIndex);
                return;
            }
            this.proxyState.checkValidObject(talkingPhotosFile);
            row$realm.getTable().setLink(this.columnInfo.previewIndex, row$realm.getIndex(), ((RealmObjectProxy) talkingPhotosFile).realmGet$proxyState().getRow$realm().getIndex(), true);
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 5, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("id", RealmFieldType.INTEGER, true, true, true);
        builder2.addPersistedProperty("bytes", RealmFieldType.INTEGER, false, false, true);
        builder2.addPersistedProperty("name", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("url", RealmFieldType.STRING, false, false, false);
        builder.addPersistedLinkProperty(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_PREVIEW, RealmFieldType.OBJECT, ClassNameHelper.INTERNAL_CLASS_NAME);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static TalkingPhotosFileColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new TalkingPhotosFileColumnInfo(osSchemaInfo);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00ff  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.TalkingPhotosFile createOrUpdateUsingJsonObject(p046io.realm.Realm r15, org.json.JSONObject r16, boolean r17) throws org.json.JSONException {
        /*
            r0 = r15
            r7 = r16
            r8 = r17
            java.util.ArrayList r9 = new java.util.ArrayList
            r10 = 1
            r9.<init>(r10)
            java.lang.String r11 = "id"
            r12 = 0
            if (r8 == 0) goto L_0x0069
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.TalkingPhotosFile> r1 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.TalkingPhotosFile.class
            io.realm.internal.Table r1 = r15.getTable(r1)
            io.realm.RealmSchema r2 = r15.getSchema()
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.TalkingPhotosFile> r3 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.TalkingPhotosFile.class
            io.realm.internal.ColumnInfo r2 = r2.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r3)
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_TalkingPhotosFileRealmProxy$TalkingPhotosFileColumnInfo r2 = (p046io.realm.C4776x6ae644c3.TalkingPhotosFileColumnInfo) r2
            long r2 = r2.idIndex
            boolean r4 = r7.isNull(r11)
            r5 = -1
            if (r4 != 0) goto L_0x0035
            long r13 = r7.getLong(r11)
            long r2 = r1.findFirstLong(r2, r13)
            goto L_0x0036
        L_0x0035:
            r2 = r5
        L_0x0036:
            int r4 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r4 == 0) goto L_0x0069
            io.realm.BaseRealm$ThreadLocalRealmObjectContext r4 = p046io.realm.BaseRealm.objectContext
            java.lang.Object r4 = r4.get()
            r13 = r4
            io.realm.BaseRealm$RealmObjectContext r13 = (p046io.realm.BaseRealm.RealmObjectContext) r13
            io.realm.internal.UncheckedRow r3 = r1.getUncheckedRow(r2)     // Catch:{ all -> 0x0064 }
            io.realm.RealmSchema r1 = r15.getSchema()     // Catch:{ all -> 0x0064 }
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.TalkingPhotosFile> r2 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.TalkingPhotosFile.class
            io.realm.internal.ColumnInfo r4 = r1.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r2)     // Catch:{ all -> 0x0064 }
            r5 = 0
            java.util.List r6 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0064 }
            r1 = r13
            r2 = r15
            r1.set(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0064 }
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_TalkingPhotosFileRealmProxy r1 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_TalkingPhotosFileRealmProxy     // Catch:{ all -> 0x0064 }
            r1.<init>()     // Catch:{ all -> 0x0064 }
            r13.clear()
            goto L_0x006a
        L_0x0064:
            r0 = move-exception
            r13.clear()
            throw r0
        L_0x0069:
            r1 = r12
        L_0x006a:
            java.lang.String r2 = "preview"
            if (r1 != 0) goto L_0x00a5
            boolean r1 = r7.has(r2)
            if (r1 == 0) goto L_0x0077
            r9.add(r2)
        L_0x0077:
            boolean r1 = r7.has(r11)
            if (r1 == 0) goto L_0x009d
            boolean r1 = r7.isNull(r11)
            if (r1 == 0) goto L_0x008c
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.TalkingPhotosFile> r1 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.TalkingPhotosFile.class
            io.realm.RealmModel r1 = r15.createObjectInternal(r1, r12, r10, r9)
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_TalkingPhotosFileRealmProxy r1 = (p046io.realm.C4776x6ae644c3) r1
            goto L_0x00a5
        L_0x008c:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.TalkingPhotosFile> r1 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.TalkingPhotosFile.class
            int r3 = r7.getInt(r11)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            io.realm.RealmModel r1 = r15.createObjectInternal(r1, r3, r10, r9)
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_TalkingPhotosFileRealmProxy r1 = (p046io.realm.C4776x6ae644c3) r1
            goto L_0x00a5
        L_0x009d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "JSON object doesn't have the primary key field 'id'."
            r0.<init>(r1)
            throw r0
        L_0x00a5:
            r3 = r1
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_TalkingPhotosFileRealmProxyInterface r3 = (p046io.realm.C4777xa33ef3b6) r3
            java.lang.String r4 = "bytes"
            boolean r5 = r7.has(r4)
            if (r5 == 0) goto L_0x00c6
            boolean r5 = r7.isNull(r4)
            if (r5 != 0) goto L_0x00be
            long r4 = r7.getLong(r4)
            r3.realmSet$bytes(r4)
            goto L_0x00c6
        L_0x00be:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Trying to set non-nullable field 'bytes' to null."
            r0.<init>(r1)
            throw r0
        L_0x00c6:
            java.lang.String r4 = "name"
            boolean r5 = r7.has(r4)
            if (r5 == 0) goto L_0x00df
            boolean r5 = r7.isNull(r4)
            if (r5 == 0) goto L_0x00d8
            r3.realmSet$name(r12)
            goto L_0x00df
        L_0x00d8:
            java.lang.String r4 = r7.getString(r4)
            r3.realmSet$name(r4)
        L_0x00df:
            java.lang.String r4 = "url"
            boolean r5 = r7.has(r4)
            if (r5 == 0) goto L_0x00f9
            boolean r5 = r7.isNull(r4)
            if (r5 == 0) goto L_0x00f2
            r3.realmSet$url(r12)
            goto L_0x00f9
        L_0x00f2:
            java.lang.String r4 = r7.getString(r4)
            r3.realmSet$url(r4)
        L_0x00f9:
            boolean r4 = r7.has(r2)
            if (r4 == 0) goto L_0x0114
            boolean r4 = r7.isNull(r2)
            if (r4 == 0) goto L_0x0109
            r3.realmSet$preview(r12)
            goto L_0x0114
        L_0x0109:
            org.json.JSONObject r2 = r7.getJSONObject(r2)
            ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.TalkingPhotosFile r0 = createOrUpdateUsingJsonObject(r15, r2, r8)
            r3.realmSet$preview(r0)
        L_0x0114:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.C4776x6ae644c3.createOrUpdateUsingJsonObject(io.realm.Realm, org.json.JSONObject, boolean):ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.TalkingPhotosFile");
    }

    public static TalkingPhotosFile createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        TalkingPhotosFile talkingPhotosFile = new TalkingPhotosFile();
        C4777xa33ef3b6 ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosfilerealmproxyinterface = talkingPhotosFile;
        jsonReader.beginObject();
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("id")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosfilerealmproxyinterface.realmSet$id(jsonReader.nextInt());
                    z = true;
                } else {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'id' to null.");
                }
            } else if (nextName.equals("bytes")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosfilerealmproxyinterface.realmSet$bytes(jsonReader.nextLong());
                } else {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'bytes' to null.");
                }
            } else if (nextName.equals("name")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosfilerealmproxyinterface.realmSet$name(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosfilerealmproxyinterface.realmSet$name((String) null);
                }
            } else if (nextName.equals("url")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosfilerealmproxyinterface.realmSet$url(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosfilerealmproxyinterface.realmSet$url((String) null);
                }
            } else if (!nextName.equals(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_PREVIEW)) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.skipValue();
                ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosfilerealmproxyinterface.realmSet$preview((TalkingPhotosFile) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosfilerealmproxyinterface.realmSet$preview(createUsingJsonStream(realm, jsonReader));
            }
        }
        jsonReader.endObject();
        if (z) {
            return (TalkingPhotosFile) realm.copyToRealm(talkingPhotosFile, new ImportFlag[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
    }

    private static C4776x6ae644c3 newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) TalkingPhotosFile.class), false, Collections.emptyList());
        C4776x6ae644c3 ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosfilerealmproxy = new C4776x6ae644c3();
        realmObjectContext.clear();
        return ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosfilerealmproxy;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x009b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.TalkingPhotosFile copyOrUpdate(p046io.realm.Realm r8, p046io.realm.C4776x6ae644c3.TalkingPhotosFileColumnInfo r9, p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.TalkingPhotosFile r10, boolean r11, java.util.Map<p046io.realm.RealmModel, p046io.realm.internal.RealmObjectProxy> r12, java.util.Set<p046io.realm.ImportFlag> r13) {
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
            ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.TalkingPhotosFile r1 = (p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.TalkingPhotosFile) r1
            return r1
        L_0x004b:
            r1 = 0
            if (r11 == 0) goto L_0x008d
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.TalkingPhotosFile> r2 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.TalkingPhotosFile.class
            io.realm.internal.Table r2 = r8.getTable(r2)
            long r3 = r9.idIndex
            r5 = r10
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_TalkingPhotosFileRealmProxyInterface r5 = (p046io.realm.C4777xa33ef3b6) r5
            int r5 = r5.realmGet$id()
            long r5 = (long) r5
            long r3 = r2.findFirstLong(r3, r5)
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x006a
            r0 = 0
            goto L_0x008e
        L_0x006a:
            io.realm.internal.UncheckedRow r3 = r2.getUncheckedRow(r3)     // Catch:{ all -> 0x0088 }
            r5 = 0
            java.util.List r6 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0088 }
            r1 = r0
            r2 = r8
            r4 = r9
            r1.set(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0088 }
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_TalkingPhotosFileRealmProxy r1 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_TalkingPhotosFileRealmProxy     // Catch:{ all -> 0x0088 }
            r1.<init>()     // Catch:{ all -> 0x0088 }
            r2 = r1
            io.realm.internal.RealmObjectProxy r2 = (p046io.realm.internal.RealmObjectProxy) r2     // Catch:{ all -> 0x0088 }
            r12.put(r10, r2)     // Catch:{ all -> 0x0088 }
            r0.clear()
            goto L_0x008d
        L_0x0088:
            r8 = move-exception
            r0.clear()
            throw r8
        L_0x008d:
            r0 = r11
        L_0x008e:
            r3 = r1
            if (r0 == 0) goto L_0x009b
            r1 = r8
            r2 = r9
            r4 = r10
            r5 = r12
            r6 = r13
            ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.TalkingPhotosFile r8 = update(r1, r2, r3, r4, r5, r6)
            goto L_0x009f
        L_0x009b:
            ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.TalkingPhotosFile r8 = copy(r8, r9, r10, r11, r12, r13)
        L_0x009f:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.C4776x6ae644c3.copyOrUpdate(io.realm.Realm, io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_TalkingPhotosFileRealmProxy$TalkingPhotosFileColumnInfo, ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.TalkingPhotosFile, boolean, java.util.Map, java.util.Set):ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.TalkingPhotosFile");
    }

    public static TalkingPhotosFile copy(Realm realm, TalkingPhotosFileColumnInfo talkingPhotosFileColumnInfo, TalkingPhotosFile talkingPhotosFile, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(talkingPhotosFile);
        if (realmObjectProxy != null) {
            return (TalkingPhotosFile) realmObjectProxy;
        }
        C4777xa33ef3b6 ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosfilerealmproxyinterface = talkingPhotosFile;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(TalkingPhotosFile.class), talkingPhotosFileColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addInteger(talkingPhotosFileColumnInfo.idIndex, Integer.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosfilerealmproxyinterface.realmGet$id()));
        osObjectBuilder.addInteger(talkingPhotosFileColumnInfo.bytesIndex, Long.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosfilerealmproxyinterface.realmGet$bytes()));
        osObjectBuilder.addString(talkingPhotosFileColumnInfo.nameIndex, ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosfilerealmproxyinterface.realmGet$name());
        osObjectBuilder.addString(talkingPhotosFileColumnInfo.urlIndex, ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosfilerealmproxyinterface.realmGet$url());
        C4776x6ae644c3 newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(talkingPhotosFile, newProxyInstance);
        TalkingPhotosFile realmGet$preview = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosfilerealmproxyinterface.realmGet$preview();
        if (realmGet$preview == null) {
            newProxyInstance.realmSet$preview((TalkingPhotosFile) null);
        } else {
            TalkingPhotosFile talkingPhotosFile2 = (TalkingPhotosFile) map.get(realmGet$preview);
            if (talkingPhotosFile2 != null) {
                newProxyInstance.realmSet$preview(talkingPhotosFile2);
            } else {
                newProxyInstance.realmSet$preview(copyOrUpdate(realm, (TalkingPhotosFileColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TalkingPhotosFile.class), realmGet$preview, z, map, set));
            }
        }
        return newProxyInstance;
    }

    public static long insert(Realm realm, TalkingPhotosFile talkingPhotosFile, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Realm realm2 = realm;
        TalkingPhotosFile talkingPhotosFile2 = talkingPhotosFile;
        Map<RealmModel, Long> map2 = map;
        if (talkingPhotosFile2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) talkingPhotosFile2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(TalkingPhotosFile.class);
        long nativePtr = table.getNativePtr();
        TalkingPhotosFileColumnInfo talkingPhotosFileColumnInfo = (TalkingPhotosFileColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TalkingPhotosFile.class);
        long j3 = talkingPhotosFileColumnInfo.idIndex;
        C4777xa33ef3b6 ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosfilerealmproxyinterface = talkingPhotosFile2;
        Integer valueOf = Integer.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosfilerealmproxyinterface.realmGet$id());
        if (valueOf != null) {
            j = Table.nativeFindFirstInt(nativePtr, j3, (long) ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosfilerealmproxyinterface.realmGet$id());
        } else {
            j = -1;
        }
        if (j == -1) {
            j2 = OsObject.createRowWithPrimaryKey(table, j3, Integer.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosfilerealmproxyinterface.realmGet$id()));
        } else {
            Table.throwDuplicatePrimaryKeyException(valueOf);
            j2 = j;
        }
        map2.put(talkingPhotosFile2, Long.valueOf(j2));
        Table.nativeSetLong(nativePtr, talkingPhotosFileColumnInfo.bytesIndex, j2, ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosfilerealmproxyinterface.realmGet$bytes(), false);
        String realmGet$name = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosfilerealmproxyinterface.realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(nativePtr, talkingPhotosFileColumnInfo.nameIndex, j2, realmGet$name, false);
        }
        String realmGet$url = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosfilerealmproxyinterface.realmGet$url();
        if (realmGet$url != null) {
            Table.nativeSetString(nativePtr, talkingPhotosFileColumnInfo.urlIndex, j2, realmGet$url, false);
        }
        TalkingPhotosFile realmGet$preview = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosfilerealmproxyinterface.realmGet$preview();
        if (realmGet$preview != null) {
            Long l = map2.get(realmGet$preview);
            if (l == null) {
                l = Long.valueOf(insert(realm2, realmGet$preview, map2));
            }
            Table.nativeSetLink(nativePtr, talkingPhotosFileColumnInfo.previewIndex, j2, l.longValue(), false);
        }
        return j2;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(TalkingPhotosFile.class);
        long nativePtr = table.getNativePtr();
        TalkingPhotosFileColumnInfo talkingPhotosFileColumnInfo = (TalkingPhotosFileColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TalkingPhotosFile.class);
        long j2 = talkingPhotosFileColumnInfo.idIndex;
        while (it.hasNext()) {
            TalkingPhotosFile talkingPhotosFile = (TalkingPhotosFile) it.next();
            if (!map2.containsKey(talkingPhotosFile)) {
                if (talkingPhotosFile instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) talkingPhotosFile;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(talkingPhotosFile, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                C4777xa33ef3b6 ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosfilerealmproxyinterface = talkingPhotosFile;
                Integer valueOf = Integer.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosfilerealmproxyinterface.realmGet$id());
                if (valueOf != null) {
                    j = Table.nativeFindFirstInt(nativePtr, j2, (long) ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosfilerealmproxyinterface.realmGet$id());
                } else {
                    j = -1;
                }
                if (j == -1) {
                    j = OsObject.createRowWithPrimaryKey(table, j2, Integer.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosfilerealmproxyinterface.realmGet$id()));
                } else {
                    Table.throwDuplicatePrimaryKeyException(valueOf);
                }
                long j3 = j;
                map2.put(talkingPhotosFile, Long.valueOf(j3));
                long j4 = j2;
                Table.nativeSetLong(nativePtr, talkingPhotosFileColumnInfo.bytesIndex, j3, ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosfilerealmproxyinterface.realmGet$bytes(), false);
                String realmGet$name = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosfilerealmproxyinterface.realmGet$name();
                if (realmGet$name != null) {
                    Table.nativeSetString(nativePtr, talkingPhotosFileColumnInfo.nameIndex, j3, realmGet$name, false);
                }
                String realmGet$url = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosfilerealmproxyinterface.realmGet$url();
                if (realmGet$url != null) {
                    Table.nativeSetString(nativePtr, talkingPhotosFileColumnInfo.urlIndex, j3, realmGet$url, false);
                }
                TalkingPhotosFile realmGet$preview = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosfilerealmproxyinterface.realmGet$preview();
                if (realmGet$preview != null) {
                    Long l = map2.get(realmGet$preview);
                    if (l == null) {
                        l = Long.valueOf(insert(realm2, realmGet$preview, map2));
                    }
                    table.setLink(talkingPhotosFileColumnInfo.previewIndex, j3, l.longValue(), false);
                }
                j2 = j4;
            }
        }
    }

    public static long insertOrUpdate(Realm realm, TalkingPhotosFile talkingPhotosFile, Map<RealmModel, Long> map) {
        Realm realm2 = realm;
        TalkingPhotosFile talkingPhotosFile2 = talkingPhotosFile;
        Map<RealmModel, Long> map2 = map;
        if (talkingPhotosFile2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) talkingPhotosFile2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(TalkingPhotosFile.class);
        long nativePtr = table.getNativePtr();
        TalkingPhotosFileColumnInfo talkingPhotosFileColumnInfo = (TalkingPhotosFileColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TalkingPhotosFile.class);
        long j = talkingPhotosFileColumnInfo.idIndex;
        C4777xa33ef3b6 ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosfilerealmproxyinterface = talkingPhotosFile2;
        long nativeFindFirstInt = Integer.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosfilerealmproxyinterface.realmGet$id()) != null ? Table.nativeFindFirstInt(nativePtr, j, (long) ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosfilerealmproxyinterface.realmGet$id()) : -1;
        long createRowWithPrimaryKey = nativeFindFirstInt == -1 ? OsObject.createRowWithPrimaryKey(table, j, Integer.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosfilerealmproxyinterface.realmGet$id())) : nativeFindFirstInt;
        map2.put(talkingPhotosFile2, Long.valueOf(createRowWithPrimaryKey));
        Table.nativeSetLong(nativePtr, talkingPhotosFileColumnInfo.bytesIndex, createRowWithPrimaryKey, ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosfilerealmproxyinterface.realmGet$bytes(), false);
        String realmGet$name = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosfilerealmproxyinterface.realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(nativePtr, talkingPhotosFileColumnInfo.nameIndex, createRowWithPrimaryKey, realmGet$name, false);
        } else {
            Table.nativeSetNull(nativePtr, talkingPhotosFileColumnInfo.nameIndex, createRowWithPrimaryKey, false);
        }
        String realmGet$url = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosfilerealmproxyinterface.realmGet$url();
        if (realmGet$url != null) {
            Table.nativeSetString(nativePtr, talkingPhotosFileColumnInfo.urlIndex, createRowWithPrimaryKey, realmGet$url, false);
        } else {
            Table.nativeSetNull(nativePtr, talkingPhotosFileColumnInfo.urlIndex, createRowWithPrimaryKey, false);
        }
        TalkingPhotosFile realmGet$preview = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosfilerealmproxyinterface.realmGet$preview();
        if (realmGet$preview != null) {
            Long l = map2.get(realmGet$preview);
            if (l == null) {
                l = Long.valueOf(insertOrUpdate(realm2, realmGet$preview, map2));
            }
            Table.nativeSetLink(nativePtr, talkingPhotosFileColumnInfo.previewIndex, createRowWithPrimaryKey, l.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, talkingPhotosFileColumnInfo.previewIndex, createRowWithPrimaryKey);
        }
        return createRowWithPrimaryKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(TalkingPhotosFile.class);
        long nativePtr = table.getNativePtr();
        TalkingPhotosFileColumnInfo talkingPhotosFileColumnInfo = (TalkingPhotosFileColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TalkingPhotosFile.class);
        long j2 = talkingPhotosFileColumnInfo.idIndex;
        while (it.hasNext()) {
            TalkingPhotosFile talkingPhotosFile = (TalkingPhotosFile) it.next();
            if (!map2.containsKey(talkingPhotosFile)) {
                if (talkingPhotosFile instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) talkingPhotosFile;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(talkingPhotosFile, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                C4777xa33ef3b6 ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosfilerealmproxyinterface = talkingPhotosFile;
                if (Integer.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosfilerealmproxyinterface.realmGet$id()) != null) {
                    j = Table.nativeFindFirstInt(nativePtr, j2, (long) ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosfilerealmproxyinterface.realmGet$id());
                } else {
                    j = -1;
                }
                if (j == -1) {
                    j = OsObject.createRowWithPrimaryKey(table, j2, Integer.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosfilerealmproxyinterface.realmGet$id()));
                }
                long j3 = j;
                map2.put(talkingPhotosFile, Long.valueOf(j3));
                long j4 = j2;
                Table.nativeSetLong(nativePtr, talkingPhotosFileColumnInfo.bytesIndex, j3, ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosfilerealmproxyinterface.realmGet$bytes(), false);
                String realmGet$name = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosfilerealmproxyinterface.realmGet$name();
                if (realmGet$name != null) {
                    Table.nativeSetString(nativePtr, talkingPhotosFileColumnInfo.nameIndex, j3, realmGet$name, false);
                } else {
                    Table.nativeSetNull(nativePtr, talkingPhotosFileColumnInfo.nameIndex, j3, false);
                }
                String realmGet$url = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosfilerealmproxyinterface.realmGet$url();
                if (realmGet$url != null) {
                    Table.nativeSetString(nativePtr, talkingPhotosFileColumnInfo.urlIndex, j3, realmGet$url, false);
                } else {
                    Table.nativeSetNull(nativePtr, talkingPhotosFileColumnInfo.urlIndex, j3, false);
                }
                TalkingPhotosFile realmGet$preview = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosfilerealmproxyinterface.realmGet$preview();
                if (realmGet$preview != null) {
                    Long l = map2.get(realmGet$preview);
                    if (l == null) {
                        l = Long.valueOf(insertOrUpdate(realm2, realmGet$preview, map2));
                    }
                    Table.nativeSetLink(nativePtr, talkingPhotosFileColumnInfo.previewIndex, j3, l.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, talkingPhotosFileColumnInfo.previewIndex, j3);
                }
                j2 = j4;
            }
        }
    }

    public static TalkingPhotosFile createDetachedCopy(TalkingPhotosFile talkingPhotosFile, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        TalkingPhotosFile talkingPhotosFile2;
        if (i > i2 || talkingPhotosFile == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(talkingPhotosFile);
        if (cacheData == null) {
            talkingPhotosFile2 = new TalkingPhotosFile();
            map.put(talkingPhotosFile, new RealmObjectProxy.CacheData(i, talkingPhotosFile2));
        } else if (i >= cacheData.minDepth) {
            return (TalkingPhotosFile) cacheData.object;
        } else {
            cacheData.minDepth = i;
            talkingPhotosFile2 = (TalkingPhotosFile) cacheData.object;
        }
        C4777xa33ef3b6 ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosfilerealmproxyinterface = talkingPhotosFile2;
        C4777xa33ef3b6 ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosfilerealmproxyinterface2 = talkingPhotosFile;
        ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosfilerealmproxyinterface.realmSet$id(ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosfilerealmproxyinterface2.realmGet$id());
        ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosfilerealmproxyinterface.realmSet$bytes(ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosfilerealmproxyinterface2.realmGet$bytes());
        ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosfilerealmproxyinterface.realmSet$name(ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosfilerealmproxyinterface2.realmGet$name());
        ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosfilerealmproxyinterface.realmSet$url(ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosfilerealmproxyinterface2.realmGet$url());
        ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosfilerealmproxyinterface.realmSet$preview(createDetachedCopy(ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosfilerealmproxyinterface2.realmGet$preview(), i + 1, i2, map));
        return talkingPhotosFile2;
    }

    static TalkingPhotosFile update(Realm realm, TalkingPhotosFileColumnInfo talkingPhotosFileColumnInfo, TalkingPhotosFile talkingPhotosFile, TalkingPhotosFile talkingPhotosFile2, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        C4777xa33ef3b6 ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosfilerealmproxyinterface = talkingPhotosFile;
        C4777xa33ef3b6 ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosfilerealmproxyinterface2 = talkingPhotosFile2;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(TalkingPhotosFile.class), talkingPhotosFileColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addInteger(talkingPhotosFileColumnInfo.idIndex, Integer.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosfilerealmproxyinterface2.realmGet$id()));
        osObjectBuilder.addInteger(talkingPhotosFileColumnInfo.bytesIndex, Long.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosfilerealmproxyinterface2.realmGet$bytes()));
        osObjectBuilder.addString(talkingPhotosFileColumnInfo.nameIndex, ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosfilerealmproxyinterface2.realmGet$name());
        osObjectBuilder.addString(talkingPhotosFileColumnInfo.urlIndex, ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosfilerealmproxyinterface2.realmGet$url());
        TalkingPhotosFile realmGet$preview = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosfilerealmproxyinterface2.realmGet$preview();
        if (realmGet$preview == null) {
            osObjectBuilder.addNull(talkingPhotosFileColumnInfo.previewIndex);
        } else {
            TalkingPhotosFile talkingPhotosFile3 = (TalkingPhotosFile) map.get(realmGet$preview);
            if (talkingPhotosFile3 != null) {
                osObjectBuilder.addObject(talkingPhotosFileColumnInfo.previewIndex, talkingPhotosFile3);
            } else {
                osObjectBuilder.addObject(talkingPhotosFileColumnInfo.previewIndex, copyOrUpdate(realm, (TalkingPhotosFileColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TalkingPhotosFile.class), realmGet$preview, true, map, set));
            }
        }
        osObjectBuilder.updateExistingObject();
        return talkingPhotosFile;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("TalkingPhotosFile = proxy[");
        sb.append("{id:");
        sb.append(realmGet$id());
        sb.append("}");
        sb.append(",");
        sb.append("{bytes:");
        sb.append(realmGet$bytes());
        sb.append("}");
        sb.append(",");
        sb.append("{name:");
        String str = "null";
        sb.append(realmGet$name() != null ? realmGet$name() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{url:");
        sb.append(realmGet$url() != null ? realmGet$url() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{preview:");
        if (realmGet$preview() != null) {
            str = ClassNameHelper.INTERNAL_CLASS_NAME;
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
        C4776x6ae644c3 ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosfilerealmproxy = (C4776x6ae644c3) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosfilerealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosfilerealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosfilerealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
