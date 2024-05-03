package com.smartbank.tools;

import android.content.SharedPreferences;
import android.net.Uri;
import com.smartbank.base.BaseApplication;
import com.smartbank.ui.finances.FinancesAccountResponse;
import com.smartbank.ui.finances.FinancesCategoryResponse;
import com.smartbank.ui.login.LoginResponse;
import com.smartbank.ui.main.home.Account;
import com.smartbank.ui.notification.NotificationResponse;
import com.smartbank.ui.shared.AccountBookResponse;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import mn.egolomt.connection.tools.SecurityOptional;

/* compiled from: SharedPreferences.kt */
public final class SharedPreferences {
    public static String A;
    public static final SharedPreferences B = new SharedPreferences();
    public static final android.content.SharedPreferences a;
    public static final SharedPreferences.Editor b;
    public static String c;
    public static String d = "0";
    public static LoginResponse.UserDetails e;
    public static LoginResponse.InfoDetails f;
    public static LoginResponse.ForceChangePassword g;
    public static List<? extends Account> h;
    public static List<AccountBookResponse.CounterParty> i;
    public static List<AccountBookResponse.CounterParty> j;
    public static List<FinancesCategoryResponse.Category> k;
    public static List<FinancesCategoryResponse.Category> l;
    public static List<FinancesCategoryResponse.Category> m;
    public static List<FinancesCategoryResponse.Category> n;
    public static FinancesAccountResponse o = new FinancesAccountResponse(new ArrayList());
    public static String p = "";
    public static List<LoginResponse.Shortcut> q;
    public static List<NotificationResponse.Notification> r;
    public static boolean s;
    public static LoginResponse.Product t;
    public static List<? extends Account> u;
    public static Uri v;
    public static yv2 w;
    public static String x = "";
    public static final List<FinancesCategoryResponse.Category> y = b64.D(new FinancesCategoryResponse.Category((String) null, (String) null, "BABY", (String) null, true, (String) null, false, 107, (h84) null), new FinancesCategoryResponse.Category((String) null, (String) null, "BILLIARD", (String) null, true, (String) null, false, 107, (h84) null), new FinancesCategoryResponse.Category((String) null, (String) null, "BASKETBALL", (String) null, true, (String) null, false, 107, (h84) null), new FinancesCategoryResponse.Category((String) null, (String) null, "BEER", (String) null, true, (String) null, false, 107, (h84) null), new FinancesCategoryResponse.Category((String) null, (String) null, "BICYCLE", (String) null, true, (String) null, false, 107, (h84) null), new FinancesCategoryResponse.Category((String) null, (String) null, "BOOK", (String) null, true, (String) null, false, 107, (h84) null), new FinancesCategoryResponse.Category((String) null, (String) null, "BRIEFCASE", (String) null, true, (String) null, false, 107, (h84) null), new FinancesCategoryResponse.Category((String) null, (String) null, "BUS", (String) null, true, (String) null, false, 107, (h84) null), new FinancesCategoryResponse.Category((String) null, (String) null, "CAR_MECHANIC", (String) null, true, (String) null, false, 107, (h84) null), new FinancesCategoryResponse.Category((String) null, (String) null, "CAR_WASH", (String) null, true, (String) null, false, 107, (h84) null), new FinancesCategoryResponse.Category((String) null, (String) null, "CHARGING", (String) null, true, (String) null, false, 107, (h84) null), new FinancesCategoryResponse.Category((String) null, (String) null, "COCKTAIL", (String) null, true, (String) null, false, 107, (h84) null), new FinancesCategoryResponse.Category((String) null, (String) null, "COFFEE", (String) null, true, (String) null, false, 107, (h84) null), new FinancesCategoryResponse.Category((String) null, (String) null, "DOCUMENT", (String) null, true, (String) null, false, 107, (h84) null), new FinancesCategoryResponse.Category((String) null, (String) null, "FACEBOOK", (String) null, true, (String) null, false, 107, (h84) null), new FinancesCategoryResponse.Category((String) null, (String) null, "FAMILY", (String) null, true, (String) null, false, 107, (h84) null), new FinancesCategoryResponse.Category((String) null, (String) null, "FAST_FOOD", (String) null, true, (String) null, false, 107, (h84) null), new FinancesCategoryResponse.Category((String) null, (String) null, "FOOTBALL", (String) null, true, (String) null, false, 107, (h84) null), new FinancesCategoryResponse.Category((String) null, (String) null, "GAMEPLAY", (String) null, true, (String) null, false, 107, (h84) null), new FinancesCategoryResponse.Category((String) null, (String) null, "GAS", (String) null, true, (String) null, false, 107, (h84) null), new FinancesCategoryResponse.Category((String) null, (String) null, "GRADUATION", (String) null, true, (String) null, false, 107, (h84) null), new FinancesCategoryResponse.Category((String) null, (String) null, "GYM", (String) null, true, (String) null, false, 107, (h84) null), new FinancesCategoryResponse.Category((String) null, (String) null, "HEART", (String) null, true, (String) null, false, 107, (h84) null), new FinancesCategoryResponse.Category((String) null, (String) null, "HOUSE", (String) null, true, (String) null, false, 107, (h84) null), new FinancesCategoryResponse.Category((String) null, (String) null, "LAPTOP", (String) null, true, (String) null, false, 107, (h84) null), new FinancesCategoryResponse.Category((String) null, (String) null, "MAP_CARD", (String) null, true, (String) null, false, 107, (h84) null), new FinancesCategoryResponse.Category((String) null, (String) null, "MEAT", (String) null, true, (String) null, false, 107, (h84) null), new FinancesCategoryResponse.Category((String) null, (String) null, "MOTORCYCLE", (String) null, true, (String) null, false, 107, (h84) null), new FinancesCategoryResponse.Category((String) null, (String) null, "OIL", (String) null, true, (String) null, false, 107, (h84) null), new FinancesCategoryResponse.Category((String) null, (String) null, "PAINT", (String) null, true, (String) null, false, 107, (h84) null), new FinancesCategoryResponse.Category((String) null, (String) null, "PHONE", (String) null, true, (String) null, false, 107, (h84) null), new FinancesCategoryResponse.Category((String) null, (String) null, "PILLS", (String) null, true, (String) null, false, 107, (h84) null), new FinancesCategoryResponse.Category((String) null, (String) null, "PIZZA", (String) null, true, (String) null, false, 107, (h84) null), new FinancesCategoryResponse.Category((String) null, (String) null, "STAR", (String) null, true, (String) null, false, 107, (h84) null), new FinancesCategoryResponse.Category((String) null, (String) null, "STEAM", (String) null, true, (String) null, false, 107, (h84) null), new FinancesCategoryResponse.Category((String) null, (String) null, "SWIM", (String) null, true, (String) null, false, 107, (h84) null), new FinancesCategoryResponse.Category((String) null, (String) null, "MEDICAL", (String) null, true, (String) null, false, 107, (h84) null), new FinancesCategoryResponse.Category((String) null, (String) null, "TAXI", (String) null, true, (String) null, false, 107, (h84) null), new FinancesCategoryResponse.Category((String) null, (String) null, "TOY", (String) null, true, (String) null, false, 107, (h84) null), new FinancesCategoryResponse.Category((String) null, (String) null, "TOOL", (String) null, true, (String) null, false, 107, (h84) null), new FinancesCategoryResponse.Category((String) null, (String) null, "TRUCK", (String) null, true, (String) null, false, 107, (h84) null), new FinancesCategoryResponse.Category((String) null, (String) null, "EMPLOYEE", (String) null, true, (String) null, false, 107, (h84) null), new FinancesCategoryResponse.Category((String) null, (String) null, "GRADUATION", (String) null, true, (String) null, false, 107, (h84) null), new FinancesCategoryResponse.Category((String) null, (String) null, "ORGANIC_FOOD", (String) null, true, (String) null, false, 107, (h84) null), new FinancesCategoryResponse.Category((String) null, (String) null, "VOLLEYBALL", (String) null, true, (String) null, false, 107, (h84) null), new FinancesCategoryResponse.Category((String) null, (String) null, "WINE", (String) null, true, (String) null, false, 107, (h84) null), new FinancesCategoryResponse.Category((String) null, (String) null, "WORLD", (String) null, true, (String) null, false, 107, (h84) null));
    public static final List<kv3> z = b64.D(new kv3("#D4E157", false, 2), new kv3("#AA00FF", false, 2), new kv3("#6200EA", false, 2), new kv3("#80DEEA", false, 2), new kv3("#C5E1A5", false, 2), new kv3("#00BCD4", false, 2), new kv3("#CE93D8", false, 2), new kv3("#F06292", false, 2), new kv3("#D50000", false, 2), new kv3("#76FF03", false, 2), new kv3("#FFAB91", false, 2), new kv3("#FF6E40", false, 2), new kv3("#1DE9B6", false, 2), new kv3("#006064", false, 2), new kv3("#5C6BC0", false, 2), new kv3("#FFEA00", false, 2), new kv3("#F50057", false, 2), new kv3("#00629E", false, 2), new kv3("#00FFFF", false, 2), new kv3("#D9EB2B", false, 2), new kv3("#E2C1FF", false, 2), new kv3("#CE6231", false, 2), new kv3("#0BD812", false, 2), new kv3("#721AE5", false, 2), new kv3("#00C2FF", false, 2), new kv3("#69F0AE", false, 2), new kv3("#448AFF", false, 2), new kv3("#FFA45E", false, 2), new kv3("#447E30", false, 2), new kv3("#FF4A6D", false, 2), new kv3("#D500F9", false, 2), new kv3("#8AC2CB", false, 2), new kv3("#64DD17", false, 2), new kv3("#FFA000", false, 2), new kv3("#A8C2E5", false, 2), new kv3("#7B1FA2", false, 2), new kv3("#6085FF", false, 2), new kv3("#FF70D9", false, 2), new kv3("#00606B", false, 2), new kv3("#DFA948", false, 2), new kv3("#FEB6CE", false, 2), new kv3("#F8DF6F", false, 2), new kv3("#7C4DFF", false, 2), new kv3("#FFFF00", false, 2), new kv3("#FF8484", false, 2), new kv3("#5D9FBE", false, 2), new kv3("#B55353", false, 2), new kv3("#FF00E6", false, 2));

