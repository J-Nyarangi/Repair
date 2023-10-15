package com.repairpal.app.modules.carissues.`data`.model

import com.repairpal.app.R
import com.repairpal.app.appcomponents.di.MyApp
import kotlin.String

data class CarissuesModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCarissuelist: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_car_issue_list)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIssueCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_issue_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIssueCounterOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_issue_2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIssueCounterTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_issue_3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIssueCounterThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_issue_4)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIssueCounterFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_issue_5)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKshCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_ksh_2000)

)
