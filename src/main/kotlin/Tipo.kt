class Tipo(tipo:String) {

    var tipos_lista= arrayListOf<String>("acero", "agua", "bicho", "dragon", "electrico",
        "fantasma", "fuego", "hada", "hielo", "lucha", "normal", "planta", "psiquico", "roca",
        "siniestro", "tierra", "veneno", "volador")



    var tipo_pk="defecto"
        get() {
            return field
        }
        set(value) {
            if (value !in tipos_lista){
                field=""
                throw IllegalArgumentException("El tipo no es valido\n")
            }
            field = value
        }


    init {
        tipo_pk=tipo
    }


   var tipos_mapa= mutableMapOf<String, Int>("acero" to 1, "agua" to 1,"bicho" to 1, "dragon" to 1,"electrico" to 1,
       "fantasma" to 1, "fuego" to 1,"hada" to 2, "hielo" to 2, "lucha" to 2, "normal" to 2, "planta" to 2, "psiquico" to 3,"roca" to 3,
       "siniestro" to 3,"tierra" to 4,"veneno" to 4, "volador" to 4)

    fun efectividad(tipo:String){

        // mucha efectividad, poca efectividad, normal, o nula

        var a=tipos_mapa.getValue(this.tipo_pk)
        var b=tipos_mapa.getValue(tipo)

        if (a==b){
            println("Efectividad: normal")
        }

        else if (a==1 || b==1){
            println("Efectividad: Mucha")
        }
        else if ((a==2 && b>a) || (b==2 && a>b)){
            println("Efectividad: Poca")
        }
        else if ((a==3 && b>a) || (b==3 && a>b)){
            println("Efectividad: Nula")
        }
        else{
            println(" normal")
        }
    }


}