package com.repairpal.app.modules.requestservice.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.repairpal.app.modules.requestservice.`data`.model.RequestserviceModel
import org.koin.core.KoinComponent

class RequestserviceVM : ViewModel(), KoinComponent {
  val requestserviceModel: MutableLiveData<RequestserviceModel> =
      MutableLiveData(RequestserviceModel())

  var navArguments: Bundle? = null
}
