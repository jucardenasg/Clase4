/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuenta;


public class Main {
    Cuenta.global = 50;
    
    public static void main(String[] args){
        
    public static void main();{
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese el numero de la cuenta");
        int cuenta = lectura.nextInt();
        
        System.out.println("Ingrese la clalve");
        int clave = lectura.nextInt();
        
        System.out.println("Ingrese dueno");
        int dueno = lectura.nextInt();
        
        System.out.println("Saldo");
        int saldo = lectura.nextInt();
        
        Cuenta cl = null;
        cl.consignar(1000000);
        
}
        
        
        Cuenta cuenta = new Cuenta(1,123,"f",100);
        
        System.out.println("Numero" + cuenta.numero);
        System.out.println("Clave" + cuenta.clave);
        System.out.println("Dueno" + cuenta.dueno);
        System.out.println("Saldo" + cuenta.saldo);
        
        
    }
    
}
