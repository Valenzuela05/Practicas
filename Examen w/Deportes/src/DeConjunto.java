public class DeConjunto extends Competencia{
    public DeConjunto(){

    }
    public DeConjunto(String disciplina, String rama, String Categoria, String sede, String etapa, String fecha, String hora, String ganador,
     String segundoLugar, String tercerLugar){
        super(disciplina, rama, Categoria, sede, etapa, fecha, hora, ganador, segundoLugar, tercerLugar);
        //esta clase y la que hereddn de esta  simplemente hereadn los atributos de la clase competencia por lo tanto contienen los mismos metodos
}
}