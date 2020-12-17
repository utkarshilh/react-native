/**
* Copyright (c) Facebook, Inc. and its affiliates.
*
* This source code is licensed under the MIT license found in the
* LICENSE file in the root directory of this source tree.
*
* @generated by codegen project: GeneratePropsJavaDelegate.js
*/

package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.BaseViewManagerInterface;

public class AndroidDrawerLayoutManagerDelegate<T extends View, U extends BaseViewManagerInterface<T> & AndroidDrawerLayoutManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
  public AndroidDrawerLayoutManagerDelegate(U viewManager) {
    super(viewManager);
  }
  @Override
  public void setProperty(T view, String propName, @Nullable Object value) {
    switch (propName) {
      case "keyboardDismissMode":
        mViewManager.setKeyboardDismissMode(view, (String) value);
        break;
      case "drawerBackgroundColor":
        mViewManager.setDrawerBackgroundColor(view, ColorPropConverter.getColor(value, view.getContext()));
        break;
      case "drawerPosition":
        mViewManager.setDrawerPosition(view, (String) value);
        break;
      case "drawerWidth":
        mViewManager.setDrawerWidth(view, value == null ? null : ((Double) value).floatValue());
        break;
      case "drawerLockMode":
        mViewManager.setDrawerLockMode(view, (String) value);
        break;
      case "statusBarBackgroundColor":
        mViewManager.setStatusBarBackgroundColor(view, ColorPropConverter.getColor(value, view.getContext()));
        break;
      default:
        super.setProperty(view, propName, value);
    }
  }

  @Override
  public void receiveCommand(T view, String commandName, ReadableArray args) {
    switch (commandName) {
      case "openDrawer":
        mViewManager.openDrawer(view);
        break;
      case "closeDrawer":
        mViewManager.closeDrawer(view);
        break;
    }
  }
}