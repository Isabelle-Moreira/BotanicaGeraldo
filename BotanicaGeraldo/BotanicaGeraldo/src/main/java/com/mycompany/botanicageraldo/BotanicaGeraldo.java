/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.botanicageraldo;
import java.util.*;
import java.util.ArrayList;

public class BotanicaGeraldo {
    public static void exibirMenu() {
        System.out.println("===== BOTÂNICA DO GERALDO =====");
        System.out.println("1 - Cadastrar planta");
        System.out.println("2 - Retirar planta do estoque");
        System.out.println("3 - Consultar estoque");
        System.out.println("4 - Sair");
        System.out.println("================================");
    }
    
    public static void main(String[] args) {
      int cont=0;
      boolean rodaMenu = true; 
      Scanner input = new Scanner(System.in);
      ArrayList<Plantas>estoquesPlantas= new ArrayList<Plantas>();
        while (rodaMenu) {
            exibirMenu();
            int opcao = input.nextInt();
            input.nextLine(); // Limpa o buffer do scanner
            
            switch (opcao) {
                case 1:
                    cont++;
                    Plantas planta= new Plantas(cont);
                    planta.CadastrarPlanta();
                    estoquesPlantas.add(planta);
                    break;
                case 2:
                    System.out.println("Qual ID você gostaria de retirar?");
                    int idByUser= input.nextInt();
                    for(Plantas achaID:estoquesPlantas){
                        if(achaID.getId()==idByUser){
                            achaID.RetirarPlanta();
                        }
                    }
                    
                    break;
                case 3:
                    for(int i=0;i<estoquesPlantas.size();i++){
                         Plantas percorrer = estoquesPlantas.get(i);
                         percorrer.ConsultarEstoque();
                    }
                    
                    break;
                    
                case 4:
                    rodaMenu = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        
        System.out.println("Obrigado por usar o Botânica do Geraldo!");
    }  
    
        
        
        
        
}

