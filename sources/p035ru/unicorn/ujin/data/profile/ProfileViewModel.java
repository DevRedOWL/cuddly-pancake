package p035ru.unicorn.ujin.data.profile;

import android.content.Context;
import androidx.databinding.ObservableField;
import androidx.lifecycle.MutableLiveData;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p035ru.unicorn.ujin.ble.BleRepo;
import p035ru.unicorn.ujin.ble.data.BleData;
import p035ru.unicorn.ujin.ble.data.BleKeyData;
import p035ru.unicorn.ujin.ble.data.BleReader;
import p035ru.unicorn.ujin.data.MyPassIn;
import p035ru.unicorn.ujin.data.api.response.SplashscreenResponse;
import p035ru.unicorn.ujin.data.api.response.SubAccountsStatusesResponseData;
import p035ru.unicorn.ujin.data.api.response.authorization.Register2coreResponseData;
import p035ru.unicorn.ujin.data.api.response.notification.NotificationListResponse;
import p035ru.unicorn.ujin.data.api.response.profile.GetBuildingResponse;
import p035ru.unicorn.ujin.data.api.response.profile.RentObjectListResponse;
import p035ru.unicorn.ujin.data.profile.event.RegisterEvent;
import p035ru.unicorn.ujin.data.profile.event.RentAuthorizeEvent;
import p035ru.unicorn.ujin.data.profile.event.RentConfirmCodeEvent;
import p035ru.unicorn.ujin.data.profile.repository.ProfileLocalRepository;
import p035ru.unicorn.ujin.data.profile.repository.ProfileRemoteRepository;
import p035ru.unicorn.ujin.data.realm.Building;
import p035ru.unicorn.ujin.data.realm.ProviderCity;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.data.realm.Splashscreen;
import p035ru.unicorn.ujin.data.realm.notification.Notification;
import p035ru.unicorn.ujin.data.realm.profile.Apartment;
import p035ru.unicorn.ujin.data.realm.profile.DemoUser;
import p035ru.unicorn.ujin.data.realm.profile.User;
import p035ru.unicorn.ujin.util.Flavors;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona.PassRepo;
import p035ru.unicorn.ujin.view.activity.navigation.viewmodel.BaseViewModel;
import p035ru.unicorn.ujin.view.fragments.profile.subAccounts.SubAccountEvent;
import p035ru.unicorn.ujin.viewModel.SingleLiveEvent;
import p035ru.unicorn.ujin.viewModel.events.UpdateEvent;
import p035ru.unicorn.ujin.viewModel.events.profile.AuthProviderEvent;
import p035ru.unicorn.ujin.viewModel.events.profile.CitiesProviderEvent;
import p035ru.unicorn.ujin.viewModel.events.profile.RegisterProviderEvent;
import p035ru.unicorn.ujin.viewModel.events.profile.SendCodeProviderEvent;
import p035ru.unicorn.ujin.viewModel.events.profile.UpdateUserProviderEvent;
import p035ru.unicorn.ujin.viewModel.events.profile.ValidateSmsProviderEvent;
import p046io.reactivex.Maybe;
import p046io.reactivex.android.schedulers.AndroidSchedulers;
import p046io.reactivex.disposables.Disposable;
import p046io.reactivex.functions.Consumer;
import p046io.reactivex.schedulers.Schedulers;
import p046io.realm.RealmList;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000Ø\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 ð\u00012\u00020\u0001:\u0002ð\u0001B\u0005¢\u0006\u0002\u0010\u0002J\t\u0010\u001a\u00030\u0001H\u0002J\n\u0010\u0001\u001a\u00030\u0001H\u0002J\b\u0010\u0001\u001a\u00030\u0001J\u001a\u0010\u0001\u001a\u00030\u00012\u0007\u0010\u0001\u001a\u00020L2\u0007\u0010\u0001\u001a\u000200J\n\u0010\u0001\u001a\u0005\u0018\u00010\u0001J\u0013\u0010\u0001\u001a\u0005\u0018\u00010\u00012\u0007\u0010\u0001\u001a\u00020LJ\u0010\u0010\u0001\u001a\u000b\u0012\u0005\u0012\u00030\u0001\u0018\u00010\tJ\u0011\u0010\u0001\u001a\f\u0012\u0005\u0012\u00030\u0001\u0018\u00010\u0001J\n\u0010\u0001\u001a\u0005\u0018\u00010\u0001J\u0007\u0010\u0001\u001a\u00020LJ\u0007\u0010\u0001\u001a\u000200J\u0013\u0010\u0001\u001a\u00030\u00012\u0007\u0010\u0001\u001a\u000200H\u0007J\u000e\u0010\u0001\u001a\t\u0012\u0005\u0012\u00030\u000108J%\u0010\u0001\u001a\u00030\u00012\u0007\u0010\u0001\u001a\u00020L2\u0007\u0010\u0001\u001a\u00020L2\u0007\u0010\u0001\u001a\u000200H\u0007J\n\u0010\u0001\u001a\u0005\u0018\u00010\u0001J\u0018\u0010\u0001\u001a\u0013\u0012\u000f\u0012\r \u0001*\u0005\u0018\u00010\u00010\u000108J\b\u0010\u0001\u001a\u00030\u0001J\u0011\u0010\u0001\u001a\f\u0012\u0005\u0012\u00030\u0001\u0018\u00010\u0001J\u0007\u0010\u0001\u001a\u00020LJ\u0007\u0010 \u0001\u001a\u000200J\u0007\u0010¡\u0001\u001a\u00020LJ\b\u0010¢\u0001\u001a\u00030\u0001J\u0007\u0010£\u0001\u001a\u00020\u001fJ\u0007\u0010¤\u0001\u001a\u00020\u001fJ\b\u0010¥\u0001\u001a\u00030\u0001J\u0013\u0010¦\u0001\u001a\u00030\u00012\u0007\u0010§\u0001\u001a\u00020LH\u0007J\b\u0010¨\u0001\u001a\u00030\u0001J\u0013\u0010©\u0001\u001a\u00030\u00012\u0007\u0010ª\u0001\u001a\u000200H\u0007J\b\u0010«\u0001\u001a\u00030\u0001J\u0012\u0010«\u0001\u001a\u00030\u00012\b\u0010¬\u0001\u001a\u00030­\u0001J\b\u0010®\u0001\u001a\u00030\u0001J\b\u0010¯\u0001\u001a\u00030\u0001J\u0013\u0010¯\u0001\u001a\u00030\u00012\u0007\u0010°\u0001\u001a\u00020LH\u0007J\u0012\u0010±\u0001\u001a\u00030\u00012\b\u0010²\u0001\u001a\u00030³\u0001J\u0019\u0010´\u0001\u001a\u00030\u00012\r\u0010µ\u0001\u001a\b\u0012\u0004\u0012\u00020L08H\u0007J\n\u0010¶\u0001\u001a\u00030\u0001H\u0014J\b\u0010·\u0001\u001a\u00030\u0001J#\u0010¸\u0001\u001a\u00030\u00012\u0007\u0010¹\u0001\u001a\u00020L2\u0007\u0010º\u0001\u001a\u00020L2\u0007\u0010»\u0001\u001a\u00020LJ\u0011\u0010¼\u0001\u001a\u00030\u00012\u0007\u0010½\u0001\u001a\u00020LJ#\u0010¾\u0001\u001a\u00030\u00012\u0007\u0010¿\u0001\u001a\u00020L2\u0007\u0010À\u0001\u001a\u00020L2\u0007\u0010Á\u0001\u001a\u00020LJ\u001a\u0010Â\u0001\u001a\u00030\u00012\u0007\u0010Ã\u0001\u001a\u00020L2\u0007\u0010º\u0001\u001a\u00020LJ\u001a\u0010Ä\u0001\u001a\u00030\u00012\u0007\u0010½\u0001\u001a\u00020L2\u0007\u0010Å\u0001\u001a\u00020LJ\u0019\u0010Æ\u0001\u001a\u00030\u00012\r\u0010µ\u0001\u001a\b\u0012\u0004\u0012\u00020L08H\u0007J\b\u0010Ç\u0001\u001a\u00030\u0001J\u001a\u0010È\u0001\u001a\u00030\u00012\u0007\u0010¹\u0001\u001a\u00020L2\u0007\u0010º\u0001\u001a\u00020LJ\u001a\u0010É\u0001\u001a\u00030\u00012\u0007\u0010½\u0001\u001a\u00020L2\u0007\u0010Å\u0001\u001a\u00020LJ#\u0010Ê\u0001\u001a\u00030\u00012\u0007\u0010Ë\u0001\u001a\u00020L2\u0007\u0010½\u0001\u001a\u00020L2\u0007\u0010Å\u0001\u001a\u00020LJ\u001a\u0010Ì\u0001\u001a\u00030\u00012\u0007\u0010½\u0001\u001a\u00020L2\u0007\u0010Í\u0001\u001a\u00020LJ#\u0010Î\u0001\u001a\u00030\u00012\u0007\u0010Ë\u0001\u001a\u00020L2\u0007\u0010½\u0001\u001a\u00020L2\u0007\u0010Í\u0001\u001a\u00020LJ>\u0010Ï\u0001\u001a\u00030\u00012\u0007\u0010Ë\u0001\u001a\u00020L2\u0007\u0010½\u0001\u001a\u00020L2\u0007\u0010Ð\u0001\u001a\u00020L2\u0019\u0010Ñ\u0001\u001a\u0014\u0012\u0004\u0012\u00020L0Ò\u0001j\t\u0012\u0004\u0012\u00020L`Ó\u0001J\u001a\u0010Ô\u0001\u001a\u00030\u00012\u0007\u0010Õ\u0001\u001a\u00020L2\u0007\u0010Ö\u0001\u001a\u00020LJ\u0011\u0010×\u0001\u001a\u00030\u00012\u0007\u0010½\u0001\u001a\u00020LJ\u001a\u0010Ø\u0001\u001a\u00030\u00012\u0007\u0010¹\u0001\u001a\u00020L2\u0007\u0010º\u0001\u001a\u00020LJ\u0013\u0010Ù\u0001\u001a\u00030\u00012\u0007\u0010¹\u0001\u001a\u00020LH\u0007J%\u0010Ú\u0001\u001a\u00030\u00012\u0007\u0010Ë\u0001\u001a\u00020L2\u0007\u0010½\u0001\u001a\u00020L2\u0007\u0010Å\u0001\u001a\u00020LH\u0007J%\u0010Û\u0001\u001a\u00030\u00012\u0007\u0010¹\u0001\u001a\u00020L2\u0007\u0010Ü\u0001\u001a\u0002002\t\u0010Å\u0001\u001a\u0004\u0018\u00010LJ\b\u0010Ý\u0001\u001a\u00030\u0001J\b\u0010Þ\u0001\u001a\u00030\u0001J\u0011\u0010ß\u0001\u001a\u00030\u00012\u0007\u0010à\u0001\u001a\u000200JI\u0010á\u0001\u001a\u00030\u00012\u0007\u0010¿\u0001\u001a\u00020L2\u0007\u0010Ë\u0001\u001a\u00020L2\u0007\u0010â\u0001\u001a\u00020L2\u0007\u0010½\u0001\u001a\u00020L2\u0007\u0010Ã\u0001\u001a\u00020L2\u0007\u0010ã\u0001\u001a\u00020L2\t\u0010ä\u0001\u001a\u0004\u0018\u00010LJ\b\u0010å\u0001\u001a\u00030\u0001J\u0011\u0010å\u0001\u001a\u00030\u00012\u0007\u0010°\u0001\u001a\u00020LJ\u0011\u0010æ\u0001\u001a\u00030\u00012\u0007\u0010ç\u0001\u001a\u00020LJ\u0010\u0010è\u0001\u001a\u00030\u00012\u0006\u0010?\u001a\u000209J\u0011\u0010é\u0001\u001a\u00030\u00012\u0007\u0010ê\u0001\u001a\u000200J\u0012\u0010ë\u0001\u001a\u00030\u00012\b\u0010ì\u0001\u001a\u00030í\u0001J\u0011\u0010î\u0001\u001a\u00030\u00012\u0007\u0010ï\u0001\u001a\u00020\u001fR\u0019\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0007R\u001d\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0007R#\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00160\u00150\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0007R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0007R\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0014¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018R\u001f\u0010!\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00100\u0014¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0018R\u001a\u0010$\u001a\u00020\u001fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001b\u0010(\u001a\u00020)8BX\u0002¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b*\u0010+R\u0017\u0010.\u001a\b\u0012\u0004\u0012\u0002000/¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0017\u00103\u001a\b\u0012\u0004\u0012\u0002000/¢\u0006\b\n\u0000\u001a\u0004\b4\u00102R\u0017\u00105\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010\u0007R\u001d\u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000209080\u0014¢\u0006\b\n\u0000\u001a\u0004\b:\u0010\u0018R\u001a\u0010;\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000209080\u0014X\u0004¢\u0006\u0002\n\u0000R\u001d\u0010<\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020=0\u00100\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010\u0007R\u0017\u0010?\u001a\b\u0012\u0004\u0012\u0002090/¢\u0006\b\n\u0000\u001a\u0004\b@\u00102R\u0017\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u0010\u0007R\u0017\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\bD\u0010\u0007R\u0019\u0010E\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u0010\u0007R\u0017\u0010G\u001a\b\u0012\u0004\u0012\u00020\u001f0/¢\u0006\b\n\u0000\u001a\u0004\bH\u00102R\u0019\u0010I\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010\u0007R\u001d\u0010K\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020L0\u00100\u0004¢\u0006\b\n\u0000\u001a\u0004\bM\u0010\u0007R\u001d\u0010N\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020L0\u00100\u0004¢\u0006\b\n\u0000\u001a\u0004\bO\u0010\u0007R\u001d\u0010P\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020Q0\u00100\u0004¢\u0006\b\n\u0000\u001a\u0004\bR\u0010\u0007R\u0017\u0010S\u001a\b\u0012\u0004\u0012\u00020T0\u0004¢\u0006\b\n\u0000\u001a\u0004\bU\u0010\u0007R\u001b\u0010V\u001a\u00020W8BX\u0002¢\u0006\f\n\u0004\bZ\u0010-\u001a\u0004\bX\u0010YR\u001d\u0010[\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020L0\u00100\u0004¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010\u0007R\u0017\u0010]\u001a\b\u0012\u0004\u0012\u00020^0\u0004¢\u0006\b\n\u0000\u001a\u0004\b_\u0010\u0007R\u0017\u0010`\u001a\b\u0012\u0004\u0012\u00020a0\u0004¢\u0006\b\n\u0000\u001a\u0004\bb\u0010\u0007R\u001d\u0010c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020d0\u00100\u0004¢\u0006\b\n\u0000\u001a\u0004\be\u0010\u0007R\u0017\u0010f\u001a\b\u0012\u0004\u0012\u00020g0\u0004¢\u0006\b\n\u0000\u001a\u0004\bh\u0010\u0007R\u0017\u0010i\u001a\b\u0012\u0004\u0012\u00020j0\u0004¢\u0006\b\n\u0000\u001a\u0004\bk\u0010\u0007R\u0019\u0010l\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u0004¢\u0006\b\n\u0000\u001a\u0004\bm\u0010\u0007R\u001d\u0010n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020o0\u00100\u0014¢\u0006\b\n\u0000\u001a\u0004\bp\u0010\u0018R\u001d\u0010q\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020r0\u00100\u0004¢\u0006\b\n\u0000\u001a\u0004\bs\u0010\u0007R\u0019\u0010t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010u0\u0014¢\u0006\b\n\u0000\u001a\u0004\bv\u0010\u0018R\u0017\u0010w\u001a\b\u0012\u0004\u0012\u00020x0\u0004¢\u0006\b\n\u0000\u001a\u0004\by\u0010\u0007R\u0017\u0010z\u001a\b\u0012\u0004\u0012\u00020L0/¢\u0006\b\n\u0000\u001a\u0004\b{\u00102R\u0017\u0010|\u001a\b\u0012\u0004\u0012\u00020}0\u0004¢\u0006\b\n\u0000\u001a\u0004\b~\u0010\u0007¨\u0006ñ\u0001"}, mo51343d2 = {"Lru/unicorn/ujin/data/profile/ProfileViewModel;", "Lru/unicorn/ujin/view/activity/navigation/viewmodel/BaseViewModel;", "()V", "addSubAccountLiveData", "Lru/unicorn/ujin/viewModel/SingleLiveEvent;", "Lru/unicorn/ujin/viewModel/events/UpdateEvent;", "getAddSubAccountLiveData", "()Lru/unicorn/ujin/viewModel/SingleLiveEvent;", "allBleDevice", "", "Lru/unicorn/ujin/ble/data/BleReader;", "getAllBleDevice", "authProviderLiveData", "Lru/unicorn/ujin/viewModel/events/profile/AuthProviderEvent;", "getAuthProviderLiveData", "buildingLiveData", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/data/api/response/profile/GetBuildingResponse;", "getBuildingLiveData", "currentBleDevice", "Landroidx/lifecycle/MutableLiveData;", "Lkotlin/Pair;", "Lru/unicorn/ujin/ble/data/BleKeyData;", "getCurrentBleDevice", "()Landroidx/lifecycle/MutableLiveData;", "deleteSubAccountListLiveData", "getDeleteSubAccountListLiveData", "getCitiesProviderLiveData", "Lru/unicorn/ujin/viewModel/events/profile/CitiesProviderEvent;", "getGetCitiesProviderLiveData", "hasBeconMutableLiveData", "", "getHasBeconMutableLiveData", "hasBleDevice", "Lru/unicorn/ujin/ble/data/BleData;", "getHasBleDevice", "isSplashscreenLoaded", "()Z", "setSplashscreenLoaded", "(Z)V", "localRepository", "Lru/unicorn/ujin/data/profile/repository/ProfileLocalRepository;", "getLocalRepository", "()Lru/unicorn/ujin/data/profile/repository/ProfileLocalRepository;", "localRepository$delegate", "Lkotlin/Lazy;", "loginMethod", "Landroidx/databinding/ObservableField;", "", "getLoginMethod", "()Landroidx/databinding/ObservableField;", "loginMode", "getLoginMode", "loginMutableLiveData", "getLoginMutableLiveData", "myPass", "", "Lru/unicorn/ujin/data/MyPassIn;", "getMyPass", "myPassListMutable", "notificationListLiveData", "Lru/unicorn/ujin/data/api/response/notification/NotificationListResponse;", "getNotificationListLiveData", "pass", "getPass", "passwordRestoreLiveData", "getPasswordRestoreLiveData", "passwordUpdateLiveData", "getPasswordUpdateLiveData", "privacyUpdateLiveData", "getPrivacyUpdateLiveData", "profileModeEdit", "getProfileModeEdit", "profileUpdateLiveData", "getProfileUpdateLiveData", "readNotificationsLiveData", "", "getReadNotificationsLiveData", "register1coreMutableLiveData", "getRegister1coreMutableLiveData", "register2coreMutableLiveData", "Lru/unicorn/ujin/data/api/response/authorization/Register2coreResponseData;", "getRegister2coreMutableLiveData", "registerProviderLiveData", "Lru/unicorn/ujin/viewModel/events/profile/RegisterProviderEvent;", "getRegisterProviderLiveData", "remoteRepository", "Lru/unicorn/ujin/data/profile/repository/ProfileRemoteRepository;", "getRemoteRepository", "()Lru/unicorn/ujin/data/profile/repository/ProfileRemoteRepository;", "remoteRepository$delegate", "removeNotificationsLiveData", "getRemoveNotificationsLiveData", "rentAuthorizeLiveData", "Lru/unicorn/ujin/data/profile/event/RentAuthorizeEvent;", "getRentAuthorizeLiveData", "rentConfirmCodeLiveData", "Lru/unicorn/ujin/data/profile/event/RentConfirmCodeEvent;", "getRentConfirmCodeLiveData", "rentObjectListLiveData", "Lru/unicorn/ujin/data/api/response/profile/RentObjectListResponse;", "getRentObjectListLiveData", "rentRegisterByPhoneLiveData", "Lru/unicorn/ujin/data/profile/event/RegisterEvent;", "getRentRegisterByPhoneLiveData", "sendCodeProviderLiveData", "Lru/unicorn/ujin/viewModel/events/profile/SendCodeProviderEvent;", "getSendCodeProviderLiveData", "showProgressLiveData", "getShowProgressLiveData", "splashscreenListLiveData", "Lru/unicorn/ujin/data/api/response/SplashscreenResponse;", "getSplashscreenListLiveData", "statusesLiveData", "Lru/unicorn/ujin/data/api/response/SubAccountsStatusesResponseData;", "getStatusesLiveData", "subAccountListLiveData", "Lru/unicorn/ujin/view/fragments/profile/subAccounts/SubAccountEvent;", "getSubAccountListLiveData", "updateUserProviderLiveData", "Lru/unicorn/ujin/viewModel/events/profile/UpdateUserProviderEvent;", "getUpdateUserProviderLiveData", "userAvatarPath", "getUserAvatarPath", "validateSmsProviderLiveData", "Lru/unicorn/ujin/viewModel/events/profile/ValidateSmsProviderEvent;", "getValidateSmsProviderLiveData", "addCommerceLoginSubject", "", "addLoginSubject", "appOpened", "applyFlat", "flatUserToken", "stage", "getBuilding", "Lru/unicorn/ujin/data/realm/Building;", "id", "getCombineApartments", "Lru/unicorn/ujin/data/realm/profile/Apartment;", "getCommerceApartments", "Lio/realm/RealmList;", "getCurrentApartment", "getDefaultBottomNavigationTab", "getDemoStage", "getMyRentObjectList", "page", "getProviderCityList", "Lru/unicorn/ujin/data/realm/ProviderCity;", "getRentObjectList", "startDate", "endDate", "getSplashscreen", "Lru/unicorn/ujin/data/realm/Splashscreen;", "getUnreadNotificationList", "Lru/unicorn/ujin/data/realm/notification/Notification;", "kotlin.jvm.PlatformType", "getUser", "Lru/unicorn/ujin/data/realm/profile/User;", "getUserApartments", "getUserPhone", "getUserStage", "getUserToken", "hasBeacon", "isDemo", "isUserLoggedIn", "loadAllBleDevice", "loadBuilding", "buildingId", "loadMyPass", "loadNotificationList", "onlyRead", "loadPassDeviceRemote", "serialNumber", "", "loadProviderCityList", "loadSplashscreen", "token", "logoutLocally", "context", "Landroid/content/Context;", "markNotificationsAsRead", "notifications", "onCleared", "onSendToMailClick", "providerAuthorize", "login", "password", "regionId", "providerGetNewCode", "phone", "providerRegisterWithCode", "surname", "apartmentCode", "onetimeCode", "providerUpdateUserWithCode", "email", "providerValidateSms", "code", "removeNotifications", "removeUserProfile", "rentAuthorizeCorona", "rentConfirmCode", "rentConfirmCodeCorona", "name", "rentRegisterByPhone", "utc", "rentRegisterByPhoneCorona", "requestAddSubAccount", "accessRights", "statuses", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "requestChangePassword", "oldPass", "newPass", "requestDeleteSubAccount", "requestLogin", "requestRegister1", "requestRegister2", "requestRestorePassword", "step", "requestSubAccountList", "requestSubAccountStatuses", "requestUpdatePrivacy", "hideMyAccount", "requestUpdateProfile", "patronymic", "base64", "birthday", "requestUser", "saveAidToProfile", "advertId", "setCurrentPass", "setDemoStage", "demoStage", "setDemoUser", "user", "Lru/unicorn/ujin/data/realm/profile/DemoUser;", "setSplashScreenLoaded", "isLoaded", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.profile.ProfileViewModel */
/* compiled from: ProfileViewModel.kt */
public final class ProfileViewModel extends BaseViewModel {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final int LOGIN_BY_EMAIL = 1;
    public static final int LOGIN_BY_PHONE = 0;
    public static final int MODE_LOGIN = 0;
    public static final int MODE_REGISTRATION = 1;
    private final SingleLiveEvent<UpdateEvent> addSubAccountLiveData = new SingleLiveEvent<>();
    private final SingleLiveEvent<List<BleReader>> allBleDevice = new SingleLiveEvent<>();
    private final SingleLiveEvent<AuthProviderEvent> authProviderLiveData = new SingleLiveEvent<>();
    private final SingleLiveEvent<Resource<GetBuildingResponse>> buildingLiveData = new SingleLiveEvent<>();
    private final MutableLiveData<Pair<BleReader, BleKeyData>> currentBleDevice = new MutableLiveData<>();
    private final SingleLiveEvent<UpdateEvent> deleteSubAccountListLiveData = new SingleLiveEvent<>();
    private final SingleLiveEvent<CitiesProviderEvent> getCitiesProviderLiveData = new SingleLiveEvent<>();
    private final MutableLiveData<Boolean> hasBeconMutableLiveData = new MutableLiveData<>();
    private final MutableLiveData<Resource<BleData>> hasBleDevice = new MutableLiveData<>();
    private boolean isSplashscreenLoaded;
    private final Lazy localRepository$delegate = LazyKt.lazy(ProfileViewModel$localRepository$2.INSTANCE);
    private final ObservableField<Integer> loginMethod = new ObservableField<>();
    private final ObservableField<Integer> loginMode = new ObservableField<>();
    private final SingleLiveEvent<UpdateEvent> loginMutableLiveData = new SingleLiveEvent<>();
    private final MutableLiveData<List<MyPassIn>> myPass = this.myPassListMutable;
    /* access modifiers changed from: private */
    public final MutableLiveData<List<MyPassIn>> myPassListMutable = new MutableLiveData<>();
    private final SingleLiveEvent<Resource<NotificationListResponse>> notificationListLiveData = new SingleLiveEvent<>();
    private final ObservableField<MyPassIn> pass = new ObservableField<>();
    private final SingleLiveEvent<UpdateEvent> passwordRestoreLiveData = new SingleLiveEvent<>();
    private final SingleLiveEvent<UpdateEvent> passwordUpdateLiveData = new SingleLiveEvent<>();
    private final SingleLiveEvent<UpdateEvent> privacyUpdateLiveData = new SingleLiveEvent<>();
    private final ObservableField<Boolean> profileModeEdit = new ObservableField<>();
    private final SingleLiveEvent<UpdateEvent> profileUpdateLiveData = new SingleLiveEvent<>();
    private final SingleLiveEvent<Resource<String>> readNotificationsLiveData = new SingleLiveEvent<>();
    private final SingleLiveEvent<Resource<String>> register1coreMutableLiveData = new SingleLiveEvent<>();
    private final SingleLiveEvent<Resource<Register2coreResponseData>> register2coreMutableLiveData = new SingleLiveEvent<>();
    private final SingleLiveEvent<RegisterProviderEvent> registerProviderLiveData = new SingleLiveEvent<>();
    private final Lazy remoteRepository$delegate = LazyKt.lazy(ProfileViewModel$remoteRepository$2.INSTANCE);
    private final SingleLiveEvent<Resource<String>> removeNotificationsLiveData = new SingleLiveEvent<>();
    private final SingleLiveEvent<RentAuthorizeEvent> rentAuthorizeLiveData = new SingleLiveEvent<>();
    private final SingleLiveEvent<RentConfirmCodeEvent> rentConfirmCodeLiveData = new SingleLiveEvent<>();
    private final SingleLiveEvent<Resource<RentObjectListResponse>> rentObjectListLiveData = new SingleLiveEvent<>();
    private final SingleLiveEvent<RegisterEvent> rentRegisterByPhoneLiveData = new SingleLiveEvent<>();
    private final SingleLiveEvent<SendCodeProviderEvent> sendCodeProviderLiveData = new SingleLiveEvent<>();
    private final SingleLiveEvent<Boolean> showProgressLiveData = new SingleLiveEvent<>();
    private final MutableLiveData<Resource<SplashscreenResponse>> splashscreenListLiveData = new MutableLiveData<>();
    private final SingleLiveEvent<Resource<SubAccountsStatusesResponseData>> statusesLiveData = new SingleLiveEvent<>();
    private final MutableLiveData<SubAccountEvent> subAccountListLiveData = new MutableLiveData<>();
    private final SingleLiveEvent<UpdateUserProviderEvent> updateUserProviderLiveData = new SingleLiveEvent<>();
    private final ObservableField<String> userAvatarPath = new ObservableField<>();
    private final SingleLiveEvent<ValidateSmsProviderEvent> validateSmsProviderLiveData = new SingleLiveEvent<>();

