package p035ru.unicorn.ujin.view.fragments.reactSmartFlat;

import android.app.Application;
import com.beefe.picker.PickerViewPackage;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.shell.MainReactPackage;
import com.horcrux.svg.SvgPackage;
import com.oblador.vectoricons.VectorIconsPackage;
import com.p034BV.LinearGradient.LinearGradientPackage;
import com.reactcommunity.rndatetimepicker.RNDateTimePickerPackage;
import com.reactnativecommunity.asyncstorage.AsyncStoragePackage;
import com.reactnativecommunity.rnpermissions.RNPermissionsPackage;
import com.reactnativecommunity.webview.RNCWebViewPackage;
import com.swmansion.gesturehandler.react.RNGestureHandlerPackage;
import com.swmansion.reanimated.ReanimatedPackage;
import com.swmansion.rnscreens.RNScreensPackage;
import com.tradle.react.UdpSocketsModule;
import com.yuanzhou.vlc.ReactVlcPlayerPackage;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.reactnative.camera.RNCameraPackage;
import p035ru.unicorn.ujin.MyReactPackage;
import p045im.shimo.react.prompt.RNPromptPackage;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0014J\b\u0010\u0004\u001a\u00020\u0003H\u0014J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0014J\b\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, mo51343d2 = {"ru/unicorn/ujin/view/fragments/reactSmartFlat/ReactSmartFlatFragment$getReactNativeHost$1", "Lcom/facebook/react/ReactNativeHost;", "getBundleAssetName", "", "getJSMainModuleName", "getPackages", "", "Lcom/facebook/react/ReactPackage;", "getUseDeveloperSupport", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.reactSmartFlat.ReactSmartFlatFragment$getReactNativeHost$1 */
/* compiled from: ReactSmartFlatFragment.kt */
public final class ReactSmartFlatFragment$getReactNativeHost$1 extends ReactNativeHost {
    final /* synthetic */ ReactSmartFlatFragment this$0;

    /* access modifiers changed from: protected */
    public String getBundleAssetName() {
        return "index.android.bundle";
    }

    /* access modifiers changed from: protected */
    public String getJSMainModuleName() {
        return "index.android";
    }

    public boolean getUseDeveloperSupport() {
        return false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ReactSmartFlatFragment$getReactNativeHost$1(ReactSmartFlatFragment reactSmartFlatFragment, Application application) {
        super(application);
        this.this$0 = reactSmartFlatFragment;
    }

    /* access modifiers changed from: protected */
    public List<ReactPackage> getPackages() {
        return CollectionsKt.listOf(new MainReactPackage(), new AsyncStoragePackage(), new RNPermissionsPackage(), new RNCameraPackage(), new UdpSocketsModule(), new SvgPackage(), new VectorIconsPackage(), new RNPromptPackage(), new PickerViewPackage(), new LinearGradientPackage(), new RNCWebViewPackage(), new ReanimatedPackage(), new RNGestureHandlerPackage(), new RNScreensPackage(), new ReactVlcPlayerPackage(), new RNDateTimePickerPackage(), new MyReactPackage(ReactSmartFlatFragment.access$getReactEventCallback$p(this.this$0)));
    }
}
