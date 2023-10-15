package com.repairpal.app.modules.mechanicdashboard.ui

import androidx.activity.viewModels
import com.repairpal.app.R
import com.repairpal.app.appcomponents.base.BaseActivity
import com.repairpal.app.databinding.ActivityMechanicdashboardBinding
import com.repairpal.app.modules.carissues.ui.CarissuesActivity
import com.repairpal.app.modules.mechanicdashboard.`data`.viewmodel.MechanicdashboardVM
import com.repairpal.app.modules.signin.ui.SigninActivity
import kotlin.String
import kotlin.Unit

class MechanicdashboardActivity :
    BaseActivity<ActivityMechanicdashboardBinding>(R.layout.activity_mechanicdashboard) {
  private val viewModel: MechanicdashboardVM by viewModels<MechanicdashboardVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.mechanicdashboardVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageClose.setOnClickListener {
      // TODO please, add your navigation code here
      finish()
    }
    binding.linearColumnstartinspectio.setOnClickListener {
      val destIntent = CarissuesActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearRowarrowright.setOnClickListener {
      val destIntent = SigninActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "MECHANICDASHBOARD_ACTIVITY"

  }
}
