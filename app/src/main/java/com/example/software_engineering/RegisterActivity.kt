package com.example.software_engineering

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.software_engineering.ui.theme.Software_EngineeringTheme

class RegisterActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Software_EngineeringTheme {
                Scaffold{ innerPadding->
                    registerbody(innerPadding)


                }
            }
        }
    }
}
@Composable
fun registerbody(innerPadding : PaddingValues){
    var firstName by remember { mutableStateOf("") }
    var lastName by remember { mutableStateOf("") }
    Column ( modifier = Modifier
        .padding(innerPadding)
        .fillMaxSize()
        .background(color = Color.White),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text("Register", style = TextStyle( fontSize = 25.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black))
        Spacer(modifier = Modifier.height(15.dp))
        Row(modifier = Modifier.padding(horizontal = 5.dp).fillMaxSize(),) {
            OutlinedTextField(value = firstName,
                onValueChange = { input ->
                    firstName = input

                },
                modifier = Modifier.padding(horizontal = 5.dp),
                shape = RoundedCornerShape(12.dp),)
            OutlinedTextField(value = lastName,
                onValueChange = { input ->
                    lastName = input

                }, modifier = Modifier.padding(horizontal = 5.dp),
                shape = RoundedCornerShape(12.dp)

                )

        }

    }


}
@Preview(showBackground = true)
@Composable
fun Previewregiterbody(){
    registerbody(innerPadding = PaddingValues(0.dp))
}

