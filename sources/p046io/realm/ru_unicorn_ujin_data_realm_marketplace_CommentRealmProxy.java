package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p035ru.unicorn.ujin.data.realm.marketplace.Comment;
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

/* renamed from: io.realm.ru_unicorn_ujin_data_realm_marketplace_CommentRealmProxy */
public class ru_unicorn_ujin_data_realm_marketplace_CommentRealmProxy extends Comment implements RealmObjectProxy, C4609xf6b1932 {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private CommentColumnInfo columnInfo;
    private ProxyState<Comment> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_marketplace_CommentRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Comment";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_marketplace_CommentRealmProxy$CommentColumnInfo */
    static final class CommentColumnInfo extends ColumnInfo {
        long authorNameIndex;
        long dateIndex;
        long idIndex;
        long maxColumnIndexValue;
        long messageIndex;
        long threadIdIndex;
        long threadTypeIndex;
        long voteIndex;

        CommentColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(7);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.threadIdIndex = addColumnDetails("threadId", "threadId", objectSchemaInfo);
            this.threadTypeIndex = addColumnDetails("threadType", "threadType", objectSchemaInfo);
            this.authorNameIndex = addColumnDetails("authorName", "authorName", objectSchemaInfo);
            this.messageIndex = addColumnDetails("message", "message", objectSchemaInfo);
            this.voteIndex = addColumnDetails("vote", "vote", objectSchemaInfo);
            this.dateIndex = addColumnDetails("date", "date", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        CommentColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new CommentColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            CommentColumnInfo commentColumnInfo = (CommentColumnInfo) columnInfo;
            CommentColumnInfo commentColumnInfo2 = (CommentColumnInfo) columnInfo2;
            commentColumnInfo2.idIndex = commentColumnInfo.idIndex;
            commentColumnInfo2.threadIdIndex = commentColumnInfo.threadIdIndex;
            commentColumnInfo2.threadTypeIndex = commentColumnInfo.threadTypeIndex;
            commentColumnInfo2.authorNameIndex = commentColumnInfo.authorNameIndex;
            commentColumnInfo2.messageIndex = commentColumnInfo.messageIndex;
            commentColumnInfo2.voteIndex = commentColumnInfo.voteIndex;
            commentColumnInfo2.dateIndex = commentColumnInfo.dateIndex;
            commentColumnInfo2.maxColumnIndexValue = commentColumnInfo.maxColumnIndexValue;
        }
    }

    ru_unicorn_ujin_data_realm_marketplace_CommentRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (CommentColumnInfo) realmObjectContext.getColumnInfo();
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

