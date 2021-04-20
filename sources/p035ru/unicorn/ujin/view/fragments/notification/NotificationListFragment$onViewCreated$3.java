package p035ru.unicorn.ujin.view.fragments.notification;

import android.content.DialogInterface;
import android.view.View;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.widget.AppCompatImageButton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.util.AnimationUtils;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.notification.NotificationListFragment$onViewCreated$3 */
/* compiled from: NotificationListFragment.kt */
final class NotificationListFragment$onViewCreated$3 implements View.OnClickListener {
    final /* synthetic */ NotificationListFragment this$0;

    NotificationListFragment$onViewCreated$3(NotificationListFragment notificationListFragment) {
        this.this$0 = notificationListFragment;
    }

    public final void onClick(View view) {
        AnimationUtils animationUtils = AnimationUtils.INSTANCE;
        AppCompatImageButton appCompatImageButton = (AppCompatImageButton) this.this$0._$_findCachedViewById(C5619R.C5622id.btnRemoveAll);
        Intrinsics.checkNotNullExpressionValue(appCompatImageButton, "btnRemoveAll");
        animationUtils.rotateView(180.0f, 0.0f, appCompatImageButton);
        new AlertDialog.Builder(this.this$0.getBaseActivity()).setMessage((CharSequence) this.this$0.getString(R.string.remove_notification_message)).setNegativeButton((int) R.string.button_no, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(this) {
            final /* synthetic */ NotificationListFragment$onViewCreated$3 this$0;

            {
                this.this$0 = r1;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                AnimationUtils animationUtils = AnimationUtils.INSTANCE;
                AppCompatImageButton appCompatImageButton = (AppCompatImageButton) this.this$0.this$0._$_findCachedViewById(C5619R.C5622id.btnRemoveAll);
                Intrinsics.checkNotNullExpressionValue(appCompatImageButton, "btnRemoveAll");
                animationUtils.rotateView(0.0f, 180.0f, appCompatImageButton);
                dialogInterface.dismiss();
            }
        }).setPositiveButton((int) R.string.button_yes, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(this) {
            final /* synthetic */ NotificationListFragment$onViewCreated$3 this$0;

            {
                this.this$0 = r1;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                AnimationUtils animationUtils = AnimationUtils.INSTANCE;
                AppCompatImageButton appCompatImageButton = (AppCompatImageButton) this.this$0.this$0._$_findCachedViewById(C5619R.C5622id.btnRemoveAll);
                Intrinsics.checkNotNullExpressionValue(appCompatImageButton, "btnRemoveAll");
                animationUtils.rotateView(0.0f, 180.0f, appCompatImageButton);
                this.this$0.this$0.removeAll();
                dialogInterface.dismiss();
            }
        }).show();
    }
}
