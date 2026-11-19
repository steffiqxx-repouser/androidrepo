fun main() {
    val order = Order(38)

    check(order.id == 38)
    check(order.label == "Order-38")

    println("InitialiserBlockWithClassTest: passed")
}
