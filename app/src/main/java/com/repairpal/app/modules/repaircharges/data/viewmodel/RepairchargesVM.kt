package com.repairpal.app.modules.repaircharges.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.repairpal.app.modules.repaircharges.`data`.model.RepairchargesModel
import org.koin.core.KoinComponent

class RepairchargesVM : ViewModel(), KoinComponent {
  val repairchargesModel: MutableLiveData<RepairchargesModel> =
      MutableLiveData(RepairchargesModel())

  var navArguments: Bundle? = null
}
