import entities.Clientes;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        List<Clientes> clientesList = new ArrayList<>();

        System.out.println("Quantos quartos voce deseja adicionar");
        Integer quant = sc.nextInt();

        for (int x = 0; x< quant; x++){

            System.out.println("Empregado #"+ ( x + 1));

            System.out.println("ID: ");
            Integer id = sc.nextInt();

            sc.nextLine();

            System.out.println("Nome:");
            String nome = sc.nextLine();

            System.out.println("Salario: ");
            Double salario = sc.nextDouble();

            //Adiciona na lista o Cliente
            clientesList.add(new Clientes(id,nome,salario));
        }

        System.out.println("Id de quem vc quer acrescentar o salario:");
        int idsala = sc.nextInt();

        //confere se é verdadeiro ou falso
        Clientes emp = buscarPorId(clientesList, idsala);


        if (emp != null){
            System.out.println("Quanto vc deseja acrescentar em %");
            Double aumento = sc.nextDouble();
            emp.aumentosalario(aumento);
        }
        else {
            System.out.println("Esse id não existe");
        }

        for (Clientes clientes : clientesList){
            System.out.println(clientes);
        }


    }


    public static Clientes buscarPorId(List<Clientes> clientesList, int id) {

        // 1. Converte a lista (List) em um fluxo de dados (Stream)
        // Isso permite usar operações funcionais como filtros e mapeamentos
        return clientesList.stream()

                // 2. Aplica um filtro no fluxo
                // A expressão lambda 'x -> x.getId() == id' verifica cada cliente 'x'
                // Se o ID do cliente 'x' for igual ao 'i
                //
                // d' passado no parâmetro, ele passa pelo filtro
                .filter(x -> x.getId() == id)

                // 3. Pega o primeiro elemento que passou pelo filtro
                // Isso retorna um objeto especial chamado 'Optional' (que pode conter algo ou estar vazio)
                .findFirst()

                // 4. Define o comportamento final
                // Se o 'findFirst' encontrou alguém, retorna esse cliente.
                // Se não encontrou ninguém (o Optional está vazio), retorna 'null'.
                .orElse(null);
    }

}