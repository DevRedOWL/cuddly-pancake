package p035ru.unicorn.ujin.view.activity.navigation.p058ui.device;

import android.util.Log;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import org.reactivestreams.Publisher;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.data.repository.BaseRemoteRepository;
import p035ru.unicorn.ujin.view.activity.navigation.entity.hardware.Hardware;
import p035ru.unicorn.ujin.view.activity.navigation.repository.LocalRepository;
import p035ru.unicorn.ujin.view.activity.navigation.repository.udp.repository.Command;
import p035ru.unicorn.ujin.view.activity.navigation.repository.udp.repository.Device;
import p035ru.unicorn.ujin.view.activity.navigation.repository.udp.repository.SomeData;
import p046io.reactivex.BackpressureStrategy;
import p046io.reactivex.Flowable;
import p046io.reactivex.FlowableEmitter;
import p046io.reactivex.FlowableOnSubscribe;
import p046io.reactivex.android.schedulers.AndroidSchedulers;
import p046io.reactivex.functions.Action;
import p046io.reactivex.functions.Cancellable;
import p046io.reactivex.functions.Consumer;
import p046io.reactivex.functions.Function;
import p046io.reactivex.schedulers.Schedulers;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.device.DeviceRepository */
public class DeviceRepository extends BaseRemoteRepository {
    public static final String DISCOVERY = "Discovery";
    private static final int PORT = 30300;
    private static DatagramSocket datagramSocketBroadcast;
    private static DatagramSocket socketBroadcastReciver;
    private boolean run = true;
    private boolean run2 = true;

    public Flowable<Resource<DevicesList>> getHardwareToken() {
        return getApi().getHardwareToken(getAppName(), getToken()).map($$Lambda$DeviceRepository$3COo3zoNCHJLYdBi2sffthsMFh0.INSTANCE).subscribeOn(Schedulers.m6765io());
    }

    public Flowable<Resource<List<Hardware>>> getHardware() {
        return getApi().getHardware(getAppName(), getToken()).map($$Lambda$DeviceRepository$biKCRukS9Panqg6enEsiyXlmdrk.INSTANCE).subscribeOn(Schedulers.m6765io());
    }

    public Flowable<Resource<Hardware>> getHardwareById(String str, String str2) {
        return getApi().getHardwareBySerialNumber(getAppName(), str, str2).map($$Lambda$DeviceRepository$bnbvy_H_Ka8Kqj8kaFRq64Xh2o.INSTANCE).onErrorReturn($$Lambda$DeviceRepository$TvYPa7yxEqpDQDyhRLIla_UOz8c.INSTANCE).subscribeOn(Schedulers.m6765io());
    }

    public Flowable<Resource<SomeData>> sendCommand(Device device, boolean z) {
        Flowable just = Flowable.just(Boolean.valueOf(z));
        Flowable<R> subscribeOn = getApi().sendCommandToCloud(getAppName(), getToken(), device.getId(), device.getName(), String.valueOf(device.getValue()), device.getId()).doOnNext(new Consumer() {
            public final void accept(Object obj) {
                Log.d("TAG", "XXX 123 X send remote  " + Device.this.toString());
            }
        }).map($$Lambda$DeviceRepository$6KdtAWJ8etyPo5NM2gntR9EWk.INSTANCE).onErrorReturn($$Lambda$DeviceRepository$pue7yZ0WiG2BoQZULBqZbwhT2W8.INSTANCE).subscribeOn(Schedulers.m6765io());
        sendLocally(device).filter($$Lambda$DeviceRepository$AhlARbu7U3GhRjJtNoFBfjV0gtE.INSTANCE).timeout(2, TimeUnit.SECONDS).map($$Lambda$DeviceRepository$gE1O14zysn6BsqKDRZ2O8XZCcw.INSTANCE).onErrorResumeNext(subscribeOn).doOnNext($$Lambda$DeviceRepository$KIa7T8CMzGKEUpOwcLDF4Se6A4M.INSTANCE).subscribeOn(Schedulers.m6765io());
        return just.flatMap(new Function() {
            public final Object apply(Object obj) {
                return DeviceRepository.lambda$sendCommand$10(Flowable.this, (Boolean) obj);
            }
        });
    }

