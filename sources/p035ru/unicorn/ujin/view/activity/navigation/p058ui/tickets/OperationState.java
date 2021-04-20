package p035ru.unicorn.ujin.view.activity.navigation.p058ui.tickets;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.tickets.OperationState */
public enum OperationState {
    WAITING_FOR_PAYMENT("Ожидает подтверждения"),
    PAYMENT_RECEIVED("Исполнено"),
    PAYMENT_CANCELED("Отклонено");
    
    private String title;

    private OperationState(String str) {
        this.title = str;
    }

    public String toString() {
        return toString().toLowerCase();
    }

    public String getTitle() {
        return this.title;
    }
}
