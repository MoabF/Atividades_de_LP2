public class questao_3{
    public static void main(String[] args){
        float R = 2.8f; float pi = 3.14f;
       // Scanner scanner = new Scanner(system.in);
        float area = 0.0f; float perimetro = 0.0f;
        area = (R * R) * pi; 
        perimetro = (R * 2) * pi;
        System.out.println("A área é: " + area + " cm");
        System.out.println("O perímetro é: " + perimetro + " cm");
    }
}