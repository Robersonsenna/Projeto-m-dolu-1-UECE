/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemadegestão;

/**
 *
 * @author rober
 */
public class Funcionario {

    private int matricula;
    private String nome;
    private Departamento dep;

    public Funcionario() {

    }

    public Funcionario(int matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }
}
