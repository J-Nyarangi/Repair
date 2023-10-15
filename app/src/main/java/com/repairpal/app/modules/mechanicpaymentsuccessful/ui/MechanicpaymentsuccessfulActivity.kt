package com.repairpal.app.modules.mechanicpaymentsuccessful.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.repairpal.app.R
import com.repairpal.app.appcomponents.base.BaseActivity
import com.repairpal.app.databinding.ActivityMechanicpaymentsuccessfulBinding
import com.repairpal.app.modules.mechanicmaps.ui.MechanicmapsActivity
import com.repairpal.app.modules.mechanicpaymentsuccessful.`data`.viewmodel.MechanicpaymentsuccessfulVM
import kotlin.String
import kotlin.Unit

class MechanicpaymentsuccessfulActivity :
    BaseActivity<ActivityMechanicpaymentsuccessfulBinding>(R.layout.activity_mechanicpaymentsuccessful)
    {
  private val viewModel: MechanicpaymentsuccessfulVM by viewModels<MechanicpaymentsuccessfulVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.mechanicpaymentsuccessfulVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnBackToHomepageOne.setOnClickListener {
      val destIntent = MechanicmapsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "MECHANICPAYMENTSUCCESSFUL_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, MechanicpaymentsuccessfulActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
