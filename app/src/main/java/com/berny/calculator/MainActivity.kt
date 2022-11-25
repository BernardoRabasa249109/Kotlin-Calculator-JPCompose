package com.berny.calculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.berny.calculator.ui.theme.CalculatorTheme
import com.berny.calculator.ui.theme.MediumGray

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalculatorTheme {
                val viewModel = viewModel<CalculatorViewModel>()
                val state = viewModel.state
                val buttonSpacing = 8.dp
                Calculator(
                    state = state,
                    onAction = viewModel::onAction,
                    buttonSpacing = buttonSpacing,
                    modifier = Modifier.fillMaxWidth().background(MediumGray).padding(16.dp)
                )

            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun PreviewComponent() {
    CalculatorTheme{
        val viewModel = viewModel<CalculatorViewModel>()
        val state = viewModel.state
        val buttonSpacing = 8.dp
        Calculator(
            state = state,
            onAction = viewModel::onAction,
            buttonSpacing = buttonSpacing,
            modifier = Modifier.fillMaxWidth().background(MediumGray).padding(16.dp)
        )
    }
}

