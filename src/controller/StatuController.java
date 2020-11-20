package controller;

import java.util.ArrayList;

import model.Statu;
import repository.RestEndPoint;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import services.ServiceGenerator;

public class StatuController {
	
	private static StatuController instance;
	private ArrayList<Statu> status;
	
	private StatuController() {
		status = new ArrayList<>();
	}
	
	public static StatuController getInstance() {
		if (instance == null) {
			instance = new StatuController();
		}
		
		return instance;
	}
	public ArrayList<Statu> getStatus() {
		return status;
	}

	public void restart() {
		status.clear();
	}
	public void fetchNext() {

		ServiceGenerator.createService(RestEndPoint.class).getStatus().enqueue(new Callback<DataResponse>() {
			@Override
			public void onResponse(Call<DataResponse> call, Response<DataResponse> response) {
				if (response.isSuccessful()) {
					status.addAll(response.body().getData());
				}
			}

			@Override
			public void onFailure(Call<DataResponse> call, Throwable t) {

			}
		});
	}
	public ArrayList<Statu> fetchNexts() {

		ServiceGenerator.createService(RestEndPoint.class).getStatus().enqueue(new Callback<DataResponse>() {
			@Override
			public void onResponse(Call<DataResponse> call, Response<DataResponse> response) {
				if (response.isSuccessful()) {
					status.addAll(response.body().getData());
					
				}
			}

			@Override
			public void onFailure(Call<DataResponse> call, Throwable t) {
				System.out.println("no sirvio");
			}
		});
		return status;
	}
	public class DataResponse {

		ArrayList<Statu> data = new ArrayList<>();

		public DataResponse() {

		}

		public ArrayList<Statu> getData() {
			return data;
		}

		public void setData(ArrayList<Statu> data) {
			this.data = data;
		}
	}

}
