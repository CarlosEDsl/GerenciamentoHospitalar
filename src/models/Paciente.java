package models;

public class Paciente extends Pessoa {
    private String nomeConvenio;
    private String numeroConvenio;
    private Estado estadoClinico;
    
    public Paciente(String nome, String id, String cpf, String end, String tel,
            String nomeConv, String numConv){
        super(nome, id, cpf, end, tel);
        nomeConvenio = nomeConv;
        numeroConvenio = numConv;
        this.estadoClinico = Estado.INDEFINIDO;
    }

    public String getNomeConvenio() {
        return nomeConvenio;
    }

    public void setNomeConvenio(String nomeConvenio) {
        this.nomeConvenio = nomeConvenio;
    }

    public String getNumeroConvenio() {
        return numeroConvenio;
    }

    public void setNumeroConvenio(String numeroConvenio) {
        this.numeroConvenio = numeroConvenio;
    }

    public Estado getEstadoClinico() {return estadoClinico;}

    public void setEstadoClinico(Estado estadoClinico) { this.estadoClinico = estadoClinico; }

    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("Nome Convênio  : " + nomeConvenio);
        System.out.println("Número Convênio: " + numeroConvenio);
    }
}
