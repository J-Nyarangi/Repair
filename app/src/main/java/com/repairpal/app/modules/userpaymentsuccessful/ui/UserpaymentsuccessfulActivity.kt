package com.repairpal.app.modules.userpaymentsuccessful.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.repairpal.app.R
import com.repairpal.app.appcomponents.base.BaseActivity
import com.repairpal.app.databinding.ActivityUserpaymentsuccessfulBinding
import com.repairpal.app.modules.choosevehicle.ui.ChoosevehicleActivity
import com.repairpal.app.modules.userpaymentsuccessful.`data`.viewmodel.UserpaymentsuccessfulVM
import kotlin.String
import kotlin.Unit

class UserpaymentsuccessfulActivity :
    BaseActivity<ActivityUserpaymentsuccessfulBinding>(R.layout.activity_userpaymentsuccessful) {
  private val viewModel: UserpaymentsuccessfulVM by viewModels<UserpaymentsuccessfulVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.userpaymentsuccessfulVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnBackToHomepageOne.setOnClickListener {
      val destIntent = ChoosevehicleActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "USERPAYMENTSUCCESSFUL_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, UserpaymentsuccessfulActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
