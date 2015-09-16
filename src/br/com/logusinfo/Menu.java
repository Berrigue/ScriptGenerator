package br.com.logusinfo;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Menu extends Iteracao {

	public void getMenu() throws InterruptedException, IOException {
		float numero1;
		int operacao;

		String SIP = "SIP";
		String SEC = "SEC";
		String FLEX = "FLEX";
		// Tela de interação

		String msg1 = " ESCOLHA A OPERAÇÃO:";
		String msg2 = "Deseja visualizar o documento? (s/n)";
		String msg3 = "Informe a variável de esquema a ser utilizada (1) siplagSchema (2) securitySchema (3) flexvisionSchema ";
		String barra =  "--------------------------------------";
		String barra2 = "1 - Create Table                      ";
		String barra3 = "--------------------------------------";
		String barra4 = "2 - Alter Table Add Column            ";
		String barra5 = "--------------------------------------";
		String barra6 = "3 - Alter Table Drop Column           ";
		String barra7 = "--------------------------------------";
		String barra8 = "4 - Alter Table Modify Column         ";
		String barra9 = "--------------------------------------";
		String barra10 ="5 - Alter Table Rename Column         ";
		String barra11 ="--------------------------------------";
		String barra12 ="6 - Alter Table Create Primary Key    ";
		String barra13 ="--------------------------------------";
		String barra14 ="7 - Alter Table Create Foreign Key    ";
		String barra15 ="--------------------------------------";
		String barra16 ="8 - Alter Table Create Unique Key     ";
		String barra17 ="--------------------------------------";
		String barra18 ="9 - Create Index                      ";
		String barra19 ="--------------------------------------";
		String barra20 ="10 - Insert                           ";
		String barra21 ="--------------------------------------";
		String barra22 ="11 - Add Comments                     ";
		String barra23 ="--------------------------------------";
		String barra24 ="12 - Drop Table                       ";
		String barra25 ="--------------------------------------";
		String barra26 ="13 - Drop Constraint                  ";
		String barra27 ="--------------------------------------";
		String barra28 ="14 - Drop Index                       ";
		String barra29 ="--------------------------------------";
		String barra30 ="15 - Create View                      ";
		String barra31 ="--------------------------------------";
		String barra32 ="16 - Drop View                        ";
		String barra33 ="--------------------------------------";
		String barra34 ="0  -  Sair                            ";
		String barra35 ="--------------------------------------"; 

		// variaveis

		String siplagSchema     = "${siplagSchema}";
		String securitySchema   = "${securitySchema}";
		String flexvisionSchema = "${flexvisionSchema}"; //nova variavel adicionada flexvision

		String nome = "V_ESQUEMA";
		String tabela ="V_TABELA";

		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		// mensagens
		System.out.println("==>" + msg1);
		System.out.println(barra);
		System.out.println(barra2);
		System.out.println(barra3);
		System.out.println(barra4);
		System.out.println(barra5);
		System.out.println(barra6);
		System.out.println(barra7);
		System.out.println(barra8);
		System.out.println(barra9);
		System.out.println(barra10);
		System.out.println(barra11);
		System.out.println(barra12);
		System.out.println(barra13);
		System.out.println(barra14);
		System.out.println(barra15);
		System.out.println(barra16);
		System.out.println(barra17);
		System.out.println(barra18);
		System.out.println(barra19);
		System.out.println(barra20);
		System.out.println(barra21);
		System.out.println(barra22);
		System.out.println(barra23);
		System.out.println(barra24);
		System.out.println(barra25);
		System.out.println(barra26);
		System.out.println(barra27);
		System.out.println(barra28);
		System.out.println(barra29);
		System.out.println(barra30);
		System.out.println(barra31);
		System.out.println(barra32);
		System.out.println(barra33);	
		System.out.println(barra34);
		System.out.println(barra35);

		System.out.println("                                               -ScriptGenerator 1.2");


		// Entrada com a opçao desejada
		operacao = entrada.nextInt();

		switch (operacao) {
		
		//Case alteração de schema
		case 1:
			System.out.println("Iniciando...");
			//Iteracao temp1 = new Iteracao();
			String script = createTable();

			// Condicao de escolha, caso o usuario deseje visualizar o documento
			System.out.println(msg2);

			String escolha = input.nextLine();
			if (escolha.equalsIgnoreCase("s")) {

				System.out.println(script);
			} else {
			}

			System.out.println(msg3);
			System.out.println(barra);
			System.out.println("(1)" + siplagSchema);
			System.out.println(barra);
			System.out.println("(2)" + securitySchema);
			System.out.println(barra);
			System.out.println("(3)" + flexvisionSchema);
			System.out.println(barra);


			numero1 = entrada.nextFloat();
			
			// Alteraçao de variaveis do arquivo selecionado

			if (numero1 == 1) {
				
				@SuppressWarnings("resource")
				Scanner rename = new Scanner(System.in);
				/**
				System.out.println("\n Por favor informe o Prefixo (1)SIP (2)SEC (3)FLEX:\n");					
				String prefixo = rename.nextLine();
				**/
				System.out.println("\n Por favor informe a ISSUE:\n");
				String ISSUE = rename.nextLine();
				
				System.out.println("\n Tabela/View/Index:\n");
				String schema = rename.nextLine();

				OutputStream bytes = new FileOutputStream(""+SIP+"_"+Iteracao.getDateForm()+"__"+ISSUE+"_CREATE_"+schema+".sql");
				//Substituição de Variaveis dentro de template
				OutputStreamWriter chars = new OutputStreamWriter(bytes);
				BufferedWriter strings = new BufferedWriter(chars);
				script = script.replace(nome, siplagSchema);
				script = script.replace(tabela, schema);
				strings.write(script);
				strings.close();
				
				System.out.println(" Um novo script foi gerado!");

				JOptionPane.showMessageDialog(null, "Um novo Script foi gerado!");
				
				
			} else if(numero1 == 2){
				
				@SuppressWarnings("resource")
				Scanner rename = new Scanner(System.in);
				/**
				System.out.println("\n Por favor informe o Prefixo (SIP, SEC):\n");
				String prefixo = rename.nextLine();
				**/
				System.out.println("\n Por favor informe a ISSUE:\n");
				String ISSUE = rename.nextLine();

				System.out.println("\n Tabela/View/Index:\n");
				String schema = rename.nextLine();
				
				OutputStream bytes = new FileOutputStream(""+SEC+"_"+Iteracao.getDateForm()+"__"+ISSUE+"_CREATE_"+schema+".sql");
				
				//Substituição de Variaveis dentro de template
				OutputStreamWriter chars = new OutputStreamWriter(bytes);
				BufferedWriter strings = new BufferedWriter(chars);
				script = script.replace(nome, securitySchema);
				script = script.replace(tabela, schema);
				strings.write(script);
				strings.close();

				System.out.println(" Um script foi alterado!");
				JOptionPane.showMessageDialog(null, "Template foi alterado!");
			}
			
			else  {
				// novo codigo flexvisionSchema
				@SuppressWarnings("resource")
				Scanner rename = new Scanner(System.in);
				
				/**
				System.out.println("\n Por favor informe o Prefixo (SIP, SEC):\n");
				String prefixo = rename.nextLine();
				**/
				
				System.out.println("\n Por favor informe a ISSUE:\n");
				String ISSUE = rename.nextLine();

				System.out.println("\n Tabela/View/Index:\n");
				String schema = rename.nextLine();
				
				OutputStream bytes = new FileOutputStream(""+FLEX+"_"+Iteracao.getDateForm()+"__"+ISSUE+"_CREATE_"+schema+".sql");
				
				//Substituição de Variaveis dentro de template
				OutputStreamWriter chars = new OutputStreamWriter(bytes);
				BufferedWriter strings = new BufferedWriter(chars);
				script = script.replace(nome, flexvisionSchema);
				script = script.replace(tabela, schema);
				strings.write(script);
				strings.close();

				System.out.println(" Um script foi alterado!");
				JOptionPane.showMessageDialog(null, "Template foi alterado!");
			}
			
			break;

		// Case alteração de tabela
		case 2:
			
			System.out.println("Iniciando...");
			//Iteracao temp1 = new Iteracao();
			String script2 = alterTableAddColumn();

			// Condicao de escolha, caso o usuario deseje visualizar o documento
			System.out.println(msg2);

			String escolha2 = input.nextLine();
			if (escolha2.equalsIgnoreCase("s")) {

				System.out.println(script2);
			} else {
			}

			System.out.println(msg3);
			System.out.println(barra);
			System.out.println("(1)" + siplagSchema);
			System.out.println(barra);
			System.out.println("(2)" + securitySchema);
			System.out.println(barra);
			System.out.println("(3)" + flexvisionSchema);
			System.out.println(barra);
			numero1 = entrada.nextFloat();

			// Alteraçao de variaveis do arquivo selecionado

			if (numero1 == 1) {
				
				
				@SuppressWarnings("resource")
				Scanner rename = new Scanner(System.in);
				
				/**
				System.out.println("\n Por favor informe o Prefixo (SIP, SEC):\n");
				String prefixo = rename.nextLine();
				**/
				
				System.out.println("\n Por favor informe a ISSUE:\n");
				String ISSUE = rename.nextLine();

				System.out.println("\n Tabela/View/Index:\n");
				String schema = rename.nextLine();

				
				OutputStream bytes = new FileOutputStream(""+SIP+"_"+Iteracao.getDateForm()+"__"+ISSUE+"_ALTER_"+schema+".sql");
				
				//Substituição de Variaveis dentro de template
				OutputStreamWriter chars = new OutputStreamWriter(bytes);
				BufferedWriter strings = new BufferedWriter(chars);
				script = script2.replace(nome, siplagSchema);
				script = script.replace(tabela, schema);
				strings.write(script);
				strings.close();
				
				System.out.println(" Um script foi gerado!");
				JOptionPane.showMessageDialog(null, "Um novo script foi gerado!");

			} else if(numero1 == 2) {
				
				@SuppressWarnings("resource")
				Scanner rename = new Scanner(System.in);
				
				/**
				System.out.println("\n Por favor informe o Prefixo (SIP, SEC):\n");
				String prefixo = rename.nextLine();
				**/
				
				System.out.println("\n Por favor informe a ISSUE:\n");
				String ISSUE = rename.nextLine();

				System.out.println("\n Tabela/View/Index:\n");
				String schema = rename.nextLine();
				
				OutputStream bytes = new FileOutputStream(""+SEC+"_"+Iteracao.getDateForm()+"__"+ISSUE+"_ALTER_"+schema+".sql");
				//Substituição de Variaveis dentro de template
				OutputStreamWriter chars = new OutputStreamWriter(bytes);
				BufferedWriter strings = new BufferedWriter(chars);
				script = script2.replace(nome, securitySchema);
				script = script.replace(tabela, schema);
				strings.write(script);
				strings.close();
				
				System.out.println(" Um script foi gerado!");
				JOptionPane.showMessageDialog(null, "Um novo script foi gerado!");
			}
			
			else  {
				// novo codigo flexvisionSchema
				@SuppressWarnings("resource")
				Scanner rename = new Scanner(System.in);
				/**
				System.out.println("\n Por favor informe o Prefixo (SIP, SEC):\n");
				String prefixo = rename.nextLine();
				**/
				System.out.println("\n Por favor informe a ISSUE:\n");
				String ISSUE = rename.nextLine();

				System.out.println("\n Tabela/View/Index:\n");
				String schema = rename.nextLine();
				
				OutputStream bytes = new FileOutputStream(""+FLEX+"_"+Iteracao.getDateForm()+"__"+ISSUE+"_CREATE_"+schema+".sql");

				//Substituição de Variaveis dentro de template
				OutputStreamWriter chars = new OutputStreamWriter(bytes);
				BufferedWriter strings = new BufferedWriter(chars);
				script = script2.replace(nome, flexvisionSchema);
				script = script.replace(tabela, schema);
				strings.write(script);
				strings.close();
				System.out.println(" Um script foi gerado!");
				JOptionPane.showMessageDialog(null, "Um novo script foi gerado!");
			}

			break;

		case 3:

			System.out.println("Iniciando...");
			//Iteracao temp1 = new Iteracao();
			String script3 = alterTableDropColumn();

			// Condicao de escolha, caso o usuario deseje visualizar o documento
			System.out.println(msg2);

			String escolha3 = input.nextLine();
			if (escolha3.equalsIgnoreCase("s")) {

				System.out.println(script3);
			} else {
			}

			System.out.println(msg3);
			System.out.println(barra);
			System.out.println("(1)" + siplagSchema);
			System.out.println(barra);
			System.out.println("(2)" + securitySchema);
			System.out.println(barra);
			System.out.println("(3)" + flexvisionSchema);
			System.out.println(barra);
			
			numero1 = entrada.nextFloat();

			// Alteraçao de variaveis do arquivo selecionado

			if (numero1 == 1) {
				
				
				@SuppressWarnings("resource")
				Scanner rename = new Scanner(System.in);
				/**
				System.out.println("\n Por favor informe o Prefixo (SIP, SEC):\n");
				String prefixo = rename.nextLine();
				**/
				System.out.println("\n Por favor informe a ISSUE:\n");
				String ISSUE = rename.nextLine();

				System.out.println("\n Tabela/View/Index:\n");
				String schema = rename.nextLine();

				
				OutputStream bytes = new FileOutputStream(""+SIP+"_"+Iteracao.getDateForm()+"__"+ISSUE+"_ALTER_"+schema+".sql");
				
				//Substituição de Variaveis dentro de template
				OutputStreamWriter chars = new OutputStreamWriter(bytes);
				BufferedWriter strings = new BufferedWriter(chars);
				script = script3.replace(nome, siplagSchema);
				script = script.replace(tabela, schema);
				strings.write(script);
				strings.close();
				System.out.println(" Um script foi gerado!");
				JOptionPane.showMessageDialog(null, "Um novo script foi gerado!");

			}else if(numero1 == 2) {
				
				@SuppressWarnings("resource")
				Scanner rename = new Scanner(System.in);
				/**
				System.out.println("\n Por favor informe o Prefixo (SIP, SEC):\n");
				String prefixo = rename.nextLine();
				**/
				System.out.println("\n Por favor informe a ISSUE:\n");
				String ISSUE = rename.nextLine();

				System.out.println("\n Tabela/View/Index:\n");
				String schema = rename.nextLine();
				
				OutputStream bytes = new FileOutputStream(""+SEC+"_"+Iteracao.getDateForm()+"__"+ISSUE+"_ALTER_"+schema+".sql");
				//Substituição de Variaveis dentro de template
				OutputStreamWriter chars = new OutputStreamWriter(bytes);
				BufferedWriter strings = new BufferedWriter(chars);
				script = script3.replace(nome, securitySchema);
				script = script.replace(tabela, schema);
				strings.write(script);
				strings.close();
				System.out.println(" Um script foi gerado!");
				JOptionPane.showMessageDialog(null, "Um novo script foi gerado!");
			}
			
			else  {
				// novo codigo flexvisionSchema
				@SuppressWarnings("resource")
				Scanner rename = new Scanner(System.in);
				/**
				System.out.println("\n Por favor informe o Prefixo (SIP, SEC):\n");
				String prefixo = rename.nextLine();
				**/
				System.out.println("\n Por favor informe a ISSUE:\n");
				String ISSUE = rename.nextLine();

				System.out.println("\n Tabela/View/Index:\n");
				String schema = rename.nextLine();
				
				OutputStream bytes = new FileOutputStream(""+FLEX+"_"+Iteracao.getDateForm()+"__"+ISSUE+"_CREATE_"+schema+".sql");
				//Substituição de Variaveis dentro de template
				OutputStreamWriter chars = new OutputStreamWriter(bytes);
				BufferedWriter strings = new BufferedWriter(chars);
				script = script3.replace(nome, flexvisionSchema);
				script = script.replace(tabela, schema);
				strings.write(script);
				strings.close();
				System.out.println(" Um script foi gerado!");
				JOptionPane.showMessageDialog(null, "Um novo script foi gerado!");
			}
			break;
			
			
			
		case 4:
			

			System.out.println("Iniciando...");
			//Iteracao temp1 = new Iteracao();
			String script4 = alterTableModifyColumn();

			// Condicao de escolha, caso o usuario deseje visualizar o documento
			System.out.println(msg2);

			String escolha4 = input.nextLine();
			if (escolha4.equalsIgnoreCase("s")) {

				System.out.println(script4);
			} else {
			}

			System.out.println(msg3);
			System.out.println(barra);
			System.out.println("(1)" + siplagSchema);
			System.out.println(barra);
			System.out.println("(2)" + securitySchema);
			System.out.println(barra);
			System.out.println("(3)" + flexvisionSchema);
			System.out.println(barra);

			numero1 = entrada.nextFloat();

			// Alteraçao de variaveis do arquivo selecionado

			if (numero1 == 1) {
				
				
				@SuppressWarnings("resource")
				Scanner rename = new Scanner(System.in);
				/**
				System.out.println("\n Por favor informe o Prefixo (SIP, SEC):\n");
				String prefixo = rename.nextLine();
				**/
				System.out.println("\n Por favor informe a ISSUE:\n");
				String ISSUE = rename.nextLine();

				System.out.println("\n Tabela/View/Index:\n");
				String schema = rename.nextLine();

				
				OutputStream bytes = new FileOutputStream(""+SIP+"_"+Iteracao.getDateForm()+"__"+ISSUE+"_ALTER_"+schema+".sql");
				
				//Substituição de Variaveis dentro de template
				OutputStreamWriter chars = new OutputStreamWriter(bytes);
				BufferedWriter strings = new BufferedWriter(chars);
				script = script4.replace(nome, siplagSchema);
				script = script.replace(tabela, schema);
				strings.write(script);
				strings.close();
				System.out.println(" Um script foi gerado!");
				JOptionPane.showMessageDialog(null, "Um novo script foi gerado!");

			}else if(numero1 == 2) {
				
				@SuppressWarnings("resource")
				Scanner rename = new Scanner(System.in);
				/**
				System.out.println("\n Por favor informe o Prefixo (SIP, SEC):\n");
				String prefixo = rename.nextLine();
				**/
				System.out.println("\n Por favor informe a ISSUE:\n");
				String ISSUE = rename.nextLine();

				System.out.println("\n Tabela/View/Index:\n");
				String schema = rename.nextLine();
				
				OutputStream bytes = new FileOutputStream(""+SEC+"_"+Iteracao.getDateForm()+"__"+ISSUE+"_ALTER_"+schema+".sql");
				//Substituição de Variaveis dentro de template
				OutputStreamWriter chars = new OutputStreamWriter(bytes);
				BufferedWriter strings = new BufferedWriter(chars);
				script = script4.replace(nome, securitySchema);
				script = script.replace(tabela, schema);
				strings.write(script);
				strings.close();
				System.out.println(" Um script foi gerado!");
				JOptionPane.showMessageDialog(null, "Um novo script foi gerado!");
			}
			
			else  {
				// novo codigo flexvisionSchema
				@SuppressWarnings("resource")
				Scanner rename = new Scanner(System.in);
				/**
				System.out.println("\n Por favor informe o Prefixo (SIP, SEC):\n");
				String prefixo = rename.nextLine();
				**/
				System.out.println("\n Por favor informe a ISSUE:\n");
				String ISSUE = rename.nextLine();

				System.out.println("\n Tabela/View/Index:\n");
				String schema = rename.nextLine();
				
				OutputStream bytes = new FileOutputStream(""+FLEX+"_"+Iteracao.getDateForm()+"__"+ISSUE+"_CREATE_"+schema+".sql");
				//Substituição de Variaveis dentro de template
				OutputStreamWriter chars = new OutputStreamWriter(bytes);
				BufferedWriter strings = new BufferedWriter(chars);
				script = script4.replace(nome, flexvisionSchema);
				script = script.replace(tabela, schema);
				strings.write(script);
				strings.close();
				System.out.println(" Um script foi gerado!");
				JOptionPane.showMessageDialog(null, "Um novo script foi gerado!");
			}
			break;
		case 5: 
			
			System.out.println("Iniciando...");
			//Iteracao temp1 = new Iteracao();
			String script5 = alterTableRenameColumn();

			// Condicao de escolha, caso o usuario deseje visualizar o documento
			System.out.println(msg2);

			String escolha5 = input.nextLine();
			if (escolha5.equalsIgnoreCase("s")) {

				System.out.println(script5);
			} else {
			}

			System.out.println(msg3);
			System.out.println(barra);
			System.out.println("(1)" + siplagSchema);
			System.out.println(barra);
			System.out.println("(2)" + securitySchema);
			System.out.println(barra);
			System.out.println("(3)" + flexvisionSchema);
			System.out.println(barra);

			numero1 = entrada.nextFloat();

			// Alteraçao de variaveis do arquivo selecionado

			if (numero1 == 1) {
				
				
				@SuppressWarnings("resource")
				Scanner rename = new Scanner(System.in);
				/**
				System.out.println("\n Por favor informe o Prefixo (SIP, SEC):\n");
				String prefixo = rename.nextLine();
				**/
				System.out.println("\n Por favor informe a ISSUE:\n");
				String ISSUE = rename.nextLine();

				System.out.println("\n Tabela/View/Index:\n");
				String schema = rename.nextLine();

				
				OutputStream bytes = new FileOutputStream(""+SIP+"_"+Iteracao.getDateForm()+"__"+ISSUE+"_ALTER_"+schema+".sql");
				
				//Substituição de Variaveis dentro de template
				OutputStreamWriter chars = new OutputStreamWriter(bytes);
				BufferedWriter strings = new BufferedWriter(chars);
				script = script5.replace(nome, siplagSchema);
				script = script.replace(tabela, schema);
				strings.write(script);
				strings.close();
				System.out.println(" Um script foi gerado!");
				JOptionPane.showMessageDialog(null, "Um novo script foi gerado!");

			} else if(numero1 == 2) {
				
				@SuppressWarnings("resource")
				Scanner rename = new Scanner(System.in);
				/**
				System.out.println("\n Por favor informe o Prefixo (SIP, SEC):\n");
				String prefixo = rename.nextLine();
				**/
				System.out.println("\n Por favor informe a ISSUE:\n");
				String ISSUE = rename.nextLine();

				System.out.println("\n Tabela/View/Index:\n");
				String schema = rename.nextLine();
				
				OutputStream bytes = new FileOutputStream(""+SEC+"_"+Iteracao.getDateForm()+"__"+ISSUE+"_ALTER_"+schema+".sql");
				//Substituição de Variaveis dentro de template
				OutputStreamWriter chars = new OutputStreamWriter(bytes);
				BufferedWriter strings = new BufferedWriter(chars);
				script = script5.replace(nome, securitySchema);
				script = script.replace(tabela, schema);
				strings.write(script);
				strings.close();
				System.out.println(" Um script foi gerado!");
				JOptionPane.showMessageDialog(null, "Um novo script foi gerado!");
			}
			
			else  {
				// novo codigo flexvisionSchema
				@SuppressWarnings("resource")
				Scanner rename = new Scanner(System.in);
				/**
				System.out.println("\n Por favor informe o Prefixo (SIP, SEC):\n");
				String prefixo = rename.nextLine();
				**/
				System.out.println("\n Por favor informe a ISSUE:\n");
				String ISSUE = rename.nextLine();

				System.out.println("\n Tabela/View/Index:\n");
				String schema = rename.nextLine();
				
				OutputStream bytes = new FileOutputStream(""+FLEX+"_"+Iteracao.getDateForm()+"__"+ISSUE+"_CREATE_"+schema+".sql");
				//Substituição de Variaveis dentro de template
				OutputStreamWriter chars = new OutputStreamWriter(bytes);
				BufferedWriter strings = new BufferedWriter(chars);
				script = script5.replace(nome, flexvisionSchema);
				script = script.replace(tabela, schema);
				strings.write(script);
				strings.close();
				System.out.println(" Um script foi gerado!");
				JOptionPane.showMessageDialog(null, "Um novo script foi gerado!");
			}
			
			break;
      case 6: 
			
			System.out.println("Iniciando...");
			//Iteracao temp1 = new Iteracao();
			String script6 = alterTableCreatePrimaryKey();

			// Condicao de escolha, caso o usuario deseje visualizar o documento
			System.out.println(msg2);

			String escolha6 = input.nextLine();
			if (escolha6.equalsIgnoreCase("s")) {

				System.out.println(script6);
			} else {
			}

			System.out.println(msg3);
			System.out.println(barra);
			System.out.println("(1)" + siplagSchema);
			System.out.println(barra);
			System.out.println("(2)" + securitySchema);
			System.out.println(barra);
			System.out.println("(3)" + flexvisionSchema);
			System.out.println(barra);

			numero1 = entrada.nextFloat();

			// Alteraçao de variaveis do arquivo selecionado

			if (numero1 == 1) {
				
				
				@SuppressWarnings("resource")
				Scanner rename = new Scanner(System.in);
				/**
				System.out.println("\n Por favor informe o Prefixo (SIP, SEC):\n");
				String prefixo = rename.nextLine();
				**/
				System.out.println("\n Por favor informe a ISSUE:\n");
				String ISSUE = rename.nextLine();

				System.out.println("\n Tabela/View/Index:\n");
				String schema = rename.nextLine();

				
				OutputStream bytes = new FileOutputStream(""+SIP+"_"+Iteracao.getDateForm()+"__"+ISSUE+"_ALTER_"+schema+".sql");
				
				//Substituição de Variaveis dentro de template
				OutputStreamWriter chars = new OutputStreamWriter(bytes);
				BufferedWriter strings = new BufferedWriter(chars);
				script = script6.replace(nome, siplagSchema);
				script = script.replace(tabela, schema);
				strings.write(script);
				strings.close();
				System.out.println(" Um script foi gerado!");
				JOptionPane.showMessageDialog(null, "Um novo script foi gerado!");

			} else if(numero1 == 2) {
				
				@SuppressWarnings("resource")
				Scanner rename = new Scanner(System.in);
				/**
				System.out.println("\n Por favor informe o Prefixo (SIP, SEC):\n");
				String prefixo = rename.nextLine();
				**/
				System.out.println("\n Por favor informe a ISSUE:\n");
				String ISSUE = rename.nextLine();

				System.out.println("\n Tabela/View/Index:\n");
				String schema = rename.nextLine();
				
				OutputStream bytes = new FileOutputStream(""+SEC+"_"+Iteracao.getDateForm()+"__"+ISSUE+"_ALTER_"+schema+".sql");
				//Substituição de Variaveis dentro de template
				OutputStreamWriter chars = new OutputStreamWriter(bytes);
				BufferedWriter strings = new BufferedWriter(chars);
				script = script6.replace(nome, securitySchema);
				script = script.replace(tabela, schema);
				strings.write(script);
				strings.close();
				System.out.println(" Um script foi gerado!");
				JOptionPane.showMessageDialog(null, "Um novo script foi gerado!");
			}
			else  {
				// novo codigo flexvisionSchema
				@SuppressWarnings("resource")
				Scanner rename = new Scanner(System.in);
				/**
				System.out.println("\n Por favor informe o Prefixo (SIP, SEC):\n");
				String prefixo = rename.nextLine();
				**/
				System.out.println("\n Por favor informe a ISSUE:\n");
				String ISSUE = rename.nextLine();

				System.out.println("\n Tabela/View/Index:\n");
				String schema = rename.nextLine();
				
				OutputStream bytes = new FileOutputStream(""+FLEX+"_"+Iteracao.getDateForm()+"__"+ISSUE+"_CREATE_"+schema+".sql");
				//Substituição de Variaveis dentro de template
				OutputStreamWriter chars = new OutputStreamWriter(bytes);
				BufferedWriter strings = new BufferedWriter(chars);
				script = script6.replace(nome, flexvisionSchema);
				script = script.replace(tabela, schema);
				strings.write(script);
				strings.close();
				System.out.println(" Um script foi gerado!");
				JOptionPane.showMessageDialog(null, "Um novo script foi gerado!");
			}
			break;
case 7: 
	
	System.out.println("Iniciando...");
	//Iteracao temp1 = new Iteracao();
	String script7 = alterTableCreateForeignKey();

	// Condicao de escolha, caso o usuario deseje visualizar o documento
	System.out.println(msg2);

	String escolha7 = input.nextLine();
	if (escolha7.equalsIgnoreCase("s")) {

		System.out.println(script7);
	} else {
	}

	System.out.println(msg3);
	System.out.println(barra);
	System.out.println("(1)" + siplagSchema);
	System.out.println(barra);
	System.out.println("(2)" + securitySchema);
	System.out.println(barra);
	System.out.println("(3)" + flexvisionSchema);
	System.out.println(barra);
	
	numero1 = entrada.nextFloat();

	// Alteraçao de variaveis do arquivo selecionado

	if (numero1 == 1) {
		
		
		@SuppressWarnings("resource")
		Scanner rename = new Scanner(System.in);
		/**
		System.out.println("\n Por favor informe o Prefixo (SIP, SEC):\n");
		String prefixo = rename.nextLine();
		**/
		System.out.println("\n Por favor informe a ISSUE:\n");
		String ISSUE = rename.nextLine();

		System.out.println("\n Tabela/View/Index:\n");
		String schema = rename.nextLine();

		
		OutputStream bytes = new FileOutputStream(""+SIP+"_"+Iteracao.getDateForm()+"__"+ISSUE+"_ALTER_"+schema+".sql");
		
		//Substituição de Variaveis dentro de template
		OutputStreamWriter chars = new OutputStreamWriter(bytes);
		BufferedWriter strings = new BufferedWriter(chars);
		script = script7.replace(nome, siplagSchema);
		script = script.replace(tabela, schema);
		strings.write(script);
		strings.close();
		System.out.println(" Um script foi gerado!");
		JOptionPane.showMessageDialog(null, "Um novo script foi gerado!");
		
	}else if(numero1 == 2) {
		
		@SuppressWarnings("resource")
		Scanner rename = new Scanner(System.in);
		/**
		System.out.println("\n Por favor informe o Prefixo (SIP, SEC):\n");
		String prefixo = rename.nextLine();
		**/
		System.out.println("\n Por favor informe a ISSUE:\n");
		String ISSUE = rename.nextLine();

		System.out.println("\n Tabela/View/Index:\n");
		String schema = rename.nextLine();
		
		OutputStream bytes = new FileOutputStream(""+SEC+"_"+Iteracao.getDateForm()+"__"+ISSUE+"_ALTER_"+schema+".sql");
		//Substituição de Variaveis dentro de template
		OutputStreamWriter chars = new OutputStreamWriter(bytes);
		BufferedWriter strings = new BufferedWriter(chars);
		script = script7.replace(nome, securitySchema);
		script = script.replace(tabela, schema);
		strings.write(script);
		strings.close();
		System.out.println(" Um script foi gerado!");
		JOptionPane.showMessageDialog(null, "Um novo script foi gerado!");
	}else  {
		// novo codigo flexvisionSchema
		@SuppressWarnings("resource")
		Scanner rename = new Scanner(System.in);
		/**
		System.out.println("\n Por favor informe o Prefixo (SIP, SEC):\n");
		String prefixo = rename.nextLine();
		**/
		System.out.println("\n Por favor informe a ISSUE:\n");
		String ISSUE = rename.nextLine();

		System.out.println("\n Tabela/View/Index:\n");
		String schema = rename.nextLine();
		
		OutputStream bytes = new FileOutputStream(""+FLEX+"_"+Iteracao.getDateForm()+"__"+ISSUE+"_CREATE_"+schema+".sql");
		//Substituição de Variaveis dentro de template
		OutputStreamWriter chars = new OutputStreamWriter(bytes);
		BufferedWriter strings = new BufferedWriter(chars);
		script = script7.replace(nome, flexvisionSchema);
		script = script.replace(tabela, schema);
		strings.write(script);
		strings.close();
		System.out.println(" Um script foi gerado!");
		JOptionPane.showMessageDialog(null, "Um novo script foi gerado!");
	}
	break;
			
case 8: 
	
	System.out.println("Iniciando...");
	//Iteracao temp1 = new Iteracao();
	String script8 = alterTableCreateUniqueKey();

	// Condicao de escolha, caso o usuario deseje visualizar o documento
	System.out.println(msg2);

	String escolha8 = input.nextLine();
	if (escolha8.equalsIgnoreCase("s")) {

		System.out.println(script8);
	} else {
	}

	System.out.println(msg3);
	System.out.println(barra);
	System.out.println("(1)" + siplagSchema);
	System.out.println(barra);
	System.out.println("(2)" + securitySchema);
	System.out.println(barra);
	System.out.println("(3)" + flexvisionSchema);
	System.out.println(barra);

	numero1 = entrada.nextFloat();

	// Alteraçao de variaveis do arquivo selecionado

	if (numero1 == 1) {
		
		
		@SuppressWarnings("resource")
		Scanner rename = new Scanner(System.in);
		/**
		System.out.println("\n Por favor informe o Prefixo (SIP, SEC):\n");
		String prefixo = rename.nextLine();
		**/
		System.out.println("\n Por favor informe a ISSUE:\n");
		String ISSUE = rename.nextLine();

		System.out.println("\n Tabela/View/Index:\n");
		String schema = rename.nextLine();

		
		OutputStream bytes = new FileOutputStream(""+SIP+"_"+Iteracao.getDateForm()+"__"+ISSUE+"_ALTER_"+schema+".sql");
		
		//Substituição de Variaveis dentro de template
		OutputStreamWriter chars = new OutputStreamWriter(bytes);
		BufferedWriter strings = new BufferedWriter(chars);
		script = script8.replace(nome, siplagSchema);
		script = script.replace(tabela, schema);
		strings.write(script);
		strings.close();
		System.out.println(" Um script foi gerado!");
		JOptionPane.showMessageDialog(null, "Um novo script foi gerado!");
		
	}else if(numero1 == 2) {
		
		@SuppressWarnings("resource")
		Scanner rename = new Scanner(System.in);
		/**
		System.out.println("\n Por favor informe o Prefixo (SIP, SEC):\n");
		String prefixo = rename.nextLine();
		**/
		System.out.println("\n Por favor informe a ISSUE:\n");
		String ISSUE = rename.nextLine();

		System.out.println("\n Tabela/View/Index:\n");
		String schema = rename.nextLine();
		
		OutputStream bytes = new FileOutputStream(""+SEC+"_"+Iteracao.getDateForm()+"__"+ISSUE+"_ALTER_"+schema+".sql");
		//Substituição de Variaveis dentro de template
		OutputStreamWriter chars = new OutputStreamWriter(bytes);
		BufferedWriter strings = new BufferedWriter(chars);
		script = script8.replace(nome, securitySchema);
		script = script.replace(tabela, schema);
		strings.write(script);
		strings.close();
		System.out.println(" Um script foi gerado!");
		JOptionPane.showMessageDialog(null, "Um novo script foi gerado!");
	}
	else  {
		// novo codigo flexvisionSchema
		@SuppressWarnings("resource")
		Scanner rename = new Scanner(System.in);
		/**
		System.out.println("\n Por favor informe o Prefixo (SIP, SEC):\n");
		String prefixo = rename.nextLine();
		**/
		System.out.println("\n Por favor informe a ISSUE:\n");
		String ISSUE = rename.nextLine();

		System.out.println("\n Tabela/View/Index:\n");
		String schema = rename.nextLine();
		
		OutputStream bytes = new FileOutputStream(""+FLEX+"_"+Iteracao.getDateForm()+"__"+ISSUE+"_CREATE_"+schema+".sql");
		//Substituição de Variaveis dentro de template
		OutputStreamWriter chars = new OutputStreamWriter(bytes);
		BufferedWriter strings = new BufferedWriter(chars);
		script = script8.replace(nome, flexvisionSchema);
		script = script.replace(tabela, schema);
		strings.write(script);
		strings.close();
		System.out.println(" Um script foi gerado!");
		JOptionPane.showMessageDialog(null, "Um novo script foi gerado!");
	}
	break;
	
case 9: 
	
	System.out.println("Iniciando...");
	//Iteracao temp1 = new Iteracao();
	String script9 = alterTableCreateIndex();

	// Condicao de escolha, caso o usuario deseje visualizar o documento
	System.out.println(msg2);

	String escolha9 = input.nextLine();
	if (escolha9.equalsIgnoreCase("s")) {

		System.out.println(script9);
	} else {
	}

	System.out.println(msg3);
	System.out.println(barra);
	System.out.println("(1)" + siplagSchema);
	System.out.println(barra);
	System.out.println("(2)" + securitySchema);
	System.out.println(barra);
	System.out.println("(3)" + flexvisionSchema);
	System.out.println(barra);

	numero1 = entrada.nextFloat();

	// Alteraçao de variaveis do arquivo selecionado

	if (numero1 == 1) {
		
		
		@SuppressWarnings("resource")
		Scanner rename = new Scanner(System.in);
		/**
		System.out.println("\n Por favor informe o Prefixo (SIP, SEC):\n");
		String prefixo = rename.nextLine();
		**/
		System.out.println("\n Por favor informe a ISSUE:\n");
		String ISSUE = rename.nextLine();

		System.out.println("\n Tabela/View/Index:\n");
		String schema = rename.nextLine();

		
		OutputStream bytes = new FileOutputStream(""+SIP+"_"+Iteracao.getDateForm()+"__"+ISSUE+"_CREATE_IDX_"+schema+".sql");
		
		//Substituição de Variaveis dentro de template
		OutputStreamWriter chars = new OutputStreamWriter(bytes);
		BufferedWriter strings = new BufferedWriter(chars);
		script = script9.replace(nome, siplagSchema);
		script = script.replace(tabela, schema);
		strings.write(script);
		strings.close();
		System.out.println(" Um script foi gerado!");
		JOptionPane.showMessageDialog(null, "Um novo script foi gerado!");

	}else if(numero1 == 2) {
		
		@SuppressWarnings("resource")
		Scanner rename = new Scanner(System.in);
		/**
		System.out.println("\n Por favor informe o Prefixo (SIP, SEC):\n");
		String prefixo = rename.nextLine();
		**/
		System.out.println("\n Por favor informe a ISSUE:\n");
		String ISSUE = rename.nextLine();

		System.out.println("\n Tabela/View/Index:\n");
		String schema = rename.nextLine();
		
		OutputStream bytes = new FileOutputStream(""+SEC+"_"+Iteracao.getDateForm()+"__"+ISSUE+"_CREATE_IDX_"+schema+".sql");
		//Substituição de Variaveis dentro de template
		OutputStreamWriter chars = new OutputStreamWriter(bytes);
		BufferedWriter strings = new BufferedWriter(chars);
		script = script9.replace(nome, securitySchema);
		script = script.replace(tabela, schema);
		strings.write(script);
		strings.close();
		System.out.println(" Um script foi gerado!");
		JOptionPane.showMessageDialog(null, "Um novo script foi gerado!");
	}
	else  {
		// novo codigo flexvisionSchema
		@SuppressWarnings("resource")
		Scanner rename = new Scanner(System.in);
		/**
		System.out.println("\n Por favor informe o Prefixo (SIP, SEC):\n");
		String prefixo = rename.nextLine();
		**/
		System.out.println("\n Por favor informe a ISSUE:\n");
		String ISSUE = rename.nextLine();

		System.out.println("\n Tabela/View/Index:\n");
		String schema = rename.nextLine();
		
		OutputStream bytes = new FileOutputStream(""+FLEX+"_"+Iteracao.getDateForm()+"__"+ISSUE+"_CREATE_"+schema+".sql");
		//Substituição de Variaveis dentro de template
				OutputStreamWriter chars = new OutputStreamWriter(bytes);
				BufferedWriter strings = new BufferedWriter(chars);
				script = script9.replace(nome, flexvisionSchema);
				script = script.replace(tabela, schema);
				strings.write(script);
				strings.close();
		System.out.println(" Um script foi gerado!");
		JOptionPane.showMessageDialog(null, "Um novo script foi gerado!");
	}
	break;
case 10: 
	
	System.out.println("Iniciando...");
	//Iteracao temp1 = new Iteracao();
	String script10 = insert();

	// Condicao de escolha, caso o usuario deseje visualizar o documento
	System.out.println(msg2);

	String escolha10 = input.nextLine();
	if (escolha10.equalsIgnoreCase("s")) {

		System.out.println(script10);
	} else {
	}

	System.out.println(msg3);
	System.out.println(barra);
	System.out.println("(1)" + siplagSchema);
	System.out.println(barra);
	System.out.println("(2)" + securitySchema);
	System.out.println(barra);
	System.out.println("(3)" + flexvisionSchema);
	System.out.println(barra);

	numero1 = entrada.nextFloat();

	// Alteraçao de variaveis do arquivo selecionado

	if (numero1 == 1) {
		
		
		@SuppressWarnings("resource")
		Scanner rename = new Scanner(System.in);
		/**
		System.out.println("\n Por favor informe o Prefixo (SIP, SEC):\n");
		String prefixo = rename.nextLine();
		**/
		System.out.println("\n Por favor informe a ISSUE:\n");
		String ISSUE = rename.nextLine();

		System.out.println("\n Tabela/View/Index:\n");
		String schema = rename.nextLine();

		
		OutputStream bytes = new FileOutputStream(""+SIP+"_"+Iteracao.getDateForm()+"__"+ISSUE+"_INSERT_"+schema+".sql");
		
		//Substituição de Variaveis dentro de template
				OutputStreamWriter chars = new OutputStreamWriter(bytes);
				BufferedWriter strings = new BufferedWriter(chars);
				script = script10.replace(nome, siplagSchema);
				script = script.replace(tabela, schema);
				strings.write(script);
				strings.close();
		System.out.println(" Um script foi gerado!");
		JOptionPane.showMessageDialog(null, "Um novo script foi gerado!");
	}else if(numero1 == 2) {
		
		@SuppressWarnings("resource")
		Scanner rename = new Scanner(System.in);
		/**
		System.out.println("\n Por favor informe o Prefixo (SIP, SEC):\n");
		String prefixo = rename.nextLine();
		**/
		System.out.println("\n Por favor informe a ISSUE:\n");
		String ISSUE = rename.nextLine();

		System.out.println("\n Tabela/View/Index:\n");
		String schema = rename.nextLine();
		
		OutputStream bytes = new FileOutputStream(""+SEC+"_"+Iteracao.getDateForm()+"__"+ISSUE+"_INSERT_"+schema+".sql");
		//Substituição de Variaveis dentro de template
				OutputStreamWriter chars = new OutputStreamWriter(bytes);
				BufferedWriter strings = new BufferedWriter(chars);
				script = script10.replace(nome, securitySchema);
				script = script.replace(tabela, schema);
				strings.write(script);
				strings.close();
		System.out.println(" Um script foi gerado!");
		JOptionPane.showMessageDialog(null, "Um novo script foi gerado!");
	}
	else  {
		// novo codigo flexvisionSchema
		@SuppressWarnings("resource")
		Scanner rename = new Scanner(System.in);
		/**
		System.out.println("\n Por favor informe o Prefixo (SIP, SEC):\n");
		String prefixo = rename.nextLine();
		**/
		System.out.println("\n Por favor informe a ISSUE:\n");
		String ISSUE = rename.nextLine();

		System.out.println("\n Tabela/View/Index:\n");
		String schema = rename.nextLine();
		
		OutputStream bytes = new FileOutputStream(""+FLEX+"_"+Iteracao.getDateForm()+"__"+ISSUE+"_CREATE_"+schema+".sql");
		//Substituição de Variaveis dentro de template
				OutputStreamWriter chars = new OutputStreamWriter(bytes);
				BufferedWriter strings = new BufferedWriter(chars);
				script = script10.replace(nome, flexvisionSchema);
				script = script.replace(tabela, schema);
				strings.write(script);
				strings.close();
		System.out.println(" Um script foi gerado!");
		JOptionPane.showMessageDialog(null, "Um novo script foi gerado!");
	}
	break;
	
case 11: 
	
	System.out.println("Iniciando...");
	//Iteracao temp1 = new Iteracao();
	String script11 = addComments();

	// Condicao de escolha, caso o usuario deseje visualizar o documento
	System.out.println(msg2);

	String escolha11 = input.nextLine();
	if (escolha11.equalsIgnoreCase("s")) {

		System.out.println(script11);
	} else {
	}

	System.out.println(msg3);
	System.out.println(barra);
	System.out.println("(1)" + siplagSchema);
	System.out.println(barra);
	System.out.println("(2)" + securitySchema);
	System.out.println(barra);
	System.out.println("(3)" + flexvisionSchema);
	System.out.println(barra);

	numero1 = entrada.nextFloat();

	// Alteraçao de variaveis do arquivo selecionado

	if (numero1 == 1) {
		
		
		@SuppressWarnings("resource")
		Scanner rename = new Scanner(System.in);
		/**
		System.out.println("\n Por favor informe o Prefixo (SIP, SEC):\n");
		String prefixo = rename.nextLine();
		**/
		System.out.println("\n Por favor informe a ISSUE:\n");
		String ISSUE = rename.nextLine();

		System.out.println("\n Tabela/View/Index:\n");
		String schema = rename.nextLine();

		
		OutputStream bytes = new FileOutputStream(""+SIP+"_"+Iteracao.getDateForm()+"__"+ISSUE+"_ALTER_"+schema+".sql");
		
		//Substituição de Variaveis dentro de template
				OutputStreamWriter chars = new OutputStreamWriter(bytes);
				BufferedWriter strings = new BufferedWriter(chars);
				script = script11.replace(nome, siplagSchema);
				script = script.replace(tabela, schema);
				strings.write(script);
				strings.close();
		System.out.println(" Um script foi gerado!");
		JOptionPane.showMessageDialog(null, "Um novo script foi gerado!");

	}else if(numero1 == 2) {
		
		@SuppressWarnings("resource")
		Scanner rename = new Scanner(System.in);
		/**
		System.out.println("\n Por favor informe o Prefixo (SIP, SEC):\n");
		String prefixo = rename.nextLine();
		**/
		System.out.println("\n Por favor informe a ISSUE:\n");
		String ISSUE = rename.nextLine();

		System.out.println("\n Tabela/View/Index:\n");
		String schema = rename.nextLine();
		
		OutputStream bytes = new FileOutputStream(""+SEC+"_"+Iteracao.getDateForm()+"__"+ISSUE+"_ALTER_"+schema+".sql");
		//Substituição de Variaveis dentro de template
				OutputStreamWriter chars = new OutputStreamWriter(bytes);
				BufferedWriter strings = new BufferedWriter(chars);
				script = script11.replace(nome, securitySchema);
				script = script.replace(tabela, schema);
				strings.write(script);
				strings.close();
		System.out.println(" Um script foi gerado!");
		JOptionPane.showMessageDialog(null, "Um novo script foi gerado!");
	}
	
	else  {
		// novo codigo flexvisionSchema
		@SuppressWarnings("resource")
		Scanner rename = new Scanner(System.in);
		/**
		System.out.println("\n Por favor informe o Prefixo (SIP, SEC):\n");
		String prefixo = rename.nextLine();
		**/
		System.out.println("\n Por favor informe a ISSUE:\n");
		String ISSUE = rename.nextLine();

		System.out.println("\n Tabela/View/Index:\n");
		String schema = rename.nextLine();
		
		OutputStream bytes = new FileOutputStream(""+FLEX+"_"+Iteracao.getDateForm()+"__"+ISSUE+"_CREATE_"+schema+".sql");
		//Substituição de Variaveis dentro de template
				OutputStreamWriter chars = new OutputStreamWriter(bytes);
				BufferedWriter strings = new BufferedWriter(chars);
				script = script11.replace(nome, flexvisionSchema);
				script = script.replace(tabela, schema);
				strings.write(script);
				strings.close();
		System.out.println(" Um script foi gerado!");
		JOptionPane.showMessageDialog(null, "Um novo script foi gerado!");
	}
	break;
case 12: 
	
	System.out.println("Iniciando...");
	//Iteracao temp1 = new Iteracao();
	String script12 = dropTable();

	// Condicao de escolha, caso o usuario deseje visualizar o documento
	System.out.println(msg2);

	String escolha12 = input.nextLine();
	if (escolha12.equalsIgnoreCase("s")) {

		System.out.println(script12);
	} else {
	}

	System.out.println(msg3);
	System.out.println(barra);
	System.out.println("(1)" + siplagSchema);
	System.out.println(barra);
	System.out.println("(2)" + securitySchema);
	System.out.println(barra);
	System.out.println("(3)" + flexvisionSchema);
	System.out.println(barra);

	numero1 = entrada.nextFloat();

	// Alteraçao de variaveis do arquivo selecionado

	if (numero1 == 1) {
		
		
		@SuppressWarnings("resource")
		Scanner rename = new Scanner(System.in);
		/**
		System.out.println("\n Por favor informe o Prefixo (SIP, SEC):\n");
		String prefixo = rename.nextLine();
		**/
		System.out.println("\n Por favor informe a ISSUE:\n");
		String ISSUE = rename.nextLine();

		System.out.println("\n Tabela/View/Index:\n");
		String schema = rename.nextLine();

		
		OutputStream bytes = new FileOutputStream(""+SIP+"_"+Iteracao.getDateForm()+"__"+ISSUE+"_ALTER_"+schema+".sql");
		
		//Substituição de Variaveis dentro de template
				OutputStreamWriter chars = new OutputStreamWriter(bytes);
				BufferedWriter strings = new BufferedWriter(chars);
				script = script12.replace(nome, siplagSchema);
				script = script.replace(tabela, schema);
				strings.write(script);
				strings.close();
		System.out.println(" Um script foi gerado!");
		JOptionPane.showMessageDialog(null, "Um novo script foi gerado!");
		
	}else if(numero1 == 2) {
		
		@SuppressWarnings("resource")
		Scanner rename = new Scanner(System.in);
		/**
		System.out.println("\n Por favor informe o Prefixo (SIP, SEC):\n");
		String prefixo = rename.nextLine();
		**/
		System.out.println("\n Por favor informe a ISSUE:\n");
		String ISSUE = rename.nextLine();

		System.out.println("\n Tabela/View/Index:\n");
		String schema = rename.nextLine();
		
		OutputStream bytes = new FileOutputStream(""+SEC+"_"+Iteracao.getDateForm()+"__"+ISSUE+"_ALTER_"+schema+".sql");
		//Substituição de Variaveis dentro de template
				OutputStreamWriter chars = new OutputStreamWriter(bytes);
				BufferedWriter strings = new BufferedWriter(chars);
				script = script12.replace(nome, securitySchema);
				script = script.replace(tabela, schema);
				strings.write(script);
				strings.close();
		System.out.println(" Um script foi gerado!");
		JOptionPane.showMessageDialog(null, "Um novo script foi gerado!");
	}
	
	else  {
		// novo codigo flexvisionSchema
		@SuppressWarnings("resource")
		Scanner rename = new Scanner(System.in);
		/**
		System.out.println("\n Por favor informe o Prefixo (SIP, SEC):\n");
		String prefixo = rename.nextLine();
		**/
		System.out.println("\n Por favor informe a ISSUE:\n");
		String ISSUE = rename.nextLine();

		System.out.println("\n Tabela/View/Index:\n");
		String schema = rename.nextLine();
		
		OutputStream bytes = new FileOutputStream(""+FLEX+"_"+Iteracao.getDateForm()+"__"+ISSUE+"_CREATE_"+schema+".sql");
		//Substituição de Variaveis dentro de template
				OutputStreamWriter chars = new OutputStreamWriter(bytes);
				BufferedWriter strings = new BufferedWriter(chars);
				script = script12.replace(nome, flexvisionSchema);
				script = script.replace(tabela, schema);
				strings.write(script);
				strings.close();
		System.out.println(" Um script foi gerado!");
		JOptionPane.showMessageDialog(null, "Um novo script foi gerado!");
	}
	break;
	
case 13: 
	
	System.out.println("Iniciando...");
	//Iteracao temp1 = new Iteracao();
	String script13 = dropConstraint();

	// Condicao de escolha, caso o usuario deseje visualizar o documento
	System.out.println(msg2);

	String escolha13 = input.nextLine();
	if (escolha13.equalsIgnoreCase("s")) {

		System.out.println(script13);
	} else {
	}

	System.out.println(msg3);
	System.out.println(barra);
	System.out.println("(1)" + siplagSchema);
	System.out.println(barra);
	System.out.println("(2)" + securitySchema);
	System.out.println(barra);
	System.out.println("(3)" + flexvisionSchema);
	System.out.println(barra);

	numero1 = entrada.nextFloat();

	// Alteraçao de variaveis do arquivo selecionado

	if (numero1 == 1) {
		
		
		@SuppressWarnings("resource")
		Scanner rename = new Scanner(System.in);
		/**
		System.out.println("\n Por favor informe o Prefixo (SIP, SEC):\n");
		String prefixo = rename.nextLine();
		**/
		System.out.println("\n Por favor informe a ISSUE:\n");
		String ISSUE = rename.nextLine();

		System.out.println("\n Tabela/View/Index:\n");
		String schema = rename.nextLine();

		
		OutputStream bytes = new FileOutputStream(""+SIP+"_"+Iteracao.getDateForm()+"__"+ISSUE+"_ALTER_"+schema+".sql");
		
		//Substituição de Variaveis dentro de template
				OutputStreamWriter chars = new OutputStreamWriter(bytes);
				BufferedWriter strings = new BufferedWriter(chars);
				script = script13.replace(nome, siplagSchema);
				script = script.replace(tabela, schema);
				strings.write(script);
				strings.close();
		System.out.println(" Um script foi gerado!");
		JOptionPane.showMessageDialog(null, "Um novo script foi gerado!");

	}else if(numero1 == 2) {
		
		@SuppressWarnings("resource")
		Scanner rename = new Scanner(System.in);
		/**
		System.out.println("\n Por favor informe o Prefixo (SIP, SEC):\n");
		String prefixo = rename.nextLine();
		**/
		System.out.println("\n Por favor informe a ISSUE:\n");
		String ISSUE = rename.nextLine();

		System.out.println("\n Tabela/View/Index:\n");
		String schema = rename.nextLine();
		
		OutputStream bytes = new FileOutputStream(""+SEC+"_"+Iteracao.getDateForm()+"__"+ISSUE+"_ALTER_"+schema+".sql");
		//Substituição de Variaveis dentro de template
				OutputStreamWriter chars = new OutputStreamWriter(bytes);
				BufferedWriter strings = new BufferedWriter(chars);
				script = script13.replace(nome, securitySchema);
				script = script.replace(tabela, schema);
				strings.write(script);
				strings.close();
		System.out.println(" Um script foi gerado!");
		JOptionPane.showMessageDialog(null, "Um novo script foi gerado!");
	}
	else  {
		// novo codigo flexvisionSchema
		@SuppressWarnings("resource")
		Scanner rename = new Scanner(System.in);
		/**
		System.out.println("\n Por favor informe o Prefixo (SIP, SEC):\n");
		String prefixo = rename.nextLine();
		**/
		System.out.println("\n Por favor informe a ISSUE:\n");
		String ISSUE = rename.nextLine();

		System.out.println("\n Tabela/View/Index:\n");
		String schema = rename.nextLine();
		
		OutputStream bytes = new FileOutputStream(""+FLEX+"_"+Iteracao.getDateForm()+"__"+ISSUE+"_CREATE_"+schema+".sql");
		//Substituição de Variaveis dentro de template
				OutputStreamWriter chars = new OutputStreamWriter(bytes);
				BufferedWriter strings = new BufferedWriter(chars);
				script = script13.replace(nome, flexvisionSchema);
				script = script.replace(tabela, schema);
				strings.write(script);
				strings.close();
		System.out.println(" Um script foi gerado!");
		JOptionPane.showMessageDialog(null, "Um novo script foi gerado!");
	}
	
	break;
	
case 14: 
	
	System.out.println("Iniciando...");
	//Iteracao temp1 = new Iteracao();
	String script14 = dropIndex();

	// Condicao de escolha, caso o usuario deseje visualizar o documento
	System.out.println(msg2);

	String escolha14 = input.nextLine();
	if (escolha14.equalsIgnoreCase("s")) {

		System.out.println(script14);
	} else {
	}

	System.out.println(msg3);
	System.out.println(barra);
	System.out.println("(1)" + siplagSchema);
	System.out.println(barra);
	System.out.println("(2)" + securitySchema);
	System.out.println(barra);
	System.out.println("(3)" + flexvisionSchema);
	System.out.println(barra);

	numero1 = entrada.nextFloat();

	// Alteraçao de variaveis do arquivo selecionado

	if (numero1 == 1) {
		
		
		@SuppressWarnings("resource")
		Scanner rename = new Scanner(System.in);
		/**
		System.out.println("\n Por favor informe o Prefixo (SIP, SEC):\n");
		String prefixo = rename.nextLine();
		**/
		System.out.println("\n Por favor informe a ISSUE:\n");
		String ISSUE = rename.nextLine();

		System.out.println("\n Tabela/View/Index:\n");
		String schema = rename.nextLine();

		
		OutputStream bytes = new FileOutputStream(""+SIP+"_"+Iteracao.getDateForm()+"__"+ISSUE+"_ALTER_"+schema+".sql");
		
		//Substituição de Variaveis dentro de template
				OutputStreamWriter chars = new OutputStreamWriter(bytes);
				BufferedWriter strings = new BufferedWriter(chars);
				script = script14.replace(nome, siplagSchema);
				script = script.replace(tabela, schema);
				strings.write(script);
				strings.close();
		System.out.println(" Um script foi gerado!");
		JOptionPane.showMessageDialog(null, "Um novo script foi gerado!");
		
	}else if(numero1 == 2) {
		
		@SuppressWarnings("resource")
		Scanner rename = new Scanner(System.in);
		/**
		System.out.println("\n Por favor informe o Prefixo (SIP, SEC):\n");
		String prefixo = rename.nextLine();
		**/
		System.out.println("\n Por favor informe a ISSUE:\n");
		String ISSUE = rename.nextLine();

		System.out.println("\n Tabela/View/Index:\n");
		String schema = rename.nextLine();
		
		OutputStream bytes = new FileOutputStream(""+SEC+"_"+Iteracao.getDateForm()+"__"+ISSUE+"_ALTER_"+schema+".sql");
		//Substituição de Variaveis dentro de template
				OutputStreamWriter chars = new OutputStreamWriter(bytes);
				BufferedWriter strings = new BufferedWriter(chars);
				script = script14.replace(nome, securitySchema);
				script = script.replace(tabela, schema);
				strings.write(script);
				strings.close();
		System.out.println(" Um script foi gerado!");
		JOptionPane.showMessageDialog(null, "Um novo script foi gerado!");
	}
	else  {
		// novo codigo flexvisionSchema
		@SuppressWarnings("resource")
		Scanner rename = new Scanner(System.in);
		/**
		System.out.println("\n Por favor informe o Prefixo (SIP, SEC):\n");
		String prefixo = rename.nextLine();
		**/
		System.out.println("\n Por favor informe a ISSUE:\n");
		String ISSUE = rename.nextLine();

		System.out.println("\n Tabela/View/Index:\n");
		String schema = rename.nextLine();
		
		OutputStream bytes = new FileOutputStream(""+FLEX+"_"+Iteracao.getDateForm()+"__"+ISSUE+"_CREATE_"+schema+".sql");
		//Substituição de Variaveis dentro de template
				OutputStreamWriter chars = new OutputStreamWriter(bytes);
				BufferedWriter strings = new BufferedWriter(chars);
				script = script14.replace(nome, flexvisionSchema);
				script = script.replace(tabela, schema);
				strings.write(script);
				strings.close();
		System.out.println(" Um script foi gerado!");
		JOptionPane.showMessageDialog(null, "Um novo script foi gerado!");
	}
	break;
case 15: 
	
	System.out.println("Iniciando...");
	//Iteracao temp1 = new Iteracao();
	String script15 = createView();

	// Condicao de escolha, caso o usuario deseje visualizar o documento
	System.out.println(msg2);

	String escolha15 = input.nextLine();
	if (escolha15.equalsIgnoreCase("s")) {

		System.out.println(script15);
	} else {
	}

	System.out.println(msg3);
	System.out.println(barra);
	System.out.println("(1)" + siplagSchema);
	System.out.println(barra);
	System.out.println("(2)" + securitySchema);
	System.out.println(barra);
	System.out.println("(3)" + flexvisionSchema);
	System.out.println(barra);

	numero1 = entrada.nextFloat();

	// Alteraçao de variaveis do arquivo selecionado

	if (numero1 == 1) {
		
		
		@SuppressWarnings("resource")
		Scanner rename = new Scanner(System.in);
		/**
		System.out.println("\n Por favor informe o Prefixo (SIP, SEC):\n");
		String prefixo = rename.nextLine();
		**/
		System.out.println("\n Por favor informe a ISSUE:\n");
		String ISSUE = rename.nextLine();

		System.out.println("\n Tabela/View/Index:\n");
		String schema = rename.nextLine();

		
		OutputStream bytes = new FileOutputStream(""+SIP+"_"+Iteracao.getDateForm()+"__"+ISSUE+"_ALTER_"+schema+".sql");
		//Substituição de Variaveis dentro de template
				OutputStreamWriter chars = new OutputStreamWriter(bytes);
				BufferedWriter strings = new BufferedWriter(chars);
				script = script15.replace(nome, siplagSchema);
				script = script.replace(tabela, schema);
				strings.write(script);
				strings.close();
		System.out.println(" Um script foi gerado!");
		JOptionPane.showMessageDialog(null, "Um novo script foi gerado!");

	}else if(numero1 == 2) {
		
		@SuppressWarnings("resource")
		Scanner rename = new Scanner(System.in);
		/**
		System.out.println("\n Por favor informe o Prefixo (SIP, SEC):\n");
		String prefixo = rename.nextLine();
		**/
		System.out.println("\n Por favor informe a ISSUE:\n");
		String ISSUE = rename.nextLine();

		System.out.println("\n Tabela/View/Index:\n");
		String schema = rename.nextLine();
		
		OutputStream bytes = new FileOutputStream(""+SEC+"_"+Iteracao.getDateForm()+"__"+ISSUE+"_ALTER_"+schema+".sql");
		//Substituição de Variaveis dentro de template
				OutputStreamWriter chars = new OutputStreamWriter(bytes);
				BufferedWriter strings = new BufferedWriter(chars);
				script = script15.replace(nome, securitySchema);
				script = script.replace(tabela, schema);
				strings.write(script);
				strings.close();
		System.out.println(" Um script foi gerado!");
		JOptionPane.showMessageDialog(null, "Um novo script foi gerado!");
	}
	else  {
		// novo codigo flexvisionSchema
		@SuppressWarnings("resource")
		Scanner rename = new Scanner(System.in);
		/**
		System.out.println("\n Por favor informe o Prefixo (SIP, SEC):\n");
		String prefixo = rename.nextLine();
		**/
		System.out.println("\n Por favor informe a ISSUE:\n");
		String ISSUE = rename.nextLine();

		System.out.println("\n Tabela/View/Index:\n");
		String schema = rename.nextLine();
		
		OutputStream bytes = new FileOutputStream(""+FLEX+"_"+Iteracao.getDateForm()+"__"+ISSUE+"_CREATE_"+schema+".sql");
		//Substituição de Variaveis dentro de template
				OutputStreamWriter chars = new OutputStreamWriter(bytes);
				BufferedWriter strings = new BufferedWriter(chars);
				script = script15.replace(nome, flexvisionSchema);
				script = script.replace(tabela, schema);
				strings.write(script);
				strings.close();
		System.out.println(" Um script foi gerado!");
		JOptionPane.showMessageDialog(null, "Um novo script foi gerado!");
	}
	break;
case 16:
	
	System.out.println("Iniciando...");
	//Iteracao temp1 = new Iteracao();
	String script16 = dropView();

	// Condicao de escolha, caso o usuario deseje visualizar o documento
	System.out.println(msg2);

	String escolha16 = input.nextLine();
	if (escolha16.equalsIgnoreCase("s")) {

		System.out.println(script16);
	} else {
	}

	System.out.println(msg3);
	System.out.println(barra);
	System.out.println("(1)" + siplagSchema);
	System.out.println(barra);
	System.out.println("(2)" + securitySchema);
	System.out.println(barra);
	System.out.println("(3)" + flexvisionSchema);
	System.out.println(barra);

	numero1 = entrada.nextFloat();

	// Alteraçao de variaveis do arquivo selecionado

	if (numero1 == 1) {
		
		
		@SuppressWarnings("resource")
		Scanner rename = new Scanner(System.in);
		/**
		System.out.println("\n Por favor informe o Prefixo (SIP, SEC):\n");
		String prefixo = rename.nextLine();
		**/
		System.out.println("\n Por favor informe a ISSUE:\n");
		String ISSUE = rename.nextLine();

		System.out.println("\n Tabela/View/Index:\n");
		String schema = rename.nextLine();

		
		OutputStream bytes = new FileOutputStream(""+SIP+"_"+Iteracao.getDateForm()+"__"+ISSUE+"_ALTER_"+schema+".sql");
		
		//Substituição de Variaveis dentro de template
				OutputStreamWriter chars = new OutputStreamWriter(bytes);
				BufferedWriter strings = new BufferedWriter(chars);
				script = script16.replace(nome, siplagSchema);
				script = script.replace(tabela, schema);
				strings.write(script);
				strings.close();
		System.out.println(" Um script foi gerado!");
		JOptionPane.showMessageDialog(null, "Um novo script foi gerado!");

	}else if(numero1 == 2) {
		
		@SuppressWarnings("resource")
		Scanner rename = new Scanner(System.in);
		/**
		System.out.println("\n Por favor informe o Prefixo (SIP, SEC):\n");
		String prefixo = rename.nextLine();
		**/
		System.out.println("\n Por favor informe a ISSUE:\n");
		String ISSUE = rename.nextLine();

		System.out.println("\n Tabela/View/Index:\n");
		String schema = rename.nextLine();
		
		OutputStream bytes = new FileOutputStream(""+SEC+"_"+Iteracao.getDateForm()+"__"+ISSUE+"_ALTER_"+schema+".sql");
		//Substituição de Variaveis dentro de template
				OutputStreamWriter chars = new OutputStreamWriter(bytes);
				BufferedWriter strings = new BufferedWriter(chars);
				script = script16.replace(nome, securitySchema);
				script = script.replace(tabela, schema);
				strings.write(script);
				strings.close();
		System.out.println(" Um script foi gerado!");
		JOptionPane.showMessageDialog(null, "Um novo script foi gerado!");
	}
	else  {
		// novo codigo flexvisionSchema
		@SuppressWarnings("resource")
		Scanner rename = new Scanner(System.in);
		/**
		System.out.println("\n Por favor informe o Prefixo (SIP, SEC):\n");
		String prefixo = rename.nextLine();
		**/
		System.out.println("\n Por favor informe a ISSUE:\n");
		String ISSUE = rename.nextLine();

		System.out.println("\n Tabela/View/Index:\n");
		String schema = rename.nextLine();
		
		OutputStream bytes = new FileOutputStream(""+FLEX+"_"+Iteracao.getDateForm()+"__"+ISSUE+"_CREATE_"+schema+".sql");
		//Substituição de Variaveis dentro de template
				OutputStreamWriter chars = new OutputStreamWriter(bytes);
				BufferedWriter strings = new BufferedWriter(chars);
				script = script16.replace(nome, flexvisionSchema);
				script = script.replace(tabela, schema);
				strings.write(script);
				strings.close();
		System.out.println(" Um script foi gerado!");
		JOptionPane.showMessageDialog(null, "Um novo script foi gerado!");
	}
	break;
		/*
		 * case '4': System.out.printf("%.2f / %.2f = %.2f", numero1, numero2,
		 * numero1 / numero2); break;
		 */
case '0':
			System.out.println("Saindo...");
			System.exit(0);
		}

	}
}
