package p035ru.unicorn.ujin.view.activity.navigation.p058ui.tickets;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.Diffable;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.ticket.Props;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.tickets.OperationModel */
public class OperationModel implements Diffable<OperationModel> {
    private String key;
    private Props properties;
    private String value;

    public String getKey() {
        return this.key;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String str) {
        this.value = str;
    }

    public OperationModel(String str, String str2) {
        this.key = str;
        this.value = str2;
    }

    public OperationModel(String str, String str2, Props props) {
        this.key = str;
        this.value = str2;
    }

    public OperationModel(String str, Props props) {
        this.key = str;
        this.properties = props;
    }

    public static List<OperationModel> makeTicketModel(Operation operation) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new OperationModel("Лицевой счет", operation.getAccountNumber()));
        arrayList.add(new OperationModel("Компания", operation.getCompanyTitle()));
        BigDecimal abs = new BigDecimal(operation.getBalance().doubleValue()).setScale(2, 4).abs();
        int i = C59431.f6877x52e146b1[OperationType.valueOf(operation.getType().toUpperCase()).ordinal()];
        if (i == 1) {
            arrayList.add(new OperationModel("Сумма к оплате", abs + " ₽"));
            arrayList.add(new OperationModel("Начислено", operation.getSum() + " ₽"));
        } else if (i == 2 || i == 3) {
            arrayList.add(new OperationModel("Сумма операции", operation.getSum() + " ₽"));
        } else if (i == 4) {
            arrayList.add(new OperationModel("Сумма к оплате", abs + " ₽"));
        }
        if (StringUtils.isNotEmpty(operation.getUrlOnDoc()) && StringUtils.isNotEmpty(operation.getFilename())) {
            arrayList.add(new OperationModel(operation.getFilename(), new Props.Builder().setColor(R.color.textHypertextLink).setUrl(operation.getUrlOnDoc()).setValVisability(4).build()));
        }
        return arrayList;
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.tickets.OperationModel$1 */
    static /* synthetic */ class C59431 {

        /* renamed from: $SwitchMap$ru$unicorn$ujin$view$activity$navigation$ui$tickets$OperationType */
        static final /* synthetic */ int[] f6877x52e146b1 = new int[OperationType.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        static {
            /*
                ru.unicorn.ujin.view.activity.navigation.ui.tickets.OperationType[] r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.tickets.OperationType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f6877x52e146b1 = r0
                int[] r0 = f6877x52e146b1     // Catch:{ NoSuchFieldError -> 0x0014 }
                ru.unicorn.ujin.view.activity.navigation.ui.tickets.OperationType r1 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.tickets.OperationType.RECEIPT     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f6877x52e146b1     // Catch:{ NoSuchFieldError -> 0x001f }
                ru.unicorn.ujin.view.activity.navigation.ui.tickets.OperationType r1 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.tickets.OperationType.FILL     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f6877x52e146b1     // Catch:{ NoSuchFieldError -> 0x002a }
                ru.unicorn.ujin.view.activity.navigation.ui.tickets.OperationType r1 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.tickets.OperationType.PAYMENT     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f6877x52e146b1     // Catch:{ NoSuchFieldError -> 0x0035 }
                ru.unicorn.ujin.view.activity.navigation.ui.tickets.OperationType r1 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.tickets.OperationType.EDIT     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.activity.navigation.p058ui.tickets.OperationModel.C59431.<clinit>():void");
        }
    }

    public boolean areItemsTheSame(OperationModel operationModel) {
        return this.key.equals(operationModel.key);
    }

    public boolean areContentsTheSame(OperationModel operationModel) {
        return this.key.equals(operationModel.key);
    }

    public Props getProperties() {
        return this.properties;
    }

    public void setProperties(Props props) {
        this.properties = props;
    }
}
