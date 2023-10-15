package com.repairpal.app.modules.choosevehicle.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.repairpal.app.modules.choosevehicle.`data`.model.ChoosevehicleModel
import org.koin.core.KoinComponent

class ChoosevehicleVM : ViewModel(), KoinComponent {
  val choosevehicleModel: MutableLiveData<ChoosevehicleModel> =
      MutableLiveData(ChoosevehicleModel())

  var navArguments: Bundle? = null
}
