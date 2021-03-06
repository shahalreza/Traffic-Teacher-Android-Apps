package com.example.afrin.trafficteacher.api;

import com.example.afrin.trafficteacher.model.showRouteResponse;
import com.example.afrin.trafficteacher.model.showGarageResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {
    @GET("api/showBusRoute.php")
    Call<List<showRouteResponse>> getAllRouteInfo();

    @GET("api/showGarage.php")
    Call<List<showGarageResponse>> getAllGarageInfo();
}
