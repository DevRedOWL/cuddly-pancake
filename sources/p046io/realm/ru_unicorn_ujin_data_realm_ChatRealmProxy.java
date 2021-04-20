package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p035ru.unicorn.ujin.data.Constants;
import p035ru.unicorn.ujin.data.entities.chats.Author;
import p035ru.unicorn.ujin.data.realm.Chat;
import p046io.realm.BaseRealm;
import p046io.realm.exceptions.RealmException;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsList;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;
import p046io.realm.ru_unicorn_ujin_data_entities_chats_AuthorRealmProxy;

/* renamed from: io.realm.ru_unicorn_ujin_data_realm_ChatRealmProxy */
public class ru_unicorn_ujin_data_realm_ChatRealmProxy extends Chat implements RealmObjectProxy, ru_unicorn_ujin_data_realm_ChatRealmProxyInterface {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private ChatColumnInfo columnInfo;
    private ProxyState<Chat> proxyState;
    private RealmList<Author> userListRealmList;

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_ChatRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Chat";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_ChatRealmProxy$ChatColumnInfo */
    static final class ChatColumnInfo extends ColumnInfo {
        long countIndex;
        long idIndex;
        long lastAuthorImgIndex;
        long lastAuthorIndex;
        long lastDateIndex;
        long lastMessageIndex;
        long maxColumnIndexValue;
        long notReadIndex;
        long ownerIdIndex;
        long participantsCountIndex;
        long readOnlyIndex;
        long removeCaptionIndex;
        long serviceTypeIndex;
        long soundIndex;
        long titleIndex;
        long userListIndex;

        ChatColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(15);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.notReadIndex = addColumnDetails("notRead", "notRead", objectSchemaInfo);
            this.titleIndex = addColumnDetails("title", "title", objectSchemaInfo);
            this.countIndex = addColumnDetails("count", "count", objectSchemaInfo);
            this.lastMessageIndex = addColumnDetails("lastMessage", "lastMessage", objectSchemaInfo);
            this.lastDateIndex = addColumnDetails("lastDate", "lastDate", objectSchemaInfo);
            this.lastAuthorIndex = addColumnDetails("lastAuthor", "lastAuthor", objectSchemaInfo);
            this.readOnlyIndex = addColumnDetails(Constants.CHAT_READONLY, Constants.CHAT_READONLY, objectSchemaInfo);
            this.lastAuthorImgIndex = addColumnDetails("lastAuthorImg", "lastAuthorImg", objectSchemaInfo);
            this.removeCaptionIndex = addColumnDetails("removeCaption", "removeCaption", objectSchemaInfo);
            this.serviceTypeIndex = addColumnDetails(Chat.Fields.serviceType, Chat.Fields.serviceType, objectSchemaInfo);
            this.participantsCountIndex = addColumnDetails(Constants.CHAT_PARTICIPANTS_COUNT, Constants.CHAT_PARTICIPANTS_COUNT, objectSchemaInfo);
            this.ownerIdIndex = addColumnDetails("ownerId", "ownerId", objectSchemaInfo);
            this.soundIndex = addColumnDetails("sound", "sound", objectSchemaInfo);
            this.userListIndex = addColumnDetails("userList", "userList", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        ChatColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new ChatColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            ChatColumnInfo chatColumnInfo = (ChatColumnInfo) columnInfo;
            ChatColumnInfo chatColumnInfo2 = (ChatColumnInfo) columnInfo2;
            chatColumnInfo2.idIndex = chatColumnInfo.idIndex;
            chatColumnInfo2.notReadIndex = chatColumnInfo.notReadIndex;
            chatColumnInfo2.titleIndex = chatColumnInfo.titleIndex;
            chatColumnInfo2.countIndex = chatColumnInfo.countIndex;
            chatColumnInfo2.lastMessageIndex = chatColumnInfo.lastMessageIndex;
            chatColumnInfo2.lastDateIndex = chatColumnInfo.lastDateIndex;
            chatColumnInfo2.lastAuthorIndex = chatColumnInfo.lastAuthorIndex;
            chatColumnInfo2.readOnlyIndex = chatColumnInfo.readOnlyIndex;
            chatColumnInfo2.lastAuthorImgIndex = chatColumnInfo.lastAuthorImgIndex;
            chatColumnInfo2.removeCaptionIndex = chatColumnInfo.removeCaptionIndex;
            chatColumnInfo2.serviceTypeIndex = chatColumnInfo.serviceTypeIndex;
            chatColumnInfo2.participantsCountIndex = chatColumnInfo.participantsCountIndex;
            chatColumnInfo2.ownerIdIndex = chatColumnInfo.ownerIdIndex;
            chatColumnInfo2.soundIndex = chatColumnInfo.soundIndex;
            chatColumnInfo2.userListIndex = chatColumnInfo.userListIndex;
            chatColumnInfo2.maxColumnIndexValue = chatColumnInfo.maxColumnIndexValue;
        }
    }

    ru_unicorn_ujin_data_realm_ChatRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (ChatColumnInfo) realmObjectContext.getColumnInfo();
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

