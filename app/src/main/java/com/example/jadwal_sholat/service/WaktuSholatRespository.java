package com.example.jadwal_sholat.service;

import com.example.jadwal_sholat.model.waktusholat.WaktuSholatResponse;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.GET;

public interface WaktuSholatRespository {
    @GET("v1/calendarByAddress?address=Sultanahmet%20Mosque,%20Istanbul,%20Turkey&method=2&month=04&year=2017")
    Call<WaktuSholatResponse> getWaktuSholatDiscover();
}
