package org.koin.androidx.viewmodel.ext.android;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelStoreOwner;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo51343d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelStoreOwner;", "T", "Landroidx/lifecycle/ViewModel;", "invoke"}, mo51344k = 3, mo51345mv = {1, 1, 15})
/* compiled from: FragmentExt.kt */
final class FragmentExtKt$getSharedViewModel$2 extends Lambda implements Function0<ViewModelStoreOwner> {
    final /* synthetic */ Fragment $this_getSharedViewModel;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    FragmentExtKt$getSharedViewModel$2(Fragment fragment) {
        super(0);
        this.$this_getSharedViewModel = fragment;
    }

    public final ViewModelStoreOwner invoke() {
        FragmentActivity activity = this.$this_getSharedViewModel.getActivity();
        if (activity != null) {
            return activity;
        }
        throw new TypeCastException("null cannot be cast to non-null type androidx.lifecycle.ViewModelStoreOwner");
    }
}
