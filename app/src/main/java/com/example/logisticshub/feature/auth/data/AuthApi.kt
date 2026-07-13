package com.example.logisticshub.feature.auth.data

import retrofit2.http.Body
import retrofit2.http.POST

interface AuthApi {
    @POST("api/auth/login")
    suspend fun login(@Body request: LoginRequest): AuthResponse

    @POST("api/auth/register")
    suspend fun register(@Body request: RegisterRequest) : AuthResponse
    @POST("api/auth/refresh")
    suspend fun refresh( @Body request: RefreshRequest) : RefreshResponse
}