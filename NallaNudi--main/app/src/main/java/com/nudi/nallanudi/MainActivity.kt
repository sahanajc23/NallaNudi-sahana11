package com.nudi.nallanudi

import com.nudi.nallanudi.ui.MyListActivity
import com.nudi.nallanudi.ui.SearchActivity
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.nudi.nallanudi.databinding.ActivityMainBinding
import com.nudi.nallanudi.viewmodel.WordViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewModel: WordViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Observe Word of the Day
        viewModel.wordOfTheDay.observe(this) { word ->
            word?.let {
                binding.tvEnglishWord.text = it.englishTerm
                binding.tvKannadaWord.text = it.kannadaTerm
                binding.tvExample.text = it.example
            }
        }

        // Search button — we'll wire this up next
        binding.btnGoToSearch.setOnClickListener {
            startActivity(Intent(this, SearchActivity::class.java))
        }

        // My List button — we'll wire this up next
        binding.btnGoToMyList.setOnClickListener {
            startActivity(Intent(this, MyListActivity::class.java))
        }
    }
}