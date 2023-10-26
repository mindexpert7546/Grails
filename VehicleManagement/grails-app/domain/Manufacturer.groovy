class Manufacturer {

    String name

    static hasMany = [vehicles: Vehicle]

    static constraints = {
        name blank: false
    }
}
