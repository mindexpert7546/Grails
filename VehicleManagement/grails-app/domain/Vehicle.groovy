
class Vehicle {
    String name
    Integer yearOfManufacture
    static belongsTo = [manufacturer: Manufacturer]

    static constraints = {
        name nullable: false, blank: false
    }
}
