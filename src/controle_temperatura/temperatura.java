package controle_temperatura;

public class temperatura {
    String local;
    Double temperatura_atual;

    public void exibir(){
        System.out.printf("\nSensor no local: %s\nTemperatura Atual: %.2f ºC\n", local, temperatura_atual);
        if(temperatura_atual >= 37.5){
            System.out.println("ALERTA!: Temperatura acima do limite!");
        }else{
            System.out.println("Temperatura estável!");
        }
    }
}
