package com.example.scorecounter

class ScoreCalculator {
    companion object {
        const val MIN_SCORE = 0
        const val MAX_SCORE = 10
    }

    // Увеличить баллы на 1
    fun increase(currentScore: Int): Int {
        return (currentScore + 1)
            .coerceIn(MIN_SCORE, MAX_SCORE)
    }

    // Уменьшить баллы на 1
    fun decrease(currentScore: Int): Int {
        return (currentScore - 1)
            .coerceIn(MIN_SCORE, MAX_SCORE)
    }

    // Сбросить баллы
    fun reset(): Int {
        return MIN_SCORE
    }
}