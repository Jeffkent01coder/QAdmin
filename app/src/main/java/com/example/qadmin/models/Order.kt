package com.example.qadmin.models

data class Order(
    val user: String,
    val products: Array<Product>
)
