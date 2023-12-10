package exListas;

public class Funcionario {
    private final Integer id;
    private String nome;
    private Double salario;


    public Funcionario(Integer id, String nome, Double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Id: " + this.id + ", Nome: " + this.nome + ", Salário: " + this.getSalario();
    }
}
