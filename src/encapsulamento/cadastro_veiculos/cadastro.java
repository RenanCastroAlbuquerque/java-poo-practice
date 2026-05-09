package encapsulamento.cadastro_veiculos;

public class cadastro {
    public static void main(String[]args){
        veiculos carro = new veiculos("Celta", "ABC-1234", 2015);
        System.out.println("Veículo cadastrado:");
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Placa: " + carro.getPlaca());
        System.out.println("Ano: " + carro.getAno());
    }
}
