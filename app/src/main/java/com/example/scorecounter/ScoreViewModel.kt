package com.example.scorecounter

import androidx.lifecycle.ViewModel
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableIntStateOf

class ScoreViewModel : ViewModel() {

    // Объект с бизнес-логикой
    private val calculator = ScoreCalculator()

    // Текущее количество баллов
    var score by mutableIntStateOf(0)
        private set

    // Увеличение баллов
    fun increase() {
        score = calculator.increase(score)
    }

    // Уменьшение баллов
    fun decrease() {
        score = calculator.decrease(score)
    }

    // Сброс баллов
    fun reset() {
        score = calculator.reset()
    }
}
