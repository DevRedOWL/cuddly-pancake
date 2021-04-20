package p046io.realm;

/* renamed from: io.realm.ru_unicorn_ujin_ble_data_BleReaderRealmProxyInterface */
public interface ru_unicorn_ujin_ble_data_BleReaderRealmProxyInterface {
    String realmGet$deviceClass();

    String realmGet$deviceKey();

    String realmGet$deviceMac();

    String realmGet$deviceName();

    String realmGet$deviceTitle();

    String realmGet$interfaceType();

    String realmGet$rssi();

    long realmGet$serialNumber();

    String realmGet$uuidID();

    String realmGet$uuidRX();

    String realmGet$uuidService();

    String realmGet$uuidTX();

    void realmSet$deviceClass(String str);

    void realmSet$deviceKey(String str);

    void realmSet$deviceMac(String str);

    void realmSet$deviceName(String str);

    void realmSet$deviceTitle(String str);

    void realmSet$interfaceType(String str);

    void realmSet$rssi(String str);

    void realmSet$serialNumber(long j);

    void realmSet$uuidID(String str);

    void realmSet$uuidRX(String str);

    void realmSet$uuidService(String str);

    void realmSet$uuidTX(String str);
}
