package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import p035ru.unicorn.ujin.data.realm.CardAdress;
import p035ru.unicorn.ujin.data.realm.CardData;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.card.CardFragment;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.Contact;
import p046io.realm.BaseRealm;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;
import p046io.realm.ru_unicorn_ujin_data_realm_CardAdressRealmProxy;

/* renamed from: io.realm.ru_unicorn_ujin_data_realm_CardDataRealmProxy */
public class ru_unicorn_ujin_data_realm_CardDataRealmProxy extends CardData implements RealmObjectProxy, ru_unicorn_ujin_data_realm_CardDataRealmProxyInterface {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private CardDataColumnInfo columnInfo;
    private ProxyState<CardData> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_CardDataRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "CardData";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_CardDataRealmProxy$CardDataColumnInfo */
    static final class CardDataColumnInfo extends ColumnInfo {
        long addressIndex;
        long brandIndex;
        long commentIndex;
        long dateEndIndex;
        long dateStartIndex;
        long guestFullnameIndex;
        long guestPhoneIndex;
        long idIndex;
        long idNumberIndex;
        long maxColumnIndexValue;
        long typeIndex;

        CardDataColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(10);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.addressIndex = addColumnDetails(Contact.Type.address, Contact.Type.address, objectSchemaInfo);
            this.typeIndex = addColumnDetails("type", "type", objectSchemaInfo);
            this.commentIndex = addColumnDetails("comment", "comment", objectSchemaInfo);
            this.guestFullnameIndex = addColumnDetails("guestFullname", "guestFullname", objectSchemaInfo);
            this.guestPhoneIndex = addColumnDetails("guestPhone", "guestPhone", objectSchemaInfo);
            this.dateStartIndex = addColumnDetails(CardFragment.ARG_DATE_START, CardFragment.ARG_DATE_START, objectSchemaInfo);
            this.dateEndIndex = addColumnDetails(CardFragment.ARG_DATE_END, CardFragment.ARG_DATE_END, objectSchemaInfo);
            this.idNumberIndex = addColumnDetails("idNumber", "idNumber", objectSchemaInfo);
            this.brandIndex = addColumnDetails(CardFragment.ARG_BRAND, CardFragment.ARG_BRAND, objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        CardDataColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new CardDataColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            CardDataColumnInfo cardDataColumnInfo = (CardDataColumnInfo) columnInfo;
            CardDataColumnInfo cardDataColumnInfo2 = (CardDataColumnInfo) columnInfo2;
            cardDataColumnInfo2.idIndex = cardDataColumnInfo.idIndex;
            cardDataColumnInfo2.addressIndex = cardDataColumnInfo.addressIndex;
            cardDataColumnInfo2.typeIndex = cardDataColumnInfo.typeIndex;
            cardDataColumnInfo2.commentIndex = cardDataColumnInfo.commentIndex;
            cardDataColumnInfo2.guestFullnameIndex = cardDataColumnInfo.guestFullnameIndex;
            cardDataColumnInfo2.guestPhoneIndex = cardDataColumnInfo.guestPhoneIndex;
            cardDataColumnInfo2.dateStartIndex = cardDataColumnInfo.dateStartIndex;
            cardDataColumnInfo2.dateEndIndex = cardDataColumnInfo.dateEndIndex;
            cardDataColumnInfo2.idNumberIndex = cardDataColumnInfo.idNumberIndex;
            cardDataColumnInfo2.brandIndex = cardDataColumnInfo.brandIndex;
            cardDataColumnInfo2.maxColumnIndexValue = cardDataColumnInfo.maxColumnIndexValue;
        }
    }

