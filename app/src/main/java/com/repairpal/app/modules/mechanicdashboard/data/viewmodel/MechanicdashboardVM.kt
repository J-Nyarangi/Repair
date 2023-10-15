package com.repairpal.app.modules.mechanicdashboard.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.repairpal.app.modules.mechanicdashboard.`data`.model.MechanicdashboardModel
import org.koin.core.KoinComponent

class MechanicdashboardVM : ViewModel(), KoinComponent {
  val mechanicdashboardModel: MutableLiveData<MechanicdashboardModel> =
      MutableLiveData(MechanicdashboardModel())

  var navArguments: Bundle? = null
}