    /* access modifiers changed from: private */
    public final ProfileLocalRepository getLocalRepository() {
        return (ProfileLocalRepository) this.localRepository$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final ProfileRemoteRepository getRemoteRepository() {
        return (ProfileRemoteRepository) this.remoteRepository$delegate.getValue();
    }

    public final SingleLiveEvent<UpdateEvent> getLoginMutableLiveData() {
        return this.loginMutableLiveData;
    }

    public final SingleLiveEvent<UpdateEvent> getPasswordUpdateLiveData() {
        return this.passwordUpdateLiveData;
    }

    public final SingleLiveEvent<UpdateEvent> getPasswordRestoreLiveData() {
        return this.passwordRestoreLiveData;
    }

    public final SingleLiveEvent<AuthProviderEvent> getAuthProviderLiveData() {
        return this.authProviderLiveData;
    }

    public final SingleLiveEvent<RegisterProviderEvent> getRegisterProviderLiveData() {
        return this.registerProviderLiveData;
    }

    public final SingleLiveEvent<UpdateUserProviderEvent> getUpdateUserProviderLiveData() {
        return this.updateUserProviderLiveData;
    }

    public final SingleLiveEvent<SendCodeProviderEvent> getSendCodeProviderLiveData() {
        return this.sendCodeProviderLiveData;
    }

    public final SingleLiveEvent<ValidateSmsProviderEvent> getValidateSmsProviderLiveData() {
        return this.validateSmsProviderLiveData;
    }

    public final SingleLiveEvent<CitiesProviderEvent> getGetCitiesProviderLiveData() {
        return this.getCitiesProviderLiveData;
    }

    public final MutableLiveData<SubAccountEvent> getSubAccountListLiveData() {
        return this.subAccountListLiveData;
    }

    public final SingleLiveEvent<UpdateEvent> getDeleteSubAccountListLiveData() {
        return this.deleteSubAccountListLiveData;
    }

    public final SingleLiveEvent<UpdateEvent> getAddSubAccountLiveData() {
        return this.addSubAccountLiveData;
    }

    public final SingleLiveEvent<UpdateEvent> getProfileUpdateLiveData() {
        return this.profileUpdateLiveData;
    }

    public final SingleLiveEvent<UpdateEvent> getPrivacyUpdateLiveData() {
        return this.privacyUpdateLiveData;
    }

    public final SingleLiveEvent<RegisterEvent> getRentRegisterByPhoneLiveData() {
        return this.rentRegisterByPhoneLiveData;
    }

    public final SingleLiveEvent<RentConfirmCodeEvent> getRentConfirmCodeLiveData() {
        return this.rentConfirmCodeLiveData;
    }

    public final SingleLiveEvent<RentAuthorizeEvent> getRentAuthorizeLiveData() {
        return this.rentAuthorizeLiveData;
    }

    public final SingleLiveEvent<Resource<String>> getRegister1coreMutableLiveData() {
        return this.register1coreMutableLiveData;
    }

    public final SingleLiveEvent<Resource<Register2coreResponseData>> getRegister2coreMutableLiveData() {
        return this.register2coreMutableLiveData;
    }

    public final SingleLiveEvent<Resource<RentObjectListResponse>> getRentObjectListLiveData() {
        return this.rentObjectListLiveData;
    }

    public final MutableLiveData<Resource<SplashscreenResponse>> getSplashscreenListLiveData() {
        return this.splashscreenListLiveData;
    }

    public final boolean isSplashscreenLoaded() {
        return this.isSplashscreenLoaded;
    }

    public final void setSplashscreenLoaded(boolean z) {
        this.isSplashscreenLoaded = z;
    }

    public final ObservableField<MyPassIn> getPass() {
        return this.pass;
    }

    public final MutableLiveData<List<MyPassIn>> getMyPass() {
        return this.myPass;
    }

    public final MutableLiveData<Boolean> getHasBeconMutableLiveData() {
        return this.hasBeconMutableLiveData;
    }

    public final MutableLiveData<Resource<BleData>> getHasBleDevice() {
        return this.hasBleDevice;
    }

    public final MutableLiveData<Pair<BleReader, BleKeyData>> getCurrentBleDevice() {
        return this.currentBleDevice;
    }

    public final SingleLiveEvent<List<BleReader>> getAllBleDevice() {
        return this.allBleDevice;
    }

    public final SingleLiveEvent<Resource<GetBuildingResponse>> getBuildingLiveData() {
        return this.buildingLiveData;
    }

    public final SingleLiveEvent<Resource<NotificationListResponse>> getNotificationListLiveData() {
        return this.notificationListLiveData;
    }

    public final SingleLiveEvent<Resource<String>> getReadNotificationsLiveData() {
        return this.readNotificationsLiveData;
    }

    public final SingleLiveEvent<Resource<String>> getRemoveNotificationsLiveData() {
        return this.removeNotificationsLiveData;
    }

    public final SingleLiveEvent<Resource<SubAccountsStatusesResponseData>> getStatusesLiveData() {
        return this.statusesLiveData;
    }

    public final ObservableField<String> getUserAvatarPath() {
        return this.userAvatarPath;
    }

    public final ObservableField<Boolean> getProfileModeEdit() {
        return this.profileModeEdit;
    }

    public final ObservableField<Integer> getLoginMode() {
        return this.loginMode;
    }

    public final ObservableField<Integer> getLoginMethod() {
        return this.loginMethod;
    }

    public final SingleLiveEvent<Boolean> getShowProgressLiveData() {
        return this.showProgressLiveData;
    }

    public final boolean isDemo() {
        return getLocalRepository().isDemo();
    }

    public final boolean isUserLoggedIn() {
        return getLocalRepository().isUserLoggedIn();
    }

    public final void setDemoUser(DemoUser demoUser) {
        Intrinsics.checkNotNullParameter(demoUser, "user");
        getLocalRepository().setDemoUser(demoUser);
    }

    public final RealmList<Apartment> getUserApartments() {
        return getLocalRepository().getApartmentList();
    }

    public final RealmList<Apartment> getCommerceApartments() {
        return getLocalRepository().getCommerceList();
    }

    public final List<Apartment> getCombineApartments() {
        return getLocalRepository().getUser().combineList();
    }

    public final User getUser() {
        return getLocalRepository().getUser();
    }

    public final String getUserPhone() {
        String phone = getLocalRepository().getUser().getPhone();
        return (phone.hashCode() == 48 && phone.equals("0")) ? "" : phone;
    }

    public final void requestLogin(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, FirebaseAnalytics.Event.LOGIN);
        Intrinsics.checkNotNullParameter(str2, "password");
        addLoginSubject();
        this.showProgressLiveData.setValue(true);
        getRemoteRepository().requestLogin(str, str2);
    }

