package com.repairpal.app.modules.requestservice.`data`.model

import com.repairpal.app.R
import com.repairpal.app.appcomponents.di.MyApp
import kotlin.String

data class RequestserviceModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtRequestaservi: String? =
      MyApp.getInstance().resources.getString(R.string.msg_request_a_servi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHowcanweassi: String? =
      MyApp.getInstance().resources.getString(R.string.msg_how_can_we_assi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCarBatteryIss: String? =
      MyApp.getInstance().resources.getString(R.string.msg_car_battery_iss)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFlattire: String? = MyApp.getInstance().resources.getString(R.string.lbl_flat_tire)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOutofFuel: String? = MyApp.getInstance().resources.getString(R.string.lbl_out_of_fuel)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKeylock: String? = MyApp.getInstance().resources.getString(R.string.lbl_key_lock)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTowing: String? = MyApp.getInstance().resources.getString(R.string.lbl_towing)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOtherservice: String? = MyApp.getInstance().resources.getString(R.string.lbl_other_service)

)
