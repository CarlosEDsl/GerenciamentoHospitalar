package models;

public enum Estado {
    INDEFINIDO("Indefinido", 0),
    ENTRADA("Entrada", 1),
    TRATAMENTO_CLINICO_GERAL("Tratamento Clínico Geral", 2),
    PREPARACAO_PRE_CIRURGIA("Preparação Pré-Cirurgia", 3),
    CIRURGIA("Cirurgia", 4),
    POS_CIRURGIA("Pós-Cirurgia", 5),
    ALTA_CLINICA("Alta Clínica", 6);

    private final String descricao;
    private final int etapa;

    Estado(String descricao, int etapa) {
        this.descricao = descricao;
        this.etapa = etapa;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getEtapa(){
        return etapa;
    }

    public static Estado toEnum(int etapa) {
        for (Estado estado : Estado.values()) {
            if (estado.getEtapa() == etapa) {
                return estado;
            }
        }
        return INDEFINIDO;
    }
}