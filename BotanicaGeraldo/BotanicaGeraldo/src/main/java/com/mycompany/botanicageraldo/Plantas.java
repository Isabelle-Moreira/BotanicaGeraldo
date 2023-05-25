package com.mycompany.botanicageraldo;
import java.util.*;
      

public class Plantas {
int ID;
String nome;
String descricao = " ";
int quantidadeEstoque;

    public Plantas(int ID) {
        this.ID = ID;
    }

    public void CadastrarPlanta(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nome da Planta");
        this.nome = input.nextLine();
        do{
            System.out.println("Descricao:");
            String descreve = input.nextLine();
                if(descreve.length()>0 && descreve.length()<=50){
                    this.descricao = descreve;   
                }else{
                    System.out.println("Ops,esta descricao tem tamanho invalido");
                } 
        }while(this.descricao.equals(" "));
       System.out.println("Quantidade: ");
       this.quantidadeEstoque= input.nextInt();
    }
    
    public void RetirarPlanta(){
        Scanner input = new Scanner(System.in);
        System.out.println("Quanto você deseja retirar?");
        int praRetirar= input.nextInt();
            if(praRetirar<=this.quantidadeEstoque){
                this.quantidadeEstoque=this.quantidadeEstoque-praRetirar;
            }else{
                System.out.println("Ops, não temos essa quantidade no estoque");
            }
    }
    
   public int getId(){
       return this.ID;
   }
           
   public void ConsultarEstoque(){
       System.out.println("-----------------------------------------------------");
       System.out.println("O ID dessa planta é: "+this.ID);
       System.out.println("A descrição dessa planta é: "+this.descricao);
       System.out.println("O nome dessa planta é: "+this.nome);
       System.out.println("A quantidade dessa planta é:"+ this.quantidadeEstoque);
       System.out.println("-----------------------------------------------------");
   }
}
