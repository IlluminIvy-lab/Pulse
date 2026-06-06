package com.pulse.app.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import java.time.LocalDate

@Composable
fun Dashboard() {

    val date = LocalDate.now()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
    ) {

        Text(
            "PULSE",
            style = MaterialTheme.typography.headlineLarge,
            color = MaterialTheme.colorScheme.primary
        )

        Spacer(Modifier.height(8.dp))

        Text(date.toString())

        Spacer(Modifier.height(24.dp))

        Card {
            Column(Modifier.padding(16.dp)) {
                Text("Today’s Focus")
                Text("Execute one meaningful action.")
            }
        }

        Spacer(Modifier.height(16.dp))

        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
            StatCard("Energy", "High")
            StatCard("Tasks", "3")
        }
    }
}

@Composable
fun StatCard(title: String, value: String) {
    Card(modifier = Modifier.weight(1f)) {
        Column(Modifier.padding(16.dp)) {
            Text(title)
            Text(value, color = MaterialTheme.colorScheme.primary)
        }
    }
}
