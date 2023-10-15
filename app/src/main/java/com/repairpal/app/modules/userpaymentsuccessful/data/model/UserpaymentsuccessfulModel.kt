package com.repairpal.app.modules.userpaymentsuccessful.`data`.model

import com.repairpal.app.R
import com.repairpal.app.appcomponents.di.MyApp
import kotlin.String

data class UserpaymentsuccessfulModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPaymentiscomp: String? =
      MyApp.getInstance().resources.getString(R.string.msg_payment_is_comp)

)
