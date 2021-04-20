package p035ru.unicorn.ujin.metrics;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b,\b\u0001\u0018\u0000 .2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001.B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-¨\u0006/"}, mo51343d2 = {"Lru/unicorn/ujin/metrics/MetricsKeys;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "market", "category", "product", "companyProducts", "addToCart", "marketAction", "marketActionWeb", "marketActionCall", "marketActionEmail", "offerCompanyInfo", "cart", "toShop", "coupons", "orderForm", "paymentForm", "fillRequest", "productPush", "companyProductsPush", "categorySearchWithCompanies", "categorySearchWithOffers", "productSearch", "error", "time0to4", "time4to8", "time8to15", "time15to25", "time25to45", "time45plus", "goToSupportChat", "messageToSupportChat", "goToNewsChat", "goToUKChat", "createGroupChat", "createChat", "messageToGroupChat", "messageToChat", "description", "time", "userId", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.metrics.MetricsKeys */
/* compiled from: MetricsKeys.kt */
public enum MetricsKeys {
    market("Маркет"),
    category("Просмотр категории"),
    product("Просмотр предложения"),
    companyProducts("Просмотр предложений компании"),
    addToCart("Добавление товара в корзину"),
    marketAction("Переход по контакту компании"),
    marketActionWeb("Переход на сайт"),
    marketActionCall("Звонок"),
    marketActionEmail("Электронная почта"),
    offerCompanyInfo("Предложение. Просмотр информации о компании"),
    cart("Переход в корзину"),
    toShop("Переход в магазин"),
    coupons("Переход в раздел купонов"),
    orderForm("Переход на форму заказа"),
    paymentForm("Переход на оплату заказа"),
    fillRequest("Оформление заявки на предложение"),
    productPush("Пуш. Просмотр предложения"),
    companyProductsPush("Пуш. Просмотр предложений компании"),
    categorySearchWithCompanies("Поиск. Переход в категорию с компаниями"),
    categorySearchWithOffers("Поиск. Переход в категорию с предложениями"),
    productSearch("Поиск. Просмотр предложения"),
    error("Ошибка"),
    time0to4("0-4"),
    time4to8("5-8"),
    time8to15("9-15"),
    time15to25("16-25"),
    time25to45("26-45"),
    time45plus("46+"),
    goToSupportChat("Переход в чат с техподдержкой"),
    messageToSupportChat("Отправка сообщения в техподдержку"),
    goToNewsChat("Переход в чат новостей"),
    goToUKChat("Переход в чат с управляющей компанией"),
    createGroupChat("Создание группового чата"),
    createChat("Создание часа с соседом"),
    messageToGroupChat("Отправка сообщения в групповой чат"),
    messageToChat("Отправка сообщения в чат с соседом"),
    description("description"),
    time("time"),
    userId("userId");
    
    public static final Companion Companion = null;
    private final String value;

    @JvmStatic
    public static final MetricsKeys getTime(long j) {
        return Companion.getTime(j);
    }

    private MetricsKeys(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }

    static {
        Companion = new Companion((DefaultConstructorMarker) null);
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, mo51343d2 = {"Lru/unicorn/ujin/metrics/MetricsKeys$Companion;", "", "()V", "getTime", "Lru/unicorn/ujin/metrics/MetricsKeys;", "time", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.metrics.MetricsKeys$Companion */
    /* compiled from: MetricsKeys.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final MetricsKeys getTime(long j) {
            if (j < ((long) 5000)) {
                return MetricsKeys.time0to4;
            }
            if (j < ((long) 9000)) {
                return MetricsKeys.time4to8;
            }
            if (j < ((long) 16000)) {
                return MetricsKeys.time8to15;
            }
            if (j < ((long) 26000)) {
                return MetricsKeys.time15to25;
            }
            if (j < ((long) 46000)) {
                return MetricsKeys.time25to45;
            }
            return MetricsKeys.time45plus;
        }
    }
}
