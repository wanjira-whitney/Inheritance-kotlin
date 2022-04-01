fun main(){
    var jeep = Car("Jeep", "2022", "matte black",5)
    jeep.identity()
    jeep.carry(7)
    jeep.calculateParkingFees(8)
    var bus = Bus("Double Decker", "Toyota", "Gold", 35)
    bus.maxTripFare(150.65)
    bus.calculateParkingFees(6)


}

open class Car(var make: String, var model: String, var color: String, var capacity: Int){
    fun carry(people:Int){
        var x = people-capacity
        if (people <=capacity){
            println("Carrying $people passengers")
        }
        else{
            println("Over capacity  by $x people")
        }
    }
    fun identity(){
        println("I am a $color $make $model")
    }
    open fun calculateParkingFees(hours:Int):Int{
        var parkingFees = hours*20
        println(parkingFees)
        return parkingFees
    }
}

class Bus(make: String, model: String, color: String, capacity: Int):Car( make, model, color, capacity){
    fun maxTripFare(fare: Double):Double{
        var maxFare = fare*capacity
        println(maxFare)
        return maxFare
    }

    override fun calculateParkingFees(hours: Int): Int {
        //return super.calculateParkingFees(hours)
        var parkingFees = hours*capacity
        println(parkingFees)
        return(parkingFees)

    }
}