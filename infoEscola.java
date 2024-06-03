package Aplicacao;

import javax.swing.JOptionPane;

class infoEscola {
 private String nome;
 private String cnpj;
 private String endereco;

 // adicionar informações da escola
 public void adicionarInformacoes() {
     nome = JOptionPane.showInputDialog("Digite o nome da escola: ");
     cnpj = JOptionPane.showInputDialog("Digite o CNPJ da escola: ");
     endereco = JOptionPane.showInputDialog("Digite o endereço da escola: ");
 }

 // exibir informações da escola
 public void exibirInformacoes() {
     JOptionPane.showMessageDialog(null, "Nome: " + nome + "\nCNPJ: " + cnpj + "\nEndereço: " + endereco);
 }
}