package p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_settings.face;

import android.graphics.Bitmap;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p033co.infinum.goldeneye.PictureCallback;
import p035ru.unicorn.databinding.FragmentPassFaceSecondBinding;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_profile.PassProfileVM;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass_settings.face.PassCreateFaceSecondFragment$onViewCreated$2 */
/* compiled from: PassCreateFaceSecondFragment.kt */
final class PassCreateFaceSecondFragment$onViewCreated$2 implements View.OnClickListener {
    final /* synthetic */ PassProfileVM $viewModell;
    final /* synthetic */ PassCreateFaceSecondFragment this$0;

    PassCreateFaceSecondFragment$onViewCreated$2(PassCreateFaceSecondFragment passCreateFaceSecondFragment, PassProfileVM passProfileVM) {
        this.this$0 = passCreateFaceSecondFragment;
        this.$viewModell = passProfileVM;
    }

    public final void onClick(View view) {
        if (ContextCompat.checkSelfPermission(this.this$0.getBaseActivity(), "android.permission.CAMERA") == 0) {
            this.this$0.getGoldenEye().takePicture(new PictureCallback(this) {
                final /* synthetic */ PassCreateFaceSecondFragment$onViewCreated$2 this$0;

                public void onError(Throwable th) {
                    Intrinsics.checkNotNullParameter(th, "t");
                }

                {
                    this.this$0 = r1;
                }

                public void onPictureTaken(Bitmap bitmap) {
                    MutableLiveData<Bitmap> currentPhoto;
                    Intrinsics.checkNotNullParameter(bitmap, "picture");
                    this.this$0.this$0.getGoldenEye().release();
                    PassProfileVM passProfileVM = this.this$0.$viewModell;
                    if (!(passProfileVM == null || (currentPhoto = passProfileVM.getCurrentPhoto()) == null)) {
                        currentPhoto.setValue(bitmap);
                    }
                    DynamicBackgroundButton dynamicBackgroundButton = ((FragmentPassFaceSecondBinding) this.this$0.this$0.getViewDataBinding()).confirm;
                    Intrinsics.checkNotNullExpressionValue(dynamicBackgroundButton, "viewDataBinding.confirm");
                    dynamicBackgroundButton.setVisibility(0);
                }
            });
        } else {
            this.this$0.getPhotoPermission();
        }
    }
}
