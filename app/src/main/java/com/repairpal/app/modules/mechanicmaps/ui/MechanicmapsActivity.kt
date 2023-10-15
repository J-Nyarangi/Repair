package com.repairpal.app.modules.mechanicmaps.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.repairpal.app.R
import com.repairpal.app.appcomponents.base.BaseActivity
import com.repairpal.app.databinding.ActivityMechanicmapsBinding
import com.repairpal.app.modules.clientdetails.ui.ClientdetailsActivity
import com.repairpal.app.modules.mechanicmaps.`data`.viewmodel.MechanicmapsVM
import kotlin.String
import kotlin.Unit

class MechanicmapsActivity :
    BaseActivity<ActivityMechanicmapsBinding>(R.layout.activity_mechanicmaps) {
  private val viewModel: MechanicmapsVM by viewModels<MechanicmapsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.mechanicmapsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnStartInspectionOne.setOnClickListener {
      val destIntent = ClientdetailsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "MECHANICMAPS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, MechanicmapsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
