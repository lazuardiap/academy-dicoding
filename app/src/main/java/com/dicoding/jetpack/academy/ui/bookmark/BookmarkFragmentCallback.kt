package com.dicoding.jetpack.academy.ui.bookmark

import com.dicoding.jetpack.academy.data.CourseEntity

interface BookmarkFragmentCallback {
    fun onShareClick(course: CourseEntity)
}
