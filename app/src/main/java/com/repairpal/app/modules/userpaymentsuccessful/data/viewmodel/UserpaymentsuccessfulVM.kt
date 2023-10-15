package com.repairpal.app.modules.userpaymentsuccessful.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.repairpal.app.modules.userpaymentsuccessful.`data`.model.UserpaymentsuccessfulModel
import org.koin.core.KoinComponent

class UserpaymentsuccessfulVM : ViewModel(), KoinComponent {
  val userpaymentsuccessfulModel: MutableLiveData<UserpaymentsuccessfulModel> =
      MutableLiveData(UserpaymentsuccessfulModel())

  var navArguments: Bundle? = null
}
