package com.example.qadmin.models

data class Sales(
    val uid : String,
    val orderId : String,
    val totalPrice: String,
    val approved : Boolean = false
)
