package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p035ru.unicorn.ujin.view.fragments.makearecord.model.ExecutorsIn;
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

/* renamed from: io.realm.ru_unicorn_ujin_view_fragments_makearecord_model_ExecutorsInRealmProxy */
public class C4820x447e431f extends ExecutorsIn implements RealmObjectProxy, C4821x4c295cda {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private ExecutorsInColumnInfo columnInfo;
    private ProxyState<ExecutorsIn> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_view_fragments_makearecord_model_ExecutorsInRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "ExecutorsIn";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_view_fragments_makearecord_model_ExecutorsInRealmProxy$ExecutorsInColumnInfo */
    static final class ExecutorsInColumnInfo extends ColumnInfo {
        long descriptionIndex;
        long idIndex;
        long maxColumnIndexValue;
        long titleIndex;

        ExecutorsInColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(3);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.titleIndex = addColumnDetails("title", "title", objectSchemaInfo);
            this.descriptionIndex = addColumnDetails("description", "description", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        ExecutorsInColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new ExecutorsInColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            ExecutorsInColumnInfo executorsInColumnInfo = (ExecutorsInColumnInfo) columnInfo;
            ExecutorsInColumnInfo executorsInColumnInfo2 = (ExecutorsInColumnInfo) columnInfo2;
            executorsInColumnInfo2.idIndex = executorsInColumnInfo.idIndex;
            executorsInColumnInfo2.titleIndex = executorsInColumnInfo.titleIndex;
            executorsInColumnInfo2.descriptionIndex = executorsInColumnInfo.descriptionIndex;
            executorsInColumnInfo2.maxColumnIndexValue = executorsInColumnInfo.maxColumnIndexValue;
        }
    }