    static {
        android.content.SharedPreferences sharedPreferences = BaseApplication.f.getContext().getSharedPreferences("dump", 0);
        l84.d(sharedPreferences, "BaseApplication.context.…p\", Context.MODE_PRIVATE)");
        a = sharedPreferences;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        l84.d(edit, "sharedPreferences.edit()");
        b = edit;
        i64 i64 = i64.b;
        h = i64;
        i = i64;
        j = i64;
        k = i64;
        l = i64;
        m = i64;
        n = i64;
        q = i64;
        r = i64;
        u = i64;
    }

    public final String a(String str) {
        return qu.H(new Object[]{str}, 1, "CUS_%s", "java.lang.String.format(format, *args)");
    }

    public final void b() {
        c = "";
        d = "";
        e = null;
        f = null;
        g = null;
    }

    public final List<Account> c() {
        for (Account account : h) {
            account.setExpanded(false);
            account.setDraggingOver(false);
        }
        Type type = new SharedPreferences$getAccountListInstance$listType$1().getType();
        Object c2 = new cj2().c(new cj2().g(h), type);
        l84.d(c2, "Gson().fromJson(stringList, listType)");
        return (List) c2;
    }

    public final List<FinancesCategoryResponse.Category> d() {
        Type type = new SharedPreferences$getCategoryExpenseListInstance$listType$1().getType();
        Object c2 = new cj2().c(new cj2().g(m), type);
        l84.d(c2, "Gson().fromJson(stringList, listType)");
        return (List) c2;
    }

