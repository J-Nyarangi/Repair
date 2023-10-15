package com.repairpal.app.modules.repaircharges.`data`.model

import com.repairpal.app.R
import com.repairpal.app.appcomponents.di.MyApp
import kotlin.String

data class RepairchargesModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtVehiclerepair: String? =
      MyApp.getInstance().resources.getString(R.string.msg_vehicle_repair)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKshCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_ksh_2000)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtVehicleissues: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_vehicle_issues)
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

)
