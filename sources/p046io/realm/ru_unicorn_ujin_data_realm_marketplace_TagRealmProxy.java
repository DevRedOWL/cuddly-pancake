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
import p035ru.unicorn.ujin.data.realm.marketplace.Tag;
import p046io.realm.BaseRealm;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_data_realm_marketplace_TagRealmProxy */
public class ru_unicorn_ujin_data_realm_marketplace_TagRealmProxy extends Tag implements RealmObjectProxy, ru_unicorn_ujin_data_realm_marketplace_TagRealmProxyInterface {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private TagColumnInfo columnInfo;
    private ProxyState<Tag> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_marketplace_TagRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Tag";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_marketplace_TagRealmProxy$TagColumnInfo */
    static final class TagColumnInfo extends ColumnInfo {
        long colorIndex;
        long idIndex;
        long maxColumnIndexValue;
        long titleIndex;

        TagColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(3);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.titleIndex = addColumnDetails("title", "title", objectSchemaInfo);
            this.colorIndex = addColumnDetails("color", "color", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        TagColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new TagColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            TagColumnInfo tagColumnInfo = (TagColumnInfo) columnInfo;
            TagColumnInfo tagColumnInfo2 = (TagColumnInfo) columnInfo2;
            tagColumnInfo2.idIndex = tagColumnInfo.idIndex;
            tagColumnInfo2.titleIndex = tagColumnInfo.titleIndex;
            tagColumnInfo2.colorIndex = tagColumnInfo.colorIndex;
            tagColumnInfo2.maxColumnIndexValue = tagColumnInfo.maxColumnIndexValue;
        }
    }

