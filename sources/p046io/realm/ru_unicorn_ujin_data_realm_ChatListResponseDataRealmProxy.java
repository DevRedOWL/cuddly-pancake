package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p035ru.unicorn.ujin.data.realm.Chat;
import p035ru.unicorn.ujin.data.realm.ChatListResponseData;
import p046io.realm.BaseRealm;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsList;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;
import p046io.realm.ru_unicorn_ujin_data_realm_ChatRealmProxy;

/* renamed from: io.realm.ru_unicorn_ujin_data_realm_ChatListResponseDataRealmProxy */
public class ru_unicorn_ujin_data_realm_ChatListResponseDataRealmProxy extends ChatListResponseData implements RealmObjectProxy, C4598x353731f6 {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private RealmList<Chat> chatListRealmList;
    private ChatListResponseDataColumnInfo columnInfo;
    private ProxyState<ChatListResponseData> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_ChatListResponseDataRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "ChatListResponseData";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_ChatListResponseDataRealmProxy$ChatListResponseDataColumnInfo */
    static final class ChatListResponseDataColumnInfo extends ColumnInfo {
        long chatListIndex;
        long maxColumnIndexValue;
        long notReadCountIndex;
        long userIdIndex;

        ChatListResponseDataColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(3);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.userIdIndex = addColumnDetails("userId", "userId", objectSchemaInfo);
            this.chatListIndex = addColumnDetails("chatList", "chatList", objectSchemaInfo);
            this.notReadCountIndex = addColumnDetails("notReadCount", "notReadCount", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        ChatListResponseDataColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new ChatListResponseDataColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            ChatListResponseDataColumnInfo chatListResponseDataColumnInfo = (ChatListResponseDataColumnInfo) columnInfo;
            ChatListResponseDataColumnInfo chatListResponseDataColumnInfo2 = (ChatListResponseDataColumnInfo) columnInfo2;
            chatListResponseDataColumnInfo2.userIdIndex = chatListResponseDataColumnInfo.userIdIndex;
            chatListResponseDataColumnInfo2.chatListIndex = chatListResponseDataColumnInfo.chatListIndex;
            chatListResponseDataColumnInfo2.notReadCountIndex = chatListResponseDataColumnInfo.notReadCountIndex;
            chatListResponseDataColumnInfo2.maxColumnIndexValue = chatListResponseDataColumnInfo.maxColumnIndexValue;
        }
    }

