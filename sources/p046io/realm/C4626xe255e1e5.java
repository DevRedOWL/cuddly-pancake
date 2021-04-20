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
import p035ru.unicorn.ujin.data.realm.notification.NotificationData;
import p035ru.unicorn.ujin.data.service.FCM;
import p035ru.unicorn.ujin.view.fragments.news.NewspieceFragment;
import p046io.realm.BaseRealm;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_data_realm_notification_NotificationDataRealmProxy */
public class C4626xe255e1e5 extends NotificationData implements RealmObjectProxy, C4627x94d0fcd4 {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private NotificationDataColumnInfo columnInfo;
    private ProxyState<NotificationData> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_notification_NotificationDataRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "NotificationData";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_notification_NotificationDataRealmProxy$NotificationDataColumnInfo */
    static final class NotificationDataColumnInfo extends ColumnInfo {
        long apartmentidIndex;
        long badgeIndex;
        long chatSoundIndex;
        long chatidIndex;
        long clickActionIndex;
        long eventIndex;
        long marketIdIndex;
        long maxColumnIndexValue;
        long newsIdIndex;
        long objectTypeNameIndex;
        long ticketIdIndex;

        NotificationDataColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(10);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.badgeIndex = addColumnDetails(FCM.BADGE, FCM.BADGE, objectSchemaInfo);
            this.eventIndex = addColumnDetails("event", "event", objectSchemaInfo);
            this.chatidIndex = addColumnDetails("chatid", "chatid", objectSchemaInfo);
            this.ticketIdIndex = addColumnDetails("ticketId", "ticketId", objectSchemaInfo);
            this.newsIdIndex = addColumnDetails(NewspieceFragment.NEWS_ID, NewspieceFragment.NEWS_ID, objectSchemaInfo);
            this.marketIdIndex = addColumnDetails("marketId", "marketId", objectSchemaInfo);
            this.chatSoundIndex = addColumnDetails("chatSound", "chatSound", objectSchemaInfo);
            this.apartmentidIndex = addColumnDetails(FCM.APARTMENT_ID, FCM.APARTMENT_ID, objectSchemaInfo);
            this.clickActionIndex = addColumnDetails("clickAction", "clickAction", objectSchemaInfo);
            this.objectTypeNameIndex = addColumnDetails("objectTypeName", "objectTypeName", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        NotificationDataColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new NotificationDataColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            NotificationDataColumnInfo notificationDataColumnInfo = (NotificationDataColumnInfo) columnInfo;
            NotificationDataColumnInfo notificationDataColumnInfo2 = (NotificationDataColumnInfo) columnInfo2;
            notificationDataColumnInfo2.badgeIndex = notificationDataColumnInfo.badgeIndex;
            notificationDataColumnInfo2.eventIndex = notificationDataColumnInfo.eventIndex;
            notificationDataColumnInfo2.chatidIndex = notificationDataColumnInfo.chatidIndex;
            notificationDataColumnInfo2.ticketIdIndex = notificationDataColumnInfo.ticketIdIndex;
            notificationDataColumnInfo2.newsIdIndex = notificationDataColumnInfo.newsIdIndex;
            notificationDataColumnInfo2.marketIdIndex = notificationDataColumnInfo.marketIdIndex;
            notificationDataColumnInfo2.chatSoundIndex = notificationDataColumnInfo.chatSoundIndex;
            notificationDataColumnInfo2.apartmentidIndex = notificationDataColumnInfo.apartmentidIndex;
            notificationDataColumnInfo2.clickActionIndex = notificationDataColumnInfo.clickActionIndex;
            notificationDataColumnInfo2.objectTypeNameIndex = notificationDataColumnInfo.objectTypeNameIndex;
            notificationDataColumnInfo2.maxColumnIndexValue = notificationDataColumnInfo.maxColumnIndexValue;
        }
    }

