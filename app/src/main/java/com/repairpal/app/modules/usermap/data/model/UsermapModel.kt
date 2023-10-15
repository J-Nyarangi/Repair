package com.repairpal.app.modules.usermap.`data`.model

import com.repairpal.app.R
import com.repairpal.app.appcomponents.di.MyApp
import kotlin.String

data class UsermapModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtYourLocation: String? = MyApp.getInstance().resources.getString(R.string.lbl_your_location)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDavidNoelsSpr: String? =
      MyApp.getInstance().resources.getString(R.string.msg_david_noels_sp)

)
