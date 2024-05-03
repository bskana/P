package com.smartbank.tools;

import com.smartbank.component.GCalendar;
import java.util.Calendar;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/smartbank/tools/BindingUtilsKt$setTextValue$1", "Lcom/smartbank/component/GCalendar$OnSelectedCalendar;", "Lcom/smartbank/component/GCalendar;", "view", "Ljava/util/Calendar;", "start", "Lu54;", "onSelectedDate", "(Lcom/smartbank/component/GCalendar;Ljava/util/Calendar;)V", "app_release"}, k = 1, mv = {1, 4, 0})
/* compiled from: BindingUtils.kt */
public final class BindingUtilsKt$setTextValue$1 implements GCalendar.OnSelectedCalendar {
    public final /* synthetic */ ye $liveData;

    public BindingUtilsKt$setTextValue$1(ye yeVar) {
        this.$liveData = yeVar;
    }

    public void onSelectedDate(GCalendar gCalendar, Calendar calendar) {
        this.$liveData.i(calendar);
    }
}
