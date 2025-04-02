package be.kodio.a30days.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

/**
 * A data class to represent the information presented in the dog card
 */
data class Day(
    @DrawableRes val imageResourceId: Int,
    @StringRes val day: Int,
    @StringRes val name: Int,
)
