package com.repairpal.app.modules.userpayment.ui

import androidx.activity.viewModels
import com.repairpal.app.R
import com.repairpal.app.appcomponents.base.BaseActivity
import com.repairpal.app.databinding.ActivityUserpaymentBinding
import com.repairpal.app.modules.repaircharges.ui.RepairchargesActivity
import com.repairpal.app.modules.userpayment.`data`.viewmodel.UserpaymentVM
import com.repairpal.app.modules.userpaymentsuccessful.ui.UserpaymentsuccessfulActivity
import kotlin.String
import kotlin.Unit

class UserpaymentActivity : BaseActivity<ActivityUserpaymentBinding>(R.layout.activity_userpayment)
    {
  private val viewModel: UserpaymentVM by viewModels<UserpaymentVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.userpaymentVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.frameStackarrowone.setOnClickListener {
      val destIntent = RepairchargesActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnPayNow.setOnClickListener {
      val destIntent = UserpaymentsuccessfulActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "USERPAYMENT_ACTIVITY"

  }
}
