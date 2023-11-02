package com.cugocumhurgunay.employeeretrofitcompose.retrofit

class ApiUtils {
    companion object{
        val BASE_URL = "https://dummy.restapiexample.com/api/"

        fun getEmployeeDao(): EmployeeDao{
            return RetrofitClient
                .getClient(BASE_URL)
                .create(EmployeeDao::class.java)
        }
    }
}