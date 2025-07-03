package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PacienteBuilderTest {
    @Test
    void deveRetornarPacienteValido() {
        PacienteBuilder pacienteBuilder = new PacienteBuilder();
        Paciente paciente = pacienteBuilder
                .setNome("Paciente1")
                .setCpf("111111111")
                .build();

        assertNotNull(paciente);
    }
    @Test
    void deveRetornarExcecaoCpfInvalido() {
        try {
            PacienteBuilder pacienteBuilder = new PacienteBuilder();
            Paciente paciente = pacienteBuilder
                    .setNome("Paciente1")
                    .build();
        } catch (IllegalArgumentException e) {
            assertEquals("Cpf não informado", e.getMessage());
        }
    }
    @Test
    void deveRetornarExcecaoNomeInvalido() {
        try {
            PacienteBuilder pacienteBuilder = new PacienteBuilder();
            Paciente paciente = pacienteBuilder
                    .setCpf("11111111111")
                    .build();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome inválido", e.getMessage());
        }
    }

}