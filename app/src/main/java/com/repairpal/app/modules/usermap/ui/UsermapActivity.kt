package com.repairpal.app.modules.usermap.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.repairpal.app.R
import com.repairpal.app.appcomponents.base.BaseActivity
import com.repairpal.app.databinding.ActivityUsermapBinding
import com.repairpal.app.modules.repaircharges.ui.RepairchargesActivity
import com.repairpal.app.modules.requestservice.ui.RequestserviceActivity
import com.repairpal.app.modules.usermap.`data`.viewmodel.UsermapVM
import kotlin.String
import kotlin.Unit

class UsermapActivity : BaseActivity<ActivityUsermapBinding>(R.layout.activity_usermap) {
  private val viewModel: UsermapVM by viewModels<UsermapVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.usermapVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.frameStackarrowone.setOnClickListener {
      val destIntent = RequestserviceActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnSendRequest.setOnClickListener {
      val destIntent = RepairchargesActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "USERMAP_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, UsermapActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
