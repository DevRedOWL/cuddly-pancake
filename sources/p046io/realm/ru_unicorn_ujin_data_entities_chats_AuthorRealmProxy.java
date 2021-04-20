package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import p035ru.unicorn.ujin.data.entities.chats.Author;
import p046io.realm.BaseRealm;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_data_entities_chats_AuthorRealmProxy */
public class ru_unicorn_ujin_data_entities_chats_AuthorRealmProxy extends Author implements RealmObjectProxy, ru_unicorn_ujin_data_entities_chats_AuthorRealmProxyInterface {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private AuthorColumnInfo columnInfo;
    private ProxyState<Author> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_data_entities_chats_AuthorRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Author";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_data_entities_chats_AuthorRealmProxy$AuthorColumnInfo */
    static final class AuthorColumnInfo extends ColumnInfo {
        long authorIdIndex;
        long avatarUrlIndex;
        long fullNameIndex;
        long maxColumnIndexValue;

        AuthorColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(3);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.authorIdIndex = addColumnDetails("authorId", "authorId", objectSchemaInfo);
            this.fullNameIndex = addColumnDetails("fullName", "fullName", objectSchemaInfo);
            this.avatarUrlIndex = addColumnDetails("avatarUrl", "avatarUrl", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        AuthorColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new AuthorColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            AuthorColumnInfo authorColumnInfo = (AuthorColumnInfo) columnInfo;
            AuthorColumnInfo authorColumnInfo2 = (AuthorColumnInfo) columnInfo2;
            authorColumnInfo2.authorIdIndex = authorColumnInfo.authorIdIndex;
            authorColumnInfo2.fullNameIndex = authorColumnInfo.fullNameIndex;
            authorColumnInfo2.avatarUrlIndex = authorColumnInfo.avatarUrlIndex;
            authorColumnInfo2.maxColumnIndexValue = authorColumnInfo.maxColumnIndexValue;
        }
    }

