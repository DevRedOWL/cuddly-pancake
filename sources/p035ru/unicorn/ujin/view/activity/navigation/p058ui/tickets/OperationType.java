package p035ru.unicorn.ujin.view.activity.navigation.p058ui.tickets;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.tickets.OperationType */
public enum OperationType {
    RECEIPT("Квитанция"),
    FILL("Пополнение баланса"),
    PAYMENT("Оплата"),
    EDIT("Изменение баланса");
    
    private String title;

    private OperationType(String str) {
        this.title = str;
    }

    public String toString() {
        return toString().toLowerCase();
    }

    public String getTitle() {
        return this.title;
    }
}
