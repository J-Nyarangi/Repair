package com.repairpal.app.modules.mechanicregistration.`data`.model

import com.repairpal.app.R
import com.repairpal.app.appcomponents.di.MyApp
import kotlin.String

data class MechanicRegistrationModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMechanicRegist: String? =
      MyApp.getInstance().resources.getString(R.string.msg_mechanic_regist)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLetsGetStart: String? =
      MyApp.getInstance().resources.getString(R.string.msg_let_s_get_start)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmail: String? = MyApp.getInstance().resources.getString(R.string.lbl_email)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPassword: String? = MyApp.getInstance().resources.getString(R.string.lbl_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPasswordOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_password2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtConfirmation: String? =
      MyApp.getInstance().resources.getString(R.string.msg_already_have_an)

)
