package com.dicoding.jetpack.academy.ui.academy

import androidx.lifecycle.ViewModel
import com.dicoding.jetpack.academy.data.CourseEntity
import com.dicoding.jetpack.academy.utils.DataDummy

class AcademyViewModel : ViewModel() {

    fun getCourses(): List<CourseEntity> = DataDummy.generateDummyCourses()


}