package com.repairpal.app.modules.userdashboard.ui

import androidx.activity.viewModels
import com.repairpal.app.R
import com.repairpal.app.appcomponents.base.BaseActivity
import com.repairpal.app.databinding.ActivityUserdashboardBinding
import com.repairpal.app.modules.signin.ui.SigninActivity
import com.repairpal.app.modules.userdashboard.`data`.viewmodel.UserdashboardVM
import kotlin.String
import kotlin.Unit

class UserdashboardActivity :
    BaseActivity<ActivityUserdashboardBinding>(R.layout.activity_userdashboard) {
  private val viewModel: UserdashboardVM by viewModels<UserdashboardVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.userdashboardVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearRowarrowright.setOnClickListener {
      val destIntent = SigninActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnClose.setOnClickListener {
      // TODO please, add your navigation code here
      finish()
    }
  }

  companion object {
    const val TAG: String = "USERDASHBOARD_ACTIVITY"

  }
}
