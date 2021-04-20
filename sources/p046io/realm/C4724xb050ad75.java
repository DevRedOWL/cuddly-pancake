package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.TicketRating;
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

/* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_TicketRatingRealmProxy */
public class C4724xb050ad75 extends TicketRating implements RealmObjectProxy, C4725x861a3344 {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private TicketRatingColumnInfo columnInfo;
    private ProxyState<TicketRating> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_TicketRatingRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "TicketRating";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_TicketRatingRealmProxy$TicketRatingColumnInfo */
    static final class TicketRatingColumnInfo extends ColumnInfo {
        long commentIndex;
        long idIndex;
        long maxColumnIndexValue;
        long ratingIndex;

        TicketRatingColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(3);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.ratingIndex = addColumnDetails("rating", "rating", objectSchemaInfo);
            this.commentIndex = addColumnDetails("comment", "comment", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        TicketRatingColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new TicketRatingColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            TicketRatingColumnInfo ticketRatingColumnInfo = (TicketRatingColumnInfo) columnInfo;
            TicketRatingColumnInfo ticketRatingColumnInfo2 = (TicketRatingColumnInfo) columnInfo2;
            ticketRatingColumnInfo2.idIndex = ticketRatingColumnInfo.idIndex;
            ticketRatingColumnInfo2.ratingIndex = ticketRatingColumnInfo.ratingIndex;
            ticketRatingColumnInfo2.commentIndex = ticketRatingColumnInfo.commentIndex;
            ticketRatingColumnInfo2.maxColumnIndexValue = ticketRatingColumnInfo.maxColumnIndexValue;
        }
    }

    C4724xb050ad75() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (TicketRatingColumnInfo) realmObjectContext.getColumnInfo();
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

