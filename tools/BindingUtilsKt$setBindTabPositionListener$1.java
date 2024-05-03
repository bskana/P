package com.smartbank.tools;

import com.google.android.material.tabs.TabLayout;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"com/smartbank/tools/BindingUtilsKt$setBindTabPositionListener$1", "Lcom/google/android/material/tabs/TabLayout$d;", "Lcom/google/android/material/tabs/TabLayout$g;", "tab", "Lu54;", "onTabReselected", "(Lcom/google/android/material/tabs/TabLayout$g;)V", "onTabUnselected", "onTabSelected", "app_release"}, k = 1, mv = {1, 4, 0})
/* compiled from: BindingUtils.kt */
public final class BindingUtilsKt$setBindTabPositionListener$1 implements TabLayout.d {
    public final /* synthetic */ ye $liveData;

    public BindingUtilsKt$setBindTabPositionListener$1(ye yeVar) {
        this.$liveData = yeVar;
    }

    public void onTabReselected(TabLayout.g gVar) {
    }

    public void onTabSelected(TabLayout.g gVar) {
        this.$liveData.i(gVar != null ? Integer.valueOf(gVar.e) : null);
    }

    public void onTabUnselected(TabLayout.g gVar) {
    }
}
