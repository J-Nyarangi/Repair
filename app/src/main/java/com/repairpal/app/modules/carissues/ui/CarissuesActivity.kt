package com.repairpal.app.modules.carissues.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.repairpal.app.R
import com.repairpal.app.appcomponents.base.BaseActivity
import com.repairpal.app.databinding.ActivityCarissuesBinding
import com.repairpal.app.modules.carissues.`data`.viewmodel.CarissuesVM
import com.repairpal.app.modules.clientdetails.ui.ClientdetailsActivity
import com.repairpal.app.modules.mechanicpaymentsuccessful.ui.MechanicpaymentsuccessfulActivity
import kotlin.String
import kotlin.Unit

class CarissuesActivity : BaseActivity<ActivityCarissuesBinding>(R.layout.activity_carissues) {
  private val viewModel: CarissuesVM by viewModels<CarissuesVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.carissuesVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnSubmit.setOnClickListener {
      val destIntent = MechanicpaymentsuccessfulActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.frameStackarrowone.setOnClickListener {
      val destIntent = ClientdetailsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "CARISSUES_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CarissuesActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
