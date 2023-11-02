package com.cugocumhurgunay.employeeretrofitcompose.retrofit

import com.cugocumhurgunay.employeeretrofitcompose.data.entity.EmployeeRespond
import retrofit2.http.GET

interface EmployeeDao {

    @GET("v1/employees")
    suspend fun loadEmployees() : EmployeeRespond

}