    C4820x447e431f() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (ExecutorsInColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public Integer realmGet$id() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.idIndex)) {
            return null;
        }
        return Integer.valueOf((int) this.proxyState.getRow$realm().getLong(this.columnInfo.idIndex));
    }

    public void realmSet$id(Integer num) {
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

    public String realmGet$description() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.descriptionIndex);
    }

    public void realmSet$description(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.descriptionIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.descriptionIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.descriptionIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.descriptionIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 3, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("id", RealmFieldType.INTEGER, true, true, false);
        builder2.addPersistedProperty("title", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("description", RealmFieldType.STRING, false, false, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static ExecutorsInColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new ExecutorsInColumnInfo(osSchemaInfo);
    }

    /* JADX WARNING: type inference failed for: r12v4, types: [io.realm.RealmModel] */
    /* JADX WARNING: type inference failed for: r12v5, types: [io.realm.RealmModel] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00bc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.view.fragments.makearecord.model.ExecutorsIn createOrUpdateUsingJsonObject(p046io.realm.Realm r12, org.json.JSONObject r13, boolean r14) throws org.json.JSONException {
        /*
            java.util.List r0 = java.util.Collections.emptyList()
            r1 = 0
            java.lang.String r2 = "id"
            if (r14 == 0) goto L_0x0064
            java.lang.Class<ru.unicorn.ujin.view.fragments.makearecord.model.ExecutorsIn> r14 = p035ru.unicorn.ujin.view.fragments.makearecord.model.ExecutorsIn.class
            io.realm.internal.Table r14 = r12.getTable(r14)
            io.realm.RealmSchema r3 = r12.getSchema()
            java.lang.Class<ru.unicorn.ujin.view.fragments.makearecord.model.ExecutorsIn> r4 = p035ru.unicorn.ujin.view.fragments.makearecord.model.ExecutorsIn.class
            io.realm.internal.ColumnInfo r3 = r3.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r4)
            io.realm.ru_unicorn_ujin_view_fragments_makearecord_model_ExecutorsInRealmProxy$ExecutorsInColumnInfo r3 = (p046io.realm.C4820x447e431f.ExecutorsInColumnInfo) r3
            long r3 = r3.idIndex
            boolean r5 = r13.isNull(r2)
            if (r5 == 0) goto L_0x0028
            long r3 = r14.findFirstNull(r3)
            goto L_0x0030
        L_0x0028:
            long r5 = r13.getLong(r2)
            long r3 = r14.findFirstLong(r3, r5)
        L_0x0030:
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0064
            io.realm.BaseRealm$ThreadLocalRealmObjectContext r5 = p046io.realm.BaseRealm.objectContext
            java.lang.Object r5 = r5.get()
            io.realm.BaseRealm$RealmObjectContext r5 = (p046io.realm.BaseRealm.RealmObjectContext) r5
            io.realm.internal.UncheckedRow r8 = r14.getUncheckedRow(r3)     // Catch:{ all -> 0x005f }
            io.realm.RealmSchema r14 = r12.getSchema()     // Catch:{ all -> 0x005f }
            java.lang.Class<ru.unicorn.ujin.view.fragments.makearecord.model.ExecutorsIn> r3 = p035ru.unicorn.ujin.view.fragments.makearecord.model.ExecutorsIn.class
            io.realm.internal.ColumnInfo r9 = r14.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r3)     // Catch:{ all -> 0x005f }
            r10 = 0
            java.util.List r11 = java.util.Collections.emptyList()     // Catch:{ all -> 0x005f }
            r6 = r5
            r7 = r12
            r6.set(r7, r8, r9, r10, r11)     // Catch:{ all -> 0x005f }
            io.realm.ru_unicorn_ujin_view_fragments_makearecord_model_ExecutorsInRealmProxy r14 = new io.realm.ru_unicorn_ujin_view_fragments_makearecord_model_ExecutorsInRealmProxy     // Catch:{ all -> 0x005f }
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
            if (r14 != 0) goto L_0x0098
            boolean r14 = r13.has(r2)
            if (r14 == 0) goto L_0x0090
            boolean r14 = r13.isNull(r2)
            r3 = 1
            if (r14 == 0) goto L_0x007e
            java.lang.Class<ru.unicorn.ujin.view.fragments.makearecord.model.ExecutorsIn> r14 = p035ru.unicorn.ujin.view.fragments.makearecord.model.ExecutorsIn.class
            io.realm.RealmModel r12 = r12.createObjectInternal(r14, r1, r3, r0)
            r14 = r12
            io.realm.ru_unicorn_ujin_view_fragments_makearecord_model_ExecutorsInRealmProxy r14 = (p046io.realm.C4820x447e431f) r14
            goto L_0x0098
        L_0x007e:
            java.lang.Class<ru.unicorn.ujin.view.fragments.makearecord.model.ExecutorsIn> r14 = p035ru.unicorn.ujin.view.fragments.makearecord.model.ExecutorsIn.class
            int r2 = r13.getInt(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            io.realm.RealmModel r12 = r12.createObjectInternal(r14, r2, r3, r0)
            r14 = r12
            io.realm.ru_unicorn_ujin_view_fragments_makearecord_model_ExecutorsInRealmProxy r14 = (p046io.realm.C4820x447e431f) r14
            goto L_0x0098
        L_0x0090:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = "JSON object doesn't have the primary key field 'id'."
            r12.<init>(r13)
            throw r12
        L_0x0098:
            r12 = r14
            io.realm.ru_unicorn_ujin_view_fragments_makearecord_model_ExecutorsInRealmProxyInterface r12 = (p046io.realm.C4821x4c295cda) r12
            java.lang.String r0 = "title"
            boolean r2 = r13.has(r0)
            if (r2 == 0) goto L_0x00b4
            boolean r2 = r13.isNull(r0)
            if (r2 == 0) goto L_0x00ad
            r12.realmSet$title(r1)
            goto L_0x00b4
        L_0x00ad:
            java.lang.String r0 = r13.getString(r0)
            r12.realmSet$title(r0)
        L_0x00b4:
            java.lang.String r0 = "description"
            boolean r2 = r13.has(r0)
            if (r2 == 0) goto L_0x00cd
            boolean r2 = r13.isNull(r0)
            if (r2 == 0) goto L_0x00c6
            r12.realmSet$description(r1)
            goto L_0x00cd
        L_0x00c6:
            java.lang.String r13 = r13.getString(r0)
            r12.realmSet$description(r13)
        L_0x00cd:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.C4820x447e431f.createOrUpdateUsingJsonObject(io.realm.Realm, org.json.JSONObject, boolean):ru.unicorn.ujin.view.fragments.makearecord.model.ExecutorsIn");
    }

    public static ExecutorsIn createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        ExecutorsIn executorsIn = new ExecutorsIn();
        C4821x4c295cda ru_unicorn_ujin_view_fragments_makearecord_model_executorsinrealmproxyinterface = executorsIn;
        jsonReader.beginObject();
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("id")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_fragments_makearecord_model_executorsinrealmproxyinterface.realmSet$id(Integer.valueOf(jsonReader.nextInt()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_fragments_makearecord_model_executorsinrealmproxyinterface.realmSet$id((Integer) null);
                }
                z = true;
            } else if (nextName.equals("title")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_fragments_makearecord_model_executorsinrealmproxyinterface.realmSet$title(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_fragments_makearecord_model_executorsinrealmproxyinterface.realmSet$title((String) null);
                }
            } else if (!nextName.equals("description")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_view_fragments_makearecord_model_executorsinrealmproxyinterface.realmSet$description(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_view_fragments_makearecord_model_executorsinrealmproxyinterface.realmSet$description((String) null);
            }
        }
        jsonReader.endObject();
        if (z) {
            return (ExecutorsIn) realm.copyToRealm(executorsIn, new ImportFlag[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
    }

    private static C4820x447e431f newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) ExecutorsIn.class), false, Collections.emptyList());
        C4820x447e431f ru_unicorn_ujin_view_fragments_makearecord_model_executorsinrealmproxy = new C4820x447e431f();
        realmObjectContext.clear();
        return ru_unicorn_ujin_view_fragments_makearecord_model_executorsinrealmproxy;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.view.fragments.makearecord.model.ExecutorsIn copyOrUpdate(p046io.realm.Realm r8, p046io.realm.C4820x447e431f.ExecutorsInColumnInfo r9, p035ru.unicorn.ujin.view.fragments.makearecord.model.ExecutorsIn r10, boolean r11, java.util.Map<p046io.realm.RealmModel, p046io.realm.internal.RealmObjectProxy> r12, java.util.Set<p046io.realm.ImportFlag> r13) {
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
            ru.unicorn.ujin.view.fragments.makearecord.model.ExecutorsIn r1 = (p035ru.unicorn.ujin.view.fragments.makearecord.model.ExecutorsIn) r1
            return r1
        L_0x004b:
            r1 = 0
            if (r11 == 0) goto L_0x0097
            java.lang.Class<ru.unicorn.ujin.view.fragments.makearecord.model.ExecutorsIn> r2 = p035ru.unicorn.ujin.view.fragments.makearecord.model.ExecutorsIn.class
            io.realm.internal.Table r2 = r8.getTable(r2)
            long r3 = r9.idIndex
            r5 = r10
            io.realm.ru_unicorn_ujin_view_fragments_makearecord_model_ExecutorsInRealmProxyInterface r5 = (p046io.realm.C4821x4c295cda) r5
            java.lang.Integer r5 = r5.realmGet$id()
            if (r5 != 0) goto L_0x0064
            long r3 = r2.findFirstNull(r3)
            goto L_0x006c
        L_0x0064:
            long r5 = r5.longValue()
            long r3 = r2.findFirstLong(r3, r5)
        L_0x006c:
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0074
            r0 = 0
            goto L_0x0098
        L_0x0074:
            io.realm.internal.UncheckedRow r3 = r2.getUncheckedRow(r3)     // Catch:{ all -> 0x0092 }
            r5 = 0
            java.util.List r6 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0092 }
            r1 = r0
            r2 = r8
            r4 = r9
            r1.set(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0092 }
            io.realm.ru_unicorn_ujin_view_fragments_makearecord_model_ExecutorsInRealmProxy r1 = new io.realm.ru_unicorn_ujin_view_fragments_makearecord_model_ExecutorsInRealmProxy     // Catch:{ all -> 0x0092 }
            r1.<init>()     // Catch:{ all -> 0x0092 }
            r2 = r1
            io.realm.internal.RealmObjectProxy r2 = (p046io.realm.internal.RealmObjectProxy) r2     // Catch:{ all -> 0x0092 }
            r12.put(r10, r2)     // Catch:{ all -> 0x0092 }
            r0.clear()
            goto L_0x0097
        L_0x0092:
            r8 = move-exception
            r0.clear()
            throw r8
        L_0x0097:
            r0 = r11
        L_0x0098:
            r3 = r1
            if (r0 == 0) goto L_0x00a5
            r1 = r8
            r2 = r9
            r4 = r10
            r5 = r12
            r6 = r13
            ru.unicorn.ujin.view.fragments.makearecord.model.ExecutorsIn r8 = update(r1, r2, r3, r4, r5, r6)
            goto L_0x00a9
        L_0x00a5:
            ru.unicorn.ujin.view.fragments.makearecord.model.ExecutorsIn r8 = copy(r8, r9, r10, r11, r12, r13)
        L_0x00a9:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.C4820x447e431f.copyOrUpdate(io.realm.Realm, io.realm.ru_unicorn_ujin_view_fragments_makearecord_model_ExecutorsInRealmProxy$ExecutorsInColumnInfo, ru.unicorn.ujin.view.fragments.makearecord.model.ExecutorsIn, boolean, java.util.Map, java.util.Set):ru.unicorn.ujin.view.fragments.makearecord.model.ExecutorsIn");
    }

    public static ExecutorsIn copy(Realm realm, ExecutorsInColumnInfo executorsInColumnInfo, ExecutorsIn executorsIn, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(executorsIn);
        if (realmObjectProxy != null) {
            return (ExecutorsIn) realmObjectProxy;
        }
        C4821x4c295cda ru_unicorn_ujin_view_fragments_makearecord_model_executorsinrealmproxyinterface = executorsIn;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(ExecutorsIn.class), executorsInColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addInteger(executorsInColumnInfo.idIndex, ru_unicorn_ujin_view_fragments_makearecord_model_executorsinrealmproxyinterface.realmGet$id());
        osObjectBuilder.addString(executorsInColumnInfo.titleIndex, ru_unicorn_ujin_view_fragments_makearecord_model_executorsinrealmproxyinterface.realmGet$title());
        osObjectBuilder.addString(executorsInColumnInfo.descriptionIndex, ru_unicorn_ujin_view_fragments_makearecord_model_executorsinrealmproxyinterface.realmGet$description());
        C4820x447e431f newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(executorsIn, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, ExecutorsIn executorsIn, Map<RealmModel, Long> map) {
        long j;
        long j2;
        ExecutorsIn executorsIn2 = executorsIn;
        if (executorsIn2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) executorsIn2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(ExecutorsIn.class);
        long nativePtr = table.getNativePtr();
        ExecutorsInColumnInfo executorsInColumnInfo = (ExecutorsInColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ExecutorsIn.class);
        long j3 = executorsInColumnInfo.idIndex;
        C4821x4c295cda ru_unicorn_ujin_view_fragments_makearecord_model_executorsinrealmproxyinterface = executorsIn2;
        Integer realmGet$id = ru_unicorn_ujin_view_fragments_makearecord_model_executorsinrealmproxyinterface.realmGet$id();
        if (realmGet$id == null) {
            j = Table.nativeFindFirstNull(nativePtr, j3);
        } else {
            j = Table.nativeFindFirstInt(nativePtr, j3, (long) ru_unicorn_ujin_view_fragments_makearecord_model_executorsinrealmproxyinterface.realmGet$id().intValue());
        }
        if (j == -1) {
            j2 = OsObject.createRowWithPrimaryKey(table, j3, ru_unicorn_ujin_view_fragments_makearecord_model_executorsinrealmproxyinterface.realmGet$id());
        } else {
            Table.throwDuplicatePrimaryKeyException(realmGet$id);
            j2 = j;
        }
        map.put(executorsIn2, Long.valueOf(j2));
        String realmGet$title = ru_unicorn_ujin_view_fragments_makearecord_model_executorsinrealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, executorsInColumnInfo.titleIndex, j2, realmGet$title, false);
        }
        String realmGet$description = ru_unicorn_ujin_view_fragments_makearecord_model_executorsinrealmproxyinterface.realmGet$description();
        if (realmGet$description != null) {
            Table.nativeSetString(nativePtr, executorsInColumnInfo.descriptionIndex, j2, realmGet$description, false);
        }
        return j2;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(ExecutorsIn.class);
        long nativePtr = table.getNativePtr();
        ExecutorsInColumnInfo executorsInColumnInfo = (ExecutorsInColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ExecutorsIn.class);
        long j2 = executorsInColumnInfo.idIndex;
        while (it.hasNext()) {
            ExecutorsIn executorsIn = (ExecutorsIn) it.next();
            if (!map2.containsKey(executorsIn)) {
                if (executorsIn instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) executorsIn;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(executorsIn, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                C4821x4c295cda ru_unicorn_ujin_view_fragments_makearecord_model_executorsinrealmproxyinterface = executorsIn;
                Integer realmGet$id = ru_unicorn_ujin_view_fragments_makearecord_model_executorsinrealmproxyinterface.realmGet$id();
                if (realmGet$id == null) {
                    j = Table.nativeFindFirstNull(nativePtr, j2);
                } else {
                    j = Table.nativeFindFirstInt(nativePtr, j2, (long) ru_unicorn_ujin_view_fragments_makearecord_model_executorsinrealmproxyinterface.realmGet$id().intValue());
                }
                if (j == -1) {
                    j = OsObject.createRowWithPrimaryKey(table, j2, ru_unicorn_ujin_view_fragments_makearecord_model_executorsinrealmproxyinterface.realmGet$id());
                } else {
                    Table.throwDuplicatePrimaryKeyException(realmGet$id);
                }
                long j3 = j;
                map2.put(executorsIn, Long.valueOf(j3));
                String realmGet$title = ru_unicorn_ujin_view_fragments_makearecord_model_executorsinrealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    Table.nativeSetString(nativePtr, executorsInColumnInfo.titleIndex, j3, realmGet$title, false);
                }
                String realmGet$description = ru_unicorn_ujin_view_fragments_makearecord_model_executorsinrealmproxyinterface.realmGet$description();
                if (realmGet$description != null) {
                    Table.nativeSetString(nativePtr, executorsInColumnInfo.descriptionIndex, j3, realmGet$description, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, ExecutorsIn executorsIn, Map<RealmModel, Long> map) {
        long j;
        ExecutorsIn executorsIn2 = executorsIn;
        if (executorsIn2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) executorsIn2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(ExecutorsIn.class);
        long nativePtr = table.getNativePtr();
        ExecutorsInColumnInfo executorsInColumnInfo = (ExecutorsInColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ExecutorsIn.class);
        long j2 = executorsInColumnInfo.idIndex;
        C4821x4c295cda ru_unicorn_ujin_view_fragments_makearecord_model_executorsinrealmproxyinterface = executorsIn2;
        if (ru_unicorn_ujin_view_fragments_makearecord_model_executorsinrealmproxyinterface.realmGet$id() == null) {
            j = Table.nativeFindFirstNull(nativePtr, j2);
        } else {
            j = Table.nativeFindFirstInt(nativePtr, j2, (long) ru_unicorn_ujin_view_fragments_makearecord_model_executorsinrealmproxyinterface.realmGet$id().intValue());
        }
        long createRowWithPrimaryKey = j == -1 ? OsObject.createRowWithPrimaryKey(table, j2, ru_unicorn_ujin_view_fragments_makearecord_model_executorsinrealmproxyinterface.realmGet$id()) : j;
        map.put(executorsIn2, Long.valueOf(createRowWithPrimaryKey));
        String realmGet$title = ru_unicorn_ujin_view_fragments_makearecord_model_executorsinrealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, executorsInColumnInfo.titleIndex, createRowWithPrimaryKey, realmGet$title, false);
        } else {
            Table.nativeSetNull(nativePtr, executorsInColumnInfo.titleIndex, createRowWithPrimaryKey, false);
        }
        String realmGet$description = ru_unicorn_ujin_view_fragments_makearecord_model_executorsinrealmproxyinterface.realmGet$description();
        if (realmGet$description != null) {
            Table.nativeSetString(nativePtr, executorsInColumnInfo.descriptionIndex, createRowWithPrimaryKey, realmGet$description, false);
        } else {
            Table.nativeSetNull(nativePtr, executorsInColumnInfo.descriptionIndex, createRowWithPrimaryKey, false);
        }
        return createRowWithPrimaryKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(ExecutorsIn.class);
        long nativePtr = table.getNativePtr();
        ExecutorsInColumnInfo executorsInColumnInfo = (ExecutorsInColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ExecutorsIn.class);
        long j2 = executorsInColumnInfo.idIndex;
        while (it.hasNext()) {
            ExecutorsIn executorsIn = (ExecutorsIn) it.next();
            if (!map2.containsKey(executorsIn)) {
                if (executorsIn instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) executorsIn;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(executorsIn, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                C4821x4c295cda ru_unicorn_ujin_view_fragments_makearecord_model_executorsinrealmproxyinterface = executorsIn;
                if (ru_unicorn_ujin_view_fragments_makearecord_model_executorsinrealmproxyinterface.realmGet$id() == null) {
                    j = Table.nativeFindFirstNull(nativePtr, j2);
                } else {
                    j = Table.nativeFindFirstInt(nativePtr, j2, (long) ru_unicorn_ujin_view_fragments_makearecord_model_executorsinrealmproxyinterface.realmGet$id().intValue());
                }
                if (j == -1) {
                    j = OsObject.createRowWithPrimaryKey(table, j2, ru_unicorn_ujin_view_fragments_makearecord_model_executorsinrealmproxyinterface.realmGet$id());
                }
                long j3 = j;
                map2.put(executorsIn, Long.valueOf(j3));
                String realmGet$title = ru_unicorn_ujin_view_fragments_makearecord_model_executorsinrealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    Table.nativeSetString(nativePtr, executorsInColumnInfo.titleIndex, j3, realmGet$title, false);
                } else {
                    Table.nativeSetNull(nativePtr, executorsInColumnInfo.titleIndex, j3, false);
                }
                String realmGet$description = ru_unicorn_ujin_view_fragments_makearecord_model_executorsinrealmproxyinterface.realmGet$description();
                if (realmGet$description != null) {
                    Table.nativeSetString(nativePtr, executorsInColumnInfo.descriptionIndex, j3, realmGet$description, false);
                } else {
                    Table.nativeSetNull(nativePtr, executorsInColumnInfo.descriptionIndex, j3, false);
                }
            }
        }
    }

    public static ExecutorsIn createDetachedCopy(ExecutorsIn executorsIn, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        ExecutorsIn executorsIn2;
        if (i > i2 || executorsIn == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(executorsIn);
        if (cacheData == null) {
            executorsIn2 = new ExecutorsIn();
            map.put(executorsIn, new RealmObjectProxy.CacheData(i, executorsIn2));
        } else if (i >= cacheData.minDepth) {
            return (ExecutorsIn) cacheData.object;
        } else {
            cacheData.minDepth = i;
            executorsIn2 = (ExecutorsIn) cacheData.object;
        }
        C4821x4c295cda ru_unicorn_ujin_view_fragments_makearecord_model_executorsinrealmproxyinterface = executorsIn2;
        C4821x4c295cda ru_unicorn_ujin_view_fragments_makearecord_model_executorsinrealmproxyinterface2 = executorsIn;
        ru_unicorn_ujin_view_fragments_makearecord_model_executorsinrealmproxyinterface.realmSet$id(ru_unicorn_ujin_view_fragments_makearecord_model_executorsinrealmproxyinterface2.realmGet$id());
        ru_unicorn_ujin_view_fragments_makearecord_model_executorsinrealmproxyinterface.realmSet$title(ru_unicorn_ujin_view_fragments_makearecord_model_executorsinrealmproxyinterface2.realmGet$title());
        ru_unicorn_ujin_view_fragments_makearecord_model_executorsinrealmproxyinterface.realmSet$description(ru_unicorn_ujin_view_fragments_makearecord_model_executorsinrealmproxyinterface2.realmGet$description());
        return executorsIn2;
    }

    static ExecutorsIn update(Realm realm, ExecutorsInColumnInfo executorsInColumnInfo, ExecutorsIn executorsIn, ExecutorsIn executorsIn2, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        C4821x4c295cda ru_unicorn_ujin_view_fragments_makearecord_model_executorsinrealmproxyinterface = executorsIn;
        C4821x4c295cda ru_unicorn_ujin_view_fragments_makearecord_model_executorsinrealmproxyinterface2 = executorsIn2;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(ExecutorsIn.class), executorsInColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addInteger(executorsInColumnInfo.idIndex, ru_unicorn_ujin_view_fragments_makearecord_model_executorsinrealmproxyinterface2.realmGet$id());
        osObjectBuilder.addString(executorsInColumnInfo.titleIndex, ru_unicorn_ujin_view_fragments_makearecord_model_executorsinrealmproxyinterface2.realmGet$title());
        osObjectBuilder.addString(executorsInColumnInfo.descriptionIndex, ru_unicorn_ujin_view_fragments_makearecord_model_executorsinrealmproxyinterface2.realmGet$description());
        osObjectBuilder.updateExistingObject();
        return executorsIn;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("ExecutorsIn = proxy[");
        sb.append("{id:");
        String str = "null";
        sb.append(realmGet$id() != null ? realmGet$id() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{title:");
        sb.append(realmGet$title() != null ? realmGet$title() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{description:");
        if (realmGet$description() != null) {
            str = realmGet$description();
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
        C4820x447e431f ru_unicorn_ujin_view_fragments_makearecord_model_executorsinrealmproxy = (C4820x447e431f) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_view_fragments_makearecord_model_executorsinrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_view_fragments_makearecord_model_executorsinrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_view_fragments_makearecord_model_executorsinrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