    public String realmGet$threadId() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.threadIdIndex);
    }

    public void realmSet$threadId(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.threadIdIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.threadIdIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.threadIdIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.threadIdIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$threadType() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.threadTypeIndex);
    }

    public void realmSet$threadType(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.threadTypeIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.threadTypeIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.threadTypeIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.threadTypeIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$authorName() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.authorNameIndex);
    }

    public void realmSet$authorName(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.authorNameIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.authorNameIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.authorNameIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.authorNameIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$message() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.messageIndex);
    }

    public void realmSet$message(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.messageIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.messageIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.messageIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.messageIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$vote() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.voteIndex);
    }

    public void realmSet$vote(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.voteIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.voteIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.voteIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.voteIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$date() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.dateIndex);
    }

    public void realmSet$date(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.dateIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.dateIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.dateIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.dateIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 7, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("id", RealmFieldType.STRING, true, true, false);
        builder2.addPersistedProperty("threadId", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("threadType", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("authorName", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("message", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("vote", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("date", RealmFieldType.STRING, false, false, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static CommentColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new CommentColumnInfo(osSchemaInfo);
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
    /* JADX WARNING: Removed duplicated region for block: B:57:0x011d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.data.realm.marketplace.Comment createOrUpdateUsingJsonObject(p046io.realm.Realm r12, org.json.JSONObject r13, boolean r14) throws org.json.JSONException {
        /*
            java.util.List r0 = java.util.Collections.emptyList()
            java.lang.String r1 = "id"
            r2 = 0
            if (r14 == 0) goto L_0x0064
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.Comment> r14 = p035ru.unicorn.ujin.data.realm.marketplace.Comment.class
            io.realm.internal.Table r14 = r12.getTable(r14)
            io.realm.RealmSchema r3 = r12.getSchema()
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.Comment> r4 = p035ru.unicorn.ujin.data.realm.marketplace.Comment.class
            io.realm.internal.ColumnInfo r3 = r3.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r4)
            io.realm.ru_unicorn_ujin_data_realm_marketplace_CommentRealmProxy$CommentColumnInfo r3 = (p046io.realm.ru_unicorn_ujin_data_realm_marketplace_CommentRealmProxy.CommentColumnInfo) r3
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
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.Comment> r3 = p035ru.unicorn.ujin.data.realm.marketplace.Comment.class
            io.realm.internal.ColumnInfo r9 = r14.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r3)     // Catch:{ all -> 0x005f }
            r10 = 0
            java.util.List r11 = java.util.Collections.emptyList()     // Catch:{ all -> 0x005f }
            r6 = r5
            r7 = r12
            r6.set(r7, r8, r9, r10, r11)     // Catch:{ all -> 0x005f }
            io.realm.ru_unicorn_ujin_data_realm_marketplace_CommentRealmProxy r14 = new io.realm.ru_unicorn_ujin_data_realm_marketplace_CommentRealmProxy     // Catch:{ all -> 0x005f }
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
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.Comment> r14 = p035ru.unicorn.ujin.data.realm.marketplace.Comment.class
            io.realm.RealmModel r12 = r12.createObjectInternal(r14, r2, r3, r0)
            r14 = r12
            io.realm.ru_unicorn_ujin_data_realm_marketplace_CommentRealmProxy r14 = (p046io.realm.ru_unicorn_ujin_data_realm_marketplace_CommentRealmProxy) r14
            goto L_0x0094
        L_0x007e:
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.Comment> r14 = p035ru.unicorn.ujin.data.realm.marketplace.Comment.class
            java.lang.String r1 = r13.getString(r1)
            io.realm.RealmModel r12 = r12.createObjectInternal(r14, r1, r3, r0)
            r14 = r12
            io.realm.ru_unicorn_ujin_data_realm_marketplace_CommentRealmProxy r14 = (p046io.realm.ru_unicorn_ujin_data_realm_marketplace_CommentRealmProxy) r14
            goto L_0x0094
        L_0x008c:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = "JSON object doesn't have the primary key field 'id'."
            r12.<init>(r13)
            throw r12
        L_0x0094:
            r12 = r14
            io.realm.ru_unicorn_ujin_data_realm_marketplace_CommentRealmProxyInterface r12 = (p046io.realm.C4609xf6b1932) r12
            java.lang.String r0 = "threadId"
            boolean r1 = r13.has(r0)
            if (r1 == 0) goto L_0x00b0
            boolean r1 = r13.isNull(r0)
            if (r1 == 0) goto L_0x00a9
            r12.realmSet$threadId(r2)
            goto L_0x00b0
        L_0x00a9:
            java.lang.String r0 = r13.getString(r0)
            r12.realmSet$threadId(r0)
        L_0x00b0:
            java.lang.String r0 = "threadType"
            boolean r1 = r13.has(r0)
            if (r1 == 0) goto L_0x00c9
            boolean r1 = r13.isNull(r0)
            if (r1 == 0) goto L_0x00c2
            r12.realmSet$threadType(r2)
            goto L_0x00c9
        L_0x00c2:
            java.lang.String r0 = r13.getString(r0)
            r12.realmSet$threadType(r0)
        L_0x00c9:
            java.lang.String r0 = "authorName"
            boolean r1 = r13.has(r0)
            if (r1 == 0) goto L_0x00e2
            boolean r1 = r13.isNull(r0)
            if (r1 == 0) goto L_0x00db
            r12.realmSet$authorName(r2)
            goto L_0x00e2
        L_0x00db:
            java.lang.String r0 = r13.getString(r0)
            r12.realmSet$authorName(r0)
        L_0x00e2:
            java.lang.String r0 = "message"
            boolean r1 = r13.has(r0)
            if (r1 == 0) goto L_0x00fb
            boolean r1 = r13.isNull(r0)
            if (r1 == 0) goto L_0x00f4
            r12.realmSet$message(r2)
            goto L_0x00fb
        L_0x00f4:
            java.lang.String r0 = r13.getString(r0)
            r12.realmSet$message(r0)
        L_0x00fb:
            java.lang.String r0 = "vote"
            boolean r1 = r13.has(r0)
            if (r1 == 0) goto L_0x0115
            boolean r1 = r13.isNull(r0)
            if (r1 == 0) goto L_0x010e
            r12.realmSet$vote(r2)
            goto L_0x0115
        L_0x010e:
            java.lang.String r0 = r13.getString(r0)
            r12.realmSet$vote(r0)
        L_0x0115:
            java.lang.String r0 = "date"
            boolean r1 = r13.has(r0)
            if (r1 == 0) goto L_0x012e
            boolean r1 = r13.isNull(r0)
            if (r1 == 0) goto L_0x0127
            r12.realmSet$date(r2)
            goto L_0x012e
        L_0x0127:
            java.lang.String r13 = r13.getString(r0)
            r12.realmSet$date(r13)
        L_0x012e:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.ru_unicorn_ujin_data_realm_marketplace_CommentRealmProxy.createOrUpdateUsingJsonObject(io.realm.Realm, org.json.JSONObject, boolean):ru.unicorn.ujin.data.realm.marketplace.Comment");
    }

    public static Comment createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        Comment comment = new Comment();
        C4609xf6b1932 ru_unicorn_ujin_data_realm_marketplace_commentrealmproxyinterface = comment;
        jsonReader.beginObject();
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("id")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_marketplace_commentrealmproxyinterface.realmSet$id(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_commentrealmproxyinterface.realmSet$id((String) null);
                }
                z = true;
            } else if (nextName.equals("threadId")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_marketplace_commentrealmproxyinterface.realmSet$threadId(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_commentrealmproxyinterface.realmSet$threadId((String) null);
                }
            } else if (nextName.equals("threadType")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_marketplace_commentrealmproxyinterface.realmSet$threadType(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_commentrealmproxyinterface.realmSet$threadType((String) null);
                }
            } else if (nextName.equals("authorName")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_marketplace_commentrealmproxyinterface.realmSet$authorName(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_commentrealmproxyinterface.realmSet$authorName((String) null);
                }
            } else if (nextName.equals("message")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_marketplace_commentrealmproxyinterface.realmSet$message(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_commentrealmproxyinterface.realmSet$message((String) null);
                }
            } else if (nextName.equals("vote")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_marketplace_commentrealmproxyinterface.realmSet$vote(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_commentrealmproxyinterface.realmSet$vote((String) null);
                }
            } else if (!nextName.equals("date")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_data_realm_marketplace_commentrealmproxyinterface.realmSet$date(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_data_realm_marketplace_commentrealmproxyinterface.realmSet$date((String) null);
            }
        }
        jsonReader.endObject();
        if (z) {
            return (Comment) realm.copyToRealm(comment, new ImportFlag[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
    }

    private static ru_unicorn_ujin_data_realm_marketplace_CommentRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) Comment.class), false, Collections.emptyList());
        ru_unicorn_ujin_data_realm_marketplace_CommentRealmProxy ru_unicorn_ujin_data_realm_marketplace_commentrealmproxy = new ru_unicorn_ujin_data_realm_marketplace_CommentRealmProxy();
        realmObjectContext.clear();
        return ru_unicorn_ujin_data_realm_marketplace_commentrealmproxy;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.data.realm.marketplace.Comment copyOrUpdate(p046io.realm.Realm r8, p046io.realm.ru_unicorn_ujin_data_realm_marketplace_CommentRealmProxy.CommentColumnInfo r9, p035ru.unicorn.ujin.data.realm.marketplace.Comment r10, boolean r11, java.util.Map<p046io.realm.RealmModel, p046io.realm.internal.RealmObjectProxy> r12, java.util.Set<p046io.realm.ImportFlag> r13) {
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
            ru.unicorn.ujin.data.realm.marketplace.Comment r1 = (p035ru.unicorn.ujin.data.realm.marketplace.Comment) r1
            return r1
        L_0x004b:
            r1 = 0
            if (r11 == 0) goto L_0x0093
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.Comment> r2 = p035ru.unicorn.ujin.data.realm.marketplace.Comment.class
            io.realm.internal.Table r2 = r8.getTable(r2)
            long r3 = r9.idIndex
            r5 = r10
            io.realm.ru_unicorn_ujin_data_realm_marketplace_CommentRealmProxyInterface r5 = (p046io.realm.C4609xf6b1932) r5
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
            io.realm.ru_unicorn_ujin_data_realm_marketplace_CommentRealmProxy r1 = new io.realm.ru_unicorn_ujin_data_realm_marketplace_CommentRealmProxy     // Catch:{ all -> 0x008e }
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
            ru.unicorn.ujin.data.realm.marketplace.Comment r8 = update(r1, r2, r3, r4, r5, r6)
            goto L_0x00a5
        L_0x00a1:
            ru.unicorn.ujin.data.realm.marketplace.Comment r8 = copy(r8, r9, r10, r11, r12, r13)
        L_0x00a5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.ru_unicorn_ujin_data_realm_marketplace_CommentRealmProxy.copyOrUpdate(io.realm.Realm, io.realm.ru_unicorn_ujin_data_realm_marketplace_CommentRealmProxy$CommentColumnInfo, ru.unicorn.ujin.data.realm.marketplace.Comment, boolean, java.util.Map, java.util.Set):ru.unicorn.ujin.data.realm.marketplace.Comment");
    }

    public static Comment copy(Realm realm, CommentColumnInfo commentColumnInfo, Comment comment, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(comment);
        if (realmObjectProxy != null) {
            return (Comment) realmObjectProxy;
        }
        C4609xf6b1932 ru_unicorn_ujin_data_realm_marketplace_commentrealmproxyinterface = comment;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(Comment.class), commentColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(commentColumnInfo.idIndex, ru_unicorn_ujin_data_realm_marketplace_commentrealmproxyinterface.realmGet$id());
        osObjectBuilder.addString(commentColumnInfo.threadIdIndex, ru_unicorn_ujin_data_realm_marketplace_commentrealmproxyinterface.realmGet$threadId());
        osObjectBuilder.addString(commentColumnInfo.threadTypeIndex, ru_unicorn_ujin_data_realm_marketplace_commentrealmproxyinterface.realmGet$threadType());
        osObjectBuilder.addString(commentColumnInfo.authorNameIndex, ru_unicorn_ujin_data_realm_marketplace_commentrealmproxyinterface.realmGet$authorName());
        osObjectBuilder.addString(commentColumnInfo.messageIndex, ru_unicorn_ujin_data_realm_marketplace_commentrealmproxyinterface.realmGet$message());
        osObjectBuilder.addString(commentColumnInfo.voteIndex, ru_unicorn_ujin_data_realm_marketplace_commentrealmproxyinterface.realmGet$vote());
        osObjectBuilder.addString(commentColumnInfo.dateIndex, ru_unicorn_ujin_data_realm_marketplace_commentrealmproxyinterface.realmGet$date());
        ru_unicorn_ujin_data_realm_marketplace_CommentRealmProxy newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(comment, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, Comment comment, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Comment comment2 = comment;
        if (comment2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) comment2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(Comment.class);
        long nativePtr = table.getNativePtr();
        CommentColumnInfo commentColumnInfo = (CommentColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Comment.class);
        long j3 = commentColumnInfo.idIndex;
        C4609xf6b1932 ru_unicorn_ujin_data_realm_marketplace_commentrealmproxyinterface = comment2;
        String realmGet$id = ru_unicorn_ujin_data_realm_marketplace_commentrealmproxyinterface.realmGet$id();
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
        map.put(comment2, Long.valueOf(j2));
        String realmGet$threadId = ru_unicorn_ujin_data_realm_marketplace_commentrealmproxyinterface.realmGet$threadId();
        if (realmGet$threadId != null) {
            Table.nativeSetString(nativePtr, commentColumnInfo.threadIdIndex, j2, realmGet$threadId, false);
        }
        String realmGet$threadType = ru_unicorn_ujin_data_realm_marketplace_commentrealmproxyinterface.realmGet$threadType();
        if (realmGet$threadType != null) {
            Table.nativeSetString(nativePtr, commentColumnInfo.threadTypeIndex, j2, realmGet$threadType, false);
        }
        String realmGet$authorName = ru_unicorn_ujin_data_realm_marketplace_commentrealmproxyinterface.realmGet$authorName();
        if (realmGet$authorName != null) {
            Table.nativeSetString(nativePtr, commentColumnInfo.authorNameIndex, j2, realmGet$authorName, false);
        }
        String realmGet$message = ru_unicorn_ujin_data_realm_marketplace_commentrealmproxyinterface.realmGet$message();
        if (realmGet$message != null) {
            Table.nativeSetString(nativePtr, commentColumnInfo.messageIndex, j2, realmGet$message, false);
        }
        String realmGet$vote = ru_unicorn_ujin_data_realm_marketplace_commentrealmproxyinterface.realmGet$vote();
        if (realmGet$vote != null) {
            Table.nativeSetString(nativePtr, commentColumnInfo.voteIndex, j2, realmGet$vote, false);
        }
        String realmGet$date = ru_unicorn_ujin_data_realm_marketplace_commentrealmproxyinterface.realmGet$date();
        if (realmGet$date != null) {
            Table.nativeSetString(nativePtr, commentColumnInfo.dateIndex, j2, realmGet$date, false);
        }
        return j2;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(Comment.class);
        long nativePtr = table.getNativePtr();
        CommentColumnInfo commentColumnInfo = (CommentColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Comment.class);
        long j3 = commentColumnInfo.idIndex;
        while (it.hasNext()) {
            Comment comment = (Comment) it.next();
            if (!map2.containsKey(comment)) {
                if (comment instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) comment;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(comment, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                C4609xf6b1932 ru_unicorn_ujin_data_realm_marketplace_commentrealmproxyinterface = comment;
                String realmGet$id = ru_unicorn_ujin_data_realm_marketplace_commentrealmproxyinterface.realmGet$id();
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
                map2.put(comment, Long.valueOf(j2));
                String realmGet$threadId = ru_unicorn_ujin_data_realm_marketplace_commentrealmproxyinterface.realmGet$threadId();
                if (realmGet$threadId != null) {
                    Table.nativeSetString(nativePtr, commentColumnInfo.threadIdIndex, j2, realmGet$threadId, false);
                }
                String realmGet$threadType = ru_unicorn_ujin_data_realm_marketplace_commentrealmproxyinterface.realmGet$threadType();
                if (realmGet$threadType != null) {
                    Table.nativeSetString(nativePtr, commentColumnInfo.threadTypeIndex, j2, realmGet$threadType, false);
                }
                String realmGet$authorName = ru_unicorn_ujin_data_realm_marketplace_commentrealmproxyinterface.realmGet$authorName();
                if (realmGet$authorName != null) {
                    Table.nativeSetString(nativePtr, commentColumnInfo.authorNameIndex, j2, realmGet$authorName, false);
                }
                String realmGet$message = ru_unicorn_ujin_data_realm_marketplace_commentrealmproxyinterface.realmGet$message();
                if (realmGet$message != null) {
                    Table.nativeSetString(nativePtr, commentColumnInfo.messageIndex, j2, realmGet$message, false);
                }
                String realmGet$vote = ru_unicorn_ujin_data_realm_marketplace_commentrealmproxyinterface.realmGet$vote();
                if (realmGet$vote != null) {
                    Table.nativeSetString(nativePtr, commentColumnInfo.voteIndex, j2, realmGet$vote, false);
                }
                String realmGet$date = ru_unicorn_ujin_data_realm_marketplace_commentrealmproxyinterface.realmGet$date();
                if (realmGet$date != null) {
                    Table.nativeSetString(nativePtr, commentColumnInfo.dateIndex, j2, realmGet$date, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, Comment comment, Map<RealmModel, Long> map) {
        long j;
        Comment comment2 = comment;
        if (comment2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) comment2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(Comment.class);
        long nativePtr = table.getNativePtr();
        CommentColumnInfo commentColumnInfo = (CommentColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Comment.class);
        long j2 = commentColumnInfo.idIndex;
        C4609xf6b1932 ru_unicorn_ujin_data_realm_marketplace_commentrealmproxyinterface = comment2;
        String realmGet$id = ru_unicorn_ujin_data_realm_marketplace_commentrealmproxyinterface.realmGet$id();
        if (realmGet$id == null) {
            j = Table.nativeFindFirstNull(nativePtr, j2);
        } else {
            j = Table.nativeFindFirstString(nativePtr, j2, realmGet$id);
        }
        long createRowWithPrimaryKey = j == -1 ? OsObject.createRowWithPrimaryKey(table, j2, realmGet$id) : j;
        map.put(comment2, Long.valueOf(createRowWithPrimaryKey));
        String realmGet$threadId = ru_unicorn_ujin_data_realm_marketplace_commentrealmproxyinterface.realmGet$threadId();
        if (realmGet$threadId != null) {
            Table.nativeSetString(nativePtr, commentColumnInfo.threadIdIndex, createRowWithPrimaryKey, realmGet$threadId, false);
        } else {
            Table.nativeSetNull(nativePtr, commentColumnInfo.threadIdIndex, createRowWithPrimaryKey, false);
        }
        String realmGet$threadType = ru_unicorn_ujin_data_realm_marketplace_commentrealmproxyinterface.realmGet$threadType();
        if (realmGet$threadType != null) {
            Table.nativeSetString(nativePtr, commentColumnInfo.threadTypeIndex, createRowWithPrimaryKey, realmGet$threadType, false);
        } else {
            Table.nativeSetNull(nativePtr, commentColumnInfo.threadTypeIndex, createRowWithPrimaryKey, false);
        }
        String realmGet$authorName = ru_unicorn_ujin_data_realm_marketplace_commentrealmproxyinterface.realmGet$authorName();
        if (realmGet$authorName != null) {
            Table.nativeSetString(nativePtr, commentColumnInfo.authorNameIndex, createRowWithPrimaryKey, realmGet$authorName, false);
        } else {
            Table.nativeSetNull(nativePtr, commentColumnInfo.authorNameIndex, createRowWithPrimaryKey, false);
        }
        String realmGet$message = ru_unicorn_ujin_data_realm_marketplace_commentrealmproxyinterface.realmGet$message();
        if (realmGet$message != null) {
            Table.nativeSetString(nativePtr, commentColumnInfo.messageIndex, createRowWithPrimaryKey, realmGet$message, false);
        } else {
            Table.nativeSetNull(nativePtr, commentColumnInfo.messageIndex, createRowWithPrimaryKey, false);
        }
        String realmGet$vote = ru_unicorn_ujin_data_realm_marketplace_commentrealmproxyinterface.realmGet$vote();
        if (realmGet$vote != null) {
            Table.nativeSetString(nativePtr, commentColumnInfo.voteIndex, createRowWithPrimaryKey, realmGet$vote, false);
        } else {
            Table.nativeSetNull(nativePtr, commentColumnInfo.voteIndex, createRowWithPrimaryKey, false);
        }
        String realmGet$date = ru_unicorn_ujin_data_realm_marketplace_commentrealmproxyinterface.realmGet$date();
        if (realmGet$date != null) {
            Table.nativeSetString(nativePtr, commentColumnInfo.dateIndex, createRowWithPrimaryKey, realmGet$date, false);
        } else {
            Table.nativeSetNull(nativePtr, commentColumnInfo.dateIndex, createRowWithPrimaryKey, false);
        }
        return createRowWithPrimaryKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(Comment.class);
        long nativePtr = table.getNativePtr();
        CommentColumnInfo commentColumnInfo = (CommentColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Comment.class);
        long j2 = commentColumnInfo.idIndex;
        while (it.hasNext()) {
            Comment comment = (Comment) it.next();
            if (!map2.containsKey(comment)) {
                if (comment instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) comment;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(comment, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                C4609xf6b1932 ru_unicorn_ujin_data_realm_marketplace_commentrealmproxyinterface = comment;
                String realmGet$id = ru_unicorn_ujin_data_realm_marketplace_commentrealmproxyinterface.realmGet$id();
                if (realmGet$id == null) {
                    j = Table.nativeFindFirstNull(nativePtr, j2);
                } else {
                    j = Table.nativeFindFirstString(nativePtr, j2, realmGet$id);
                }
                long createRowWithPrimaryKey = j == -1 ? OsObject.createRowWithPrimaryKey(table, j2, realmGet$id) : j;
                map2.put(comment, Long.valueOf(createRowWithPrimaryKey));
                String realmGet$threadId = ru_unicorn_ujin_data_realm_marketplace_commentrealmproxyinterface.realmGet$threadId();
                if (realmGet$threadId != null) {
                    Table.nativeSetString(nativePtr, commentColumnInfo.threadIdIndex, createRowWithPrimaryKey, realmGet$threadId, false);
                } else {
                    Table.nativeSetNull(nativePtr, commentColumnInfo.threadIdIndex, createRowWithPrimaryKey, false);
                }
                String realmGet$threadType = ru_unicorn_ujin_data_realm_marketplace_commentrealmproxyinterface.realmGet$threadType();
                if (realmGet$threadType != null) {
                    Table.nativeSetString(nativePtr, commentColumnInfo.threadTypeIndex, createRowWithPrimaryKey, realmGet$threadType, false);
                } else {
                    Table.nativeSetNull(nativePtr, commentColumnInfo.threadTypeIndex, createRowWithPrimaryKey, false);
                }
                String realmGet$authorName = ru_unicorn_ujin_data_realm_marketplace_commentrealmproxyinterface.realmGet$authorName();
                if (realmGet$authorName != null) {
                    Table.nativeSetString(nativePtr, commentColumnInfo.authorNameIndex, createRowWithPrimaryKey, realmGet$authorName, false);
                } else {
                    Table.nativeSetNull(nativePtr, commentColumnInfo.authorNameIndex, createRowWithPrimaryKey, false);
                }
                String realmGet$message = ru_unicorn_ujin_data_realm_marketplace_commentrealmproxyinterface.realmGet$message();
                if (realmGet$message != null) {
                    Table.nativeSetString(nativePtr, commentColumnInfo.messageIndex, createRowWithPrimaryKey, realmGet$message, false);
                } else {
                    Table.nativeSetNull(nativePtr, commentColumnInfo.messageIndex, createRowWithPrimaryKey, false);
                }
                String realmGet$vote = ru_unicorn_ujin_data_realm_marketplace_commentrealmproxyinterface.realmGet$vote();
                if (realmGet$vote != null) {
                    Table.nativeSetString(nativePtr, commentColumnInfo.voteIndex, createRowWithPrimaryKey, realmGet$vote, false);
                } else {
                    Table.nativeSetNull(nativePtr, commentColumnInfo.voteIndex, createRowWithPrimaryKey, false);
                }
                String realmGet$date = ru_unicorn_ujin_data_realm_marketplace_commentrealmproxyinterface.realmGet$date();
                if (realmGet$date != null) {
                    Table.nativeSetString(nativePtr, commentColumnInfo.dateIndex, createRowWithPrimaryKey, realmGet$date, false);
                } else {
                    Table.nativeSetNull(nativePtr, commentColumnInfo.dateIndex, createRowWithPrimaryKey, false);
                }
            }
        }
    }

    public static Comment createDetachedCopy(Comment comment, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        Comment comment2;
        if (i > i2 || comment == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(comment);
        if (cacheData == null) {
            comment2 = new Comment();
            map.put(comment, new RealmObjectProxy.CacheData(i, comment2));
        } else if (i >= cacheData.minDepth) {
            return (Comment) cacheData.object;
        } else {
            cacheData.minDepth = i;
            comment2 = (Comment) cacheData.object;
        }
        C4609xf6b1932 ru_unicorn_ujin_data_realm_marketplace_commentrealmproxyinterface = comment2;
        C4609xf6b1932 ru_unicorn_ujin_data_realm_marketplace_commentrealmproxyinterface2 = comment;
        ru_unicorn_ujin_data_realm_marketplace_commentrealmproxyinterface.realmSet$id(ru_unicorn_ujin_data_realm_marketplace_commentrealmproxyinterface2.realmGet$id());
        ru_unicorn_ujin_data_realm_marketplace_commentrealmproxyinterface.realmSet$threadId(ru_unicorn_ujin_data_realm_marketplace_commentrealmproxyinterface2.realmGet$threadId());
        ru_unicorn_ujin_data_realm_marketplace_commentrealmproxyinterface.realmSet$threadType(ru_unicorn_ujin_data_realm_marketplace_commentrealmproxyinterface2.realmGet$threadType());
        ru_unicorn_ujin_data_realm_marketplace_commentrealmproxyinterface.realmSet$authorName(ru_unicorn_ujin_data_realm_marketplace_commentrealmproxyinterface2.realmGet$authorName());
        ru_unicorn_ujin_data_realm_marketplace_commentrealmproxyinterface.realmSet$message(ru_unicorn_ujin_data_realm_marketplace_commentrealmproxyinterface2.realmGet$message());
        ru_unicorn_ujin_data_realm_marketplace_commentrealmproxyinterface.realmSet$vote(ru_unicorn_ujin_data_realm_marketplace_commentrealmproxyinterface2.realmGet$vote());
        ru_unicorn_ujin_data_realm_marketplace_commentrealmproxyinterface.realmSet$date(ru_unicorn_ujin_data_realm_marketplace_commentrealmproxyinterface2.realmGet$date());
        return comment2;
    }

    static Comment update(Realm realm, CommentColumnInfo commentColumnInfo, Comment comment, Comment comment2, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        C4609xf6b1932 ru_unicorn_ujin_data_realm_marketplace_commentrealmproxyinterface = comment;
        C4609xf6b1932 ru_unicorn_ujin_data_realm_marketplace_commentrealmproxyinterface2 = comment2;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(Comment.class), commentColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(commentColumnInfo.idIndex, ru_unicorn_ujin_data_realm_marketplace_commentrealmproxyinterface2.realmGet$id());
        osObjectBuilder.addString(commentColumnInfo.threadIdIndex, ru_unicorn_ujin_data_realm_marketplace_commentrealmproxyinterface2.realmGet$threadId());
        osObjectBuilder.addString(commentColumnInfo.threadTypeIndex, ru_unicorn_ujin_data_realm_marketplace_commentrealmproxyinterface2.realmGet$threadType());
        osObjectBuilder.addString(commentColumnInfo.authorNameIndex, ru_unicorn_ujin_data_realm_marketplace_commentrealmproxyinterface2.realmGet$authorName());
        osObjectBuilder.addString(commentColumnInfo.messageIndex, ru_unicorn_ujin_data_realm_marketplace_commentrealmproxyinterface2.realmGet$message());
        osObjectBuilder.addString(commentColumnInfo.voteIndex, ru_unicorn_ujin_data_realm_marketplace_commentrealmproxyinterface2.realmGet$vote());
        osObjectBuilder.addString(commentColumnInfo.dateIndex, ru_unicorn_ujin_data_realm_marketplace_commentrealmproxyinterface2.realmGet$date());
        osObjectBuilder.updateExistingObject();
        return comment;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("Comment = proxy[");
        sb.append("{id:");
        String str = "null";
        sb.append(realmGet$id() != null ? realmGet$id() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{threadId:");
        sb.append(realmGet$threadId() != null ? realmGet$threadId() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{threadType:");
        sb.append(realmGet$threadType() != null ? realmGet$threadType() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{authorName:");
        sb.append(realmGet$authorName() != null ? realmGet$authorName() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{message:");
        sb.append(realmGet$message() != null ? realmGet$message() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{vote:");
        sb.append(realmGet$vote() != null ? realmGet$vote() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{date:");
        if (realmGet$date() != null) {
            str = realmGet$date();
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
        ru_unicorn_ujin_data_realm_marketplace_CommentRealmProxy ru_unicorn_ujin_data_realm_marketplace_commentrealmproxy = (ru_unicorn_ujin_data_realm_marketplace_CommentRealmProxy) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_data_realm_marketplace_commentrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_data_realm_marketplace_commentrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_data_realm_marketplace_commentrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
