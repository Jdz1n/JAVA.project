package Aplicacao;

import javax.swing.JOptionPane;

class Aluno {
    private String nome;
    private String idade;
    private String serie;
    private String turno;
    private double[] notas;

    // adicionar informações do aluno
    public void adicionarInformacoes() {
        nome = JOptionPane.showInputDialog("Digite o nome do aluno: ");
        idade = JOptionPane.showInputDialog("Digite a idade do aluno: ");
        serie = JOptionPane.showInputDialog("Digite a série do aluno: ");
        turno = JOptionPane.showInputDialog("Digite o turno do aluno: ");
        notas = new double[4];
        for (int i = 0; i < 4; i++) {
            notas[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota " + (i + 1) + " do aluno:"));
        }
    }

    // calculo da média
    public double calcularMedia() {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }

    // situação do aluno
    public void exibirSituacao() {
        double media = calcularMedia();
        if (media >= 7.0) {
            JOptionPane.showMessageDialog(null, nome + " situação: aprovado :D média: " + media);
        } else {
            JOptionPane.showMessageDialog(null, nome + " situação: reprovado :( média: " + media);
        }
    }
}