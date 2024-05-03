package com.smartbank.tools;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.util.Patterns;
import android.util.TypedValue;
import android.view.WindowManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.smartbank.base.BaseApplication;
import com.smartbank.ui.card.pay.CreditPaymentActivity;
import com.smartbank.ui.deep.DeepActivity;
import defpackage.e8;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.ConnectException;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.text.DateFormatSymbols;
import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Pattern;
import kotlin.Metadata;
import mn.egolomt.p000new.bank.R;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b*\bÆ\u0002\u0018\u00002\u00020\u0001B\u000b\b\u0002¢\u0006\u0006\b\u0003\u0010\u0003J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\f\u0010\rJ3\u0010\u0013\u001a\u00020\u0012\"\u0004\b\u0000\u0010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00018\u00002\u0012\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0010\"\u00028\u0000H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u001b\u0010\u0019J'\u0010\u001f\u001a\u00020\u001c2\b\u0010\n\u001a\u0004\u0018\u00010\u001c2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00070\u001dH\u0007¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00070\u001d2\u0006\u0010\n\u001a\u00020\u001cH\u0007¢\u0006\u0004\b!\u0010\"J=\u0010\u001f\u001a\u00020\u001c2\b\u0010\n\u001a\u0004\u0018\u00010\u001c2\u0006\u0010#\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020\u001c2\u0012\u0010%\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001c0\u0010\"\u00020\u001cH\u0007¢\u0006\u0004\b\u001f\u0010&J\u001d\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u001d2\u0006\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b(\u0010)J\u0015\u0010*\u001a\b\u0012\u0004\u0012\u00020'0\u001dH\u0007¢\u0006\u0004\b*\u0010+J/\u00100\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010,\u001a\u00020\u00072\f\u0010/\u001a\b\u0018\u00010-R\u00020.H\u0002¢\u0006\u0004\b0\u00101J\u0017\u00103\u001a\u00020\u00022\u0006\u00102\u001a\u00020\u001cH\u0007¢\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u00020\u00022\u0006\u00105\u001a\u00020\u001cH\u0007¢\u0006\u0004\b6\u00104J\u0017\u00107\u001a\u00020\u001c2\u0006\u00105\u001a\u00020\u001cH\u0007¢\u0006\u0004\b7\u00108J\u0019\u00109\u001a\u00020\u001c2\b\u00105\u001a\u0004\u0018\u00010\u001cH\u0007¢\u0006\u0004\b9\u00108J\u0019\u0010:\u001a\u00020\u00122\b\u00102\u001a\u0004\u0018\u00010\u001cH\u0007¢\u0006\u0004\b:\u0010;J\u001b\u0010=\u001a\u0004\u0018\u00010\u001c2\b\u0010<\u001a\u0004\u0018\u00010\u001cH\u0007¢\u0006\u0004\b=\u00108J\u0019\u0010?\u001a\u00020\u001c2\b\u0010>\u001a\u0004\u0018\u00010\u001cH\u0007¢\u0006\u0004\b?\u00108J#\u0010A\u001a\u00020\u001c2\b\u0010>\u001a\u0004\u0018\u00010\u001c2\b\u0010@\u001a\u0004\u0018\u00010\u001cH\u0007¢\u0006\u0004\bA\u0010BJ#\u0010C\u001a\u00020\u001c2\b\u0010>\u001a\u0004\u0018\u00010\u001c2\b\u0010@\u001a\u0004\u0018\u00010\u001cH\u0007¢\u0006\u0004\bC\u0010BJ\u0017\u0010E\u001a\u00020D2\u0006\u00105\u001a\u00020\u001cH\u0007¢\u0006\u0004\bE\u0010FJ\u0019\u0010H\u001a\u00020\u001c2\b\u0010G\u001a\u0004\u0018\u00010\u001cH\u0007¢\u0006\u0004\bH\u00108J!\u0010J\u001a\u00020\u001c2\b\u0010\u000f\u001a\u0004\u0018\u00010\u001c2\u0006\u0010I\u001a\u00020\u0007H\u0007¢\u0006\u0004\bJ\u0010KJ\u0017\u0010L\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020\u001cH\u0007¢\u0006\u0004\bL\u00108J#\u0010O\u001a\u00020\u001c2\b\u0010M\u001a\u0004\u0018\u00010\u001c2\b\u0010N\u001a\u0004\u0018\u00010\u001cH\u0007¢\u0006\u0004\bO\u0010BJ7\u0010S\u001a\u0004\u0018\u00010\u001c2\b\u0010P\u001a\u0004\u0018\u00010\u00012\u0006\u0010Q\u001a\u00020\u001c2\u0012\u0010R\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001c0\u0010\"\u00020\u001cH\u0007¢\u0006\u0004\bS\u0010TJM\u0010[\u001a\u0012\u0012\u0004\u0012\u00028\u00010Yj\b\u0012\u0004\u0012\u00028\u0001`Z\"\u0004\b\u0000\u0010U\"\u0004\b\u0001\u0010V2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d2\u0012\u0010X\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010WH\u0007¢\u0006\u0004\b[\u0010\\J%\u0010]\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001d2\u0006\u00102\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\u001cH\u0007¢\u0006\u0004\b]\u0010^J\u001b\u0010a\u001a\u0004\u0018\u00010\u001c2\b\u0010`\u001a\u0004\u0018\u00010_H\u0002¢\u0006\u0004\ba\u0010bJ\u0019\u0010e\u001a\u00020\u00122\b\u0010d\u001a\u0004\u0018\u00010cH\u0002¢\u0006\u0004\be\u0010fJ\u0019\u0010e\u001a\u00020\u00122\b\u0010`\u001a\u0004\u0018\u00010_H\u0002¢\u0006\u0004\be\u0010gJ\r\u0010h\u001a\u00020\u0012¢\u0006\u0004\bh\u0010iJ\r\u0010j\u001a\u00020\u001c¢\u0006\u0004\bj\u0010kJ\u0015\u0010l\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\bl\u0010mJ\u0015\u0010n\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\bn\u0010mJ\u001d\u0010n\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\bn\u0010oJ\u001d\u0010l\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\bl\u0010oJ\u001d\u0010q\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010p\u001a\u00020\u0002¢\u0006\u0004\bq\u0010oJ\u0015\u0010q\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\bq\u0010mJ\u0015\u0010s\u001a\u00020\u00072\u0006\u0010r\u001a\u00020\u0007¢\u0006\u0004\bs\u0010tJ\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010oJ\u0015\u0010w\u001a\u00020v2\u0006\u0010u\u001a\u00020\u0016¢\u0006\u0004\bw\u0010xJ\u001d\u0010{\u001a\u00020z2\u0006\u0010u\u001a\u00020\u00162\u0006\u0010y\u001a\u00020\u001c¢\u0006\u0004\b{\u0010|J\r\u0010}\u001a\u00020\u001c¢\u0006\u0004\b}\u0010kJ\r\u0010~\u001a\u00020\u001c¢\u0006\u0004\b~\u0010kJ\r\u0010\u001a\u00020\u001c¢\u0006\u0004\b\u0010kJ*\u0010\u0001\u001a\u00020\u00072\u0006\u0010u\u001a\u00020\u00162\u0007\u0010\u0001\u001a\u00020\u001c2\u0007\u0010\u0001\u001a\u00020\u001c¢\u0006\u0006\b\u0001\u0010\u0001J*\u0010\u0001\u001a\u00020\u00072\u0006\u0010u\u001a\u00020\u00162\u0007\u0010\u0001\u001a\u00020\u001c2\u0007\u0010\u0001\u001a\u00020\u001c¢\u0006\u0006\b\u0001\u0010\u0001J*\u0010\u0001\u001a\u00020\u00072\u0006\u0010u\u001a\u00020\u00162\u0007\u0010\u0001\u001a\u00020\u001c2\u0007\u0010\u0001\u001a\u00020\u001c¢\u0006\u0006\b\u0001\u0010\u0001J!\u0010\u0001\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00162\u0007\u0010\u0001\u001a\u00020\u0007¢\u0006\u0006\b\u0001\u0010\u0001J\u001a\u0010\u0001\u001a\u00020\u001c2\t\u0010\u0001\u001a\u0004\u0018\u00010\u001c¢\u0006\u0005\b\u0001\u00108J \u0010\u0001\u001a\u0005\u0018\u00010\u00012\t\u0010\u0001\u001a\u0004\u0018\u00010\u001cH\u0007¢\u0006\u0006\b\u0001\u0010\u0001J\u001a\u0010\u0001\u001a\u00020\u001c2\t\u0010\u0001\u001a\u0004\u0018\u00010\u001c¢\u0006\u0005\b\u0001\u00108J\u001c\u0010\u0001\u001a\u00020\u001c2\n\u0010\u0001\u001a\u0005\u0018\u00010\u0001¢\u0006\u0006\b\u0001\u0010\u0001J\u001e\u0010\u0001\u001a\u0005\u0018\u00010\u00012\t\u0010\u0001\u001a\u0004\u0018\u00010\u001c¢\u0006\u0006\b\u0001\u0010\u0001J'\u0010\u0001\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00162\r\u0010\u0001\u001a\b\u0018\u00010-R\u00020.¢\u0006\u0006\b\u0001\u0010\u0001J\u0017\u0010\u0001\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0005\b\u0001\u0010mJ\u0017\u0010\u0001\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0005\b\u0001\u0010mJ\u0017\u0010\u0001\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0005\b\u0001\u0010mJ\u0017\u0010\u0001\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0005\b\u0001\u0010mJ\u0017\u0010 \u0001\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0005\b \u0001\u0010mJ\u001b\u0010¢\u0001\u001a\u0005\u0018\u00010¡\u00012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0006\b¢\u0001\u0010£\u0001J\u001b\u0010¤\u0001\u001a\u0005\u0018\u00010¡\u00012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0006\b¤\u0001\u0010£\u0001J\u0017\u0010¥\u0001\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0005\b¥\u0001\u0010mJ\u0017\u0010¦\u0001\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0005\b¦\u0001\u0010mJ\u001b\u0010¨\u0001\u001a\u0005\u0018\u00010§\u00012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0006\b¨\u0001\u0010©\u0001J\u000f\u0010ª\u0001\u001a\u00020\u0012¢\u0006\u0005\bª\u0001\u0010iJ'\u0010\u0001\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00162\r\u0010\u0001\u001a\b\u0018\u00010-R\u00020.¢\u0006\u0006\b\u0001\u0010\u0001J'\u0010\u0001\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00162\r\u0010\u0001\u001a\b\u0018\u00010-R\u00020.¢\u0006\u0006\b\u0001\u0010\u0001J'\u0010\u0001\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00162\r\u0010\u0001\u001a\b\u0018\u00010-R\u00020.¢\u0006\u0006\b\u0001\u0010\u0001J\u001c\u0010­\u0001\u001a\u0005\u0018\u00010¬\u00012\u0007\u0010«\u0001\u001a\u00020\u001c¢\u0006\u0006\b­\u0001\u0010®\u0001J$\u0010°\u0001\u001a\u0005\u0018\u00010¬\u00012\u0006\u0010\u0017\u001a\u00020\u00162\u0007\u0010¯\u0001\u001a\u00020\u0007¢\u0006\u0006\b°\u0001\u0010±\u0001J\u001a\u0010²\u0001\u001a\u00020D2\b\u0010\u0001\u001a\u00030\u0001¢\u0006\u0006\b²\u0001\u0010³\u0001J\u001a\u0010¶\u0001\u001a\u00020D2\b\u0010µ\u0001\u001a\u00030´\u0001¢\u0006\u0006\b¶\u0001\u0010·\u0001J\u001b\u0010¹\u0001\u001a\u00020\u00122\t\u0010¸\u0001\u001a\u0004\u0018\u00010\u0012¢\u0006\u0006\b¹\u0001\u0010º\u0001J\u0018\u0010»\u0001\u001a\u00020\u00072\u0006\u00102\u001a\u00020\u001c¢\u0006\u0006\b»\u0001\u0010¼\u0001J\u0017\u0010½\u0001\u001a\u00020D2\u0006\u00102\u001a\u00020\u001c¢\u0006\u0005\b½\u0001\u0010FJ\u001b\u0010¿\u0001\u001a\u00030¾\u00012\b\u00102\u001a\u0004\u0018\u00010\u001c¢\u0006\u0006\b¿\u0001\u0010À\u0001J\u001b\u0010Á\u0001\u001a\u00020\u00072\t\u0010¸\u0001\u001a\u0004\u0018\u00010\u0007¢\u0006\u0006\bÁ\u0001\u0010Â\u0001J\u001b\u0010Á\u0001\u001a\u00020D2\t\u0010¸\u0001\u001a\u0004\u0018\u00010D¢\u0006\u0006\bÁ\u0001\u0010Ã\u0001J\u001a\u0010Á\u0001\u001a\u00020\u00122\b\u00102\u001a\u0004\u0018\u00010\u0012¢\u0006\u0006\bÁ\u0001\u0010º\u0001J\u001b\u0010Á\u0001\u001a\u00020\u001c2\t\u00102\u001a\u0005\u0018\u00010Ä\u0001¢\u0006\u0006\bÁ\u0001\u0010Å\u0001J\u0019\u0010Á\u0001\u001a\u00020\u001c2\b\u00102\u001a\u0004\u0018\u00010\u001c¢\u0006\u0005\bÁ\u0001\u00108J\u0018\u0010:\u001a\u00020\u00122\b\u00102\u001a\u0004\u0018\u00010D¢\u0006\u0005\b:\u0010Æ\u0001J\u0018\u0010:\u001a\u00020\u00122\b\u00102\u001a\u0004\u0018\u00010\u0007¢\u0006\u0005\b:\u0010Ç\u0001J\u001d\u0010:\u001a\u00020\u00122\r\u0010È\u0001\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001d¢\u0006\u0005\b:\u0010É\u0001J\"\u0010:\u001a\u00020\u00122\u0012\u0010Ë\u0001\u001a\r\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010Ê\u0001¢\u0006\u0005\b:\u0010Ì\u0001J\u001a\u0010:\u001a\u00020\u00122\n\u0010Î\u0001\u001a\u0005\u0018\u00010Í\u0001¢\u0006\u0005\b:\u0010Ï\u0001J\u001c\u0010Ò\u0001\u001a\u00030Ñ\u00012\t\u0010Ð\u0001\u001a\u0004\u0018\u00010\u001c¢\u0006\u0006\bÒ\u0001\u0010Ó\u0001J\u001b\u0010Ô\u0001\u001a\u00030¾\u00012\b\u0010>\u001a\u0004\u0018\u00010\u001c¢\u0006\u0006\bÔ\u0001\u0010À\u0001J\u0019\u0010Õ\u0001\u001a\u00020\u00022\b\u0010>\u001a\u0004\u0018\u00010\u001c¢\u0006\u0005\bÕ\u0001\u00104J\u0019\u0010Ö\u0001\u001a\u00020\u001c2\b\u0010>\u001a\u0004\u0018\u00010\u001c¢\u0006\u0005\bÖ\u0001\u00108J\u0019\u0010×\u0001\u001a\u00020\u001c2\b\u0010>\u001a\u0004\u0018\u00010\u001c¢\u0006\u0005\b×\u0001\u00108J\u001b\u0010×\u0001\u001a\u00020\u001c2\t\u0010>\u001a\u0005\u0018\u00010¾\u0001¢\u0006\u0006\b×\u0001\u0010Ø\u0001J#\u0010Ù\u0001\u001a\u00020\u001c2\b\u0010>\u001a\u0004\u0018\u00010\u001c2\b\u0010@\u001a\u0004\u0018\u00010\u001c¢\u0006\u0005\bÙ\u0001\u0010BJ#\u0010Ú\u0001\u001a\u00020\u001c2\b\u0010>\u001a\u0004\u0018\u00010\u001c2\b\u0010@\u001a\u0004\u0018\u00010\u001c¢\u0006\u0005\bÚ\u0001\u0010BJ\u0019\u0010Û\u0001\u001a\u00020\u001c2\b\u0010<\u001a\u0004\u0018\u00010\u001c¢\u0006\u0005\bÛ\u0001\u00108J\u001b\u0010Ü\u0001\u001a\u00030¾\u00012\b\u0010<\u001a\u0004\u0018\u00010\u001c¢\u0006\u0006\bÜ\u0001\u0010À\u0001J\u0019\u0010Ý\u0001\u001a\u00020\u001c2\b\u0010<\u001a\u0004\u0018\u00010\u001c¢\u0006\u0005\bÝ\u0001\u00108J\u0019\u0010Þ\u0001\u001a\u00020\u001c2\b\u0010<\u001a\u0004\u0018\u00010\u001c¢\u0006\u0005\bÞ\u0001\u00108J\u0019\u0010ß\u0001\u001a\u00020\u001c2\u0007\u0010G\u001a\u00030¾\u0001¢\u0006\u0006\bß\u0001\u0010à\u0001J\u0019\u0010á\u0001\u001a\u00020\u001c2\u0007\u0010G\u001a\u00030¾\u0001¢\u0006\u0006\bá\u0001\u0010à\u0001J\u0019\u0010â\u0001\u001a\u00020\u001c2\u0007\u0010G\u001a\u00030¾\u0001¢\u0006\u0006\bâ\u0001\u0010à\u0001J \u0010ä\u0001\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00162\u0007\u0010ã\u0001\u001a\u00020\u0002¢\u0006\u0005\bä\u0001\u0010oJ\u001c\u0010å\u0001\u001a\u00020\u001c2\n\u0010\u0001\u001a\u0005\u0018\u00010\u0001¢\u0006\u0006\bå\u0001\u0010\u0001J\u000f\u0010æ\u0001\u001a\u00020\u001c¢\u0006\u0005\bæ\u0001\u0010kJ\u000f\u0010ç\u0001\u001a\u00020\u001c¢\u0006\u0005\bç\u0001\u0010kJ\u000f\u0010è\u0001\u001a\u00020\u001c¢\u0006\u0005\bè\u0001\u0010kJ\u0011\u0010ê\u0001\u001a\u00030é\u0001¢\u0006\u0006\bê\u0001\u0010ë\u0001J\u001a\u0010í\u0001\u001a\u00020\u00122\t\u0010ì\u0001\u001a\u0004\u0018\u00010\u001c¢\u0006\u0005\bí\u0001\u0010;J\u001c\u0010ð\u0001\u001a\u00030ï\u00012\t\u0010î\u0001\u001a\u0004\u0018\u00010\u001c¢\u0006\u0006\bð\u0001\u0010ñ\u0001J\u0019\u0010ò\u0001\u001a\u00020\u00122\b\u0010d\u001a\u0004\u0018\u00010c¢\u0006\u0005\bò\u0001\u0010fJ\u001d\u0010ô\u0001\u001a\u0004\u0018\u00010_2\t\u0010ó\u0001\u001a\u0004\u0018\u00010\u001c¢\u0006\u0006\bô\u0001\u0010õ\u0001J\u001c\u0010ö\u0001\u001a\u0004\u0018\u00010\u001c2\t\u0010ó\u0001\u001a\u0004\u0018\u00010\u001c¢\u0006\u0005\bö\u0001\u00108J\u001b\u0010ö\u0001\u001a\u0004\u0018\u00010\u001c2\b\u0010`\u001a\u0004\u0018\u00010_¢\u0006\u0005\bö\u0001\u0010bJ\u001c\u0010÷\u0001\u001a\u0004\u0018\u00010_2\b\u0010d\u001a\u0004\u0018\u00010c¢\u0006\u0006\b÷\u0001\u0010ø\u0001J\"\u0010ù\u0001\u001a\u00020z2\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010`\u001a\u0004\u0018\u00010_¢\u0006\u0006\bù\u0001\u0010ú\u0001J\"\u0010û\u0001\u001a\u00020z2\b\u0010`\u001a\u0004\u0018\u00010_2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0006\bû\u0001\u0010ü\u0001J$\u0010ý\u0001\u001a\u00020z2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\t\u0010ý\u0001\u001a\u0004\u0018\u00010\u001c¢\u0006\u0005\bý\u0001\u0010|J\u001a\u0010\u0002\u001a\u00020z2\b\u0010ÿ\u0001\u001a\u00030þ\u0001¢\u0006\u0006\b\u0002\u0010\u0002J\u000f\u0010\u0002\u001a\u00020\u001c¢\u0006\u0005\b\u0002\u0010kJ\u001a\u0010\u0002\u001a\u00020\u001c2\u0006\u0010u\u001a\u00020\u0016H\u0007¢\u0006\u0006\b\u0002\u0010\u0002J/\u0010\u0002\u001a\u00030¾\u00012\b\u0010\u0002\u001a\u00030¾\u00012\b\u0010\u0002\u001a\u00030¾\u00012\b\u0010\u0002\u001a\u00030¾\u0001¢\u0006\u0006\b\u0002\u0010\u0002J\"\u0010\u0002\u001a\u00020\u00072\u0007\u0010\u0002\u001a\u00020\u00072\u0007\u0010\u0002\u001a\u00020\u0002¢\u0006\u0006\b\u0002\u0010\u0002J\"\u0010\u0002\u001a\u00020\u00072\u0007\u0010\u0002\u001a\u00020\u00072\u0007\u0010\u0002\u001a\u00020\u0002¢\u0006\u0006\b\u0002\u0010\u0002J\u001a\u0010\u0002\u001a\u00030¾\u00012\u0007\u0010µ\u0001\u001a\u00020\u001c¢\u0006\u0006\b\u0002\u0010À\u0001J\u0019\u0010\u0002\u001a\u00020\u00122\b\u00102\u001a\u0004\u0018\u00010\u001c¢\u0006\u0005\b\u0002\u0010;R\u0019\u0010\u0002\u001a\u00020\u001c8\u0006@\u0006XT¢\u0006\b\n\u0006\b\u0002\u0010\u0002R\u0019\u0010\u0002\u001a\u00020\u001c8\u0006@\u0006XT¢\u0006\b\n\u0006\b\u0002\u0010\u0002R\u0015\u0010\u0002\u001a\u00020\u001c8F@\u0006¢\u0006\u0007\u001a\u0005\b\u0002\u0010kR\u0015\u0010\u0002\u001a\u00020\u001c8F@\u0006¢\u0006\u0007\u001a\u0005\b\u0002\u0010kR\u0019\u0010\u0002\u001a\u00020\u001c8\u0006@\u0006XT¢\u0006\b\n\u0006\b\u0002\u0010\u0002R\u0019\u0010\u0002\u001a\u00020\u001c8\u0006@\u0006XT¢\u0006\b\n\u0006\b\u0002\u0010\u0002R\u0019\u0010\u0002\u001a\u00020\u001c8\u0006@\u0006XT¢\u0006\b\n\u0006\b\u0002\u0010\u0002R\u0019\u0010\u0002\u001a\u00020\u001c8\u0006@\u0006XT¢\u0006\b\n\u0006\b\u0002\u0010\u0002R\u0019\u0010\u0002\u001a\u00020\u001c8\u0006@\u0006XT¢\u0006\b\n\u0006\b\u0002\u0010\u0002R\u001f\u0010\u0002\u001a\u00030\u00028\u0006@\u0006¢\u0006\u0010\n\u0006\b\u0002\u0010\u0002\u001a\u0006\b \u0002\u0010¡\u0002R\u0019\u0010¢\u0002\u001a\u00020\u00078\u0006@\u0006XT¢\u0006\b\n\u0006\b¢\u0002\u0010£\u0002R\u0019\u0010¤\u0002\u001a\u00020\u001c8\u0006@\u0006XT¢\u0006\b\n\u0006\b¤\u0002\u0010\u0002R\u0019\u0010¥\u0002\u001a\u00020\u00078\u0006@\u0006XT¢\u0006\b\n\u0006\b¥\u0002\u0010£\u0002R\u0015\u0010§\u0002\u001a\u00020\u001c8F@\u0006¢\u0006\u0007\u001a\u0005\b¦\u0002\u0010kR\u0019\u0010¨\u0002\u001a\u00020\u00078\u0006@\u0006XT¢\u0006\b\n\u0006\b¨\u0002\u0010£\u0002R\u0019\u0010©\u0002\u001a\u00020\u001c8\u0006@\u0006XT¢\u0006\b\n\u0006\b©\u0002\u0010\u0002R\u0019\u0010ª\u0002\u001a\u00020\u00078\u0006@\u0006XT¢\u0006\b\n\u0006\bª\u0002\u0010£\u0002R\u0019\u0010«\u0002\u001a\u00020\u001c8\u0006@\u0006XT¢\u0006\b\n\u0006\b«\u0002\u0010\u0002R\u0019\u0010¬\u0002\u001a\u00020\u001c8\u0006@\u0006XT¢\u0006\b\n\u0006\b¬\u0002\u0010\u0002R\u0019\u0010­\u0002\u001a\u00020\u001c8\u0006@\u0006XT¢\u0006\b\n\u0006\b­\u0002\u0010\u0002R\u0019\u0010®\u0002\u001a\u00020\u001c8\u0006@\u0006XT¢\u0006\b\n\u0006\b®\u0002\u0010\u0002R\u0015\u0010°\u0002\u001a\u00020\u001c8F@\u0006¢\u0006\u0007\u001a\u0005\b¯\u0002\u0010kR\u0015\u0010²\u0002\u001a\u00020\u001c8F@\u0006¢\u0006\u0007\u001a\u0005\b±\u0002\u0010kR\u0019\u0010³\u0002\u001a\u00020\u001c8\u0006@\u0006XT¢\u0006\b\n\u0006\b³\u0002\u0010\u0002R\u0019\u0010´\u0002\u001a\u00020\u001c8\u0006@\u0006XT¢\u0006\b\n\u0006\b´\u0002\u0010\u0002R\u0019\u0010µ\u0002\u001a\u00020\u001c8\u0006@\u0006XT¢\u0006\b\n\u0006\bµ\u0002\u0010\u0002R\u0019\u0010¶\u0002\u001a\u00020\u00078\u0006@\u0006XT¢\u0006\b\n\u0006\b¶\u0002\u0010£\u0002R\u0019\u0010·\u0002\u001a\u00020\u001c8\u0006@\u0006XT¢\u0006\b\n\u0006\b·\u0002\u0010\u0002R\u0019\u0010¸\u0002\u001a\u00020\u00078\u0006@\u0006XT¢\u0006\b\n\u0006\b¸\u0002\u0010£\u0002R\u0019\u0010¹\u0002\u001a\u00020\u001c8\u0006@\u0006XT¢\u0006\b\n\u0006\b¹\u0002\u0010\u0002R\u0015\u0010»\u0002\u001a\u00020\u001c8F@\u0006¢\u0006\u0007\u001a\u0005\bº\u0002\u0010kR\u0015\u0010½\u0002\u001a\u00020\u001c8F@\u0006¢\u0006\u0007\u001a\u0005\b¼\u0002\u0010kR\u0019\u0010¾\u0002\u001a\u00020\u001c8\u0006@\u0006XT¢\u0006\b\n\u0006\b¾\u0002\u0010\u0002R\u0019\u0010¿\u0002\u001a\u00020\u001c8\u0006@\u0006XT¢\u0006\b\n\u0006\b¿\u0002\u0010\u0002R\u001f\u0010Á\u0002\u001a\u00030À\u00028\u0006@\u0006¢\u0006\u0010\n\u0006\bÁ\u0002\u0010Â\u0002\u001a\u0006\bÃ\u0002\u0010Ä\u0002R\u0019\u0010Å\u0002\u001a\u00020\u001c8\u0006@\u0006XT¢\u0006\b\n\u0006\bÅ\u0002\u0010\u0002R\u0019\u0010Æ\u0002\u001a\u00020\u001c8\u0006@\u0006XT¢\u0006\b\n\u0006\bÆ\u0002\u0010\u0002R\u0015\u0010È\u0002\u001a\u00020\u001c8F@\u0006¢\u0006\u0007\u001a\u0005\bÇ\u0002\u0010kR\u0015\u0010Ê\u0002\u001a\u00020\u001c8F@\u0006¢\u0006\u0007\u001a\u0005\bÉ\u0002\u0010kR\u0019\u0010Ë\u0002\u001a\u00020\u001c8\u0006@\u0006XT¢\u0006\b\n\u0006\bË\u0002\u0010\u0002R\u0019\u0010Ì\u0002\u001a\u00020\u001c8\u0006@\u0006XT¢\u0006\b\n\u0006\bÌ\u0002\u0010\u0002R\u001f\u0010Í\u0002\u001a\u00030\u00028\u0006@\u0006¢\u0006\u0010\n\u0006\bÍ\u0002\u0010\u0002\u001a\u0006\bÎ\u0002\u0010¡\u0002R\u0019\u0010Ï\u0002\u001a\u00020\u001c8\u0006@\u0006XT¢\u0006\b\n\u0006\bÏ\u0002\u0010\u0002R\u0015\u0010Ñ\u0002\u001a\u00020\u001c8F@\u0006¢\u0006\u0007\u001a\u0005\bÐ\u0002\u0010kR\u0019\u0010Ò\u0002\u001a\u00020\u001c8\u0006@\u0006XT¢\u0006\b\n\u0006\bÒ\u0002\u0010\u0002R\u0019\u0010Ó\u0002\u001a\u00020\u001c8\u0006@\u0006XT¢\u0006\b\n\u0006\bÓ\u0002\u0010\u0002R\u0019\u0010Ô\u0002\u001a\u00020\u00078\u0006@\u0006XT¢\u0006\b\n\u0006\bÔ\u0002\u0010£\u0002R\u0015\u0010Ö\u0002\u001a\u00020\u001c8F@\u0006¢\u0006\u0007\u001a\u0005\bÕ\u0002\u0010kR\u0019\u0010×\u0002\u001a\u00020\u00078\u0006@\u0006XT¢\u0006\b\n\u0006\b×\u0002\u0010£\u0002R\u0019\u0010Ø\u0002\u001a\u00020\u00078\u0006@\u0006XT¢\u0006\b\n\u0006\bØ\u0002\u0010£\u0002R\u0015\u0010Ú\u0002\u001a\u00020\u001c8F@\u0006¢\u0006\u0007\u001a\u0005\bÙ\u0002\u0010kR\u0019\u0010Û\u0002\u001a\u00020\u001c8\u0006@\u0006XT¢\u0006\b\n\u0006\bÛ\u0002\u0010\u0002R\u0019\u0010Ü\u0002\u001a\u00020\u00078\u0006@\u0006XT¢\u0006\b\n\u0006\bÜ\u0002\u0010£\u0002R\u0019\u0010Ý\u0002\u001a\u00020\u001c8\u0006@\u0006XT¢\u0006\b\n\u0006\bÝ\u0002\u0010\u0002R\u0019\u0010Þ\u0002\u001a\u00020\u00078\u0006@\u0006XT¢\u0006\b\n\u0006\bÞ\u0002\u0010£\u0002R\u0019\u0010ß\u0002\u001a\u00020\u001c8\u0006@\u0006XT¢\u0006\b\n\u0006\bß\u0002\u0010\u0002R\u0019\u0010à\u0002\u001a\u00020\u001c8\u0006@\u0006XT¢\u0006\b\n\u0006\bà\u0002\u0010\u0002R\u0019\u0010á\u0002\u001a\u00020\u001c8\u0006@\u0006XT¢\u0006\b\n\u0006\bá\u0002\u0010\u0002R\u0019\u0010â\u0002\u001a\u00020\u001c8\u0006@\u0006XT¢\u0006\b\n\u0006\bâ\u0002\u0010\u0002R\u0019\u0010ã\u0002\u001a\u00020\u001c8\u0006@\u0006XT¢\u0006\b\n\u0006\bã\u0002\u0010\u0002R\u0019\u0010ä\u0002\u001a\u00020\u001c8\u0006@\u0006XT¢\u0006\b\n\u0006\bä\u0002\u0010\u0002R\u0015\u0010æ\u0002\u001a\u00020\u001c8F@\u0006¢\u0006\u0007\u001a\u0005\bå\u0002\u0010kR\u0019\u0010ç\u0002\u001a\u00020\u00078\u0006@\u0006XT¢\u0006\b\n\u0006\bç\u0002\u0010£\u0002R\u0019\u0010è\u0002\u001a\u00020\u001c8\u0006@\u0006XT¢\u0006\b\n\u0006\bè\u0002\u0010\u0002R\u0015\u0010ê\u0002\u001a\u00020\u001c8F@\u0006¢\u0006\u0007\u001a\u0005\bé\u0002\u0010kR\u0019\u0010ë\u0002\u001a\u00020\u001c8\u0006@\u0006XT¢\u0006\b\n\u0006\bë\u0002\u0010\u0002R\u0019\u0010ì\u0002\u001a\u00020\u001c8\u0006@\u0006XT¢\u0006\b\n\u0006\bì\u0002\u0010\u0002R9\u0010ï\u0002\u001a\"\u0012\u0004\u0012\u00020\u001c\u0012\u0005\u0012\u00030ï\u00010í\u0002j\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0005\u0012\u00030ï\u0001`î\u00028\u0002@\u0002X\u0004¢\u0006\b\n\u0006\bï\u0002\u0010ð\u0002R\u0019\u0010ñ\u0002\u001a\u00020\u001c8\u0006@\u0006XT¢\u0006\b\n\u0006\bñ\u0002\u0010\u0002R\u0015\u0010ó\u0002\u001a\u00020\u001c8F@\u0006¢\u0006\u0007\u001a\u0005\bò\u0002\u0010kR\u0019\u0010ô\u0002\u001a\u00020\u001c8\u0006@\u0006XT¢\u0006\b\n\u0006\bô\u0002\u0010\u0002R\u0015\u0010ö\u0002\u001a\u00020\u001c8F@\u0006¢\u0006\u0007\u001a\u0005\bõ\u0002\u0010kR\u0019\u0010÷\u0002\u001a\u00020\u001c8\u0006@\u0006XT¢\u0006\b\n\u0006\b÷\u0002\u0010\u0002R\u0019\u0010ø\u0002\u001a\u00020\u001c8\u0006@\u0006XT¢\u0006\b\n\u0006\bø\u0002\u0010\u0002R\u0019\u0010ù\u0002\u001a\u00020\u001c8\u0006@\u0006XT¢\u0006\b\n\u0006\bù\u0002\u0010\u0002R\u0019\u0010ú\u0002\u001a\u00020\u001c8\u0006@\u0006XT¢\u0006\b\n\u0006\bú\u0002\u0010\u0002R\u0015\u0010ü\u0002\u001a\u00020\u001c8F@\u0006¢\u0006\u0007\u001a\u0005\bû\u0002\u0010kR\u0015\u0010þ\u0002\u001a\u00020\u001c8F@\u0006¢\u0006\u0007\u001a\u0005\bý\u0002\u0010kR\u001d\u0010$\u001a\u00030\u00028\u0006@\u0006¢\u0006\u000f\n\u0005\b$\u0010\u0002\u001a\u0006\bÿ\u0002\u0010¡\u0002R\u0015\u0010\u0003\u001a\u00020\u001c8F@\u0006¢\u0006\u0007\u001a\u0005\b\u0003\u0010kR\u0019\u0010\u0003\u001a\u00020\u001c8\u0006@\u0006XT¢\u0006\b\n\u0006\b\u0003\u0010\u0002R\u0015\u0010\u0003\u001a\u00020\u001c8F@\u0006¢\u0006\u0007\u001a\u0005\b\u0003\u0010kR\u0019\u0010\u0003\u001a\u00020\u001c8\u0006@\u0006XT¢\u0006\b\n\u0006\b\u0003\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u001c8\u0006@\u0006XT¢\u0006\b\n\u0006\b\u0003\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u001c8\u0006@\u0006XT¢\u0006\b\n\u0006\b\u0003\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u001c8\u0006@\u0006XT¢\u0006\b\n\u0006\b\u0003\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u001c8\u0006@\u0006XT¢\u0006\b\n\u0006\b\u0003\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u001c8\u0006@\u0006XT¢\u0006\b\n\u0006\b\u0003\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u001c8\u0006@\u0006XT¢\u0006\b\n\u0006\b\u0003\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u001c8\u0006@\u0006XT¢\u0006\b\n\u0006\b\u0003\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u001c8\u0006@\u0006XT¢\u0006\b\n\u0006\b\u0003\u0010\u0002R\u0015\u0010\u0003\u001a\u00020\u001c8F@\u0006¢\u0006\u0007\u001a\u0005\b\u0003\u0010kR\u0019\u0010\u0003\u001a\u00020\u001c8\u0006@\u0006XT¢\u0006\b\n\u0006\b\u0003\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u00078\u0006@\u0006XT¢\u0006\b\n\u0006\b\u0003\u0010£\u0002R\u0019\u0010\u0003\u001a\u00020\u001c8\u0006@\u0006XT¢\u0006\b\n\u0006\b\u0003\u0010\u0002R\u0015\u0010\u0003\u001a\u00020\u001c8F@\u0006¢\u0006\u0007\u001a\u0005\b\u0003\u0010kR\u0019\u0010\u0003\u001a\u00020\u00078\u0006@\u0006XT¢\u0006\b\n\u0006\b\u0003\u0010£\u0002¨\u0006\u0003"}, d2 = {"Lcom/smartbank/tools/Utils;", "", "", "sp", "sp2Px", "(F)F", "dpValue", "", "dip2px", "(F)I", "value", "max", "percent", "(FF)F", "T", "item", "", "values", "", "isInContains", "(Ljava/lang/Object;[Ljava/lang/Object;)Z", "attrId", "Landroid/content/Context;", "context", "getColorByAttr", "(ILandroid/content/Context;)I", "resId", "getColor", "", "", "list", "splitAndFormat", "(Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;", "toList", "(Ljava/lang/String;)Ljava/util/List;", "seprator", "format", "defVal", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;", "Lcw2;", "getLanguage", "(Landroid/content/Context;)Ljava/util/List;", "getCurrency", "()Ljava/util/List;", "attributeId", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "themeL", "getAttributeColor", "(Landroid/content/Context;ILandroid/content/res/Resources$Theme;)I", "str", "toFloat", "(Ljava/lang/String;)F", "amt", "toFloatFromAmount", "toNumFromAmount", "(Ljava/lang/String;)Ljava/lang/String;", "toInteger", "isNullOrEmpty", "(Ljava/lang/String;)Z", "amount", "getFormattedBalanceWithCurrency", "num", "toAmountLong", "code", "toAmountLongCode", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "toAmountLongSymbol", "", "fromAmountString", "(Ljava/lang/String;)J", "x", "toCurrencyPrecition", "removeIndex", "removeAtString", "(Ljava/lang/String;I)Ljava/lang/String;", "now", "dateStr", "addMonth", "addMonthDate", "obj", "field", "defValue", "getFieldValue", "(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;", "Src", "Dest", "Lyt3;", "convertor", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "arrayListOf", "(Ljava/util/List;Lyt3;)Ljava/util/ArrayList;", "toStrList", "(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;", "Landroid/net/Uri;", "uri", "getTypeFromDeepLink", "(Landroid/net/Uri;)Ljava/lang/String;", "Landroid/content/Intent;", "intent", "isDeepLinkInternal", "(Landroid/content/Intent;)Z", "(Landroid/net/Uri;)Z", "isDigital", "()Z", "getSuccessAnimation", "()Ljava/lang/String;", "getScreenWidth", "(Landroid/content/Context;)I", "getScreenHeight", "(Landroid/content/Context;F)I", "ratio", "getCardWidth", "width", "getCardHeight", "(I)I", "ctx", "Landroidx/recyclerview/widget/LinearLayoutManager;", "getDisabledScroll", "(Landroid/content/Context;)Landroidx/recyclerview/widget/LinearLayoutManager;", "text", "Lu54;", "copyToClipBoard", "(Landroid/content/Context;Ljava/lang/String;)V", "getPublicUrl", "getLocationPublicUrl", "getFinancesUrl", "imageName", "defaultImage", "getImageByName", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I", "stringName", "defaultString", "getStringByName", "colorName", "defaultColor", "getColorByName", "month", "getMonth", "(Landroid/content/Context;I)Ljava/lang/String;", "currency", "getCurrencySymbol", "datetime", "Ljava/util/Calendar;", "toMNDate", "(Ljava/lang/String;)Ljava/util/Calendar;", "toMNDateStr", "cal", "getFormattedDate", "(Ljava/util/Calendar;)Ljava/lang/String;", "date", "getCalendar", "theme", "getDefaultBodyBackgroundPrimaryColor", "(Landroid/content/Context;Landroid/content/res/Resources$Theme;)I", "getTextPrimaryColor", "getTextSecondaryColor", "getTextErrorColor", "getDigitalTextPrimaryColor", "getDigitalTextSecondaryColor", "Landroid/graphics/Typeface;", "getDigitalTextRegularFont", "(Landroid/content/Context;)Landroid/graphics/Typeface;", "getDigitalTextBoldFont", "getDigitalPrimaryButtonColor", "getComponentColor", "Landroid/graphics/drawable/Drawable;", "getDrawableSelector", "(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;", "isNetworkConnected", "base", "Landroid/graphics/Bitmap;", "base64ToBitmap", "(Ljava/lang/String;)Landroid/graphics/Bitmap;", "drawable", "drawableToBitmap", "(Landroid/content/Context;I)Landroid/graphics/Bitmap;", "getFormattedDateToLong", "(Ljava/util/Calendar;)J", "Ljava/lang/Float;", "vl", "floatToInt", "(Ljava/lang/Float;)J", "data", "toBoolean", "(Ljava/lang/Boolean;)Z", "toInt", "(Ljava/lang/String;)I", "toLong", "", "toDouble", "(Ljava/lang/String;)D", "toEmpty", "(Ljava/lang/Integer;)I", "(Ljava/lang/Long;)J", "", "(Ljava/lang/CharSequence;)Ljava/lang/String;", "(Ljava/lang/Long;)Z", "(Ljava/lang/Integer;)Z", "lst", "(Ljava/util/List;)Z", "", "map", "(Ljava/util/Map;)Z", "Lorg/json/JSONObject;", "json", "(Lorg/json/JSONObject;)Z", "number", "Ljava/math/BigDecimal;", "toDecimal", "(Ljava/lang/String;)Ljava/math/BigDecimal;", "toAmountDouble", "toAmountFloat", "toAmountDecimal", "toAmountCurrency", "(Ljava/lang/Double;)Ljava/lang/String;", "toAmountCurrencyCode", "toAmountCurrencySymbol", "getFormattedBalanceDecimal", "getFormattedBalanceDouble", "getFormattedBalance", "getFormattedBalanceWithCurrencySymbol", "toLongFormat", "(D)Ljava/lang/String;", "toCurrencyDecimal", "toCurrency", "dp", "dpToPx", "formattedSingle", "getErrorMessage", "getCCDErrorMessage", "getLogoutMessage", "Ljava/net/ConnectException;", "getException", "()Ljava/net/ConnectException;", "expireDate", "checkCardExpired", "key", "Lru3;", "getCardType", "(Ljava/lang/String;)Lru3;", "isDeepScheme", "url", "parseToUri", "(Ljava/lang/String;)Landroid/net/Uri;", "getTokenFromDeepLink", "isDeepLink", "(Landroid/content/Intent;)Landroid/net/Uri;", "callDeepLink", "(Landroid/content/Context;Landroid/net/Uri;)V", "driveDeepLink", "(Landroid/net/Uri;Landroid/content/Context;)V", "redirect", "Lcom/smartbank/base/BaseActivity;", "mActivity", "goToSocialPay", "(Lcom/smartbank/base/BaseActivity;)V", "getPublicKey", "getDeviceId", "(Landroid/content/Context;)Ljava/lang/String;", "loanValue", "interestValue", "duration", "calculateMotrgage", "(DDD)D", "color", "factor", "darkerColor", "(IF)I", "lighterColor", "toNum", "isValidEmail", "CNY", "Ljava/lang/String;", "KRW", "getCONTRACT_DEMAND", "CONTRACT_DEMAND", "getCONTRACT_CARD_GOLD", "CONTRACT_CARD_GOLD", "MN_MN", "DEEPLINK_SCHEME", "LOTTIE_DIGITAL_SUCCESS", "CARD_SUVD", "RUB", "Ljava/text/SimpleDateFormat;", "formatInt", "Ljava/text/SimpleDateFormat;", "getFormatInt", "()Ljava/text/SimpleDateFormat;", "NOTIFICATION_REFRESH", "I", "CARD_PURPLE", "NOTIFICATION", "getCONTRACT_CARD_OYU", "CONTRACT_CARD_OYU", "TRANSACTION", "CAM_ACNT", "CATEGORY_REFRESH", "REFRESH_MAIN_ALL", "EXPENSE", "SEK", "CARD_BLUE", "getCONTRACT_OPEN_ACCOUNT", "CONTRACT_OPEN_ACCOUNT", "getINFO_SAVINGS_DEP", "INFO_SAVINGS_DEP", "MNT", "EN_US", "REFRESH_MAIN_ADDRESS_BOOK", "THEME_DIGITAL", "REFRESH_MAIN_ACCOUNTS", "LOCATION_REQUEST_CODE", "INCOME", "getCONTRACT_CARD_BLUE", "CONTRACT_CARD_BLUE", "getLINK_SECURITY", "LINK_SECURITY", "AUD", "DEEPLINK_PAYMENT", "Ljava/math/RoundingMode;", "ROUND_MODE", "Ljava/math/RoundingMode;", "getROUND_MODE", "()Ljava/math/RoundingMode;", "TXN_OSB_AMT", "PRODUCT_LINK", "getCONTRACT_CARD_PURPLE", "CONTRACT_CARD_PURPLE", "getCONTRACT_CARD_SUVD", "CONTRACT_CARD_SUVD", "CARD_PINK", "CARD_OYU", "formatSingle", "getFormatSingle", "YES", "getINFO_SAVINGS_DEMAND", "INFO_SAVINGS_DEMAND", "CHF", "PASS_DATA", "THEME_LIGHT", "getTERM_CARD_DELIVERY", "TERM_CARD_DELIVERY", "TRANSACTION_REFRESH_ONE", "TRANSACTION_REFRESH_ALL", "getCONTRACT_CARD_CARBON", "CONTRACT_CARD_CARBON", "DEEPLINK_CREDITCARD", "SETTINGS", "LOTTIE_FAILED", "THEME_DARK", "CAM_EMAIL", "EXCLUDE_UNCATEGORISED", "JPY", "HKD", "SGD", "PASS_TYPE", "getCONTRACT_CARD_PINK", "CONTRACT_CARD_PINK", "CATEGORY", "SECD", "getCONTRACT_CARD_GREEN", "CONTRACT_CARD_GREEN", "CAM_MOBILE", "LOTTIE_SUCCESS", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "cardTypes", "Ljava/util/HashMap;", "USD", "getCONTRACT_STANDING_ORDER", "CONTRACT_STANDING_ORDER", "CARD_GREEN", "getCONTRACT_DEPOSIT", "CONTRACT_DEPOSIT", "PASS_MONTH", "REFRESH_MAIN_NOTIFICATION", "NO", "TXN_OSB", "getCONTRACT_CLOAN", "CONTRACT_CLOAN", "getCONTRACT_ACM", "CONTRACT_ACM", "getFormat", "getCONTRACT_CARD_EXTEND", "CONTRACT_CARD_EXTEND", "PASS_DEEP", "getINFO_SAVINGS_ACM", "INFO_SAVINGS_ACM", "TPWD", "CARD_CARBON", "TXN_OSB_AMT_CURCODE", "PASS_INDEX", "CARD_GOLD", "PASS_ANOTHER_DATA", "EUR", "TRANSFER", "GBP", "getCONTRACT_CREDIT_CARD", "CONTRACT_CREDIT_CARD", "CAM_PHONE", "BUDGET_REFRESH", "CAD", "getCONTRACT_DLOAN", "CONTRACT_DLOAN", "BUDGET", "<init>", "()V", "app_release"}, k = 1, mv = {1, 4, 0})
/* compiled from: Utils.kt */
public final class Utils {
    public static final String AUD = "AUD";
    public static final int BUDGET = 300;
    public static final int BUDGET_REFRESH = 30;
    public static final String CAD = "CAD";
    public static final String CAM_ACNT = "4";
    public static final String CAM_EMAIL = "3";
    public static final String CAM_MOBILE = "1";
    public static final String CAM_PHONE = "2";
    public static final String CARD_BLUE = "BLUE";
    public static final String CARD_CARBON = "CARBON";
    public static final String CARD_GOLD = "GOLD";
    public static final String CARD_GREEN = "GREEN";
    public static final String CARD_OYU = "OYU";
    public static final String CARD_PINK = "PINK";
    public static final String CARD_PURPLE = "PURPLE";
    public static final String CARD_SUVD = "SUVD";
    public static final int CATEGORY = 200;
    public static final int CATEGORY_REFRESH = 20;
    public static final String CHF = "CHF";
    public static final String CNY = "CNY";
    public static final String DEEPLINK_CREDITCARD = "cardpayment";
    public static final String DEEPLINK_PAYMENT = "payment";
    public static final String DEEPLINK_SCHEME = "golomtbank";
    public static final String EN_US = "EN_US";
    public static final String EUR = "EUR";
    public static final String EXCLUDE_UNCATEGORISED = "Ангилагдаагүй|Uncategorized";
    public static final String EXPENSE = "D";
    public static final String GBP = "GBP";
    public static final String HKD = "HKD";
    public static final String INCOME = "C";
    public static final Utils INSTANCE = new Utils();
    public static final String JPY = "JPY";
    public static final String KRW = "KRW";
    public static final int LOCATION_REQUEST_CODE = 60001;
    public static final String LOTTIE_DIGITAL_SUCCESS = "lottie-digital-success.json";
    public static final String LOTTIE_FAILED = "lottie-failed.json";
    public static final String LOTTIE_SUCCESS = "lottie-success.json";
    public static final String MNT = "MNT";
    public static final String MN_MN = "MN_MN";
    public static final String NO = "N";
    public static final int NOTIFICATION = 500;
    public static final int NOTIFICATION_REFRESH = 51;
    public static final String PASS_ANOTHER_DATA = "PASS_ANOTHER_DATA";
    public static final String PASS_DATA = "PASS_DATA";
    public static final String PASS_DEEP = "PASS_DEEP";
    public static final String PASS_INDEX = "PASS_INDEX";
    public static final String PASS_MONTH = "PASS_MONTH";
    public static final String PASS_TYPE = "PASS_TYPE";
    public static final String PRODUCT_LINK = "https://p2p.golomtbank.com/ImageUploadServerApp/img/product/";
    public static final String REFRESH_MAIN_ACCOUNTS = "REFRESH_MAIN_ACCOUNTS";
    public static final String REFRESH_MAIN_ADDRESS_BOOK = "REFRESH_MAIN_ADDRESS_BOOK";
    public static final String REFRESH_MAIN_ALL = "REFRESH_MAIN_ALL";
    public static final String REFRESH_MAIN_NOTIFICATION = "REFRESH_MAIN_NOTIFICATION";
    private static final RoundingMode ROUND_MODE = RoundingMode.HALF_UP;
    public static final String RUB = "RUB";
    public static final String SECD = "SECD";
    public static final String SEK = "SEK";
    public static final int SETTINGS = 400;
    public static final String SGD = "SGD";
    public static final int THEME_DARK = 2;
    public static final int THEME_DIGITAL = 3;
    public static final int THEME_LIGHT = 1;
    public static final String TPWD = "TPWD";
    public static final int TRANSACTION = 100;
    public static final int TRANSACTION_REFRESH_ALL = 12;
    public static final int TRANSACTION_REFRESH_ONE = 11;
    public static final String TRANSFER = "T";
    public static final String TXN_OSB = "OSB";
    public static final String TXN_OSB_AMT = "5000000.0";
    public static final String TXN_OSB_AMT_CURCODE = "MNT|5000000";
    public static final String USD = "USD";
    public static final String YES = "Y";
    private static final HashMap<String, ru3> cardTypes = new HashMap<>();
    private static final SimpleDateFormat format;
    private static final SimpleDateFormat formatInt;
    private static final SimpleDateFormat formatSingle;

    static {
        Locale locale = Locale.US;
        formatInt = new SimpleDateFormat("yyyyMMdd", locale);
        format = new SimpleDateFormat("yyyy-MM-dd", locale);
        formatSingle = new SimpleDateFormat("yyyy-MM", locale);
    }

    private Utils() {
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:0|(5:2|3|4|(1:6)(1:7)|8)|9|10|11) */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0031, code lost:
        return "";
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x001e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String addMonthDate(java.lang.String r3, java.lang.String r4) {
        /*
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            boolean r1 = isNullOrEmpty((java.lang.String) r3)
            java.lang.String r2 = ""
            if (r1 != 0) goto L_0x001e
            java.lang.String r1 = "date"
            defpackage.l84.d(r0, r1)     // Catch:{ Exception -> 0x001e }
            java.text.SimpleDateFormat r1 = format     // Catch:{ Exception -> 0x001e }
            if (r3 == 0) goto L_0x0016
            goto L_0x0017
        L_0x0016:
            r3 = r2
        L_0x0017:
            java.util.Date r3 = r1.parse(r3)     // Catch:{ Exception -> 0x001e }
            r0.setTime(r3)     // Catch:{ Exception -> 0x001e }
        L_0x001e:
            com.smartbank.tools.Utils r3 = INSTANCE     // Catch:{ Exception -> 0x0031 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x0031 }
            int r4 = r3.toInt(r4)     // Catch:{ Exception -> 0x0031 }
            r1 = 2
            r0.add(r1, r4)     // Catch:{ Exception -> 0x0031 }
            java.lang.String r3 = r3.getFormattedDate(r0)     // Catch:{ Exception -> 0x0031 }
            return r3
        L_0x0031:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.smartbank.tools.Utils.addMonthDate(java.lang.String, java.lang.String):java.lang.String");
    }

    public static final <Src, Dest> ArrayList<Dest> arrayListOf(List<? extends Src> list, yt3<Src, Dest> yt3) {
        l84.e(list, "list");
        l84.e(yt3, "convertor");
        ArrayList<Dest> arrayList = new ArrayList<>();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(yt3.convert(it.next()));
        }
        return arrayList;
    }

    public static final long fromAmountString(String str) {
        l84.e(str, "amt");
        if (isNullOrEmpty(str)) {
            return 0;
        }
        Long valueOf = Long.valueOf(e65.y(str, ",", "", false, 4));
        l84.d(valueOf, "java.lang.Long.valueOf((amt).replace(\",\", \"\"))");
        return valueOf.longValue();
    }

    private final int getAttributeColor(Context context, int i, Resources.Theme theme) {
        if (context == null) {
            return -1;
        }
        if (theme == null) {
            theme = context.getTheme();
        }
        TypedValue typedValue = new TypedValue();
        if (theme != null) {
            theme.resolveAttribute(i, typedValue, true);
        }
        return typedValue.data;
    }

    public static final int getColor(int i, Context context) {
        l84.e(context, "context");
        return e8.b(context, i);
    }

    public static final int getColorByAttr(int i, Context context) {
        l84.e(context, "context");
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return e8.b(context, typedValue.resourceId);
        }
        return 0;
    }

    public static final List<cw2> getCurrency() {
        return b64.D(new cw2(MNT), new cw2(USD), new cw2(CNY), new cw2(JPY), new cw2(EUR), new cw2(GBP), new cw2(CHF), new cw2(RUB), new cw2(KRW), new cw2(AUD), new cw2(HKD), new cw2(SEK), new cw2(SGD), new cw2(CAD));
    }

    public static final String getFieldValue(Object obj, String str, String... strArr) {
        Class<?> cls;
        l84.e(str, "field");
        l84.e(strArr, "defValue");
        l84.e(".", "literal");
        for (String next : new z55(".", a65.LITERAL).c(str, 0)) {
            if (obj == null) {
                try {
                    if (!(strArr.length == 0)) {
                        return strArr[0];
                    }
                } catch (Throwable unused) {
                    return null;
                }
            }
            Field declaredField = (obj == null || (cls = obj.getClass()) == null) ? null : cls.getDeclaredField(next);
            l84.c(declaredField);
            declaredField.setAccessible(true);
            obj = declaredField.get(obj);
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj != null) {
            return obj.toString();
        }
        return null;
    }

    public static final String getFormattedBalanceWithCurrency(String str) {
        List<String> list;
        if (isNullOrEmpty(str)) {
            return "";
        }
        if (str != null) {
            String quote = Pattern.quote("|");
            l84.d(quote, "Pattern.quote(\"|\")");
            list = new z55(quote).c(str, 0);
        } else {
            list = null;
        }
        if (list != null && list.size() > 1) {
            return qu.H(new Object[]{INSTANCE.toAmountCurrency(list.get(1)), list.get(0)}, 2, "%s %s", "java.lang.String.format(format, *args)");
        } else if (list != null) {
            return list.get(0);
        } else {
            return null;
        }
    }

    public static final List<cw2> getLanguage(Context context) {
        l84.e(context, "context");
        return b64.D(new cw2(MN_MN, context.getString(R.string.lan_mn)), new cw2(EN_US, context.getString(R.string.lan_en)));
    }

    private final String getTypeFromDeepLink(Uri uri) {
        String str;
        if (uri != null) {
            try {
                str = uri.getHost();
            } catch (Exception unused) {
                return "";
            }
        } else {
            str = null;
        }
        String empty = toEmpty(str);
        if (empty != null) {
            String lowerCase = empty.toLowerCase();
            l84.d(lowerCase, "(this as java.lang.String).toLowerCase()");
            return lowerCase;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    private final boolean isDeepLinkInternal(Intent intent) {
        return isDeepLinkInternal(intent != null ? intent.getData() : null);
    }

    public static final <T> boolean isInContains(T t, T... tArr) {
        l84.e(tArr, "values");
        if (t == null) {
            return false;
        }
        for (T a : tArr) {
            if (l84.a(t, a)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean isNullOrEmpty(String str) {
        if (str != null) {
            return str.length() == 0;
        }
    }

    public static final String now(String str) {
        l84.e(str, "format");
        String format2 = new SimpleDateFormat(str, Locale.getDefault()).format(new Date());
        l84.d(format2, "sdf.format(Date())");
        return format2;
    }

    public static final float percent(float f, float f2) {
        return (f / f2) * ((float) 100);
    }

    public static final String removeAtString(String str, int i) {
        if (str == null) {
            str = "";
        }
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        int i3 = 0;
        while (i2 < str.length()) {
            char charAt = str.charAt(i2);
            int i4 = i3 + 1;
            if (i != i3) {
                sb.append(charAt);
            }
            i2++;
            i3 = i4;
        }
        String sb2 = sb.toString();
        l84.d(sb2, "result.toString()");
        return sb2;
    }

    public static final float sp2Px(float f) {
        Resources resources = BaseApplication.f.getContext().getResources();
        l84.d(resources, "BaseApplication.context.resources");
        return TypedValue.applyDimension(2, f, resources.getDisplayMetrics());
    }

    public static final String splitAndFormat(String str, List<Integer> list) {
        String str2;
        l84.e(list, "list");
        StringBuilder sb = new StringBuilder();
        for (Number intValue : list) {
            int intValue2 = intValue.intValue();
            if (str != null) {
                str2 = str.substring(0, intValue2);
                l84.d(str2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            } else {
                str2 = null;
            }
            if (str != null) {
                str = str.substring(intValue2);
                l84.d(str, "(this as java.lang.String).substring(startIndex)");
            } else {
                str = null;
            }
            sb.append(str2);
            sb.append(".");
        }
        String sb2 = sb.toString();
        l84.d(sb2, "sb.toString()");
        String substring = sb2.substring(0, sb2.length() - 1);
        l84.d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public static final String toAmountLong(String str) {
        try {
            if (isNullOrEmpty(str)) {
                return "";
            }
            Utils utils = INSTANCE;
            return utils.toLongFormat(utils.toDecimal(str).doubleValue());
        } catch (Throwable unused) {
            return "Exp";
        }
    }

    public static final String toAmountLongCode(String str, String str2) {
        return qu.H(new Object[]{toAmountLong(str), str2}, 2, "%s %s", "java.lang.String.format(format, *args)");
    }

    public static final String toAmountLongSymbol(String str, String str2) {
        String currencySymbol = INSTANCE.getCurrencySymbol(str2);
        if (isNullOrEmpty(currencySymbol)) {
            return toAmountLong(str);
        }
        return qu.H(new Object[]{toAmountLong(str), currencySymbol}, 2, "%s %s", "java.lang.String.format(format, *args)");
    }

    public static final String toCurrencyPrecition(String str) {
        double amountDouble = INSTANCE.toAmountDouble(str);
        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
        decimalFormat.setDecimalSeparatorAlwaysShown(true);
        decimalFormat.setMinimumFractionDigits(2);
        decimalFormat.setMaximumFractionDigits(2);
        String format2 = decimalFormat.format(amountDouble);
        l84.d(format2, "df.format(xx)");
        return format2;
    }

    public static final float toFloat(String str) {
        l84.e(str, "str");
        try {
            return Float.parseFloat(str);
        } catch (Exception unused) {
            return BitmapDescriptorFactory.HUE_RED;
        }
    }

    public static final float toFloatFromAmount(String str) {
        l84.e(str, "amt");
        return toFloat(e65.y(str, ",", "", false, 4));
    }

    public static final String toInteger(String str) {
        if (isNullOrEmpty(str)) {
            return "";
        }
        double amountDouble = INSTANCE.toAmountDouble(str);
        int i = (int) amountDouble;
        if (amountDouble > ((double) i)) {
            return String.valueOf(amountDouble);
        }
        return String.valueOf(i);
    }

    public static final List<Integer> toList(String str) {
        l84.e(str, "value");
        l84.e(",", "literal");
        return arrayListOf(new z55(",", a65.LITERAL).c(str, 0), new Utils$toList$list$1());
    }

    public static final String toNumFromAmount(String str) {
        l84.e(str, "amt");
        return e65.y(str, ",", "", false, 4);
    }

    public static final List<String> toStrList(String str, String str2) {
        l84.e(str, "str");
        l84.e(str2, "seprator");
        l84.e(str2, "literal");
        return new z55(str2, a65.LITERAL).c(str, 0);
    }

    public final Bitmap base64ToBitmap(String str) {
        l84.e(str, "base");
        try {
            byte[] decode = Base64.decode(str, 0);
            return BitmapFactory.decodeByteArray(decode, 0, decode.length);
        } catch (Exception unused) {
            return null;
        }
    }

    public final double calculateMotrgage(double d, double d2, double d3) {
        double d4;
        double d5 = d2 / ((double) 100);
        double d6 = (double) 1;
        try {
            d4 = d / ((d6 - (d6 / Math.pow(d6 + d5, d3))) / d5);
        } catch (Exception unused) {
            d4 = 0.0d;
        }
        if (Double.isNaN(d4)) {
            d4 = 0.0d;
        }
        if (Double.isInfinite(d4)) {
            return 0.0d;
        }
        return d4;
    }

    public final void callDeepLink(Context context, Uri uri) {
        l84.e(context, "context");
        String typeFromDeepLink = getTypeFromDeepLink(uri);
        if (typeFromDeepLink != null) {
            int hashCode = typeFromDeepLink.hashCode();
            if (hashCode != -1882184458) {
                if (hashCode == -786681338 && typeFromDeepLink.equals(DEEPLINK_PAYMENT)) {
                    Intent intent = new Intent(context, DeepActivity.class);
                    intent.putExtra(PASS_DATA, "PAYMENT");
                    intent.putExtra(PASS_DEEP, String.valueOf(uri));
                    context.startActivity(intent);
                }
            } else if (typeFromDeepLink.equals(DEEPLINK_CREDITCARD)) {
                context.startActivity(new Intent(context, CreditPaymentActivity.class));
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean checkCardExpired(java.lang.String r9) {
        /*
            r8 = this;
            r0 = 1
            java.util.Calendar r1 = java.util.Calendar.getInstance()     // Catch:{ Exception -> 0x006c }
            r2 = 6
            java.lang.String r3 = "-"
            r4 = 0
            r5 = 0
            if (r9 == 0) goto L_0x001b
            java.lang.String[] r6 = new java.lang.String[]{r3}     // Catch:{ Exception -> 0x006c }
            java.util.List r6 = defpackage.e65.C(r9, r6, r5, r5, r2)     // Catch:{ Exception -> 0x006c }
            java.lang.Object r6 = r6.get(r5)     // Catch:{ Exception -> 0x006c }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x006c }
            goto L_0x001c
        L_0x001b:
            r6 = r4
        L_0x001c:
            java.lang.String r6 = r8.toEmpty((java.lang.String) r6)     // Catch:{ Exception -> 0x006c }
            int r6 = r8.toInt(r6)     // Catch:{ Exception -> 0x006c }
            int r6 = r6 - r0
            if (r9 == 0) goto L_0x0036
            java.lang.String[] r3 = new java.lang.String[]{r3}     // Catch:{ Exception -> 0x006c }
            java.util.List r9 = defpackage.e65.C(r9, r3, r5, r5, r2)     // Catch:{ Exception -> 0x006c }
            java.lang.Object r9 = r9.get(r0)     // Catch:{ Exception -> 0x006c }
            r4 = r9
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x006c }
        L_0x0036:
            java.lang.String r9 = r8.toEmpty((java.lang.String) r4)     // Catch:{ Exception -> 0x006c }
            int r9 = r8.toInt(r9)     // Catch:{ Exception -> 0x006c }
            r1.set(r0, r9)     // Catch:{ Exception -> 0x006c }
            r9 = 2
            r1.set(r9, r6)     // Catch:{ Exception -> 0x006c }
            r9 = 5
            r1.set(r9, r0)     // Catch:{ Exception -> 0x006c }
            int r2 = r1.getActualMaximum(r9)     // Catch:{ Exception -> 0x006c }
            r1.set(r9, r2)     // Catch:{ Exception -> 0x006c }
            java.util.Calendar r9 = java.util.Calendar.getInstance()     // Catch:{ Exception -> 0x006c }
            java.lang.String r2 = "Calendar.getInstance()"
            defpackage.l84.d(r9, r2)     // Catch:{ Exception -> 0x006c }
            long r2 = r8.getFormattedDateToLong(r9)     // Catch:{ Exception -> 0x006c }
            java.lang.String r9 = "cardDate"
            defpackage.l84.d(r1, r9)     // Catch:{ Exception -> 0x006c }
            long r6 = r8.getFormattedDateToLong(r1)     // Catch:{ Exception -> 0x006c }
            int r9 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r9 <= 0) goto L_0x006b
            goto L_0x006c
        L_0x006b:
            r0 = 0
        L_0x006c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.smartbank.tools.Utils.checkCardExpired(java.lang.String):boolean");
    }

    public final void copyToClipBoard(Context context, String str) {
        Object obj;
        String str2;
        l84.e(context, "ctx");
        l84.e(str, "text");
        Class cls = ClipboardManager.class;
        Object obj2 = e8.a;
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            obj = context.getSystemService(cls);
        } else {
            if (i >= 23) {
                str2 = context.getSystemServiceName(cls);
            } else {
                str2 = e8.a.a.get(cls);
            }
            obj = str2 != null ? context.getSystemService(str2) : null;
        }
        ClipboardManager clipboardManager = (ClipboardManager) obj;
        ClipData newPlainText = ClipData.newPlainText("label", str);
        if (clipboardManager != null) {
            clipboardManager.setPrimaryClip(newPlainText);
        }
    }

    public final int darkerColor(int i, float f) {
        return Color.argb(Color.alpha(i), (int) (((float) Color.red(i)) * f), (int) (((float) Color.green(i)) * f), (int) (((float) Color.blue(i)) * f));
    }

    public final int dip2px(Context context, float f) {
        l84.e(context, "context");
        Resources resources = context.getResources();
        l84.d(resources, "context.resources");
        return (int) ((f * resources.getDisplayMetrics().density) + 0.5f);
    }

    public final int dpToPx(Context context, float f) {
        l84.e(context, "context");
        Resources resources = context.getResources();
        l84.d(resources, "context.resources");
        return (int) (f * resources.getDisplayMetrics().density);
    }

    public final Bitmap drawableToBitmap(Context context, int i) {
        l84.e(context, "context");
        try {
            return BitmapFactory.decodeResource(context.getResources(), i);
        } catch (Exception unused) {
            return null;
        }
    }

    public final void driveDeepLink(Uri uri, Context context) {
        l84.e(context, "context");
        String typeFromDeepLink = getTypeFromDeepLink(uri);
        if (typeFromDeepLink != null) {
            int hashCode = typeFromDeepLink.hashCode();
            if (hashCode != -1882184458) {
                if (hashCode == -786681338 && typeFromDeepLink.equals(DEEPLINK_PAYMENT)) {
                    Intent intent = new Intent(context, DeepActivity.class);
                    intent.setFlags(268468224);
                    intent.putExtra(PASS_DATA, "DEEP_INFO");
                    intent.putExtra(PASS_DEEP, String.valueOf(uri));
                    context.startActivity(intent);
                    return;
                }
            } else if (typeFromDeepLink.equals(DEEPLINK_CREDITCARD)) {
                BaseApplication.f.deepToLogin(String.valueOf(uri), context);
                return;
            }
        }
        BaseApplication.f.goToLogin(context);
    }

    public final long floatToInt(Float f) {
        l84.e(f, "vl");
        return f.longValue();
    }

    public final String formattedSingle(Calendar calendar) {
        if (calendar == null) {
            return "";
        }
        String format2 = formatSingle.format(calendar.getTime());
        l84.d(format2, "formatSingle.format(cal.time)");
        return format2;
    }

    public final String getCCDErrorMessage() {
        Context context = BaseApplication.f.getContext();
        if (qu.Y(BaseApplication.f, "context", "Language.Helper.Selected.Language", "mn", "en")) {
            String string = context.getString(R.string.connection_error_ccd_en);
            l84.d(string, "ctx.getString(R.string.connection_error_ccd_en)");
            return string;
        }
        String string2 = context.getString(R.string.connection_error_ccd_mn);
        l84.d(string2, "ctx.getString(R.string.connection_error_ccd_mn)");
        return string2;
    }

    public final String getCONTRACT_ACM() {
        return qu.Y(BaseApplication.f, "context", "Language.Helper.Selected.Language", "mn", "en") ? "https://m.egolomt.mn/social/contract_tua_eng.html" : "https://m.egolomt.mn/social/contract_tua_mng.html";
    }

    public final String getCONTRACT_CARD_BLUE() {
        return qu.Y(BaseApplication.f, "context", "Language.Helper.Selected.Language", "mn", "en") ? "https://m.egolomt.mn/social/prod_blue_en.html" : "https://m.egolomt.mn/social/prod_blue_mn.html";
    }

    public final String getCONTRACT_CARD_CARBON() {
        return qu.Y(BaseApplication.f, "context", "Language.Helper.Selected.Language", "mn", "en") ? "https://m.egolomt.mn/social/prod_CARBON_en.html" : "https://m.egolomt.mn/social/prod_CARBON_mn.html";
    }

    public final String getCONTRACT_CARD_EXTEND() {
        return qu.Y(BaseApplication.f, "context", "Language.Helper.Selected.Language", "mn", "en") ? "https://m.egolomt.mn/social/contract_digital_loan_eng.html" : "https://m.egolomt.mn/social/contract_digital_loan_mng.html";
    }

    public final String getCONTRACT_CARD_GOLD() {
        return qu.Y(BaseApplication.f, "context", "Language.Helper.Selected.Language", "mn", "en") ? "https://m.egolomt.mn/social/prod_GOLD_en.html" : "https://m.egolomt.mn/social/prod_GOLD_mn.html";
    }

    public final String getCONTRACT_CARD_GREEN() {
        return qu.Y(BaseApplication.f, "context", "Language.Helper.Selected.Language", "mn", "en") ? "https://m.egolomt.mn/social/prod_green_en.html" : "https://m.egolomt.mn/social/prod_green_mn.html";
    }

    public final String getCONTRACT_CARD_OYU() {
        return qu.Y(BaseApplication.f, "context", "Language.Helper.Selected.Language", "mn", "en") ? "https://m.egolomt.mn/social/prod_OYU_en.html" : "https://m.egolomt.mn/social/prod_OYU_mn.html";
    }

    public final String getCONTRACT_CARD_PINK() {
        return qu.Y(BaseApplication.f, "context", "Language.Helper.Selected.Language", "mn", "en") ? "https://m.egolomt.mn/social/prod_pink_en.html" : "https://m.egolomt.mn/social/prod_pink_mn.html";
    }

    public final String getCONTRACT_CARD_PURPLE() {
        return qu.Y(BaseApplication.f, "context", "Language.Helper.Selected.Language", "mn", "en") ? "https://m.egolomt.mn/social/prod_purple_en.html" : "https://m.egolomt.mn/social/prod_purple_mn.html";
    }

    public final String getCONTRACT_CARD_SUVD() {
        return qu.Y(BaseApplication.f, "context", "Language.Helper.Selected.Language", "mn", "en") ? "https://m.egolomt.mn/social/prod_SUVD_en.html" : "https://m.egolomt.mn/social/prod_SUVD_mn.html";
    }

    public final String getCONTRACT_CLOAN() {
        return qu.Y(BaseApplication.f, "context", "Language.Helper.Selected.Language", "mn", "en") ? "https://m.egolomt.mn/social/contract_sbl_eng.html" : "https://m.egolomt.mn/social/contract_sbl_mng.html";
    }

    public final String getCONTRACT_CREDIT_CARD() {
        return qu.Y(BaseApplication.f, "context", "Language.Helper.Selected.Language", "mn", "en") ? "https://m.egolomt.mn/social/contract_creditcard_eng.html" : "https://m.egolomt.mn/social/contract_creditcard_mng.html";
    }

    public final String getCONTRACT_DEMAND() {
        return qu.Y(BaseApplication.f, "context", "Language.Helper.Selected.Language", "mn", "en") ? "https://m.egolomt.mn/social/contract_sba_eng.html" : "https://m.egolomt.mn/social/contract_sba_mng.html";
    }

    public final String getCONTRACT_DEPOSIT() {
        return qu.Y(BaseApplication.f, "context", "Language.Helper.Selected.Language", "mn", "en") ? "https://m.egolomt.mn/social/contract_tua_eng.html" : "https://m.egolomt.mn/social/contract_tua_mng.html";
    }

    public final String getCONTRACT_DLOAN() {
        return qu.Y(BaseApplication.f, "context", "Language.Helper.Selected.Language", "mn", "en") ? "https://m.egolomt.mn/social/contract_digital_loan_eng.html" : "https://m.egolomt.mn/social/contract_digital_loan_mng.html";
    }

    public final String getCONTRACT_OPEN_ACCOUNT() {
        return qu.Y(BaseApplication.f, "context", "Language.Helper.Selected.Language", "mn", "en") ? "https://m.egolomt.mn/social/contract_opr_eng.html" : "https://m.egolomt.mn/social/contract_opr_mng.html";
    }

    public final String getCONTRACT_STANDING_ORDER() {
        return qu.Y(BaseApplication.f, "context", "Language.Helper.Selected.Language", "mn", "en") ? "https://m.egolomt.mn/social/contract_standingorder_eng.html" : "https://m.egolomt.mn/social/contract_standingorder_mng.html";
    }

    public final Calendar getCalendar(String str) {
        Calendar instance = Calendar.getInstance();
        if (str == null) {
            return null;
        }
        try {
            Date parse = format.parse(str);
            if (parse == null) {
                return null;
            }
            l84.d(instance, "calendar");
            instance.setTime(parse);
            return instance;
        } catch (ParseException unused) {
            return null;
        }
    }

    public final int getCardHeight(int i) {
        return (int) ((((double) i) / 1.59d) + ((double) 1));
    }

    public final ru3 getCardType(String str) {
        String empty = toEmpty(str);
        HashMap<String, ru3> hashMap = cardTypes;
        if (hashMap.size() <= 0) {
            ru3 ru3 = ru3.AMEX_GOLD;
            hashMap.put("3000", ru3);
            hashMap.put("3001", ru3);
            hashMap.put("3004", ru3);
            hashMap.put("3005", ru3);
            hashMap.put("3010", ru3);
            hashMap.put("3011", ru3);
            hashMap.put("3014", ru3);
            hashMap.put("3015", ru3);
            ru3 ru32 = ru3.AMEX_GREEN;
            hashMap.put("3002", ru32);
            hashMap.put("3003", ru32);
            hashMap.put("3006", ru32);
            hashMap.put("3007", ru32);
            hashMap.put("3012", ru32);
            hashMap.put("3013", ru32);
            hashMap.put("3016", ru32);
            hashMap.put("3017", ru32);
            ru3 ru33 = ru3.AMEX_BLUE;
            hashMap.put("3100", ru33);
            hashMap.put("3110", ru33);
            ru3 ru34 = ru3.ZES_VISA;
            hashMap.put("4550", ru34);
            hashMap.put("4560", ru34);
            ru3 ru35 = ru3.BUSINESS_VISA;
            hashMap.put("4570", ru35);
            hashMap.put("4575", ru35);
            hashMap.put("4580", ru35);
            hashMap.put("4590", ru35);
            ru3 ru36 = ru3.MASTER_GOLD;
            hashMap.put("5002", ru36);
            hashMap.put("5004", ru36);
            hashMap.put("5009", ru36);
            hashMap.put("5015", ru36);
            hashMap.put("5018", ru36);
            hashMap.put("5187", ru36);
            hashMap.put("5197", ru36);
            ru3 ru37 = ru3.MASTER_GOLD_CREDIT;
            hashMap.put("5008", ru37);
            hashMap.put("5010", ru37);
            hashMap.put("5016", ru37);
            hashMap.put("5023", ru37);
            hashMap.put("5029", ru37);
            hashMap.put("5610", ru37);
            hashMap.put("5611", ru37);
            hashMap.put("5650", ru37);
            hashMap.put("5651", ru37);
            hashMap.put("5652", ru37);
            hashMap.put("5653", ru37);
            hashMap.put("6001", ru37);
            hashMap.put("6003", ru37);
            hashMap.put("6006", ru37);
            ru3 ru38 = ru3.GAN_UP;
            hashMap.put("6007", ru38);
            hashMap.put("6008", ru38);
            hashMap.put("6021", ru38);
            hashMap.put("6022", ru38);
            ru3 ru39 = ru3.OYU_UP;
            hashMap.put("6023", ru39);
            hashMap.put("6024", ru39);
            hashMap.put("6025", ru39);
            hashMap.put("6026", ru3.SUVD_UP);
            hashMap.put("6027", ru3.CARBON_UP);
            ru3 ru310 = ru3.OYU_MASTER;
            hashMap.put("5100", ru310);
            hashMap.put("5152", ru310);
            hashMap.put("5153", ru310);
            ru3 ru311 = ru3.SUVD_MASTER;
            hashMap.put("5150", ru311);
            hashMap.put("5151", ru311);
            ru3 ru312 = ru3.CARBON_MASTER;
            hashMap.put("5154", ru312);
            hashMap.put("5155", ru312);
            hashMap.put("9003", ru3.OYU_T);
            hashMap.put("9012", ru3.CARBON_T);
            hashMap.put("9011", ru3.SUVD_T);
            hashMap.put("4540", ru3.PLATINUM);
            ru3 ru313 = ru3.PREMIERE;
            hashMap.put("4900", ru313);
            hashMap.put("4901", ru313);
            ru3 ru314 = ru3.OYU_VISA;
            hashMap.put("4211", ru314);
            hashMap.put("4218", ru314);
            hashMap.put("4214", ru314);
            hashMap.put("4401", ru314);
            hashMap.put("4402", ru314);
            ru3 ru315 = ru3.CARBON_VISA;
            hashMap.put("4217", ru315);
            hashMap.put("4223", ru315);
            ru3 ru316 = ru3.SUVD_VISA;
            hashMap.put("4221", ru316);
            hashMap.put("4222", ru316);
            ru3 ru317 = ru3.PURPLE;
            hashMap.put("5520", ru317);
            hashMap.put("5522", ru317);
            hashMap.put("5524", ru317);
            ru3 ru318 = ru3.GREEN;
            hashMap.put("5521", ru318);
            hashMap.put("5523", ru318);
            hashMap.put("5525", ru318);
            ru3 ru319 = ru3.BLUE;
            hashMap.put("5526", ru319);
            hashMap.put("5527", ru319);
            hashMap.put("5528", ru319);
            ru3 ru320 = ru3.PINK;
            hashMap.put("5529", ru320);
            hashMap.put("5530", ru320);
            hashMap.put("5531", ru320);
        }
        ru3 ru321 = hashMap.get(empty);
        return ru321 != null ? ru321 : ru3.OTHER;
    }

    public final int getCardWidth(Context context, float f) {
        l84.e(context, "context");
        int screenWidth = getScreenWidth(context, f);
        if (screenWidth == 0) {
            return 1080;
        }
        return screenWidth;
    }

    public final int getColorByName(Context context, String str, String str2) {
        l84.e(context, "ctx");
        l84.e(str, "colorName");
        l84.e(str2, "defaultColor");
        int identifier = context.getResources().getIdentifier(str, "color", context.getPackageName());
        if (identifier != 0) {
            return identifier;
        }
        return context.getResources().getIdentifier(str2, "color", context.getPackageName());
    }

    public final int getComponentColor(Context context) {
        l84.e(context, "context");
        return getAttributeColor(context, R.attr.default_component_color, context.getTheme());
    }

    public final String getCurrencySymbol(String str) {
        if (e65.f(str, MNT, true)) {
            return "₮";
        }
        if (e65.f(str, USD, true)) {
            return "$";
        }
        if (e65.f(str, CNY, true) || e65.f(str, JPY, true)) {
            return "￥";
        }
        if (e65.f(str, EUR, true)) {
            return "€";
        }
        if (e65.f(str, GBP, true)) {
            return "￡";
        }
        if (e65.f(str, CHF, true)) {
            return CHF;
        }
        if (e65.f(str, RUB, true)) {
            return "₽";
        }
        if (e65.f(str, KRW, true)) {
            return "₩";
        }
        if (e65.f(str, AUD, true)) {
            return "A$";
        }
        if (e65.f(str, HKD, true)) {
            return "H$";
        }
        if (e65.f(str, SEK, true)) {
            return "kr";
        }
        if (e65.f(str, SGD, true)) {
            return "S$";
        }
        return e65.f(str, CAD, true) ? "C$" : "";
    }

    public final int getDefaultBodyBackgroundPrimaryColor(Context context, Resources.Theme theme) {
        l84.e(context, "context");
        return getAttributeColor(context, R.attr.default_body_background_primary_color, theme);
    }

    @SuppressLint({"HardwareIds"})
    public final String getDeviceId(Context context) {
        l84.e(context, "ctx");
        SharedPreferences sharedPreferences = SharedPreferences.B;
        l84.e("device_id_xxx_yyy_zzz", "nm");
        String string = SharedPreferences.a.getString(sharedPreferences.a("device_id_xxx_yyy_zzz"), "");
        if (isNullOrEmpty(string)) {
            string = Settings.Secure.getString(context.getContentResolver(), "android_id");
            l84.d(string, "`val`");
            sharedPreferences.n("device_id_xxx_yyy_zzz", string);
        }
        l84.c(string);
        return string;
    }

    public final int getDigitalPrimaryButtonColor(Context context) {
        l84.e(context, "context");
        return e8.b(context, R.color.colorDigitalPrimary);
    }

    public final Typeface getDigitalTextBoldFont(Context context) {
        l84.e(context, "context");
        return m8.a(context, R.font.magistral_bold);
    }

    public final int getDigitalTextPrimaryColor(Context context) {
        l84.e(context, "context");
        return e8.b(context, R.color.colorDigitalFontPrimary);
    }

    public final Typeface getDigitalTextRegularFont(Context context) {
        l84.e(context, "context");
        try {
            return m8.a(context, R.font.magistral_regular);
        } catch (Exception unused) {
            return null;
        }
    }

    public final int getDigitalTextSecondaryColor(Context context) {
        l84.e(context, "context");
        return e8.b(context, R.color.colorDigitalFontSecondary);
    }

    public final LinearLayoutManager getDisabledScroll(Context context) {
        l84.e(context, "ctx");
        return new Utils$getDisabledScroll$1(context, context);
    }

    public final Drawable getDrawableSelector(Context context) {
        l84.e(context, "context");
        Object obj = e8.a;
        return context.getDrawable(R.drawable.selector_gradient);
    }

    public final String getErrorMessage() {
        Context context = BaseApplication.f.getContext();
        if (qu.Y(BaseApplication.f, "context", "Language.Helper.Selected.Language", "mn", "en")) {
            String string = context.getString(R.string.connection_error_en);
            l84.d(string, "ctx.getString(R.string.connection_error_en)");
            return string;
        }
        String string2 = context.getString(R.string.connection_error_mn);
        l84.d(string2, "ctx.getString(R.string.connection_error_mn)");
        return string2;
    }

    public final ConnectException getException() {
        return new ConnectException(getErrorMessage());
    }

    public final String getFinancesUrl() {
        int i = ov2.a;
        l84.d(Boolean.FALSE, "BuildConfig.isDebug");
        return "https://pfm.golomtbank.com:8443/smartapi/pfm/v1";
    }

    public final SimpleDateFormat getFormat() {
        return format;
    }

    public final SimpleDateFormat getFormatInt() {
        return formatInt;
    }

    public final SimpleDateFormat getFormatSingle() {
        return formatSingle;
    }

    public final String getFormattedBalance(String str) {
        return toAmountCurrency(getFormattedBalanceDecimal(str));
    }

    public final String getFormattedBalanceDecimal(String str) {
        List<String> list;
        if (isNullOrEmpty(str)) {
            return "";
        }
        String str2 = null;
        if (str != null) {
            String quote = Pattern.quote("|");
            l84.d(quote, "Pattern.quote(\"|\")");
            list = new z55(quote).c(str, 0);
        } else {
            list = null;
        }
        if (list != null && list.size() > 1) {
            return toAmountDecimal(list.get(1));
        }
        if (list != null) {
            str2 = list.get(0);
        }
        if (str2 != null) {
            return str2;
        }
        return "";
    }

    public final double getFormattedBalanceDouble(String str) {
        return toAmountDouble(getFormattedBalanceDecimal(str));
    }

    public final String getFormattedBalanceWithCurrencySymbol(String str) {
        List<String> list;
        if (isNullOrEmpty(str)) {
            return "";
        }
        String str2 = null;
        if (str != null) {
            String quote = Pattern.quote("|");
            l84.d(quote, "Pattern.quote(\"|\")");
            list = new z55(quote).c(str, 0);
        } else {
            list = null;
        }
        if (list == null || list.size() <= 1) {
            if (list != null) {
                str2 = list.get(0);
            }
            if (str2 != null) {
                return str2;
            }
            return "";
        }
        return qu.H(new Object[]{toAmountCurrency(list.get(1)), getCurrencySymbol(list.get(0))}, 2, "%s %s", "java.lang.String.format(format, *args)");
    }

    public final String getFormattedDate(Calendar calendar) {
        if (calendar == null) {
            return "";
        }
        String format2 = format.format(calendar.getTime());
        l84.d(format2, "format.format(cal.time)");
        return format2;
    }

    public final long getFormattedDateToLong(Calendar calendar) {
        l84.e(calendar, "cal");
        String format2 = formatInt.format(calendar.getTime());
        l84.d(format2, "formatInt.format(cal.time)");
        return toLong(format2);
    }

    public final String getINFO_SAVINGS_ACM() {
        return qu.Y(BaseApplication.f, "context", "Language.Helper.Selected.Language", "mn", "en") ? "https://m.egolomt.mn/social/prod_savingsdeposit_eng.html" : "https://m.egolomt.mn/social/prod_savingsdeposit_mng.html";
    }

    public final String getINFO_SAVINGS_DEMAND() {
        return qu.Y(BaseApplication.f, "context", "Language.Helper.Selected.Language", "mn", "en") ? "https://m.egolomt.mn/social/prod_demanddeposit_eng.html" : "https://m.egolomt.mn/social/prod_demanddeposit_mng.html";
    }

    public final String getINFO_SAVINGS_DEP() {
        return qu.Y(BaseApplication.f, "context", "Language.Helper.Selected.Language", "mn", "en") ? "https://m.egolomt.mn/social/prod_termdeposit_eng.html" : "https://m.egolomt.mn/social/prod_termdeposit_mng.html";
    }

    public final int getImageByName(Context context, String str, String str2) {
        l84.e(context, "ctx");
        l84.e(str, "imageName");
        l84.e(str2, "defaultImage");
        int identifier = context.getResources().getIdentifier(str, "drawable", context.getPackageName());
        return identifier != 0 ? identifier : context.getResources().getIdentifier(str2, "drawable", context.getPackageName());
    }

    public final String getLINK_SECURITY() {
        return qu.Y(BaseApplication.f, "context", "Language.Helper.Selected.Language", "mn", "en") ? "https://egolomt.mn/security/en" : "https://egolomt.mn/security/mn";
    }

    public final String getLocationPublicUrl() {
        return "https://e.golomtbank.com/api/location";
    }

    public final String getLogoutMessage() {
        Context context = BaseApplication.f.getContext();
        if (qu.Y(BaseApplication.f, "context", "Language.Helper.Selected.Language", "mn", "en")) {
            String string = context.getString(R.string.connection_error_session_timed_out_en);
            l84.d(string, "ctx.getString(R.string.c…ror_session_timed_out_en)");
            return string;
        }
        String string2 = context.getString(R.string.connection_error_session_timed_out_mn);
        l84.d(string2, "ctx.getString(R.string.c…ror_session_timed_out_mn)");
        return string2;
    }

    public final String getMonth(Context context, int i) {
        l84.e(context, "context");
        if (i > 11) {
            i -= (i / 12) * 12;
        } else if (i < 0) {
            i = (((i * -1) % 11) - 12) * -1;
        }
        l84.e(context, "context");
        String string = qg.a(context).getString("Language.Helper.Selected.Language", "mn");
        if (string == null) {
            return "";
        }
        int hashCode = string.hashCode();
        if (hashCode != 3241) {
            if (hashCode != 3489 || !string.equals("mn")) {
                return "";
            }
            String string2 = context.getString(R.string.formatted_month, new Object[]{Integer.valueOf(i + 1)});
            l84.d(string2, "context.getString(R.stri…tted_month, tmpMonth + 1)");
            Locale locale = Locale.US;
            l84.d(locale, "Locale.US");
            String upperCase = string2.toUpperCase(locale);
            l84.d(upperCase, "(this as java.lang.String).toUpperCase(locale)");
            return upperCase;
        } else if (!string.equals("en") || i < 0 || 11 < i) {
            return "";
        } else {
            String str = new DateFormatSymbols(Locale.US).getMonths()[i];
            l84.d(str, "DateFormatSymbols(Locale.US).months[tmpMonth]");
            return str;
        }
    }

    public final String getPublicKey() {
        SecureRandom secureRandom = new SecureRandom();
        String str = "";
        for (int i = 0; i <= 9; i++) {
            int nextInt = secureRandom.nextInt(26);
            StringBuilder K = qu.K(str);
            K.append((char) nextInt);
            str = K.toString();
        }
        Charset charset = w55.a;
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        byte[] bytes = str.getBytes(charset);
        l84.d(bytes, "(this as java.lang.String).getBytes(charset)");
        String encodeToString = Base64.encodeToString(bytes, 2);
        l84.d(encodeToString, "Base64.encodeToString(ra…eArray(), Base64.NO_WRAP)");
        return encodeToString;
    }

    public final String getPublicUrl() {
        return "https://egolomt.mn/corp";
    }

    public final RoundingMode getROUND_MODE() {
        return ROUND_MODE;
    }

    public final int getScreenHeight(Context context) {
        l84.e(context, "context");
        return getScreenHeight(context, 1.0f);
    }

    public final int getScreenWidth(Context context) {
        l84.e(context, "context");
        return getScreenWidth(context, 1.0f);
    }

    public final int getStringByName(Context context, String str, String str2) {
        l84.e(context, "ctx");
        l84.e(str, "stringName");
        l84.e(str2, "defaultString");
        int identifier = context.getResources().getIdentifier(str, "string", context.getPackageName());
        if (identifier != 0) {
            return identifier;
        }
        return context.getResources().getIdentifier(str2, "string", context.getPackageName());
    }

    public final String getSuccessAnimation() {
        return i21.Z1() ? LOTTIE_DIGITAL_SUCCESS : LOTTIE_SUCCESS;
    }

    public final String getTERM_CARD_DELIVERY() {
        return qu.Y(BaseApplication.f, "context", "Language.Helper.Selected.Language", "mn", "en") ? "https://m.egolomt.mn/social/card_delivery_en.html" : "https://m.egolomt.mn/social/card_delivery_mn.html";
    }

    public final int getTextErrorColor(Context context) {
        l84.e(context, "context");
        return getTextErrorColor(context, (Resources.Theme) null);
    }

    public final int getTextPrimaryColor(Context context) {
        l84.e(context, "context");
        return getTextPrimaryColor(context, (Resources.Theme) null);
    }

    public final int getTextSecondaryColor(Context context) {
        l84.e(context, "context");
        return getTextSecondaryColor(context, (Resources.Theme) null);
    }

    public final String getTokenFromDeepLink(String str) {
        return getTokenFromDeepLink(parseToUri(str));
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|9) */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0038, code lost:
        r6.startActivity(new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse("https://play.google.com/store/apps/details?id=" + "mn.egolomt.socialpay")));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0029 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void goToSocialPay(com.smartbank.base.BaseActivity r6) {
        /*
            r5 = this;
            java.lang.String r0 = "android.intent.action.VIEW"
            java.lang.String r1 = "mActivity"
            defpackage.l84.e(r6, r1)
            com.google.firebase.analytics.FirebaseAnalytics r1 = r6.z()
            java.lang.String r2 = "Шимтгэлгүй гүйлгээ (SocialPay)"
            r1.setCurrentScreen(r6, r2, r2)
            java.lang.String r1 = "mn.egolomt.socialpay"
            android.content.pm.PackageManager r2 = r6.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0029 }
            r3 = 1
            r2.getPackageInfo(r1, r3)     // Catch:{ NameNotFoundException -> 0x0029 }
            android.content.Intent r2 = new android.content.Intent     // Catch:{ NameNotFoundException -> 0x0029 }
            java.lang.String r3 = "socialpay-payment://"
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch:{ NameNotFoundException -> 0x0029 }
            r2.<init>(r0, r3)     // Catch:{ NameNotFoundException -> 0x0029 }
            r6.startActivity(r2)     // Catch:{ NameNotFoundException -> 0x0029 }
            goto L_0x0055
        L_0x0029:
            android.content.Intent r2 = new android.content.Intent     // Catch:{ ActivityNotFoundException -> 0x0038 }
            java.lang.String r3 = "market://details?id=mn.egolomt.socialpay"
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch:{ ActivityNotFoundException -> 0x0038 }
            r2.<init>(r0, r3)     // Catch:{ ActivityNotFoundException -> 0x0038 }
            r6.startActivity(r2)     // Catch:{ ActivityNotFoundException -> 0x0038 }
            goto L_0x0055
        L_0x0038:
            android.content.Intent r2 = new android.content.Intent
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "https://play.google.com/store/apps/details?id="
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            android.net.Uri r1 = android.net.Uri.parse(r1)
            r2.<init>(r0, r1)
            r6.startActivity(r2)
        L_0x0055:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.smartbank.tools.Utils.goToSocialPay(com.smartbank.base.BaseActivity):void");
    }

    public final Uri isDeepLink(Intent intent) {
        Uri data = intent != null ? intent.getData() : null;
        if (isDeepLinkInternal(intent)) {
            return data;
        }
        return null;
    }

    public final boolean isDeepScheme(Intent intent) {
        String str;
        if (intent != null) {
            try {
                intent.getData();
            } catch (Exception unused) {
                str = "";
            }
        }
        str = intent != null ? intent.getScheme() : null;
        return DEEPLINK_SCHEME.equals(str);
    }

    public final boolean isDigital() {
        return SharedPreferences.B.p() == 3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0021, code lost:
        if ((r0.length == 0) != false) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isNetworkConnected() {
        /*
            r3 = this;
            com.smartbank.base.BaseApplication$Companion r0 = com.smartbank.base.BaseApplication.f
            android.content.Context r0 = r0.getContext()
            java.lang.String r1 = "connectivity"
            java.lang.Object r0 = r0.getSystemService(r1)
            java.lang.String r1 = "null cannot be cast to non-null type android.net.ConnectivityManager"
            java.util.Objects.requireNonNull(r0, r1)
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0
            android.net.Network[] r0 = r0.getAllNetworks()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0023
            int r0 = r0.length
            if (r0 != 0) goto L_0x0020
            r0 = 1
            goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            if (r0 == 0) goto L_0x0024
        L_0x0023:
            r1 = 1
        L_0x0024:
            r0 = r1 ^ 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.smartbank.tools.Utils.isNetworkConnected():boolean");
    }

    public final boolean isNullOrEmpty(Integer num) {
        return num == null;
    }

    public final boolean isNullOrEmpty(Long l) {
        return l == null;
    }

    public final boolean isValidEmail(String str) {
        if (str == null) {
            str = "";
        }
        return Patterns.EMAIL_ADDRESS.matcher(str).matches();
    }

    public final int lighterColor(int i, float f) {
        float f2 = ((float) 1) - f;
        float f3 = (float) 255;
        return Color.argb(Color.alpha(i), (int) ((((((float) Color.red(i)) * f2) / f3) + f) * f3), (int) ((((((float) Color.green(i)) * f2) / f3) + f) * f3), (int) ((((((float) Color.blue(i)) * f2) / f3) + f) * f3));
    }

    public final Uri parseToUri(String str) {
        try {
            return Uri.parse(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public final void redirect(Context context, String str) {
        if (context != null) {
            if (!(str == null || str.length() == 0)) {
                try {
                    if (str == null) {
                        str = "";
                    }
                    context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                } catch (Exception unused) {
                }
            }
        }
    }

    public final String toAmountCurrency(String str) {
        BigDecimal scale = toDecimal(str).setScale(2, ROUND_MODE);
        l84.d(scale, "result.setScale(2, ROUND_MODE)");
        return toCurrency(scale.doubleValue());
    }

    public final String toAmountCurrencyCode(String str, String str2) {
        return qu.H(new Object[]{toAmountCurrency(str), str2}, 2, "%s %s", "java.lang.String.format(format, *args)");
    }

    public final String toAmountCurrencySymbol(String str, String str2) {
        String currencySymbol = getCurrencySymbol(str2);
        if (isNullOrEmpty(currencySymbol)) {
            return toAmountCurrency(str);
        }
        return qu.H(new Object[]{toAmountCurrency(str), currencySymbol}, 2, "%s %s", "java.lang.String.format(format, *args)");
    }

    public final String toAmountDecimal(String str) {
        BigDecimal scale = toDecimal(str).setScale(2, ROUND_MODE);
        l84.d(scale, "result.setScale(2, ROUND_MODE)");
        return toCurrencyDecimal(scale.doubleValue());
    }

    public final double toAmountDouble(String str) {
        return Double.parseDouble(toAmountDecimal(str));
    }

    public final float toAmountFloat(String str) {
        return Float.parseFloat(toAmountDecimal(str));
    }

    public final boolean toBoolean(Boolean bool) {
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final String toCurrency(double d) {
        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
        decimalFormat.setDecimalSeparatorAlwaysShown(true);
        decimalFormat.setMinimumFractionDigits(2);
        decimalFormat.setMaximumFractionDigits(2);
        String format2 = decimalFormat.format(d);
        l84.d(format2, "df.format(x)");
        return format2;
    }

    public final String toCurrencyDecimal(double d) {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        decimalFormat.setDecimalSeparatorAlwaysShown(true);
        decimalFormat.setMinimumFractionDigits(2);
        decimalFormat.setMaximumFractionDigits(2);
        String format2 = decimalFormat.format(d);
        l84.d(format2, "df.format(x)");
        return format2;
    }

    public final BigDecimal toDecimal(String str) {
        if (str == null || TextUtils.isEmpty(str)) {
            str = "0.00";
        }
        l84.e("[\\s,]", "pattern");
        Pattern compile = Pattern.compile("[\\s,]");
        l84.d(compile, "Pattern.compile(pattern)");
        l84.e(compile, "nativePattern");
        l84.e(str, "input");
        l84.e("", "replacement");
        String replaceAll = compile.matcher(str).replaceAll("");
        l84.d(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
        BigDecimal bigDecimal = BigDecimal.ZERO;
        try {
            bigDecimal = new BigDecimal(replaceAll);
        } catch (Exception unused) {
        }
        l84.d(bigDecimal, "result");
        return bigDecimal;
    }

    public final double toDouble(String str) {
        if (str == null || str.length() == 0) {
            return 0.0d;
        }
        try {
            return Double.parseDouble(e65.y(str, ",", "", false, 4));
        } catch (Exception unused) {
            return 0.0d;
        }
    }

    public final int toEmpty(Integer num) {
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final int toInt(String str) {
        l84.e(str, "str");
        try {
            return Integer.parseInt(str);
        } catch (Exception unused) {
            return 0;
        }
    }

    public final long toLong(String str) {
        l84.e(str, "str");
        try {
            return Long.parseLong(str);
        } catch (Exception unused) {
            return 0;
        }
    }

    public final String toLongFormat(double d) {
        String format2 = new DecimalFormat("#,###").format(d);
        l84.d(format2, "df.format(x)");
        return format2;
    }

    @SuppressLint({"SimpleDateFormat"})
    public final Calendar toMNDate(String str) {
        String str2;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        if (str != null) {
            try {
                str2 = str.substring(0, 10);
                l84.d(str2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            } catch (ParseException e) {
                e.printStackTrace();
                return null;
            }
        } else {
            str2 = null;
        }
        Date parse = simpleDateFormat.parse(str2);
        Calendar instance = Calendar.getInstance();
        l84.d(instance, "cal");
        instance.setTime(parse);
        return instance;
    }

    public final String toMNDateStr(String str) {
        Calendar mNDate = toMNDate(str);
        if (mNDate == null) {
            return "";
        }
        String format2 = format.format(mNDate.getTime());
        l84.d(format2, "format.format(cal.time)");
        return format2;
    }

    public final double toNum(String str) {
        l84.e(str, "vl");
        StringBuilder sb = new StringBuilder();
        char[] charArray = str.toCharArray();
        l84.d(charArray, "(this as java.lang.String).toCharArray()");
        for (char c : charArray) {
            if (Character.isDigit(c) || '.' == c) {
                sb.append(c);
            }
        }
        String sb2 = sb.toString();
        l84.d(sb2, "sb.toString()");
        return Double.parseDouble(sb2);
    }

    public static final int dip2px(float f) {
        Resources resources = BaseApplication.f.getContext().getResources();
        l84.d(resources, "BaseApplication.context.resources");
        return (int) ((f * resources.getDisplayMetrics().density) + 0.5f);
    }

    private final boolean isDeepLinkInternal(Uri uri) {
        String str;
        List D = b64.D(DEEPLINK_PAYMENT, DEEPLINK_CREDITCARD);
        String str2 = null;
        String str3 = "";
        if (uri != null) {
            try {
                str = uri.getScheme();
            } catch (Exception unused) {
                str = str3;
            }
        } else {
            str = null;
        }
        if (uri != null) {
            try {
                str2 = uri.getHost();
            } catch (Exception unused2) {
            }
        }
        String empty = toEmpty(str2);
        if (empty != null) {
            String lowerCase = empty.toLowerCase();
            l84.d(lowerCase, "(this as java.lang.String).toLowerCase()");
            str3 = lowerCase;
            return DEEPLINK_SCHEME.equals(str) && D.contains(str3);
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    public final int getCardWidth(Context context) {
        l84.e(context, "context");
        return getCardWidth(context, 0.8f);
    }

    public final int getScreenHeight(Context context, float f) {
        l84.e(context, "context");
        if (!(context instanceof Activity)) {
            return 0;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        WindowManager windowManager = ((Activity) context).getWindowManager();
        l84.d(windowManager, "context.windowManager");
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return (int) (((float) displayMetrics.heightPixels) * f);
    }

    public final int getScreenWidth(Context context, float f) {
        l84.e(context, "context");
        if (!(context instanceof Activity)) {
            return 0;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        WindowManager windowManager = ((Activity) context).getWindowManager();
        l84.d(windowManager, "context.windowManager");
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return (int) (((float) displayMetrics.widthPixels) * f);
    }

    public final int getTextErrorColor(Context context, Resources.Theme theme) {
        l84.e(context, "context");
        return getAttributeColor(context, R.attr.default_text_error_color, theme);
    }

    public final int getTextPrimaryColor(Context context, Resources.Theme theme) {
        l84.e(context, "context");
        return getAttributeColor(context, R.attr.default_text_primary_color, theme);
    }

    public final int getTextSecondaryColor(Context context, Resources.Theme theme) {
        l84.e(context, "context");
        return getAttributeColor(context, R.attr.default_text_secondary_color, theme);
    }

    public final boolean isNullOrEmpty(List<?> list) {
        return list == null || list.isEmpty();
    }

    public final long toEmpty(Long l) {
        if (l != null) {
            return l.longValue();
        }
        return 0;
    }

    public final String getTokenFromDeepLink(Uri uri) {
        String str;
        String str2;
        if (uri != null) {
            try {
                str2 = uri.getQueryParameter("token");
            } catch (Exception unused) {
                str = "";
            }
        } else {
            str2 = null;
        }
        str = toEmpty(str2);
        if (isDeepLinkInternal(uri) && !isNullOrEmpty(str)) {
            return str;
        }
        return "";
    }

    public final boolean isNullOrEmpty(Map<?, ?> map) {
        return map == null || map.isEmpty();
    }

    public final boolean toEmpty(Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final boolean isNullOrEmpty(JSONObject jSONObject) {
        return jSONObject == null || jSONObject.length() == 0;
    }

    public final String toAmountCurrency(Double d) {
        BigDecimal scale = toDecimal(String.valueOf(d)).setScale(2, ROUND_MODE);
        l84.d(scale, "result.setScale(2, ROUND_MODE)");
        return toCurrency(scale.doubleValue());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r1 = r1.toString();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String toEmpty(java.lang.CharSequence r1) {
        /*
            r0 = this;
            if (r1 == 0) goto L_0x0009
            java.lang.String r1 = r1.toString()
            if (r1 == 0) goto L_0x0009
            goto L_0x000b
        L_0x0009:
            java.lang.String r1 = ""
        L_0x000b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.smartbank.tools.Utils.toEmpty(java.lang.CharSequence):java.lang.String");
    }

    public final String toEmpty(String str) {
        if (isNullOrEmpty(str)) {
            str = "";
        }
        return String.valueOf(str);
    }

    public static final String splitAndFormat(String str, String str2, String str3, String... strArr) {
        l84.e(str2, "seprator");
        l84.e(str3, "format");
        l84.e(strArr, "defVal");
        boolean z = true;
        if (isNullOrEmpty(str)) {
            if (!(strArr.length == 0)) {
                return strArr[0];
            }
            return "";
        }
        String[] strArr2 = null;
        ArrayList arrayList = str != null ? new ArrayList(e65.C(str, new String[]{str2}, false, 0, 6)) : null;
        if (arrayList != null) {
            strArr2 = new String[arrayList.size()];
        }
        if (arrayList != null) {
            String[] strArr3 = (String[]) arrayList.toArray(strArr2);
        }
        if (strArr2 != null) {
            if (!(strArr2.length == 0)) {
                z = false;
            }
        }
        if (z) {
            return "";
        }
        l84.c(strArr2);
        String format2 = MessageFormat.format(str3, Arrays.copyOf(strArr2, strArr2.length));
        l84.d(format2, "MessageFormat.format(format, *arr!!)");
        return format2;
    }
}
