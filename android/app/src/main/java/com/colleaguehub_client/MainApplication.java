package com.colleaguehub_client;

import android.app.Application;

import com.facebook.react.ReactApplication;
import fr.snapp.imagebase64.RNImgToBase64Package;
import com.RNFetchBlob.RNFetchBlobPackage;
import com.rnfs.RNFSPackage;
import com.imagepicker.ImagePickerPackage;




import com.oblador.vectoricons.VectorIconsPackage;
import com.BV.LinearGradient.LinearGradientPackage;
import suraj.tiwari.reactnativefbads.FBAdsPackage;
import com.react.rnspinkit.RNSpinkitPackage;
import com.facebook.reactnative.androidsdk.FBSDKPackage;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.shell.MainReactPackage;
import com.facebook.soloader.SoLoader;

import com.facebook.CallbackManager;
import com.facebook.FacebookSdk;

import com.facebook.appevents.AppEventsLogger;

import java.util.Arrays;
import java.util.List;

public class MainApplication extends Application implements ReactApplication {
  private static CallbackManager mCallbackManager = CallbackManager.Factory.create();
  protected static CallbackManager getCallbackManager() {
    return mCallbackManager;
  }

  private final ReactNativeHost mReactNativeHost = new ReactNativeHost(this) {
    @Override
    public boolean getUseDeveloperSupport() {
      return BuildConfig.DEBUG;
    }

    @Override
    protected List<ReactPackage> getPackages() {
      return Arrays.<ReactPackage>asList(
          new MainReactPackage(),
            new RNImgToBase64Package(),
            
            
            
            new RNFetchBlobPackage(),
           
            new RNFSPackage(),
            new ImagePickerPackage(),
          
          
            new FBAdsPackage(),
          new VectorIconsPackage(),
          new RNSpinkitPackage(),
          new LinearGradientPackage(),
          new FBSDKPackage(mCallbackManager)
      );
    }
};


 

  @Override
  public ReactNativeHost getReactNativeHost() {
    return mReactNativeHost;
  }

  @Override
  public void onCreate() {
    super.onCreate();
    SoLoader.init(this, /* native exopackage */ false);
  }
}
