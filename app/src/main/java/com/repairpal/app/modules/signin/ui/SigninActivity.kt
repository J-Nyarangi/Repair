package com.repairpal.app.modules.signin.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.viewModels
import com.repairpal.app.R
import com.repairpal.app.appcomponents.base.BaseActivity
import com.repairpal.app.databinding.ActivitySigninBinding
import com.repairpal.app.modules.choosevehicle.ui.ChoosevehicleActivity
import com.repairpal.app.modules.registration.ui.RegistrationActivity
import com.repairpal.app.modules.signin.`data`.viewmodel.SigninVM
import kotlin.String
import kotlin.Unit

class SigninActivity : BaseActivity<ActivitySigninBinding>(R.layout.activity_signin) {
  private val viewModel: SigninVM by viewModels<SigninVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.signinVM = viewModel
    Handler(Looper.getMainLooper()).postDelayed( {
      val destIntent = RegistrationActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
      }, 3000)
    }

    override fun setUpClicks(): Unit {
      binding.btnLoginOne.setOnClickListener {
        val destIntent = ChoosevehicleActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      binding.txtNotregistered.setOnClickListener {
        val destIntent = RegistrationActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }

    companion object {
      const val TAG: String = "SIGNIN_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, SigninActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