    C4626xe255e1e5() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (NotificationDataColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public Integer realmGet$badge() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.badgeIndex)) {
            return null;
        }
        return Integer.valueOf((int) this.proxyState.getRow$realm().getLong(this.columnInfo.badgeIndex));
    }

    public void realmSet$badge(Integer num) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (num == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.badgeIndex);
            } else {
                this.proxyState.getRow$realm().setLong(this.columnInfo.badgeIndex, (long) num.intValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (num == null) {
                row$realm.getTable().setNull(this.columnInfo.badgeIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setLong(this.columnInfo.badgeIndex, row$realm.getIndex(), (long) num.intValue(), true);
            }
        }
    }

    public String realmGet$event() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.eventIndex);
    }

    public void realmSet$event(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.eventIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.eventIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.eventIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.eventIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$chatid() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.chatidIndex);
    }

    public void realmSet$chatid(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.chatidIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.chatidIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.chatidIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.chatidIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$ticketId() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.ticketIdIndex);
    }

    public void realmSet$ticketId(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.ticketIdIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.ticketIdIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.ticketIdIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.ticketIdIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$newsId() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.newsIdIndex);
    }

    public void realmSet$newsId(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.newsIdIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.newsIdIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.newsIdIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.newsIdIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$marketId() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.marketIdIndex);
    }

    public void realmSet$marketId(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.marketIdIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.marketIdIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.marketIdIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.marketIdIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public Boolean realmGet$chatSound() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.chatSoundIndex)) {
            return null;
        }
        return Boolean.valueOf(this.proxyState.getRow$realm().getBoolean(this.columnInfo.chatSoundIndex));
    }

    public void realmSet$chatSound(Boolean bool) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (bool == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.chatSoundIndex);
            } else {
                this.proxyState.getRow$realm().setBoolean(this.columnInfo.chatSoundIndex, bool.booleanValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (bool == null) {
                row$realm.getTable().setNull(this.columnInfo.chatSoundIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setBoolean(this.columnInfo.chatSoundIndex, row$realm.getIndex(), bool.booleanValue(), true);
            }
        }
    }

    public String realmGet$apartmentid() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.apartmentidIndex);
    }

    public void realmSet$apartmentid(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.apartmentidIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.apartmentidIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.apartmentidIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.apartmentidIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$clickAction() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.clickActionIndex);
    }

    public void realmSet$clickAction(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.clickActionIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.clickActionIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.clickActionIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.clickActionIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$objectTypeName() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.objectTypeNameIndex);
    }

    public void realmSet$objectTypeName(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.objectTypeNameIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.objectTypeNameIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.objectTypeNameIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.objectTypeNameIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 10, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty(FCM.BADGE, RealmFieldType.INTEGER, false, false, false);
        builder2.addPersistedProperty("event", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("chatid", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("ticketId", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty(NewspieceFragment.NEWS_ID, RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("marketId", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("chatSound", RealmFieldType.BOOLEAN, false, false, false);
        builder2.addPersistedProperty(FCM.APARTMENT_ID, RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("clickAction", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("objectTypeName", RealmFieldType.STRING, false, false, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static NotificationDataColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new NotificationDataColumnInfo(osSchemaInfo);
    }

    public static NotificationData createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        NotificationData notificationData = (NotificationData) realm.createObjectInternal(NotificationData.class, true, Collections.emptyList());
        C4627x94d0fcd4 ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface = notificationData;
        if (jSONObject.has(FCM.BADGE)) {
            if (jSONObject.isNull(FCM.BADGE)) {
                ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface.realmSet$badge((Integer) null);
            } else {
                ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface.realmSet$badge(Integer.valueOf(jSONObject.getInt(FCM.BADGE)));
            }
        }
        if (jSONObject.has("event")) {
            if (jSONObject.isNull("event")) {
                ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface.realmSet$event((String) null);
            } else {
                ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface.realmSet$event(jSONObject.getString("event"));
            }
        }
        if (jSONObject.has("chatid")) {
            if (jSONObject.isNull("chatid")) {
                ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface.realmSet$chatid((String) null);
            } else {
                ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface.realmSet$chatid(jSONObject.getString("chatid"));
            }
        }
        if (jSONObject.has("ticketId")) {
            if (jSONObject.isNull("ticketId")) {
                ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface.realmSet$ticketId((String) null);
            } else {
                ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface.realmSet$ticketId(jSONObject.getString("ticketId"));
            }
        }
        if (jSONObject.has(NewspieceFragment.NEWS_ID)) {
            if (jSONObject.isNull(NewspieceFragment.NEWS_ID)) {
                ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface.realmSet$newsId((String) null);
            } else {
                ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface.realmSet$newsId(jSONObject.getString(NewspieceFragment.NEWS_ID));
            }
        }
        if (jSONObject.has("marketId")) {
            if (jSONObject.isNull("marketId")) {
                ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface.realmSet$marketId((String) null);
            } else {
                ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface.realmSet$marketId(jSONObject.getString("marketId"));
            }
        }
        if (jSONObject.has("chatSound")) {
            if (jSONObject.isNull("chatSound")) {
                ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface.realmSet$chatSound((Boolean) null);
            } else {
                ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface.realmSet$chatSound(Boolean.valueOf(jSONObject.getBoolean("chatSound")));
            }
        }
        if (jSONObject.has(FCM.APARTMENT_ID)) {
            if (jSONObject.isNull(FCM.APARTMENT_ID)) {
                ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface.realmSet$apartmentid((String) null);
            } else {
                ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface.realmSet$apartmentid(jSONObject.getString(FCM.APARTMENT_ID));
            }
        }
        if (jSONObject.has("clickAction")) {
            if (jSONObject.isNull("clickAction")) {
                ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface.realmSet$clickAction((String) null);
            } else {
                ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface.realmSet$clickAction(jSONObject.getString("clickAction"));
            }
        }
        if (jSONObject.has("objectTypeName")) {
            if (jSONObject.isNull("objectTypeName")) {
                ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface.realmSet$objectTypeName((String) null);
            } else {
                ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface.realmSet$objectTypeName(jSONObject.getString("objectTypeName"));
            }
        }
        return notificationData;
    }

    public static NotificationData createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        NotificationData notificationData = new NotificationData();
        C4627x94d0fcd4 ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface = notificationData;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals(FCM.BADGE)) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface.realmSet$badge(Integer.valueOf(jsonReader.nextInt()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface.realmSet$badge((Integer) null);
                }
            } else if (nextName.equals("event")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface.realmSet$event(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface.realmSet$event((String) null);
                }
            } else if (nextName.equals("chatid")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface.realmSet$chatid(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface.realmSet$chatid((String) null);
                }
            } else if (nextName.equals("ticketId")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface.realmSet$ticketId(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface.realmSet$ticketId((String) null);
                }
            } else if (nextName.equals(NewspieceFragment.NEWS_ID)) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface.realmSet$newsId(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface.realmSet$newsId((String) null);
                }
            } else if (nextName.equals("marketId")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface.realmSet$marketId(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface.realmSet$marketId((String) null);
                }
            } else if (nextName.equals("chatSound")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface.realmSet$chatSound(Boolean.valueOf(jsonReader.nextBoolean()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface.realmSet$chatSound((Boolean) null);
                }
            } else if (nextName.equals(FCM.APARTMENT_ID)) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface.realmSet$apartmentid(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface.realmSet$apartmentid((String) null);
                }
            } else if (nextName.equals("clickAction")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface.realmSet$clickAction(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface.realmSet$clickAction((String) null);
                }
            } else if (!nextName.equals("objectTypeName")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface.realmSet$objectTypeName(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface.realmSet$objectTypeName((String) null);
            }
        }
        jsonReader.endObject();
        return (NotificationData) realm.copyToRealm(notificationData, new ImportFlag[0]);
    }

    private static C4626xe255e1e5 newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) NotificationData.class), false, Collections.emptyList());
        C4626xe255e1e5 ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxy = new C4626xe255e1e5();
        realmObjectContext.clear();
        return ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxy;
    }

    public static NotificationData copyOrUpdate(Realm realm, NotificationDataColumnInfo notificationDataColumnInfo, NotificationData notificationData, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (notificationData instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) notificationData;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return notificationData;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(notificationData);
        if (realmObjectProxy2 != null) {
            return (NotificationData) realmObjectProxy2;
        }
        return copy(realm, notificationDataColumnInfo, notificationData, z, map, set);
    }

    public static NotificationData copy(Realm realm, NotificationDataColumnInfo notificationDataColumnInfo, NotificationData notificationData, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(notificationData);
        if (realmObjectProxy != null) {
            return (NotificationData) realmObjectProxy;
        }
        C4627x94d0fcd4 ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface = notificationData;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(NotificationData.class), notificationDataColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addInteger(notificationDataColumnInfo.badgeIndex, ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface.realmGet$badge());
        osObjectBuilder.addString(notificationDataColumnInfo.eventIndex, ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface.realmGet$event());
        osObjectBuilder.addString(notificationDataColumnInfo.chatidIndex, ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface.realmGet$chatid());
        osObjectBuilder.addString(notificationDataColumnInfo.ticketIdIndex, ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface.realmGet$ticketId());
        osObjectBuilder.addString(notificationDataColumnInfo.newsIdIndex, ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface.realmGet$newsId());
        osObjectBuilder.addString(notificationDataColumnInfo.marketIdIndex, ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface.realmGet$marketId());
        osObjectBuilder.addBoolean(notificationDataColumnInfo.chatSoundIndex, ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface.realmGet$chatSound());
        osObjectBuilder.addString(notificationDataColumnInfo.apartmentidIndex, ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface.realmGet$apartmentid());
        osObjectBuilder.addString(notificationDataColumnInfo.clickActionIndex, ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface.realmGet$clickAction());
        osObjectBuilder.addString(notificationDataColumnInfo.objectTypeNameIndex, ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface.realmGet$objectTypeName());
        C4626xe255e1e5 newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(notificationData, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, NotificationData notificationData, Map<RealmModel, Long> map) {
        NotificationData notificationData2 = notificationData;
        if (notificationData2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) notificationData2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(NotificationData.class);
        long nativePtr = table.getNativePtr();
        NotificationDataColumnInfo notificationDataColumnInfo = (NotificationDataColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) NotificationData.class);
        long createRow = OsObject.createRow(table);
        map.put(notificationData2, Long.valueOf(createRow));
        C4627x94d0fcd4 ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface = notificationData2;
        Integer realmGet$badge = ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface.realmGet$badge();
        if (realmGet$badge != null) {
            Table.nativeSetLong(nativePtr, notificationDataColumnInfo.badgeIndex, createRow, realmGet$badge.longValue(), false);
        }
        String realmGet$event = ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface.realmGet$event();
        if (realmGet$event != null) {
            Table.nativeSetString(nativePtr, notificationDataColumnInfo.eventIndex, createRow, realmGet$event, false);
        }
        String realmGet$chatid = ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface.realmGet$chatid();
        if (realmGet$chatid != null) {
            Table.nativeSetString(nativePtr, notificationDataColumnInfo.chatidIndex, createRow, realmGet$chatid, false);
        }
        String realmGet$ticketId = ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface.realmGet$ticketId();
        if (realmGet$ticketId != null) {
            Table.nativeSetString(nativePtr, notificationDataColumnInfo.ticketIdIndex, createRow, realmGet$ticketId, false);
        }
        String realmGet$newsId = ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface.realmGet$newsId();
        if (realmGet$newsId != null) {
            Table.nativeSetString(nativePtr, notificationDataColumnInfo.newsIdIndex, createRow, realmGet$newsId, false);
        }
        String realmGet$marketId = ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface.realmGet$marketId();
        if (realmGet$marketId != null) {
            Table.nativeSetString(nativePtr, notificationDataColumnInfo.marketIdIndex, createRow, realmGet$marketId, false);
        }
        Boolean realmGet$chatSound = ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface.realmGet$chatSound();
        if (realmGet$chatSound != null) {
            Table.nativeSetBoolean(nativePtr, notificationDataColumnInfo.chatSoundIndex, createRow, realmGet$chatSound.booleanValue(), false);
        }
        String realmGet$apartmentid = ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface.realmGet$apartmentid();
        if (realmGet$apartmentid != null) {
            Table.nativeSetString(nativePtr, notificationDataColumnInfo.apartmentidIndex, createRow, realmGet$apartmentid, false);
        }
        String realmGet$clickAction = ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface.realmGet$clickAction();
        if (realmGet$clickAction != null) {
            Table.nativeSetString(nativePtr, notificationDataColumnInfo.clickActionIndex, createRow, realmGet$clickAction, false);
        }
        String realmGet$objectTypeName = ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface.realmGet$objectTypeName();
        if (realmGet$objectTypeName != null) {
            Table.nativeSetString(nativePtr, notificationDataColumnInfo.objectTypeNameIndex, createRow, realmGet$objectTypeName, false);
        }
        return createRow;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(NotificationData.class);
        long nativePtr = table.getNativePtr();
        NotificationDataColumnInfo notificationDataColumnInfo = (NotificationDataColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) NotificationData.class);
        while (it.hasNext()) {
            NotificationData notificationData = (NotificationData) it.next();
            if (!map2.containsKey(notificationData)) {
                if (notificationData instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) notificationData;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(notificationData, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(notificationData, Long.valueOf(createRow));
                C4627x94d0fcd4 ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface = notificationData;
                Integer realmGet$badge = ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface.realmGet$badge();
                if (realmGet$badge != null) {
                    Table.nativeSetLong(nativePtr, notificationDataColumnInfo.badgeIndex, createRow, realmGet$badge.longValue(), false);
                }
                String realmGet$event = ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface.realmGet$event();
                if (realmGet$event != null) {
                    Table.nativeSetString(nativePtr, notificationDataColumnInfo.eventIndex, createRow, realmGet$event, false);
                }
                String realmGet$chatid = ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface.realmGet$chatid();
                if (realmGet$chatid != null) {
                    Table.nativeSetString(nativePtr, notificationDataColumnInfo.chatidIndex, createRow, realmGet$chatid, false);
                }
                String realmGet$ticketId = ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface.realmGet$ticketId();
                if (realmGet$ticketId != null) {
                    Table.nativeSetString(nativePtr, notificationDataColumnInfo.ticketIdIndex, createRow, realmGet$ticketId, false);
                }
                String realmGet$newsId = ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface.realmGet$newsId();
                if (realmGet$newsId != null) {
                    Table.nativeSetString(nativePtr, notificationDataColumnInfo.newsIdIndex, createRow, realmGet$newsId, false);
                }
                String realmGet$marketId = ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface.realmGet$marketId();
                if (realmGet$marketId != null) {
                    Table.nativeSetString(nativePtr, notificationDataColumnInfo.marketIdIndex, createRow, realmGet$marketId, false);
                }
                Boolean realmGet$chatSound = ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface.realmGet$chatSound();
                if (realmGet$chatSound != null) {
                    Table.nativeSetBoolean(nativePtr, notificationDataColumnInfo.chatSoundIndex, createRow, realmGet$chatSound.booleanValue(), false);
                }
                String realmGet$apartmentid = ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface.realmGet$apartmentid();
                if (realmGet$apartmentid != null) {
                    Table.nativeSetString(nativePtr, notificationDataColumnInfo.apartmentidIndex, createRow, realmGet$apartmentid, false);
                }
                String realmGet$clickAction = ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface.realmGet$clickAction();
                if (realmGet$clickAction != null) {
                    Table.nativeSetString(nativePtr, notificationDataColumnInfo.clickActionIndex, createRow, realmGet$clickAction, false);
                }
                String realmGet$objectTypeName = ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface.realmGet$objectTypeName();
                if (realmGet$objectTypeName != null) {
                    Table.nativeSetString(nativePtr, notificationDataColumnInfo.objectTypeNameIndex, createRow, realmGet$objectTypeName, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, NotificationData notificationData, Map<RealmModel, Long> map) {
        NotificationData notificationData2 = notificationData;
        if (notificationData2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) notificationData2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(NotificationData.class);
        long nativePtr = table.getNativePtr();
        NotificationDataColumnInfo notificationDataColumnInfo = (NotificationDataColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) NotificationData.class);
        long createRow = OsObject.createRow(table);
        map.put(notificationData2, Long.valueOf(createRow));
        C4627x94d0fcd4 ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface = notificationData2;
        Integer realmGet$badge = ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface.realmGet$badge();
        if (realmGet$badge != null) {
            Table.nativeSetLong(nativePtr, notificationDataColumnInfo.badgeIndex, createRow, realmGet$badge.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, notificationDataColumnInfo.badgeIndex, createRow, false);
        }
        String realmGet$event = ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface.realmGet$event();
        if (realmGet$event != null) {
            Table.nativeSetString(nativePtr, notificationDataColumnInfo.eventIndex, createRow, realmGet$event, false);
        } else {
            Table.nativeSetNull(nativePtr, notificationDataColumnInfo.eventIndex, createRow, false);
        }
        String realmGet$chatid = ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface.realmGet$chatid();
        if (realmGet$chatid != null) {
            Table.nativeSetString(nativePtr, notificationDataColumnInfo.chatidIndex, createRow, realmGet$chatid, false);
        } else {
            Table.nativeSetNull(nativePtr, notificationDataColumnInfo.chatidIndex, createRow, false);
        }
        String realmGet$ticketId = ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface.realmGet$ticketId();
        if (realmGet$ticketId != null) {
            Table.nativeSetString(nativePtr, notificationDataColumnInfo.ticketIdIndex, createRow, realmGet$ticketId, false);
        } else {
            Table.nativeSetNull(nativePtr, notificationDataColumnInfo.ticketIdIndex, createRow, false);
        }
        String realmGet$newsId = ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface.realmGet$newsId();
        if (realmGet$newsId != null) {
            Table.nativeSetString(nativePtr, notificationDataColumnInfo.newsIdIndex, createRow, realmGet$newsId, false);
        } else {
            Table.nativeSetNull(nativePtr, notificationDataColumnInfo.newsIdIndex, createRow, false);
        }
        String realmGet$marketId = ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface.realmGet$marketId();
        if (realmGet$marketId != null) {
            Table.nativeSetString(nativePtr, notificationDataColumnInfo.marketIdIndex, createRow, realmGet$marketId, false);
        } else {
            Table.nativeSetNull(nativePtr, notificationDataColumnInfo.marketIdIndex, createRow, false);
        }
        Boolean realmGet$chatSound = ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface.realmGet$chatSound();
        if (realmGet$chatSound != null) {
            Table.nativeSetBoolean(nativePtr, notificationDataColumnInfo.chatSoundIndex, createRow, realmGet$chatSound.booleanValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, notificationDataColumnInfo.chatSoundIndex, createRow, false);
        }
        String realmGet$apartmentid = ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface.realmGet$apartmentid();
        if (realmGet$apartmentid != null) {
            Table.nativeSetString(nativePtr, notificationDataColumnInfo.apartmentidIndex, createRow, realmGet$apartmentid, false);
        } else {
            Table.nativeSetNull(nativePtr, notificationDataColumnInfo.apartmentidIndex, createRow, false);
        }
        String realmGet$clickAction = ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface.realmGet$clickAction();
        if (realmGet$clickAction != null) {
            Table.nativeSetString(nativePtr, notificationDataColumnInfo.clickActionIndex, createRow, realmGet$clickAction, false);
        } else {
            Table.nativeSetNull(nativePtr, notificationDataColumnInfo.clickActionIndex, createRow, false);
        }
        String realmGet$objectTypeName = ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface.realmGet$objectTypeName();
        if (realmGet$objectTypeName != null) {
            Table.nativeSetString(nativePtr, notificationDataColumnInfo.objectTypeNameIndex, createRow, realmGet$objectTypeName, false);
        } else {
            Table.nativeSetNull(nativePtr, notificationDataColumnInfo.objectTypeNameIndex, createRow, false);
        }
        return createRow;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(NotificationData.class);
        long nativePtr = table.getNativePtr();
        NotificationDataColumnInfo notificationDataColumnInfo = (NotificationDataColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) NotificationData.class);
        while (it.hasNext()) {
            NotificationData notificationData = (NotificationData) it.next();
            if (!map2.containsKey(notificationData)) {
                if (notificationData instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) notificationData;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(notificationData, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(notificationData, Long.valueOf(createRow));
                C4627x94d0fcd4 ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface = notificationData;
                Integer realmGet$badge = ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface.realmGet$badge();
                if (realmGet$badge != null) {
                    Table.nativeSetLong(nativePtr, notificationDataColumnInfo.badgeIndex, createRow, realmGet$badge.longValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, notificationDataColumnInfo.badgeIndex, createRow, false);
                }
                String realmGet$event = ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface.realmGet$event();
                if (realmGet$event != null) {
                    Table.nativeSetString(nativePtr, notificationDataColumnInfo.eventIndex, createRow, realmGet$event, false);
                } else {
                    Table.nativeSetNull(nativePtr, notificationDataColumnInfo.eventIndex, createRow, false);
                }
                String realmGet$chatid = ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface.realmGet$chatid();
                if (realmGet$chatid != null) {
                    Table.nativeSetString(nativePtr, notificationDataColumnInfo.chatidIndex, createRow, realmGet$chatid, false);
                } else {
                    Table.nativeSetNull(nativePtr, notificationDataColumnInfo.chatidIndex, createRow, false);
                }
                String realmGet$ticketId = ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface.realmGet$ticketId();
                if (realmGet$ticketId != null) {
                    Table.nativeSetString(nativePtr, notificationDataColumnInfo.ticketIdIndex, createRow, realmGet$ticketId, false);
                } else {
                    Table.nativeSetNull(nativePtr, notificationDataColumnInfo.ticketIdIndex, createRow, false);
                }
                String realmGet$newsId = ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface.realmGet$newsId();
                if (realmGet$newsId != null) {
                    Table.nativeSetString(nativePtr, notificationDataColumnInfo.newsIdIndex, createRow, realmGet$newsId, false);
                } else {
                    Table.nativeSetNull(nativePtr, notificationDataColumnInfo.newsIdIndex, createRow, false);
                }
                String realmGet$marketId = ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface.realmGet$marketId();
                if (realmGet$marketId != null) {
                    Table.nativeSetString(nativePtr, notificationDataColumnInfo.marketIdIndex, createRow, realmGet$marketId, false);
                } else {
                    Table.nativeSetNull(nativePtr, notificationDataColumnInfo.marketIdIndex, createRow, false);
                }
                Boolean realmGet$chatSound = ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface.realmGet$chatSound();
                if (realmGet$chatSound != null) {
                    Table.nativeSetBoolean(nativePtr, notificationDataColumnInfo.chatSoundIndex, createRow, realmGet$chatSound.booleanValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, notificationDataColumnInfo.chatSoundIndex, createRow, false);
                }
                String realmGet$apartmentid = ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface.realmGet$apartmentid();
                if (realmGet$apartmentid != null) {
                    Table.nativeSetString(nativePtr, notificationDataColumnInfo.apartmentidIndex, createRow, realmGet$apartmentid, false);
                } else {
                    Table.nativeSetNull(nativePtr, notificationDataColumnInfo.apartmentidIndex, createRow, false);
                }
                String realmGet$clickAction = ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface.realmGet$clickAction();
                if (realmGet$clickAction != null) {
                    Table.nativeSetString(nativePtr, notificationDataColumnInfo.clickActionIndex, createRow, realmGet$clickAction, false);
                } else {
                    Table.nativeSetNull(nativePtr, notificationDataColumnInfo.clickActionIndex, createRow, false);
                }
                String realmGet$objectTypeName = ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface.realmGet$objectTypeName();
                if (realmGet$objectTypeName != null) {
                    Table.nativeSetString(nativePtr, notificationDataColumnInfo.objectTypeNameIndex, createRow, realmGet$objectTypeName, false);
                } else {
                    Table.nativeSetNull(nativePtr, notificationDataColumnInfo.objectTypeNameIndex, createRow, false);
                }
            }
        }
    }

    public static NotificationData createDetachedCopy(NotificationData notificationData, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        NotificationData notificationData2;
        if (i > i2 || notificationData == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(notificationData);
        if (cacheData == null) {
            notificationData2 = new NotificationData();
            map.put(notificationData, new RealmObjectProxy.CacheData(i, notificationData2));
        } else if (i >= cacheData.minDepth) {
            return (NotificationData) cacheData.object;
        } else {
            cacheData.minDepth = i;
            notificationData2 = (NotificationData) cacheData.object;
        }
        C4627x94d0fcd4 ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface = notificationData2;
        C4627x94d0fcd4 ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface2 = notificationData;
        ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface.realmSet$badge(ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface2.realmGet$badge());
        ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface.realmSet$event(ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface2.realmGet$event());
        ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface.realmSet$chatid(ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface2.realmGet$chatid());
        ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface.realmSet$ticketId(ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface2.realmGet$ticketId());
        ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface.realmSet$newsId(ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface2.realmGet$newsId());
        ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface.realmSet$marketId(ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface2.realmGet$marketId());
        ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface.realmSet$chatSound(ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface2.realmGet$chatSound());
        ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface.realmSet$apartmentid(ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface2.realmGet$apartmentid());
        ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface.realmSet$clickAction(ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface2.realmGet$clickAction());
        ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface.realmSet$objectTypeName(ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxyinterface2.realmGet$objectTypeName());
        return notificationData2;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("NotificationData = proxy[");
        sb.append("{badge:");
        String str = "null";
        sb.append(realmGet$badge() != null ? realmGet$badge() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{event:");
        sb.append(realmGet$event() != null ? realmGet$event() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{chatid:");
        sb.append(realmGet$chatid() != null ? realmGet$chatid() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{ticketId:");
        sb.append(realmGet$ticketId() != null ? realmGet$ticketId() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{newsId:");
        sb.append(realmGet$newsId() != null ? realmGet$newsId() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{marketId:");
        sb.append(realmGet$marketId() != null ? realmGet$marketId() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{chatSound:");
        sb.append(realmGet$chatSound() != null ? realmGet$chatSound() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{apartmentid:");
        sb.append(realmGet$apartmentid() != null ? realmGet$apartmentid() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{clickAction:");
        sb.append(realmGet$clickAction() != null ? realmGet$clickAction() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{objectTypeName:");
        if (realmGet$objectTypeName() != null) {
            str = realmGet$objectTypeName();
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
        C4626xe255e1e5 ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxy = (C4626xe255e1e5) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_data_realm_notification_notificationdatarealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
