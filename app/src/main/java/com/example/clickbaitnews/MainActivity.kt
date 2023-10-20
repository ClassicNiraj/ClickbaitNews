package com.example.clickbaitnews

import android.os.Bundle
import com.example.clickbaitnews.model.NewsItem
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.clickbaitnews.data.DataSource
import com.example.clickbaitnews.ui.theme.ClickbaitNewsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ClickbaitNewsTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ClickbaitNewsApp()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ClickbaitNewsApp() {
    Scaffold(
        topBar = {
            TopAppBar(title = { Text("Top Headlines") })
        }
    ) { it ->
        LazyColumn(contentPadding = it) {
            val chunkedNewsItems = DataSource.newsItems.chunked(2)
            items(chunkedNewsItems) { rowItems ->
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    rowItems.forEach { newsItem ->
                        NewsItemCard(
                            newsItem = newsItem,
                            modifier = Modifier
                                .padding(8.dp)
                                .weight(1f)
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun NewsItemCard(newsItem: NewsItem, modifier: Modifier = Modifier) {
    Card(modifier = modifier) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ) {
            Image(
                painter = painterResource(newsItem.imageResourceId),
                contentDescription = null,
                modifier = Modifier
                    .height(150.dp)
                    .fillMaxWidth()
            )
            Text(
                text = stringResource(newsItem.headline),
                style = MaterialTheme.typography.displayMedium,
                modifier = Modifier.padding(top = 8.dp)
            )
            Divider()
            Text(
                text = stringResource(newsItem.description),
                style = MaterialTheme.typography.bodyLarge
            )
        }
    }
}