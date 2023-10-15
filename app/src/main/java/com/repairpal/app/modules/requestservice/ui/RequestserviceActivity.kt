package com.repairpal.app.modules.requestservice.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.repairpal.app.R
import com.repairpal.app.appcomponents.base.BaseActivity
import com.repairpal.app.databinding.ActivityRequestserviceBinding
import com.repairpal.app.modules.choosevehicle.ui.ChoosevehicleActivity
import com.repairpal.app.modules.requestservice.`data`.viewmodel.RequestserviceVM
import kotlin.String
import kotlin.Unit

class RequestserviceActivity :
    BaseActivity<ActivityRequestserviceBinding>(R.layout.activity_requestservice) {
  private val viewModel: RequestserviceVM by viewModels<RequestserviceVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.requestserviceVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.frameStackarrowone.setOnClickListener {
      val destIntent = ChoosevehicleActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "REQUESTSERVICE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, RequestserviceActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
