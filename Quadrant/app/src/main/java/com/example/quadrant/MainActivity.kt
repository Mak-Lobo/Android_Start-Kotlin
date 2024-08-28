package com.example.quadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.quadrant.ui.theme.QuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QuadrantTheme {
                Surface(modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background) {
                    Quadrant()
                }
            }
        }
    }
}

@Composable
fun Quadrant() {
    val txt_title = stringResource(id = R.string.txt_comp)
    val text = stringResource(id = R.string.txt)

    val img_title = stringResource(id = R.string.img_comp)
    val img_txt = stringResource(id = R.string.img)

    val row_title = stringResource(id = R.string.row_comp)
    val row_txt = stringResource(id = R.string.row)

    val col_title = stringResource(id = R.string.col_comp)
    val col_text  = stringResource(id = R.string.col)

    Column (Modifier.fillMaxSize()){

        Row (Modifier.weight(1f)) {
            Quadrant_text(
                title = txt_title,
                desc = text,
                bg_color = Color(0xFFEADDFF),
                modifier = Modifier.weight(1f)
            )
            Quadrant_text(
                title = img_title,
                desc = img_txt,
                bg_color = Color(0xFFD0BCFF),
                modifier = Modifier.weight(1f)
            )
        }
        Row (Modifier.weight(1f)){
            Quadrant_text(
                title = row_title,
                desc = row_txt,
                bg_color = Color(0xFFB69DF8),
                modifier = Modifier.weight(1f)
            )
            Quadrant_text(
                title = col_title,
                desc = col_text,
                bg_color = Color(0xFFF6EdFF),
                modifier = Modifier.weight(1f)
            )
        }

    }
}

@Composable
fun Quadrant_text(title: String, desc: String, bg_color: Color, modifier: Modifier) {
    Column (
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .padding(16.dp)
            .background(bg_color)
            .fillMaxSize()
    ){
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp,
            modifier = modifier.padding(bottom = 16.dp)
        )
        Text(
            text = desc,
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    QuadrantTheme {
        Quadrant()
    }
}