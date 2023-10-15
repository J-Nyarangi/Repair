package com.repairpal.app.modules.userpayment.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.repairpal.app.modules.userpayment.`data`.model.UserpaymentModel
import org.koin.core.KoinComponent

class UserpaymentVM : ViewModel(), KoinComponent {
  val userpaymentModel: MutableLiveData<UserpaymentModel> = MutableLiveData(UserpaymentModel())

  var navArguments: Bundle? = null
}
