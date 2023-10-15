package com.repairpal.app.modules.mechanicregistration.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.repairpal.app.modules.mechanicregistration.`data`.model.MechanicRegistrationModel
import org.koin.core.KoinComponent

class MechanicRegistrationVM : ViewModel(), KoinComponent {
  val mechanicRegistrationModel: MutableLiveData<MechanicRegistrationModel> =
      MutableLiveData(MechanicRegistrationModel())

  var navArguments: Bundle? = null
}
