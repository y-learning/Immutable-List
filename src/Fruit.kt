open class Fruit

open class Apple : Fruit()

class Gala

open class MyList<out T> {
    open fun a(t: @UnsafeVariance T) {

    }
}

class Niii : MyList<Apple>() {
    override fun a(t: Apple) {

    }
}

val l: MyList<Fruit> = Niii()