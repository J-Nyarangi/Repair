package com.repairpal.app.modules.carissues.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.repairpal.app.modules.carissues.`data`.model.CarissuesModel
import org.koin.core.KoinComponent

class CarissuesVM : ViewModel(), KoinComponent {
  val carissuesModel: MutableLiveData<CarissuesModel> = MutableLiveData(CarissuesModel())

  var navArguments: Bundle? = null
}
