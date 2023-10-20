package com.example.clickbaitnews.data

import com.example.clickbaitnews.R
import com.example.clickbaitnews.model.NewsItem

object DataSource {
    val newsItems = listOf(
        NewsItem(R.drawable.cartoons, R.string.headline_Cartoon, R.string.description_Cartoon),
        NewsItem(R.drawable.celebrity, R.string.headline_Celebrity, R.string.description_Celebrity),
        NewsItem(R.drawable.diy, R.string.headline_DIY, R.string.description_DIY),
        NewsItem(R.drawable.fantasy, R.string.headline_Fantasy, R.string.description_Fantasy),
        NewsItem(R.drawable.junkfood, R.string.headline_Junkfood, R.string.description_Junkfood),
        NewsItem(R.drawable.lifehacks, R.string.headline_Lifehacks, R.string.description_Lifehacks),
        NewsItem(R.drawable.pet, R.string.headline_Pet, R.string.description_Pet),
        NewsItem(R.drawable.pizza, R.string.headline_Pizza, R.string.description_Pizza),
        NewsItem(R.drawable.soulmate, R.string.headline_Soulmate, R.string.description_Soulmate),
        NewsItem(R.drawable.travel, R.string.headline_Travel, R.string.description_Travel)
    )
}