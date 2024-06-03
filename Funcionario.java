package Aplicacao;

import javax.swing.JOptionPane;

class Funcionario {
 private String nome;
 private String cargo;
 private String endereco;
 private String salario;

 // adicionar informações do funcionário
 public void adicionarInformacoes() {
     nome = JOptionPane.showInputDialog("Digite o nome do funcionário: ");
     cargo = JOptionPane.showInputDialog("Digite o cargo do funcionáro: ");
     endereco = JOptionPane.showInputDialog("Digite o endereço do funcionário: ");
     salario = JOptionPane.showInputDialog("Digite o salario do aluno: ");
 }

 // exibir informações do funcionário
 public void exibirInformacoes() {
     JOptionPane.showMessageDialog(null, "Nome: " + nome + "\nCargo: " + cargo + "\nEndereço: " + endereco + "\nSalário: " + salario);
 }
}