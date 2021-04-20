package p035ru.unicorn.ujin.view.fragments;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.DialogInterface;
import android.content.Intent;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p035ru.unicorn.ujin.data.profile.repository.ProfileLocalRepository;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, mo51343d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.DemoHubFragment$handleDemoLogout$1 */
/* compiled from: DemoHubFragment.kt */
final class DemoHubFragment$handleDemoLogout$1 implements DialogInterface.OnClickListener {
    final /* synthetic */ DemoHubFragment this$0;

    DemoHubFragment$handleDemoLogout$1(DemoHubFragment demoHubFragment) {
        this.this$0 = demoHubFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.this$0.getBaseActivity().profileViewModel.setDemoStage(0);
        Object systemService = this.this$0.getBaseActivity().getSystemService("activity");
        if (systemService != null) {
            List<ActivityManager.RunningTaskInfo> runningTasks = ((ActivityManager) systemService).getRunningTasks(10);
            Intrinsics.checkNotNullExpressionValue(runningTasks, "mngr.getRunningTasks(10)");
            if (runningTasks.get(0).numActivities == 1) {
                ComponentName componentName = runningTasks.get(0).topActivity;
                if (StringsKt.equals$default(componentName != null ? componentName.getClassName() : null, this.this$0.getClass().getName(), false, 2, (Object) null)) {
                    List listOf = CollectionsKt.listOf(Boolean.valueOf(ProfileLocalRepository.Companion.getInstance().getUser().getUserLoggenIn()), Boolean.valueOf(this.this$0.getBaseActivity().flavor.isStage1Enabled()));
                    if (Intrinsics.areEqual((Object) listOf, (Object) CollectionsKt.listOf(false, false))) {
                        DemoHubFragment demoHubFragment = this.this$0;
                        demoHubFragment.startActivity(new Intent(demoHubFragment.getBaseActivity(), this.this$0.getBaseActivity().flavor.getAuthActivity().getClass()));
                    } else {
                        if (Intrinsics.areEqual((Object) listOf, (Object) CollectionsKt.listOf(false, true))) {
                            this.this$0.getBaseActivity().startStageOne();
                        } else {
                            if (Intrinsics.areEqual((Object) listOf, (Object) CollectionsKt.listOf(true, Boolean.valueOf(this.this$0.getBaseActivity().flavor.isStage1Enabled())))) {
                                this.this$0.proceedToStage();
                            }
                        }
                    }
                    dialogInterface.dismiss();
                    return;
                }
            }
            this.this$0.getBaseActivity().standardBackPressed();
            dialogInterface.dismiss();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.app.ActivityManager");
    }
}
