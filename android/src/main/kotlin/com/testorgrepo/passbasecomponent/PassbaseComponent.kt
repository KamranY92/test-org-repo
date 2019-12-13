package com.testorgrepo.passbasecomponent

import android.content.Context
import android.view.View

class PassbaseComponent(context: Context) : View(context) {

  fun setColor(color: Int) {
    setBackgroundColor(color)
  }
}
