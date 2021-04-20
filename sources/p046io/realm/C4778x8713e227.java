package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.TalkingPhotos;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.TalkingPhotosFile;
import p046io.realm.BaseRealm;
import p046io.realm.C4776x6ae644c3;
import p046io.realm.exceptions.RealmException;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_TalkingPhotosRealmProxy */
public class C4778x8713e227 extends TalkingPhotos implements RealmObjectProxy, C4779x60c226d2 {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private TalkingPhotosColumnInfo columnInfo;
    private ProxyState<TalkingPhotos> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_TalkingPhotosRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "TalkingPhotos";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_TalkingPhotosRealmProxy$TalkingPhotosColumnInfo */
    static final class TalkingPhotosColumnInfo extends ColumnInfo {
        long idIndex;
        long maxColumnIndexValue;
        long nameIndex;
        long urlIndex;

        TalkingPhotosColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(3);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.nameIndex = addColumnDetails("name", "name", objectSchemaInfo);
            this.urlIndex = addColumnDetails("url", "url", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        TalkingPhotosColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new TalkingPhotosColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            TalkingPhotosColumnInfo talkingPhotosColumnInfo = (TalkingPhotosColumnInfo) columnInfo;
            TalkingPhotosColumnInfo talkingPhotosColumnInfo2 = (TalkingPhotosColumnInfo) columnInfo2;
            talkingPhotosColumnInfo2.idIndex = talkingPhotosColumnInfo.idIndex;
            talkingPhotosColumnInfo2.nameIndex = talkingPhotosColumnInfo.nameIndex;
            talkingPhotosColumnInfo2.urlIndex = talkingPhotosColumnInfo.urlIndex;
            talkingPhotosColumnInfo2.maxColumnIndexValue = talkingPhotosColumnInfo.maxColumnIndexValue;
        }
    }

    C4778x8713e227() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (TalkingPhotosColumnInfo) realmObjectContext.getColumnInfo();
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