    ru_unicorn_ujin_data_entities_chats_AuthorRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (AuthorColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public String realmGet$authorId() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.authorIdIndex);
    }

    public void realmSet$authorId(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str != null) {
                this.proxyState.getRow$realm().setString(this.columnInfo.authorIdIndex, str);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'authorId' to null.");
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str != null) {
                row$realm.getTable().setString(this.columnInfo.authorIdIndex, row$realm.getIndex(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'authorId' to null.");
        }
    }

    public String realmGet$fullName() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.fullNameIndex);
    }

    public void realmSet$fullName(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str != null) {
                this.proxyState.getRow$realm().setString(this.columnInfo.fullNameIndex, str);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'fullName' to null.");
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str != null) {
                row$realm.getTable().setString(this.columnInfo.fullNameIndex, row$realm.getIndex(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'fullName' to null.");
        }
    }

    public String realmGet$avatarUrl() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.avatarUrlIndex);
    }

    public void realmSet$avatarUrl(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str != null) {
                this.proxyState.getRow$realm().setString(this.columnInfo.avatarUrlIndex, str);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'avatarUrl' to null.");
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str != null) {
                row$realm.getTable().setString(this.columnInfo.avatarUrlIndex, row$realm.getIndex(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'avatarUrl' to null.");
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 3, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("authorId", RealmFieldType.STRING, false, false, true);
        builder2.addPersistedProperty("fullName", RealmFieldType.STRING, false, false, true);
        builder2.addPersistedProperty("avatarUrl", RealmFieldType.STRING, false, false, true);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static AuthorColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new AuthorColumnInfo(osSchemaInfo);
    }

    public static Author createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        Author author = (Author) realm.createObjectInternal(Author.class, true, Collections.emptyList());
        ru_unicorn_ujin_data_entities_chats_AuthorRealmProxyInterface ru_unicorn_ujin_data_entities_chats_authorrealmproxyinterface = author;
        if (jSONObject.has("authorId")) {
            if (jSONObject.isNull("authorId")) {
                ru_unicorn_ujin_data_entities_chats_authorrealmproxyinterface.realmSet$authorId((String) null);
            } else {
                ru_unicorn_ujin_data_entities_chats_authorrealmproxyinterface.realmSet$authorId(jSONObject.getString("authorId"));
            }
        }
        if (jSONObject.has("fullName")) {
            if (jSONObject.isNull("fullName")) {
                ru_unicorn_ujin_data_entities_chats_authorrealmproxyinterface.realmSet$fullName((String) null);
            } else {
                ru_unicorn_ujin_data_entities_chats_authorrealmproxyinterface.realmSet$fullName(jSONObject.getString("fullName"));
            }
        }
        if (jSONObject.has("avatarUrl")) {
            if (jSONObject.isNull("avatarUrl")) {
                ru_unicorn_ujin_data_entities_chats_authorrealmproxyinterface.realmSet$avatarUrl((String) null);
            } else {
                ru_unicorn_ujin_data_entities_chats_authorrealmproxyinterface.realmSet$avatarUrl(jSONObject.getString("avatarUrl"));
            }
        }
        return author;
    }

    public static Author createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        Author author = new Author();
        ru_unicorn_ujin_data_entities_chats_AuthorRealmProxyInterface ru_unicorn_ujin_data_entities_chats_authorrealmproxyinterface = author;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("authorId")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_entities_chats_authorrealmproxyinterface.realmSet$authorId(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_entities_chats_authorrealmproxyinterface.realmSet$authorId((String) null);
                }
            } else if (nextName.equals("fullName")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_entities_chats_authorrealmproxyinterface.realmSet$fullName(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_entities_chats_authorrealmproxyinterface.realmSet$fullName((String) null);
                }
            } else if (!nextName.equals("avatarUrl")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_data_entities_chats_authorrealmproxyinterface.realmSet$avatarUrl(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_data_entities_chats_authorrealmproxyinterface.realmSet$avatarUrl((String) null);
            }
        }
        jsonReader.endObject();
        return (Author) realm.copyToRealm(author, new ImportFlag[0]);
    }

    private static ru_unicorn_ujin_data_entities_chats_AuthorRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) Author.class), false, Collections.emptyList());
        ru_unicorn_ujin_data_entities_chats_AuthorRealmProxy ru_unicorn_ujin_data_entities_chats_authorrealmproxy = new ru_unicorn_ujin_data_entities_chats_AuthorRealmProxy();
        realmObjectContext.clear();
        return ru_unicorn_ujin_data_entities_chats_authorrealmproxy;
    }

    public static Author copyOrUpdate(Realm realm, AuthorColumnInfo authorColumnInfo, Author author, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (author instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) author;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return author;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(author);
        if (realmObjectProxy2 != null) {
            return (Author) realmObjectProxy2;
        }
        return copy(realm, authorColumnInfo, author, z, map, set);
    }

    public static Author copy(Realm realm, AuthorColumnInfo authorColumnInfo, Author author, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(author);
        if (realmObjectProxy != null) {
            return (Author) realmObjectProxy;
        }
        ru_unicorn_ujin_data_entities_chats_AuthorRealmProxyInterface ru_unicorn_ujin_data_entities_chats_authorrealmproxyinterface = author;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(Author.class), authorColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(authorColumnInfo.authorIdIndex, ru_unicorn_ujin_data_entities_chats_authorrealmproxyinterface.realmGet$authorId());
        osObjectBuilder.addString(authorColumnInfo.fullNameIndex, ru_unicorn_ujin_data_entities_chats_authorrealmproxyinterface.realmGet$fullName());
        osObjectBuilder.addString(authorColumnInfo.avatarUrlIndex, ru_unicorn_ujin_data_entities_chats_authorrealmproxyinterface.realmGet$avatarUrl());
        ru_unicorn_ujin_data_entities_chats_AuthorRealmProxy newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(author, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, Author author, Map<RealmModel, Long> map) {
        if (author instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) author;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(Author.class);
        long nativePtr = table.getNativePtr();
        AuthorColumnInfo authorColumnInfo = (AuthorColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Author.class);
        long createRow = OsObject.createRow(table);
        map.put(author, Long.valueOf(createRow));
        ru_unicorn_ujin_data_entities_chats_AuthorRealmProxyInterface ru_unicorn_ujin_data_entities_chats_authorrealmproxyinterface = author;
        String realmGet$authorId = ru_unicorn_ujin_data_entities_chats_authorrealmproxyinterface.realmGet$authorId();
        if (realmGet$authorId != null) {
            Table.nativeSetString(nativePtr, authorColumnInfo.authorIdIndex, createRow, realmGet$authorId, false);
        }
        String realmGet$fullName = ru_unicorn_ujin_data_entities_chats_authorrealmproxyinterface.realmGet$fullName();
        if (realmGet$fullName != null) {
            Table.nativeSetString(nativePtr, authorColumnInfo.fullNameIndex, createRow, realmGet$fullName, false);
        }
        String realmGet$avatarUrl = ru_unicorn_ujin_data_entities_chats_authorrealmproxyinterface.realmGet$avatarUrl();
        if (realmGet$avatarUrl != null) {
            Table.nativeSetString(nativePtr, authorColumnInfo.avatarUrlIndex, createRow, realmGet$avatarUrl, false);
        }
        return createRow;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(Author.class);
        long nativePtr = table.getNativePtr();
        AuthorColumnInfo authorColumnInfo = (AuthorColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Author.class);
        while (it.hasNext()) {
            Author author = (Author) it.next();
            if (!map2.containsKey(author)) {
                if (author instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) author;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(author, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(author, Long.valueOf(createRow));
                ru_unicorn_ujin_data_entities_chats_AuthorRealmProxyInterface ru_unicorn_ujin_data_entities_chats_authorrealmproxyinterface = author;
                String realmGet$authorId = ru_unicorn_ujin_data_entities_chats_authorrealmproxyinterface.realmGet$authorId();
                if (realmGet$authorId != null) {
                    Table.nativeSetString(nativePtr, authorColumnInfo.authorIdIndex, createRow, realmGet$authorId, false);
                }
                String realmGet$fullName = ru_unicorn_ujin_data_entities_chats_authorrealmproxyinterface.realmGet$fullName();
                if (realmGet$fullName != null) {
                    Table.nativeSetString(nativePtr, authorColumnInfo.fullNameIndex, createRow, realmGet$fullName, false);
                }
                String realmGet$avatarUrl = ru_unicorn_ujin_data_entities_chats_authorrealmproxyinterface.realmGet$avatarUrl();
                if (realmGet$avatarUrl != null) {
                    Table.nativeSetString(nativePtr, authorColumnInfo.avatarUrlIndex, createRow, realmGet$avatarUrl, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, Author author, Map<RealmModel, Long> map) {
        if (author instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) author;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(Author.class);
        long nativePtr = table.getNativePtr();
        AuthorColumnInfo authorColumnInfo = (AuthorColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Author.class);
        long createRow = OsObject.createRow(table);
        map.put(author, Long.valueOf(createRow));
        ru_unicorn_ujin_data_entities_chats_AuthorRealmProxyInterface ru_unicorn_ujin_data_entities_chats_authorrealmproxyinterface = author;
        String realmGet$authorId = ru_unicorn_ujin_data_entities_chats_authorrealmproxyinterface.realmGet$authorId();
        if (realmGet$authorId != null) {
            Table.nativeSetString(nativePtr, authorColumnInfo.authorIdIndex, createRow, realmGet$authorId, false);
        } else {
            Table.nativeSetNull(nativePtr, authorColumnInfo.authorIdIndex, createRow, false);
        }
        String realmGet$fullName = ru_unicorn_ujin_data_entities_chats_authorrealmproxyinterface.realmGet$fullName();
        if (realmGet$fullName != null) {
            Table.nativeSetString(nativePtr, authorColumnInfo.fullNameIndex, createRow, realmGet$fullName, false);
        } else {
            Table.nativeSetNull(nativePtr, authorColumnInfo.fullNameIndex, createRow, false);
        }
        String realmGet$avatarUrl = ru_unicorn_ujin_data_entities_chats_authorrealmproxyinterface.realmGet$avatarUrl();
        if (realmGet$avatarUrl != null) {
            Table.nativeSetString(nativePtr, authorColumnInfo.avatarUrlIndex, createRow, realmGet$avatarUrl, false);
        } else {
            Table.nativeSetNull(nativePtr, authorColumnInfo.avatarUrlIndex, createRow, false);
        }
        return createRow;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(Author.class);
        long nativePtr = table.getNativePtr();
        AuthorColumnInfo authorColumnInfo = (AuthorColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Author.class);
        while (it.hasNext()) {
            Author author = (Author) it.next();
            if (!map2.containsKey(author)) {
                if (author instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) author;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(author, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(author, Long.valueOf(createRow));
                ru_unicorn_ujin_data_entities_chats_AuthorRealmProxyInterface ru_unicorn_ujin_data_entities_chats_authorrealmproxyinterface = author;
                String realmGet$authorId = ru_unicorn_ujin_data_entities_chats_authorrealmproxyinterface.realmGet$authorId();
                if (realmGet$authorId != null) {
                    Table.nativeSetString(nativePtr, authorColumnInfo.authorIdIndex, createRow, realmGet$authorId, false);
                } else {
                    Table.nativeSetNull(nativePtr, authorColumnInfo.authorIdIndex, createRow, false);
                }
                String realmGet$fullName = ru_unicorn_ujin_data_entities_chats_authorrealmproxyinterface.realmGet$fullName();
                if (realmGet$fullName != null) {
                    Table.nativeSetString(nativePtr, authorColumnInfo.fullNameIndex, createRow, realmGet$fullName, false);
                } else {
                    Table.nativeSetNull(nativePtr, authorColumnInfo.fullNameIndex, createRow, false);
                }
                String realmGet$avatarUrl = ru_unicorn_ujin_data_entities_chats_authorrealmproxyinterface.realmGet$avatarUrl();
                if (realmGet$avatarUrl != null) {
                    Table.nativeSetString(nativePtr, authorColumnInfo.avatarUrlIndex, createRow, realmGet$avatarUrl, false);
                } else {
                    Table.nativeSetNull(nativePtr, authorColumnInfo.avatarUrlIndex, createRow, false);
                }
            }
        }
    }

    public static Author createDetachedCopy(Author author, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        Author author2;
        if (i > i2 || author == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(author);
        if (cacheData == null) {
            author2 = new Author();
            map.put(author, new RealmObjectProxy.CacheData(i, author2));
        } else if (i >= cacheData.minDepth) {
            return (Author) cacheData.object;
        } else {
            cacheData.minDepth = i;
            author2 = (Author) cacheData.object;
        }
        ru_unicorn_ujin_data_entities_chats_AuthorRealmProxyInterface ru_unicorn_ujin_data_entities_chats_authorrealmproxyinterface = author2;
        ru_unicorn_ujin_data_entities_chats_AuthorRealmProxyInterface ru_unicorn_ujin_data_entities_chats_authorrealmproxyinterface2 = author;
        ru_unicorn_ujin_data_entities_chats_authorrealmproxyinterface.realmSet$authorId(ru_unicorn_ujin_data_entities_chats_authorrealmproxyinterface2.realmGet$authorId());
        ru_unicorn_ujin_data_entities_chats_authorrealmproxyinterface.realmSet$fullName(ru_unicorn_ujin_data_entities_chats_authorrealmproxyinterface2.realmGet$fullName());
        ru_unicorn_ujin_data_entities_chats_authorrealmproxyinterface.realmSet$avatarUrl(ru_unicorn_ujin_data_entities_chats_authorrealmproxyinterface2.realmGet$avatarUrl());
        return author2;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        return "Author = proxy[" + "{authorId:" + realmGet$authorId() + "}" + "," + "{fullName:" + realmGet$fullName() + "}" + "," + "{avatarUrl:" + realmGet$avatarUrl() + "}" + "]";
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
        ru_unicorn_ujin_data_entities_chats_AuthorRealmProxy ru_unicorn_ujin_data_entities_chats_authorrealmproxy = (ru_unicorn_ujin_data_entities_chats_AuthorRealmProxy) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_data_entities_chats_authorrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_data_entities_chats_authorrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_data_entities_chats_authorrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
