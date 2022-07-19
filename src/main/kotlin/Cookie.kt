class Cookie(
  val name:String,
  val softBaked:Boolean,
  val hasFilling:Boolean,
  val price:Double
)

val cookies = listOf( Cookie(
            "oREO",
             true,
    false,12.3
),
    Cookie(
        "Batr",
        false, false,3.5
    ),
    Cookie(
        "rwe",true,true,45.6
    )
)



fun main(){

    //H.O.F .1
    cookies.forEach {
        println("Menu Item:${it.name}")
    }

    //H.O.F (map)

    val fullmenu = cookies.map {
        "${it.name}-$${it.price}"



    }
    println("Full menu:")
    fullmenu.forEach {
        println(it)
    }

    //H.O.F (filter)

    val softBakedMenu = cookies.filter {
        it.softBaked
    }

    println("Soft cookies")
    softBakedMenu.forEach {
        println("${it.name}-$${it.price}")
    }


    val groupedMenu = cookies.groupBy {

        it.softBaked
    }

   //  softBakedMenu = groupedMenu[true] ?: listOf()
    val crunchyMenu = groupedMenu[false] ?: listOf()
    println("Crunchy cookies:")
    crunchyMenu.forEach {
        println("${it.name} - $${it.price}")
    }
}