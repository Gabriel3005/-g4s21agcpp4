/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operaciones;

/**
 *
 * @author alexg
 */
public class OperacionesAvanzadas {
    public double potencia(int base, int elevacion){
        return Math.pow(base, elevacion);
    }
    public double Raizcuadrada(int base){
        return Math.sqrt(base);
    }
    public double Raizcubica(int base){
        return Math.cbrt(base);
    }
    public double Factorial(int num){ 
        long fact = 1;
        for(int i = 2; i <= num; i++){
            fact = fact * i;
        }
        return(fact);    
    }
    public double Logaritmo(int num){
        return Math.log10(num);
    }
    
}
