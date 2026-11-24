package com.example.scorecounter


import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ScoreScreen(
    score: Int,
    onIncrease: () -> Unit,
    onDecrease: () -> Unit,
    onReset: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),

        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Text(
            text = "Баллы студента",
            style = MaterialTheme.typography.headlineMedium
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Текущий результат: $score",
            style = MaterialTheme.typography.titleLarge
        )

        Spacer(modifier = Modifier.height(24.dp))

        Row(
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {

            Button(onClick = onIncrease) {
                Text("+1")
            }

            Button(onClick = onDecrease) {
                Text("-1")
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedButton(onClick = onReset) {
            Text("Сбросить")
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun ScoreScreenPreview() {
    MaterialTheme {
        ScoreScreen(
            score = 5,
            onIncrease = {},
            onDecrease = {},
            onReset = {}
        )
    }
}
