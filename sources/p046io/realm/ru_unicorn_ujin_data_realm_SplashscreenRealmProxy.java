package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p035ru.unicorn.ujin.data.realm.Splashscreen;
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

/* renamed from: io.realm.ru_unicorn_ujin_data_realm_SplashscreenRealmProxy */
public class ru_unicorn_ujin_data_realm_SplashscreenRealmProxy extends Splashscreen implements RealmObjectProxy, ru_unicorn_ujin_data_realm_SplashscreenRealmProxyInterface {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private SplashscreenColumnInfo columnInfo;
    private ProxyState<Splashscreen> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_SplashscreenRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Splashscreen";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_SplashscreenRealmProxy$SplashscreenColumnInfo */
    static final class SplashscreenColumnInfo extends ColumnInfo {
        long backgroundUrlIndex;
        long complexIdIndex;
        long foregroundUrlIndex;
        long idIndex;
        long maxColumnIndexValue;
        long titleIndex;
        long tokenIndex;
        long toolbarUrlIndex;

        SplashscreenColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(7);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.titleIndex = addColumnDetails("title", "title", objectSchemaInfo);
            this.complexIdIndex = addColumnDetails("complexId", "complexId", objectSchemaInfo);
            this.backgroundUrlIndex = addColumnDetails("backgroundUrl", "backgroundUrl", objectSchemaInfo);
            this.foregroundUrlIndex = addColumnDetails("foregroundUrl", "foregroundUrl", objectSchemaInfo);
            this.toolbarUrlIndex = addColumnDetails("toolbarUrl", "toolbarUrl", objectSchemaInfo);
            this.tokenIndex = addColumnDetails("token", "token", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        SplashscreenColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new SplashscreenColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            SplashscreenColumnInfo splashscreenColumnInfo = (SplashscreenColumnInfo) columnInfo;
            SplashscreenColumnInfo splashscreenColumnInfo2 = (SplashscreenColumnInfo) columnInfo2;
            splashscreenColumnInfo2.idIndex = splashscreenColumnInfo.idIndex;
            splashscreenColumnInfo2.titleIndex = splashscreenColumnInfo.titleIndex;
            splashscreenColumnInfo2.complexIdIndex = splashscreenColumnInfo.complexIdIndex;
            splashscreenColumnInfo2.backgroundUrlIndex = splashscreenColumnInfo.backgroundUrlIndex;
            splashscreenColumnInfo2.foregroundUrlIndex = splashscreenColumnInfo.foregroundUrlIndex;
            splashscreenColumnInfo2.toolbarUrlIndex = splashscreenColumnInfo.toolbarUrlIndex;
            splashscreenColumnInfo2.tokenIndex = splashscreenColumnInfo.tokenIndex;
            splashscreenColumnInfo2.maxColumnIndexValue = splashscreenColumnInfo.maxColumnIndexValue;
        }
    }

    ru_unicorn_ujin_data_realm_SplashscreenRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (SplashscreenColumnInfo) realmObjectContext.getColumnInfo();
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

