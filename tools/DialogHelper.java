package com.smartbank.tools;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.smartbank.R$id;
import com.smartbank.base.BaseActivity;
import com.smartbank.base.adapter.GridAdapter;
import com.smartbank.base.adapter.SelectGSpinAdapter;
import com.smartbank.component.GDigitalEditText;
import com.smartbank.component.GDigitalTextView;
import com.smartbank.ui.finances.FinancesCategoryPickerRecyclerAdapter;
import com.smartbank.ui.finances.FinancesCategoryResponse;
import com.smartbank.ui.location.LocationModel;
import com.smartbank.ui.main.home.Account;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import mn.egolomt.p000new.bank.R;

/* compiled from: DialogHelper.kt */
public final class DialogHelper {
    public static final DialogHelper a = new DialogHelper();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/smartbank/tools/DialogHelper$IDialogCategoryChangeListener;", "", "", "categoryId", "Lcom/smartbank/ui/finances/FinancesCategoryResponse$Category;", "chosenCategory", "Lu54;", "onCategoryChange", "(Ljava/lang/String;Lcom/smartbank/ui/finances/FinancesCategoryResponse$Category;)V", "app_release"}, k = 1, mv = {1, 4, 0})
    /* compiled from: DialogHelper.kt */
    public interface IDialogCategoryChangeListener {
        void onCategoryChange(String str, FinancesCategoryResponse.Category category);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/smartbank/tools/DialogHelper$IDialogInputListener;", "", "", "input", "Lu54;", "onEnterSelected", "(Ljava/lang/String;)V", "app_release"}, k = 1, mv = {1, 4, 0})
    /* compiled from: DialogHelper.kt */
    public interface IDialogInputListener {
        void onEnterSelected(String str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/smartbank/tools/DialogHelper$IDialogItemListener;", "", "", "position", "Lu54;", "onItemSelected", "(I)V", "app_release"}, k = 1, mv = {1, 4, 0})
    /* compiled from: DialogHelper.kt */
    public interface IDialogItemListener {
        void onItemSelected(int i);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/smartbank/tools/DialogHelper$IDialogOnButtonClickListener;", "", "", "button", "Lu54;", "onButtonClick", "(I)V", "app_release"}, k = 1, mv = {1, 4, 0})
    /* compiled from: DialogHelper.kt */
    public interface IDialogOnButtonClickListener {
        void onButtonClick(int i);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/smartbank/tools/DialogHelper$IDialogOnDismissListener;", "", "Lu54;", "onDismiss", "()V", "app_release"}, k = 1, mv = {1, 4, 0})
    /* compiled from: DialogHelper.kt */
    public interface IDialogOnDismissListener {
        void onDismiss();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/smartbank/tools/DialogHelper$IDialogOnTabSelectListener;", "", "", "position", "Lu54;", "onTabSelected", "(Ljava/lang/Integer;)V", "app_release"}, k = 1, mv = {1, 4, 0})
    /* compiled from: DialogHelper.kt */
    public interface IDialogOnTabSelectListener {
        void onTabSelected(Integer num);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/smartbank/tools/DialogHelper$OnSelectedAccount;", "", "Lcom/smartbank/ui/main/home/Account;", "item", "Lu54;", "onItemSelected", "(Lcom/smartbank/ui/main/home/Account;)V", "app_release"}, k = 1, mv = {1, 4, 0})
    /* compiled from: DialogHelper.kt */
    public interface OnSelectedAccount {
        void onItemSelected(Account account);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/smartbank/tools/DialogHelper$OnSelectedDate;", "", "Ljava/util/Calendar;", "pos", "Lu54;", "onDateSelected", "(Ljava/util/Calendar;)V", "app_release"}, k = 1, mv = {1, 4, 0})
    /* compiled from: DialogHelper.kt */
    public interface OnSelectedDate {
        void onDateSelected(Calendar calendar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/smartbank/tools/DialogHelper$OnSelectedItem;", "", "Ldw2;", "item", "Lu54;", "onItemSelected", "(Ldw2;)V", "app_release"}, k = 1, mv = {1, 4, 0})
    /* compiled from: DialogHelper.kt */
    public interface OnSelectedItem {
        void onItemSelected(dw2 dw2);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/smartbank/tools/DialogHelper$OnSelectedLocation;", "", "Lcom/smartbank/ui/location/LocationModel$LocationItem;", "item", "Lu54;", "onLocationSelected", "(Lcom/smartbank/ui/location/LocationModel$LocationItem;)V", "app_release"}, k = 1, mv = {1, 4, 0})
    /* compiled from: DialogHelper.kt */
    public interface OnSelectedLocation {
        void onLocationSelected(LocationModel.LocationItem locationItem);
    }

    /* compiled from: java-style lambda group */
    public static final class a implements View.OnClickListener {
        public final /* synthetic */ int b;
        public final /* synthetic */ Object e;
        public final /* synthetic */ Object f;
        public final /* synthetic */ Object g;
        public final /* synthetic */ Object h;
        public final /* synthetic */ Object i;
        public final /* synthetic */ Object j;
        public final /* synthetic */ Object k;
        public final /* synthetic */ Object l;
        public final /* synthetic */ Object m;
        public final /* synthetic */ Object n;
        public final /* synthetic */ Object o;

        public a(int i2, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11) {
            this.b = i2;
            this.e = obj;
            this.f = obj2;
            this.g = obj3;
            this.h = obj4;
            this.i = obj5;
            this.j = obj6;
            this.k = obj7;
            this.l = obj8;
            this.m = obj9;
            this.n = obj10;
            this.o = obj11;
        }

        public final void onClick(View view) {
            int i2 = this.b;
            if (i2 == 0) {
                ((IDialogOnButtonClickListener) this.n).onButtonClick(9);
                if (!((Activity) this.f).isFinishing() && !((Activity) this.f).isDestroyed()) {
                    ((pm) this.e).dismiss();
                }
            } else if (i2 == 1) {
                ((IDialogOnButtonClickListener) this.n).onButtonClick(99);
                if (!((Activity) this.f).isFinishing() && !((Activity) this.f).isDestroyed()) {
                    ((pm) this.e).dismiss();
                }
            } else {
                throw null;
            }
        }
    }

    /* compiled from: DialogHelper.kt */
    public static final class b implements View.OnClickListener {
        public final /* synthetic */ pm b;
        public final /* synthetic */ Context e;
        public final /* synthetic */ te f;
        public final /* synthetic */ IDialogOnDismissListener g;

        public b(pm pmVar, Context context, te teVar, View view, AppCompatTextView appCompatTextView, String str, View view2, IDialogOnDismissListener iDialogOnDismissListener) {
            this.b = pmVar;
            this.e = context;
            this.f = teVar;
            this.g = iDialogOnDismissListener;
        }

        public final void onClick(View view) {
            Context context = this.e;
            if ((context != null ? context instanceof Activity : true) && !((Activity) context).isFinishing() && !((Activity) this.e).isDestroyed()) {
                this.b.dismiss();
            }
        }
    }

    /* compiled from: DialogHelper.kt */
    public static final class c extends m84 implements q74<pm, u54> {
        public final /* synthetic */ te b;
        public final /* synthetic */ IDialogOnDismissListener e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(Context context, te teVar, View view, AppCompatTextView appCompatTextView, String str, View view2, IDialogOnDismissListener iDialogOnDismissListener) {
            super(1);
            this.b = teVar;
            this.e = iDialogOnDismissListener;
        }

        public Object d(Object obj) {
            l84.e((pm) obj, "it");
            IDialogOnDismissListener iDialogOnDismissListener = this.e;
            if (iDialogOnDismissListener != null) {
                iDialogOnDismissListener.onDismiss();
            }
            return u54.a;
        }
    }

    /* compiled from: DialogHelper.kt */
    public static final class d implements Runnable {
        public final /* synthetic */ Context b;
        public final /* synthetic */ pm e;
        public final /* synthetic */ View f;
        public final /* synthetic */ te g;
        public final /* synthetic */ int h;
        public final /* synthetic */ AppCompatTextView i;
        public final /* synthetic */ AppCompatTextView j;
        public final /* synthetic */ String k;
        public final /* synthetic */ View l;
        public final /* synthetic */ RecyclerView m;
        public final /* synthetic */ RecyclerView.g n;

        /* compiled from: DialogHelper.kt */
        public static final class a implements View.OnClickListener {
            public final /* synthetic */ pm b;
            public final /* synthetic */ d e;

            public a(pm pmVar, d dVar) {
                this.b = pmVar;
                this.e = dVar;
            }

            public final void onClick(View view) {
                if (!((Activity) this.e.b).isFinishing() && !((Activity) this.e.b).isDestroyed()) {
                    this.b.dismiss();
                }
            }
        }

        public d(Context context, pm pmVar, View view, te teVar, int i2, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, String str, View view2, RecyclerView recyclerView, RecyclerView.g gVar) {
            this.b = context;
            this.e = pmVar;
            this.f = view;
            this.g = teVar;
            this.h = i2;
            this.i = appCompatTextView;
            this.j = appCompatTextView2;
            this.k = str;
            this.l = view2;
            this.m = recyclerView;
            this.n = gVar;
        }

        public final void run() {
            Context context = this.b;
            if ((context instanceof Activity) && !((Activity) context).isFinishing() && !((Activity) this.b).isDestroyed()) {
                pm pmVar = this.e;
                oj.M(pmVar, (Integer) null, this.f, false, true, false, false, 53);
                oj.P0(pmVar, this.g);
                if (this.h > 0) {
                    this.i.setVisibility(8);
                } else {
                    this.i.setVisibility(0);
                }
                this.j.setText(this.k);
                Context context2 = this.b;
                Object obj = e8.a;
                Drawable drawable = context2.getDrawable(R.drawable.item_divider);
                nh nhVar = new nh(this.b, 1);
                if (drawable != null) {
                    nhVar.a = drawable;
                }
                this.l.setOnClickListener(new a(pmVar, this));
                RecyclerView recyclerView = this.m;
                recyclerView.setLayoutManager(new LinearLayoutManager(this.b));
                recyclerView.setAdapter(this.n);
                recyclerView.addItemDecoration(nhVar);
                pmVar.show();
            }
        }
    }

    /* compiled from: DialogHelper.kt */
    public static final class e extends m84 implements q74<pm, u54> {
        public final /* synthetic */ te b;
        public final /* synthetic */ IDialogOnDismissListener e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(Activity activity, te teVar, String str, IDialogOnDismissListener iDialogOnDismissListener) {
            super(1);
            this.b = teVar;
            this.e = iDialogOnDismissListener;
        }

        public Object d(Object obj) {
            l84.e((pm) obj, "it");
            IDialogOnDismissListener iDialogOnDismissListener = this.e;
            if (iDialogOnDismissListener != null) {
                iDialogOnDismissListener.onDismiss();
            }
            return u54.a;
        }
    }

    /* compiled from: DialogHelper.kt */
    public static final class f implements View.OnClickListener {
        public final /* synthetic */ pm b;

        public f(pm pmVar) {
            this.b = pmVar;
        }

        public final void onClick(View view) {
            this.b.dismiss();
        }
    }

    /* compiled from: DialogHelper.kt */
    public static final class g extends m84 implements q74<pm, u54> {
        public final /* synthetic */ pm b;
        public final /* synthetic */ FinancesCategoryPickerRecyclerAdapter e;
        public final /* synthetic */ Activity f;
        public final /* synthetic */ te g;
        public final /* synthetic */ IDialogCategoryChangeListener h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(pm pmVar, FinancesCategoryPickerRecyclerAdapter financesCategoryPickerRecyclerAdapter, View view, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, RecyclerView recyclerView, pm pmVar2, Activity activity, te teVar, String str, String str2, IDialogCategoryChangeListener iDialogCategoryChangeListener) {
            super(1);
            this.b = pmVar;
            this.e = financesCategoryPickerRecyclerAdapter;
            this.f = activity;
            this.g = teVar;
            this.h = iDialogCategoryChangeListener;
        }

        public Object d(Object obj) {
            l84.e((pm) obj, "it");
            Iterator<T> it = this.e.a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    DialogHelper dialogHelper = DialogHelper.a;
                    Activity activity = this.f;
                    dialogHelper.k(activity, this.g, activity.getString(R.string.finances_transaction_filter_choose_category), (IDialogOnDismissListener) null);
                    break;
                }
                FinancesCategoryResponse.Category category = (FinancesCategoryResponse.Category) it.next();
                if (category.isSelected()) {
                    this.h.onCategoryChange(category.getCAT_ID_ARRAY(), category);
                    this.b.dismiss();
                    break;
                }
            }
            return u54.a;
        }
    }

    /* compiled from: DialogHelper.kt */
    public static final class h extends m84 implements q74<pm, u54> {
        public final /* synthetic */ pm b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(pm pmVar) {
            super(1);
            this.b = pmVar;
        }

        public Object d(Object obj) {
            l84.e((pm) obj, "it");
            this.b.dismiss();
            return u54.a;
        }
    }

    /* compiled from: DialogHelper.kt */
    public static final class i extends m84 implements u74<pm, Calendar, u54> {
        public final /* synthetic */ OnSelectedDate b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i(Calendar calendar, x84 x84, x84 x842, OnSelectedDate onSelectedDate) {
            super(2);
            this.b = onSelectedDate;
        }

        public Object c(Object obj, Object obj2) {
            Calendar calendar = (Calendar) obj2;
            l84.e((pm) obj, "<anonymous parameter 0>");
            l84.e(calendar, "date");
            Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            Utils utils = Utils.INSTANCE;
            l84.d(instance, "selected");
            if (utils.getFormattedDateToLong(calendar) > utils.getFormattedDateToLong(instance)) {
                this.b.onDateSelected(instance);
            } else {
                instance.set(1, calendar.get(1));
                instance.set(2, calendar.get(2));
                instance.set(5, calendar.get(5));
                this.b.onDateSelected(instance);
            }
            return u54.a;
        }
    }

    /* compiled from: DialogHelper.kt */
    public static final class j implements View.OnClickListener {
        public final /* synthetic */ pm b;
        public final /* synthetic */ te e;
        public final /* synthetic */ IDialogOnButtonClickListener f;

        public j(pm pmVar, Activity activity, te teVar, View view, AppCompatTextView appCompatTextView, String str, View view2, IDialogOnButtonClickListener iDialogOnButtonClickListener) {
            this.b = pmVar;
            this.e = teVar;
            this.f = iDialogOnButtonClickListener;
        }

        public final void onClick(View view) {
            this.b.dismiss();
            IDialogOnButtonClickListener iDialogOnButtonClickListener = this.f;
            if (iDialogOnButtonClickListener != null) {
                iDialogOnButtonClickListener.onButtonClick(9);
            }
        }
    }

    /* compiled from: DialogHelper.kt */
    public static final class k implements View.OnClickListener {
        public final /* synthetic */ pm b;
        public final /* synthetic */ Activity e;
        public final /* synthetic */ te f;
        public final /* synthetic */ IDialogOnDismissListener g;

        public k(pm pmVar, Activity activity, te teVar, View view, AppCompatTextView appCompatTextView, String str, View view2, IDialogOnDismissListener iDialogOnDismissListener) {
            this.b = pmVar;
            this.e = activity;
            this.f = teVar;
            this.g = iDialogOnDismissListener;
        }

        public final void onClick(View view) {
            if (!this.e.isFinishing() && !this.e.isDestroyed()) {
                this.b.dismiss();
            }
        }
    }

    /* compiled from: DialogHelper.kt */
    public static final class l extends m84 implements q74<pm, u54> {
        public final /* synthetic */ te b;
        public final /* synthetic */ IDialogOnDismissListener e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public l(Activity activity, te teVar, View view, AppCompatTextView appCompatTextView, String str, View view2, IDialogOnDismissListener iDialogOnDismissListener) {
            super(1);
            this.b = teVar;
            this.e = iDialogOnDismissListener;
        }

        public Object d(Object obj) {
            l84.e((pm) obj, "it");
            IDialogOnDismissListener iDialogOnDismissListener = this.e;
            if (iDialogOnDismissListener != null) {
                iDialogOnDismissListener.onDismiss();
            }
            return u54.a;
        }
    }

    /* compiled from: DialogHelper.kt */
    public static final class m implements View.OnClickListener {
        public final /* synthetic */ pm b;
        public final /* synthetic */ ArrayList e;
        public final /* synthetic */ List f;
        public final /* synthetic */ Activity g;
        public final /* synthetic */ te h;
        public final /* synthetic */ IDialogItemListener i;

        public m(pm pmVar, ArrayList arrayList, List list, String str, Activity activity, te teVar, IDialogItemListener iDialogItemListener, String str2) {
            this.b = pmVar;
            this.e = arrayList;
            this.f = list;
            this.g = activity;
            this.h = teVar;
            this.i = iDialogItemListener;
        }

        public final void onClick(View view) {
            l84.d(view, "v");
            if (view.getTag() instanceof dw2) {
                if (!this.g.isFinishing() && !this.g.isDestroyed()) {
                    this.b.dismiss();
                }
                Object tag = view.getTag();
                Objects.requireNonNull(tag, "null cannot be cast to non-null type com.smartbank.base.adapter.IGSpinModel");
                this.i.onItemSelected(this.e.indexOf((dw2) tag));
            }
        }
    }

    /* compiled from: DialogHelper.kt */
    public static final class n implements View.OnClickListener {
        public final /* synthetic */ pm b;
        public final /* synthetic */ te e;
        public final /* synthetic */ EditText f;
        public final /* synthetic */ IDialogInputListener g;

        public n(pm pmVar, Activity activity, te teVar, View view, View view2, EditText editText, IDialogInputListener iDialogInputListener) {
            this.b = pmVar;
            this.e = teVar;
            this.f = editText;
            this.g = iDialogInputListener;
        }

        public final void onClick(View view) {
            Editable text = this.f.getText();
            if (!(text == null || text.length() == 0)) {
                this.b.dismiss();
                this.g.onEnterSelected(this.f.getText().toString());
            }
        }
    }

    /* compiled from: DialogHelper.kt */
    public static final class o implements DatePicker.OnDateChangedListener {
        public static final o b = new o();

        public final void onDateChanged(DatePicker datePicker, int i, int i2, int i3) {
        }
    }

    /* compiled from: DialogHelper.kt */
    public static final class p extends m84 implements q74<pm, u54> {
        public final /* synthetic */ OnSelectedDate b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public p(OnSelectedDate onSelectedDate) {
            super(1);
            this.b = onSelectedDate;
        }

        public Object d(Object obj) {
            pm pmVar = (pm) obj;
            l84.e(pmVar, "it");
            DatePicker datePicker = (DatePicker) pmVar.findViewById(R.id.date_picker);
            OnSelectedDate onSelectedDate = this.b;
            l84.d(datePicker, "datePicker");
            Calendar instance = Calendar.getInstance();
            instance.set(datePicker.getYear(), datePicker.getMonth(), datePicker.getDayOfMonth());
            l84.d(instance, "calendar");
            onSelectedDate.onDateSelected(instance);
            return u54.a;
        }
    }

    /* compiled from: DialogHelper.kt */
    public static final class q extends m84 implements q74<pm, u54> {
        public final /* synthetic */ te b;
        public final /* synthetic */ IDialogOnDismissListener e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public q(Activity activity, te teVar, View view, Drawable drawable, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView, String str, View view2, IDialogOnDismissListener iDialogOnDismissListener) {
            super(1);
            this.b = teVar;
            this.e = iDialogOnDismissListener;
        }

        public Object d(Object obj) {
            l84.e((pm) obj, "it");
            this.e.onDismiss();
            return u54.a;
        }
    }

    /* compiled from: DialogHelper.kt */
    public static final class r implements View.OnClickListener {
        public final /* synthetic */ pm b;

        public r(pm pmVar) {
            this.b = pmVar;
        }

        public final void onClick(View view) {
            this.b.dismiss();
        }
    }

    public static /* synthetic */ void f(DialogHelper dialogHelper, Activity activity, te teVar, String str, IDialogCategoryChangeListener iDialogCategoryChangeListener, String str2, int i2) {
        int i3 = i2 & 16;
        dialogHelper.e(activity, teVar, str, iDialogCategoryChangeListener, (String) null);
    }

    public static /* synthetic */ void h(DialogHelper dialogHelper, Activity activity, te teVar, String str, String str2, String str3, String str4, IDialogOnButtonClickListener iDialogOnButtonClickListener, int i2) {
        int i3 = i2 & 16;
        int i4 = i2 & 32;
        dialogHelper.g(activity, teVar, str, str2, (String) null, (String) null, iDialogOnButtonClickListener);
    }

    public static void l(DialogHelper dialogHelper, Activity activity, te teVar, String str, String str2, String str3, String str4, IDialogInputListener iDialogInputListener, boolean z, boolean z2, int i2) {
        View view;
        AppCompatTextView appCompatTextView;
        AppCompatTextView appCompatTextView2;
        AppCompatTextView appCompatTextView3;
        AppCompatTextView appCompatTextView4;
        String str5;
        AppCompatTextView appCompatTextView5;
        AppCompatTextView appCompatTextView6;
        String str6;
        AppCompatTextView appCompatTextView7;
        AppCompatTextView appCompatTextView8;
        pm pmVar;
        String str7;
        Activity activity2 = activity;
        te teVar2 = teVar;
        String str8 = str3;
        String str9 = str4;
        int i3 = i2;
        String str10 = (i3 & 4) != 0 ? null : str;
        String str11 = (i3 & 8) != 0 ? null : str2;
        boolean z3 = (i3 & 128) != 0 ? false : z;
        boolean z4 = (i3 & RecyclerView.c0.FLAG_TMP_DETACHED) != 0 ? false : z2;
        l84.e(teVar2, "owner");
        l84.e(str8, "positiveText");
        l84.e(str9, "negativeText");
        m54 F2 = i21.F2(new mt3(activity2));
        m54 F22 = i21.F2(new nt3(activity2));
        boolean Z1 = i21.Z1();
        if (Z1) {
            r54 r54 = (r54) F22;
            ((a53) r54.getValue()).x(teVar2);
            view = ((a53) r54.getValue()).f;
            l84.d(view, "digitalBinding.root");
            appCompatTextView = ((a53) r54.getValue()).y;
            l84.d(appCompatTextView, "digitalBinding.positiveButton");
            appCompatTextView2 = ((a53) r54.getValue()).x;
            l84.d(appCompatTextView2, "digitalBinding.negativeButton");
            appCompatTextView3 = ((a53) r54.getValue()).z;
            l84.d(appCompatTextView3, "digitalBinding.title");
            appCompatTextView4 = ((a53) r54.getValue()).w;
            l84.d(appCompatTextView4, "digitalBinding.message");
        } else if (!Z1) {
            r54 r542 = (r54) F2;
            ((y33) r542.getValue()).x(teVar2);
            view = ((y33) r542.getValue()).f;
            l84.d(view, "defaultBinding.root");
            appCompatTextView = ((y33) r542.getValue()).y;
            l84.d(appCompatTextView, "defaultBinding.positiveButton");
            appCompatTextView2 = ((y33) r542.getValue()).x;
            l84.d(appCompatTextView2, "defaultBinding.negativeButton");
            appCompatTextView3 = ((y33) r542.getValue()).z;
            l84.d(appCompatTextView3, "defaultBinding.title");
            appCompatTextView4 = ((y33) r542.getValue()).w;
            l84.d(appCompatTextView4, "defaultBinding.message");
        } else {
            throw new NoWhenBranchMatchedException();
        }
        View view2 = view;
        AppCompatTextView appCompatTextView9 = appCompatTextView;
        AppCompatTextView appCompatTextView10 = appCompatTextView3;
        AppCompatTextView appCompatTextView11 = appCompatTextView4;
        if (activity2 != null) {
            pm pmVar2 = new pm(activity2, defpackage.d.a);
            oj.P0(pmVar2, teVar2);
            oj.M(pmVar2, (Integer) null, view2, false, true, false, false, 37);
            AppCompatTextView appCompatTextView12 = appCompatTextView9;
            pm.c(pmVar2, Float.valueOf(15.0f), (Integer) null, 2);
            boolean Z12 = i21.Z1();
            AppCompatTextView appCompatTextView13 = appCompatTextView2;
            if (Z12) {
                if (z3) {
                    ((a53) ((r54) F22).getValue()).v.setTextMode(3);
                } else if (z4) {
                    ((a53) ((r54) F22).getValue()).v.setTextMode(5);
                }
                ((a53) ((r54) F22).getValue()).v.d();
                pm pmVar3 = pmVar2;
                AppCompatTextView appCompatTextView14 = appCompatTextView13;
                appCompatTextView5 = appCompatTextView10;
                AppCompatTextView appCompatTextView15 = appCompatTextView12;
                jt3 jt3 = r0;
                appCompatTextView6 = appCompatTextView11;
                str6 = str11;
                str5 = str10;
                jt3 jt32 = new jt3(pmVar3, activity, teVar, view2, z3, F22, (u94) null, z4, appCompatTextView15, iDialogInputListener, appCompatTextView14, F2, (u94) null, str3, str4, appCompatTextView5, str5, appCompatTextView6, str6);
                AppCompatTextView appCompatTextView16 = appCompatTextView15;
                appCompatTextView16.setOnClickListener(jt3);
                pm pmVar4 = pmVar3;
                AppCompatTextView appCompatTextView17 = appCompatTextView14;
                appCompatTextView17.setOnClickListener(new defpackage.k(0, pmVar4));
                str7 = str3;
                appCompatTextView7 = appCompatTextView17;
                pmVar = pmVar4;
                appCompatTextView8 = appCompatTextView16;
            } else {
                AppCompatTextView appCompatTextView18 = appCompatTextView12;
                pm pmVar5 = pmVar2;
                appCompatTextView6 = appCompatTextView11;
                str6 = str11;
                str5 = str10;
                AppCompatTextView appCompatTextView19 = appCompatTextView13;
                appCompatTextView5 = appCompatTextView10;
                if (!Z12) {
                    if (z3) {
                        ((y33) ((r54) F2).getValue()).v.setTextMode(3);
                    } else if (z4) {
                        ((y33) ((r54) F2).getValue()).v.setTextMode(5);
                    }
                    r54 r543 = (r54) F2;
                    ((y33) r543.getValue()).v.setOnNextListener(lt3.b);
                    ((y33) r543.getValue()).v.setColorWhite();
                    ((y33) r543.getValue()).v.i();
                    kt3 kt3 = r0;
                    kt3 kt32 = new kt3(pmVar5, activity, teVar, view2, z3, F22, (u94) null, z4, appCompatTextView18, iDialogInputListener, appCompatTextView19, F2, (u94) null, str3, str4, appCompatTextView5, str5, appCompatTextView6, str6);
                    appCompatTextView8 = appCompatTextView18;
                    appCompatTextView8.setOnClickListener(kt3);
                    pmVar = pmVar5;
                    appCompatTextView7 = appCompatTextView19;
                    appCompatTextView7.setOnClickListener(new defpackage.k(1, pmVar));
                } else {
                    appCompatTextView7 = appCompatTextView19;
                    pmVar = pmVar5;
                    appCompatTextView8 = appCompatTextView18;
                }
                str7 = str3;
            }
            appCompatTextView8.setText(str7);
            appCompatTextView7.setText(str4);
            appCompatTextView5.setText(str5);
            appCompatTextView6.setText(str6);
            pmVar.show();
        }
    }

    public static /* synthetic */ void n(DialogHelper dialogHelper, Activity activity, te teVar, String str, List list, IDialogItemListener iDialogItemListener, String str2, int i2) {
        int i3 = i2 & 32;
        dialogHelper.m(activity, teVar, str, list, iDialogItemListener, (String) null);
    }

    public static /* synthetic */ void q(DialogHelper dialogHelper, Context context, te teVar, Calendar calendar, Calendar calendar2, Calendar calendar3, OnSelectedDate onSelectedDate, boolean z, int i2) {
        dialogHelper.p(context, teVar, calendar, calendar2, calendar3, onSelectedDate, (i2 & 64) != 0 ? false : z);
    }

    public static /* synthetic */ void s(DialogHelper dialogHelper, Activity activity, te teVar, String str, IDialogOnDismissListener iDialogOnDismissListener, Drawable drawable, int i2) {
        int i3 = i2 & 16;
        dialogHelper.r(activity, teVar, str, iDialogOnDismissListener, (Drawable) null);
    }

    public final void a(Context context, te teVar, String str, IDialogOnDismissListener iDialogOnDismissListener) {
        AppCompatTextView appCompatTextView;
        AppCompatTextView appCompatTextView2;
        View view;
        Context context2 = context;
        te teVar2 = teVar;
        boolean Z1 = i21.Z1();
        if (Z1) {
            o43 inflate = o43.inflate(LayoutInflater.from(context), (ViewGroup) null, false);
            l84.d(inflate, "DialogDigitalAlertBindin…, false\n                )");
            inflate.x(teVar2);
            appCompatTextView = inflate.w;
            l84.d(appCompatTextView, "binding.message");
            appCompatTextView2 = inflate.v;
            l84.d(appCompatTextView2, "binding.buttonPositive");
            view = inflate.f;
            l84.d(view, "binding.root");
        } else if (!Z1) {
            i33 inflate2 = i33.inflate(LayoutInflater.from(context), (ViewGroup) null, false);
            l84.d(inflate2, "DialogDefaultAlertBindin…, false\n                )");
            inflate2.x(teVar2);
            appCompatTextView = inflate2.w;
            l84.d(appCompatTextView, "binding.message");
            appCompatTextView2 = inflate2.v;
            l84.d(appCompatTextView2, "binding.buttonPositive");
            view = inflate2.f;
            l84.d(view, "binding.root");
        } else {
            throw new NoWhenBranchMatchedException();
        }
        View view2 = view;
        AppCompatTextView appCompatTextView3 = appCompatTextView2;
        AppCompatTextView appCompatTextView4 = appCompatTextView;
        if (context2 != null) {
            pm pmVar = new pm(context2, defpackage.d.a);
            oj.P0(pmVar, teVar2);
            oj.M(pmVar, (Integer) null, view2, false, true, false, false, 37);
            pm.c(pmVar, Float.valueOf(15.0f), (Integer) null, 2);
            pmVar.a(false);
            appCompatTextView4.setText(str);
            pm pmVar2 = pmVar;
            AppCompatTextView appCompatTextView5 = appCompatTextView3;
            appCompatTextView5.setOnClickListener(new b(pmVar, context, teVar, view2, appCompatTextView4, str, appCompatTextView3, iDialogOnDismissListener));
            pmVar2.show();
            oj.V0(pmVar2, new c(context, teVar, view2, appCompatTextView4, str, appCompatTextView5, iDialogOnDismissListener));
        }
    }

    public final pm b(Context context, te teVar) {
        l84.e(context, "context");
        pm pmVar = new pm(context, new zm(om.WRAP_CONTENT));
        oj.P0(pmVar, teVar);
        pm.c(pmVar, Float.valueOf(15.0f), (Integer) null, 2);
        return pmVar;
    }

    public final pm c(Context context, te teVar, pm pmVar, String str, int i2, RecyclerView.g<RecyclerView.c0> gVar) {
        AppCompatTextView appCompatTextView;
        View view;
        RecyclerView recyclerView;
        AppCompatTextView appCompatTextView2;
        AppCompatImageView appCompatImageView;
        Context context2 = context;
        if (context2 instanceof BaseActivity) {
            ((BaseActivity) context2).C();
        }
        boolean Z1 = i21.Z1();
        if (Z1) {
            q43 inflate = q43.inflate(LayoutInflater.from(context), (ViewGroup) null, false);
            l84.d(inflate, "DialogDigitalBottomListB…, false\n                )");
            appCompatTextView = inflate.b;
            l84.d(appCompatTextView, "binding.empty");
            view = inflate.a;
            l84.d(view, "binding.root");
            recyclerView = inflate.c;
            l84.d(recyclerView, "binding.recyclerView");
            appCompatTextView2 = inflate.d.a;
            l84.d(appCompatTextView2, "binding.title.dlgTitle");
            appCompatImageView = inflate.d.b;
            l84.d(appCompatImageView, "binding.title.dlgX");
            te teVar2 = teVar;
        } else if (!Z1) {
            k33 inflate2 = k33.inflate(LayoutInflater.from(context), (ViewGroup) null, false);
            l84.d(inflate2, "DialogDefaultBottomListB…, false\n                )");
            inflate2.x(teVar);
            appCompatTextView = inflate2.w;
            l84.d(appCompatTextView, "binding.empty");
            view = inflate2.f;
            l84.d(view, "binding.root");
            recyclerView = inflate2.x;
            l84.d(recyclerView, "binding.recyclerView");
            appCompatTextView2 = inflate2.y;
            l84.d(appCompatTextView2, "binding.title");
            appCompatImageView = inflate2.v;
            l84.d(appCompatImageView, "binding.closeButton");
        } else {
            throw new NoWhenBranchMatchedException();
        }
        AppCompatTextView appCompatTextView3 = appCompatTextView2;
        new Handler().postDelayed(new d(context, pmVar, view, teVar, i2, appCompatTextView, appCompatTextView3, str, appCompatImageView, recyclerView, gVar), 200);
        return pmVar;
    }

    public final void d(Activity activity, te teVar, String str, IDialogOnDismissListener iDialogOnDismissListener) {
        View view;
        AppCompatImageView appCompatImageView;
        LinearLayout linearLayout;
        Activity activity2 = activity;
        te teVar2 = teVar;
        String str2 = str;
        l84.e(teVar2, "owner");
        l84.e(str2, "base64");
        if (activity2 != null) {
            boolean Z1 = i21.Z1();
            if (Z1) {
                m33 inflate = m33.inflate(LayoutInflater.from(activity), (ViewGroup) null, false);
                l84.d(inflate, "DialogDefaultCardPinCode…lse\n                    )");
                inflate.x(teVar2);
                view = inflate.f;
                l84.d(view, "binding.root");
                appCompatImageView = inflate.w;
                l84.d(appCompatImageView, "binding.imagePinCode");
                linearLayout = inflate.v;
                l84.d(linearLayout, "binding.buttonBack");
            } else if (!Z1) {
                m33 inflate2 = m33.inflate(LayoutInflater.from(activity), (ViewGroup) null, false);
                l84.d(inflate2, "DialogDefaultCardPinCode…lse\n                    )");
                inflate2.x(teVar2);
                view = inflate2.f;
                l84.d(view, "binding.root");
                appCompatImageView = inflate2.w;
                l84.d(appCompatImageView, "binding.imagePinCode");
                linearLayout = inflate2.v;
                l84.d(linearLayout, "binding.buttonBack");
            } else {
                throw new NoWhenBranchMatchedException();
            }
            View view2 = view;
            pm pmVar = new pm(activity2, defpackage.d.a);
            oj.P0(pmVar, teVar2);
            oj.M(pmVar, (Integer) null, view2, false, true, false, false, 37);
            pmVar.b(false);
            pmVar.a(false);
            pm.c(pmVar, Float.valueOf(15.0f), (Integer) null, 2);
            mz<Bitmap> i2 = hz.e(activity).i();
            i2.I = Utils.INSTANCE.base64ToBitmap(str2);
            i2.L = true;
            i2.b(y70.z(s10.b)).C(appCompatImageView);
            linearLayout.setOnClickListener(new f(pmVar));
            pmVar.show();
            oj.V0(pmVar, new e(activity2, teVar2, str2, iDialogOnDismissListener));
        }
    }

    public final void e(Activity activity, te teVar, String str, IDialogCategoryChangeListener iDialogCategoryChangeListener, String str2) {
        View view;
        AppCompatTextView appCompatTextView;
        AppCompatTextView appCompatTextView2;
        RecyclerView recyclerView;
        Activity activity2 = activity;
        te teVar2 = teVar;
        String str3 = str;
        String str4 = str2;
        l84.e(teVar2, "owner");
        l84.e(iDialogCategoryChangeListener, "onCategoryChangeListener");
        if (activity2 != null) {
            l84.e(activity2, "context");
            pm pmVar = new pm(activity2, new zm(om.WRAP_CONTENT));
            oj.P0(pmVar, teVar2);
            pm.c(pmVar, Float.valueOf(15.0f), (Integer) null, 2);
            pm.g(pmVar, Integer.valueOf(R.string.finances_transaction_filter_change_category), (CharSequence) null, (q74) null, 6);
            pm.f(pmVar, Integer.valueOf(R.string.cancel), (CharSequence) null, (q74) null, 6);
            boolean Z1 = i21.Z1();
            if (Z1) {
                o33 inflate = o33.inflate(LayoutInflater.from(activity), (ViewGroup) null, false);
                l84.d(inflate, "DialogDefaultCategoryBin…lse\n                    )");
                inflate.x(teVar2);
                view = inflate.f;
                l84.d(view, "binding.root");
                appCompatTextView = inflate.x;
                l84.d(appCompatTextView, "binding.title");
                appCompatTextView2 = inflate.v;
                l84.d(appCompatTextView2, "binding.empty");
                recyclerView = inflate.w;
                l84.d(recyclerView, "binding.recyclerView");
            } else if (!Z1) {
                o33 inflate2 = o33.inflate(LayoutInflater.from(activity), (ViewGroup) null, false);
                l84.d(inflate2, "DialogDefaultCategoryBin…lse\n                    )");
                inflate2.x(teVar2);
                view = inflate2.f;
                l84.d(view, "binding.root");
                appCompatTextView = inflate2.x;
                l84.d(appCompatTextView, "binding.title");
                appCompatTextView2 = inflate2.v;
                l84.d(appCompatTextView2, "binding.empty");
                recyclerView = inflate2.w;
                l84.d(recyclerView, "binding.recyclerView");
            } else {
                throw new NoWhenBranchMatchedException();
            }
            RecyclerView recyclerView2 = recyclerView;
            AppCompatTextView appCompatTextView3 = appCompatTextView;
            AppCompatTextView appCompatTextView4 = appCompatTextView2;
            View view2 = view;
            AppCompatTextView appCompatTextView5 = appCompatTextView3;
            oj.M(pmVar, (Integer) null, view2, false, true, false, false, 53);
            ArrayList<FinancesCategoryResponse.Category> arrayList = new ArrayList<>();
            if (str3 != null) {
                int hashCode = str.hashCode();
                if (hashCode != 67) {
                    if (hashCode != 68) {
                        if (hashCode == 84 && str3.equals(Utils.TRANSFER)) {
                            arrayList.addAll(SharedPreferences.B.g());
                        }
                    } else if (str3.equals(Utils.EXPENSE)) {
                        arrayList.addAll(SharedPreferences.B.d());
                    }
                } else if (str3.equals(Utils.INCOME)) {
                    arrayList.addAll(SharedPreferences.B.e());
                }
            }
            if (arrayList.isEmpty()) {
                appCompatTextView4.setVisibility(0);
            }
            appCompatTextView5.setText(activity2.getString(R.string.finances_category_choose));
            if (!(str4 == null || str2.length() == 0)) {
                for (FinancesCategoryResponse.Category category : arrayList) {
                    if (l84.a(category.getCAT_ID_ARRAY(), str4)) {
                        category.setSelected(true);
                    }
                }
            }
            FinancesCategoryPickerRecyclerAdapter financesCategoryPickerRecyclerAdapter = new FinancesCategoryPickerRecyclerAdapter(activity2, true, false, 4);
            GridLayoutManager gridLayoutManager = new GridLayoutManager(activity2, 4);
            GridAdapter.ItemOffsetDecoration itemOffsetDecoration = new GridAdapter.ItemOffsetDecoration(activity2, R.dimen.space_small_xx);
            recyclerView2.setAdapter(financesCategoryPickerRecyclerAdapter);
            recyclerView2.setLayoutManager(gridLayoutManager);
            recyclerView2.setHasFixedSize(true);
            recyclerView2.addItemDecoration(itemOffsetDecoration);
            pm pmVar2 = pmVar;
            pm.g(pmVar2, (Integer) null, (CharSequence) null, new g(pmVar, financesCategoryPickerRecyclerAdapter, view2, appCompatTextView4, appCompatTextView5, recyclerView2, pmVar, activity, teVar, str, str2, iDialogCategoryChangeListener), 3);
            pm.f(pmVar2, (Integer) null, (CharSequence) null, new h(pmVar2), 3);
            financesCategoryPickerRecyclerAdapter.e(arrayList);
            pmVar2.show();
        }
    }

    public final void g(Activity activity, te teVar, String str, String str2, String str3, String str4, IDialogOnButtonClickListener iDialogOnButtonClickListener) {
        AppCompatTextView appCompatTextView;
        AppCompatTextView appCompatTextView2;
        AppCompatTextView appCompatTextView3;
        AppCompatTextView appCompatTextView4;
        View view;
        Activity activity2 = activity;
        te teVar2 = teVar;
        String str5 = str;
        String str6 = str3;
        String str7 = str4;
        l84.e(teVar2, "owner");
        l84.e(iDialogOnButtonClickListener, "listener");
        boolean Z1 = i21.Z1();
        if (Z1) {
            t43 inflate = t43.inflate(LayoutInflater.from(activity), (ViewGroup) null, false);
            l84.d(inflate, "DialogDigitalConfirmatio…, false\n                )");
            inflate.x(teVar2);
            appCompatTextView = inflate.x;
            l84.d(appCompatTextView, "binding.message");
            appCompatTextView2 = inflate.y;
            l84.d(appCompatTextView2, "binding.title");
            appCompatTextView3 = inflate.w;
            l84.d(appCompatTextView3, "binding.buttonPositive");
            appCompatTextView4 = inflate.v;
            l84.d(appCompatTextView4, "binding.buttonNegative");
            view = inflate.f;
            l84.d(view, "binding.root");
        } else if (!Z1) {
            q33 inflate2 = q33.inflate(LayoutInflater.from(activity), (ViewGroup) null, false);
            l84.d(inflate2, "DialogDefaultConfirmatio…, false\n                )");
            inflate2.x(teVar2);
            appCompatTextView = inflate2.x;
            l84.d(appCompatTextView, "binding.message");
            appCompatTextView2 = inflate2.y;
            l84.d(appCompatTextView2, "binding.title");
            appCompatTextView3 = inflate2.w;
            l84.d(appCompatTextView3, "binding.buttonPositive");
            appCompatTextView4 = inflate2.v;
            l84.d(appCompatTextView4, "binding.buttonNegative");
            view = inflate2.f;
            l84.d(view, "binding.root");
        } else {
            throw new NoWhenBranchMatchedException();
        }
        View view2 = view;
        AppCompatTextView appCompatTextView5 = appCompatTextView;
        AppCompatTextView appCompatTextView6 = appCompatTextView4;
        AppCompatTextView appCompatTextView7 = appCompatTextView3;
        AppCompatTextView appCompatTextView8 = appCompatTextView5;
        if (!(str6 == null || str3.length() == 0)) {
            appCompatTextView7.setText(str6);
        }
        if (!(str7 == null || str4.length() == 0)) {
            appCompatTextView6.setText(str7);
        }
        if (activity2 != null) {
            pm pmVar = new pm(activity2, defpackage.d.a);
            oj.P0(pmVar, teVar2);
            oj.M(pmVar, (Integer) null, view2, false, true, false, false, 37);
            pm.c(pmVar, Float.valueOf(15.0f), (Integer) null, 2);
            pmVar.a(false);
            if (str5 != null) {
                if (str.length() > 0) {
                    appCompatTextView2.setVisibility(0);
                    appCompatTextView2.setText(str5);
                }
            }
            appCompatTextView8.setText(str2);
            pm pmVar2 = pmVar;
            Activity activity3 = activity;
            te teVar3 = teVar;
            a aVar = r0;
            View view3 = view2;
            pm pmVar3 = pmVar;
            String str8 = str;
            AppCompatTextView appCompatTextView9 = appCompatTextView7;
            AppCompatTextView appCompatTextView10 = appCompatTextView2;
            AppCompatTextView appCompatTextView11 = appCompatTextView8;
            AppCompatTextView appCompatTextView12 = appCompatTextView2;
            String str9 = str2;
            AppCompatTextView appCompatTextView13 = appCompatTextView9;
            AppCompatTextView appCompatTextView14 = appCompatTextView6;
            IDialogOnButtonClickListener iDialogOnButtonClickListener2 = iDialogOnButtonClickListener;
            a aVar2 = new a(0, pmVar2, activity3, teVar3, view3, str8, appCompatTextView10, appCompatTextView8, str9, appCompatTextView13, iDialogOnButtonClickListener2, appCompatTextView14);
            appCompatTextView13.setOnClickListener(aVar);
            a aVar3 = r0;
            a aVar4 = new a(1, pmVar3, activity3, teVar3, view3, str8, appCompatTextView12, appCompatTextView8, str9, appCompatTextView13, iDialogOnButtonClickListener2, appCompatTextView14);
            appCompatTextView14.setOnClickListener(aVar3);
            pmVar3.show();
        }
    }

    public final void i(Context context, Calendar calendar, Calendar calendar2, Calendar calendar3, te teVar, OnSelectedDate onSelectedDate) {
        l84.e(context, "ctx");
        l84.e(teVar, "owner");
        l84.e(onSelectedDate, "callback");
        Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        l84.d(instance, "Calendar.getInstance(TimeZone.getTimeZone(\"UTC\"))");
        x84 x84 = new x84();
        x84.b = null;
        x84 x842 = new x84();
        x842.b = null;
        if (calendar != null) {
            instance.set(1, calendar.get(1));
            instance.set(2, calendar.get(2));
            instance.set(5, calendar.get(5));
        }
        if (calendar2 != null) {
            T instance2 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            x842.b = instance2;
            instance2.set(1, calendar2.get(1));
            ((Calendar) x842.b).set(2, calendar2.get(2));
            ((Calendar) x842.b).set(5, calendar2.get(5));
        }
        if (calendar3 != null) {
            T instance3 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            x84.b = instance3;
            instance3.set(1, calendar3.get(1));
            ((Calendar) x84.b).set(2, calendar3.get(2));
            ((Calendar) x84.b).set(5, calendar3.get(5));
        }
        Calendar calendar4 = (Calendar) x842.b;
        if (!(calendar4 == null || ((Calendar) x84.b) == null)) {
            Utils utils = Utils.INSTANCE;
            if (utils.getFormattedDateToLong(calendar4) >= utils.getFormattedDateToLong((Calendar) x84.b)) {
                ((Calendar) x84.b).add(5, 1);
            }
        }
        pm pmVar = new pm(context, defpackage.d.a);
        oj.P0(pmVar, teVar);
        i iVar = new i(instance, x842, x84, onSelectedDate);
        oj.O(pmVar, (Calendar) x842.b, (Calendar) x84.b, instance, false, iVar, 8);
        pmVar.show();
    }

    public final void j(Activity activity, te teVar, String str, IDialogOnButtonClickListener iDialogOnButtonClickListener) {
        AppCompatTextView appCompatTextView;
        AppCompatTextView appCompatTextView2;
        View view;
        Activity activity2 = activity;
        te teVar2 = teVar;
        String str2 = str;
        l84.e(str2, "text");
        boolean Z1 = i21.Z1();
        if (Z1) {
            v43 inflate = v43.inflate(LayoutInflater.from(activity), (ViewGroup) null, false);
            l84.d(inflate, "DialogDigitalDeleteBindi…, false\n                )");
            appCompatTextView = inflate.b;
            l84.d(appCompatTextView, "binding.buttonDelete");
            appCompatTextView2 = inflate.c;
            l84.d(appCompatTextView2, "binding.message");
            view = inflate.a;
            l84.d(view, "binding.root");
        } else if (!Z1) {
            s33 inflate2 = s33.inflate(LayoutInflater.from(activity), (ViewGroup) null, false);
            l84.d(inflate2, "DialogDefaultDeleteBindi…, false\n                )");
            inflate2.x(teVar2);
            appCompatTextView = inflate2.v;
            l84.d(appCompatTextView, "binding.deleteButton");
            appCompatTextView2 = inflate2.w;
            l84.d(appCompatTextView2, "binding.message");
            view = inflate2.f;
            l84.d(view, "binding.root");
        } else {
            throw new NoWhenBranchMatchedException();
        }
        View view2 = view;
        if (activity2 != null) {
            pm pmVar = new pm(activity2, defpackage.d.a);
            oj.P0(pmVar, teVar2);
            oj.M(pmVar, (Integer) null, view2, false, true, false, false, 37);
            pm.c(pmVar, Float.valueOf(15.0f), (Integer) null, 2);
            pmVar.a(false);
            appCompatTextView2.setText(str2);
            appCompatTextView.setOnClickListener(new j(pmVar, activity, teVar, view2, appCompatTextView2, str, appCompatTextView, iDialogOnButtonClickListener));
            pmVar.show();
        }
    }

    public final void k(Activity activity, te teVar, String str, IDialogOnDismissListener iDialogOnDismissListener) {
        AppCompatTextView appCompatTextView;
        View view;
        View view2;
        Activity activity2 = activity;
        te teVar2 = teVar;
        l84.e(teVar2, "owner");
        boolean Z1 = i21.Z1();
        if (Z1) {
            y43 inflate = y43.inflate(LayoutInflater.from(activity), (ViewGroup) null, false);
            l84.d(inflate, "DialogDigitalErrorBindin…, false\n                )");
            inflate.x(teVar2);
            appCompatTextView = inflate.w;
            l84.d(appCompatTextView, "binding.message");
            view = inflate.v;
            l84.d(view, "binding.buttonPositive");
            view2 = inflate.f;
            l84.d(view2, "binding.root");
        } else if (!Z1) {
            w33 inflate2 = w33.inflate(LayoutInflater.from(activity), (ViewGroup) null, false);
            l84.d(inflate2, "DialogDefaultErrorBindin…, false\n                )");
            inflate2.x(teVar2);
            appCompatTextView = inflate2.w;
            l84.d(appCompatTextView, "binding.message");
            view = inflate2.v;
            l84.d(view, "binding.buttonPositive");
            view2 = inflate2.f;
            l84.d(view2, "binding.root");
        } else {
            throw new NoWhenBranchMatchedException();
        }
        View view3 = view2;
        View view4 = view;
        AppCompatTextView appCompatTextView2 = appCompatTextView;
        if (activity2 != null) {
            pm pmVar = new pm(activity2, defpackage.d.a);
            oj.P0(pmVar, teVar2);
            oj.M(pmVar, (Integer) null, view3, false, true, false, false, 37);
            pm.c(pmVar, Float.valueOf(15.0f), (Integer) null, 2);
            pmVar.a(false);
            appCompatTextView2.setText(str);
            pm pmVar2 = pmVar;
            View view5 = view4;
            view5.setOnClickListener(new k(pmVar, activity, teVar, view3, appCompatTextView2, str, view4, iDialogOnDismissListener));
            pmVar2.show();
            oj.V0(pmVar2, new l(activity, teVar, view3, appCompatTextView2, str, view5, iDialogOnDismissListener));
        }
    }

    public final void m(Activity activity, te teVar, String str, List<String> list, IDialogItemListener iDialogItemListener, String str2) {
        Activity activity2 = activity;
        te teVar2 = teVar;
        String str3 = str2;
        l84.e(teVar2, "owner");
        l84.e(list, "items");
        l84.e(iDialogItemListener, "itemListener");
        if (activity2 != null) {
            ArrayList arrayList = new ArrayList();
            dw2 dw2 = null;
            for (String str4 : list) {
                dw2 dw22 = new dw2();
                dw22.setKey(str4);
                dw22.setValue(str4);
                arrayList.add(dw22);
                if (!(str3 == null || str2.length() == 0) && str4.equals(str3)) {
                    dw2 = dw22;
                }
            }
            DialogHelper dialogHelper = a;
            pm b2 = dialogHelper.b(activity2, teVar2);
            SelectGSpinAdapter selectGSpinAdapter = new SelectGSpinAdapter(activity2, dw2, arrayList);
            m mVar = new m(b2, arrayList, list, str2, activity, teVar, iDialogItemListener, str);
            l84.e(mVar, "onItemClickListener");
            selectGSpinAdapter.a = mVar;
            dialogHelper.c(activity, teVar, b2, str != null ? str : "", arrayList.size(), selectGSpinAdapter);
        }
    }

    public final void o(Activity activity, te teVar, Account account, IDialogInputListener iDialogInputListener) {
        GDigitalTextView gDigitalTextView;
        GDigitalEditText gDigitalEditText;
        View view;
        Activity activity2 = activity;
        te teVar2 = teVar;
        Account account2 = account;
        l84.e(teVar2, "owner");
        l84.e(iDialogInputListener, "listener");
        boolean Z1 = i21.Z1();
        if (Z1) {
            w43 inflate = w43.inflate(LayoutInflater.from(activity), (ViewGroup) null, false);
            l84.d(inflate, "DialogDigitalEditAccount…, false\n                )");
            inflate.x(teVar2);
            inflate.B(account2);
            View view2 = inflate.f;
            l84.d(view2, "binding.root");
            GDigitalTextView gDigitalTextView2 = inflate.y;
            l84.d(gDigitalTextView2, "binding.buttonSave");
            GDigitalEditText gDigitalEditText2 = inflate.w;
            l84.d(gDigitalEditText2, "binding.accountNickname");
            view = view2;
            gDigitalTextView = gDigitalTextView2;
            gDigitalEditText = gDigitalEditText2;
        } else if (!Z1) {
            u33 inflate2 = u33.inflate(LayoutInflater.from(activity), (ViewGroup) null, false);
            l84.d(inflate2, "DialogDefaultEditAccount…, false\n                )");
            inflate2.x(teVar2);
            View view3 = inflate2.f;
            l84.d(view3, "binding.root");
            inflate2.B(account2);
            AppCompatTextView appCompatTextView = inflate2.y;
            l84.d(appCompatTextView, "binding.buttonSave");
            EditText editText = inflate2.w;
            l84.d(editText, "binding.accountNickname");
            view = view3;
            gDigitalTextView = appCompatTextView;
            gDigitalEditText = editText;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        if (activity2 != null) {
            pm pmVar = new pm(activity2, defpackage.d.a);
            oj.P0(pmVar, teVar2);
            pm pmVar2 = pmVar;
            oj.M(pmVar2, (Integer) null, view, false, true, false, false, 37);
            pm.c(pmVar, Float.valueOf(15.0f), (Integer) null, 2);
            gDigitalTextView.setOnClickListener(new n(pmVar, activity, teVar, view, gDigitalTextView, gDigitalEditText, iDialogInputListener));
            pmVar2.show();
        }
    }

    public final void p(Context context, te teVar, Calendar calendar, Calendar calendar2, Calendar calendar3, OnSelectedDate onSelectedDate, boolean z) {
        Calendar calendar4 = calendar;
        OnSelectedDate onSelectedDate2 = onSelectedDate;
        Context context2 = context;
        l84.e(context, "ctx");
        te teVar2 = teVar;
        l84.e(teVar, "owner");
        l84.e(calendar, "currentDate");
        l84.e(onSelectedDate2, "callback");
        pm b2 = b(context, teVar);
        oj.M(b2, Integer.valueOf(R.layout.spinner_calendar), (View) null, false, false, false, false, 62);
        if (z) {
            View findViewById = ((DatePicker) b2.findViewById(R$id.date_picker)).findViewById(context.getResources().getIdentifier("day", "id", "android"));
            l84.d(findViewById, "date_picker.findViewById…(\"day\", \"id\", \"android\"))");
            findViewById.setVisibility(8);
        }
        Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        l84.d(instance, "Calendar.getInstance(TimeZone.getTimeZone(\"UTC\"))");
        instance.set(2, 0);
        instance.set(5, 1);
        int i2 = R$id.date_picker;
        DatePicker datePicker = (DatePicker) b2.findViewById(i2);
        l84.d(datePicker, "date_picker");
        datePicker.setMinDate(instance.getTimeInMillis());
        if (calendar3 != null) {
            DatePicker datePicker2 = (DatePicker) b2.findViewById(i2);
            l84.d(datePicker2, "date_picker");
            datePicker2.setMaxDate(calendar3.getTimeInMillis());
        }
        if (calendar2 != null) {
            DatePicker datePicker3 = (DatePicker) b2.findViewById(i2);
            l84.d(datePicker3, "date_picker");
            datePicker3.setMinDate(calendar2.getTimeInMillis());
        }
        l84.f(calendar, "$this$year");
        int i3 = calendar.get(1);
        l84.f(calendar, "$this$month");
        int i4 = calendar.get(2);
        l84.f(calendar, "$this$dayOfMonth");
        ((DatePicker) b2.findViewById(i2)).init(i3, i4, calendar.get(5), o.b);
        b2.show();
        oj.V0(b2, new p(onSelectedDate2));
    }

    public final void r(Activity activity, te teVar, String str, IDialogOnDismissListener iDialogOnDismissListener, Drawable drawable) {
        AppCompatTextView appCompatTextView;
        AppCompatTextView appCompatTextView2;
        AppCompatImageView appCompatImageView;
        View view;
        Activity activity2 = activity;
        te teVar2 = teVar;
        Drawable drawable2 = drawable;
        l84.e(teVar2, "owner");
        l84.e(iDialogOnDismissListener, "listener");
        boolean Z1 = i21.Z1();
        if (Z1) {
            k53 inflate = k53.inflate(LayoutInflater.from(activity), (ViewGroup) null, false);
            l84.d(inflate, "DialogDigitalSuccessBind…, false\n                )");
            inflate.x(teVar2);
            appCompatTextView = inflate.v;
            l84.d(appCompatTextView, "binding.closeButton");
            appCompatTextView2 = inflate.x;
            l84.d(appCompatTextView2, "binding.message");
            appCompatImageView = inflate.w;
            l84.d(appCompatImageView, "binding.icon");
            view = inflate.f;
            l84.d(view, "binding.root");
        } else if (!Z1) {
            m43 inflate2 = m43.inflate(LayoutInflater.from(activity), (ViewGroup) null, false);
            l84.d(inflate2, "DialogDefaultSuccessBind…, false\n                )");
            inflate2.x(teVar2);
            appCompatTextView = inflate2.v;
            l84.d(appCompatTextView, "binding.closeButton");
            appCompatTextView2 = inflate2.x;
            l84.d(appCompatTextView2, "binding.message");
            appCompatImageView = inflate2.w;
            l84.d(appCompatImageView, "binding.icon");
            view = inflate2.f;
            l84.d(view, "binding.root");
        } else {
            throw new NoWhenBranchMatchedException();
        }
        View view2 = view;
        AppCompatImageView appCompatImageView2 = appCompatImageView;
        AppCompatTextView appCompatTextView3 = appCompatTextView2;
        if (activity2 != null) {
            pm pmVar = new pm(activity2, defpackage.d.a);
            oj.P0(pmVar, teVar2);
            oj.M(pmVar, (Integer) null, view2, false, true, false, false, 37);
            pm.c(pmVar, Float.valueOf(15.0f), (Integer) null, 2);
            pmVar.a(false);
            if (drawable2 != null) {
                appCompatImageView2.setImageDrawable(drawable2);
            } else {
                appCompatImageView2.setImageResource(R.drawable.ic_finances_checked);
            }
            appCompatTextView3.setText(str);
            appCompatTextView.setOnClickListener(new r(pmVar));
            pmVar.show();
            oj.V0(pmVar, new q(activity, teVar, view2, drawable, appCompatImageView2, appCompatTextView3, str, appCompatTextView, iDialogOnDismissListener));
        }
    }
}
