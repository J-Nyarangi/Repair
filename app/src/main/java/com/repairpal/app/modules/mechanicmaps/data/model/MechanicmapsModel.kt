package com.repairpal.app.modules.mechanicmaps.`data`.model

import com.repairpal.app.R
import com.repairpal.app.appcomponents.di.MyApp
import kotlin.String

data class MechanicmapsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtYourLocation: String? = MyApp.getInstance().resources.getString(R.string.lbl_your_location)

)
