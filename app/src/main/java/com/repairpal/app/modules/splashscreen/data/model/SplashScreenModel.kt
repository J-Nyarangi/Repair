package com.repairpal.app.modules.splashscreen.`data`.model

import com.repairpal.app.R
import com.repairpal.app.appcomponents.di.MyApp
import kotlin.String

data class SplashScreenModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtRepairpal: String? = MyApp.getInstance().resources.getString(R.string.lbl_repairpal)

)
