package com.nudi.nallanudi.ui

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.nudi.nallanudi.databinding.ActivitySearchBinding
import com.nudi.nallanudi.viewmodel.WordViewModel

class SearchActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySearchBinding
    private val viewModel: WordViewModel by viewModels()
    private lateinit var adapter: WordAdapter
    private var selectedSubject = "All"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySearchBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupRecyclerView()
        setupSearch()
        setupFilters()
        loadAllWords()

        binding.btnBack.setOnClickListener { finish() }
    }

    private fun setupRecyclerView() {
        adapter = WordAdapter(
            words = emptyList(),
            onWordClick = { word ->
                val intent = Intent(this, DetailActivity::class.java).apply {
                    putExtra("wordId", word.id)
                    putExtra("english", word.englishTerm)
                    putExtra("kannada", word.kannadaTerm)
                    putExtra("explanation", word.explanation)
                    putExtra("example", word.example)
                    putExtra("subject", word.subject)
                    putExtra("isBookmarked", word.isBookmarked)
                }
                startActivity(intent)
            },
            onBookmarkClick = { word ->
                viewModel.toggleBookmark(word)
            }
        )
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = adapter
    }

    private fun setupSearch() {
        binding.etSearch.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                viewModel.searchWords(s.toString(), selectedSubject)
            }
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
        })
    }

    private fun setupFilters() {
        val chips = listOf(
            binding.chipAll to "All",
            binding.chipScience to "Science",
            binding.chipMath to "Math",
            binding.chipCommerce to "Commerce"
        )

        chips.forEach { (button, subject) ->
            button.setOnClickListener {
                selectedSubject = subject
                // Highlight selected chip
                chips.forEach { (b, _) ->
                    b.setBackgroundColor(
                        if (b == button)
                            android.graphics.Color.parseColor("#d97706")
                        else
                            android.graphics.Color.TRANSPARENT
                    )
                }
                viewModel.searchWords(binding.etSearch.text.toString(), selectedSubject)
            }
        }
    }

    private fun loadAllWords() {
        viewModel.searchWords("", "All")
        viewModel.searchResults.observe(this) { words ->
            adapter.updateWords(words)
            binding.tvResultCount.text = "${words.size} terms"
        }
    }
}