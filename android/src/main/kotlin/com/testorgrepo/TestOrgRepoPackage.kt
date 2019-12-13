package com.testorgrepo

import com.facebook.react.ReactPackage
import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.uimanager.ViewManager

import com.testorgrepo.passbasemodule.PassbaseModule
import com.testorgrepo.passbasecomponent.PassbaseComponentManager

class TestOrgRepoPackage : ReactPackage {
  override fun createNativeModules(reactContext: ReactApplicationContext): List<NativeModule> {
    return listOf(
      PassbaseModule(reactContext)
    )
  }

  override fun createViewManagers(reactContext: ReactApplicationContext): List<ViewManager<*, *>> {
    return listOf(
      PassbaseComponentManager()
    )
  }
}
