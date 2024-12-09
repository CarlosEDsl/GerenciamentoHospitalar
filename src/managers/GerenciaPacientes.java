package managers;

import models.Estado;
import models.Paciente;

import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import java.util.Scanner;

public class GerenciaPacientes {
    private Paciente pacientes[];
    private Scanner ent;
    
    public GerenciaPacientes(Paciente pacs[]){
        pacientes = pacs;
        ent = new Scanner(System.in);
    }
    
    public void cadastrar(){
        String nome, id, cpf, end, tel, nomeConv, numConv;
        
        // Verifica se existem posições vazias no vetor.
        int i = 0;
        while((i < pacientes.length) && (pacientes[i] != null)){
            i++;
        }
        if(i < pacientes.length){
            System.out.println("--==[Cadastro de Pacientes]==--");
            System.out.println("Nome: ");
            nome = ent.nextLine();
            System.out.println("Identidade: ");
            id = ent.nextLine();
            System.out.println("C.P.F.: ");
            cpf = ent.nextLine();
            System.out.println("Endereço: ");
            end = ent.nextLine();
            System.out.println("Telefone: ");
            tel = ent.nextLine();
            System.out.println("Nome Convênio: ");
            nomeConv = ent.nextLine();
            System.out.println("Número Convênio: ");
            numConv = ent.nextLine();
            
            pacientes[i] = new Paciente(nome, id, cpf, end, tel, nomeConv, numConv);
        }
        else{
            System.out.println("Vetor cheio.");
        }
    }
    
    public void alterar(){
        String nome, id, cpf, end, tel, nomeConv, numConv;
        int pos, resp;
        
        System.out.println("--==[Alteração de Pacientes]==--");
        System.out.println("Qual posição deseja alterar? ");
        pos = ent.nextInt();
        ent.skip("\n");
        if(pacientes[pos] != null){
            System.out.println("-=[Dados]=-");
            System.out.println("Nome atual: " + pacientes[pos].getNome());
            System.out.println("Alterar? (1-sim/2-não");
            resp = ent.nextInt();
            ent.skip("\n");
            if(resp == 1){
                System.out.println("Digite o novo nome: ");
                nome = ent.nextLine();
                pacientes[pos].setNome(nome);
            }
            System.out.println("----------------------------------");
            System.out.println("Identidade atual: " + pacientes[pos].getIdentidade());
            System.out.println("Alterar? (1-sim/2-não");
            resp = ent.nextInt();
            ent.skip("\n");
            if(resp == 1){
                System.out.println("Digite a nova identidade: ");
                id = ent.nextLine();
                pacientes[pos].setIdentidade(id);
            }
            System.out.println("----------------------------------");
            System.out.println("C.P.F. atual: " + pacientes[pos].getCpf());
            System.out.println("Alterar? (1-sim/2-não");
            resp = ent.nextInt();
            ent.skip("\n");
            if(resp == 1){
                System.out.println("Digite o novo C.P.F.: ");
                cpf = ent.nextLine();
                pacientes[pos].setCpf(cpf);
            }
            System.out.println("----------------------------------");
            System.out.println("Endereço atual: " + pacientes[pos].getEndereco());
            System.out.println("Alterar? (1-sim/2-não");
            resp = ent.nextInt();
            ent.skip("\n");
            if(resp == 1){
                System.out.println("Digite o novo Endereço: ");
                end = ent.nextLine();
                pacientes[pos].setEndereco(end);
            }
            System.out.println("----------------------------------");
            System.out.println("Telefone atual: " + pacientes[pos].getTelefone());
            System.out.println("Alterar? (1-sim/2-não");
            resp = ent.nextInt();
            ent.skip("\n");
            if(resp == 1){
                System.out.println("Digite o novo Telefone: ");
                tel = ent.nextLine();
                pacientes[pos].setTelefone(tel);
            }
            System.out.println("----------------------------------");
            System.out.println("Nome do Convêncio atual: " + pacientes[pos].getNomeConvenio());
            System.out.println("Alterar? (1-sim/2-não");
            resp = ent.nextInt();
            ent.skip("\n");
            if(resp == 1){
                System.out.println("Digite o novo Nome do Convênio: ");
                 nomeConv = ent.nextLine();
                pacientes[pos].setNomeConvenio(nomeConv);
            }
            System.out.println("----------------------------------");
            System.out.println("Número do Convêncio atual: " + pacientes[pos].getNumeroConvenio());
            System.out.println("Alterar? (1-sim/2-não");
            resp = ent.nextInt();
            ent.skip("\n");
            if(resp == 1){
                System.out.println("Digite o novo Número do Convênio: ");
                 numConv = ent.nextLine();
                pacientes[pos].setNumeroConvenio(numConv);
            }
            System.out.println("----------------------------------");

            System.out.println("Atualização realizada com sucesso.");
        }
        else{
            System.out.println("Vetor cheio.");
        }
    }
    
