/*
 * Copyright (C) 2023 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package be.kodio.a30days.data

import be.kodio.a30days.R
import be.kodio.a30days.model.Day

class Datasource() {
    fun loadDays(): List<Day> {
        return listOf<Day>(
            Day(R.drawable.trossard, R.string.day1, R.string.trossard),
            Day(R.drawable.saka, R.string.day2, R.string.saka),
            Day(R.drawable.saliba, R.string.day3, R.string.saliba),
            Day(R.drawable.partey, R.string.day4, R.string.partey),
            Day(R.drawable.rice, R.string.day5, R.string.rice),
            Day(R.drawable.skelly, R.string.day6, R.string.skelly),
            Day(R.drawable.nwaneri, R.string.day7, R.string.nwaneri),
            Day(R.drawable.raya, R.string.day8, R.string.raya),
            Day(R.drawable.havertz, R.string.day9, R.string.kai),
            Day(R.drawable.gabriel, R.string.day10, R.string.big_gabi)
        )
    }
}