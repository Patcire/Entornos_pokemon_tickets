class Pokemon(nombre:String,vida:Int,tipo:Tipo) {

        var nombre="defecto"
        var vida=100
        //por defecto se le va a poner tipo eléctrico, que está en la lista de tipos
        //para que no de error al inicalizarse
        var tipo_objeto=Tipo("electrico")

        init {
            this.nombre=nombre
            this.vida=vida
            tipo_objeto=tipo
        }

    override fun toString(): String {
        return "Pokemon(nombre='$nombre', vida=$vida, tipo=${tipo_objeto.tipo_pk})"
    }


}