    static /* synthetic */ boolean lambda$sendCommand$7(SomeData someData) throws Exception {
        return someData.getUniqId() == someData.getData().getData().getUniqId().intValue();
    }

    static /* synthetic */ Publisher lambda$sendCommand$10(Flowable flowable, Boolean bool) throws Exception {
        if (!bool.booleanValue()) {
            Log.d("TAG", "XXX 123 X send REMOTE");
            return flowable;
        }
        Log.d("TAG", "XXX 123 X send LOCALLY");
        return flowable;
    }

    public Flowable<SomeData> sendLocally(Device device) {
        InetAddress inetAddress;
        try {
            inetAddress = InetAddress.getByName(device.getIpAdress());
        } catch (UnknownHostException e) {
            e.printStackTrace();
            inetAddress = null;
        }
        return Flowable.create(sendCommandFlowable(inetAddress, device), BackpressureStrategy.BUFFER).subscribeOn(Schedulers.m6765io());
    }

    /* access modifiers changed from: package-private */
    public Flowable<SomeData> sendCommandToCloud(Device device, String str) {
        return getApi().sendCommandToCloud(getAppName(), getToken(), device.getId(), device.getName(), String.valueOf(device.getValue()), device.getId()).map($$Lambda$DeviceRepository$AwVOu1B891K1CpNbwK2tdD46OLg.INSTANCE).subscribeOn(Schedulers.m6765io());
    }

    static /* synthetic */ SomeData lambda$sendCommandToCloud$11(Resource resource) throws Exception {
        return new SomeData();
    }

    private Cancellable getCancellable(DatagramSocket datagramSocket) {
        return new Cancellable(datagramSocket) {
            private final /* synthetic */ DatagramSocket f$0;

            {
                this.f$0 = r1;
            }

            public final void cancel() {
                DeviceRepository.lambda$getCancellable$12(this.f$0);
            }
        };
    }

    static /* synthetic */ void lambda$getCancellable$12(DatagramSocket datagramSocket) throws Exception {
        if (!datagramSocket.isClosed()) {
            datagramSocket.close();
        }
    }

    public FlowableOnSubscribe<Device> createUdp(String str, int i, int i2, InetAddress inetAddress) {
        return new FlowableOnSubscribe(str, inetAddress) {
            private final /* synthetic */ String f$1;
            private final /* synthetic */ InetAddress f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void subscribe(FlowableEmitter flowableEmitter) {
                DeviceRepository.this.lambda$createUdp$13$DeviceRepository(this.f$1, this.f$2, flowableEmitter);
            }
        };
    }

    public /* synthetic */ void lambda$createUdp$13$DeviceRepository(String str, InetAddress inetAddress, FlowableEmitter flowableEmitter) throws Exception {
        try {
            this.run = true;
            byte[] bytes = str.getBytes();
            if (datagramSocketBroadcast == null) {
                datagramSocketBroadcast = new DatagramSocket();
                datagramSocketBroadcast.setReuseAddress(true);
            }
            datagramSocketBroadcast.send(new DatagramPacket(bytes, bytes.length, inetAddress, PORT));
            byte[] bArr = new byte[MessageHandler.WHAT_SMOOTH_SCROLL];
            DatagramPacket datagramPacket = new DatagramPacket(bArr, bArr.length);
            getInstanceReciver();
            while (!this.run) {
                try {
                    socketBroadcastReciver.receive(datagramPacket);
                    String str2 = new String(datagramPacket.getData(), 0, datagramPacket.getLength());
                    if (str2.contains("header")) {
                        flowableEmitter.onNext(new Device((SomeData) new Gson().fromJson(str2, SomeData.class), datagramPacket.getAddress().getHostAddress()));
                    }
                } catch (IOException e) {
                    this.run = false;
                    flowableEmitter.onError(e);
                    e.printStackTrace();
                }
            }
            flowableEmitter.onComplete();
        } catch (Exception e2) {
            flowableEmitter.onError(e2);
            e2.printStackTrace();
        }
    }

    private static DatagramSocket getInstanceReciver() throws SocketException {
        if (socketBroadcastReciver == null) {
            socketBroadcastReciver = new DatagramSocket(PORT);
        }
        return socketBroadcastReciver;
    }

