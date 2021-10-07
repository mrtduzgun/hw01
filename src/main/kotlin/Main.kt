interface MyInterface {
    val prop: Int // abstract

    val propertyWithImplementation: String
        get() = "foo"

    fun foo() {
        print(prop)
    }
}

data class Child : MyInterface {
    override val prop: Int = 29
}

fun main(args: Array<String>) {

    val (a, b) = Child();

    var a = Child();
    println(a.prop)
}