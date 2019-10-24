enum class  estadoselevador {
    STOP, UP, DOWN
}

class EstadoElevador (private var estado: estadoselevador, private var piso: Int){

    var pisodeseado=0
    fun work(){
        while(true){
            if(estado==estadoselevador.DOWN){
                Bajar()
            }
            if(estado==estadoselevador.UP){
                Subir()
            }
            if(estado==estadoselevador.STOP){
                Detenido()
            }


        }
    }

    fun Subir(){

        while(piso<pisodeseado)
        {
            println("Estado del elevador $estado, piso $piso")
            piso++
            Thread.sleep(2000)
        }
        estado=estadoselevador.STOP
    }

    fun Bajar(){
        while(piso>pisodeseado)
        {
            println("Estado del elevador $estado, piso $piso")
            piso-=1
            Thread.sleep(1000)


        }
        estado=estadoselevador.STOP
    }

    fun Detenido(){
        println("Estado del elevador $estado, en el piso $piso")

        var elevador: Int?
        println("Ingrese al piso que desea ir: ")
        elevador = readLine()!!.toInt()

            if(piso < elevador)
            {
                pisodeseado=elevador
                estado=estadoselevador.UP

            }
            if(piso > elevador)
            {
                pisodeseado=elevador
                estado=estadoselevador.DOWN


            }



    }
}
