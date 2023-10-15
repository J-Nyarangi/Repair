package com.repairpal.app.modules.mechanicpaymentsuccessful.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.repairpal.app.modules.mechanicpaymentsuccessful.`data`.model.MechanicpaymentsuccessfulModel
import org.koin.core.KoinComponent

class MechanicpaymentsuccessfulVM : ViewModel(), KoinComponent {
  val mechanicpaymentsuccessfulModel: MutableLiveData<MechanicpaymentsuccessfulModel> =
      MutableLiveData(MechanicpaymentsuccessfulModel())

  var navArguments: Bundle? = null
}
