package com.repairpal.app.modules.clientdetails.`data`.model

import com.repairpal.app.R
import com.repairpal.app.appcomponents.di.MyApp
import kotlin.String

data class ClientdetailsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtClientissuede: String? =
      MyApp.getInstance().resources.getString(R.string.msg_client_issue_de)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtClientDetails: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_client_details)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? = MyApp.getInstance().resources.getString(R.string.msg_vehicle_owner)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtClientService: String? =
      MyApp.getInstance().resources.getString(R.string.msg_client_service)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_issue_type)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMoredescriptio: String? =
      MyApp.getInstance().resources.getString(R.string.msg_more_descriptio)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dol)

)
