package com.repairpal.app.modules.mechanicmaps.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.repairpal.app.modules.mechanicmaps.`data`.model.MechanicmapsModel
import org.koin.core.KoinComponent

class MechanicmapsVM : ViewModel(), KoinComponent {
  val mechanicmapsModel: MutableLiveData<MechanicmapsModel> = MutableLiveData(MechanicmapsModel())

  var navArguments: Bundle? = null
}
