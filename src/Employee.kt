class Employee constructor(
    private val name: String = "Jean Valjean",
    private val number: Int = 24601,
    private val shift: Int = 2) {

    init {
        println("Employee card created for: $name")
    }

    fun display() {
        println("\n -- Employee card -- \n" +
                "Name $name\n" +
                "Employee number: $number\n" +
                "Shift: $shift")
    }

}