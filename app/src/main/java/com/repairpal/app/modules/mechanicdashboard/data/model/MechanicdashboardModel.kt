package com.repairpal.app.modules.mechanicdashboard.`data`.model

import com.repairpal.app.R
import com.repairpal.app.appcomponents.di.MyApp
import kotlin.String

data class MechanicdashboardModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtYourLocation: String? = MyApp.getInstance().resources.getString(R.string.lbl_your_location)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtStartinspectio: String? =
      MyApp.getInstance().resources.getString(R.string.msg_start_inspectio)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCancelrequest: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_cancel_request)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWelcomeDavid: String? = MyApp.getInstance().resources.getString(R.string.msg_welcome_david)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHomePage: String? = MyApp.getInstance().resources.getString(R.string.lbl_home_page)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHistory: String? = MyApp.getInstance().resources.getString(R.string.lbl_history)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNotificationOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_notification)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSignOut: String? = MyApp.getInstance().resources.getString(R.string.lbl_sign_out)

)
