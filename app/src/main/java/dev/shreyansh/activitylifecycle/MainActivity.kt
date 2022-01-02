package dev.shreyansh.activitylifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import androidx.databinding.DataBindingUtil
import dev.shreyansh.activitylifecycle.databinding.ActivityMainBinding
import timber.log.Timber

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding
    var number : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Timber.i("OnCreate called")
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        if(savedInstanceState != null){
            number = savedInstanceState.getInt("key")
            binding.textViewNumber.setText(number.toString())
        }

        binding.incrementButton.setOnClickListener {
            number = number+1
            binding.textViewNumber.setText(number.toString())
        }

        binding.decrementButton.setOnClickListener {
            number = number-1
            binding.textViewNumber.setText(number.toString())
        }

    }

    override fun onStart() {
        super.onStart()
        Timber.i("onStart called")

    }

    override fun onResume() {
        super.onResume()
        Timber.i("onResume called")

    }

    override fun onPause() {
        super.onPause()
        Timber.i("onPause called")

    }

    override fun onStop() {
        super.onStop()
        Timber.i("onStop called")

    }

    override fun onDestroy() {
        super.onDestroy()
        Timber.i("onDestroy called")

    }

    override fun onRestart() {
        super.onRestart()
        Timber.i("onRestart called")

    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Timber.i("onSave called")
        outState.putInt("key",number)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Timber.i("onRestoreState called")
    }
}