    public void excluir(){
        int pos, resp;
        
        System.out.println("--==[Exclusão de Pacientes]==--");
        System.out.println("Qual posição deseja excluir? ");
        pos = ent.nextInt();
        ent.skip("\n");
        
        if(pacientes[pos] != null){
            System.out.println("-=[Dados do Paciente]=-");
            pacientes[pos].imprimir();
            System.out.println("\nConfirma exclusão? (1-sim/2-não)");
            resp = ent.nextInt();
            ent.skip("\n");
            
            if(resp == 1){
                pacientes[pos] = null;
                System.out.println("Exclusão efetuada com sucesso.");
            }
            else{
                System.out.println("Exclusão não efetuada.");
            }
        }
        else{
            System.out.println("Paciente não existe.");
        }
    }
    
    public void consultar(){
        int pos;
        
        System.out.println("--==[Consulta de Pacientes]==--");
        System.out.println("Qual posição deseja consultar? ");
        pos = ent.nextInt();
        ent.skip("\n");
        
        if(pacientes[pos] != null){
            System.out.println("-=[Dados do Paciente]=-");
            pacientes[pos].imprimir();
        }
        else{
            System.out.println("Paciente não existe.");
        }
    }
    
    public void relatorio(){
        int pos = 0;
        
        System.out.println("--==[Relatório de Pacientes]==--");
        
        while(pos < pacientes.length){
            if(pacientes[pos] != null){
                pacientes[pos].imprimir();
                System.out.println("\n-----------------------------------\n");
            }
            
            pos++;
        }
    }

    public void mudarEstado() {
        System.out.println("--==[Mudar estado do Paciente]==--");
        System.out.println("Insira o id do paciente que deseja mudar o estado");
        String id = ent.next();
        Optional<Paciente> pacienteById = Arrays.stream(pacientes).filter(pac -> Objects.equals(pac.getIdentidade(), id)).findFirst();


        if(pacienteById.isPresent()) {
            Paciente paciente = pacienteById.get();
            int opcao;

            do{
                System.out.println("\nVocê deseja:");
                System.out.println("1 - Passar para o próximo estado");
                System.out.println("2 - Escolher um estado");
                opcao = ent.nextInt();
            } while(opcao != 1 && opcao != 2);

            switch (opcao) {
                case 1:
                    int etapaAtual = paciente.getEstadoClinico().getEtapa();
                    etapaAtual++;
                    paciente.setEstadoClinico(Estado.toEnum(etapaAtual));
                    break;
                case 2:
                    int etapaEscolhida;
                    do{
                        System.out.println("\nInsira a etapa:");
                        System.out.println(" 0 - Indefinido");
                        System.out.println(" 1 - Entrada");
                        System.out.println(" 2 - Tratamento Clínico Geral");
                        System.out.println(" 3 - Preparação Pré-Cirurgia");
                        System.out.println(" 4 - Cirurgia");
                        System.out.println(" 5 - Pós-Cirurgia");
                        System.out.println(" 6 - Alta Clínica");
                        etapaEscolhida = ent.nextInt();
                    } while(etapaEscolhida < 0 || etapaEscolhida > 6);

                    paciente.setEstadoClinico(Estado.toEnum(etapaEscolhida));

            }
        } else {
            System.out.println("\nPaciente não encontrado\n");
        }

    }

    public void exibirEstadoAtual() {
        System.out.println("\nDigite o ID do paciente que deseja exibir o estado\n");
        String id = ent.next();

        Optional<Paciente> paciente = Arrays.stream(pacientes).filter(pac -> Objects.equals(pac.getIdentidade(), id)).findFirst();
        if(paciente.isPresent()) {
            System.out.println(paciente.get().getEstadoClinico().getDescricao());
        } else {
            System.out.println("Paciente não encontrado");
        }

    }

}