    public final List<FinancesCategoryResponse.Category> e() {
        Type type = new SharedPreferences$getCategoryIncomeListInstance$listType$1().getType();
        Object c2 = new cj2().c(new cj2().g(l), type);
        l84.d(c2, "Gson().fromJson(stringList, listType)");
        return (List) c2;
    }

    public final List<FinancesCategoryResponse.Category> f() {
        Type type = new SharedPreferences$getCategoryListInstance$listType$1().getType();
        Object c2 = new cj2().c(new cj2().g(k), type);
        l84.d(c2, "Gson().fromJson(stringList, listType)");
        return (List) c2;
    }

    public final List<FinancesCategoryResponse.Category> g() {
        Type type = new SharedPreferences$getCategoryTransferListInstance$listType$1().getType();
        Object c2 = new cj2().c(new cj2().g(n), type);
        l84.d(c2, "Gson().fromJson(stringList, listType)");
        return (List) c2;
    }

    public final String h() {
        LoginResponse.UserDetails userDetails = e;
        if (userDetails != null) {
            return userDetails.getCUSTOMER_ID();
        }
        return null;
    }

    public final FinancesAccountResponse i() {
        Object b2 = new cj2().b(new cj2().g(o), FinancesAccountResponse.class);
        l84.d(b2, "Gson().fromJson(stringLi…ountResponse::class.java)");
        return (FinancesAccountResponse) b2;
    }

