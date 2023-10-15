package com.repairpal.app.modules.clientdetails.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.repairpal.app.R
import com.repairpal.app.appcomponents.base.BaseActivity
import com.repairpal.app.databinding.ActivityClientdetailsBinding
import com.repairpal.app.modules.carissues.ui.CarissuesActivity
import com.repairpal.app.modules.clientdetails.`data`.viewmodel.ClientdetailsVM
import com.repairpal.app.modules.mechanicmaps.ui.MechanicmapsActivity
import kotlin.String
import kotlin.Unit

class ClientdetailsActivity :
    BaseActivity<ActivityClientdetailsBinding>(R.layout.activity_clientdetails) {
  private val viewModel: ClientdetailsVM by viewModels<ClientdetailsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.clientdetailsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnDecline.setOnClickListener {
      val destIntent = MechanicmapsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.frameStackarrowone.setOnClickListener {
      val destIntent = MechanicmapsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnAccept.setOnClickListener {
      val destIntent = CarissuesActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "CLIENTDETAILS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ClientdetailsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
