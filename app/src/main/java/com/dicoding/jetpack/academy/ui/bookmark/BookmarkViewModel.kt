package com.dicoding.jetpack.academy.ui.bookmark

import androidx.lifecycle.ViewModel
import com.dicoding.jetpack.academy.data.CourseEntity
import com.dicoding.jetpack.academy.utils.DataDummy

class BookmarkViewModel : ViewModel() {

    fun getBookmarks(): List<CourseEntity> = DataDummy.generateDummyCourses()
}