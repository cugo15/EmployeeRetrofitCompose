package com.cugocumhurgunay.employeeretrofitcompose.data.repository

import com.cugocumhurgunay.employeeretrofitcompose.data.entity.Employee
import com.cugocumhurgunay.employeeretrofitcompose.retrofit.EmployeeDao
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class EmployeeRepository (var eDao: EmployeeDao) {

    suspend fun loadEmployee(): List<Employee> = withContext(Dispatchers.IO) {
        return@withContext eDao.loadEmployees().data
    }

}