    public TalkingPhotosFile realmGet$url() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.urlIndex)) {
            return null;
        }
        return (TalkingPhotosFile) this.proxyState.getRealm$realm().get(TalkingPhotosFile.class, this.proxyState.getRow$realm().getLink(this.columnInfo.urlIndex), false, Collections.emptyList());
    }

    public void realmSet$url(TalkingPhotosFile talkingPhotosFile) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (talkingPhotosFile == null) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.urlIndex);
                return;
            }
            this.proxyState.checkValidObject(talkingPhotosFile);
            this.proxyState.getRow$realm().setLink(this.columnInfo.urlIndex, ((RealmObjectProxy) talkingPhotosFile).realmGet$proxyState().getRow$realm().getIndex());
        } else if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("url")) {
            if (talkingPhotosFile != null && !RealmObject.isManaged(talkingPhotosFile)) {
                talkingPhotosFile = (TalkingPhotosFile) ((Realm) this.proxyState.getRealm$realm()).copyToRealm(talkingPhotosFile, new ImportFlag[0]);
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (talkingPhotosFile == null) {
                row$realm.nullifyLink(this.columnInfo.urlIndex);
                return;
            }
            this.proxyState.checkValidObject(talkingPhotosFile);
            row$realm.getTable().setLink(this.columnInfo.urlIndex, row$realm.getIndex(), ((RealmObjectProxy) talkingPhotosFile).realmGet$proxyState().getRow$realm().getIndex(), true);
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 3, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("id", RealmFieldType.INTEGER, true, true, true);
        builder2.addPersistedProperty("name", RealmFieldType.STRING, false, false, false);
        builder.addPersistedLinkProperty("url", RealmFieldType.OBJECT, C4776x6ae644c3.ClassNameHelper.INTERNAL_CLASS_NAME);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static TalkingPhotosColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new TalkingPhotosColumnInfo(osSchemaInfo);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.TalkingPhotos createOrUpdateUsingJsonObject(p046io.realm.Realm r15, org.json.JSONObject r16, boolean r17) throws org.json.JSONException {
        /*
            r0 = r15
            r7 = r16
            r8 = r17
            java.util.ArrayList r9 = new java.util.ArrayList
            r10 = 1
            r9.<init>(r10)
            r11 = 0
            java.lang.String r12 = "id"
            if (r8 == 0) goto L_0x0069
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.TalkingPhotos> r1 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.TalkingPhotos.class
            io.realm.internal.Table r1 = r15.getTable(r1)
            io.realm.RealmSchema r2 = r15.getSchema()
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.TalkingPhotos> r3 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.TalkingPhotos.class
            io.realm.internal.ColumnInfo r2 = r2.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r3)
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_TalkingPhotosRealmProxy$TalkingPhotosColumnInfo r2 = (p046io.realm.C4778x8713e227.TalkingPhotosColumnInfo) r2
            long r2 = r2.idIndex
            boolean r4 = r7.isNull(r12)
            r5 = -1
            if (r4 != 0) goto L_0x0035
            long r13 = r7.getLong(r12)
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
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.TalkingPhotos> r2 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.TalkingPhotos.class
            io.realm.internal.ColumnInfo r4 = r1.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r2)     // Catch:{ all -> 0x0064 }
            r5 = 0
            java.util.List r6 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0064 }
            r1 = r13
            r2 = r15
            r1.set(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0064 }
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_TalkingPhotosRealmProxy r1 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_TalkingPhotosRealmProxy     // Catch:{ all -> 0x0064 }
            r1.<init>()     // Catch:{ all -> 0x0064 }
            r13.clear()
            goto L_0x006a
        L_0x0064:
            r0 = move-exception
            r13.clear()
            throw r0
        L_0x0069:
            r1 = r11
        L_0x006a:
            java.lang.String r2 = "url"
            if (r1 != 0) goto L_0x00a6
            boolean r1 = r7.has(r2)
            if (r1 == 0) goto L_0x0078
            r9.add(r2)
        L_0x0078:
            boolean r1 = r7.has(r12)
            if (r1 == 0) goto L_0x009e
            boolean r1 = r7.isNull(r12)
            if (r1 == 0) goto L_0x008d
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.TalkingPhotos> r1 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.TalkingPhotos.class
            io.realm.RealmModel r1 = r15.createObjectInternal(r1, r11, r10, r9)
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_TalkingPhotosRealmProxy r1 = (p046io.realm.C4778x8713e227) r1
            goto L_0x00a6
        L_0x008d:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.TalkingPhotos> r1 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.TalkingPhotos.class
            int r3 = r7.getInt(r12)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            io.realm.RealmModel r1 = r15.createObjectInternal(r1, r3, r10, r9)
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_TalkingPhotosRealmProxy r1 = (p046io.realm.C4778x8713e227) r1
            goto L_0x00a6
        L_0x009e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "JSON object doesn't have the primary key field 'id'."
            r0.<init>(r1)
            throw r0
        L_0x00a6:
            r3 = r1
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_TalkingPhotosRealmProxyInterface r3 = (p046io.realm.C4779x60c226d2) r3
            java.lang.String r4 = "name"
            boolean r5 = r7.has(r4)
            if (r5 == 0) goto L_0x00c2
            boolean r5 = r7.isNull(r4)
            if (r5 == 0) goto L_0x00bb
            r3.realmSet$name(r11)
            goto L_0x00c2
        L_0x00bb:
            java.lang.String r4 = r7.getString(r4)
            r3.realmSet$name(r4)
        L_0x00c2:
            boolean r4 = r7.has(r2)
            if (r4 == 0) goto L_0x00dd
            boolean r4 = r7.isNull(r2)
            if (r4 == 0) goto L_0x00d2
            r3.realmSet$url(r11)
            goto L_0x00dd
        L_0x00d2:
            org.json.JSONObject r2 = r7.getJSONObject(r2)
            ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.TalkingPhotosFile r0 = p046io.realm.C4776x6ae644c3.createOrUpdateUsingJsonObject(r15, r2, r8)
            r3.realmSet$url(r0)
        L_0x00dd:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.C4778x8713e227.createOrUpdateUsingJsonObject(io.realm.Realm, org.json.JSONObject, boolean):ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.TalkingPhotos");
    }

    public static TalkingPhotos createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        TalkingPhotos talkingPhotos = new TalkingPhotos();
        C4779x60c226d2 ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosrealmproxyinterface = talkingPhotos;
        jsonReader.beginObject();
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("id")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosrealmproxyinterface.realmSet$id(jsonReader.nextInt());
                    z = true;
                } else {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'id' to null.");
                }
            } else if (nextName.equals("name")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosrealmproxyinterface.realmSet$name(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosrealmproxyinterface.realmSet$name((String) null);
                }
            } else if (!nextName.equals("url")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.skipValue();
                ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosrealmproxyinterface.realmSet$url((TalkingPhotosFile) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosrealmproxyinterface.realmSet$url(C4776x6ae644c3.createUsingJsonStream(realm, jsonReader));
            }
        }
        jsonReader.endObject();
        if (z) {
            return (TalkingPhotos) realm.copyToRealm(talkingPhotos, new ImportFlag[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
    }

    private static C4778x8713e227 newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) TalkingPhotos.class), false, Collections.emptyList());
        C4778x8713e227 ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosrealmproxy = new C4778x8713e227();
        realmObjectContext.clear();
        return ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosrealmproxy;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x009b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.TalkingPhotos copyOrUpdate(p046io.realm.Realm r8, p046io.realm.C4778x8713e227.TalkingPhotosColumnInfo r9, p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.TalkingPhotos r10, boolean r11, java.util.Map<p046io.realm.RealmModel, p046io.realm.internal.RealmObjectProxy> r12, java.util.Set<p046io.realm.ImportFlag> r13) {
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
            ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.TalkingPhotos r1 = (p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.TalkingPhotos) r1
            return r1
        L_0x004b:
            r1 = 0
            if (r11 == 0) goto L_0x008d
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.TalkingPhotos> r2 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.TalkingPhotos.class
            io.realm.internal.Table r2 = r8.getTable(r2)
            long r3 = r9.idIndex
            r5 = r10
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_TalkingPhotosRealmProxyInterface r5 = (p046io.realm.C4779x60c226d2) r5
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
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_TalkingPhotosRealmProxy r1 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_TalkingPhotosRealmProxy     // Catch:{ all -> 0x0088 }
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
            ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.TalkingPhotos r8 = update(r1, r2, r3, r4, r5, r6)
            goto L_0x009f
        L_0x009b:
            ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.TalkingPhotos r8 = copy(r8, r9, r10, r11, r12, r13)
        L_0x009f:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.C4778x8713e227.copyOrUpdate(io.realm.Realm, io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_TalkingPhotosRealmProxy$TalkingPhotosColumnInfo, ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.TalkingPhotos, boolean, java.util.Map, java.util.Set):ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.TalkingPhotos");
    }

    public static TalkingPhotos copy(Realm realm, TalkingPhotosColumnInfo talkingPhotosColumnInfo, TalkingPhotos talkingPhotos, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(talkingPhotos);
        if (realmObjectProxy != null) {
            return (TalkingPhotos) realmObjectProxy;
        }
        C4779x60c226d2 ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosrealmproxyinterface = talkingPhotos;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(TalkingPhotos.class), talkingPhotosColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addInteger(talkingPhotosColumnInfo.idIndex, Integer.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosrealmproxyinterface.realmGet$id()));
        osObjectBuilder.addString(talkingPhotosColumnInfo.nameIndex, ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosrealmproxyinterface.realmGet$name());
        C4778x8713e227 newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(talkingPhotos, newProxyInstance);
        TalkingPhotosFile realmGet$url = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosrealmproxyinterface.realmGet$url();
        if (realmGet$url == null) {
            newProxyInstance.realmSet$url((TalkingPhotosFile) null);
        } else {
            TalkingPhotosFile talkingPhotosFile = (TalkingPhotosFile) map.get(realmGet$url);
            if (talkingPhotosFile != null) {
                newProxyInstance.realmSet$url(talkingPhotosFile);
            } else {
                newProxyInstance.realmSet$url(C4776x6ae644c3.copyOrUpdate(realm, (C4776x6ae644c3.TalkingPhotosFileColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TalkingPhotosFile.class), realmGet$url, z, map, set));
            }
        }
        return newProxyInstance;
    }

    public static long insert(Realm realm, TalkingPhotos talkingPhotos, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Realm realm2 = realm;
        TalkingPhotos talkingPhotos2 = talkingPhotos;
        Map<RealmModel, Long> map2 = map;
        if (talkingPhotos2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) talkingPhotos2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(TalkingPhotos.class);
        long nativePtr = table.getNativePtr();
        TalkingPhotosColumnInfo talkingPhotosColumnInfo = (TalkingPhotosColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TalkingPhotos.class);
        long j3 = talkingPhotosColumnInfo.idIndex;
        C4779x60c226d2 ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosrealmproxyinterface = talkingPhotos2;
        Integer valueOf = Integer.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosrealmproxyinterface.realmGet$id());
        if (valueOf != null) {
            j = Table.nativeFindFirstInt(nativePtr, j3, (long) ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosrealmproxyinterface.realmGet$id());
        } else {
            j = -1;
        }
        if (j == -1) {
            j2 = OsObject.createRowWithPrimaryKey(table, j3, Integer.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosrealmproxyinterface.realmGet$id()));
        } else {
            Table.throwDuplicatePrimaryKeyException(valueOf);
            j2 = j;
        }
        map2.put(talkingPhotos2, Long.valueOf(j2));
        String realmGet$name = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosrealmproxyinterface.realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(nativePtr, talkingPhotosColumnInfo.nameIndex, j2, realmGet$name, false);
        }
        TalkingPhotosFile realmGet$url = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosrealmproxyinterface.realmGet$url();
        if (realmGet$url != null) {
            Long l = map2.get(realmGet$url);
            if (l == null) {
                l = Long.valueOf(C4776x6ae644c3.insert(realm2, realmGet$url, map2));
            }
            Table.nativeSetLink(nativePtr, talkingPhotosColumnInfo.urlIndex, j2, l.longValue(), false);
        }
        return j2;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(TalkingPhotos.class);
        long nativePtr = table.getNativePtr();
        TalkingPhotosColumnInfo talkingPhotosColumnInfo = (TalkingPhotosColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TalkingPhotos.class);
        long j2 = talkingPhotosColumnInfo.idIndex;
        while (it.hasNext()) {
            TalkingPhotos talkingPhotos = (TalkingPhotos) it.next();
            if (!map2.containsKey(talkingPhotos)) {
                if (talkingPhotos instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) talkingPhotos;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(talkingPhotos, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                C4779x60c226d2 ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosrealmproxyinterface = talkingPhotos;
                Integer valueOf = Integer.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosrealmproxyinterface.realmGet$id());
                if (valueOf != null) {
                    j = Table.nativeFindFirstInt(nativePtr, j2, (long) ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosrealmproxyinterface.realmGet$id());
                } else {
                    j = -1;
                }
                if (j == -1) {
                    j = OsObject.createRowWithPrimaryKey(table, j2, Integer.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosrealmproxyinterface.realmGet$id()));
                } else {
                    Table.throwDuplicatePrimaryKeyException(valueOf);
                }
                long j3 = j;
                map2.put(talkingPhotos, Long.valueOf(j3));
                String realmGet$name = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosrealmproxyinterface.realmGet$name();
                if (realmGet$name != null) {
                    Table.nativeSetString(nativePtr, talkingPhotosColumnInfo.nameIndex, j3, realmGet$name, false);
                }
                TalkingPhotosFile realmGet$url = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosrealmproxyinterface.realmGet$url();
                if (realmGet$url != null) {
                    Long l = map2.get(realmGet$url);
                    if (l == null) {
                        l = Long.valueOf(C4776x6ae644c3.insert(realm2, realmGet$url, map2));
                    }
                    table.setLink(talkingPhotosColumnInfo.urlIndex, j3, l.longValue(), false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, TalkingPhotos talkingPhotos, Map<RealmModel, Long> map) {
        Realm realm2 = realm;
        TalkingPhotos talkingPhotos2 = talkingPhotos;
        Map<RealmModel, Long> map2 = map;
        if (talkingPhotos2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) talkingPhotos2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(TalkingPhotos.class);
        long nativePtr = table.getNativePtr();
        TalkingPhotosColumnInfo talkingPhotosColumnInfo = (TalkingPhotosColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TalkingPhotos.class);
        long j = talkingPhotosColumnInfo.idIndex;
        C4779x60c226d2 ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosrealmproxyinterface = talkingPhotos2;
        long nativeFindFirstInt = Integer.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosrealmproxyinterface.realmGet$id()) != null ? Table.nativeFindFirstInt(nativePtr, j, (long) ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosrealmproxyinterface.realmGet$id()) : -1;
        long createRowWithPrimaryKey = nativeFindFirstInt == -1 ? OsObject.createRowWithPrimaryKey(table, j, Integer.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosrealmproxyinterface.realmGet$id())) : nativeFindFirstInt;
        map2.put(talkingPhotos2, Long.valueOf(createRowWithPrimaryKey));
        String realmGet$name = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosrealmproxyinterface.realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(nativePtr, talkingPhotosColumnInfo.nameIndex, createRowWithPrimaryKey, realmGet$name, false);
        } else {
            Table.nativeSetNull(nativePtr, talkingPhotosColumnInfo.nameIndex, createRowWithPrimaryKey, false);
        }
        TalkingPhotosFile realmGet$url = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosrealmproxyinterface.realmGet$url();
        if (realmGet$url != null) {
            Long l = map2.get(realmGet$url);
            if (l == null) {
                l = Long.valueOf(C4776x6ae644c3.insertOrUpdate(realm2, realmGet$url, map2));
            }
            Table.nativeSetLink(nativePtr, talkingPhotosColumnInfo.urlIndex, createRowWithPrimaryKey, l.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, talkingPhotosColumnInfo.urlIndex, createRowWithPrimaryKey);
        }
        return createRowWithPrimaryKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(TalkingPhotos.class);
        long nativePtr = table.getNativePtr();
        TalkingPhotosColumnInfo talkingPhotosColumnInfo = (TalkingPhotosColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TalkingPhotos.class);
        long j3 = talkingPhotosColumnInfo.idIndex;
        while (it.hasNext()) {
            TalkingPhotos talkingPhotos = (TalkingPhotos) it.next();
            if (!map2.containsKey(talkingPhotos)) {
                if (talkingPhotos instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) talkingPhotos;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(talkingPhotos, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                C4779x60c226d2 ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosrealmproxyinterface = talkingPhotos;
                if (Integer.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosrealmproxyinterface.realmGet$id()) != null) {
                    j = Table.nativeFindFirstInt(nativePtr, j3, (long) ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosrealmproxyinterface.realmGet$id());
                } else {
                    j = -1;
                }
                if (j == -1) {
                    j = OsObject.createRowWithPrimaryKey(table, j3, Integer.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosrealmproxyinterface.realmGet$id()));
                }
                long j4 = j;
                map2.put(talkingPhotos, Long.valueOf(j4));
                String realmGet$name = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosrealmproxyinterface.realmGet$name();
                if (realmGet$name != null) {
                    j2 = j3;
                    Table.nativeSetString(nativePtr, talkingPhotosColumnInfo.nameIndex, j4, realmGet$name, false);
                } else {
                    j2 = j3;
                    Table.nativeSetNull(nativePtr, talkingPhotosColumnInfo.nameIndex, j4, false);
                }
                TalkingPhotosFile realmGet$url = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosrealmproxyinterface.realmGet$url();
                if (realmGet$url != null) {
                    Long l = map2.get(realmGet$url);
                    if (l == null) {
                        l = Long.valueOf(C4776x6ae644c3.insertOrUpdate(realm2, realmGet$url, map2));
                    }
                    Table.nativeSetLink(nativePtr, talkingPhotosColumnInfo.urlIndex, j4, l.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, talkingPhotosColumnInfo.urlIndex, j4);
                }
                j3 = j2;
            }
        }
    }

    public static TalkingPhotos createDetachedCopy(TalkingPhotos talkingPhotos, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        TalkingPhotos talkingPhotos2;
        if (i > i2 || talkingPhotos == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(talkingPhotos);
        if (cacheData == null) {
            talkingPhotos2 = new TalkingPhotos();
            map.put(talkingPhotos, new RealmObjectProxy.CacheData(i, talkingPhotos2));
        } else if (i >= cacheData.minDepth) {
            return (TalkingPhotos) cacheData.object;
        } else {
            cacheData.minDepth = i;
            talkingPhotos2 = (TalkingPhotos) cacheData.object;
        }
        C4779x60c226d2 ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosrealmproxyinterface = talkingPhotos2;
        C4779x60c226d2 ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosrealmproxyinterface2 = talkingPhotos;
        ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosrealmproxyinterface.realmSet$id(ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosrealmproxyinterface2.realmGet$id());
        ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosrealmproxyinterface.realmSet$name(ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosrealmproxyinterface2.realmGet$name());
        ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosrealmproxyinterface.realmSet$url(C4776x6ae644c3.createDetachedCopy(ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosrealmproxyinterface2.realmGet$url(), i + 1, i2, map));
        return talkingPhotos2;
    }

    static TalkingPhotos update(Realm realm, TalkingPhotosColumnInfo talkingPhotosColumnInfo, TalkingPhotos talkingPhotos, TalkingPhotos talkingPhotos2, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        C4779x60c226d2 ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosrealmproxyinterface = talkingPhotos;
        C4779x60c226d2 ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosrealmproxyinterface2 = talkingPhotos2;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(TalkingPhotos.class), talkingPhotosColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addInteger(talkingPhotosColumnInfo.idIndex, Integer.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosrealmproxyinterface2.realmGet$id()));
        osObjectBuilder.addString(talkingPhotosColumnInfo.nameIndex, ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosrealmproxyinterface2.realmGet$name());
        TalkingPhotosFile realmGet$url = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosrealmproxyinterface2.realmGet$url();
        if (realmGet$url == null) {
            osObjectBuilder.addNull(talkingPhotosColumnInfo.urlIndex);
        } else {
            TalkingPhotosFile talkingPhotosFile = (TalkingPhotosFile) map.get(realmGet$url);
            if (talkingPhotosFile != null) {
                osObjectBuilder.addObject(talkingPhotosColumnInfo.urlIndex, talkingPhotosFile);
            } else {
                osObjectBuilder.addObject(talkingPhotosColumnInfo.urlIndex, C4776x6ae644c3.copyOrUpdate(realm, (C4776x6ae644c3.TalkingPhotosFileColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TalkingPhotosFile.class), realmGet$url, true, map, set));
            }
        }
        osObjectBuilder.updateExistingObject();
        return talkingPhotos;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("TalkingPhotos = proxy[");
        sb.append("{id:");
        sb.append(realmGet$id());
        sb.append("}");
        sb.append(",");
        sb.append("{name:");
        String str = "null";
        sb.append(realmGet$name() != null ? realmGet$name() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{url:");
        if (realmGet$url() != null) {
            str = C4776x6ae644c3.ClassNameHelper.INTERNAL_CLASS_NAME;
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
        C4778x8713e227 ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosrealmproxy = (C4778x8713e227) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_talkingphotosrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
