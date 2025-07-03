package org.example;

public class PacienteBuilder {
    private Paciente paciente;

    public PacienteBuilder() {
        paciente = new Paciente();
    }

    public Paciente build() {
        if (paciente.getCpf().isEmpty()) {
            throw new IllegalArgumentException("Cpf não informado");
        }
        if (paciente.getNome().equals("")) {
            throw new IllegalArgumentException("Nome inválido");
        }
        return paciente;
    }

    public PacienteBuilder setPossuiConvenio(Boolean possuiConvenio) {
        paciente.setPossuiConvenio(possuiConvenio);
        return this;
    }

    public PacienteBuilder setNome(String nome) {
        paciente.setNome(nome);
        return this;
    }
    public PacienteBuilder setConvenio(String convenio) {
        paciente.setConvenio(convenio);
        return this;
    }
    public PacienteBuilder setCpf(String cpf) {
        paciente.setCpf(cpf);
        return this;
    }
}