    public Integer realmGet$notRead() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.notReadIndex)) {
            return null;
        }
        return Integer.valueOf((int) this.proxyState.getRow$realm().getLong(this.columnInfo.notReadIndex));
    }

    public void realmSet$notRead(Integer num) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (num == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.notReadIndex);
            } else {
                this.proxyState.getRow$realm().setLong(this.columnInfo.notReadIndex, (long) num.intValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (num == null) {
                row$realm.getTable().setNull(this.columnInfo.notReadIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setLong(this.columnInfo.notReadIndex, row$realm.getIndex(), (long) num.intValue(), true);
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

    public String realmGet$count() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.countIndex);
    }

    public void realmSet$count(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.countIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.countIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.countIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.countIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$lastMessage() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.lastMessageIndex);
    }

    public void realmSet$lastMessage(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.lastMessageIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.lastMessageIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.lastMessageIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.lastMessageIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$lastDate() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.lastDateIndex);
    }

    public void realmSet$lastDate(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.lastDateIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.lastDateIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.lastDateIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.lastDateIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$lastAuthor() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.lastAuthorIndex);
    }

    public void realmSet$lastAuthor(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.lastAuthorIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.lastAuthorIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.lastAuthorIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.lastAuthorIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public int realmGet$readOnly() {
        this.proxyState.getRealm$realm().checkIfValid();
        return (int) this.proxyState.getRow$realm().getLong(this.columnInfo.readOnlyIndex);
    }

    public void realmSet$readOnly(int i) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            this.proxyState.getRow$realm().setLong(this.columnInfo.readOnlyIndex, (long) i);
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            row$realm.getTable().setLong(this.columnInfo.readOnlyIndex, row$realm.getIndex(), (long) i, true);
        }
    }

    public String realmGet$lastAuthorImg() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.lastAuthorImgIndex);
    }

    public void realmSet$lastAuthorImg(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.lastAuthorImgIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.lastAuthorImgIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.lastAuthorImgIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.lastAuthorImgIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$removeCaption() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.removeCaptionIndex);
    }

    public void realmSet$removeCaption(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.removeCaptionIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.removeCaptionIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.removeCaptionIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.removeCaptionIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$serviceType() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.serviceTypeIndex);
    }

    public void realmSet$serviceType(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.serviceTypeIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.serviceTypeIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.serviceTypeIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.serviceTypeIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public int realmGet$participantsCount() {
        this.proxyState.getRealm$realm().checkIfValid();
        return (int) this.proxyState.getRow$realm().getLong(this.columnInfo.participantsCountIndex);
    }

    public void realmSet$participantsCount(int i) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            this.proxyState.getRow$realm().setLong(this.columnInfo.participantsCountIndex, (long) i);
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            row$realm.getTable().setLong(this.columnInfo.participantsCountIndex, row$realm.getIndex(), (long) i, true);
        }
    }

    public String realmGet$ownerId() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.ownerIdIndex);
    }

    public void realmSet$ownerId(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.ownerIdIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.ownerIdIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.ownerIdIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.ownerIdIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public Boolean realmGet$sound() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.soundIndex)) {
            return null;
        }
        return Boolean.valueOf(this.proxyState.getRow$realm().getBoolean(this.columnInfo.soundIndex));
    }

    public void realmSet$sound(Boolean bool) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (bool == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.soundIndex);
            } else {
                this.proxyState.getRow$realm().setBoolean(this.columnInfo.soundIndex, bool.booleanValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (bool == null) {
                row$realm.getTable().setNull(this.columnInfo.soundIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setBoolean(this.columnInfo.soundIndex, row$realm.getIndex(), bool.booleanValue(), true);
            }
        }
    }

    public RealmList<Author> realmGet$userList() {
        this.proxyState.getRealm$realm().checkIfValid();
        RealmList<Author> realmList = this.userListRealmList;
        if (realmList != null) {
            return realmList;
        }
        this.userListRealmList = new RealmList<>(Author.class, this.proxyState.getRow$realm().getModelList(this.columnInfo.userListIndex), this.proxyState.getRealm$realm());
        return this.userListRealmList;
    }

    public void realmSet$userList(RealmList<Author> realmList) {
        int i = 0;
        if (this.proxyState.isUnderConstruction()) {
            if (!this.proxyState.getAcceptDefaultValue$realm() || this.proxyState.getExcludeFields$realm().contains("userList")) {
                return;
            }
            if (realmList != null && !realmList.isManaged()) {
                Realm realm = (Realm) this.proxyState.getRealm$realm();
                RealmList<Author> realmList2 = new RealmList<>();
                Iterator<Author> it = realmList.iterator();
                while (it.hasNext()) {
                    Author next = it.next();
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
        OsList modelList = this.proxyState.getRow$realm().getModelList(this.columnInfo.userListIndex);
        if (realmList == null || ((long) realmList.size()) != modelList.size()) {
            modelList.removeAll();
            if (realmList != null) {
                int size = realmList.size();
                while (i < size) {
                    Author author = realmList.get(i);
                    this.proxyState.checkValidObject(author);
                    modelList.addRow(((RealmObjectProxy) author).realmGet$proxyState().getRow$realm().getIndex());
                    i++;
                }
                return;
            }
            return;
        }
        int size2 = realmList.size();
        while (i < size2) {
            Author author2 = realmList.get(i);
            this.proxyState.checkValidObject(author2);
            modelList.setRow((long) i, ((RealmObjectProxy) author2).realmGet$proxyState().getRow$realm().getIndex());
            i++;
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 15, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("id", RealmFieldType.STRING, true, true, false);
        builder2.addPersistedProperty("notRead", RealmFieldType.INTEGER, false, false, false);
        builder2.addPersistedProperty("title", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("count", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("lastMessage", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("lastDate", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("lastAuthor", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty(Constants.CHAT_READONLY, RealmFieldType.INTEGER, false, false, true);
        builder2.addPersistedProperty("lastAuthorImg", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("removeCaption", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty(Chat.Fields.serviceType, RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty(Constants.CHAT_PARTICIPANTS_COUNT, RealmFieldType.INTEGER, false, false, true);
        builder2.addPersistedProperty("ownerId", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("sound", RealmFieldType.BOOLEAN, false, false, false);
        builder.addPersistedLinkProperty("userList", RealmFieldType.LIST, ru_unicorn_ujin_data_entities_chats_AuthorRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static ChatColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new ChatColumnInfo(osSchemaInfo);
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x01ed  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x020c  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0199  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01d0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.data.realm.Chat createOrUpdateUsingJsonObject(p046io.realm.Realm r14, org.json.JSONObject r15, boolean r16) throws org.json.JSONException {
        /*
            r0 = r14
            r7 = r15
            r8 = r16
            java.util.ArrayList r9 = new java.util.ArrayList
            r10 = 1
            r9.<init>(r10)
            java.lang.String r11 = "id"
            r12 = 0
            if (r8 == 0) goto L_0x006b
            java.lang.Class<ru.unicorn.ujin.data.realm.Chat> r1 = p035ru.unicorn.ujin.data.realm.Chat.class
            io.realm.internal.Table r1 = r14.getTable(r1)
            io.realm.RealmSchema r2 = r14.getSchema()
            java.lang.Class<ru.unicorn.ujin.data.realm.Chat> r3 = p035ru.unicorn.ujin.data.realm.Chat.class
            io.realm.internal.ColumnInfo r2 = r2.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r3)
            io.realm.ru_unicorn_ujin_data_realm_ChatRealmProxy$ChatColumnInfo r2 = (p046io.realm.ru_unicorn_ujin_data_realm_ChatRealmProxy.ChatColumnInfo) r2
            long r2 = r2.idIndex
            boolean r4 = r15.isNull(r11)
            if (r4 == 0) goto L_0x002e
            long r2 = r1.findFirstNull(r2)
            goto L_0x0036
        L_0x002e:
            java.lang.String r4 = r15.getString(r11)
            long r2 = r1.findFirstString(r2, r4)
        L_0x0036:
            r4 = -1
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x006b
            io.realm.BaseRealm$ThreadLocalRealmObjectContext r4 = p046io.realm.BaseRealm.objectContext
            java.lang.Object r4 = r4.get()
            r13 = r4
            io.realm.BaseRealm$RealmObjectContext r13 = (p046io.realm.BaseRealm.RealmObjectContext) r13
            io.realm.internal.UncheckedRow r3 = r1.getUncheckedRow(r2)     // Catch:{ all -> 0x0066 }
            io.realm.RealmSchema r1 = r14.getSchema()     // Catch:{ all -> 0x0066 }
            java.lang.Class<ru.unicorn.ujin.data.realm.Chat> r2 = p035ru.unicorn.ujin.data.realm.Chat.class
            io.realm.internal.ColumnInfo r4 = r1.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r2)     // Catch:{ all -> 0x0066 }
            r5 = 0
            java.util.List r6 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0066 }
            r1 = r13
            r2 = r14
            r1.set(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0066 }
            io.realm.ru_unicorn_ujin_data_realm_ChatRealmProxy r1 = new io.realm.ru_unicorn_ujin_data_realm_ChatRealmProxy     // Catch:{ all -> 0x0066 }
            r1.<init>()     // Catch:{ all -> 0x0066 }
            r13.clear()
            goto L_0x006c
        L_0x0066:
            r0 = move-exception
            r13.clear()
            throw r0
        L_0x006b:
            r1 = r12
        L_0x006c:
            java.lang.String r2 = "userList"
            if (r1 != 0) goto L_0x00a4
            boolean r1 = r15.has(r2)
            if (r1 == 0) goto L_0x007a
            r9.add(r2)
        L_0x007a:
            boolean r1 = r15.has(r11)
            if (r1 == 0) goto L_0x009c
            boolean r1 = r15.isNull(r11)
            if (r1 == 0) goto L_0x008f
            java.lang.Class<ru.unicorn.ujin.data.realm.Chat> r1 = p035ru.unicorn.ujin.data.realm.Chat.class
            io.realm.RealmModel r1 = r14.createObjectInternal(r1, r12, r10, r9)
            io.realm.ru_unicorn_ujin_data_realm_ChatRealmProxy r1 = (p046io.realm.ru_unicorn_ujin_data_realm_ChatRealmProxy) r1
            goto L_0x00a4
        L_0x008f:
            java.lang.Class<ru.unicorn.ujin.data.realm.Chat> r1 = p035ru.unicorn.ujin.data.realm.Chat.class
            java.lang.String r3 = r15.getString(r11)
            io.realm.RealmModel r1 = r14.createObjectInternal(r1, r3, r10, r9)
            io.realm.ru_unicorn_ujin_data_realm_ChatRealmProxy r1 = (p046io.realm.ru_unicorn_ujin_data_realm_ChatRealmProxy) r1
            goto L_0x00a4
        L_0x009c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "JSON object doesn't have the primary key field 'id'."
            r0.<init>(r1)
            throw r0
        L_0x00a4:
            r3 = r1
            io.realm.ru_unicorn_ujin_data_realm_ChatRealmProxyInterface r3 = (p046io.realm.ru_unicorn_ujin_data_realm_ChatRealmProxyInterface) r3
            java.lang.String r4 = "notRead"
            boolean r5 = r15.has(r4)
            if (r5 == 0) goto L_0x00c4
            boolean r5 = r15.isNull(r4)
            if (r5 == 0) goto L_0x00b9
            r3.realmSet$notRead(r12)
            goto L_0x00c4
        L_0x00b9:
            int r4 = r15.getInt(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.realmSet$notRead(r4)
        L_0x00c4:
            java.lang.String r4 = "title"
            boolean r5 = r15.has(r4)
            if (r5 == 0) goto L_0x00dd
            boolean r5 = r15.isNull(r4)
            if (r5 == 0) goto L_0x00d6
            r3.realmSet$title(r12)
            goto L_0x00dd
        L_0x00d6:
            java.lang.String r4 = r15.getString(r4)
            r3.realmSet$title(r4)
        L_0x00dd:
            java.lang.String r4 = "count"
            boolean r5 = r15.has(r4)
            if (r5 == 0) goto L_0x00f6
            boolean r5 = r15.isNull(r4)
            if (r5 == 0) goto L_0x00ef
            r3.realmSet$count(r12)
            goto L_0x00f6
        L_0x00ef:
            java.lang.String r4 = r15.getString(r4)
            r3.realmSet$count(r4)
        L_0x00f6:
            java.lang.String r4 = "lastMessage"
            boolean r5 = r15.has(r4)
            if (r5 == 0) goto L_0x010f
            boolean r5 = r15.isNull(r4)
            if (r5 == 0) goto L_0x0108
            r3.realmSet$lastMessage(r12)
            goto L_0x010f
        L_0x0108:
            java.lang.String r4 = r15.getString(r4)
            r3.realmSet$lastMessage(r4)
        L_0x010f:
            java.lang.String r4 = "lastDate"
            boolean r5 = r15.has(r4)
            if (r5 == 0) goto L_0x0128
            boolean r5 = r15.isNull(r4)
            if (r5 == 0) goto L_0x0121
            r3.realmSet$lastDate(r12)
            goto L_0x0128
        L_0x0121:
            java.lang.String r4 = r15.getString(r4)
            r3.realmSet$lastDate(r4)
        L_0x0128:
            java.lang.String r4 = "lastAuthor"
            boolean r5 = r15.has(r4)
            if (r5 == 0) goto L_0x0141
            boolean r5 = r15.isNull(r4)
            if (r5 == 0) goto L_0x013a
            r3.realmSet$lastAuthor(r12)
            goto L_0x0141
        L_0x013a:
            java.lang.String r4 = r15.getString(r4)
            r3.realmSet$lastAuthor(r4)
        L_0x0141:
            java.lang.String r4 = "readOnly"
            boolean r5 = r15.has(r4)
            if (r5 == 0) goto L_0x015f
            boolean r5 = r15.isNull(r4)
            if (r5 != 0) goto L_0x0157
            int r4 = r15.getInt(r4)
            r3.realmSet$readOnly(r4)
            goto L_0x015f
        L_0x0157:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Trying to set non-nullable field 'readOnly' to null."
            r0.<init>(r1)
            throw r0
        L_0x015f:
            java.lang.String r4 = "lastAuthorImg"
            boolean r5 = r15.has(r4)
            if (r5 == 0) goto L_0x0178
            boolean r5 = r15.isNull(r4)
            if (r5 == 0) goto L_0x0171
            r3.realmSet$lastAuthorImg(r12)
            goto L_0x0178
        L_0x0171:
            java.lang.String r4 = r15.getString(r4)
            r3.realmSet$lastAuthorImg(r4)
        L_0x0178:
            java.lang.String r4 = "removeCaption"
            boolean r5 = r15.has(r4)
            if (r5 == 0) goto L_0x0191
            boolean r5 = r15.isNull(r4)
            if (r5 == 0) goto L_0x018a
            r3.realmSet$removeCaption(r12)
            goto L_0x0191
        L_0x018a:
            java.lang.String r4 = r15.getString(r4)
            r3.realmSet$removeCaption(r4)
        L_0x0191:
            java.lang.String r4 = "serviceType"
            boolean r5 = r15.has(r4)
            if (r5 == 0) goto L_0x01aa
            boolean r5 = r15.isNull(r4)
            if (r5 == 0) goto L_0x01a3
            r3.realmSet$serviceType(r12)
            goto L_0x01aa
        L_0x01a3:
            java.lang.String r4 = r15.getString(r4)
            r3.realmSet$serviceType(r4)
        L_0x01aa:
            java.lang.String r4 = "participantsCount"
            boolean r5 = r15.has(r4)
            if (r5 == 0) goto L_0x01c8
            boolean r5 = r15.isNull(r4)
            if (r5 != 0) goto L_0x01c0
            int r4 = r15.getInt(r4)
            r3.realmSet$participantsCount(r4)
            goto L_0x01c8
        L_0x01c0:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Trying to set non-nullable field 'participantsCount' to null."
            r0.<init>(r1)
            throw r0
        L_0x01c8:
            java.lang.String r4 = "ownerId"
            boolean r4 = r15.has(r4)
            if (r4 == 0) goto L_0x01e5
            java.lang.String r4 = "ownerId"
            boolean r4 = r15.isNull(r4)
            if (r4 == 0) goto L_0x01dc
            r3.realmSet$ownerId(r12)
            goto L_0x01e5
        L_0x01dc:
            java.lang.String r4 = "ownerId"
            java.lang.String r4 = r15.getString(r4)
            r3.realmSet$ownerId(r4)
        L_0x01e5:
            java.lang.String r4 = "sound"
            boolean r4 = r15.has(r4)
            if (r4 == 0) goto L_0x0206
            java.lang.String r4 = "sound"
            boolean r4 = r15.isNull(r4)
            if (r4 == 0) goto L_0x01f9
            r3.realmSet$sound(r12)
            goto L_0x0206
        L_0x01f9:
            java.lang.String r4 = "sound"
            boolean r4 = r15.getBoolean(r4)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r3.realmSet$sound(r4)
        L_0x0206:
            boolean r4 = r15.has(r2)
            if (r4 == 0) goto L_0x023a
            boolean r4 = r15.isNull(r2)
            if (r4 == 0) goto L_0x0216
            r3.realmSet$userList(r12)
            goto L_0x023a
        L_0x0216:
            io.realm.RealmList r4 = r3.realmGet$userList()
            r4.clear()
            org.json.JSONArray r2 = r15.getJSONArray(r2)
            r4 = 0
        L_0x0222:
            int r5 = r2.length()
            if (r4 >= r5) goto L_0x023a
            org.json.JSONObject r5 = r2.getJSONObject(r4)
            ru.unicorn.ujin.data.entities.chats.Author r5 = p046io.realm.ru_unicorn_ujin_data_entities_chats_AuthorRealmProxy.createOrUpdateUsingJsonObject(r14, r5, r8)
            io.realm.RealmList r6 = r3.realmGet$userList()
            r6.add(r5)
            int r4 = r4 + 1
            goto L_0x0222
        L_0x023a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.ru_unicorn_ujin_data_realm_ChatRealmProxy.createOrUpdateUsingJsonObject(io.realm.Realm, org.json.JSONObject, boolean):ru.unicorn.ujin.data.realm.Chat");
    }

    public static Chat createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        Chat chat = new Chat();
        ru_unicorn_ujin_data_realm_ChatRealmProxyInterface ru_unicorn_ujin_data_realm_chatrealmproxyinterface = chat;
        jsonReader.beginObject();
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("id")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmSet$id(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmSet$id((String) null);
                }
                z = true;
            } else if (nextName.equals("notRead")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmSet$notRead(Integer.valueOf(jsonReader.nextInt()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmSet$notRead((Integer) null);
                }
            } else if (nextName.equals("title")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmSet$title(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmSet$title((String) null);
                }
            } else if (nextName.equals("count")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmSet$count(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmSet$count((String) null);
                }
            } else if (nextName.equals("lastMessage")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmSet$lastMessage(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmSet$lastMessage((String) null);
                }
            } else if (nextName.equals("lastDate")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmSet$lastDate(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmSet$lastDate((String) null);
                }
            } else if (nextName.equals("lastAuthor")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmSet$lastAuthor(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmSet$lastAuthor((String) null);
                }
            } else if (nextName.equals(Constants.CHAT_READONLY)) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmSet$readOnly(jsonReader.nextInt());
                } else {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'readOnly' to null.");
                }
            } else if (nextName.equals("lastAuthorImg")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmSet$lastAuthorImg(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmSet$lastAuthorImg((String) null);
                }
            } else if (nextName.equals("removeCaption")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmSet$removeCaption(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmSet$removeCaption((String) null);
                }
            } else if (nextName.equals(Chat.Fields.serviceType)) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmSet$serviceType(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmSet$serviceType((String) null);
                }
            } else if (nextName.equals(Constants.CHAT_PARTICIPANTS_COUNT)) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmSet$participantsCount(jsonReader.nextInt());
                } else {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'participantsCount' to null.");
                }
            } else if (nextName.equals("ownerId")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmSet$ownerId(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmSet$ownerId((String) null);
                }
            } else if (nextName.equals("sound")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmSet$sound(Boolean.valueOf(jsonReader.nextBoolean()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmSet$sound((Boolean) null);
                }
            } else if (!nextName.equals("userList")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.skipValue();
                ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmSet$userList((RealmList<Author>) null);
            } else {
                ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmSet$userList(new RealmList());
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmGet$userList().add(ru_unicorn_ujin_data_entities_chats_AuthorRealmProxy.createUsingJsonStream(realm, jsonReader));
                }
                jsonReader.endArray();
            }
        }
        jsonReader.endObject();
        if (z) {
            return (Chat) realm.copyToRealm(chat, new ImportFlag[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
    }

    private static ru_unicorn_ujin_data_realm_ChatRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) Chat.class), false, Collections.emptyList());
        ru_unicorn_ujin_data_realm_ChatRealmProxy ru_unicorn_ujin_data_realm_chatrealmproxy = new ru_unicorn_ujin_data_realm_ChatRealmProxy();
        realmObjectContext.clear();
        return ru_unicorn_ujin_data_realm_chatrealmproxy;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.data.realm.Chat copyOrUpdate(p046io.realm.Realm r8, p046io.realm.ru_unicorn_ujin_data_realm_ChatRealmProxy.ChatColumnInfo r9, p035ru.unicorn.ujin.data.realm.Chat r10, boolean r11, java.util.Map<p046io.realm.RealmModel, p046io.realm.internal.RealmObjectProxy> r12, java.util.Set<p046io.realm.ImportFlag> r13) {
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
            ru.unicorn.ujin.data.realm.Chat r1 = (p035ru.unicorn.ujin.data.realm.Chat) r1
            return r1
        L_0x004b:
            r1 = 0
            if (r11 == 0) goto L_0x0093
            java.lang.Class<ru.unicorn.ujin.data.realm.Chat> r2 = p035ru.unicorn.ujin.data.realm.Chat.class
            io.realm.internal.Table r2 = r8.getTable(r2)
            long r3 = r9.idIndex
            r5 = r10
            io.realm.ru_unicorn_ujin_data_realm_ChatRealmProxyInterface r5 = (p046io.realm.ru_unicorn_ujin_data_realm_ChatRealmProxyInterface) r5
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
            io.realm.ru_unicorn_ujin_data_realm_ChatRealmProxy r1 = new io.realm.ru_unicorn_ujin_data_realm_ChatRealmProxy     // Catch:{ all -> 0x008e }
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
            ru.unicorn.ujin.data.realm.Chat r8 = update(r1, r2, r3, r4, r5, r6)
            goto L_0x00a5
        L_0x00a1:
            ru.unicorn.ujin.data.realm.Chat r8 = copy(r8, r9, r10, r11, r12, r13)
        L_0x00a5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.ru_unicorn_ujin_data_realm_ChatRealmProxy.copyOrUpdate(io.realm.Realm, io.realm.ru_unicorn_ujin_data_realm_ChatRealmProxy$ChatColumnInfo, ru.unicorn.ujin.data.realm.Chat, boolean, java.util.Map, java.util.Set):ru.unicorn.ujin.data.realm.Chat");
    }

    public static Chat copy(Realm realm, ChatColumnInfo chatColumnInfo, Chat chat, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(chat);
        if (realmObjectProxy != null) {
            return (Chat) realmObjectProxy;
        }
        ru_unicorn_ujin_data_realm_ChatRealmProxyInterface ru_unicorn_ujin_data_realm_chatrealmproxyinterface = chat;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(Chat.class), chatColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(chatColumnInfo.idIndex, ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmGet$id());
        osObjectBuilder.addInteger(chatColumnInfo.notReadIndex, ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmGet$notRead());
        osObjectBuilder.addString(chatColumnInfo.titleIndex, ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmGet$title());
        osObjectBuilder.addString(chatColumnInfo.countIndex, ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmGet$count());
        osObjectBuilder.addString(chatColumnInfo.lastMessageIndex, ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmGet$lastMessage());
        osObjectBuilder.addString(chatColumnInfo.lastDateIndex, ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmGet$lastDate());
        osObjectBuilder.addString(chatColumnInfo.lastAuthorIndex, ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmGet$lastAuthor());
        osObjectBuilder.addInteger(chatColumnInfo.readOnlyIndex, Integer.valueOf(ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmGet$readOnly()));
        osObjectBuilder.addString(chatColumnInfo.lastAuthorImgIndex, ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmGet$lastAuthorImg());
        osObjectBuilder.addString(chatColumnInfo.removeCaptionIndex, ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmGet$removeCaption());
        osObjectBuilder.addString(chatColumnInfo.serviceTypeIndex, ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmGet$serviceType());
        osObjectBuilder.addInteger(chatColumnInfo.participantsCountIndex, Integer.valueOf(ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmGet$participantsCount()));
        osObjectBuilder.addString(chatColumnInfo.ownerIdIndex, ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmGet$ownerId());
        osObjectBuilder.addBoolean(chatColumnInfo.soundIndex, ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmGet$sound());
        ru_unicorn_ujin_data_realm_ChatRealmProxy newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(chat, newProxyInstance);
        RealmList<Author> realmGet$userList = ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmGet$userList();
        if (realmGet$userList != null) {
            RealmList<Author> realmGet$userList2 = newProxyInstance.realmGet$userList();
            realmGet$userList2.clear();
            for (int i = 0; i < realmGet$userList.size(); i++) {
                Author author = realmGet$userList.get(i);
                Author author2 = (Author) map.get(author);
                if (author2 != null) {
                    realmGet$userList2.add(author2);
                } else {
                    realmGet$userList2.add(ru_unicorn_ujin_data_entities_chats_AuthorRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_entities_chats_AuthorRealmProxy.AuthorColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Author.class), author, z, map, set));
                }
            }
        }
        return newProxyInstance;
    }

    public static long insert(Realm realm, Chat chat, Map<RealmModel, Long> map) {
        long j;
        long j2;
        long j3;
        Realm realm2 = realm;
        Chat chat2 = chat;
        Map<RealmModel, Long> map2 = map;
        if (chat2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) chat2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(Chat.class);
        long nativePtr = table.getNativePtr();
        ChatColumnInfo chatColumnInfo = (ChatColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Chat.class);
        long j4 = chatColumnInfo.idIndex;
        ru_unicorn_ujin_data_realm_ChatRealmProxyInterface ru_unicorn_ujin_data_realm_chatrealmproxyinterface = chat2;
        String realmGet$id = ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmGet$id();
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
        map2.put(chat2, Long.valueOf(j2));
        Integer realmGet$notRead = ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmGet$notRead();
        if (realmGet$notRead != null) {
            j3 = j2;
            Table.nativeSetLong(nativePtr, chatColumnInfo.notReadIndex, j2, realmGet$notRead.longValue(), false);
        } else {
            j3 = j2;
        }
        String realmGet$title = ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, chatColumnInfo.titleIndex, j3, realmGet$title, false);
        }
        String realmGet$count = ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmGet$count();
        if (realmGet$count != null) {
            Table.nativeSetString(nativePtr, chatColumnInfo.countIndex, j3, realmGet$count, false);
        }
        String realmGet$lastMessage = ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmGet$lastMessage();
        if (realmGet$lastMessage != null) {
            Table.nativeSetString(nativePtr, chatColumnInfo.lastMessageIndex, j3, realmGet$lastMessage, false);
        }
        String realmGet$lastDate = ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmGet$lastDate();
        if (realmGet$lastDate != null) {
            Table.nativeSetString(nativePtr, chatColumnInfo.lastDateIndex, j3, realmGet$lastDate, false);
        }
        String realmGet$lastAuthor = ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmGet$lastAuthor();
        if (realmGet$lastAuthor != null) {
            Table.nativeSetString(nativePtr, chatColumnInfo.lastAuthorIndex, j3, realmGet$lastAuthor, false);
        }
        Table.nativeSetLong(nativePtr, chatColumnInfo.readOnlyIndex, j3, (long) ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmGet$readOnly(), false);
        String realmGet$lastAuthorImg = ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmGet$lastAuthorImg();
        if (realmGet$lastAuthorImg != null) {
            Table.nativeSetString(nativePtr, chatColumnInfo.lastAuthorImgIndex, j3, realmGet$lastAuthorImg, false);
        }
        String realmGet$removeCaption = ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmGet$removeCaption();
        if (realmGet$removeCaption != null) {
            Table.nativeSetString(nativePtr, chatColumnInfo.removeCaptionIndex, j3, realmGet$removeCaption, false);
        }
        String realmGet$serviceType = ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmGet$serviceType();
        if (realmGet$serviceType != null) {
            Table.nativeSetString(nativePtr, chatColumnInfo.serviceTypeIndex, j3, realmGet$serviceType, false);
        }
        Table.nativeSetLong(nativePtr, chatColumnInfo.participantsCountIndex, j3, (long) ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmGet$participantsCount(), false);
        String realmGet$ownerId = ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmGet$ownerId();
        if (realmGet$ownerId != null) {
            Table.nativeSetString(nativePtr, chatColumnInfo.ownerIdIndex, j3, realmGet$ownerId, false);
        }
        Boolean realmGet$sound = ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmGet$sound();
        if (realmGet$sound != null) {
            Table.nativeSetBoolean(nativePtr, chatColumnInfo.soundIndex, j3, realmGet$sound.booleanValue(), false);
        }
        RealmList<Author> realmGet$userList = ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmGet$userList();
        if (realmGet$userList == null) {
            return j3;
        }
        long j5 = j3;
        OsList osList = new OsList(table.getUncheckedRow(j5), chatColumnInfo.userListIndex);
        Iterator<Author> it = realmGet$userList.iterator();
        while (it.hasNext()) {
            Author next = it.next();
            Long l = map2.get(next);
            if (l == null) {
                l = Long.valueOf(ru_unicorn_ujin_data_entities_chats_AuthorRealmProxy.insert(realm2, next, map2));
            }
            osList.addRow(l.longValue());
        }
        return j5;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        long j3;
        long j4;
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(Chat.class);
        long nativePtr = table.getNativePtr();
        ChatColumnInfo chatColumnInfo = (ChatColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Chat.class);
        long j5 = chatColumnInfo.idIndex;
        while (it.hasNext()) {
            Chat chat = (Chat) it.next();
            if (!map2.containsKey(chat)) {
                if (chat instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) chat;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(chat, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                ru_unicorn_ujin_data_realm_ChatRealmProxyInterface ru_unicorn_ujin_data_realm_chatrealmproxyinterface = chat;
                String realmGet$id = ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmGet$id();
                if (realmGet$id == null) {
                    j = Table.nativeFindFirstNull(nativePtr, j5);
                } else {
                    j = Table.nativeFindFirstString(nativePtr, j5, realmGet$id);
                }
                if (j == -1) {
                    j2 = OsObject.createRowWithPrimaryKey(table, j5, realmGet$id);
                } else {
                    Table.throwDuplicatePrimaryKeyException(realmGet$id);
                    j2 = j;
                }
                map2.put(chat, Long.valueOf(j2));
                Integer realmGet$notRead = ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmGet$notRead();
                if (realmGet$notRead != null) {
                    j4 = j2;
                    j3 = j5;
                    Table.nativeSetLong(nativePtr, chatColumnInfo.notReadIndex, j2, realmGet$notRead.longValue(), false);
                } else {
                    j4 = j2;
                    j3 = j5;
                }
                String realmGet$title = ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    Table.nativeSetString(nativePtr, chatColumnInfo.titleIndex, j4, realmGet$title, false);
                }
                String realmGet$count = ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmGet$count();
                if (realmGet$count != null) {
                    Table.nativeSetString(nativePtr, chatColumnInfo.countIndex, j4, realmGet$count, false);
                }
                String realmGet$lastMessage = ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmGet$lastMessage();
                if (realmGet$lastMessage != null) {
                    Table.nativeSetString(nativePtr, chatColumnInfo.lastMessageIndex, j4, realmGet$lastMessage, false);
                }
                String realmGet$lastDate = ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmGet$lastDate();
                if (realmGet$lastDate != null) {
                    Table.nativeSetString(nativePtr, chatColumnInfo.lastDateIndex, j4, realmGet$lastDate, false);
                }
                String realmGet$lastAuthor = ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmGet$lastAuthor();
                if (realmGet$lastAuthor != null) {
                    Table.nativeSetString(nativePtr, chatColumnInfo.lastAuthorIndex, j4, realmGet$lastAuthor, false);
                }
                Table.nativeSetLong(nativePtr, chatColumnInfo.readOnlyIndex, j4, (long) ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmGet$readOnly(), false);
                String realmGet$lastAuthorImg = ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmGet$lastAuthorImg();
                if (realmGet$lastAuthorImg != null) {
                    Table.nativeSetString(nativePtr, chatColumnInfo.lastAuthorImgIndex, j4, realmGet$lastAuthorImg, false);
                }
                String realmGet$removeCaption = ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmGet$removeCaption();
                if (realmGet$removeCaption != null) {
                    Table.nativeSetString(nativePtr, chatColumnInfo.removeCaptionIndex, j4, realmGet$removeCaption, false);
                }
                String realmGet$serviceType = ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmGet$serviceType();
                if (realmGet$serviceType != null) {
                    Table.nativeSetString(nativePtr, chatColumnInfo.serviceTypeIndex, j4, realmGet$serviceType, false);
                }
                Table.nativeSetLong(nativePtr, chatColumnInfo.participantsCountIndex, j4, (long) ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmGet$participantsCount(), false);
                String realmGet$ownerId = ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmGet$ownerId();
                if (realmGet$ownerId != null) {
                    Table.nativeSetString(nativePtr, chatColumnInfo.ownerIdIndex, j4, realmGet$ownerId, false);
                }
                Boolean realmGet$sound = ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmGet$sound();
                if (realmGet$sound != null) {
                    Table.nativeSetBoolean(nativePtr, chatColumnInfo.soundIndex, j4, realmGet$sound.booleanValue(), false);
                }
                RealmList<Author> realmGet$userList = ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmGet$userList();
                if (realmGet$userList != null) {
                    OsList osList = new OsList(table.getUncheckedRow(j4), chatColumnInfo.userListIndex);
                    Iterator<Author> it2 = realmGet$userList.iterator();
                    while (it2.hasNext()) {
                        Author next = it2.next();
                        Long l = map2.get(next);
                        if (l == null) {
                            l = Long.valueOf(ru_unicorn_ujin_data_entities_chats_AuthorRealmProxy.insert(realm2, next, map2));
                        }
                        osList.addRow(l.longValue());
                    }
                }
                j5 = j3;
            }
        }
    }

    public static long insertOrUpdate(Realm realm, Chat chat, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Realm realm2 = realm;
        Chat chat2 = chat;
        Map<RealmModel, Long> map2 = map;
        if (chat2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) chat2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(Chat.class);
        long nativePtr = table.getNativePtr();
        ChatColumnInfo chatColumnInfo = (ChatColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Chat.class);
        long j3 = chatColumnInfo.idIndex;
        ru_unicorn_ujin_data_realm_ChatRealmProxyInterface ru_unicorn_ujin_data_realm_chatrealmproxyinterface = chat2;
        String realmGet$id = ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmGet$id();
        if (realmGet$id == null) {
            j = Table.nativeFindFirstNull(nativePtr, j3);
        } else {
            j = Table.nativeFindFirstString(nativePtr, j3, realmGet$id);
        }
        long createRowWithPrimaryKey = j == -1 ? OsObject.createRowWithPrimaryKey(table, j3, realmGet$id) : j;
        map2.put(chat2, Long.valueOf(createRowWithPrimaryKey));
        Integer realmGet$notRead = ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmGet$notRead();
        if (realmGet$notRead != null) {
            j2 = createRowWithPrimaryKey;
            Table.nativeSetLong(nativePtr, chatColumnInfo.notReadIndex, createRowWithPrimaryKey, realmGet$notRead.longValue(), false);
        } else {
            j2 = createRowWithPrimaryKey;
            Table.nativeSetNull(nativePtr, chatColumnInfo.notReadIndex, j2, false);
        }
        String realmGet$title = ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, chatColumnInfo.titleIndex, j2, realmGet$title, false);
        } else {
            Table.nativeSetNull(nativePtr, chatColumnInfo.titleIndex, j2, false);
        }
        String realmGet$count = ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmGet$count();
        if (realmGet$count != null) {
            Table.nativeSetString(nativePtr, chatColumnInfo.countIndex, j2, realmGet$count, false);
        } else {
            Table.nativeSetNull(nativePtr, chatColumnInfo.countIndex, j2, false);
        }
        String realmGet$lastMessage = ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmGet$lastMessage();
        if (realmGet$lastMessage != null) {
            Table.nativeSetString(nativePtr, chatColumnInfo.lastMessageIndex, j2, realmGet$lastMessage, false);
        } else {
            Table.nativeSetNull(nativePtr, chatColumnInfo.lastMessageIndex, j2, false);
        }
        String realmGet$lastDate = ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmGet$lastDate();
        if (realmGet$lastDate != null) {
            Table.nativeSetString(nativePtr, chatColumnInfo.lastDateIndex, j2, realmGet$lastDate, false);
        } else {
            Table.nativeSetNull(nativePtr, chatColumnInfo.lastDateIndex, j2, false);
        }
        String realmGet$lastAuthor = ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmGet$lastAuthor();
        if (realmGet$lastAuthor != null) {
            Table.nativeSetString(nativePtr, chatColumnInfo.lastAuthorIndex, j2, realmGet$lastAuthor, false);
        } else {
            Table.nativeSetNull(nativePtr, chatColumnInfo.lastAuthorIndex, j2, false);
        }
        Table.nativeSetLong(nativePtr, chatColumnInfo.readOnlyIndex, j2, (long) ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmGet$readOnly(), false);
        String realmGet$lastAuthorImg = ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmGet$lastAuthorImg();
        if (realmGet$lastAuthorImg != null) {
            Table.nativeSetString(nativePtr, chatColumnInfo.lastAuthorImgIndex, j2, realmGet$lastAuthorImg, false);
        } else {
            Table.nativeSetNull(nativePtr, chatColumnInfo.lastAuthorImgIndex, j2, false);
        }
        String realmGet$removeCaption = ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmGet$removeCaption();
        if (realmGet$removeCaption != null) {
            Table.nativeSetString(nativePtr, chatColumnInfo.removeCaptionIndex, j2, realmGet$removeCaption, false);
        } else {
            Table.nativeSetNull(nativePtr, chatColumnInfo.removeCaptionIndex, j2, false);
        }
        String realmGet$serviceType = ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmGet$serviceType();
        if (realmGet$serviceType != null) {
            Table.nativeSetString(nativePtr, chatColumnInfo.serviceTypeIndex, j2, realmGet$serviceType, false);
        } else {
            Table.nativeSetNull(nativePtr, chatColumnInfo.serviceTypeIndex, j2, false);
        }
        Table.nativeSetLong(nativePtr, chatColumnInfo.participantsCountIndex, j2, (long) ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmGet$participantsCount(), false);
        String realmGet$ownerId = ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmGet$ownerId();
        if (realmGet$ownerId != null) {
            Table.nativeSetString(nativePtr, chatColumnInfo.ownerIdIndex, j2, realmGet$ownerId, false);
        } else {
            Table.nativeSetNull(nativePtr, chatColumnInfo.ownerIdIndex, j2, false);
        }
        Boolean realmGet$sound = ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmGet$sound();
        if (realmGet$sound != null) {
            Table.nativeSetBoolean(nativePtr, chatColumnInfo.soundIndex, j2, realmGet$sound.booleanValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, chatColumnInfo.soundIndex, j2, false);
        }
        long j4 = j2;
        OsList osList = new OsList(table.getUncheckedRow(j4), chatColumnInfo.userListIndex);
        RealmList<Author> realmGet$userList = ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmGet$userList();
        if (realmGet$userList == null || ((long) realmGet$userList.size()) != osList.size()) {
            osList.removeAll();
            if (realmGet$userList != null) {
                Iterator<Author> it = realmGet$userList.iterator();
                while (it.hasNext()) {
                    Author next = it.next();
                    Long l = map2.get(next);
                    if (l == null) {
                        l = Long.valueOf(ru_unicorn_ujin_data_entities_chats_AuthorRealmProxy.insertOrUpdate(realm2, next, map2));
                    }
                    osList.addRow(l.longValue());
                }
            }
        } else {
            int size = realmGet$userList.size();
            for (int i = 0; i < size; i++) {
                Author author = realmGet$userList.get(i);
                Long l2 = map2.get(author);
                if (l2 == null) {
                    l2 = Long.valueOf(ru_unicorn_ujin_data_entities_chats_AuthorRealmProxy.insertOrUpdate(realm2, author, map2));
                }
                osList.setRow((long) i, l2.longValue());
            }
        }
        return j4;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        long j3;
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(Chat.class);
        long nativePtr = table.getNativePtr();
        ChatColumnInfo chatColumnInfo = (ChatColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Chat.class);
        long j4 = chatColumnInfo.idIndex;
        while (it.hasNext()) {
            Chat chat = (Chat) it.next();
            if (!map2.containsKey(chat)) {
                if (chat instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) chat;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(chat, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                ru_unicorn_ujin_data_realm_ChatRealmProxyInterface ru_unicorn_ujin_data_realm_chatrealmproxyinterface = chat;
                String realmGet$id = ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmGet$id();
                if (realmGet$id == null) {
                    j = Table.nativeFindFirstNull(nativePtr, j4);
                } else {
                    j = Table.nativeFindFirstString(nativePtr, j4, realmGet$id);
                }
                long createRowWithPrimaryKey = j == -1 ? OsObject.createRowWithPrimaryKey(table, j4, realmGet$id) : j;
                map2.put(chat, Long.valueOf(createRowWithPrimaryKey));
                Integer realmGet$notRead = ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmGet$notRead();
                if (realmGet$notRead != null) {
                    j3 = createRowWithPrimaryKey;
                    j2 = j4;
                    Table.nativeSetLong(nativePtr, chatColumnInfo.notReadIndex, createRowWithPrimaryKey, realmGet$notRead.longValue(), false);
                } else {
                    j3 = createRowWithPrimaryKey;
                    j2 = j4;
                    Table.nativeSetNull(nativePtr, chatColumnInfo.notReadIndex, createRowWithPrimaryKey, false);
                }
                String realmGet$title = ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    Table.nativeSetString(nativePtr, chatColumnInfo.titleIndex, j3, realmGet$title, false);
                } else {
                    Table.nativeSetNull(nativePtr, chatColumnInfo.titleIndex, j3, false);
                }
                String realmGet$count = ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmGet$count();
                if (realmGet$count != null) {
                    Table.nativeSetString(nativePtr, chatColumnInfo.countIndex, j3, realmGet$count, false);
                } else {
                    Table.nativeSetNull(nativePtr, chatColumnInfo.countIndex, j3, false);
                }
                String realmGet$lastMessage = ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmGet$lastMessage();
                if (realmGet$lastMessage != null) {
                    Table.nativeSetString(nativePtr, chatColumnInfo.lastMessageIndex, j3, realmGet$lastMessage, false);
                } else {
                    Table.nativeSetNull(nativePtr, chatColumnInfo.lastMessageIndex, j3, false);
                }
                String realmGet$lastDate = ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmGet$lastDate();
                if (realmGet$lastDate != null) {
                    Table.nativeSetString(nativePtr, chatColumnInfo.lastDateIndex, j3, realmGet$lastDate, false);
                } else {
                    Table.nativeSetNull(nativePtr, chatColumnInfo.lastDateIndex, j3, false);
                }
                String realmGet$lastAuthor = ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmGet$lastAuthor();
                if (realmGet$lastAuthor != null) {
                    Table.nativeSetString(nativePtr, chatColumnInfo.lastAuthorIndex, j3, realmGet$lastAuthor, false);
                } else {
                    Table.nativeSetNull(nativePtr, chatColumnInfo.lastAuthorIndex, j3, false);
                }
                Table.nativeSetLong(nativePtr, chatColumnInfo.readOnlyIndex, j3, (long) ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmGet$readOnly(), false);
                String realmGet$lastAuthorImg = ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmGet$lastAuthorImg();
                if (realmGet$lastAuthorImg != null) {
                    Table.nativeSetString(nativePtr, chatColumnInfo.lastAuthorImgIndex, j3, realmGet$lastAuthorImg, false);
                } else {
                    Table.nativeSetNull(nativePtr, chatColumnInfo.lastAuthorImgIndex, j3, false);
                }
                String realmGet$removeCaption = ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmGet$removeCaption();
                if (realmGet$removeCaption != null) {
                    Table.nativeSetString(nativePtr, chatColumnInfo.removeCaptionIndex, j3, realmGet$removeCaption, false);
                } else {
                    Table.nativeSetNull(nativePtr, chatColumnInfo.removeCaptionIndex, j3, false);
                }
                String realmGet$serviceType = ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmGet$serviceType();
                if (realmGet$serviceType != null) {
                    Table.nativeSetString(nativePtr, chatColumnInfo.serviceTypeIndex, j3, realmGet$serviceType, false);
                } else {
                    Table.nativeSetNull(nativePtr, chatColumnInfo.serviceTypeIndex, j3, false);
                }
                Table.nativeSetLong(nativePtr, chatColumnInfo.participantsCountIndex, j3, (long) ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmGet$participantsCount(), false);
                String realmGet$ownerId = ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmGet$ownerId();
                if (realmGet$ownerId != null) {
                    Table.nativeSetString(nativePtr, chatColumnInfo.ownerIdIndex, j3, realmGet$ownerId, false);
                } else {
                    Table.nativeSetNull(nativePtr, chatColumnInfo.ownerIdIndex, j3, false);
                }
                Boolean realmGet$sound = ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmGet$sound();
                if (realmGet$sound != null) {
                    Table.nativeSetBoolean(nativePtr, chatColumnInfo.soundIndex, j3, realmGet$sound.booleanValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, chatColumnInfo.soundIndex, j3, false);
                }
                OsList osList = new OsList(table.getUncheckedRow(j3), chatColumnInfo.userListIndex);
                RealmList<Author> realmGet$userList = ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmGet$userList();
                if (realmGet$userList == null || ((long) realmGet$userList.size()) != osList.size()) {
                    osList.removeAll();
                    if (realmGet$userList != null) {
                        Iterator<Author> it2 = realmGet$userList.iterator();
                        while (it2.hasNext()) {
                            Author next = it2.next();
                            Long l = map2.get(next);
                            if (l == null) {
                                l = Long.valueOf(ru_unicorn_ujin_data_entities_chats_AuthorRealmProxy.insertOrUpdate(realm2, next, map2));
                            }
                            osList.addRow(l.longValue());
                        }
                    }
                } else {
                    int size = realmGet$userList.size();
                    for (int i = 0; i < size; i++) {
                        Author author = realmGet$userList.get(i);
                        Long l2 = map2.get(author);
                        if (l2 == null) {
                            l2 = Long.valueOf(ru_unicorn_ujin_data_entities_chats_AuthorRealmProxy.insertOrUpdate(realm2, author, map2));
                        }
                        osList.setRow((long) i, l2.longValue());
                    }
                }
                j4 = j2;
            }
        }
    }

    public static Chat createDetachedCopy(Chat chat, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        Chat chat2;
        if (i > i2 || chat == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(chat);
        if (cacheData == null) {
            chat2 = new Chat();
            map.put(chat, new RealmObjectProxy.CacheData(i, chat2));
        } else if (i >= cacheData.minDepth) {
            return (Chat) cacheData.object;
        } else {
            cacheData.minDepth = i;
            chat2 = (Chat) cacheData.object;
        }
        ru_unicorn_ujin_data_realm_ChatRealmProxyInterface ru_unicorn_ujin_data_realm_chatrealmproxyinterface = chat2;
        ru_unicorn_ujin_data_realm_ChatRealmProxyInterface ru_unicorn_ujin_data_realm_chatrealmproxyinterface2 = chat;
        ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmSet$id(ru_unicorn_ujin_data_realm_chatrealmproxyinterface2.realmGet$id());
        ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmSet$notRead(ru_unicorn_ujin_data_realm_chatrealmproxyinterface2.realmGet$notRead());
        ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmSet$title(ru_unicorn_ujin_data_realm_chatrealmproxyinterface2.realmGet$title());
        ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmSet$count(ru_unicorn_ujin_data_realm_chatrealmproxyinterface2.realmGet$count());
        ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmSet$lastMessage(ru_unicorn_ujin_data_realm_chatrealmproxyinterface2.realmGet$lastMessage());
        ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmSet$lastDate(ru_unicorn_ujin_data_realm_chatrealmproxyinterface2.realmGet$lastDate());
        ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmSet$lastAuthor(ru_unicorn_ujin_data_realm_chatrealmproxyinterface2.realmGet$lastAuthor());
        ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmSet$readOnly(ru_unicorn_ujin_data_realm_chatrealmproxyinterface2.realmGet$readOnly());
        ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmSet$lastAuthorImg(ru_unicorn_ujin_data_realm_chatrealmproxyinterface2.realmGet$lastAuthorImg());
        ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmSet$removeCaption(ru_unicorn_ujin_data_realm_chatrealmproxyinterface2.realmGet$removeCaption());
        ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmSet$serviceType(ru_unicorn_ujin_data_realm_chatrealmproxyinterface2.realmGet$serviceType());
        ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmSet$participantsCount(ru_unicorn_ujin_data_realm_chatrealmproxyinterface2.realmGet$participantsCount());
        ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmSet$ownerId(ru_unicorn_ujin_data_realm_chatrealmproxyinterface2.realmGet$ownerId());
        ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmSet$sound(ru_unicorn_ujin_data_realm_chatrealmproxyinterface2.realmGet$sound());
        if (i == i2) {
            ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmSet$userList((RealmList<Author>) null);
        } else {
            RealmList<Author> realmGet$userList = ru_unicorn_ujin_data_realm_chatrealmproxyinterface2.realmGet$userList();
            RealmList realmList = new RealmList();
            ru_unicorn_ujin_data_realm_chatrealmproxyinterface.realmSet$userList(realmList);
            int i3 = i + 1;
            int size = realmGet$userList.size();
            for (int i4 = 0; i4 < size; i4++) {
                realmList.add(ru_unicorn_ujin_data_entities_chats_AuthorRealmProxy.createDetachedCopy(realmGet$userList.get(i4), i3, i2, map));
            }
        }
        return chat2;
    }

    static Chat update(Realm realm, ChatColumnInfo chatColumnInfo, Chat chat, Chat chat2, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        ru_unicorn_ujin_data_realm_ChatRealmProxyInterface ru_unicorn_ujin_data_realm_chatrealmproxyinterface = chat;
        ru_unicorn_ujin_data_realm_ChatRealmProxyInterface ru_unicorn_ujin_data_realm_chatrealmproxyinterface2 = chat2;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(Chat.class), chatColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(chatColumnInfo.idIndex, ru_unicorn_ujin_data_realm_chatrealmproxyinterface2.realmGet$id());
        osObjectBuilder.addInteger(chatColumnInfo.notReadIndex, ru_unicorn_ujin_data_realm_chatrealmproxyinterface2.realmGet$notRead());
        osObjectBuilder.addString(chatColumnInfo.titleIndex, ru_unicorn_ujin_data_realm_chatrealmproxyinterface2.realmGet$title());
        osObjectBuilder.addString(chatColumnInfo.countIndex, ru_unicorn_ujin_data_realm_chatrealmproxyinterface2.realmGet$count());
        osObjectBuilder.addString(chatColumnInfo.lastMessageIndex, ru_unicorn_ujin_data_realm_chatrealmproxyinterface2.realmGet$lastMessage());
        osObjectBuilder.addString(chatColumnInfo.lastDateIndex, ru_unicorn_ujin_data_realm_chatrealmproxyinterface2.realmGet$lastDate());
        osObjectBuilder.addString(chatColumnInfo.lastAuthorIndex, ru_unicorn_ujin_data_realm_chatrealmproxyinterface2.realmGet$lastAuthor());
        osObjectBuilder.addInteger(chatColumnInfo.readOnlyIndex, Integer.valueOf(ru_unicorn_ujin_data_realm_chatrealmproxyinterface2.realmGet$readOnly()));
        osObjectBuilder.addString(chatColumnInfo.lastAuthorImgIndex, ru_unicorn_ujin_data_realm_chatrealmproxyinterface2.realmGet$lastAuthorImg());
        osObjectBuilder.addString(chatColumnInfo.removeCaptionIndex, ru_unicorn_ujin_data_realm_chatrealmproxyinterface2.realmGet$removeCaption());
        osObjectBuilder.addString(chatColumnInfo.serviceTypeIndex, ru_unicorn_ujin_data_realm_chatrealmproxyinterface2.realmGet$serviceType());
        osObjectBuilder.addInteger(chatColumnInfo.participantsCountIndex, Integer.valueOf(ru_unicorn_ujin_data_realm_chatrealmproxyinterface2.realmGet$participantsCount()));
        osObjectBuilder.addString(chatColumnInfo.ownerIdIndex, ru_unicorn_ujin_data_realm_chatrealmproxyinterface2.realmGet$ownerId());
        osObjectBuilder.addBoolean(chatColumnInfo.soundIndex, ru_unicorn_ujin_data_realm_chatrealmproxyinterface2.realmGet$sound());
        RealmList<Author> realmGet$userList = ru_unicorn_ujin_data_realm_chatrealmproxyinterface2.realmGet$userList();
        if (realmGet$userList != null) {
            RealmList realmList = new RealmList();
            for (int i = 0; i < realmGet$userList.size(); i++) {
                Author author = realmGet$userList.get(i);
                Author author2 = (Author) map.get(author);
                if (author2 != null) {
                    realmList.add(author2);
                } else {
                    realmList.add(ru_unicorn_ujin_data_entities_chats_AuthorRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_entities_chats_AuthorRealmProxy.AuthorColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Author.class), author, true, map, set));
                }
            }
            osObjectBuilder.addObjectList(chatColumnInfo.userListIndex, realmList);
        } else {
            osObjectBuilder.addObjectList(chatColumnInfo.userListIndex, new RealmList());
        }
        osObjectBuilder.updateExistingObject();
        return chat;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v17, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v22, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v25, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v28, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v33, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v36, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v38, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v40, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v42, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v44, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v46, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v48, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v50, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v52, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v56, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v57, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v58, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v59, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v60, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v61, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v62, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v63, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v64, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r5 = this;
            boolean r0 = p046io.realm.RealmObject.isValid(r5)
            if (r0 != 0) goto L_0x0009
            java.lang.String r0 = "Invalid object"
            return r0
        L_0x0009:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Chat = proxy["
            r0.<init>(r1)
            java.lang.String r1 = "{id:"
            r0.append(r1)
            java.lang.String r1 = r5.realmGet$id()
            java.lang.String r2 = "null"
            if (r1 == 0) goto L_0x0023
            java.lang.String r1 = r5.realmGet$id()
            goto L_0x0024
        L_0x0023:
            r1 = r2
        L_0x0024:
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r3 = ","
            r0.append(r3)
            java.lang.String r4 = "{notRead:"
            r0.append(r4)
            java.lang.Integer r4 = r5.realmGet$notRead()
            if (r4 == 0) goto L_0x0043
            java.lang.Integer r4 = r5.realmGet$notRead()
            goto L_0x0044
        L_0x0043:
            r4 = r2
        L_0x0044:
            r0.append(r4)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r4 = "{title:"
            r0.append(r4)
            java.lang.String r4 = r5.realmGet$title()
            if (r4 == 0) goto L_0x005e
            java.lang.String r4 = r5.realmGet$title()
            goto L_0x005f
        L_0x005e:
            r4 = r2
        L_0x005f:
            r0.append(r4)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r4 = "{count:"
            r0.append(r4)
            java.lang.String r4 = r5.realmGet$count()
            if (r4 == 0) goto L_0x0079
            java.lang.String r4 = r5.realmGet$count()
            goto L_0x007a
        L_0x0079:
            r4 = r2
        L_0x007a:
            r0.append(r4)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r4 = "{lastMessage:"
            r0.append(r4)
            java.lang.String r4 = r5.realmGet$lastMessage()
            if (r4 == 0) goto L_0x0094
            java.lang.String r4 = r5.realmGet$lastMessage()
            goto L_0x0095
        L_0x0094:
            r4 = r2
        L_0x0095:
            r0.append(r4)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r4 = "{lastDate:"
            r0.append(r4)
            java.lang.String r4 = r5.realmGet$lastDate()
            if (r4 == 0) goto L_0x00af
            java.lang.String r4 = r5.realmGet$lastDate()
            goto L_0x00b0
        L_0x00af:
            r4 = r2
        L_0x00b0:
            r0.append(r4)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r4 = "{lastAuthor:"
            r0.append(r4)
            java.lang.String r4 = r5.realmGet$lastAuthor()
            if (r4 == 0) goto L_0x00ca
            java.lang.String r4 = r5.realmGet$lastAuthor()
            goto L_0x00cb
        L_0x00ca:
            r4 = r2
        L_0x00cb:
            r0.append(r4)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r4 = "{readOnly:"
            r0.append(r4)
            int r4 = r5.realmGet$readOnly()
            r0.append(r4)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r4 = "{lastAuthorImg:"
            r0.append(r4)
            java.lang.String r4 = r5.realmGet$lastAuthorImg()
            if (r4 == 0) goto L_0x00f8
            java.lang.String r4 = r5.realmGet$lastAuthorImg()
            goto L_0x00f9
        L_0x00f8:
            r4 = r2
        L_0x00f9:
            r0.append(r4)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r4 = "{removeCaption:"
            r0.append(r4)
            java.lang.String r4 = r5.realmGet$removeCaption()
            if (r4 == 0) goto L_0x0113
            java.lang.String r4 = r5.realmGet$removeCaption()
            goto L_0x0114
        L_0x0113:
            r4 = r2
        L_0x0114:
            r0.append(r4)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r4 = "{serviceType:"
            r0.append(r4)
            java.lang.String r4 = r5.realmGet$serviceType()
            if (r4 == 0) goto L_0x012e
            java.lang.String r4 = r5.realmGet$serviceType()
            goto L_0x012f
        L_0x012e:
            r4 = r2
        L_0x012f:
            r0.append(r4)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r4 = "{participantsCount:"
            r0.append(r4)
            int r4 = r5.realmGet$participantsCount()
            r0.append(r4)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r4 = "{ownerId:"
            r0.append(r4)
            java.lang.String r4 = r5.realmGet$ownerId()
            if (r4 == 0) goto L_0x015c
            java.lang.String r4 = r5.realmGet$ownerId()
            goto L_0x015d
        L_0x015c:
            r4 = r2
        L_0x015d:
            r0.append(r4)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r4 = "{sound:"
            r0.append(r4)
            java.lang.Boolean r4 = r5.realmGet$sound()
            if (r4 == 0) goto L_0x0176
            java.lang.Boolean r2 = r5.realmGet$sound()
        L_0x0176:
            r0.append(r2)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r2 = "{userList:"
            r0.append(r2)
            java.lang.String r2 = "RealmList<Author>["
            r0.append(r2)
            io.realm.RealmList r2 = r5.realmGet$userList()
            int r2 = r2.size()
            r0.append(r2)
            java.lang.String r2 = "]"
            r0.append(r2)
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.ru_unicorn_ujin_data_realm_ChatRealmProxy.toString():java.lang.String");
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
        ru_unicorn_ujin_data_realm_ChatRealmProxy ru_unicorn_ujin_data_realm_chatrealmproxy = (ru_unicorn_ujin_data_realm_ChatRealmProxy) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_data_realm_chatrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_data_realm_chatrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_data_realm_chatrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
