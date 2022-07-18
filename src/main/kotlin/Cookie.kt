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

    cookies.forEach {
        println("Menu Item:${it.name}")
    }


}