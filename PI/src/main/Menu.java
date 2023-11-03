package main;

import javax.swing.JOptionPane;
public class Menu {
	public static void main(String[]args) {
		 String[] incio = { "Login ADM","Login Comissao", "Login"};
		    var tipo = (String) JOptionPane.showInputDialog(null, "Menu Principal", "Tipo de login", JOptionPane.QUESTION_MESSAGE, null, // Use
	                                                                // default                                                            // icon
		        incio, // Array of choices
		        incio[0]); // Initial choice
		 switch(tipo) {
		 case "Login ADM":
		 	    validacaoADM();
		    	mainADM();
		 	    break;
		 case "Login Comissao":
			 break;
		 case "Login":
			 break;
		 }
		 
	}
		 public static void mainADM() {
		    
		 String[] opcoes = { "Cadastrar Comissao", "Consultar Evento", "Cadastrar Caixa", "Cadastrar Arquivos", "Estatistica", "Finalizar"};
		    var input = (String) JOptionPane.showInputDialog(null, "Opções disponíveis:", "Caixa Eletronico", JOptionPane.QUESTION_MESSAGE, null, // Use
	                                                                // default                                                            // icon
		        opcoes, // Array of choices
		        opcoes[0]); // Initial choice
		        switch (input) {
		            case "Cadastrar Comissao":
		                JOptionPane.showMessageDialog(null, "uhul");
		                break;
		            case "Cadastrar Evento":
		                ;
		                break;
		            case "Carregar Caixa":
		            	validacaoADM();
		                break;
		            case "Saque":
		                break;
		            case "Estatistica":
		            	validacaoADM();
		                break;
		            case "Finalizar":
		                System.out.println("Finalizar");
		                break;
		            
		        }
		    }

	public static boolean validacaoADM() {
	    String s = "yey";
	    String e = "adm";
	    for (int i = 0; i < 3; i++) {
	        String email = JOptionPane.showInputDialog(null, "Insira o email");
	        String senha = JOptionPane.showInputDialog(null, "Insira a senha");
	        if (email.equals(e) && senha.equals(s)) {
	            JOptionPane.showMessageDialog(null, "Bem Vindo!");
	            return true;
	        }
	    }
	    JOptionPane.showMessageDialog(null, "Quantidade máxia de tentativas alcançadas");
	    main(null);
	    return false;
		}
	}
