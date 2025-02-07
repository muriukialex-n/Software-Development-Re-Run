fun main() {
    val itemCount: Int = 3
    val itemPrice: Double = 19.99
    val totalCost: Double = itemCount * itemPrice
    val orderSummary: String = "Total items: $itemCount, Total cost: $$totalCost"
    println(orderSummary)
}
