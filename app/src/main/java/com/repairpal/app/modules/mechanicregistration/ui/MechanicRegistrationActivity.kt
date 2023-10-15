package com.repairpal.app.modules.mechanicregistration.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.repairpal.app.R
import com.repairpal.app.appcomponents.base.BaseActivity
import com.repairpal.app.databinding.ActivityMechanicRegistrationBinding
import com.repairpal.app.modules.mechanicregistration.`data`.viewmodel.MechanicRegistrationVM
import com.repairpal.app.modules.signin.ui.SigninActivity
import kotlin.String
import kotlin.Unit

class MechanicRegistrationActivity :
    BaseActivity<ActivityMechanicRegistrationBinding>(R.layout.activity_mechanic_registration) {
  private val viewModel: MechanicRegistrationVM by viewModels<MechanicRegistrationVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.mechanicRegistrationVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnRegister.setOnClickListener {
      val destIntent = SigninActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtConfirmation.setOnClickListener {
      val destIntent = SigninActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "MECHANIC_REGISTRATION_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, MechanicRegistrationActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
