package controller;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import model.Driver;
import repository.RestEndPoint;
import services.ServiceGenerator;

public class DriverController {
	
	private static DriverController instance;
	private ArrayList<Driver> drivers;
	
	private DriverController() {
		drivers = new ArrayList<>();
	}
	
	public static DriverController getInstance() {
		if (instance == null) {
			instance = new DriverController();
		}
		
		return instance;
	}
	public ArrayList<Driver> getDrivers() {
		return drivers;
	}

	public void restart() {
		drivers.clear();
	}
	public void fetchNext() {

		ServiceGenerator.createService(RestEndPoint.class).getDrivers().enqueue(new Callback<DataResponse>() {
			@Override
			public void onResponse(Call<DataResponse> call, Response<DataResponse> response) {
				if (response.isSuccessful()) {
					drivers.addAll(response.body().getData());
				}
			}

			@Override
			public void onFailure(Call<DataResponse> call, Throwable t) {

			}
		});
	}
	public class DataResponse {

		ArrayList<Driver> data = new ArrayList<>();

		public DataResponse() {

		}

		public ArrayList<Driver> getData() {
			return data;
		}

		public void setData(ArrayList<Driver> data) {
			this.data = data;
		}
	}

}
