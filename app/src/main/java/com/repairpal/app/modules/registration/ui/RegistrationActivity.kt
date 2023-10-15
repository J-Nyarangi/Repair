package com.repairpal.app.modules.registration.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.repairpal.app.R
import com.repairpal.app.appcomponents.base.BaseActivity
import com.repairpal.app.databinding.ActivityRegistrationBinding
import com.repairpal.app.modules.mechanicregistration.ui.MechanicRegistrationActivity
import com.repairpal.app.modules.registration.`data`.viewmodel.RegistrationVM
import com.repairpal.app.modules.signin.ui.SigninActivity
import kotlin.String
import kotlin.Unit

class RegistrationActivity :
    BaseActivity<ActivityRegistrationBinding>(R.layout.activity_registration) {
  private val viewModel: RegistrationVM by viewModels<RegistrationVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.registrationVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtMechanicSignup.setOnClickListener {
      val destIntent = MechanicRegistrationActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnRegisterOne.setOnClickListener {
      val destIntent = SigninActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtConfirmation.setOnClickListener {
      val destIntent = SigninActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "REGISTRATION_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, RegistrationActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
