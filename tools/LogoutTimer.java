package com.smartbank.tools;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import com.smartbank.base.BaseApplication;
import com.smartbank.ui.login.LoginActivity;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import mn.egolomt.p000new.bank.R;

public enum LogoutTimer {
    INSTANCE;
    
    public AtomicBoolean b;
    public a e;

    public interface OnLogoutHandler {
        void forceLogout();
    }

    public class a extends Thread {
        public boolean b;
        public OnLogoutHandler e;
        public long f;

        public a(OnLogoutHandler onLogoutHandler) {
            this.f = 0;
            this.e = onLogoutHandler;
            this.b = true;
            this.f = System.currentTimeMillis();
        }

        public void run() {
            super.run();
            while (this.b) {
                try {
                    Thread.sleep(1000);
                    if (System.currentTimeMillis() - this.f >= 900000) {
                        Objects.requireNonNull(LogoutTimer.this);
                        String logoutMessage = Utils.INSTANCE.getLogoutMessage();
                        Context context = BaseApplication.b;
                        PendingIntent activity = PendingIntent.getActivity(context, 0, new Intent(context, LoginActivity.class), 134217728);
                        String string = context.getString(R.string.application_name);
                        Uri defaultUri = RingtoneManager.getDefaultUri(2);
                        y7 y7Var = new y7(context, "32533");
                        y7Var.f = activity;
                        y7Var.r.icon = R.mipmap.ic_launcher_round;
                        y7Var.e(string);
                        y7Var.d(logoutMessage);
                        y7Var.c(true);
                        y7Var.g(defaultUri);
                        x7 x7Var = new x7();
                        x7Var.b(logoutMessage);
                        y7Var.h(x7Var);
                        y7Var.i = 2;
                        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                        if (Build.VERSION.SDK_INT >= 26) {
                            NotificationChannel notificationChannel = new NotificationChannel("32533", string, 4);
                            notificationChannel.enableLights(true);
                            notificationChannel.setLightColor(-65536);
                            y7Var.p = "32533";
                            if (notificationManager != null) {
                                notificationManager.createNotificationChannel(notificationChannel);
                            }
                        }
                        Notification a = y7Var.a();
                        a.flags |= 16;
                        if (notificationManager != null) {
                            notificationManager.notify(394300, a);
                        }
                        LogoutTimer.this.b.set(false);
                        this.e.forceLogout();
                        interrupt();
                    }
                } catch (InterruptedException unused) {
                    this.b = false;
                    return;
                }
            }
        }
    }

    public boolean e() {
        return this.b.get();
    }
}
