package com.smartbank.tools;

import android.view.View;
import com.smartbank.component.GAccountPicker;
import com.smartbank.ui.main.home.Account;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/smartbank/tools/BindingUtilsKt$setBindTo$1", "Lcom/smartbank/component/GAccountPicker$OnItemSelectedListener;", "Landroid/view/View;", "view", "Lcom/smartbank/ui/main/home/Account;", "data", "Lu54;", "onAccountSelected", "(Landroid/view/View;Lcom/smartbank/ui/main/home/Account;)V", "app_release"}, k = 1, mv = {1, 4, 0})
/* compiled from: BindingUtils.kt */
public final class BindingUtilsKt$setBindTo$1 implements GAccountPicker.OnItemSelectedListener {
    public final /* synthetic */ ye $liveData;

    public BindingUtilsKt$setBindTo$1(ye yeVar) {
        this.$liveData = yeVar;
    }

    public void onAccountSelected(View view, Account account) {
        l84.e(account, "data");
        this.$liveData.i(account);
    }
}
