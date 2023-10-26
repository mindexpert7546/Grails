class  VehicleService {

    @Where({ manufacturer.name == manufacturerName })
    List<Vehicle> findAllByManufacturer(String manufacturerName)

}
