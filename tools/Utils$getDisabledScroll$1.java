package com.smartbank.tools;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/smartbank/tools/Utils$getDisabledScroll$1", "Landroidx/recyclerview/widget/LinearLayoutManager;", "", "canScrollVertically", "()Z", "app_release"}, k = 1, mv = {1, 4, 0})
/* compiled from: Utils.kt */
public final class Utils$getDisabledScroll$1 extends LinearLayoutManager {
    public final /* synthetic */ Context $ctx;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Utils$getDisabledScroll$1(Context context, Context context2) {
        super(context2);
        this.$ctx = context;
    }

    public boolean canScrollVertically() {
        return false;
    }
}
