package com.novelitech.calculatorjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.novelitech.calculatorjetpackcompose.ui.theme.BackgroundGrayDark
import com.novelitech.calculatorjetpackcompose.ui.theme.BackgroundGrayLight
import com.novelitech.calculatorjetpackcompose.ui.theme.BackgroundGrayMedium
import com.novelitech.calculatorjetpackcompose.ui.theme.BackgroundOrange
import com.novelitech.calculatorjetpackcompose.ui.theme.CalculatorJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalculatorJetpackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Calculator()
                }
            }
        }
    }
}

@Composable
fun Calculator() {
    CalculatorJetpackComposeTheme {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(BackgroundGrayMedium)
                .padding(16.dp)
        ) {
            Box(
                modifier = Modifier
                    .weight(1f)
                    .padding(bottom = 32.dp)
            ) {
                Text(
                    text = "",
                    fontSize = 40.sp,
                    color = Color.White,
                    textAlign = TextAlign.End,
                    modifier = Modifier
                        .fillMaxWidth()
                        .align(Alignment.BottomEnd)
                )
            }
            Column {
                Row(
                    modifier = Modifier.height(intrinsicSize = IntrinsicSize.Max)
                ) {
                    RectangleButton(
                        text = "AC",
                        color = BackgroundGrayLight,
                    )
                    HorizontalSpacer()
                    Row(
                        modifier = Modifier
                            .weight(1f)
                    ) {
                        CircleButton(
                            text = "Del",
                            color = BackgroundGrayLight,
                        )
                        HorizontalSpacer()
                        CircleButton(
                            text = "/",
                            color = BackgroundOrange,
                        )
                    }
                }

                VerticalSpacer()

                Row() {
                    CircleButton(
                        text = "7",
                        color = BackgroundGrayDark,
                    )

                    HorizontalSpacer()

                    CircleButton(
                        text = "8",
                        color = BackgroundGrayDark,
                    )

                    HorizontalSpacer()

                    CircleButton(
                        text = "9",
                        color = BackgroundGrayDark,
                    )

                    HorizontalSpacer()

                    CircleButton(
                        text = "X",
                        color = BackgroundOrange,
                    )
                }

                VerticalSpacer()

                Row() {
                    CircleButton(
                        text = "4",
                        color = BackgroundGrayDark,
                    )

                    HorizontalSpacer()

                    CircleButton(
                        text = "5",
                        color = BackgroundGrayDark,
                    )

                    HorizontalSpacer()

                    CircleButton(
                        text = "6",
                        color = BackgroundGrayDark,
                    )

                    HorizontalSpacer()

                    CircleButton(
                        text = "-",
                        color = BackgroundOrange,
                    )
                }

                VerticalSpacer()

                Row() {
                    CircleButton(
                        text = "1",
                        color = BackgroundGrayDark,
                    )

                    HorizontalSpacer()

                    CircleButton(
                        text = "2",
                        color = BackgroundGrayDark,
                    )

                    HorizontalSpacer()

                    CircleButton(
                        text = "3",
                        color = BackgroundGrayDark,
                    )

                    HorizontalSpacer()

                    CircleButton(
                        text = "+",
                        color = BackgroundOrange,
                    )
                }

                VerticalSpacer()

                Row(
                    modifier = Modifier.height(intrinsicSize = IntrinsicSize.Max)
                ) {
                    RectangleButton(
                        text = "0",
                        color = BackgroundGrayLight,
                    )
                    HorizontalSpacer()
                    Row(
                        modifier = Modifier
                            .weight(1f)
                    ) {
                        CircleButton(
                            text = ".",
                            color = BackgroundGrayDark,
                        )
                        HorizontalSpacer()
                        CircleButton(
                            text = "=",
                            color = BackgroundOrange,
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun RowScope.CircleButton(
    text: String,
    color: Color,
) {

    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .weight(1f)
            .aspectRatio(1f)
            .clip(CircleShape)
            .background(color)
    ) {
        Text(
            text = text,
            fontSize = 32.sp,
            color = Color.White,
        )
    }
}

@Composable
fun RowScope.RectangleButton(
    text: String,
    color: Color,
) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .weight(1f)
            .fillMaxHeight()
            .clip(RoundedCornerShape(50.dp))
            .background(color)

    ) {
        Text(
            text = text,
            fontSize = 32.sp,
            color = Color.White,
        )
    }
}

@Composable
fun HorizontalSpacer() {
    Spacer(
        modifier = Modifier.width(8.dp)
    )
}

@Composable
fun VerticalSpacer() {
    Spacer(
        modifier = Modifier.height(8.dp)
    )
}

@Preview(showBackground = true)
@Composable
fun CalculatorPreview() {
    CalculatorJetpackComposeTheme {
        Calculator()
    }
}