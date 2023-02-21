class Tipo(tipo:String) {

    var tipos_lista= arrayListOf<String>("acero", "agua", "bicho", "dragon", "electrico",
        "fantasma", "fuego", "hada", "hielo", "lucha", "normal", "planta", "psiquico", "roca",
        "siniestro", "tierra", "veneno", "volador")

    var tipos_a= mutableListOf<String>("acero", "agua", "bicho", "dragon", "electrico",
        "fantasma", "fuego")

    var tipos_b= mutableListOf<String>("hada", "hielo", "lucha", "normal", "planta")
    var tipos_c= mutableListOf<String>("psiquico", "roca", "siniestro")
    var tipos_d= mutableListOf<String>("tierra", "veneno", "volador")



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

}