    ru_unicorn_ujin_data_realm_CardDataRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (CardDataColumnInfo) realmObjectContext.getColumnInfo();
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
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.idIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.idIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.idIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.idIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public CardAdress realmGet$address() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.addressIndex)) {
            return null;
        }
        return (CardAdress) this.proxyState.getRealm$realm().get(CardAdress.class, this.proxyState.getRow$realm().getLink(this.columnInfo.addressIndex), false, Collections.emptyList());
    }

    public void realmSet$address(CardAdress cardAdress) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (cardAdress == null) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.addressIndex);
                return;
            }
            this.proxyState.checkValidObject(cardAdress);
            this.proxyState.getRow$realm().setLink(this.columnInfo.addressIndex, ((RealmObjectProxy) cardAdress).realmGet$proxyState().getRow$realm().getIndex());
        } else if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains(Contact.Type.address)) {
            if (cardAdress != null && !RealmObject.isManaged(cardAdress)) {
                cardAdress = (CardAdress) ((Realm) this.proxyState.getRealm$realm()).copyToRealm(cardAdress, new ImportFlag[0]);
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (cardAdress == null) {
                row$realm.nullifyLink(this.columnInfo.addressIndex);
                return;
            }
            this.proxyState.checkValidObject(cardAdress);
            row$realm.getTable().setLink(this.columnInfo.addressIndex, row$realm.getIndex(), ((RealmObjectProxy) cardAdress).realmGet$proxyState().getRow$realm().getIndex(), true);
        }
    }

    public String realmGet$type() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.typeIndex);
    }

    public void realmSet$type(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.typeIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.typeIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.typeIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.typeIndex, row$realm.getIndex(), str, true);
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

    public String realmGet$guestFullname() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.guestFullnameIndex);
    }

    public void realmSet$guestFullname(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.guestFullnameIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.guestFullnameIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.guestFullnameIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.guestFullnameIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$guestPhone() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.guestPhoneIndex);
    }

    public void realmSet$guestPhone(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.guestPhoneIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.guestPhoneIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.guestPhoneIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.guestPhoneIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public long realmGet$dateStart() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getLong(this.columnInfo.dateStartIndex);
    }

    public void realmSet$dateStart(long j) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            this.proxyState.getRow$realm().setLong(this.columnInfo.dateStartIndex, j);
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            row$realm.getTable().setLong(this.columnInfo.dateStartIndex, row$realm.getIndex(), j, true);
        }
    }

    public long realmGet$dateEnd() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getLong(this.columnInfo.dateEndIndex);
    }

    public void realmSet$dateEnd(long j) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            this.proxyState.getRow$realm().setLong(this.columnInfo.dateEndIndex, j);
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            row$realm.getTable().setLong(this.columnInfo.dateEndIndex, row$realm.getIndex(), j, true);
        }
    }

    public String realmGet$idNumber() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.idNumberIndex);
    }

    public void realmSet$idNumber(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.idNumberIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.idNumberIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.idNumberIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.idNumberIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$brand() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.brandIndex);
    }

    public void realmSet$brand(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.brandIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.brandIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.brandIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.brandIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 10, 0);
        builder.addPersistedProperty("id", RealmFieldType.STRING, false, false, false);
        builder.addPersistedLinkProperty(Contact.Type.address, RealmFieldType.OBJECT, ru_unicorn_ujin_data_realm_CardAdressRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("type", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("comment", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("guestFullname", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("guestPhone", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty(CardFragment.ARG_DATE_START, RealmFieldType.INTEGER, false, false, true);
        builder2.addPersistedProperty(CardFragment.ARG_DATE_END, RealmFieldType.INTEGER, false, false, true);
        builder2.addPersistedProperty("idNumber", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty(CardFragment.ARG_BRAND, RealmFieldType.STRING, false, false, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static CardDataColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new CardDataColumnInfo(osSchemaInfo);
    }

    public static CardData createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        ArrayList arrayList = new ArrayList(1);
        if (jSONObject.has(Contact.Type.address)) {
            arrayList.add(Contact.Type.address);
        }
        CardData cardData = (CardData) realm.createObjectInternal(CardData.class, true, arrayList);
        ru_unicorn_ujin_data_realm_CardDataRealmProxyInterface ru_unicorn_ujin_data_realm_carddatarealmproxyinterface = cardData;
        if (jSONObject.has("id")) {
            if (jSONObject.isNull("id")) {
                ru_unicorn_ujin_data_realm_carddatarealmproxyinterface.realmSet$id((String) null);
            } else {
                ru_unicorn_ujin_data_realm_carddatarealmproxyinterface.realmSet$id(jSONObject.getString("id"));
            }
        }
        if (jSONObject.has(Contact.Type.address)) {
            if (jSONObject.isNull(Contact.Type.address)) {
                ru_unicorn_ujin_data_realm_carddatarealmproxyinterface.realmSet$address((CardAdress) null);
            } else {
                ru_unicorn_ujin_data_realm_carddatarealmproxyinterface.realmSet$address(ru_unicorn_ujin_data_realm_CardAdressRealmProxy.createOrUpdateUsingJsonObject(realm, jSONObject.getJSONObject(Contact.Type.address), z));
            }
        }
        if (jSONObject.has("type")) {
            if (jSONObject.isNull("type")) {
                ru_unicorn_ujin_data_realm_carddatarealmproxyinterface.realmSet$type((String) null);
            } else {
                ru_unicorn_ujin_data_realm_carddatarealmproxyinterface.realmSet$type(jSONObject.getString("type"));
            }
        }
        if (jSONObject.has("comment")) {
            if (jSONObject.isNull("comment")) {
                ru_unicorn_ujin_data_realm_carddatarealmproxyinterface.realmSet$comment((String) null);
            } else {
                ru_unicorn_ujin_data_realm_carddatarealmproxyinterface.realmSet$comment(jSONObject.getString("comment"));
            }
        }
        if (jSONObject.has("guestFullname")) {
            if (jSONObject.isNull("guestFullname")) {
                ru_unicorn_ujin_data_realm_carddatarealmproxyinterface.realmSet$guestFullname((String) null);
            } else {
                ru_unicorn_ujin_data_realm_carddatarealmproxyinterface.realmSet$guestFullname(jSONObject.getString("guestFullname"));
            }
        }
        if (jSONObject.has("guestPhone")) {
            if (jSONObject.isNull("guestPhone")) {
                ru_unicorn_ujin_data_realm_carddatarealmproxyinterface.realmSet$guestPhone((String) null);
            } else {
                ru_unicorn_ujin_data_realm_carddatarealmproxyinterface.realmSet$guestPhone(jSONObject.getString("guestPhone"));
            }
        }
        if (jSONObject.has(CardFragment.ARG_DATE_START)) {
            if (!jSONObject.isNull(CardFragment.ARG_DATE_START)) {
                ru_unicorn_ujin_data_realm_carddatarealmproxyinterface.realmSet$dateStart(jSONObject.getLong(CardFragment.ARG_DATE_START));
            } else {
                throw new IllegalArgumentException("Trying to set non-nullable field 'dateStart' to null.");
            }
        }
        if (jSONObject.has(CardFragment.ARG_DATE_END)) {
            if (!jSONObject.isNull(CardFragment.ARG_DATE_END)) {
                ru_unicorn_ujin_data_realm_carddatarealmproxyinterface.realmSet$dateEnd(jSONObject.getLong(CardFragment.ARG_DATE_END));
            } else {
                throw new IllegalArgumentException("Trying to set non-nullable field 'dateEnd' to null.");
            }
        }
        if (jSONObject.has("idNumber")) {
            if (jSONObject.isNull("idNumber")) {
                ru_unicorn_ujin_data_realm_carddatarealmproxyinterface.realmSet$idNumber((String) null);
            } else {
                ru_unicorn_ujin_data_realm_carddatarealmproxyinterface.realmSet$idNumber(jSONObject.getString("idNumber"));
            }
        }
        if (jSONObject.has(CardFragment.ARG_BRAND)) {
            if (jSONObject.isNull(CardFragment.ARG_BRAND)) {
                ru_unicorn_ujin_data_realm_carddatarealmproxyinterface.realmSet$brand((String) null);
            } else {
                ru_unicorn_ujin_data_realm_carddatarealmproxyinterface.realmSet$brand(jSONObject.getString(CardFragment.ARG_BRAND));
            }
        }
        return cardData;
    }

    public static CardData createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        CardData cardData = new CardData();
        ru_unicorn_ujin_data_realm_CardDataRealmProxyInterface ru_unicorn_ujin_data_realm_carddatarealmproxyinterface = cardData;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("id")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_carddatarealmproxyinterface.realmSet$id(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_carddatarealmproxyinterface.realmSet$id((String) null);
                }
            } else if (nextName.equals(Contact.Type.address)) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_carddatarealmproxyinterface.realmSet$address((CardAdress) null);
                } else {
                    ru_unicorn_ujin_data_realm_carddatarealmproxyinterface.realmSet$address(ru_unicorn_ujin_data_realm_CardAdressRealmProxy.createUsingJsonStream(realm, jsonReader));
                }
            } else if (nextName.equals("type")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_carddatarealmproxyinterface.realmSet$type(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_carddatarealmproxyinterface.realmSet$type((String) null);
                }
            } else if (nextName.equals("comment")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_carddatarealmproxyinterface.realmSet$comment(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_carddatarealmproxyinterface.realmSet$comment((String) null);
                }
            } else if (nextName.equals("guestFullname")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_carddatarealmproxyinterface.realmSet$guestFullname(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_carddatarealmproxyinterface.realmSet$guestFullname((String) null);
                }
            } else if (nextName.equals("guestPhone")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_carddatarealmproxyinterface.realmSet$guestPhone(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_carddatarealmproxyinterface.realmSet$guestPhone((String) null);
                }
            } else if (nextName.equals(CardFragment.ARG_DATE_START)) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_carddatarealmproxyinterface.realmSet$dateStart(jsonReader.nextLong());
                } else {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'dateStart' to null.");
                }
            } else if (nextName.equals(CardFragment.ARG_DATE_END)) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_carddatarealmproxyinterface.realmSet$dateEnd(jsonReader.nextLong());
                } else {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'dateEnd' to null.");
                }
            } else if (nextName.equals("idNumber")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_carddatarealmproxyinterface.realmSet$idNumber(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_carddatarealmproxyinterface.realmSet$idNumber((String) null);
                }
            } else if (!nextName.equals(CardFragment.ARG_BRAND)) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_data_realm_carddatarealmproxyinterface.realmSet$brand(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_data_realm_carddatarealmproxyinterface.realmSet$brand((String) null);
            }
        }
        jsonReader.endObject();
        return (CardData) realm.copyToRealm(cardData, new ImportFlag[0]);
    }

    private static ru_unicorn_ujin_data_realm_CardDataRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) CardData.class), false, Collections.emptyList());
        ru_unicorn_ujin_data_realm_CardDataRealmProxy ru_unicorn_ujin_data_realm_carddatarealmproxy = new ru_unicorn_ujin_data_realm_CardDataRealmProxy();
        realmObjectContext.clear();
        return ru_unicorn_ujin_data_realm_carddatarealmproxy;
    }

    public static CardData copyOrUpdate(Realm realm, CardDataColumnInfo cardDataColumnInfo, CardData cardData, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (cardData instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) cardData;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return cardData;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(cardData);
        if (realmObjectProxy2 != null) {
            return (CardData) realmObjectProxy2;
        }
        return copy(realm, cardDataColumnInfo, cardData, z, map, set);
    }

    public static CardData copy(Realm realm, CardDataColumnInfo cardDataColumnInfo, CardData cardData, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(cardData);
        if (realmObjectProxy != null) {
            return (CardData) realmObjectProxy;
        }
        ru_unicorn_ujin_data_realm_CardDataRealmProxyInterface ru_unicorn_ujin_data_realm_carddatarealmproxyinterface = cardData;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(CardData.class), cardDataColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(cardDataColumnInfo.idIndex, ru_unicorn_ujin_data_realm_carddatarealmproxyinterface.realmGet$id());
        osObjectBuilder.addString(cardDataColumnInfo.typeIndex, ru_unicorn_ujin_data_realm_carddatarealmproxyinterface.realmGet$type());
        osObjectBuilder.addString(cardDataColumnInfo.commentIndex, ru_unicorn_ujin_data_realm_carddatarealmproxyinterface.realmGet$comment());
        osObjectBuilder.addString(cardDataColumnInfo.guestFullnameIndex, ru_unicorn_ujin_data_realm_carddatarealmproxyinterface.realmGet$guestFullname());
        osObjectBuilder.addString(cardDataColumnInfo.guestPhoneIndex, ru_unicorn_ujin_data_realm_carddatarealmproxyinterface.realmGet$guestPhone());
        osObjectBuilder.addInteger(cardDataColumnInfo.dateStartIndex, Long.valueOf(ru_unicorn_ujin_data_realm_carddatarealmproxyinterface.realmGet$dateStart()));
        osObjectBuilder.addInteger(cardDataColumnInfo.dateEndIndex, Long.valueOf(ru_unicorn_ujin_data_realm_carddatarealmproxyinterface.realmGet$dateEnd()));
        osObjectBuilder.addString(cardDataColumnInfo.idNumberIndex, ru_unicorn_ujin_data_realm_carddatarealmproxyinterface.realmGet$idNumber());
        osObjectBuilder.addString(cardDataColumnInfo.brandIndex, ru_unicorn_ujin_data_realm_carddatarealmproxyinterface.realmGet$brand());
        ru_unicorn_ujin_data_realm_CardDataRealmProxy newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(cardData, newProxyInstance);
        CardAdress realmGet$address = ru_unicorn_ujin_data_realm_carddatarealmproxyinterface.realmGet$address();
        if (realmGet$address == null) {
            newProxyInstance.realmSet$address((CardAdress) null);
        } else {
            CardAdress cardAdress = (CardAdress) map.get(realmGet$address);
            if (cardAdress != null) {
                newProxyInstance.realmSet$address(cardAdress);
            } else {
                newProxyInstance.realmSet$address(ru_unicorn_ujin_data_realm_CardAdressRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_CardAdressRealmProxy.CardAdressColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) CardAdress.class), realmGet$address, z, map, set));
            }
        }
        return newProxyInstance;
    }

    public static long insert(Realm realm, CardData cardData, Map<RealmModel, Long> map) {
        Realm realm2 = realm;
        CardData cardData2 = cardData;
        Map<RealmModel, Long> map2 = map;
        if (cardData2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) cardData2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(CardData.class);
        long nativePtr = table.getNativePtr();
        CardDataColumnInfo cardDataColumnInfo = (CardDataColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) CardData.class);
        long createRow = OsObject.createRow(table);
        map2.put(cardData2, Long.valueOf(createRow));
        ru_unicorn_ujin_data_realm_CardDataRealmProxyInterface ru_unicorn_ujin_data_realm_carddatarealmproxyinterface = cardData2;
        String realmGet$id = ru_unicorn_ujin_data_realm_carddatarealmproxyinterface.realmGet$id();
        if (realmGet$id != null) {
            Table.nativeSetString(nativePtr, cardDataColumnInfo.idIndex, createRow, realmGet$id, false);
        }
        CardAdress realmGet$address = ru_unicorn_ujin_data_realm_carddatarealmproxyinterface.realmGet$address();
        if (realmGet$address != null) {
            Long l = map2.get(realmGet$address);
            if (l == null) {
                l = Long.valueOf(ru_unicorn_ujin_data_realm_CardAdressRealmProxy.insert(realm2, realmGet$address, map2));
            }
            Table.nativeSetLink(nativePtr, cardDataColumnInfo.addressIndex, createRow, l.longValue(), false);
        }
        String realmGet$type = ru_unicorn_ujin_data_realm_carddatarealmproxyinterface.realmGet$type();
        if (realmGet$type != null) {
            Table.nativeSetString(nativePtr, cardDataColumnInfo.typeIndex, createRow, realmGet$type, false);
        }
        String realmGet$comment = ru_unicorn_ujin_data_realm_carddatarealmproxyinterface.realmGet$comment();
        if (realmGet$comment != null) {
            Table.nativeSetString(nativePtr, cardDataColumnInfo.commentIndex, createRow, realmGet$comment, false);
        }
        String realmGet$guestFullname = ru_unicorn_ujin_data_realm_carddatarealmproxyinterface.realmGet$guestFullname();
        if (realmGet$guestFullname != null) {
            Table.nativeSetString(nativePtr, cardDataColumnInfo.guestFullnameIndex, createRow, realmGet$guestFullname, false);
        }
        String realmGet$guestPhone = ru_unicorn_ujin_data_realm_carddatarealmproxyinterface.realmGet$guestPhone();
        if (realmGet$guestPhone != null) {
            Table.nativeSetString(nativePtr, cardDataColumnInfo.guestPhoneIndex, createRow, realmGet$guestPhone, false);
        }
        long j = nativePtr;
        long j2 = createRow;
        Table.nativeSetLong(j, cardDataColumnInfo.dateStartIndex, j2, ru_unicorn_ujin_data_realm_carddatarealmproxyinterface.realmGet$dateStart(), false);
        Table.nativeSetLong(j, cardDataColumnInfo.dateEndIndex, j2, ru_unicorn_ujin_data_realm_carddatarealmproxyinterface.realmGet$dateEnd(), false);
        String realmGet$idNumber = ru_unicorn_ujin_data_realm_carddatarealmproxyinterface.realmGet$idNumber();
        if (realmGet$idNumber != null) {
            Table.nativeSetString(nativePtr, cardDataColumnInfo.idNumberIndex, createRow, realmGet$idNumber, false);
        }
        String realmGet$brand = ru_unicorn_ujin_data_realm_carddatarealmproxyinterface.realmGet$brand();
        if (realmGet$brand != null) {
            Table.nativeSetString(nativePtr, cardDataColumnInfo.brandIndex, createRow, realmGet$brand, false);
        }
        return createRow;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(CardData.class);
        long nativePtr = table.getNativePtr();
        CardDataColumnInfo cardDataColumnInfo = (CardDataColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) CardData.class);
        while (it.hasNext()) {
            CardData cardData = (CardData) it.next();
            if (!map2.containsKey(cardData)) {
                if (cardData instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) cardData;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(cardData, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(cardData, Long.valueOf(createRow));
                ru_unicorn_ujin_data_realm_CardDataRealmProxyInterface ru_unicorn_ujin_data_realm_carddatarealmproxyinterface = cardData;
                String realmGet$id = ru_unicorn_ujin_data_realm_carddatarealmproxyinterface.realmGet$id();
                if (realmGet$id != null) {
                    Table.nativeSetString(nativePtr, cardDataColumnInfo.idIndex, createRow, realmGet$id, false);
                }
                CardAdress realmGet$address = ru_unicorn_ujin_data_realm_carddatarealmproxyinterface.realmGet$address();
                if (realmGet$address != null) {
                    Long l = map2.get(realmGet$address);
                    if (l == null) {
                        l = Long.valueOf(ru_unicorn_ujin_data_realm_CardAdressRealmProxy.insert(realm2, realmGet$address, map2));
                    }
                    table.setLink(cardDataColumnInfo.addressIndex, createRow, l.longValue(), false);
                }
                String realmGet$type = ru_unicorn_ujin_data_realm_carddatarealmproxyinterface.realmGet$type();
                if (realmGet$type != null) {
                    Table.nativeSetString(nativePtr, cardDataColumnInfo.typeIndex, createRow, realmGet$type, false);
                }
                String realmGet$comment = ru_unicorn_ujin_data_realm_carddatarealmproxyinterface.realmGet$comment();
                if (realmGet$comment != null) {
                    Table.nativeSetString(nativePtr, cardDataColumnInfo.commentIndex, createRow, realmGet$comment, false);
                }
                String realmGet$guestFullname = ru_unicorn_ujin_data_realm_carddatarealmproxyinterface.realmGet$guestFullname();
                if (realmGet$guestFullname != null) {
                    Table.nativeSetString(nativePtr, cardDataColumnInfo.guestFullnameIndex, createRow, realmGet$guestFullname, false);
                }
                String realmGet$guestPhone = ru_unicorn_ujin_data_realm_carddatarealmproxyinterface.realmGet$guestPhone();
                if (realmGet$guestPhone != null) {
                    Table.nativeSetString(nativePtr, cardDataColumnInfo.guestPhoneIndex, createRow, realmGet$guestPhone, false);
                }
                long j = nativePtr;
                long j2 = createRow;
                Table.nativeSetLong(j, cardDataColumnInfo.dateStartIndex, j2, ru_unicorn_ujin_data_realm_carddatarealmproxyinterface.realmGet$dateStart(), false);
                Table.nativeSetLong(j, cardDataColumnInfo.dateEndIndex, j2, ru_unicorn_ujin_data_realm_carddatarealmproxyinterface.realmGet$dateEnd(), false);
                String realmGet$idNumber = ru_unicorn_ujin_data_realm_carddatarealmproxyinterface.realmGet$idNumber();
                if (realmGet$idNumber != null) {
                    Table.nativeSetString(nativePtr, cardDataColumnInfo.idNumberIndex, createRow, realmGet$idNumber, false);
                }
                String realmGet$brand = ru_unicorn_ujin_data_realm_carddatarealmproxyinterface.realmGet$brand();
                if (realmGet$brand != null) {
                    Table.nativeSetString(nativePtr, cardDataColumnInfo.brandIndex, createRow, realmGet$brand, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, CardData cardData, Map<RealmModel, Long> map) {
        Realm realm2 = realm;
        CardData cardData2 = cardData;
        Map<RealmModel, Long> map2 = map;
        if (cardData2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) cardData2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(CardData.class);
        long nativePtr = table.getNativePtr();
        CardDataColumnInfo cardDataColumnInfo = (CardDataColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) CardData.class);
        long createRow = OsObject.createRow(table);
        map2.put(cardData2, Long.valueOf(createRow));
        ru_unicorn_ujin_data_realm_CardDataRealmProxyInterface ru_unicorn_ujin_data_realm_carddatarealmproxyinterface = cardData2;
        String realmGet$id = ru_unicorn_ujin_data_realm_carddatarealmproxyinterface.realmGet$id();
        if (realmGet$id != null) {
            Table.nativeSetString(nativePtr, cardDataColumnInfo.idIndex, createRow, realmGet$id, false);
        } else {
            Table.nativeSetNull(nativePtr, cardDataColumnInfo.idIndex, createRow, false);
        }
        CardAdress realmGet$address = ru_unicorn_ujin_data_realm_carddatarealmproxyinterface.realmGet$address();
        if (realmGet$address != null) {
            Long l = map2.get(realmGet$address);
            if (l == null) {
                l = Long.valueOf(ru_unicorn_ujin_data_realm_CardAdressRealmProxy.insertOrUpdate(realm2, realmGet$address, map2));
            }
            Table.nativeSetLink(nativePtr, cardDataColumnInfo.addressIndex, createRow, l.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, cardDataColumnInfo.addressIndex, createRow);
        }
        String realmGet$type = ru_unicorn_ujin_data_realm_carddatarealmproxyinterface.realmGet$type();
        if (realmGet$type != null) {
            Table.nativeSetString(nativePtr, cardDataColumnInfo.typeIndex, createRow, realmGet$type, false);
        } else {
            Table.nativeSetNull(nativePtr, cardDataColumnInfo.typeIndex, createRow, false);
        }
        String realmGet$comment = ru_unicorn_ujin_data_realm_carddatarealmproxyinterface.realmGet$comment();
        if (realmGet$comment != null) {
            Table.nativeSetString(nativePtr, cardDataColumnInfo.commentIndex, createRow, realmGet$comment, false);
        } else {
            Table.nativeSetNull(nativePtr, cardDataColumnInfo.commentIndex, createRow, false);
        }
        String realmGet$guestFullname = ru_unicorn_ujin_data_realm_carddatarealmproxyinterface.realmGet$guestFullname();
        if (realmGet$guestFullname != null) {
            Table.nativeSetString(nativePtr, cardDataColumnInfo.guestFullnameIndex, createRow, realmGet$guestFullname, false);
        } else {
            Table.nativeSetNull(nativePtr, cardDataColumnInfo.guestFullnameIndex, createRow, false);
        }
        String realmGet$guestPhone = ru_unicorn_ujin_data_realm_carddatarealmproxyinterface.realmGet$guestPhone();
        if (realmGet$guestPhone != null) {
            Table.nativeSetString(nativePtr, cardDataColumnInfo.guestPhoneIndex, createRow, realmGet$guestPhone, false);
        } else {
            Table.nativeSetNull(nativePtr, cardDataColumnInfo.guestPhoneIndex, createRow, false);
        }
        long j = nativePtr;
        long j2 = createRow;
        Table.nativeSetLong(j, cardDataColumnInfo.dateStartIndex, j2, ru_unicorn_ujin_data_realm_carddatarealmproxyinterface.realmGet$dateStart(), false);
        Table.nativeSetLong(j, cardDataColumnInfo.dateEndIndex, j2, ru_unicorn_ujin_data_realm_carddatarealmproxyinterface.realmGet$dateEnd(), false);
        String realmGet$idNumber = ru_unicorn_ujin_data_realm_carddatarealmproxyinterface.realmGet$idNumber();
        if (realmGet$idNumber != null) {
            Table.nativeSetString(nativePtr, cardDataColumnInfo.idNumberIndex, createRow, realmGet$idNumber, false);
        } else {
            Table.nativeSetNull(nativePtr, cardDataColumnInfo.idNumberIndex, createRow, false);
        }
        String realmGet$brand = ru_unicorn_ujin_data_realm_carddatarealmproxyinterface.realmGet$brand();
        if (realmGet$brand != null) {
            Table.nativeSetString(nativePtr, cardDataColumnInfo.brandIndex, createRow, realmGet$brand, false);
        } else {
            Table.nativeSetNull(nativePtr, cardDataColumnInfo.brandIndex, createRow, false);
        }
        return createRow;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(CardData.class);
        long nativePtr = table.getNativePtr();
        CardDataColumnInfo cardDataColumnInfo = (CardDataColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) CardData.class);
        while (it.hasNext()) {
            CardData cardData = (CardData) it.next();
            if (!map2.containsKey(cardData)) {
                if (cardData instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) cardData;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(cardData, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(cardData, Long.valueOf(createRow));
                ru_unicorn_ujin_data_realm_CardDataRealmProxyInterface ru_unicorn_ujin_data_realm_carddatarealmproxyinterface = cardData;
                String realmGet$id = ru_unicorn_ujin_data_realm_carddatarealmproxyinterface.realmGet$id();
                if (realmGet$id != null) {
                    Table.nativeSetString(nativePtr, cardDataColumnInfo.idIndex, createRow, realmGet$id, false);
                } else {
                    Table.nativeSetNull(nativePtr, cardDataColumnInfo.idIndex, createRow, false);
                }
                CardAdress realmGet$address = ru_unicorn_ujin_data_realm_carddatarealmproxyinterface.realmGet$address();
                if (realmGet$address != null) {
                    Long l = map2.get(realmGet$address);
                    if (l == null) {
                        l = Long.valueOf(ru_unicorn_ujin_data_realm_CardAdressRealmProxy.insertOrUpdate(realm2, realmGet$address, map2));
                    }
                    Table.nativeSetLink(nativePtr, cardDataColumnInfo.addressIndex, createRow, l.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, cardDataColumnInfo.addressIndex, createRow);
                }
                String realmGet$type = ru_unicorn_ujin_data_realm_carddatarealmproxyinterface.realmGet$type();
                if (realmGet$type != null) {
                    Table.nativeSetString(nativePtr, cardDataColumnInfo.typeIndex, createRow, realmGet$type, false);
                } else {
                    Table.nativeSetNull(nativePtr, cardDataColumnInfo.typeIndex, createRow, false);
                }
                String realmGet$comment = ru_unicorn_ujin_data_realm_carddatarealmproxyinterface.realmGet$comment();
                if (realmGet$comment != null) {
                    Table.nativeSetString(nativePtr, cardDataColumnInfo.commentIndex, createRow, realmGet$comment, false);
                } else {
                    Table.nativeSetNull(nativePtr, cardDataColumnInfo.commentIndex, createRow, false);
                }
                String realmGet$guestFullname = ru_unicorn_ujin_data_realm_carddatarealmproxyinterface.realmGet$guestFullname();
                if (realmGet$guestFullname != null) {
                    Table.nativeSetString(nativePtr, cardDataColumnInfo.guestFullnameIndex, createRow, realmGet$guestFullname, false);
                } else {
                    Table.nativeSetNull(nativePtr, cardDataColumnInfo.guestFullnameIndex, createRow, false);
                }
                String realmGet$guestPhone = ru_unicorn_ujin_data_realm_carddatarealmproxyinterface.realmGet$guestPhone();
                if (realmGet$guestPhone != null) {
                    Table.nativeSetString(nativePtr, cardDataColumnInfo.guestPhoneIndex, createRow, realmGet$guestPhone, false);
                } else {
                    Table.nativeSetNull(nativePtr, cardDataColumnInfo.guestPhoneIndex, createRow, false);
                }
                long j = nativePtr;
                long j2 = createRow;
                Table.nativeSetLong(j, cardDataColumnInfo.dateStartIndex, j2, ru_unicorn_ujin_data_realm_carddatarealmproxyinterface.realmGet$dateStart(), false);
                Table.nativeSetLong(j, cardDataColumnInfo.dateEndIndex, j2, ru_unicorn_ujin_data_realm_carddatarealmproxyinterface.realmGet$dateEnd(), false);
                String realmGet$idNumber = ru_unicorn_ujin_data_realm_carddatarealmproxyinterface.realmGet$idNumber();
                if (realmGet$idNumber != null) {
                    Table.nativeSetString(nativePtr, cardDataColumnInfo.idNumberIndex, createRow, realmGet$idNumber, false);
                } else {
                    Table.nativeSetNull(nativePtr, cardDataColumnInfo.idNumberIndex, createRow, false);
                }
                String realmGet$brand = ru_unicorn_ujin_data_realm_carddatarealmproxyinterface.realmGet$brand();
                if (realmGet$brand != null) {
                    Table.nativeSetString(nativePtr, cardDataColumnInfo.brandIndex, createRow, realmGet$brand, false);
                } else {
                    Table.nativeSetNull(nativePtr, cardDataColumnInfo.brandIndex, createRow, false);
                }
            }
        }
    }

    public static CardData createDetachedCopy(CardData cardData, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        CardData cardData2;
        if (i > i2 || cardData == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(cardData);
        if (cacheData == null) {
            cardData2 = new CardData();
            map.put(cardData, new RealmObjectProxy.CacheData(i, cardData2));
        } else if (i >= cacheData.minDepth) {
            return (CardData) cacheData.object;
        } else {
            cacheData.minDepth = i;
            cardData2 = (CardData) cacheData.object;
        }
        ru_unicorn_ujin_data_realm_CardDataRealmProxyInterface ru_unicorn_ujin_data_realm_carddatarealmproxyinterface = cardData2;
        ru_unicorn_ujin_data_realm_CardDataRealmProxyInterface ru_unicorn_ujin_data_realm_carddatarealmproxyinterface2 = cardData;
        ru_unicorn_ujin_data_realm_carddatarealmproxyinterface.realmSet$id(ru_unicorn_ujin_data_realm_carddatarealmproxyinterface2.realmGet$id());
        ru_unicorn_ujin_data_realm_carddatarealmproxyinterface.realmSet$address(ru_unicorn_ujin_data_realm_CardAdressRealmProxy.createDetachedCopy(ru_unicorn_ujin_data_realm_carddatarealmproxyinterface2.realmGet$address(), i + 1, i2, map));
        ru_unicorn_ujin_data_realm_carddatarealmproxyinterface.realmSet$type(ru_unicorn_ujin_data_realm_carddatarealmproxyinterface2.realmGet$type());
        ru_unicorn_ujin_data_realm_carddatarealmproxyinterface.realmSet$comment(ru_unicorn_ujin_data_realm_carddatarealmproxyinterface2.realmGet$comment());
        ru_unicorn_ujin_data_realm_carddatarealmproxyinterface.realmSet$guestFullname(ru_unicorn_ujin_data_realm_carddatarealmproxyinterface2.realmGet$guestFullname());
        ru_unicorn_ujin_data_realm_carddatarealmproxyinterface.realmSet$guestPhone(ru_unicorn_ujin_data_realm_carddatarealmproxyinterface2.realmGet$guestPhone());
        ru_unicorn_ujin_data_realm_carddatarealmproxyinterface.realmSet$dateStart(ru_unicorn_ujin_data_realm_carddatarealmproxyinterface2.realmGet$dateStart());
        ru_unicorn_ujin_data_realm_carddatarealmproxyinterface.realmSet$dateEnd(ru_unicorn_ujin_data_realm_carddatarealmproxyinterface2.realmGet$dateEnd());
        ru_unicorn_ujin_data_realm_carddatarealmproxyinterface.realmSet$idNumber(ru_unicorn_ujin_data_realm_carddatarealmproxyinterface2.realmGet$idNumber());
        ru_unicorn_ujin_data_realm_carddatarealmproxyinterface.realmSet$brand(ru_unicorn_ujin_data_realm_carddatarealmproxyinterface2.realmGet$brand());
        return cardData2;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("CardData = proxy[");
        sb.append("{id:");
        String str = "null";
        sb.append(realmGet$id() != null ? realmGet$id() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{address:");
        sb.append(realmGet$address() != null ? ru_unicorn_ujin_data_realm_CardAdressRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME : str);
        sb.append("}");
        sb.append(",");
        sb.append("{type:");
        sb.append(realmGet$type() != null ? realmGet$type() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{comment:");
        sb.append(realmGet$comment() != null ? realmGet$comment() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{guestFullname:");
        sb.append(realmGet$guestFullname() != null ? realmGet$guestFullname() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{guestPhone:");
        sb.append(realmGet$guestPhone() != null ? realmGet$guestPhone() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{dateStart:");
        sb.append(realmGet$dateStart());
        sb.append("}");
        sb.append(",");
        sb.append("{dateEnd:");
        sb.append(realmGet$dateEnd());
        sb.append("}");
        sb.append(",");
        sb.append("{idNumber:");
        sb.append(realmGet$idNumber() != null ? realmGet$idNumber() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{brand:");
        if (realmGet$brand() != null) {
            str = realmGet$brand();
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
        ru_unicorn_ujin_data_realm_CardDataRealmProxy ru_unicorn_ujin_data_realm_carddatarealmproxy = (ru_unicorn_ujin_data_realm_CardDataRealmProxy) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_data_realm_carddatarealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_data_realm_carddatarealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_data_realm_carddatarealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
