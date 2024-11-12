package com.evolve

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.evolve.databinding.ActivityDateTimePickerBinding

class DateTimePickerActivity : AppCompatActivity() {
private lateinit var binding: ActivityDateTimePickerBinding;
    companion object {
        fun getIntent(context: Context) = Intent(context, DateTimePickerActivity::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDateTimePickerBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.dateSelectionView2.setAllOwToPickPastDate(true)
        binding.btnResetDate.setOnClickListener {
            binding.dateSelectionView2.resetToCurrentDate()
        }
        binding.timeSelectionView2.setMinMaxTime(true, 9, 17)
    }
}
