package p035ru.unicorn.ujin.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.ReactConst;
import p035ru.unicorn.ujin.data.service.FCM;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.ticket.TicketDetailFragment;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, mo51343d2 = {"Lru/unicorn/ujin/data/Enums;", "", "()V", "PushClickEventType", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.Enums */
/* compiled from: Enums.kt */
public final class Enums {

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001c\b\u0001\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001eB\u001f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001d¨\u0006\u001f"}, mo51343d2 = {"Lru/unicorn/ujin/data/Enums$PushClickEventType;", "", "eventValue", "", "eventTypeID", "secondEventTypeID", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEventTypeID", "()Ljava/lang/String;", "getEventValue", "getSecondEventTypeID", "DEFAULT", "SMART_HOUSE", "SMART_HOUSE_MESSAGE", "NEWS_PUPLISH", "TICKET_UPDATED", "TICKET_UPDATED_CHAT", "NEW_MESSAGE", "MARKET_COMPANY", "MARKET_OFFER", "MARKET_GROUP", "MARKET", "ACCRUAL_CREATED", "PASS_REVOKED", "RENT_STATUS_CHANGED", "BLE_ACTION_BY_CLICK", "PASS_SHOW_MY", "EMPLOYEE_PERMISSION_CHANGED", "RESIDENT_APARTMENT_ACCEPT", "RESIDENT_APARTMENT_REJECT", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.data.Enums$PushClickEventType */
    /* compiled from: Enums.kt */
    public enum PushClickEventType {
        DEFAULT("default_value", "", ""),
        SMART_HOUSE("smarthome", "smarthome_id", ""),
        SMART_HOUSE_MESSAGE("newMessage", "", ""),
        NEWS_PUPLISH("news-published", "news_id", ""),
        TICKET_UPDATED("ticket-updated", TicketDetailFragment.f6867ID, ""),
        TICKET_UPDATED_CHAT("ticket-updated-chat", TicketDetailFragment.f6867ID, "chatid"),
        NEW_MESSAGE("new-message", "chatid", ""),
        MARKET_COMPANY("market_company", FCM.MARKET_ID, ""),
        MARKET_OFFER("market_offer", FCM.MARKET_ID, ""),
        MARKET_GROUP("market_group", FCM.MARKET_ID, ""),
        MARKET(ReactConst.MARKET, "", ""),
        ACCRUAL_CREATED("accrual-created", p035ru.unicorn.ujin.view.activity.navigation.p058ui.tickets.TicketDetailFragment.OPERATION_ID, ""),
        PASS_REVOKED("pass-revoked", "", ""),
        RENT_STATUS_CHANGED("rent-state-changed", "", ""),
        BLE_ACTION_BY_CLICK("ble_action", "ble_serial_number", ""),
        PASS_SHOW_MY("pass_show_my", "", ""),
        EMPLOYEE_PERMISSION_CHANGED("employee-permissions-changed", "", ""),
        RESIDENT_APARTMENT_ACCEPT("resident-apartment-accept", "", ""),
        RESIDENT_APARTMENT_REJECT("resident-apartment-reject", "", "");
        
        public static final Companion Companion = null;
        /* access modifiers changed from: private */
        public static final String EVENT_KEY = null;
        private final String eventTypeID;
        private final String eventValue;
        private final String secondEventTypeID;

        private PushClickEventType(String str, String str2, String str3) {
            this.eventValue = str;
            this.eventTypeID = str2;
            this.secondEventTypeID = str3;
        }

        public final String getEventTypeID() {
            return this.eventTypeID;
        }

        public final String getEventValue() {
            return this.eventValue;
        }

        public final String getSecondEventTypeID() {
            return this.secondEventTypeID;
        }

        static {
            Companion = new Companion((DefaultConstructorMarker) null);
            EVENT_KEY = "event";
        }

        @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, mo51343d2 = {"Lru/unicorn/ujin/data/Enums$PushClickEventType$Companion;", "", "()V", "EVENT_KEY", "", "getEVENT_KEY", "()Ljava/lang/String;", "getEventByValue", "Lru/unicorn/ujin/data/Enums$PushClickEventType;", "value", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
        /* renamed from: ru.unicorn.ujin.data.Enums$PushClickEventType$Companion */
        /* compiled from: Enums.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final String getEVENT_KEY() {
                return PushClickEventType.EVENT_KEY;
            }

            public final PushClickEventType getEventByValue(String str) {
                Intrinsics.checkNotNullParameter(str, "value");
                for (PushClickEventType pushClickEventType : PushClickEventType.values()) {
                    if (Intrinsics.areEqual((Object) pushClickEventType.getEventValue(), (Object) str)) {
                        return pushClickEventType;
                    }
                }
                return PushClickEventType.DEFAULT;
            }
        }
    }
}
