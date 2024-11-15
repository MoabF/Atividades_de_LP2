//package Tarefa da aula_14.11.questao_1;

public class Ponto2d {
    private double x,y;
    /*o erro era que dois métodos possuiam a mesma declaração, ou seja,
    as duas classes eram "chamadas" quando declaradas na main, além disso as duas faziam a mesma coisa,
    por isso retirei uma.
     */
    public Ponto2d(){
        this.x = 0.0d; this.y = 0.0d;
    }
    public Ponto2d(double _x, double _y){
        this.x = _x; this.y = _y;
    }
}
