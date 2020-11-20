package controller;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import repository.RestEndPoint;
import services.ServiceGenerator;

import model.Company;

public class CompanyController {
	private static CompanyController instance;
	private ArrayList<Company> companys;
	
	private CompanyController() {
		companys = new ArrayList<>();
	}
	
	public static CompanyController getInstance() {
		if (instance == null) {
			instance = new CompanyController();
		}
		
		return instance;
	}
	public ArrayList<Company> getCompanys() {
		return companys;
	}

	public void restart() {
		companys.clear();
	}
	public void fetchNext() {

		ServiceGenerator.createService(RestEndPoint.class).getCompanys().enqueue(new Callback<DataResponse>() {
			@Override
			public void onResponse(Call<DataResponse> call, Response<DataResponse> response) {
				if (response.isSuccessful()) {
					companys.addAll(response.body().getData());
				}
			}

			@Override
			public void onFailure(Call<DataResponse> call, Throwable t) {

			}
		});

	}
	public ArrayList<Company> fetchNexts() {
		ServiceGenerator.createService(RestEndPoint.class).getCompanys().enqueue(new Callback<DataResponse>() {
			@Override
			public void onResponse(Call<DataResponse> call, Response<DataResponse> response) {
				if (response.isSuccessful()) {
					companys.addAll(response.body().getData());
				}
			}
			
			@Override
			public void onFailure(Call<DataResponse> call, Throwable t) {
				System.out.println("Error");
			}
		});
		return companys;
	}
	public class DataResponse {

		ArrayList<Company> data = new ArrayList<>();

		public DataResponse() {

		}

		public ArrayList<Company> getData() {
			return data;
		}

		public void setData(ArrayList<Company> data) {
			this.data = data;
		}
	}
	

}
