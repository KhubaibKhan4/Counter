package com.codespacepro.coursera

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.combinedClickable
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.codespacepro.coursera.ui.theme.CourseraTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CourseraTheme {
                Greeting()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class, ExperimentalFoundationApi::class)
@Composable
fun Greeting() {
    val counter = remember { mutableStateOf(0) }
    val Longcounter = remember { mutableStateOf(0) }
    Column {
        Text(text = "Clicks: " + counter.value.toString()  + "Long Click: ${Longcounter.value}",modifier = Modifier.combinedClickable(
            onClick = { counter.value += 1 },
            onLongClick = { Longcounter.value += 2 }))
        Button(
            onClick = { counter.value += 1 },

        ) {

        }
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CourseraTheme {
        Greeting()
    }
}