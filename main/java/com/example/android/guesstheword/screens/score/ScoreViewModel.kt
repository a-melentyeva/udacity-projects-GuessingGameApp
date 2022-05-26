package com.example.android.guesstheword.screens.score

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ScoreViewModel(finalScore: Int) : ViewModel() {

    // The final score
        //internal
    private val _score = MutableLiveData<Int>()
        //external
    val score: LiveData<Int>
        get() = _score
    // event: Game over
        //internal
    private val _eventPlayAgain = MutableLiveData<Boolean>()
        //external
    val eventPlayAgain: LiveData<Boolean>
        get() = _eventPlayAgain

    init {
        _score.value = finalScore
        _eventPlayAgain.value = false
        Log.i("ScoreViewModel", "Final score is $finalScore")
    }

    fun onEventPlayAgain() {
        _eventPlayAgain.value = true
    }

    fun onPlayAgainComplete() {
        _eventPlayAgain.value = false
    }
}