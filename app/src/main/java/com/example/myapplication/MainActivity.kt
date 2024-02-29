package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme


            }
        }
    }
}

@Composable
fun StoryItemList(){
    Row {
        StoryItem()
        StoryItem()
        StoryItem()
        StoryItem()
    }
}

@Preview(showBackground = true)
@Composable
fun StoryItemListPreview(){
    StoryItemList()
}



@Composable
fun StoryItem(
    val imagem
){
    Column (
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Image(
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(80.dp)
                .clip(CircleShape),
            painter = painterResource(id = R.drawable.kevin_mueller_jsddgdqq_fs_unsplash),
            contentDescription = ""
        )

        Text(
            text = "Story 1",
            style = MaterialTheme.typography.titleSmall,
            modifier = Modifier.padding(top = 8.dp)

        )
    }
}

@Preview(showBackground = true)
@Composable
fun StoryItemPreview(){
    StoryItem()
}