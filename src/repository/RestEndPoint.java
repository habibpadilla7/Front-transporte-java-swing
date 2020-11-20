package repository;

import java.util.List;

import controller.CompanyController;
import controller.StatuController;
import controller.DriverController;
import controller.VehicleController;
import model.Company;
import model.Driver;
import model.Vehicle;
import retrofit2.Call;
import retrofit2.http.*;

public interface RestEndPoint {
	@GET("empresas/")
	Call<CompanyController.DataResponse> getCompanys();
	
	@GET("empresas/")
	Call<List<Company>> getCompanyss();

	@POST("empresas/")
	Call<Void> addCompany(@Body Company company);

	@GET("empresas/{compId}")
	Call<CompanyController.DataResponse> GetCompanyById(@Path("compId") long empId);

	@PUT("empresas/{compId}")
	Call<Void> editCompany(@Body Company company, @Path("compId") long empId);

	@DELETE("empresas/{compId}")
	Call<Void> deleteCompany(@Path("compId") long empId);
	
	@GET("estados/")
	Call<StatuController.DataResponse> getStatus();
	
	@GET("estados/")
	Call<List<Company>> getStatuss();
	
	@POST("conductores/")
	Call<Void> addDriver(@Body Driver driver);
	
	@GET("conductores/")
	Call<DriverController.DataResponse> getDrivers();
	
	@GET("conductores/")
	Call<List<Driver>> getDriverss();
	
	@POST("vehiculos/")
	Call<Void> addVehicle(@Body Vehicle vehicle);

	@GET("vehiculos/")
	Call<VehicleController.DataResponse> getVehicles();
	
	@GET("vehiculos/")
	Call<List<Vehicle>> getVehicless();
	
	@GET("vehiculos/{vehId}")
	Call<VehicleController.DataResponse> GetVehicleById(@Path("vehId") int vehId);
	
}
