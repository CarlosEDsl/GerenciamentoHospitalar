package models;

public class Medico extends Pessoa {
    private String crm;
    private String especialidade;
    private String ctps;
    private String senha;
    
    public Medico(String nome, String id, String cpf, String end, String tel,
            String crm, String esp, String ctps, String senha){
        super(nome, id, cpf, end, tel);
        this.crm = crm;
        especialidade = esp;
        this.ctps = ctps;
        this.senha = senha;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getCtps() {
        return ctps;
    }

    public void setCtps(String ctps) {
        this.ctps = ctps;
    }

    public String getSenha() { return senha; }

    public void setSenha(String senha) { this.senha = senha; }
        
    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("C.R.M.         : " + crm);
        System.out.println("Especialidade  : " + especialidade);
        System.out.println("C.T.P.S.       : " + ctps);
    }
}