    public String realmGet$complexId() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.complexIdIndex);
    }

    public void realmSet$complexId(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.complexIdIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.complexIdIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.complexIdIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.complexIdIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$backgroundUrl() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.backgroundUrlIndex);
    }

    public void realmSet$backgroundUrl(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.backgroundUrlIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.backgroundUrlIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.backgroundUrlIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.backgroundUrlIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$foregroundUrl() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.foregroundUrlIndex);
    }

    public void realmSet$foregroundUrl(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.foregroundUrlIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.foregroundUrlIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.foregroundUrlIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.foregroundUrlIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$toolbarUrl() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.toolbarUrlIndex);
    }

    public void realmSet$toolbarUrl(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.toolbarUrlIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.toolbarUrlIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.toolbarUrlIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.toolbarUrlIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$token() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.tokenIndex);
    }

    public void realmSet$token(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.tokenIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.tokenIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.tokenIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.tokenIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 7, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("id", RealmFieldType.STRING, true, true, false);
        builder2.addPersistedProperty("title", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("complexId", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("backgroundUrl", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("foregroundUrl", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("toolbarUrl", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("token", RealmFieldType.STRING, false, false, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static SplashscreenColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new SplashscreenColumnInfo(osSchemaInfo);
    }

    /* JADX WARNING: type inference failed for: r12v4, types: [io.realm.RealmModel] */
    /* JADX WARNING: type inference failed for: r12v5, types: [io.realm.RealmModel] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x011e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.data.realm.Splashscreen createOrUpdateUsingJsonObject(p046io.realm.Realm r12, org.json.JSONObject r13, boolean r14) throws org.json.JSONException {
        /*
            java.util.List r0 = java.util.Collections.emptyList()
            java.lang.String r1 = "id"
            r2 = 0
            if (r14 == 0) goto L_0x0064
            java.lang.Class<ru.unicorn.ujin.data.realm.Splashscreen> r14 = p035ru.unicorn.ujin.data.realm.Splashscreen.class
            io.realm.internal.Table r14 = r12.getTable(r14)
            io.realm.RealmSchema r3 = r12.getSchema()
            java.lang.Class<ru.unicorn.ujin.data.realm.Splashscreen> r4 = p035ru.unicorn.ujin.data.realm.Splashscreen.class
            io.realm.internal.ColumnInfo r3 = r3.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r4)
            io.realm.ru_unicorn_ujin_data_realm_SplashscreenRealmProxy$SplashscreenColumnInfo r3 = (p046io.realm.ru_unicorn_ujin_data_realm_SplashscreenRealmProxy.SplashscreenColumnInfo) r3
            long r3 = r3.idIndex
            boolean r5 = r13.isNull(r1)
            if (r5 == 0) goto L_0x0028
            long r3 = r14.findFirstNull(r3)
            goto L_0x0030
        L_0x0028:
            java.lang.String r5 = r13.getString(r1)
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
            java.lang.Class<ru.unicorn.ujin.data.realm.Splashscreen> r3 = p035ru.unicorn.ujin.data.realm.Splashscreen.class
            io.realm.internal.ColumnInfo r9 = r14.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r3)     // Catch:{ all -> 0x005f }
            r10 = 0
            java.util.List r11 = java.util.Collections.emptyList()     // Catch:{ all -> 0x005f }
            r6 = r5
            r7 = r12
            r6.set(r7, r8, r9, r10, r11)     // Catch:{ all -> 0x005f }
            io.realm.ru_unicorn_ujin_data_realm_SplashscreenRealmProxy r14 = new io.realm.ru_unicorn_ujin_data_realm_SplashscreenRealmProxy     // Catch:{ all -> 0x005f }
            r14.<init>()     // Catch:{ all -> 0x005f }
            r5.clear()
            goto L_0x0065
        L_0x005f:
            r12 = move-exception
            r5.clear()
            throw r12
        L_0x0064:
            r14 = r2
        L_0x0065:
            if (r14 != 0) goto L_0x0094
            boolean r14 = r13.has(r1)
            if (r14 == 0) goto L_0x008c
            boolean r14 = r13.isNull(r1)
            r3 = 1
            if (r14 == 0) goto L_0x007e
            java.lang.Class<ru.unicorn.ujin.data.realm.Splashscreen> r14 = p035ru.unicorn.ujin.data.realm.Splashscreen.class
            io.realm.RealmModel r12 = r12.createObjectInternal(r14, r2, r3, r0)
            r14 = r12
            io.realm.ru_unicorn_ujin_data_realm_SplashscreenRealmProxy r14 = (p046io.realm.ru_unicorn_ujin_data_realm_SplashscreenRealmProxy) r14
            goto L_0x0094
        L_0x007e:
            java.lang.Class<ru.unicorn.ujin.data.realm.Splashscreen> r14 = p035ru.unicorn.ujin.data.realm.Splashscreen.class
            java.lang.String r1 = r13.getString(r1)
            io.realm.RealmModel r12 = r12.createObjectInternal(r14, r1, r3, r0)
            r14 = r12
            io.realm.ru_unicorn_ujin_data_realm_SplashscreenRealmProxy r14 = (p046io.realm.ru_unicorn_ujin_data_realm_SplashscreenRealmProxy) r14
            goto L_0x0094
        L_0x008c:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = "JSON object doesn't have the primary key field 'id'."
            r12.<init>(r13)
            throw r12
        L_0x0094:
            r12 = r14
            io.realm.ru_unicorn_ujin_data_realm_SplashscreenRealmProxyInterface r12 = (p046io.realm.ru_unicorn_ujin_data_realm_SplashscreenRealmProxyInterface) r12
            java.lang.String r0 = "title"
            boolean r1 = r13.has(r0)
            if (r1 == 0) goto L_0x00b0
            boolean r1 = r13.isNull(r0)
            if (r1 == 0) goto L_0x00a9
            r12.realmSet$title(r2)
            goto L_0x00b0
        L_0x00a9:
            java.lang.String r0 = r13.getString(r0)
            r12.realmSet$title(r0)
        L_0x00b0:
            java.lang.String r0 = "complexId"
            boolean r1 = r13.has(r0)
            if (r1 == 0) goto L_0x00c9
            boolean r1 = r13.isNull(r0)
            if (r1 == 0) goto L_0x00c2
            r12.realmSet$complexId(r2)
            goto L_0x00c9
        L_0x00c2:
            java.lang.String r0 = r13.getString(r0)
            r12.realmSet$complexId(r0)
        L_0x00c9:
            java.lang.String r0 = "backgroundUrl"
            boolean r1 = r13.has(r0)
            if (r1 == 0) goto L_0x00e2
            boolean r1 = r13.isNull(r0)
            if (r1 == 0) goto L_0x00db
            r12.realmSet$backgroundUrl(r2)
            goto L_0x00e2
        L_0x00db:
            java.lang.String r0 = r13.getString(r0)
            r12.realmSet$backgroundUrl(r0)
        L_0x00e2:
            java.lang.String r0 = "foregroundUrl"
            boolean r1 = r13.has(r0)
            if (r1 == 0) goto L_0x00fb
            boolean r1 = r13.isNull(r0)
            if (r1 == 0) goto L_0x00f4
            r12.realmSet$foregroundUrl(r2)
            goto L_0x00fb
        L_0x00f4:
            java.lang.String r0 = r13.getString(r0)
            r12.realmSet$foregroundUrl(r0)
        L_0x00fb:
            java.lang.String r0 = "toolbarUrl"
            boolean r1 = r13.has(r0)
            if (r1 == 0) goto L_0x0115
            boolean r1 = r13.isNull(r0)
            if (r1 == 0) goto L_0x010e
            r12.realmSet$toolbarUrl(r2)
            goto L_0x0115
        L_0x010e:
            java.lang.String r0 = r13.getString(r0)
            r12.realmSet$toolbarUrl(r0)
        L_0x0115:
            java.lang.String r0 = "token"
            boolean r1 = r13.has(r0)
            if (r1 == 0) goto L_0x012f
            boolean r1 = r13.isNull(r0)
            if (r1 == 0) goto L_0x0128
            r12.realmSet$token(r2)
            goto L_0x012f
        L_0x0128:
            java.lang.String r13 = r13.getString(r0)
            r12.realmSet$token(r13)
        L_0x012f:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.ru_unicorn_ujin_data_realm_SplashscreenRealmProxy.createOrUpdateUsingJsonObject(io.realm.Realm, org.json.JSONObject, boolean):ru.unicorn.ujin.data.realm.Splashscreen");
    }

    public static Splashscreen createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        Splashscreen splashscreen = new Splashscreen();
        ru_unicorn_ujin_data_realm_SplashscreenRealmProxyInterface ru_unicorn_ujin_data_realm_splashscreenrealmproxyinterface = splashscreen;
        jsonReader.beginObject();
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("id")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_splashscreenrealmproxyinterface.realmSet$id(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_splashscreenrealmproxyinterface.realmSet$id((String) null);
                }
                z = true;
            } else if (nextName.equals("title")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_splashscreenrealmproxyinterface.realmSet$title(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_splashscreenrealmproxyinterface.realmSet$title((String) null);
                }
            } else if (nextName.equals("complexId")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_splashscreenrealmproxyinterface.realmSet$complexId(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_splashscreenrealmproxyinterface.realmSet$complexId((String) null);
                }
            } else if (nextName.equals("backgroundUrl")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_splashscreenrealmproxyinterface.realmSet$backgroundUrl(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_splashscreenrealmproxyinterface.realmSet$backgroundUrl((String) null);
                }
            } else if (nextName.equals("foregroundUrl")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_splashscreenrealmproxyinterface.realmSet$foregroundUrl(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_splashscreenrealmproxyinterface.realmSet$foregroundUrl((String) null);
                }
            } else if (nextName.equals("toolbarUrl")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_splashscreenrealmproxyinterface.realmSet$toolbarUrl(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_splashscreenrealmproxyinterface.realmSet$toolbarUrl((String) null);
                }
            } else if (!nextName.equals("token")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_data_realm_splashscreenrealmproxyinterface.realmSet$token(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_data_realm_splashscreenrealmproxyinterface.realmSet$token((String) null);
            }
        }
        jsonReader.endObject();
        if (z) {
            return (Splashscreen) realm.copyToRealm(splashscreen, new ImportFlag[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
    }

    private static ru_unicorn_ujin_data_realm_SplashscreenRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) Splashscreen.class), false, Collections.emptyList());
        ru_unicorn_ujin_data_realm_SplashscreenRealmProxy ru_unicorn_ujin_data_realm_splashscreenrealmproxy = new ru_unicorn_ujin_data_realm_SplashscreenRealmProxy();
        realmObjectContext.clear();
        return ru_unicorn_ujin_data_realm_splashscreenrealmproxy;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.data.realm.Splashscreen copyOrUpdate(p046io.realm.Realm r8, p046io.realm.ru_unicorn_ujin_data_realm_SplashscreenRealmProxy.SplashscreenColumnInfo r9, p035ru.unicorn.ujin.data.realm.Splashscreen r10, boolean r11, java.util.Map<p046io.realm.RealmModel, p046io.realm.internal.RealmObjectProxy> r12, java.util.Set<p046io.realm.ImportFlag> r13) {
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
            ru.unicorn.ujin.data.realm.Splashscreen r1 = (p035ru.unicorn.ujin.data.realm.Splashscreen) r1
            return r1
        L_0x004b:
            r1 = 0
            if (r11 == 0) goto L_0x0093
            java.lang.Class<ru.unicorn.ujin.data.realm.Splashscreen> r2 = p035ru.unicorn.ujin.data.realm.Splashscreen.class
            io.realm.internal.Table r2 = r8.getTable(r2)
            long r3 = r9.idIndex
            r5 = r10
            io.realm.ru_unicorn_ujin_data_realm_SplashscreenRealmProxyInterface r5 = (p046io.realm.ru_unicorn_ujin_data_realm_SplashscreenRealmProxyInterface) r5
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
            io.realm.ru_unicorn_ujin_data_realm_SplashscreenRealmProxy r1 = new io.realm.ru_unicorn_ujin_data_realm_SplashscreenRealmProxy     // Catch:{ all -> 0x008e }
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
            ru.unicorn.ujin.data.realm.Splashscreen r8 = update(r1, r2, r3, r4, r5, r6)
            goto L_0x00a5
        L_0x00a1:
            ru.unicorn.ujin.data.realm.Splashscreen r8 = copy(r8, r9, r10, r11, r12, r13)
        L_0x00a5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.ru_unicorn_ujin_data_realm_SplashscreenRealmProxy.copyOrUpdate(io.realm.Realm, io.realm.ru_unicorn_ujin_data_realm_SplashscreenRealmProxy$SplashscreenColumnInfo, ru.unicorn.ujin.data.realm.Splashscreen, boolean, java.util.Map, java.util.Set):ru.unicorn.ujin.data.realm.Splashscreen");
    }

    public static Splashscreen copy(Realm realm, SplashscreenColumnInfo splashscreenColumnInfo, Splashscreen splashscreen, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(splashscreen);
        if (realmObjectProxy != null) {
            return (Splashscreen) realmObjectProxy;
        }
        ru_unicorn_ujin_data_realm_SplashscreenRealmProxyInterface ru_unicorn_ujin_data_realm_splashscreenrealmproxyinterface = splashscreen;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(Splashscreen.class), splashscreenColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(splashscreenColumnInfo.idIndex, ru_unicorn_ujin_data_realm_splashscreenrealmproxyinterface.realmGet$id());
        osObjectBuilder.addString(splashscreenColumnInfo.titleIndex, ru_unicorn_ujin_data_realm_splashscreenrealmproxyinterface.realmGet$title());
        osObjectBuilder.addString(splashscreenColumnInfo.complexIdIndex, ru_unicorn_ujin_data_realm_splashscreenrealmproxyinterface.realmGet$complexId());
        osObjectBuilder.addString(splashscreenColumnInfo.backgroundUrlIndex, ru_unicorn_ujin_data_realm_splashscreenrealmproxyinterface.realmGet$backgroundUrl());
        osObjectBuilder.addString(splashscreenColumnInfo.foregroundUrlIndex, ru_unicorn_ujin_data_realm_splashscreenrealmproxyinterface.realmGet$foregroundUrl());
        osObjectBuilder.addString(splashscreenColumnInfo.toolbarUrlIndex, ru_unicorn_ujin_data_realm_splashscreenrealmproxyinterface.realmGet$toolbarUrl());
        osObjectBuilder.addString(splashscreenColumnInfo.tokenIndex, ru_unicorn_ujin_data_realm_splashscreenrealmproxyinterface.realmGet$token());
        ru_unicorn_ujin_data_realm_SplashscreenRealmProxy newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(splashscreen, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, Splashscreen splashscreen, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Splashscreen splashscreen2 = splashscreen;
        if (splashscreen2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) splashscreen2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(Splashscreen.class);
        long nativePtr = table.getNativePtr();
        SplashscreenColumnInfo splashscreenColumnInfo = (SplashscreenColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Splashscreen.class);
        long j3 = splashscreenColumnInfo.idIndex;
        ru_unicorn_ujin_data_realm_SplashscreenRealmProxyInterface ru_unicorn_ujin_data_realm_splashscreenrealmproxyinterface = splashscreen2;
        String realmGet$id = ru_unicorn_ujin_data_realm_splashscreenrealmproxyinterface.realmGet$id();
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
        map.put(splashscreen2, Long.valueOf(j2));
        String realmGet$title = ru_unicorn_ujin_data_realm_splashscreenrealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, splashscreenColumnInfo.titleIndex, j2, realmGet$title, false);
        }
        String realmGet$complexId = ru_unicorn_ujin_data_realm_splashscreenrealmproxyinterface.realmGet$complexId();
        if (realmGet$complexId != null) {
            Table.nativeSetString(nativePtr, splashscreenColumnInfo.complexIdIndex, j2, realmGet$complexId, false);
        }
        String realmGet$backgroundUrl = ru_unicorn_ujin_data_realm_splashscreenrealmproxyinterface.realmGet$backgroundUrl();
        if (realmGet$backgroundUrl != null) {
            Table.nativeSetString(nativePtr, splashscreenColumnInfo.backgroundUrlIndex, j2, realmGet$backgroundUrl, false);
        }
        String realmGet$foregroundUrl = ru_unicorn_ujin_data_realm_splashscreenrealmproxyinterface.realmGet$foregroundUrl();
        if (realmGet$foregroundUrl != null) {
            Table.nativeSetString(nativePtr, splashscreenColumnInfo.foregroundUrlIndex, j2, realmGet$foregroundUrl, false);
        }
        String realmGet$toolbarUrl = ru_unicorn_ujin_data_realm_splashscreenrealmproxyinterface.realmGet$toolbarUrl();
        if (realmGet$toolbarUrl != null) {
            Table.nativeSetString(nativePtr, splashscreenColumnInfo.toolbarUrlIndex, j2, realmGet$toolbarUrl, false);
        }
        String realmGet$token = ru_unicorn_ujin_data_realm_splashscreenrealmproxyinterface.realmGet$token();
        if (realmGet$token != null) {
            Table.nativeSetString(nativePtr, splashscreenColumnInfo.tokenIndex, j2, realmGet$token, false);
        }
        return j2;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(Splashscreen.class);
        long nativePtr = table.getNativePtr();
        SplashscreenColumnInfo splashscreenColumnInfo = (SplashscreenColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Splashscreen.class);
        long j3 = splashscreenColumnInfo.idIndex;
        while (it.hasNext()) {
            Splashscreen splashscreen = (Splashscreen) it.next();
            if (!map2.containsKey(splashscreen)) {
                if (splashscreen instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) splashscreen;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(splashscreen, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                ru_unicorn_ujin_data_realm_SplashscreenRealmProxyInterface ru_unicorn_ujin_data_realm_splashscreenrealmproxyinterface = splashscreen;
                String realmGet$id = ru_unicorn_ujin_data_realm_splashscreenrealmproxyinterface.realmGet$id();
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
                map2.put(splashscreen, Long.valueOf(j2));
                String realmGet$title = ru_unicorn_ujin_data_realm_splashscreenrealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    Table.nativeSetString(nativePtr, splashscreenColumnInfo.titleIndex, j2, realmGet$title, false);
                }
                String realmGet$complexId = ru_unicorn_ujin_data_realm_splashscreenrealmproxyinterface.realmGet$complexId();
                if (realmGet$complexId != null) {
                    Table.nativeSetString(nativePtr, splashscreenColumnInfo.complexIdIndex, j2, realmGet$complexId, false);
                }
                String realmGet$backgroundUrl = ru_unicorn_ujin_data_realm_splashscreenrealmproxyinterface.realmGet$backgroundUrl();
                if (realmGet$backgroundUrl != null) {
                    Table.nativeSetString(nativePtr, splashscreenColumnInfo.backgroundUrlIndex, j2, realmGet$backgroundUrl, false);
                }
                String realmGet$foregroundUrl = ru_unicorn_ujin_data_realm_splashscreenrealmproxyinterface.realmGet$foregroundUrl();
                if (realmGet$foregroundUrl != null) {
                    Table.nativeSetString(nativePtr, splashscreenColumnInfo.foregroundUrlIndex, j2, realmGet$foregroundUrl, false);
                }
                String realmGet$toolbarUrl = ru_unicorn_ujin_data_realm_splashscreenrealmproxyinterface.realmGet$toolbarUrl();
                if (realmGet$toolbarUrl != null) {
                    Table.nativeSetString(nativePtr, splashscreenColumnInfo.toolbarUrlIndex, j2, realmGet$toolbarUrl, false);
                }
                String realmGet$token = ru_unicorn_ujin_data_realm_splashscreenrealmproxyinterface.realmGet$token();
                if (realmGet$token != null) {
                    Table.nativeSetString(nativePtr, splashscreenColumnInfo.tokenIndex, j2, realmGet$token, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, Splashscreen splashscreen, Map<RealmModel, Long> map) {
        long j;
        Splashscreen splashscreen2 = splashscreen;
        if (splashscreen2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) splashscreen2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(Splashscreen.class);
        long nativePtr = table.getNativePtr();
        SplashscreenColumnInfo splashscreenColumnInfo = (SplashscreenColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Splashscreen.class);
        long j2 = splashscreenColumnInfo.idIndex;
        ru_unicorn_ujin_data_realm_SplashscreenRealmProxyInterface ru_unicorn_ujin_data_realm_splashscreenrealmproxyinterface = splashscreen2;
        String realmGet$id = ru_unicorn_ujin_data_realm_splashscreenrealmproxyinterface.realmGet$id();
        if (realmGet$id == null) {
            j = Table.nativeFindFirstNull(nativePtr, j2);
        } else {
            j = Table.nativeFindFirstString(nativePtr, j2, realmGet$id);
        }
        long createRowWithPrimaryKey = j == -1 ? OsObject.createRowWithPrimaryKey(table, j2, realmGet$id) : j;
        map.put(splashscreen2, Long.valueOf(createRowWithPrimaryKey));
        String realmGet$title = ru_unicorn_ujin_data_realm_splashscreenrealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, splashscreenColumnInfo.titleIndex, createRowWithPrimaryKey, realmGet$title, false);
        } else {
            Table.nativeSetNull(nativePtr, splashscreenColumnInfo.titleIndex, createRowWithPrimaryKey, false);
        }
        String realmGet$complexId = ru_unicorn_ujin_data_realm_splashscreenrealmproxyinterface.realmGet$complexId();
        if (realmGet$complexId != null) {
            Table.nativeSetString(nativePtr, splashscreenColumnInfo.complexIdIndex, createRowWithPrimaryKey, realmGet$complexId, false);
        } else {
            Table.nativeSetNull(nativePtr, splashscreenColumnInfo.complexIdIndex, createRowWithPrimaryKey, false);
        }
        String realmGet$backgroundUrl = ru_unicorn_ujin_data_realm_splashscreenrealmproxyinterface.realmGet$backgroundUrl();
        if (realmGet$backgroundUrl != null) {
            Table.nativeSetString(nativePtr, splashscreenColumnInfo.backgroundUrlIndex, createRowWithPrimaryKey, realmGet$backgroundUrl, false);
        } else {
            Table.nativeSetNull(nativePtr, splashscreenColumnInfo.backgroundUrlIndex, createRowWithPrimaryKey, false);
        }
        String realmGet$foregroundUrl = ru_unicorn_ujin_data_realm_splashscreenrealmproxyinterface.realmGet$foregroundUrl();
        if (realmGet$foregroundUrl != null) {
            Table.nativeSetString(nativePtr, splashscreenColumnInfo.foregroundUrlIndex, createRowWithPrimaryKey, realmGet$foregroundUrl, false);
        } else {
            Table.nativeSetNull(nativePtr, splashscreenColumnInfo.foregroundUrlIndex, createRowWithPrimaryKey, false);
        }
        String realmGet$toolbarUrl = ru_unicorn_ujin_data_realm_splashscreenrealmproxyinterface.realmGet$toolbarUrl();
        if (realmGet$toolbarUrl != null) {
            Table.nativeSetString(nativePtr, splashscreenColumnInfo.toolbarUrlIndex, createRowWithPrimaryKey, realmGet$toolbarUrl, false);
        } else {
            Table.nativeSetNull(nativePtr, splashscreenColumnInfo.toolbarUrlIndex, createRowWithPrimaryKey, false);
        }
        String realmGet$token = ru_unicorn_ujin_data_realm_splashscreenrealmproxyinterface.realmGet$token();
        if (realmGet$token != null) {
            Table.nativeSetString(nativePtr, splashscreenColumnInfo.tokenIndex, createRowWithPrimaryKey, realmGet$token, false);
        } else {
            Table.nativeSetNull(nativePtr, splashscreenColumnInfo.tokenIndex, createRowWithPrimaryKey, false);
        }
        return createRowWithPrimaryKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(Splashscreen.class);
        long nativePtr = table.getNativePtr();
        SplashscreenColumnInfo splashscreenColumnInfo = (SplashscreenColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Splashscreen.class);
        long j2 = splashscreenColumnInfo.idIndex;
        while (it.hasNext()) {
            Splashscreen splashscreen = (Splashscreen) it.next();
            if (!map2.containsKey(splashscreen)) {
                if (splashscreen instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) splashscreen;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(splashscreen, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                ru_unicorn_ujin_data_realm_SplashscreenRealmProxyInterface ru_unicorn_ujin_data_realm_splashscreenrealmproxyinterface = splashscreen;
                String realmGet$id = ru_unicorn_ujin_data_realm_splashscreenrealmproxyinterface.realmGet$id();
                if (realmGet$id == null) {
                    j = Table.nativeFindFirstNull(nativePtr, j2);
                } else {
                    j = Table.nativeFindFirstString(nativePtr, j2, realmGet$id);
                }
                long createRowWithPrimaryKey = j == -1 ? OsObject.createRowWithPrimaryKey(table, j2, realmGet$id) : j;
                map2.put(splashscreen, Long.valueOf(createRowWithPrimaryKey));
                String realmGet$title = ru_unicorn_ujin_data_realm_splashscreenrealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    Table.nativeSetString(nativePtr, splashscreenColumnInfo.titleIndex, createRowWithPrimaryKey, realmGet$title, false);
                } else {
                    Table.nativeSetNull(nativePtr, splashscreenColumnInfo.titleIndex, createRowWithPrimaryKey, false);
                }
                String realmGet$complexId = ru_unicorn_ujin_data_realm_splashscreenrealmproxyinterface.realmGet$complexId();
                if (realmGet$complexId != null) {
                    Table.nativeSetString(nativePtr, splashscreenColumnInfo.complexIdIndex, createRowWithPrimaryKey, realmGet$complexId, false);
                } else {
                    Table.nativeSetNull(nativePtr, splashscreenColumnInfo.complexIdIndex, createRowWithPrimaryKey, false);
                }
                String realmGet$backgroundUrl = ru_unicorn_ujin_data_realm_splashscreenrealmproxyinterface.realmGet$backgroundUrl();
                if (realmGet$backgroundUrl != null) {
                    Table.nativeSetString(nativePtr, splashscreenColumnInfo.backgroundUrlIndex, createRowWithPrimaryKey, realmGet$backgroundUrl, false);
                } else {
                    Table.nativeSetNull(nativePtr, splashscreenColumnInfo.backgroundUrlIndex, createRowWithPrimaryKey, false);
                }
                String realmGet$foregroundUrl = ru_unicorn_ujin_data_realm_splashscreenrealmproxyinterface.realmGet$foregroundUrl();
                if (realmGet$foregroundUrl != null) {
                    Table.nativeSetString(nativePtr, splashscreenColumnInfo.foregroundUrlIndex, createRowWithPrimaryKey, realmGet$foregroundUrl, false);
                } else {
                    Table.nativeSetNull(nativePtr, splashscreenColumnInfo.foregroundUrlIndex, createRowWithPrimaryKey, false);
                }
                String realmGet$toolbarUrl = ru_unicorn_ujin_data_realm_splashscreenrealmproxyinterface.realmGet$toolbarUrl();
                if (realmGet$toolbarUrl != null) {
                    Table.nativeSetString(nativePtr, splashscreenColumnInfo.toolbarUrlIndex, createRowWithPrimaryKey, realmGet$toolbarUrl, false);
                } else {
                    Table.nativeSetNull(nativePtr, splashscreenColumnInfo.toolbarUrlIndex, createRowWithPrimaryKey, false);
                }
                String realmGet$token = ru_unicorn_ujin_data_realm_splashscreenrealmproxyinterface.realmGet$token();
                if (realmGet$token != null) {
                    Table.nativeSetString(nativePtr, splashscreenColumnInfo.tokenIndex, createRowWithPrimaryKey, realmGet$token, false);
                } else {
                    Table.nativeSetNull(nativePtr, splashscreenColumnInfo.tokenIndex, createRowWithPrimaryKey, false);
                }
            }
        }
    }

    public static Splashscreen createDetachedCopy(Splashscreen splashscreen, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        Splashscreen splashscreen2;
        if (i > i2 || splashscreen == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(splashscreen);
        if (cacheData == null) {
            splashscreen2 = new Splashscreen();
            map.put(splashscreen, new RealmObjectProxy.CacheData(i, splashscreen2));
        } else if (i >= cacheData.minDepth) {
            return (Splashscreen) cacheData.object;
        } else {
            cacheData.minDepth = i;
            splashscreen2 = (Splashscreen) cacheData.object;
        }
        ru_unicorn_ujin_data_realm_SplashscreenRealmProxyInterface ru_unicorn_ujin_data_realm_splashscreenrealmproxyinterface = splashscreen2;
        ru_unicorn_ujin_data_realm_SplashscreenRealmProxyInterface ru_unicorn_ujin_data_realm_splashscreenrealmproxyinterface2 = splashscreen;
        ru_unicorn_ujin_data_realm_splashscreenrealmproxyinterface.realmSet$id(ru_unicorn_ujin_data_realm_splashscreenrealmproxyinterface2.realmGet$id());
        ru_unicorn_ujin_data_realm_splashscreenrealmproxyinterface.realmSet$title(ru_unicorn_ujin_data_realm_splashscreenrealmproxyinterface2.realmGet$title());
        ru_unicorn_ujin_data_realm_splashscreenrealmproxyinterface.realmSet$complexId(ru_unicorn_ujin_data_realm_splashscreenrealmproxyinterface2.realmGet$complexId());
        ru_unicorn_ujin_data_realm_splashscreenrealmproxyinterface.realmSet$backgroundUrl(ru_unicorn_ujin_data_realm_splashscreenrealmproxyinterface2.realmGet$backgroundUrl());
        ru_unicorn_ujin_data_realm_splashscreenrealmproxyinterface.realmSet$foregroundUrl(ru_unicorn_ujin_data_realm_splashscreenrealmproxyinterface2.realmGet$foregroundUrl());
        ru_unicorn_ujin_data_realm_splashscreenrealmproxyinterface.realmSet$toolbarUrl(ru_unicorn_ujin_data_realm_splashscreenrealmproxyinterface2.realmGet$toolbarUrl());
        ru_unicorn_ujin_data_realm_splashscreenrealmproxyinterface.realmSet$token(ru_unicorn_ujin_data_realm_splashscreenrealmproxyinterface2.realmGet$token());
        return splashscreen2;
    }

    static Splashscreen update(Realm realm, SplashscreenColumnInfo splashscreenColumnInfo, Splashscreen splashscreen, Splashscreen splashscreen2, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        ru_unicorn_ujin_data_realm_SplashscreenRealmProxyInterface ru_unicorn_ujin_data_realm_splashscreenrealmproxyinterface = splashscreen;
        ru_unicorn_ujin_data_realm_SplashscreenRealmProxyInterface ru_unicorn_ujin_data_realm_splashscreenrealmproxyinterface2 = splashscreen2;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(Splashscreen.class), splashscreenColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(splashscreenColumnInfo.idIndex, ru_unicorn_ujin_data_realm_splashscreenrealmproxyinterface2.realmGet$id());
        osObjectBuilder.addString(splashscreenColumnInfo.titleIndex, ru_unicorn_ujin_data_realm_splashscreenrealmproxyinterface2.realmGet$title());
        osObjectBuilder.addString(splashscreenColumnInfo.complexIdIndex, ru_unicorn_ujin_data_realm_splashscreenrealmproxyinterface2.realmGet$complexId());
        osObjectBuilder.addString(splashscreenColumnInfo.backgroundUrlIndex, ru_unicorn_ujin_data_realm_splashscreenrealmproxyinterface2.realmGet$backgroundUrl());
        osObjectBuilder.addString(splashscreenColumnInfo.foregroundUrlIndex, ru_unicorn_ujin_data_realm_splashscreenrealmproxyinterface2.realmGet$foregroundUrl());
        osObjectBuilder.addString(splashscreenColumnInfo.toolbarUrlIndex, ru_unicorn_ujin_data_realm_splashscreenrealmproxyinterface2.realmGet$toolbarUrl());
        osObjectBuilder.addString(splashscreenColumnInfo.tokenIndex, ru_unicorn_ujin_data_realm_splashscreenrealmproxyinterface2.realmGet$token());
        osObjectBuilder.updateExistingObject();
        return splashscreen;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("Splashscreen = proxy[");
        sb.append("{id:");
        String str = "null";
        sb.append(realmGet$id() != null ? realmGet$id() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{title:");
        sb.append(realmGet$title() != null ? realmGet$title() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{complexId:");
        sb.append(realmGet$complexId() != null ? realmGet$complexId() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{backgroundUrl:");
        sb.append(realmGet$backgroundUrl() != null ? realmGet$backgroundUrl() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{foregroundUrl:");
        sb.append(realmGet$foregroundUrl() != null ? realmGet$foregroundUrl() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{toolbarUrl:");
        sb.append(realmGet$toolbarUrl() != null ? realmGet$toolbarUrl() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{token:");
        if (realmGet$token() != null) {
            str = realmGet$token();
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
        ru_unicorn_ujin_data_realm_SplashscreenRealmProxy ru_unicorn_ujin_data_realm_splashscreenrealmproxy = (ru_unicorn_ujin_data_realm_SplashscreenRealmProxy) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_data_realm_splashscreenrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_data_realm_splashscreenrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_data_realm_splashscreenrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
