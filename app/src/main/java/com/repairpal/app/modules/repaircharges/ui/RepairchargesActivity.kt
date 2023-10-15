package com.repairpal.app.modules.repaircharges.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.repairpal.app.R
import com.repairpal.app.appcomponents.base.BaseActivity
import com.repairpal.app.databinding.ActivityRepairchargesBinding
import com.repairpal.app.modules.repaircharges.`data`.viewmodel.RepairchargesVM
import com.repairpal.app.modules.usermap.ui.UsermapActivity
import kotlin.String
import kotlin.Unit

class RepairchargesActivity :
    BaseActivity<ActivityRepairchargesBinding>(R.layout.activity_repaircharges) {
  private val viewModel: RepairchargesVM by viewModels<RepairchargesVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.repairchargesVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnDecline.setOnClickListener {
      val destIntent = UsermapActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.frameStackarrowone.setOnClickListener {
      val destIntent = UsermapActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "REPAIRCHARGES_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, RepairchargesActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
