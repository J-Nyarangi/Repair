package com.repairpal.app.modules.userdashboard.`data`.model

import com.repairpal.app.R
import com.repairpal.app.appcomponents.di.MyApp
import kotlin.String

data class UserdashboardModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtWelcomeJohnD: String? =
      MyApp.getInstance().resources.getString(R.string.msg_welcome_john_d)
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
