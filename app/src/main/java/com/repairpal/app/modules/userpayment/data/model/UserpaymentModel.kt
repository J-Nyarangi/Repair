package com.repairpal.app.modules.userpayment.`data`.model

import com.repairpal.app.R
import com.repairpal.app.appcomponents.di.MyApp
import kotlin.String

data class UserpaymentModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtChoosepayment: String? =
      MyApp.getInstance().resources.getString(R.string.msg_choose_payment)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCreditcard: String? = MyApp.getInstance().resources.getString(R.string.lbl_credit_card)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMpesa: String? = MyApp.getInstance().resources.getString(R.string.lbl_mpesa)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGotohomepage: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_go_to_homepage)

)
