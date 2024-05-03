package com.smartbank.tools;

import android.view.animation.Animation;
import com.smartbank.component.GNumberPadView;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"com/smartbank/tools/AnimUtils$slideUp$1", "Landroid/view/animation/Animation$AnimationListener;", "Landroid/view/animation/Animation;", "animation", "Lu54;", "onAnimationStart", "(Landroid/view/animation/Animation;)V", "onAnimationEnd", "onAnimationRepeat", "app_release"}, k = 1, mv = {1, 4, 0})
/* compiled from: AnimUtils.kt */
public final class AnimUtils$slideUp$1 implements Animation.AnimationListener {
    public final /* synthetic */ GNumberPadView.AnimationListener $listener;

    public AnimUtils$slideUp$1(GNumberPadView.AnimationListener animationListener) {
        this.$listener = animationListener;
    }

    public void onAnimationEnd(Animation animation) {
        l84.e(animation, "animation");
        GNumberPadView.AnimationListener animationListener = this.$listener;
        if (animationListener != null) {
            animationListener.onEnd(true);
        }
    }

    public void onAnimationRepeat(Animation animation) {
        l84.e(animation, "animation");
    }

    public void onAnimationStart(Animation animation) {
        l84.e(animation, "animation");
        GNumberPadView.AnimationListener animationListener = this.$listener;
        if (animationListener != null) {
            animationListener.onStart(true);
        }
    }
}
