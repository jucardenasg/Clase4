/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuenta;

public class Main {
    Cuenta.global = 50;
    
    public static void main(String[] args){
        Cuenta cuenta = new Cuenta(1,123,"f",100);
        
        System.out.println("Numero" + cuenta.numero);
        System.out.println("Clave" + cuenta.clave);
        System.out.println("Dueno" + cuenta.dueno);
        System.out.println("Saldo" + cuenta.saldo);gfff
    }
    
}
