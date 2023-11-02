package com.cugocumhurgunay.employeeretrofitcompose.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.cugocumhurgunay.employeeretrofitcompose.data.entity.Employee
import com.cugocumhurgunay.employeeretrofitcompose.data.repository.EmployeeRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HumanResourcesVM @Inject constructor(var eRepo: EmployeeRepository): ViewModel() {

    var employeeList = MutableLiveData<List<Employee>>()

    init {
            loadEmployees()
    }

    fun loadEmployees() {
        CoroutineScope(Dispatchers.Main).launch {
            try{
                employeeList.value = eRepo.loadEmployee()
            }catch (e:Exception){

            }
        }
    }
}