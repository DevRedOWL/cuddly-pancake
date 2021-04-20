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
import p035ru.unicorn.ujin.view.activity.navigation.entity.Token;
import p046io.realm.BaseRealm;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_entity_TokenRealmProxy */
public class ru_unicorn_ujin_view_activity_navigation_entity_TokenRealmProxy extends Token implements RealmObjectProxy, C4641x6c66594a {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private TokenColumnInfo columnInfo;
    private ProxyState<Token> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_entity_TokenRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Token";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_entity_TokenRealmProxy$TokenColumnInfo */
    static final class TokenColumnInfo extends ColumnInfo {
        long maxColumnIndexValue;
        long tokenIndex;

        TokenColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(1);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.tokenIndex = addColumnDetails("token", "token", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        TokenColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new TokenColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            TokenColumnInfo tokenColumnInfo = (TokenColumnInfo) columnInfo;
            TokenColumnInfo tokenColumnInfo2 = (TokenColumnInfo) columnInfo2;
            tokenColumnInfo2.tokenIndex = tokenColumnInfo.tokenIndex;
            tokenColumnInfo2.maxColumnIndexValue = tokenColumnInfo.maxColumnIndexValue;
        }
    }

    ru_unicorn_ujin_view_activity_navigation_entity_TokenRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (TokenColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
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
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 1, 0);
        builder.addPersistedProperty("token", RealmFieldType.STRING, false, false, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static TokenColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new TokenColumnInfo(osSchemaInfo);
    }

    public static Token createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        Token token = (Token) realm.createObjectInternal(Token.class, true, Collections.emptyList());
        C4641x6c66594a ru_unicorn_ujin_view_activity_navigation_entity_tokenrealmproxyinterface = token;
        if (jSONObject.has("token")) {
            if (jSONObject.isNull("token")) {
                ru_unicorn_ujin_view_activity_navigation_entity_tokenrealmproxyinterface.realmSet$token((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_entity_tokenrealmproxyinterface.realmSet$token(jSONObject.getString("token"));
            }
        }
        return token;
    }

    public static Token createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        Token token = new Token();
        C4641x6c66594a ru_unicorn_ujin_view_activity_navigation_entity_tokenrealmproxyinterface = token;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (!jsonReader.nextName().equals("token")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_view_activity_navigation_entity_tokenrealmproxyinterface.realmSet$token(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_view_activity_navigation_entity_tokenrealmproxyinterface.realmSet$token((String) null);
            }
        }
        jsonReader.endObject();
        return (Token) realm.copyToRealm(token, new ImportFlag[0]);
    }

    private static ru_unicorn_ujin_view_activity_navigation_entity_TokenRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) Token.class), false, Collections.emptyList());
        ru_unicorn_ujin_view_activity_navigation_entity_TokenRealmProxy ru_unicorn_ujin_view_activity_navigation_entity_tokenrealmproxy = new ru_unicorn_ujin_view_activity_navigation_entity_TokenRealmProxy();
        realmObjectContext.clear();
        return ru_unicorn_ujin_view_activity_navigation_entity_tokenrealmproxy;
    }

    public static Token copyOrUpdate(Realm realm, TokenColumnInfo tokenColumnInfo, Token token, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (token instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) token;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return token;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(token);
        if (realmObjectProxy2 != null) {
            return (Token) realmObjectProxy2;
        }
        return copy(realm, tokenColumnInfo, token, z, map, set);
    }

    public static Token copy(Realm realm, TokenColumnInfo tokenColumnInfo, Token token, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(token);
        if (realmObjectProxy != null) {
            return (Token) realmObjectProxy;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(Token.class), tokenColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(tokenColumnInfo.tokenIndex, token.realmGet$token());
        ru_unicorn_ujin_view_activity_navigation_entity_TokenRealmProxy newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(token, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, Token token, Map<RealmModel, Long> map) {
        if (token instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) token;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(Token.class);
        long nativePtr = table.getNativePtr();
        TokenColumnInfo tokenColumnInfo = (TokenColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Token.class);
        long createRow = OsObject.createRow(table);
        map.put(token, Long.valueOf(createRow));
        String realmGet$token = token.realmGet$token();
        if (realmGet$token != null) {
            Table.nativeSetString(nativePtr, tokenColumnInfo.tokenIndex, createRow, realmGet$token, false);
        }
        return createRow;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Table table = realm.getTable(Token.class);
        long nativePtr = table.getNativePtr();
        TokenColumnInfo tokenColumnInfo = (TokenColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Token.class);
        while (it.hasNext()) {
            Token token = (Token) it.next();
            if (!map.containsKey(token)) {
                if (token instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) token;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(token, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map.put(token, Long.valueOf(createRow));
                String realmGet$token = token.realmGet$token();
                if (realmGet$token != null) {
                    Table.nativeSetString(nativePtr, tokenColumnInfo.tokenIndex, createRow, realmGet$token, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, Token token, Map<RealmModel, Long> map) {
        if (token instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) token;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(Token.class);
        long nativePtr = table.getNativePtr();
        TokenColumnInfo tokenColumnInfo = (TokenColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Token.class);
        long createRow = OsObject.createRow(table);
        map.put(token, Long.valueOf(createRow));
        String realmGet$token = token.realmGet$token();
        if (realmGet$token != null) {
            Table.nativeSetString(nativePtr, tokenColumnInfo.tokenIndex, createRow, realmGet$token, false);
        } else {
            Table.nativeSetNull(nativePtr, tokenColumnInfo.tokenIndex, createRow, false);
        }
        return createRow;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Table table = realm.getTable(Token.class);
        long nativePtr = table.getNativePtr();
        TokenColumnInfo tokenColumnInfo = (TokenColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Token.class);
        while (it.hasNext()) {
            Token token = (Token) it.next();
            if (!map.containsKey(token)) {
                if (token instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) token;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(token, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map.put(token, Long.valueOf(createRow));
                String realmGet$token = token.realmGet$token();
                if (realmGet$token != null) {
                    Table.nativeSetString(nativePtr, tokenColumnInfo.tokenIndex, createRow, realmGet$token, false);
                } else {
                    Table.nativeSetNull(nativePtr, tokenColumnInfo.tokenIndex, createRow, false);
                }
            }
        }
    }

    public static Token createDetachedCopy(Token token, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        Token token2;
        if (i > i2 || token == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(token);
        if (cacheData == null) {
            token2 = new Token();
            map.put(token, new RealmObjectProxy.CacheData(i, token2));
        } else if (i >= cacheData.minDepth) {
            return (Token) cacheData.object;
        } else {
            cacheData.minDepth = i;
            token2 = (Token) cacheData.object;
        }
        token2.realmSet$token(token.realmGet$token());
        return token2;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("Token = proxy[");
        sb.append("{token:");
        sb.append(realmGet$token() != null ? realmGet$token() : "null");
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
        ru_unicorn_ujin_view_activity_navigation_entity_TokenRealmProxy ru_unicorn_ujin_view_activity_navigation_entity_tokenrealmproxy = (ru_unicorn_ujin_view_activity_navigation_entity_TokenRealmProxy) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_view_activity_navigation_entity_tokenrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_view_activity_navigation_entity_tokenrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_view_activity_navigation_entity_tokenrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
