package com.repairpal.app.modules.mechanicpaymentsuccessful.`data`.model

import com.repairpal.app.R
import com.repairpal.app.appcomponents.di.MyApp
import kotlin.String

data class MechanicpaymentsuccessfulModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtInspectionand: String? =
      MyApp.getInstance().resources.getString(R.string.msg_inspection_and)

)
