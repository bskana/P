package com.smartbank.tools;

import android.app.Activity;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.tabs.TabLayout;
import com.smartbank.tools.DialogHelper;
import com.smartbank.ui.location.LocationRecyclerAdapter;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t¸\u0006\n"}, d2 = {"com/smartbank/tools/DialogHelper$showLocation$1$1$2", "Lcom/google/android/material/tabs/TabLayout$d;", "Lcom/google/android/material/tabs/TabLayout$g;", "tab", "Lu54;", "onTabReselected", "(Lcom/google/android/material/tabs/TabLayout$g;)V", "onTabUnselected", "onTabSelected", "app_release", "com/smartbank/tools/DialogHelper$$special$$inlined$show$lambda$16"}, k = 1, mv = {1, 4, 0})
/* compiled from: DialogHelper.kt */
public final class DialogHelper$showLocation$$inlined$let$lambda$1 implements TabLayout.d {
    public final /* synthetic */ Activity $activity$inlined;
    public final /* synthetic */ View $bindingRoot$inlined;
    public final /* synthetic */ AppCompatTextView $empty$inlined;
    public final /* synthetic */ int $listSize$inlined;
    public final /* synthetic */ DialogHelper.OnSelectedLocation $onLocationSelectListener$inlined;
    public final /* synthetic */ DialogHelper.IDialogOnTabSelectListener $onTabSelectListener$inlined;
    public final /* synthetic */ te $owner$inlined;
    public final /* synthetic */ LocationRecyclerAdapter $recyclerAdapter$inlined;
    public final /* synthetic */ RecyclerView $recyclerView$inlined;
    public final /* synthetic */ TabLayout $tabLayout$inlined;

    public DialogHelper$showLocation$$inlined$let$lambda$1(Activity activity, te teVar, View view, AppCompatTextView appCompatTextView, RecyclerView recyclerView, TabLayout tabLayout, int i, LocationRecyclerAdapter locationRecyclerAdapter, DialogHelper.IDialogOnTabSelectListener iDialogOnTabSelectListener, DialogHelper.OnSelectedLocation onSelectedLocation) {
        this.$activity$inlined = activity;
        this.$owner$inlined = teVar;
        this.$bindingRoot$inlined = view;
        this.$empty$inlined = appCompatTextView;
        this.$recyclerView$inlined = recyclerView;
        this.$tabLayout$inlined = tabLayout;
        this.$listSize$inlined = i;
        this.$recyclerAdapter$inlined = locationRecyclerAdapter;
        this.$onTabSelectListener$inlined = iDialogOnTabSelectListener;
        this.$onLocationSelectListener$inlined = onSelectedLocation;
    }

    public void onTabReselected(TabLayout.g gVar) {
    }

    public void onTabSelected(TabLayout.g gVar) {
        this.$onTabSelectListener$inlined.onTabSelected(gVar != null ? Integer.valueOf(gVar.e) : null);
    }

    public void onTabUnselected(TabLayout.g gVar) {
    }
}