    public final List<NotificationResponse.Notification> j() {
        ArrayList arrayList = new ArrayList();
        List<NotificationResponse.Notification> list = r;
        if (list != null) {
            for (NotificationResponse.Notification notification : list) {
                if (l84.a(notification.getREAD_FLG(), Utils.NO)) {
                    arrayList.add(notification);
                }
            }
        }
        return arrayList;
    }

    public final boolean k() {
        return a.getBoolean("TMP_BIOMETRIC", false);
    }

    public final boolean l() {
        LoginResponse.UserDetails userDetails = e;
        Boolean valueOf = userDetails != null ? Boolean.valueOf(userDetails.isCorporate()) : null;
        if (valueOf == null) {
            return false;
        }
        return valueOf.booleanValue();
    }

    public final void m() {
        i64 i64 = i64.b;
        h = i64;
        i = i64;
        j = i64;
        p = "";
        r = i64;
        u = new ArrayList();
    }

    public final void n(String str, String str2) {
        l84.e(str, "nm");
        l84.e(str2, "value");
        SharedPreferences.Editor editor = b;
        editor.putString(a(str), str2);
        editor.apply();
        editor.commit();
    }

    public final void o(int i2) {
        SharedPreferences.Editor editor = b;
        editor.putInt("THEME", i2);
        editor.apply();
        editor.commit();
    }

    public final int p() {
        return a.getInt("THEME", 1);
    }

    public final void q(String str, boolean z2) {
        SharedPreferences.Editor editor = b;
        editor.putBoolean("TMP_BIOMETRIC", z2);
        if (z2) {
            if (str == null || str.length() == 0) {
                str = "TMP";
            } else if (str == null) {
                str = "";
            }
            SecurityOptional securityOptional = SecurityOptional.c;
            l84.e(str, "text");
            editor.putString("TMP_BIOMETRIC_PUBLIC_KEY", SecurityOptional.b(SecurityOptional.a, str));
        } else {
            editor.remove("TMP_BIOMETRIC_PUBLIC_KEY");
        }
        editor.commit();
    }

    public final void r(List<? extends Account> list) {
        l84.e(list, "list");
        h = list;
    }

    public final void s(List<FinancesCategoryResponse.Category> list) {
        if (!(list == null || list.isEmpty())) {
            l84.c(list);
            k = list;
        }
    }
}
