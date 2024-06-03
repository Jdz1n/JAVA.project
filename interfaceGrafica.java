package Aplicacao;

import javax.swing.JOptionPane;

class InterfaceGrafica {
    public void exibirMenu() {
        String opcao;
        do {
            opcao = JOptionPane.showInputDialog("| Codigo | Ação                \n"
            		+ "|   1   | Adicionar e exibir informações do aluno        \n"
            		+ "|   2   | Adicionar e exibir informações do funcionario  \n"
            		+ "|   3   | Adicionar e exibir informações da escola       \n"
            		+ "|   0   | Fechar programa                                \n");
            switch (opcao) {
                case "1":
                    Aluno aluno = new Aluno();
                    aluno.adicionarInformacoes();
                    aluno.exibirSituacao();
                    break;
                case "2":
                    Funcionario funcionario = new Funcionario();
                    funcionario.adicionarInformacoes();
                    funcionario.exibirInformacoes();
                    break;
                case "3":
                    infoEscola escola = new infoEscola();
                    escola.adicionarInformacoes();
                    escola.exibirInformacoes();
                    break;
                case "0":
                    JOptionPane.showMessageDialog(null, "Saindo do programa...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        } while (!opcao.equals("0"));
    }
}