    ru_unicorn_ujin_data_realm_marketplace_TagRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (TagColumnInfo) realmObjectContext.getColumnInfo();
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
            if (num == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.idIndex);
            } else {
                this.proxyState.getRow$realm().setLong(this.columnInfo.idIndex, (long) num.intValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (num == null) {
                row$realm.getTable().setNull(this.columnInfo.idIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setLong(this.columnInfo.idIndex, row$realm.getIndex(), (long) num.intValue(), true);
            }
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

    public String realmGet$color() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.colorIndex);
    }

    public void realmSet$color(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.colorIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.colorIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.colorIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.colorIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 3, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("id", RealmFieldType.INTEGER, false, false, false);
        builder2.addPersistedProperty("title", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("color", RealmFieldType.STRING, false, false, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static TagColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new TagColumnInfo(osSchemaInfo);
    }

    public static Tag createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        Tag tag = (Tag) realm.createObjectInternal(Tag.class, true, Collections.emptyList());
        ru_unicorn_ujin_data_realm_marketplace_TagRealmProxyInterface ru_unicorn_ujin_data_realm_marketplace_tagrealmproxyinterface = tag;
        if (jSONObject.has("id")) {
            if (jSONObject.isNull("id")) {
                ru_unicorn_ujin_data_realm_marketplace_tagrealmproxyinterface.realmSet$id((Integer) null);
            } else {
                ru_unicorn_ujin_data_realm_marketplace_tagrealmproxyinterface.realmSet$id(Integer.valueOf(jSONObject.getInt("id")));
            }
        }
        if (jSONObject.has("title")) {
            if (jSONObject.isNull("title")) {
                ru_unicorn_ujin_data_realm_marketplace_tagrealmproxyinterface.realmSet$title((String) null);
            } else {
                ru_unicorn_ujin_data_realm_marketplace_tagrealmproxyinterface.realmSet$title(jSONObject.getString("title"));
            }
        }
        if (jSONObject.has("color")) {
            if (jSONObject.isNull("color")) {
                ru_unicorn_ujin_data_realm_marketplace_tagrealmproxyinterface.realmSet$color((String) null);
            } else {
                ru_unicorn_ujin_data_realm_marketplace_tagrealmproxyinterface.realmSet$color(jSONObject.getString("color"));
            }
        }
        return tag;
    }

    public static Tag createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        Tag tag = new Tag();
        ru_unicorn_ujin_data_realm_marketplace_TagRealmProxyInterface ru_unicorn_ujin_data_realm_marketplace_tagrealmproxyinterface = tag;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("id")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_marketplace_tagrealmproxyinterface.realmSet$id(Integer.valueOf(jsonReader.nextInt()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_tagrealmproxyinterface.realmSet$id((Integer) null);
                }
            } else if (nextName.equals("title")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_marketplace_tagrealmproxyinterface.realmSet$title(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_tagrealmproxyinterface.realmSet$title((String) null);
                }
            } else if (!nextName.equals("color")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_data_realm_marketplace_tagrealmproxyinterface.realmSet$color(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_data_realm_marketplace_tagrealmproxyinterface.realmSet$color((String) null);
            }
        }
        jsonReader.endObject();
        return (Tag) realm.copyToRealm(tag, new ImportFlag[0]);
    }

    private static ru_unicorn_ujin_data_realm_marketplace_TagRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) Tag.class), false, Collections.emptyList());
        ru_unicorn_ujin_data_realm_marketplace_TagRealmProxy ru_unicorn_ujin_data_realm_marketplace_tagrealmproxy = new ru_unicorn_ujin_data_realm_marketplace_TagRealmProxy();
        realmObjectContext.clear();
        return ru_unicorn_ujin_data_realm_marketplace_tagrealmproxy;
    }

    public static Tag copyOrUpdate(Realm realm, TagColumnInfo tagColumnInfo, Tag tag, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (tag instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) tag;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return tag;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(tag);
        if (realmObjectProxy2 != null) {
            return (Tag) realmObjectProxy2;
        }
        return copy(realm, tagColumnInfo, tag, z, map, set);
    }

    public static Tag copy(Realm realm, TagColumnInfo tagColumnInfo, Tag tag, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(tag);
        if (realmObjectProxy != null) {
            return (Tag) realmObjectProxy;
        }
        ru_unicorn_ujin_data_realm_marketplace_TagRealmProxyInterface ru_unicorn_ujin_data_realm_marketplace_tagrealmproxyinterface = tag;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(Tag.class), tagColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addInteger(tagColumnInfo.idIndex, ru_unicorn_ujin_data_realm_marketplace_tagrealmproxyinterface.realmGet$id());
        osObjectBuilder.addString(tagColumnInfo.titleIndex, ru_unicorn_ujin_data_realm_marketplace_tagrealmproxyinterface.realmGet$title());
        osObjectBuilder.addString(tagColumnInfo.colorIndex, ru_unicorn_ujin_data_realm_marketplace_tagrealmproxyinterface.realmGet$color());
        ru_unicorn_ujin_data_realm_marketplace_TagRealmProxy newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(tag, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, Tag tag, Map<RealmModel, Long> map) {
        Tag tag2 = tag;
        if (tag2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) tag2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(Tag.class);
        long nativePtr = table.getNativePtr();
        TagColumnInfo tagColumnInfo = (TagColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Tag.class);
        long createRow = OsObject.createRow(table);
        map.put(tag2, Long.valueOf(createRow));
        ru_unicorn_ujin_data_realm_marketplace_TagRealmProxyInterface ru_unicorn_ujin_data_realm_marketplace_tagrealmproxyinterface = tag2;
        Integer realmGet$id = ru_unicorn_ujin_data_realm_marketplace_tagrealmproxyinterface.realmGet$id();
        if (realmGet$id != null) {
            Table.nativeSetLong(nativePtr, tagColumnInfo.idIndex, createRow, realmGet$id.longValue(), false);
        }
        String realmGet$title = ru_unicorn_ujin_data_realm_marketplace_tagrealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, tagColumnInfo.titleIndex, createRow, realmGet$title, false);
        }
        String realmGet$color = ru_unicorn_ujin_data_realm_marketplace_tagrealmproxyinterface.realmGet$color();
        if (realmGet$color != null) {
            Table.nativeSetString(nativePtr, tagColumnInfo.colorIndex, createRow, realmGet$color, false);
        }
        return createRow;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(Tag.class);
        long nativePtr = table.getNativePtr();
        TagColumnInfo tagColumnInfo = (TagColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Tag.class);
        while (it.hasNext()) {
            Tag tag = (Tag) it.next();
            if (!map2.containsKey(tag)) {
                if (tag instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) tag;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(tag, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(tag, Long.valueOf(createRow));
                ru_unicorn_ujin_data_realm_marketplace_TagRealmProxyInterface ru_unicorn_ujin_data_realm_marketplace_tagrealmproxyinterface = tag;
                Integer realmGet$id = ru_unicorn_ujin_data_realm_marketplace_tagrealmproxyinterface.realmGet$id();
                if (realmGet$id != null) {
                    Table.nativeSetLong(nativePtr, tagColumnInfo.idIndex, createRow, realmGet$id.longValue(), false);
                }
                String realmGet$title = ru_unicorn_ujin_data_realm_marketplace_tagrealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    Table.nativeSetString(nativePtr, tagColumnInfo.titleIndex, createRow, realmGet$title, false);
                }
                String realmGet$color = ru_unicorn_ujin_data_realm_marketplace_tagrealmproxyinterface.realmGet$color();
                if (realmGet$color != null) {
                    Table.nativeSetString(nativePtr, tagColumnInfo.colorIndex, createRow, realmGet$color, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, Tag tag, Map<RealmModel, Long> map) {
        Tag tag2 = tag;
        if (tag2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) tag2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(Tag.class);
        long nativePtr = table.getNativePtr();
        TagColumnInfo tagColumnInfo = (TagColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Tag.class);
        long createRow = OsObject.createRow(table);
        map.put(tag2, Long.valueOf(createRow));
        ru_unicorn_ujin_data_realm_marketplace_TagRealmProxyInterface ru_unicorn_ujin_data_realm_marketplace_tagrealmproxyinterface = tag2;
        Integer realmGet$id = ru_unicorn_ujin_data_realm_marketplace_tagrealmproxyinterface.realmGet$id();
        if (realmGet$id != null) {
            Table.nativeSetLong(nativePtr, tagColumnInfo.idIndex, createRow, realmGet$id.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, tagColumnInfo.idIndex, createRow, false);
        }
        String realmGet$title = ru_unicorn_ujin_data_realm_marketplace_tagrealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, tagColumnInfo.titleIndex, createRow, realmGet$title, false);
        } else {
            Table.nativeSetNull(nativePtr, tagColumnInfo.titleIndex, createRow, false);
        }
        String realmGet$color = ru_unicorn_ujin_data_realm_marketplace_tagrealmproxyinterface.realmGet$color();
        if (realmGet$color != null) {
            Table.nativeSetString(nativePtr, tagColumnInfo.colorIndex, createRow, realmGet$color, false);
        } else {
            Table.nativeSetNull(nativePtr, tagColumnInfo.colorIndex, createRow, false);
        }
        return createRow;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(Tag.class);
        long nativePtr = table.getNativePtr();
        TagColumnInfo tagColumnInfo = (TagColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Tag.class);
        while (it.hasNext()) {
            Tag tag = (Tag) it.next();
            if (!map2.containsKey(tag)) {
                if (tag instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) tag;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(tag, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(tag, Long.valueOf(createRow));
                ru_unicorn_ujin_data_realm_marketplace_TagRealmProxyInterface ru_unicorn_ujin_data_realm_marketplace_tagrealmproxyinterface = tag;
                Integer realmGet$id = ru_unicorn_ujin_data_realm_marketplace_tagrealmproxyinterface.realmGet$id();
                if (realmGet$id != null) {
                    Table.nativeSetLong(nativePtr, tagColumnInfo.idIndex, createRow, realmGet$id.longValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, tagColumnInfo.idIndex, createRow, false);
                }
                String realmGet$title = ru_unicorn_ujin_data_realm_marketplace_tagrealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    Table.nativeSetString(nativePtr, tagColumnInfo.titleIndex, createRow, realmGet$title, false);
                } else {
                    Table.nativeSetNull(nativePtr, tagColumnInfo.titleIndex, createRow, false);
                }
                String realmGet$color = ru_unicorn_ujin_data_realm_marketplace_tagrealmproxyinterface.realmGet$color();
                if (realmGet$color != null) {
                    Table.nativeSetString(nativePtr, tagColumnInfo.colorIndex, createRow, realmGet$color, false);
                } else {
                    Table.nativeSetNull(nativePtr, tagColumnInfo.colorIndex, createRow, false);
                }
            }
        }
    }

    public static Tag createDetachedCopy(Tag tag, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        Tag tag2;
        if (i > i2 || tag == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(tag);
        if (cacheData == null) {
            tag2 = new Tag();
            map.put(tag, new RealmObjectProxy.CacheData(i, tag2));
        } else if (i >= cacheData.minDepth) {
            return (Tag) cacheData.object;
        } else {
            cacheData.minDepth = i;
            tag2 = (Tag) cacheData.object;
        }
        ru_unicorn_ujin_data_realm_marketplace_TagRealmProxyInterface ru_unicorn_ujin_data_realm_marketplace_tagrealmproxyinterface = tag2;
        ru_unicorn_ujin_data_realm_marketplace_TagRealmProxyInterface ru_unicorn_ujin_data_realm_marketplace_tagrealmproxyinterface2 = tag;
        ru_unicorn_ujin_data_realm_marketplace_tagrealmproxyinterface.realmSet$id(ru_unicorn_ujin_data_realm_marketplace_tagrealmproxyinterface2.realmGet$id());
        ru_unicorn_ujin_data_realm_marketplace_tagrealmproxyinterface.realmSet$title(ru_unicorn_ujin_data_realm_marketplace_tagrealmproxyinterface2.realmGet$title());
        ru_unicorn_ujin_data_realm_marketplace_tagrealmproxyinterface.realmSet$color(ru_unicorn_ujin_data_realm_marketplace_tagrealmproxyinterface2.realmGet$color());
        return tag2;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("Tag = proxy[");
        sb.append("{id:");
        String str = "null";
        sb.append(realmGet$id() != null ? realmGet$id() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{title:");
        sb.append(realmGet$title() != null ? realmGet$title() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{color:");
        if (realmGet$color() != null) {
            str = realmGet$color();
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
        ru_unicorn_ujin_data_realm_marketplace_TagRealmProxy ru_unicorn_ujin_data_realm_marketplace_tagrealmproxy = (ru_unicorn_ujin_data_realm_marketplace_TagRealmProxy) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_data_realm_marketplace_tagrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_data_realm_marketplace_tagrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_data_realm_marketplace_tagrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
