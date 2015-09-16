/*
 script generation
 */
package br.com.logusinfo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author berrigue
 */

public class Iteracao {
	
//pegar data do sistema	
public static String getDateForm(){

		DateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
		Date date = new Date(); 
		return dateFormat.format(date);

	}
	
//01
	public String createTable() {
		File dir = new File("templates/");
		File arq = new File(dir, "templateCreateTable.sql");
		StringBuffer sb = new StringBuffer();

		try {
			// Indicamos o arquivo que será lido
			FileReader fileReader = new FileReader(arq);

			// Criamos o objeto bufferReader que nos
			// oferece o método de leitura readLine()
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			// String que irá receber cada linha do arquivo
			String linha = "";

			/*
			 * Fazendo um loop linha a linha no arquivo, enquanto ele seja
			 * diferente de null. O método readLine() devolve a linha na posicao
			 * do loop para a variavel linha.
			 */

			while ((linha = bufferedReader.readLine()) != null) {
				// Aqui imprimimos a linha
				sb.append(linha);
				sb.append("\n");

			}

			// liberando o fluxo dos objetos
			// ou fechar o arquivo
			fileReader.close();
			bufferedReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sb.toString();

	}
	
	//02
	public String alterTableAddColumn() {
		File dir = new File("templates/");
		File arq = new File(dir, "templateAddColumn.sql");
		StringBuffer sb = new StringBuffer();

		try {
			// Indicamos o arquivo que será lido
			FileReader fileReader = new FileReader(arq);

			// Criamos o objeto bufferReader que nos
			// oferece o método de leitura readLine()
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			// String que irá receber cada linha do arquivo
			String linha = "";

			/*
			 * Fazendo um loop linha a linha no arquivo, enquanto ele seja
			 * diferente de null. O método readLine() devolve a linha na posicao
			 * do loop para a variavel linha.
			 */

			while ((linha = bufferedReader.readLine()) != null) {
				// Aqui imprimimos a linha
				sb.append(linha);
				sb.append("\n");

			}

			// liberando o fluxo dos objetos
			// ou fechar o arquivo
			fileReader.close();
			bufferedReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sb.toString();

	}
	//03
	public String alterTableDropColumn() {
		File dir = new File("templates/");
		File arq = new File(dir, "templateDropColumn.sql");
		StringBuffer sb = new StringBuffer();

		try {
			// Indicamos o arquivo que será lido
			FileReader fileReader = new FileReader(arq);

			// Criamos o objeto bufferReader que nos
			// oferece o método de leitura readLine()
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			// String que irá receber cada linha do arquivo
			String linha = "";

			/*
			 * Fazendo um loop linha a linha no arquivo, enquanto ele seja
			 * diferente de null. O método readLine() devolve a linha na posicao
			 * do loop para a variavel linha.
			 */

			while ((linha = bufferedReader.readLine()) != null) {
				// Aqui imprimimos a linha
				sb.append(linha);
				sb.append("\n");

			}

			// liberando o fluxo dos objetos
			// ou fechar o arquivo
			fileReader.close();
			bufferedReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sb.toString();

	}
	
	//04
	public String alterTableModifyColumn() {
		File dir = new File("templates/");
		File arq = new File(dir, "templateModifyColumn.sql");
		StringBuffer sb = new StringBuffer();

		try {
			// Indicamos o arquivo que será lido
			FileReader fileReader = new FileReader(arq);

			// Criamos o objeto bufferReader que nos
			// oferece o método de leitura readLine()
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			// String que irá receber cada linha do arquivo
			String linha = "";

			/*
			 * Fazendo um loop linha a linha no arquivo, enquanto ele seja
			 * diferente de null. O método readLine() devolve a linha na posicao
			 * do loop para a variavel linha.
			 */

			while ((linha = bufferedReader.readLine()) != null) {
				// Aqui imprimimos a linha
				sb.append(linha);
				sb.append("\n");

			}

			// liberando o fluxo dos objetos
			// ou fechar o arquivo
			fileReader.close();
			bufferedReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sb.toString();

	}
	
	//05
	public String alterTableRenameColumn() {
		File dir = new File("templates/");
		File arq = new File(dir, "templateRenameColumn.sql");
		StringBuffer sb = new StringBuffer();

		try {
			// Indicamos o arquivo que será lido
			FileReader fileReader = new FileReader(arq);

			// Criamos o objeto bufferReader que nos
			// oferece o método de leitura readLine()
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			// String que irá receber cada linha do arquivo
			String linha = "";

			/*
			 * Fazendo um loop linha a linha no arquivo, enquanto ele seja
			 * diferente de null. O método readLine() devolve a linha na posicao
			 * do loop para a variavel linha.
			 */

			while ((linha = bufferedReader.readLine()) != null) {
				// Aqui imprimimos a linha
				sb.append(linha);
				sb.append("\n");

			}

			// liberando o fluxo dos objetos
			// ou fechar o arquivo
			fileReader.close();
			bufferedReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sb.toString();
		
	}
	
	//06
		public String alterTableCreatePrimaryKey() {
			File dir = new File("templates/");
			File arq = new File(dir, "templateCreatePK.sql");
			StringBuffer sb = new StringBuffer();

			try {
				// Indicamos o arquivo que será lido
				FileReader fileReader = new FileReader(arq);

				// Criamos o objeto bufferReader que nos
				// oferece o método de leitura readLine()
				BufferedReader bufferedReader = new BufferedReader(fileReader);

				// String que irá receber cada linha do arquivo
				String linha = "";

				/*
				 * Fazendo um loop linha a linha no arquivo, enquanto ele seja
				 * diferente de null. O método readLine() devolve a linha na posicao
				 * do loop para a variavel linha.
				 */

				while ((linha = bufferedReader.readLine()) != null) {
					// Aqui imprimimos a linha
					sb.append(linha);
					sb.append("\n");

				}

				// liberando o fluxo dos objetos
				// ou fechar o arquivo
				fileReader.close();
				bufferedReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return sb.toString();
			
		}
		//07
			public String alterTableCreateForeignKey() {
				File dir = new File("templates/");
				File arq = new File(dir, "templateCreateFK.sql");
				StringBuffer sb = new StringBuffer();

				try {
					// Indicamos o arquivo que será lido
					FileReader fileReader = new FileReader(arq);

					// Criamos o objeto bufferReader que nos
					// oferece o método de leitura readLine()
					BufferedReader bufferedReader = new BufferedReader(fileReader);

					// String que irá receber cada linha do arquivo
					String linha = "";

					/*
					 * Fazendo um loop linha a linha no arquivo, enquanto ele seja
					 * diferente de null. O método readLine() devolve a linha na posicao
					 * do loop para a variavel linha.
					 */

					while ((linha = bufferedReader.readLine()) != null) {
						// Aqui imprimimos a linha
						sb.append(linha);
						sb.append("\n");

					}

					// liberando o fluxo dos objetos
					// ou fechar o arquivo
					fileReader.close();
					bufferedReader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				return sb.toString();
			}
				
			//08
				public String alterTableCreateUniqueKey() {
					File dir = new File("templates/");
					File arq = new File(dir, "templateCreateUK.sql");
					StringBuffer sb = new StringBuffer();

					try {
						// Indicamos o arquivo que será lido
						FileReader fileReader = new FileReader(arq);

						// Criamos o objeto bufferReader que nos
						// oferece o método de leitura readLine()
						BufferedReader bufferedReader = new BufferedReader(fileReader);

						// String que irá receber cada linha do arquivo
						String linha = "";

						/*
						 * Fazendo um loop linha a linha no arquivo, enquanto ele seja
						 * diferente de null. O método readLine() devolve a linha na posicao
						 * do loop para a variavel linha.
						 */

						while ((linha = bufferedReader.readLine()) != null) {
							// Aqui imprimimos a linha
							sb.append(linha);
							sb.append("\n");

						}

						// liberando o fluxo dos objetos
						// ou fechar o arquivo
						fileReader.close();
						bufferedReader.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
					return sb.toString();

	} //09
				
				public String alterTableCreateIndex() {
					File dir = new File("templates/");
					File arq = new File(dir, "templateCreateIDX.sql");
					StringBuffer sb = new StringBuffer();

					try {
						// Indicamos o arquivo que será lido
						FileReader fileReader = new FileReader(arq);

						// Criamos o objeto bufferReader que nos
						// oferece o método de leitura readLine()
						BufferedReader bufferedReader = new BufferedReader(fileReader);

						// String que irá receber cada linha do arquivo
						String linha = "";

						/*
						 * Fazendo um loop linha a linha no arquivo, enquanto ele seja
						 * diferente de null. O método readLine() devolve a linha na posicao
						 * do loop para a variavel linha.
						 */

						while ((linha = bufferedReader.readLine()) != null) {
							// Aqui imprimimos a linha
							sb.append(linha);
							sb.append("\n");

						}

						// liberando o fluxo dos objetos
						// ou fechar o arquivo
						fileReader.close();
						bufferedReader.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
					return sb.toString();

	} //10
				
				public String insert() {
					File dir = new File("templates/");
					File arq = new File(dir, "templateInsert.sql");
					StringBuffer sb = new StringBuffer();

					try {
						// Indicamos o arquivo que será lido
						FileReader fileReader = new FileReader(arq);

						// Criamos o objeto bufferReader que nos
						// oferece o método de leitura readLine()
						BufferedReader bufferedReader = new BufferedReader(fileReader);

						// String que irá receber cada linha do arquivo
						String linha = "";

						/*
						 * Fazendo um loop linha a linha no arquivo, enquanto ele seja
						 * diferente de null. O método readLine() devolve a linha na posicao
						 * do loop para a variavel linha.
						 */

						while ((linha = bufferedReader.readLine()) != null) {
							// Aqui imprimimos a linha
							sb.append(linha);
							sb.append("\n");

						}

						// liberando o fluxo dos objetos
						// ou fechar o arquivo
						fileReader.close();
						bufferedReader.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
					return sb.toString();

	} //11
				
				public String addComments() {
					File dir = new File("templates/");
					File arq = new File(dir, "templateAddComment.sql");
					StringBuffer sb = new StringBuffer();

					try {
						// Indicamos o arquivo que será lido
						FileReader fileReader = new FileReader(arq);

						// Criamos o objeto bufferReader que nos
						// oferece o método de leitura readLine()
						BufferedReader bufferedReader = new BufferedReader(fileReader);

						// String que irá receber cada linha do arquivo
						String linha = "";

						/*
						 * Fazendo um loop linha a linha no arquivo, enquanto ele seja
						 * diferente de null. O método readLine() devolve a linha na posicao
						 * do loop para a variavel linha.
						 */

						while ((linha = bufferedReader.readLine()) != null) {
							// Aqui imprimimos a linha
							sb.append(linha);
							sb.append("\n");

						}

						// liberando o fluxo dos objetos
						// ou fechar o arquivo
						fileReader.close();
						bufferedReader.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
					return sb.toString();

	} //12
				
				public String dropTable() {
					File dir = new File("templates/");
					File arq = new File(dir, "templateDropTable.sql");
					StringBuffer sb = new StringBuffer();

					try {
						// Indicamos o arquivo que será lido
						FileReader fileReader = new FileReader(arq);

						// Criamos o objeto bufferReader que nos
						// oferece o método de leitura readLine()
						BufferedReader bufferedReader = new BufferedReader(fileReader);

						// String que irá receber cada linha do arquivo
						String linha = "";

						/*
						 * Fazendo um loop linha a linha no arquivo, enquanto ele seja
						 * diferente de null. O método readLine() devolve a linha na posicao
						 * do loop para a variavel linha.
						 */

						while ((linha = bufferedReader.readLine()) != null) {
							// Aqui imprimimos a linha
							sb.append(linha);
							sb.append("\n");

						}

						// liberando o fluxo dos objetos
						// ou fechar o arquivo
						fileReader.close();
						bufferedReader.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
					return sb.toString();

	}	//13
				
				public String dropConstraint() {
					File dir = new File("templates/");
					File arq = new File(dir, "templateDropConstraint.sql");
					StringBuffer sb = new StringBuffer();

					try {
						// Indicamos o arquivo que será lido
						FileReader fileReader = new FileReader(arq);

						// Criamos o objeto bufferReader que nos
						// oferece o método de leitura readLine()
						BufferedReader bufferedReader = new BufferedReader(fileReader);

						// String que irá receber cada linha do arquivo
						String linha = "";

						/*
						 * Fazendo um loop linha a linha no arquivo, enquanto ele seja
						 * diferente de null. O método readLine() devolve a linha na posicao
						 * do loop para a variavel linha.
						 */

						while ((linha = bufferedReader.readLine()) != null) {
							// Aqui imprimimos a linha
							sb.append(linha);
							sb.append("\n");

						}

						// liberando o fluxo dos objetos
						// ou fechar o arquivo
						fileReader.close();
						bufferedReader.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
					return sb.toString();

	}//14
				
				public String dropIndex() {
					File dir = new File("templates/");
					File arq = new File(dir, "templateDropIndex.sql");
					StringBuffer sb = new StringBuffer();

					try {
						// Indicamos o arquivo que será lido
						FileReader fileReader = new FileReader(arq);

						// Criamos o objeto bufferReader que nos
						// oferece o método de leitura readLine()
						BufferedReader bufferedReader = new BufferedReader(fileReader);

						// String que irá receber cada linha do arquivo
						String linha = "";

						/*
						 * Fazendo um loop linha a linha no arquivo, enquanto ele seja
						 * diferente de null. O método readLine() devolve a linha na posicao
						 * do loop para a variavel linha.
						 */

						while ((linha = bufferedReader.readLine()) != null) {
							// Aqui imprimimos a linha
							sb.append(linha);
							sb.append("\n");

						}

						// liberando o fluxo dos objetos
						// ou fechar o arquivo
						fileReader.close();
						bufferedReader.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
					return sb.toString();

	} //15
				
				public String createView() {
					File dir = new File("templates/");
					File arq = new File(dir, "templateCreateView.sql");
					StringBuffer sb = new StringBuffer();

					try {
						// Indicamos o arquivo que será lido
						FileReader fileReader = new FileReader(arq);

						// Criamos o objeto bufferReader que nos
						// oferece o método de leitura readLine()
						BufferedReader bufferedReader = new BufferedReader(fileReader);

						// String que irá receber cada linha do arquivo
						String linha = "";

						/*
						 * Fazendo um loop linha a linha no arquivo, enquanto ele seja
						 * diferente de null. O método readLine() devolve a linha na posicao
						 * do loop para a variavel linha.
						 */

						while ((linha = bufferedReader.readLine()) != null) {
							// Aqui imprimimos a linha
							sb.append(linha);
							sb.append("\n");

						}

						// liberando o fluxo dos objetos
						// ou fechar o arquivo
						fileReader.close();
						bufferedReader.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
					return sb.toString();
				}	
					
					//15
					
					public String dropView() {
						File dir = new File("templates/");
						File arq = new File(dir, "templateDropView.sql");
						StringBuffer sb = new StringBuffer();

						try {
							// Indicamos o arquivo que será lido
							FileReader fileReader = new FileReader(arq);

							// Criamos o objeto bufferReader que nos
							// oferece o método de leitura readLine()
							BufferedReader bufferedReader = new BufferedReader(fileReader);

							// String que irá receber cada linha do arquivo
							String linha = "";

							/*
							 * Fazendo um loop linha a linha no arquivo, enquanto ele seja
							 * diferente de null. O método readLine() devolve a linha na posicao
							 * do loop para a variavel linha.
							 */

							while ((linha = bufferedReader.readLine()) != null) {
								// Aqui imprimimos a linha
								sb.append(linha);
								sb.append("\n");

							}

							// liberando o fluxo dos objetos
							// ou fechar o arquivo
							fileReader.close();
							bufferedReader.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
						return sb.toString();

	}

}