    public final void requestUser() {
        if (getUser().isCurrentCommerce()) {
            addCommerceLoginSubject();
        } else {
            addLoginSubject();
        }
        this.showProgressLiveData.setValue(true);
        getRemoteRepository().requestUser(getUser().isCurrentCommerce());
    }

    /* access modifiers changed from: private */
    public final void addLoginSubject() {
        this.compositeDisposable.add(getRemoteRepository().getLoginSubject().subscribe(new ProfileViewModel$addLoginSubject$1(this)));
    }

    private final void addCommerceLoginSubject() {
        this.compositeDisposable.add(getRemoteRepository().getCommerceLoginSubject().subscribe(new ProfileViewModel$addCommerceLoginSubject$1(this)));
    }

    public final void requestUser(String str) {
        Intrinsics.checkNotNullParameter(str, "token");
        if (getUser().isCurrentCommerce()) {
            addCommerceLoginSubject();
        } else {
            addLoginSubject();
        }
        this.showProgressLiveData.setValue(true);
        getRemoteRepository().requestUser(str, getUser().isCurrentCommerce());
    }

    public final void applyFlat(String str, int i) {
        Intrinsics.checkNotNullParameter(str, "flatUserToken");
        setSplashScreenLoaded(false);
        getLocalRepository().applyFlat(str, i);
    }

