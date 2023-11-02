package com.cugocumhurgunay.employeeretrofitcompose.di

import com.cugocumhurgunay.employeeretrofitcompose.data.repository.EmployeeRepository
import com.cugocumhurgunay.employeeretrofitcompose.retrofit.ApiUtils
import com.cugocumhurgunay.employeeretrofitcompose.retrofit.EmployeeDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Provides
    @Singleton
    fun provideEmployeeRepository(eDao: EmployeeDao) : EmployeeRepository {
        return EmployeeRepository(eDao)
    }

    @Provides
    @Singleton
    fun provideEmployeeDao() : EmployeeDao {
        return ApiUtils.getEmployeeDao()
    }

}