    public Integer realmGet$rating() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.ratingIndex)) {
            return null;
        }
        return Integer.valueOf((int) this.proxyState.getRow$realm().getLong(this.columnInfo.ratingIndex));
    }

    public void realmSet$rating(Integer num) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (num == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.ratingIndex);
            } else {
                this.proxyState.getRow$realm().setLong(this.columnInfo.ratingIndex, (long) num.intValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (num == null) {
                row$realm.getTable().setNull(this.columnInfo.ratingIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setLong(this.columnInfo.ratingIndex, row$realm.getIndex(), (long) num.intValue(), true);
            }
        }
    }

    public String realmGet$comment() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.commentIndex);
    }

    public void realmSet$comment(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.commentIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.commentIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.commentIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.commentIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 3, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("id", RealmFieldType.STRING, true, true, false);
        builder2.addPersistedProperty("rating", RealmFieldType.INTEGER, false, false, false);
        builder2.addPersistedProperty("comment", RealmFieldType.STRING, false, false, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static TicketRatingColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new TicketRatingColumnInfo(osSchemaInfo);
    }

    /* JADX WARNING: type inference failed for: r12v4, types: [io.realm.RealmModel] */
    /* JADX WARNING: type inference failed for: r12v5, types: [io.realm.RealmModel] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00bc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.TicketRating createOrUpdateUsingJsonObject(p046io.realm.Realm r12, org.json.JSONObject r13, boolean r14) throws org.json.JSONException {
        /*
            java.util.List r0 = java.util.Collections.emptyList()
            r1 = 0
            java.lang.String r2 = "id"
            if (r14 == 0) goto L_0x0064
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.TicketRating> r14 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.TicketRating.class
            io.realm.internal.Table r14 = r12.getTable(r14)
            io.realm.RealmSchema r3 = r12.getSchema()
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.TicketRating> r4 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.TicketRating.class
            io.realm.internal.ColumnInfo r3 = r3.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r4)
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_TicketRatingRealmProxy$TicketRatingColumnInfo r3 = (p046io.realm.C4724xb050ad75.TicketRatingColumnInfo) r3
            long r3 = r3.idIndex
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
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.TicketRating> r3 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.TicketRating.class
            io.realm.internal.ColumnInfo r9 = r14.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r3)     // Catch:{ all -> 0x005f }
            r10 = 0
            java.util.List r11 = java.util.Collections.emptyList()     // Catch:{ all -> 0x005f }
            r6 = r5
            r7 = r12
            r6.set(r7, r8, r9, r10, r11)     // Catch:{ all -> 0x005f }
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_TicketRatingRealmProxy r14 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_TicketRatingRealmProxy     // Catch:{ all -> 0x005f }
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
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.TicketRating> r14 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.TicketRating.class
            io.realm.RealmModel r12 = r12.createObjectInternal(r14, r1, r3, r0)
            r14 = r12
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_TicketRatingRealmProxy r14 = (p046io.realm.C4724xb050ad75) r14
            goto L_0x0094
        L_0x007e:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.TicketRating> r14 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.TicketRating.class
            java.lang.String r2 = r13.getString(r2)
            io.realm.RealmModel r12 = r12.createObjectInternal(r14, r2, r3, r0)
            r14 = r12
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_TicketRatingRealmProxy r14 = (p046io.realm.C4724xb050ad75) r14
            goto L_0x0094
        L_0x008c:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = "JSON object doesn't have the primary key field 'id'."
            r12.<init>(r13)
            throw r12
        L_0x0094:
            r12 = r14
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_TicketRatingRealmProxyInterface r12 = (p046io.realm.C4725x861a3344) r12
            java.lang.String r0 = "rating"
            boolean r2 = r13.has(r0)
            if (r2 == 0) goto L_0x00b4
            boolean r2 = r13.isNull(r0)
            if (r2 == 0) goto L_0x00a9
            r12.realmSet$rating(r1)
            goto L_0x00b4
        L_0x00a9:
            int r0 = r13.getInt(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r12.realmSet$rating(r0)
        L_0x00b4:
            java.lang.String r0 = "comment"
            boolean r2 = r13.has(r0)
            if (r2 == 0) goto L_0x00cd
            boolean r2 = r13.isNull(r0)
            if (r2 == 0) goto L_0x00c6
            r12.realmSet$comment(r1)
            goto L_0x00cd
        L_0x00c6:
            java.lang.String r13 = r13.getString(r0)
            r12.realmSet$comment(r13)
        L_0x00cd:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.C4724xb050ad75.createOrUpdateUsingJsonObject(io.realm.Realm, org.json.JSONObject, boolean):ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.TicketRating");
    }

    public static TicketRating createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        TicketRating ticketRating = new TicketRating();
        C4725x861a3344 ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketratingrealmproxyinterface = ticketRating;
        jsonReader.beginObject();
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("id")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketratingrealmproxyinterface.realmSet$id(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketratingrealmproxyinterface.realmSet$id((String) null);
                }
                z = true;
            } else if (nextName.equals("rating")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketratingrealmproxyinterface.realmSet$rating(Integer.valueOf(jsonReader.nextInt()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketratingrealmproxyinterface.realmSet$rating((Integer) null);
                }
            } else if (!nextName.equals("comment")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketratingrealmproxyinterface.realmSet$comment(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketratingrealmproxyinterface.realmSet$comment((String) null);
            }
        }
        jsonReader.endObject();
        if (z) {
            return (TicketRating) realm.copyToRealm(ticketRating, new ImportFlag[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
    }

    private static C4724xb050ad75 newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) TicketRating.class), false, Collections.emptyList());
        C4724xb050ad75 ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketratingrealmproxy = new C4724xb050ad75();
        realmObjectContext.clear();
        return ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketratingrealmproxy;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.TicketRating copyOrUpdate(p046io.realm.Realm r8, p046io.realm.C4724xb050ad75.TicketRatingColumnInfo r9, p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.TicketRating r10, boolean r11, java.util.Map<p046io.realm.RealmModel, p046io.realm.internal.RealmObjectProxy> r12, java.util.Set<p046io.realm.ImportFlag> r13) {
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
            ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.TicketRating r1 = (p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.TicketRating) r1
            return r1
        L_0x004b:
            r1 = 0
            if (r11 == 0) goto L_0x0093
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.TicketRating> r2 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.TicketRating.class
            io.realm.internal.Table r2 = r8.getTable(r2)
            long r3 = r9.idIndex
            r5 = r10
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_TicketRatingRealmProxyInterface r5 = (p046io.realm.C4725x861a3344) r5
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
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_TicketRatingRealmProxy r1 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_TicketRatingRealmProxy     // Catch:{ all -> 0x008e }
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
            ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.TicketRating r8 = update(r1, r2, r3, r4, r5, r6)
            goto L_0x00a5
        L_0x00a1:
            ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.TicketRating r8 = copy(r8, r9, r10, r11, r12, r13)
        L_0x00a5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.C4724xb050ad75.copyOrUpdate(io.realm.Realm, io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_TicketRatingRealmProxy$TicketRatingColumnInfo, ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.TicketRating, boolean, java.util.Map, java.util.Set):ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.TicketRating");
    }

    public static TicketRating copy(Realm realm, TicketRatingColumnInfo ticketRatingColumnInfo, TicketRating ticketRating, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(ticketRating);
        if (realmObjectProxy != null) {
            return (TicketRating) realmObjectProxy;
        }
        C4725x861a3344 ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketratingrealmproxyinterface = ticketRating;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(TicketRating.class), ticketRatingColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(ticketRatingColumnInfo.idIndex, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketratingrealmproxyinterface.realmGet$id());
        osObjectBuilder.addInteger(ticketRatingColumnInfo.ratingIndex, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketratingrealmproxyinterface.realmGet$rating());
        osObjectBuilder.addString(ticketRatingColumnInfo.commentIndex, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketratingrealmproxyinterface.realmGet$comment());
        C4724xb050ad75 newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(ticketRating, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, TicketRating ticketRating, Map<RealmModel, Long> map) {
        long j;
        long j2;
        TicketRating ticketRating2 = ticketRating;
        if (ticketRating2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) ticketRating2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(TicketRating.class);
        long nativePtr = table.getNativePtr();
        TicketRatingColumnInfo ticketRatingColumnInfo = (TicketRatingColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TicketRating.class);
        long j3 = ticketRatingColumnInfo.idIndex;
        C4725x861a3344 ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketratingrealmproxyinterface = ticketRating2;
        String realmGet$id = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketratingrealmproxyinterface.realmGet$id();
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
        map.put(ticketRating2, Long.valueOf(j2));
        Integer realmGet$rating = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketratingrealmproxyinterface.realmGet$rating();
        if (realmGet$rating != null) {
            Table.nativeSetLong(nativePtr, ticketRatingColumnInfo.ratingIndex, j2, realmGet$rating.longValue(), false);
        }
        String realmGet$comment = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketratingrealmproxyinterface.realmGet$comment();
        if (realmGet$comment != null) {
            Table.nativeSetString(nativePtr, ticketRatingColumnInfo.commentIndex, j2, realmGet$comment, false);
        }
        return j2;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        long j3;
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(TicketRating.class);
        long nativePtr = table.getNativePtr();
        TicketRatingColumnInfo ticketRatingColumnInfo = (TicketRatingColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TicketRating.class);
        long j4 = ticketRatingColumnInfo.idIndex;
        while (it.hasNext()) {
            TicketRating ticketRating = (TicketRating) it.next();
            if (!map2.containsKey(ticketRating)) {
                if (ticketRating instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) ticketRating;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(ticketRating, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                C4725x861a3344 ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketratingrealmproxyinterface = ticketRating;
                String realmGet$id = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketratingrealmproxyinterface.realmGet$id();
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
                map2.put(ticketRating, Long.valueOf(j2));
                Integer realmGet$rating = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketratingrealmproxyinterface.realmGet$rating();
                if (realmGet$rating != null) {
                    j3 = j4;
                    Table.nativeSetLong(nativePtr, ticketRatingColumnInfo.ratingIndex, j2, realmGet$rating.longValue(), false);
                } else {
                    j3 = j4;
                }
                String realmGet$comment = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketratingrealmproxyinterface.realmGet$comment();
                if (realmGet$comment != null) {
                    Table.nativeSetString(nativePtr, ticketRatingColumnInfo.commentIndex, j2, realmGet$comment, false);
                }
                j4 = j3;
            }
        }
    }

    public static long insertOrUpdate(Realm realm, TicketRating ticketRating, Map<RealmModel, Long> map) {
        long j;
        TicketRating ticketRating2 = ticketRating;
        if (ticketRating2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) ticketRating2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(TicketRating.class);
        long nativePtr = table.getNativePtr();
        TicketRatingColumnInfo ticketRatingColumnInfo = (TicketRatingColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TicketRating.class);
        long j2 = ticketRatingColumnInfo.idIndex;
        C4725x861a3344 ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketratingrealmproxyinterface = ticketRating2;
        String realmGet$id = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketratingrealmproxyinterface.realmGet$id();
        if (realmGet$id == null) {
            j = Table.nativeFindFirstNull(nativePtr, j2);
        } else {
            j = Table.nativeFindFirstString(nativePtr, j2, realmGet$id);
        }
        long createRowWithPrimaryKey = j == -1 ? OsObject.createRowWithPrimaryKey(table, j2, realmGet$id) : j;
        map.put(ticketRating2, Long.valueOf(createRowWithPrimaryKey));
        Integer realmGet$rating = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketratingrealmproxyinterface.realmGet$rating();
        if (realmGet$rating != null) {
            Table.nativeSetLong(nativePtr, ticketRatingColumnInfo.ratingIndex, createRowWithPrimaryKey, realmGet$rating.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, ticketRatingColumnInfo.ratingIndex, createRowWithPrimaryKey, false);
        }
        String realmGet$comment = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketratingrealmproxyinterface.realmGet$comment();
        if (realmGet$comment != null) {
            Table.nativeSetString(nativePtr, ticketRatingColumnInfo.commentIndex, createRowWithPrimaryKey, realmGet$comment, false);
        } else {
            Table.nativeSetNull(nativePtr, ticketRatingColumnInfo.commentIndex, createRowWithPrimaryKey, false);
        }
        return createRowWithPrimaryKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(TicketRating.class);
        long nativePtr = table.getNativePtr();
        TicketRatingColumnInfo ticketRatingColumnInfo = (TicketRatingColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TicketRating.class);
        long j3 = ticketRatingColumnInfo.idIndex;
        while (it.hasNext()) {
            TicketRating ticketRating = (TicketRating) it.next();
            if (!map2.containsKey(ticketRating)) {
                if (ticketRating instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) ticketRating;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(ticketRating, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                C4725x861a3344 ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketratingrealmproxyinterface = ticketRating;
                String realmGet$id = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketratingrealmproxyinterface.realmGet$id();
                if (realmGet$id == null) {
                    j = Table.nativeFindFirstNull(nativePtr, j3);
                } else {
                    j = Table.nativeFindFirstString(nativePtr, j3, realmGet$id);
                }
                long createRowWithPrimaryKey = j == -1 ? OsObject.createRowWithPrimaryKey(table, j3, realmGet$id) : j;
                map2.put(ticketRating, Long.valueOf(createRowWithPrimaryKey));
                Integer realmGet$rating = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketratingrealmproxyinterface.realmGet$rating();
                if (realmGet$rating != null) {
                    j2 = j3;
                    Table.nativeSetLong(nativePtr, ticketRatingColumnInfo.ratingIndex, createRowWithPrimaryKey, realmGet$rating.longValue(), false);
                } else {
                    j2 = j3;
                    Table.nativeSetNull(nativePtr, ticketRatingColumnInfo.ratingIndex, createRowWithPrimaryKey, false);
                }
                String realmGet$comment = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketratingrealmproxyinterface.realmGet$comment();
                if (realmGet$comment != null) {
                    Table.nativeSetString(nativePtr, ticketRatingColumnInfo.commentIndex, createRowWithPrimaryKey, realmGet$comment, false);
                } else {
                    Table.nativeSetNull(nativePtr, ticketRatingColumnInfo.commentIndex, createRowWithPrimaryKey, false);
                }
                j3 = j2;
            }
        }
    }

    public static TicketRating createDetachedCopy(TicketRating ticketRating, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        TicketRating ticketRating2;
        if (i > i2 || ticketRating == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(ticketRating);
        if (cacheData == null) {
            ticketRating2 = new TicketRating();
            map.put(ticketRating, new RealmObjectProxy.CacheData(i, ticketRating2));
        } else if (i >= cacheData.minDepth) {
            return (TicketRating) cacheData.object;
        } else {
            cacheData.minDepth = i;
            ticketRating2 = (TicketRating) cacheData.object;
        }
        C4725x861a3344 ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketratingrealmproxyinterface = ticketRating2;
        C4725x861a3344 ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketratingrealmproxyinterface2 = ticketRating;
        ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketratingrealmproxyinterface.realmSet$id(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketratingrealmproxyinterface2.realmGet$id());
        ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketratingrealmproxyinterface.realmSet$rating(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketratingrealmproxyinterface2.realmGet$rating());
        ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketratingrealmproxyinterface.realmSet$comment(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketratingrealmproxyinterface2.realmGet$comment());
        return ticketRating2;
    }

    static TicketRating update(Realm realm, TicketRatingColumnInfo ticketRatingColumnInfo, TicketRating ticketRating, TicketRating ticketRating2, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        C4725x861a3344 ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketratingrealmproxyinterface = ticketRating;
        C4725x861a3344 ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketratingrealmproxyinterface2 = ticketRating2;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(TicketRating.class), ticketRatingColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(ticketRatingColumnInfo.idIndex, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketratingrealmproxyinterface2.realmGet$id());
        osObjectBuilder.addInteger(ticketRatingColumnInfo.ratingIndex, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketratingrealmproxyinterface2.realmGet$rating());
        osObjectBuilder.addString(ticketRatingColumnInfo.commentIndex, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketratingrealmproxyinterface2.realmGet$comment());
        osObjectBuilder.updateExistingObject();
        return ticketRating;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("TicketRating = proxy[");
        sb.append("{id:");
        String str = "null";
        sb.append(realmGet$id() != null ? realmGet$id() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{rating:");
        sb.append(realmGet$rating() != null ? realmGet$rating() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{comment:");
        if (realmGet$comment() != null) {
            str = realmGet$comment();
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
        C4724xb050ad75 ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketratingrealmproxy = (C4724xb050ad75) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketratingrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketratingrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketratingrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
