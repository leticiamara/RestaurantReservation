package com.leticia.restaurantreservation.presentation.mvpview;

import android.content.Context;

/**
 * Created by leticia on 12/10/17.
 */

public interface SplashMvpView extends IUserMvpView {
    Context getContext();

    void showMessage(String message);

    void goToLoginActivity();
}
