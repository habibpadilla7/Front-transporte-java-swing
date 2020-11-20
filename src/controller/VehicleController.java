package controller;

import java.util.ArrayList;

import application.Main;
import model.Vehicle;
import repository.RestEndPoint;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import services.ServiceGenerator;

public class VehicleController {
	
	private static VehicleController instance;
	private ArrayList<Vehicle> vehicles;
	
	private VehicleController() {
		vehicles = new ArrayList<>();
	}
	
	public static VehicleController getInstance() {
		if (instance == null) {
			instance = new VehicleController();
		}
		
		return instance;
	}
	public ArrayList<Vehicle> getVehicles() {
		return vehicles;
	}

	public void restart() {
		vehicles.clear();
	}
	public void fetchNext() {

		ServiceGenerator.createService(RestEndPoint.class).getVehicles().enqueue(new Callback<DataResponse>() {
			@Override
			public void onResponse(Call<DataResponse> call, Response<DataResponse> response) {
				if (response.isSuccessful()) {
					vehicles.addAll(response.body().getData());
				}
			}

			@Override
			public void onFailure(Call<DataResponse> call, Throwable t) {

			}
		});
	}
	public ArrayList<Vehicle> fetchNexts() {

		ServiceGenerator.createService(RestEndPoint.class).getVehicles().enqueue(new Callback<DataResponse>() {
			@Override
			public void onResponse(Call<DataResponse> call, Response<DataResponse> response) {
				if (response.isSuccessful()) {
					vehicles.addAll(response.body().getData());
					
				}
			}

			@Override
			public void onFailure(Call<DataResponse> call, Throwable t) {
				System.out.println("Error en la conexion");
			}
		});
		return vehicles;
	}
	public void fetchNextById(String vehId) {
		
		ServiceGenerator.createService(RestEndPoint.class)
				.GetVehicleById(vehId).enqueue(new Callback<DataResponse>() {
					@Override
					public void onResponse(Call<DataResponse> call, Response<DataResponse> response) {
						if (response.isSuccessful()) {
							vehicles.addAll(response.body().getData());
						} 
					}

					@Override
					public void onFailure(Call<DataResponse> call, Throwable t) {
						
					}
				});

	}
	public class DataResponse {

		ArrayList<Vehicle> data = new ArrayList<>();

		public DataResponse() {

		}

		public ArrayList<Vehicle> getData() {
			return data;
		}

		public void setData(ArrayList<Vehicle> data) {
			this.data = data;
		}
	}

}
