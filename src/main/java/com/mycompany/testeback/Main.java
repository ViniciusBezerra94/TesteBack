/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testeback;

import com.mycompany.testeback.dao.ContaClienteDAO;
import com.mycompany.testeback.entity.ContaCliente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vinicius
 */
public class Main {
    public static void main(String[] args){
        try{
        List<ContaCliente> contasC = new ArrayList();
        contasC.add(new ContaCliente(2007L,"José Augusto" ,75621485268L,false,690.9 ));
        contasC.add(new ContaCliente(1950L,"Fernando Silva" ,97821485297L,true,720));
        contasC.add(new ContaCliente(850L,"Marcelo Almeida" ,25521485858L,true,750 ));
        contasC.add(new ContaCliente(2150L,"Fabio Santos" ,62412587548L,true,400));
        contasC.add(new ContaCliente(400L,"Lucas Barcelo" ,32412587555L,true,200));
        contasC.add(new ContaCliente(2005L,"Amora Maria" ,45621235268L,true,1200.9 ));
        
//        ContaClienteDAO dao = new ContaClienteDAO();
//            for (ContaCliente contaC : contasC) {
//                dao.salvar(contaC);
//            }
                          
        contasC = ordenarPorValorTotal(contasC);
        
        System.out.println("Média: " + calcMediaValorTotal(contasC));
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
        //metodo que serve para calcular a media do valorTotal de uma lista
     public static double calcMediaValorTotal(List<ContaCliente> contasC){
        double media = 0;
        int contador = 0;
        try{
            for(ContaCliente conta : contasC){
                if(conta.getVl_total() > 560 && conta.getId_customer() >= 1500 && conta.getId_customer() <=2700 ){
                    System.out.println("conta: " + conta);
                    media += conta.getVl_total();
                    contador +=1;
                }
            }

            return media/contador;
        }catch(Exception e){
            e.printStackTrace();


        }



        return 0.0;
    }
     
    // metodo que serve para ordenar pelo campo de valor total utilizando o bubble sort
     //por ser poucos valores optei por utilizar o bubble sort
    public static List<ContaCliente> ordenarPorValorTotal(List<ContaCliente> cc){

        ContaCliente aux =  new ContaCliente();
        boolean verificador = true;
        try{
        while(verificador){
            verificador = false;
            for(int i = 0; i < cc.size()-1;i++){
                if(cc.get(i).getVl_total() < cc.get(i+1).getVl_total()){
                    aux = cc.get(i);
                    cc.set(i, cc.get(i+1));
                    cc.set(i+1,aux);

                    verificador = true;
                }
            }

        }
        }catch(Exception e){

        }
        return cc;
    }
}
