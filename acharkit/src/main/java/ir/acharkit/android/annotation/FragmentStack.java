package ir.acharkit.android.annotation;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import ir.acharkit.android.app.AbstractFragment;

/**
 * Author:  Alireza Tizfahm Fard
 * Date:    11/7/2017
 * Email:   alirezat775@gmail.com
 */


@IntDef({AbstractFragment.TYPE_REPLACE, AbstractFragment.TYPE_ADD})
@Retention(RetentionPolicy.SOURCE)
public @interface FragmentStack {
}