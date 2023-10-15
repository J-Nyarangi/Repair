package com.repairpal.app.modules.choosevehicle.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.repairpal.app.R
import com.repairpal.app.appcomponents.base.BaseActivity
import com.repairpal.app.databinding.ActivityChoosevehicleBinding
import com.repairpal.app.modules.choosevehicle.`data`.viewmodel.ChoosevehicleVM
import com.repairpal.app.modules.requestservice.ui.RequestserviceActivity
import kotlin.String
import kotlin.Unit

class ChoosevehicleActivity :
    BaseActivity<ActivityChoosevehicleBinding>(R.layout.activity_choosevehicle) {
  private val viewModel: ChoosevehicleVM by viewModels<ChoosevehicleVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.choosevehicleVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.frameStacksignal.setOnClickListener {
      val destIntent = RequestserviceActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "CHOOSEVEHICLE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ChoosevehicleActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