    ru_unicorn_ujin_data_realm_ChatListResponseDataRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (ChatListResponseDataColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public String realmGet$userId() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.userIdIndex);
    }

    public void realmSet$userId(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.userIdIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.userIdIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.userIdIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.userIdIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public RealmList<Chat> realmGet$chatList() {
        this.proxyState.getRealm$realm().checkIfValid();
        RealmList<Chat> realmList = this.chatListRealmList;
        if (realmList != null) {
            return realmList;
        }
        this.chatListRealmList = new RealmList<>(Chat.class, this.proxyState.getRow$realm().getModelList(this.columnInfo.chatListIndex), this.proxyState.getRealm$realm());
        return this.chatListRealmList;
    }

    public void realmSet$chatList(RealmList<Chat> realmList) {
        int i = 0;
        if (this.proxyState.isUnderConstruction()) {
            if (!this.proxyState.getAcceptDefaultValue$realm() || this.proxyState.getExcludeFields$realm().contains("chatList")) {
                return;
            }
            if (realmList != null && !realmList.isManaged()) {
                Realm realm = (Realm) this.proxyState.getRealm$realm();
                RealmList<Chat> realmList2 = new RealmList<>();
                Iterator<Chat> it = realmList.iterator();
                while (it.hasNext()) {
                    Chat next = it.next();
                    if (next == null || RealmObject.isManaged(next)) {
                        realmList2.add(next);
                    } else {
                        realmList2.add(realm.copyToRealm(next, new ImportFlag[0]));
                    }
                }
                realmList = realmList2;
            }
        }
        this.proxyState.getRealm$realm().checkIfValid();
        OsList modelList = this.proxyState.getRow$realm().getModelList(this.columnInfo.chatListIndex);
        if (realmList == null || ((long) realmList.size()) != modelList.size()) {
            modelList.removeAll();
            if (realmList != null) {
                int size = realmList.size();
                while (i < size) {
                    Chat chat = realmList.get(i);
                    this.proxyState.checkValidObject(chat);
                    modelList.addRow(((RealmObjectProxy) chat).realmGet$proxyState().getRow$realm().getIndex());
                    i++;
                }
                return;
            }
            return;
        }
        int size2 = realmList.size();
        while (i < size2) {
            Chat chat2 = realmList.get(i);
            this.proxyState.checkValidObject(chat2);
            modelList.setRow((long) i, ((RealmObjectProxy) chat2).realmGet$proxyState().getRow$realm().getIndex());
            i++;
        }
    }

    public int realmGet$notReadCount() {
        this.proxyState.getRealm$realm().checkIfValid();
        return (int) this.proxyState.getRow$realm().getLong(this.columnInfo.notReadCountIndex);
    }

    public void realmSet$notReadCount(int i) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            this.proxyState.getRow$realm().setLong(this.columnInfo.notReadCountIndex, (long) i);
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            row$realm.getTable().setLong(this.columnInfo.notReadCountIndex, row$realm.getIndex(), (long) i, true);
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 3, 0);
        builder.addPersistedProperty("userId", RealmFieldType.STRING, false, false, false);
        builder.addPersistedLinkProperty("chatList", RealmFieldType.LIST, ru_unicorn_ujin_data_realm_ChatRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME);
        builder.addPersistedProperty("notReadCount", RealmFieldType.INTEGER, false, false, true);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static ChatListResponseDataColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new ChatListResponseDataColumnInfo(osSchemaInfo);
    }

    public static ChatListResponseData createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        ArrayList arrayList = new ArrayList(1);
        if (jSONObject.has("chatList")) {
            arrayList.add("chatList");
        }
        ChatListResponseData chatListResponseData = (ChatListResponseData) realm.createObjectInternal(ChatListResponseData.class, true, arrayList);
        C4598x353731f6 ru_unicorn_ujin_data_realm_chatlistresponsedatarealmproxyinterface = chatListResponseData;
        if (jSONObject.has("userId")) {
            if (jSONObject.isNull("userId")) {
                ru_unicorn_ujin_data_realm_chatlistresponsedatarealmproxyinterface.realmSet$userId((String) null);
            } else {
                ru_unicorn_ujin_data_realm_chatlistresponsedatarealmproxyinterface.realmSet$userId(jSONObject.getString("userId"));
            }
        }
        if (jSONObject.has("chatList")) {
            if (jSONObject.isNull("chatList")) {
                ru_unicorn_ujin_data_realm_chatlistresponsedatarealmproxyinterface.realmSet$chatList((RealmList<Chat>) null);
            } else {
                ru_unicorn_ujin_data_realm_chatlistresponsedatarealmproxyinterface.realmGet$chatList().clear();
                JSONArray jSONArray = jSONObject.getJSONArray("chatList");
                for (int i = 0; i < jSONArray.length(); i++) {
                    ru_unicorn_ujin_data_realm_chatlistresponsedatarealmproxyinterface.realmGet$chatList().add(ru_unicorn_ujin_data_realm_ChatRealmProxy.createOrUpdateUsingJsonObject(realm, jSONArray.getJSONObject(i), z));
                }
            }
        }
        if (jSONObject.has("notReadCount")) {
            if (!jSONObject.isNull("notReadCount")) {
                ru_unicorn_ujin_data_realm_chatlistresponsedatarealmproxyinterface.realmSet$notReadCount(jSONObject.getInt("notReadCount"));
            } else {
                throw new IllegalArgumentException("Trying to set non-nullable field 'notReadCount' to null.");
            }
        }
        return chatListResponseData;
    }

    public static ChatListResponseData createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        ChatListResponseData chatListResponseData = new ChatListResponseData();
        C4598x353731f6 ru_unicorn_ujin_data_realm_chatlistresponsedatarealmproxyinterface = chatListResponseData;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("userId")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_chatlistresponsedatarealmproxyinterface.realmSet$userId(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_chatlistresponsedatarealmproxyinterface.realmSet$userId((String) null);
                }
            } else if (nextName.equals("chatList")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_chatlistresponsedatarealmproxyinterface.realmSet$chatList((RealmList<Chat>) null);
                } else {
                    ru_unicorn_ujin_data_realm_chatlistresponsedatarealmproxyinterface.realmSet$chatList(new RealmList());
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        ru_unicorn_ujin_data_realm_chatlistresponsedatarealmproxyinterface.realmGet$chatList().add(ru_unicorn_ujin_data_realm_ChatRealmProxy.createUsingJsonStream(realm, jsonReader));
                    }
                    jsonReader.endArray();
                }
            } else if (!nextName.equals("notReadCount")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_data_realm_chatlistresponsedatarealmproxyinterface.realmSet$notReadCount(jsonReader.nextInt());
            } else {
                jsonReader.skipValue();
                throw new IllegalArgumentException("Trying to set non-nullable field 'notReadCount' to null.");
            }
        }
        jsonReader.endObject();
        return (ChatListResponseData) realm.copyToRealm(chatListResponseData, new ImportFlag[0]);
    }

    private static ru_unicorn_ujin_data_realm_ChatListResponseDataRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) ChatListResponseData.class), false, Collections.emptyList());
        ru_unicorn_ujin_data_realm_ChatListResponseDataRealmProxy ru_unicorn_ujin_data_realm_chatlistresponsedatarealmproxy = new ru_unicorn_ujin_data_realm_ChatListResponseDataRealmProxy();
        realmObjectContext.clear();
        return ru_unicorn_ujin_data_realm_chatlistresponsedatarealmproxy;
    }

    public static ChatListResponseData copyOrUpdate(Realm realm, ChatListResponseDataColumnInfo chatListResponseDataColumnInfo, ChatListResponseData chatListResponseData, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (chatListResponseData instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) chatListResponseData;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return chatListResponseData;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(chatListResponseData);
        if (realmObjectProxy2 != null) {
            return (ChatListResponseData) realmObjectProxy2;
        }
        return copy(realm, chatListResponseDataColumnInfo, chatListResponseData, z, map, set);
    }

    public static ChatListResponseData copy(Realm realm, ChatListResponseDataColumnInfo chatListResponseDataColumnInfo, ChatListResponseData chatListResponseData, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(chatListResponseData);
        if (realmObjectProxy != null) {
            return (ChatListResponseData) realmObjectProxy;
        }
        C4598x353731f6 ru_unicorn_ujin_data_realm_chatlistresponsedatarealmproxyinterface = chatListResponseData;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(ChatListResponseData.class), chatListResponseDataColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(chatListResponseDataColumnInfo.userIdIndex, ru_unicorn_ujin_data_realm_chatlistresponsedatarealmproxyinterface.realmGet$userId());
        osObjectBuilder.addInteger(chatListResponseDataColumnInfo.notReadCountIndex, Integer.valueOf(ru_unicorn_ujin_data_realm_chatlistresponsedatarealmproxyinterface.realmGet$notReadCount()));
        ru_unicorn_ujin_data_realm_ChatListResponseDataRealmProxy newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(chatListResponseData, newProxyInstance);
        RealmList<Chat> realmGet$chatList = ru_unicorn_ujin_data_realm_chatlistresponsedatarealmproxyinterface.realmGet$chatList();
        if (realmGet$chatList != null) {
            RealmList<Chat> realmGet$chatList2 = newProxyInstance.realmGet$chatList();
            realmGet$chatList2.clear();
            for (int i = 0; i < realmGet$chatList.size(); i++) {
                Chat chat = realmGet$chatList.get(i);
                Chat chat2 = (Chat) map.get(chat);
                if (chat2 != null) {
                    realmGet$chatList2.add(chat2);
                } else {
                    realmGet$chatList2.add(ru_unicorn_ujin_data_realm_ChatRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_ChatRealmProxy.ChatColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Chat.class), chat, z, map, set));
                }
            }
        }
        return newProxyInstance;
    }

    public static long insert(Realm realm, ChatListResponseData chatListResponseData, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Realm realm2 = realm;
        ChatListResponseData chatListResponseData2 = chatListResponseData;
        Map<RealmModel, Long> map2 = map;
        if (chatListResponseData2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) chatListResponseData2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(ChatListResponseData.class);
        long nativePtr = table.getNativePtr();
        ChatListResponseDataColumnInfo chatListResponseDataColumnInfo = (ChatListResponseDataColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ChatListResponseData.class);
        long createRow = OsObject.createRow(table);
        map2.put(chatListResponseData2, Long.valueOf(createRow));
        C4598x353731f6 ru_unicorn_ujin_data_realm_chatlistresponsedatarealmproxyinterface = chatListResponseData2;
        String realmGet$userId = ru_unicorn_ujin_data_realm_chatlistresponsedatarealmproxyinterface.realmGet$userId();
        if (realmGet$userId != null) {
            long j3 = nativePtr;
            j = nativePtr;
            j2 = createRow;
            Table.nativeSetString(j3, chatListResponseDataColumnInfo.userIdIndex, createRow, realmGet$userId, false);
        } else {
            j = nativePtr;
            j2 = createRow;
        }
        RealmList<Chat> realmGet$chatList = ru_unicorn_ujin_data_realm_chatlistresponsedatarealmproxyinterface.realmGet$chatList();
        if (realmGet$chatList != null) {
            OsList osList = new OsList(table.getUncheckedRow(j2), chatListResponseDataColumnInfo.chatListIndex);
            Iterator<Chat> it = realmGet$chatList.iterator();
            while (it.hasNext()) {
                Chat next = it.next();
                Long l = map2.get(next);
                if (l == null) {
                    l = Long.valueOf(ru_unicorn_ujin_data_realm_ChatRealmProxy.insert(realm2, next, map2));
                }
                osList.addRow(l.longValue());
            }
        }
        long j4 = j2;
        Table.nativeSetLong(j, chatListResponseDataColumnInfo.notReadCountIndex, j2, (long) ru_unicorn_ujin_data_realm_chatlistresponsedatarealmproxyinterface.realmGet$notReadCount(), false);
        return j4;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(ChatListResponseData.class);
        long nativePtr = table.getNativePtr();
        ChatListResponseDataColumnInfo chatListResponseDataColumnInfo = (ChatListResponseDataColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ChatListResponseData.class);
        while (it.hasNext()) {
            ChatListResponseData chatListResponseData = (ChatListResponseData) it.next();
            if (!map2.containsKey(chatListResponseData)) {
                if (chatListResponseData instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) chatListResponseData;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(chatListResponseData, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(chatListResponseData, Long.valueOf(createRow));
                C4598x353731f6 ru_unicorn_ujin_data_realm_chatlistresponsedatarealmproxyinterface = chatListResponseData;
                String realmGet$userId = ru_unicorn_ujin_data_realm_chatlistresponsedatarealmproxyinterface.realmGet$userId();
                if (realmGet$userId != null) {
                    j = nativePtr;
                    j2 = createRow;
                    Table.nativeSetString(nativePtr, chatListResponseDataColumnInfo.userIdIndex, createRow, realmGet$userId, false);
                } else {
                    j = nativePtr;
                    j2 = createRow;
                }
                RealmList<Chat> realmGet$chatList = ru_unicorn_ujin_data_realm_chatlistresponsedatarealmproxyinterface.realmGet$chatList();
                if (realmGet$chatList != null) {
                    OsList osList = new OsList(table.getUncheckedRow(j2), chatListResponseDataColumnInfo.chatListIndex);
                    Iterator<Chat> it2 = realmGet$chatList.iterator();
                    while (it2.hasNext()) {
                        Chat next = it2.next();
                        Long l = map2.get(next);
                        if (l == null) {
                            l = Long.valueOf(ru_unicorn_ujin_data_realm_ChatRealmProxy.insert(realm2, next, map2));
                        }
                        osList.addRow(l.longValue());
                    }
                }
                Table.nativeSetLong(j, chatListResponseDataColumnInfo.notReadCountIndex, j2, (long) ru_unicorn_ujin_data_realm_chatlistresponsedatarealmproxyinterface.realmGet$notReadCount(), false);
                nativePtr = j;
            }
        }
    }

    public static long insertOrUpdate(Realm realm, ChatListResponseData chatListResponseData, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Realm realm2 = realm;
        ChatListResponseData chatListResponseData2 = chatListResponseData;
        Map<RealmModel, Long> map2 = map;
        if (chatListResponseData2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) chatListResponseData2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(ChatListResponseData.class);
        long nativePtr = table.getNativePtr();
        ChatListResponseDataColumnInfo chatListResponseDataColumnInfo = (ChatListResponseDataColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ChatListResponseData.class);
        long createRow = OsObject.createRow(table);
        map2.put(chatListResponseData2, Long.valueOf(createRow));
        C4598x353731f6 ru_unicorn_ujin_data_realm_chatlistresponsedatarealmproxyinterface = chatListResponseData2;
        String realmGet$userId = ru_unicorn_ujin_data_realm_chatlistresponsedatarealmproxyinterface.realmGet$userId();
        if (realmGet$userId != null) {
            j = createRow;
            Table.nativeSetString(nativePtr, chatListResponseDataColumnInfo.userIdIndex, createRow, realmGet$userId, false);
        } else {
            j = createRow;
            Table.nativeSetNull(nativePtr, chatListResponseDataColumnInfo.userIdIndex, j, false);
        }
        long j3 = j;
        OsList osList = new OsList(table.getUncheckedRow(j3), chatListResponseDataColumnInfo.chatListIndex);
        RealmList<Chat> realmGet$chatList = ru_unicorn_ujin_data_realm_chatlistresponsedatarealmproxyinterface.realmGet$chatList();
        if (realmGet$chatList == null || ((long) realmGet$chatList.size()) != osList.size()) {
            j2 = j3;
            osList.removeAll();
            if (realmGet$chatList != null) {
                Iterator<Chat> it = realmGet$chatList.iterator();
                while (it.hasNext()) {
                    Chat next = it.next();
                    Long l = map2.get(next);
                    if (l == null) {
                        l = Long.valueOf(ru_unicorn_ujin_data_realm_ChatRealmProxy.insertOrUpdate(realm2, next, map2));
                    }
                    osList.addRow(l.longValue());
                }
            }
        } else {
            int size = realmGet$chatList.size();
            int i = 0;
            while (i < size) {
                Chat chat = realmGet$chatList.get(i);
                Long l2 = map2.get(chat);
                if (l2 == null) {
                    l2 = Long.valueOf(ru_unicorn_ujin_data_realm_ChatRealmProxy.insertOrUpdate(realm2, chat, map2));
                }
                osList.setRow((long) i, l2.longValue());
                i++;
                j3 = j3;
            }
            j2 = j3;
        }
        long j4 = j2;
        Table.nativeSetLong(nativePtr, chatListResponseDataColumnInfo.notReadCountIndex, j2, (long) ru_unicorn_ujin_data_realm_chatlistresponsedatarealmproxyinterface.realmGet$notReadCount(), false);
        return j4;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(ChatListResponseData.class);
        long nativePtr = table.getNativePtr();
        ChatListResponseDataColumnInfo chatListResponseDataColumnInfo = (ChatListResponseDataColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ChatListResponseData.class);
        while (it.hasNext()) {
            ChatListResponseData chatListResponseData = (ChatListResponseData) it.next();
            if (!map2.containsKey(chatListResponseData)) {
                if (chatListResponseData instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) chatListResponseData;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(chatListResponseData, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(chatListResponseData, Long.valueOf(createRow));
                C4598x353731f6 ru_unicorn_ujin_data_realm_chatlistresponsedatarealmproxyinterface = chatListResponseData;
                String realmGet$userId = ru_unicorn_ujin_data_realm_chatlistresponsedatarealmproxyinterface.realmGet$userId();
                if (realmGet$userId != null) {
                    j = createRow;
                    Table.nativeSetString(nativePtr, chatListResponseDataColumnInfo.userIdIndex, createRow, realmGet$userId, false);
                } else {
                    j = createRow;
                    Table.nativeSetNull(nativePtr, chatListResponseDataColumnInfo.userIdIndex, j, false);
                }
                long j3 = j;
                OsList osList = new OsList(table.getUncheckedRow(j3), chatListResponseDataColumnInfo.chatListIndex);
                RealmList<Chat> realmGet$chatList = ru_unicorn_ujin_data_realm_chatlistresponsedatarealmproxyinterface.realmGet$chatList();
                if (realmGet$chatList == null || ((long) realmGet$chatList.size()) != osList.size()) {
                    j2 = j3;
                    osList.removeAll();
                    if (realmGet$chatList != null) {
                        Iterator<Chat> it2 = realmGet$chatList.iterator();
                        while (it2.hasNext()) {
                            Chat next = it2.next();
                            Long l = map2.get(next);
                            if (l == null) {
                                l = Long.valueOf(ru_unicorn_ujin_data_realm_ChatRealmProxy.insertOrUpdate(realm2, next, map2));
                            }
                            osList.addRow(l.longValue());
                        }
                    }
                } else {
                    int size = realmGet$chatList.size();
                    int i = 0;
                    while (i < size) {
                        Chat chat = realmGet$chatList.get(i);
                        Long l2 = map2.get(chat);
                        if (l2 == null) {
                            l2 = Long.valueOf(ru_unicorn_ujin_data_realm_ChatRealmProxy.insertOrUpdate(realm2, chat, map2));
                        }
                        osList.setRow((long) i, l2.longValue());
                        i++;
                        j3 = j3;
                    }
                    j2 = j3;
                }
                Table.nativeSetLong(nativePtr, chatListResponseDataColumnInfo.notReadCountIndex, j2, (long) ru_unicorn_ujin_data_realm_chatlistresponsedatarealmproxyinterface.realmGet$notReadCount(), false);
            }
        }
    }

    public static ChatListResponseData createDetachedCopy(ChatListResponseData chatListResponseData, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        ChatListResponseData chatListResponseData2;
        if (i > i2 || chatListResponseData == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(chatListResponseData);
        if (cacheData == null) {
            chatListResponseData2 = new ChatListResponseData();
            map.put(chatListResponseData, new RealmObjectProxy.CacheData(i, chatListResponseData2));
        } else if (i >= cacheData.minDepth) {
            return (ChatListResponseData) cacheData.object;
        } else {
            cacheData.minDepth = i;
            chatListResponseData2 = (ChatListResponseData) cacheData.object;
        }
        C4598x353731f6 ru_unicorn_ujin_data_realm_chatlistresponsedatarealmproxyinterface = chatListResponseData2;
        C4598x353731f6 ru_unicorn_ujin_data_realm_chatlistresponsedatarealmproxyinterface2 = chatListResponseData;
        ru_unicorn_ujin_data_realm_chatlistresponsedatarealmproxyinterface.realmSet$userId(ru_unicorn_ujin_data_realm_chatlistresponsedatarealmproxyinterface2.realmGet$userId());
        if (i == i2) {
            ru_unicorn_ujin_data_realm_chatlistresponsedatarealmproxyinterface.realmSet$chatList((RealmList<Chat>) null);
        } else {
            RealmList<Chat> realmGet$chatList = ru_unicorn_ujin_data_realm_chatlistresponsedatarealmproxyinterface2.realmGet$chatList();
            RealmList realmList = new RealmList();
            ru_unicorn_ujin_data_realm_chatlistresponsedatarealmproxyinterface.realmSet$chatList(realmList);
            int i3 = i + 1;
            int size = realmGet$chatList.size();
            for (int i4 = 0; i4 < size; i4++) {
                realmList.add(ru_unicorn_ujin_data_realm_ChatRealmProxy.createDetachedCopy(realmGet$chatList.get(i4), i3, i2, map));
            }
        }
        ru_unicorn_ujin_data_realm_chatlistresponsedatarealmproxyinterface.realmSet$notReadCount(ru_unicorn_ujin_data_realm_chatlistresponsedatarealmproxyinterface2.realmGet$notReadCount());
        return chatListResponseData2;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("ChatListResponseData = proxy[");
        sb.append("{userId:");
        sb.append(realmGet$userId() != null ? realmGet$userId() : "null");
        sb.append("}");
        sb.append(",");
        sb.append("{chatList:");
        sb.append("RealmList<Chat>[");
        sb.append(realmGet$chatList().size());
        sb.append("]");
        sb.append("}");
        sb.append(",");
        sb.append("{notReadCount:");
        sb.append(realmGet$notReadCount());
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
        ru_unicorn_ujin_data_realm_ChatListResponseDataRealmProxy ru_unicorn_ujin_data_realm_chatlistresponsedatarealmproxy = (ru_unicorn_ujin_data_realm_ChatListResponseDataRealmProxy) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_data_realm_chatlistresponsedatarealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_data_realm_chatlistresponsedatarealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_data_realm_chatlistresponsedatarealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
