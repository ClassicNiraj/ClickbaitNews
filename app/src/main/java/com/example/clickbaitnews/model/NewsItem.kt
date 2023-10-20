package com.example.clickbaitnews.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class NewsItem(
    @DrawableRes val imageResourceId: Int,
    @StringRes val headline: Int,
    @StringRes val description: Int
)