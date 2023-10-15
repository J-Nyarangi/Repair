package com.repairpal.app.modules.clientdetails.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.repairpal.app.modules.clientdetails.`data`.model.ClientdetailsModel
import org.koin.core.KoinComponent

class ClientdetailsVM : ViewModel(), KoinComponent {
  val clientdetailsModel: MutableLiveData<ClientdetailsModel> =
      MutableLiveData(ClientdetailsModel())

  var navArguments: Bundle? = null
}
