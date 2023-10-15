package com.repairpal.app.modules.userdashboard.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.repairpal.app.modules.userdashboard.`data`.model.UserdashboardModel
import org.koin.core.KoinComponent

class UserdashboardVM : ViewModel(), KoinComponent {
  val userdashboardModel: MutableLiveData<UserdashboardModel> =
      MutableLiveData(UserdashboardModel())

  var navArguments: Bundle? = null
}
