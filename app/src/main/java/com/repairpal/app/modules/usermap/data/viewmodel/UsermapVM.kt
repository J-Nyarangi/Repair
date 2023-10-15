package com.repairpal.app.modules.usermap.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.repairpal.app.modules.usermap.`data`.model.UsermapModel
import org.koin.core.KoinComponent

class UsermapVM : ViewModel(), KoinComponent {
  val usermapModel: MutableLiveData<UsermapModel> = MutableLiveData(UsermapModel())

  var navArguments: Bundle? = null
}