    public FlowableOnSubscribe<SomeData> sendCommandFlowable(InetAddress inetAddress, Device device) {
        return new FlowableOnSubscribe(device) {
            private final /* synthetic */ Device f$1;

            {
                this.f$1 = r2;
            }

            public final void subscribe(FlowableEmitter flowableEmitter) {
                DeviceRepository.this.lambda$sendCommandFlowable$14$DeviceRepository(this.f$1, flowableEmitter);
            }
        };
    }

    public /* synthetic */ void lambda$sendCommandFlowable$14$DeviceRepository(Device device, FlowableEmitter flowableEmitter) throws Exception {
        SomeData someData;
        try {
            this.run2 = true;
            if (datagramSocketBroadcast == null) {
                datagramSocketBroadcast = new DatagramSocket();
                datagramSocketBroadcast.setReuseAddress(true);
            }
            Command command = new Command(Integer.valueOf(device.getValue()), device.getId(), device.getToken());
            JSONObject jSONObject = new JSONObject(new Gson().toJson((Object) command));
            jSONObject.put(device.getName(), device.getValue());
            byte[] bytes = jSONObject.toString().getBytes();
            datagramSocketBroadcast.send(new DatagramPacket(bytes, bytes.length, InetAddress.getByName("255.255.255.255"), PORT));
            getInstanceReciver();
            byte[] bArr = new byte[4000];
            DatagramPacket datagramPacket = new DatagramPacket(bArr, bArr.length);
            while (this.run2) {
                socketBroadcastReciver.receive(datagramPacket);
                String str = new String(datagramPacket.getData(), 0, datagramPacket.getLength());
                Log.d("TAG", " XXX sendCommandFlowable some data  " + str);
                try {
                    someData = (SomeData) new Gson().fromJson(str, SomeData.class);
                } catch (JsonSyntaxException e) {
                    e.printStackTrace();
                    someData = null;
                }
                if (someData != null) {
                    someData.setUniqId(command.getUniqId().intValue());
                    flowableEmitter.onNext(someData);
                }
                if (someData != null && someData.getData() != null && device.getId().equals(someData.getData().getId()) && someData.getData().getData().getUniqId().equals(command.getUniqId())) {
                    this.run2 = false;
                    flowableEmitter.onNext(someData);
                    flowableEmitter.onComplete();
                    Log.d("TAG", " XXX ON COMPLETE ");
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
            flowableEmitter.onError(e2);
        }
    }

    private int parsedata(DatagramPacket datagramPacket) {
        String str = new String(datagramPacket.getData(), 0, datagramPacket.getLength());
        try {
            if (str.equals("")) {
                return -1;
            }
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.isNull("header")) {
                return -1;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("header");
            if (jSONObject2.isNull("id") || jSONObject2.isNull("devName") || jSONObject2.isNull("data")) {
                return -1;
            }
            return jSONObject2.getInt("id");
        } catch (JSONException unused) {
            return -1;
        }
    }

    public void closeSocket() {
        disconnectAndCload(datagramSocketBroadcast);
    }

    private void disconnectAndCload(DatagramSocket datagramSocket) {
        if (datagramSocket != null && !datagramSocket.isClosed()) {
            datagramSocket.disconnect();
            datagramSocket.close();
        }
    }

    public Flowable<List<Device>> scan(InetAddress inetAddress, boolean z, LocalRepository localRepository) {
        return Flowable.create(createUdp(DISCOVERY, PORT, -1, inetAddress), BackpressureStrategy.BUFFER).subscribeOn(Schedulers.m6765io()).take(2, TimeUnit.SECONDS).toList().toFlowable().filter($$Lambda$DeviceRepository$fHhOvUAVR9aoCQTCNjXeAhaNuk.INSTANCE).doOnComplete(new Action() {
            public final void run() {
                DeviceRepository.this.lambda$scan$16$DeviceRepository();
            }
        }).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).doOnNext(new Consumer() {
            public final void accept(Object obj) {
                LocalRepository.this.saveDataAsList((List) obj, Device.class, true);
            }
        }).onErrorResumeNext(Flowable.empty());
    }

    static /* synthetic */ boolean lambda$scan$15(List list) throws Exception {
        return list.size() != 0;
    }

    public /* synthetic */ void lambda$scan$16$DeviceRepository() throws Exception {
        this.run = false;
    }
}
