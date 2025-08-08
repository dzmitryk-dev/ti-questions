import java.util.Date


data class Flight(
    val flightNumber: String,
    val origin: String,
    val destination: String,
    val estimatedDepartureTime: Date,
    val estimatedArrivalTime: Date,
    val estimatedPrice: Double, //Price in EUR
)

interface Provider {
    fun getFlights(): List<Flight>
}

// val providers = listOf(LOT, KML, WizzAir, Ryanair, Lufthansa, AirFrance, ...)


fun getCheapestFlight(
    providers: List<Provider>,
): Flight? {
    TODO()
}