    public final int getUserStage() {
        return getLocalRepository().getUserStage();
    }

    public final void logoutLocally(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        getLocalRepository().clearProfileForLogout(context);
    }

    public final void providerAuthorize(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, FirebaseAnalytics.Event.LOGIN);
        Intrinsics.checkNotNullParameter(str2, "password");
        Intrinsics.checkNotNullParameter(str3, "regionId");
        this.compositeDisposable.add(getRemoteRepository().getAuthProviderSubject().subscribe(new ProfileViewModel$providerAuthorize$1(this)));
        this.showProgressLiveData.setValue(true);
        getRemoteRepository().providerAuthorize(str, str2, str3);
    }

    public final void providerRegisterWithCode(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "surname");
        Intrinsics.checkNotNullParameter(str2, "apartmentCode");
        Intrinsics.checkNotNullParameter(str3, "onetimeCode");
        this.compositeDisposable.add(getRemoteRepository().getRegisterProviderSubject().subscribe(new ProfileViewModel$providerRegisterWithCode$1(this)));
        this.showProgressLiveData.setValue(true);
        getRemoteRepository().providerRegisterWithCode(str, str2, str3);
    }

    public final void providerUpdateUserWithCode(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "email");
        Intrinsics.checkNotNullParameter(str2, "password");
        this.compositeDisposable.add(getRemoteRepository().getUpdateUserProviderSubject().subscribe(new ProfileViewModel$providerUpdateUserWithCode$1(this)));
        this.showProgressLiveData.setValue(true);
        getRemoteRepository().providerUpdateUserWithCode(str, str2);
    }

    public final void providerGetNewCode(String str) {
        Intrinsics.checkNotNullParameter(str, "phone");
        this.compositeDisposable.add(getRemoteRepository().getSendCodeProviderSubject().subscribe(new ProfileViewModel$providerGetNewCode$1(this)));
        this.showProgressLiveData.setValue(true);
        getRemoteRepository().providerGetNewCode(str);
    }

    public final void providerValidateSms(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "phone");
        Intrinsics.checkNotNullParameter(str2, "code");
        this.compositeDisposable.add(getRemoteRepository().getValidateSmsProviderSubject().subscribe(new ProfileViewModel$providerValidateSms$1(this)));
        this.showProgressLiveData.setValue(true);
        getRemoteRepository().providerValidateSms(str, str2);
    }

    public final void loadProviderCityList() {
        this.compositeDisposable.add(getRemoteRepository().getCitiesProviderSubject().subscribe(new ProfileViewModel$loadProviderCityList$1(this)));
        this.showProgressLiveData.setValue(true);
        getRemoteRepository().getProviderCityList();
    }

    public final List<ProviderCity> getProviderCityList() {
        return getLocalRepository().getCityList();
    }

    public final String getUserToken() {
        return getLocalRepository().getUserToken();
    }

    public final void removeUserProfile() {
        getLocalRepository().removeUserProfile();
    }

    public final void setDemoStage(int i) {
        getLocalRepository().setDemoStage(i);
    }

    public final void requestChangePassword(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "oldPass");
        Intrinsics.checkNotNullParameter(str2, "newPass");
        this.compositeDisposable.add(getRemoteRepository().getPasswordUpdateProviderSubject().subscribe(new ProfileViewModel$requestChangePassword$1(this)));
        this.showProgressLiveData.setValue(true);
        getRemoteRepository().requestChangePassword(str, str2);
    }

    public final void requestRestorePassword(String str, int i, String str2) {
        Intrinsics.checkNotNullParameter(str, FirebaseAnalytics.Event.LOGIN);
        this.compositeDisposable.add(getRemoteRepository().getPasswordRestoreProviderSubject().subscribe(new ProfileViewModel$requestRestorePassword$1(this)));
        this.showProgressLiveData.setValue(true);
        getRemoteRepository().requestRestorePassword(str, i, str2);
    }

    public final void hasBeacon() {
        this.compositeDisposable.add(getRemoteRepository().getUpdatePoints().onErrorReturnItem(false).subscribe(new ProfileViewModel$hasBeacon$1(this)));
    }

    public final void saveAidToProfile(String str) {
        Intrinsics.checkNotNullParameter(str, "advertId");
        getLocalRepository().saveAidToProfile(str);
    }

    public final void requestSubAccountList() {
        this.compositeDisposable.add(getRemoteRepository().requestSubAccountList().doOnSubscribe(new ProfileViewModel$requestSubAccountList$1(this)).doOnComplete(new ProfileViewModel$requestSubAccountList$2(this)).observeOn(AndroidSchedulers.mainThread()).subscribe(new ProfileViewModel$requestSubAccountList$3(this), new ProfileViewModel$requestSubAccountList$4(this)));
    }

    public final void requestDeleteSubAccount(String str) {
        Intrinsics.checkNotNullParameter(str, "phone");
        this.compositeDisposable.add(getRemoteRepository().requestDeleteSubAccount(str).doOnSubscribe(new ProfileViewModel$requestDeleteSubAccount$1(this)).doOnComplete(new ProfileViewModel$requestDeleteSubAccount$2(this)).doOnError(new ProfileViewModel$requestDeleteSubAccount$3(this)).observeOn(AndroidSchedulers.mainThread()).subscribe(new ProfileViewModel$requestDeleteSubAccount$4(this), new ProfileViewModel$requestDeleteSubAccount$5(this)));
    }

    public final void requestAddSubAccount(String str, String str2, String str3, ArrayList<String> arrayList) {
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(str2, "phone");
        Intrinsics.checkNotNullParameter(str3, "accessRights");
        Intrinsics.checkNotNullParameter(arrayList, "statuses");
        this.compositeDisposable.add(getRemoteRepository().requestAddSubAccount(str, str2, str3, arrayList).doOnSubscribe(new ProfileViewModel$requestAddSubAccount$1(this)).doOnComplete(new ProfileViewModel$requestAddSubAccount$2(this)).doOnError(new ProfileViewModel$requestAddSubAccount$3(this)).observeOn(AndroidSchedulers.mainThread()).subscribe(new ProfileViewModel$requestAddSubAccount$4(this), new ProfileViewModel$requestAddSubAccount$5(this)));
    }

    public final void requestUpdateProfile(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        Intrinsics.checkNotNullParameter(str, "surname");
        Intrinsics.checkNotNullParameter(str2, "name");
        Intrinsics.checkNotNullParameter(str3, "patronymic");
        Intrinsics.checkNotNullParameter(str4, "phone");
        Intrinsics.checkNotNullParameter(str5, "email");
        String str8 = str6;
        Intrinsics.checkNotNullParameter(str8, "base64");
        this.compositeDisposable.add(getRemoteRepository().requestUpdateProfile(str, str2, str3, str4, str5, str8, str7).doOnSubscribe(new ProfileViewModel$requestUpdateProfile$1(this)).doOnComplete(new ProfileViewModel$requestUpdateProfile$2(this)).doOnError(new ProfileViewModel$requestUpdateProfile$3(this)).observeOn(AndroidSchedulers.mainThread()).subscribe(new ProfileViewModel$requestUpdateProfile$4(this)));
    }

    public final void requestUpdatePrivacy(int i) {
        this.compositeDisposable.add(getRemoteRepository().requestUpdatePrivacy(i).doOnSubscribe(new ProfileViewModel$requestUpdatePrivacy$1(this)).doOnComplete(new ProfileViewModel$requestUpdatePrivacy$2(this)).doOnError(new ProfileViewModel$requestUpdatePrivacy$3(this)).observeOn(AndroidSchedulers.mainThread()).subscribe(new ProfileViewModel$requestUpdatePrivacy$4(this)));
    }

    public final void requestRegister1(String str) {
        Intrinsics.checkNotNullParameter(str, FirebaseAnalytics.Event.LOGIN);
        this.compositeDisposable.add(getRemoteRepository().requestRegister1core(str).doOnError(new ProfileViewModel$requestRegister1$1(this)).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new ProfileViewModel$requestRegister1$2(this)));
    }

    public final void requestRegister2(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(str2, "phone");
        Intrinsics.checkNotNullParameter(str3, "code");
        this.compositeDisposable.add(getRemoteRepository().requestRegister2core(str, str2, str3).doOnError(new ProfileViewModel$requestRegister2$1(this)).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new ProfileViewModel$requestRegister2$2(this)));
    }

    public final void rentRegisterByPhone(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "phone");
        Intrinsics.checkNotNullParameter(str2, "utc");
        this.compositeDisposable.add(getRemoteRepository().getRentRegisterByPhoneSubject().subscribe(new ProfileViewModel$rentRegisterByPhone$1(this)));
        this.showProgressLiveData.setValue(true);
        getRemoteRepository().rentRegisterByPhone(str, str2);
    }

    public final void rentConfirmCode(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "phone");
        Intrinsics.checkNotNullParameter(str2, "code");
        this.compositeDisposable.add(getRemoteRepository().getRentConfirmCodeSubject().subscribe(new ProfileViewModel$rentConfirmCode$1(this)));
        this.showProgressLiveData.setValue(true);
        getRemoteRepository().rentConfirmCode(str, str2);
    }

    public final int getDemoStage() {
        return getLocalRepository().getDemoStage();
    }

    public final void rentRegisterByPhoneCorona(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(str2, "phone");
        Intrinsics.checkNotNullParameter(str3, "utc");
        this.compositeDisposable.add(getRemoteRepository().getRentRegisterByPhoneSubject().subscribe(new ProfileViewModel$rentRegisterByPhoneCorona$1(this)));
        this.showProgressLiveData.setValue(true);
        getRemoteRepository().rentRegisterByPhoneCorona(str, str2, str3);
    }

    public final void rentConfirmCodeCorona(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(str2, "phone");
        Intrinsics.checkNotNullParameter(str3, "code");
        this.compositeDisposable.add(getRemoteRepository().getRentConfirmCodeSubject().subscribe(new ProfileViewModel$rentConfirmCodeCorona$1(this)));
        this.showProgressLiveData.setValue(true);
        getRemoteRepository().rentConfirmCodeCorona(str, str2, str3);
    }

    public final void rentAuthorizeCorona(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, FirebaseAnalytics.Event.LOGIN);
        Intrinsics.checkNotNullParameter(str2, "password");
        this.compositeDisposable.add(getRemoteRepository().getRentAuthorizeSubject().subscribe(new ProfileViewModel$rentAuthorizeCorona$1(this)));
        this.showProgressLiveData.setValue(true);
        getRemoteRepository().rentAuthorizeCorona(str, str2);
    }

    public final void getRentObjectList(String str, String str2, int i) {
        Intrinsics.checkNotNullParameter(str, "startDate");
        Intrinsics.checkNotNullParameter(str2, "endDate");
        getRemoteRepository().getRentObjectList(str, str2, i).doOnError(new ProfileViewModel$getRentObjectList$1(this)).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new ProfileViewModel$getRentObjectList$2(this));
    }

    public final void getMyRentObjectList(int i) {
        getRemoteRepository().getMyRentObjectList(i).doOnError(new ProfileViewModel$getMyRentObjectList$1(this)).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new ProfileViewModel$getMyRentObjectList$2(this));
    }

    public final void appOpened() {
        getRemoteRepository().appOpened();
    }

    public final Splashscreen getSplashscreen() {
        return getLocalRepository().getSplashscreen();
    }

    public final void loadSplashscreen() {
        if (!(!StringsKt.isBlank(getUserToken())) || isDemo()) {
            setSplashScreenLoaded(true);
        } else {
            loadSplashscreen(getUserToken());
        }
    }

    public final void loadSplashscreen(String str) {
        Intrinsics.checkNotNullParameter(str, "token");
        this.compositeDisposable.add(getRemoteRepository().getSplashscreen(str).doOnError(new ProfileViewModel$loadSplashscreen$1(this)).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new ProfileViewModel$loadSplashscreen$2(this)));
    }

    public final void setSplashScreenLoaded(boolean z) {
        this.isSplashscreenLoaded = z;
    }

    public final void loadMyPass() {
        this.compositeDisposable.add(getRemoteRepository().getMyPass().observeOn(AndroidSchedulers.mainThread()).doOnSubscribe(new ProfileViewModel$loadMyPass$1(this)).doOnSuccess(new ProfileViewModel$loadMyPass$2(this)).doOnError(new ProfileViewModel$loadMyPass$3(this)).subscribe(new ProfileViewModel$loadMyPass$4(this), new ProfileViewModel$loadMyPass$5(this)));
    }

    public final void setCurrentPass(MyPassIn myPassIn) {
        Intrinsics.checkNotNullParameter(myPassIn, Flavors.PASS);
        this.pass.set(myPassIn);
    }

    public final void onSendToMailClick() {
        PassRepo passRepo = new PassRepo();
        MyPassIn myPassIn = this.pass.get();
        this.compositeDisposable.add(passRepo.sendToMail(myPassIn != null ? myPassIn.getId() : -1).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new ProfileViewModel$onSendToMailClick$subscribe$1(this), new ProfileViewModel$onSendToMailClick$subscribe$2(this)));
    }

    public final void loadPassDeviceRemote() {
        this.compositeDisposable.add(new BleRepo().loadMyPassDevice().observeOn(AndroidSchedulers.mainThread()).subscribe(new ProfileViewModel$loadPassDeviceRemote$1(this)));
    }

    public final void loadPassDeviceRemote(long j) {
        Maybe<R> flatMap;
        Maybe<R> subscribeOn;
        Maybe<R> observeOn;
        BleRepo bleRepo = new BleRepo();
        Maybe<BleReader> loadBleBySn = bleRepo.loadBleBySn(j);
        if (loadBleBySn != null && (flatMap = loadBleBySn.flatMap(new ProfileViewModel$loadPassDeviceRemote$2(bleRepo), ProfileViewModel$loadPassDeviceRemote$3.INSTANCE)) != null && (subscribeOn = flatMap.subscribeOn(Schedulers.m6765io())) != null && (observeOn = subscribeOn.observeOn(AndroidSchedulers.mainThread())) != null) {
            Disposable subscribe = observeOn.subscribe((Consumer<? super R>) new ProfileViewModel$loadPassDeviceRemote$4(this));
        }
    }

    public final void loadAllBleDevice() {
        this.compositeDisposable.add(new BleRepo().loadAllBle().subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new ProfileViewModel$loadAllBleDevice$1(this)));
    }

    public final void loadBuilding(String str) {
        Intrinsics.checkNotNullParameter(str, "buildingId");
        this.compositeDisposable.add(getRemoteRepository().getBuilding(str).doOnError(new ProfileViewModel$loadBuilding$1(this)).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new ProfileViewModel$loadBuilding$2(this)));
    }

    public final Building getBuilding() {
        String buildingId;
        Apartment currentApartment = getLocalRepository().getCurrentApartment();
        if (currentApartment == null || (buildingId = currentApartment.getBuildingId()) == null) {
            return null;
        }
        return getBuilding(buildingId);
    }

    public final Building getBuilding(String str) {
        Intrinsics.checkNotNullParameter(str, "id");
        return getLocalRepository().getBuilding(str);
    }

    public final Apartment getCurrentApartment() {
        return getLocalRepository().getCurrentApartment();
    }

    public final void loadNotificationList(int i) {
        this.compositeDisposable.add(getRemoteRepository().getNotificationList(i).doOnError(new ProfileViewModel$loadNotificationList$1(this)).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new ProfileViewModel$loadNotificationList$2(this)));
    }

    public final List<Notification> getUnreadNotificationList() {
        List<Notification> unreadNotificationList = getLocalRepository().getUnreadNotificationList();
        return unreadNotificationList != null ? unreadNotificationList : new ArrayList<>();
    }

    public final String getDefaultBottomNavigationTab() {
        return getLocalRepository().getDefaultBottomNavigationTab();
    }

    public final void markNotificationsAsRead(List<String> list) {
        Intrinsics.checkNotNullParameter(list, "notifications");
        this.compositeDisposable.add(getRemoteRepository().markNotificationsAsRead(list).doOnError(new ProfileViewModel$markNotificationsAsRead$1(this)).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new ProfileViewModel$markNotificationsAsRead$2(this)));
    }

    public final void removeNotifications(List<String> list) {
        Intrinsics.checkNotNullParameter(list, "notifications");
        this.compositeDisposable.add(getRemoteRepository().removeNotifications(list).doOnError(new ProfileViewModel$removeNotifications$1(this)).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new ProfileViewModel$removeNotifications$2(this)));
    }

    /* access modifiers changed from: protected */
    public void onCleared() {
        super.onCleared();
        this.showProgressLiveData.setValue(null);
    }

    public final void requestSubAccountStatuses() {
        this.compositeDisposable.add(getRemoteRepository().requestSubAccountStatuses().doOnError(new ProfileViewModel$requestSubAccountStatuses$1(this)).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new ProfileViewModel$requestSubAccountStatuses$2(this)));
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, mo51343d2 = {"Lru/unicorn/ujin/data/profile/ProfileViewModel$Companion;", "", "()V", "LOGIN_BY_EMAIL", "", "LOGIN_BY_PHONE", "MODE_LOGIN", "MODE_REGISTRATION", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.data.profile.ProfileViewModel$Companion */
    /* compiled from: ProfileViewModel.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
