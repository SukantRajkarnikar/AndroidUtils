package com.evolve

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.evolve.databinding.ActivityPieBinding
import com.evolve.rosiautils.initPieGraph

class PieActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPieBinding
    companion object {
        fun getIntent(context: Context) = Intent(context, PieActivity::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPieBinding.inflate(layoutInflater)
        setContentView(binding.root)
        showPieGraph()
    }

    private fun showPieGraph() {
        initPieGraph(30f, binding.pieGraph)
    }
}
