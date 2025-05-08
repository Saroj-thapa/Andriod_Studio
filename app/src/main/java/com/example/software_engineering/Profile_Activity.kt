package com.example.software_engineering

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.software_engineering.ui.theme.Software_EngineeringTheme

class Profile_Activity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Scaffold { innerPadding-> //maintain the line of the app and don't overlap with mobile time and wifi
                // base jasma UI compoments bascha
                // all enter to import the column
                //fillMaxsize() use full screen of the mobile
                ProfileBody(innerPadding)

                }
            }
        }
    }


@Composable
//UI returns
fun ProfileBody(innerPadding:PaddingValues){
    Column ( modifier =  Modifier.padding(innerPadding)
        .fillMaxSize().background(color = Color.White)) {
        Row (modifier = Modifier.fillMaxWidth().padding(horizontal = 10.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween){
            // method 1
            Icon(imageVector = Icons.Default.KeyboardArrowLeft,
                tint = Color.Black,
                contentDescription = "This is back button ", modifier = Modifier.height(28.dp).width(28.dp))

            Text(text = "Ronaldo", style = TextStyle(
                fontSize = 20.sp,
                //textDecoration = TextDecoration.Underline,
                fontWeight = FontWeight.Bold,
                //fontStyle = FontStyle.Italic
            ))

            // method 2
            Icon(
                painter = painterResource(R.drawable.baseline_more_horiz_24),
                tint =  Color.Black,
                contentDescription = null, modifier = Modifier.height(28.dp).width(28.dp)
            )

        }

        Row (modifier = Modifier.fillMaxWidth().padding(horizontal = 10.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceAround) {
            Image(
                painter = painterResource(R.drawable.ronaldo),
//                tint =  Color.Black,
                contentDescription = null, contentScale = ContentScale.Crop,
                modifier = Modifier.height(100.dp).width(100.dp).
                clip(shape = RoundedCornerShape(100.dp))

            )
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "174", style = TextStyle(
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                )
                )
                Text(text = "Posts",style = TextStyle(
                    fontWeight = FontWeight.Bold
                ))
            }

            Column(verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally ) {
                Text(text = "724K", style = TextStyle(
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                )
                )
                Text(text = "Followers",style = TextStyle(
                        fontWeight = FontWeight.Bold
                        ))
            }
            Column(verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally ) {
                Text(text = "100", style = TextStyle(
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,

                )
                )
                Text(text = "Following", style = TextStyle(
                    fontWeight = FontWeight.Bold
                ))
            }
        }
        Column(modifier = Modifier.padding(horizontal = 15.dp, vertical =15.dp )) {
            Text(text = "Cristiano Ronaldo", style = TextStyle(
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Blue
            ))
            Text(text = "Captain of Portugal Fc")
            Text(text = "Footballer", modifier = Modifier.alpha(0.5f))
            Text(text = "Currently Playing Form ALNassr ")
        }
        Row (
            modifier = Modifier.fillMaxWidth().padding(horizontal = 15.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly
        ){
            Button(
                onClick = {
                    //TODO when button clicked
                },
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Blue,
                    contentColor = Color.White
                )
            ) {
                Text("Follow")
            }
            OutlinedButton(
                onClick = {

                }, shape = RoundedCornerShape(10.dp),
                border = BorderStroke(1.dp, Color.Gray),
                colors = ButtonDefaults.outlinedButtonColors(
                    contentColor = Color.Black
                )
            ) {
                Text("Message")
            }
            OutlinedButton(onClick = {

            },shape = RoundedCornerShape(10.dp),
                border = BorderStroke(1.dp, Color.Gray),
                colors = ButtonDefaults.outlinedButtonColors(
                    contentColor = Color.Black
                )) {
                Text("Email")
            }
            OutlinedButton(onClick = {

            },shape = RoundedCornerShape(10.dp),
                border = BorderStroke(1.dp, Color.Gray),
                colors = ButtonDefaults.outlinedButtonColors(
                    contentColor = Color.Black
                )) {
                Icon(
                    imageVector = Icons.Default.KeyboardArrowDown,
                    contentDescription = null
                )
            }
        }

        }

    }


@Preview(showBackground = true)
@Composable
fun PreviewProfile(){
    ProfileBody(innerPadding = PaddingValues(0.dp))
}
