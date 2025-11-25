package entities;

public class Clientes {
    private Integer id;
    private String nome;
    private Double salario;

    public Clientes(Integer id, String nome, Double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public Clientes() {
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void aumentosalario(double porcentagem){
        salario = salario + (salario * porcentagem / 100);
    }

    @Override
    public String toString() {
        return "Id: " + id +
                ", Nome: " + nome +
                ", Salario: R$ " + String.format("%.2f", salario);
    }
}
