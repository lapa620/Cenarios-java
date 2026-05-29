package Sistema_Veiculos;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("-------------------------");

        System.out.println("veiculos na garagem: ");

        Carro carro = new Carro("fiat-uno", 300);
        Moto moto = new Moto("haiakusa", 300);
        Caminhao caminhao = new Caminhao("pipa",100);
        System.out.println("------carro-------");
        carro.buzina();
        System.out.println(carro.getModelo());
        System.out.println(carro.getVelociadade()+"km");
        System.out.println("---------moto----------");
        moto.buzina();
        System.out.println(moto.getModelo());
        System.out.println(moto.getVelociadade()+"km");
        System.out.println("------ camnhao -------");
        caminhao.buzina();
        System.out.println(caminhao.getModelo());
        System.out.println(caminhao.getVelociadade()+"km");

    }
}
