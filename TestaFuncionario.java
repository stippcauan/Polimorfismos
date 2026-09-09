public class TestaFuncionario {
    public static void main(String[] args) {
        Funcionario oreiaSeca1 = new Funcionario();
        oreiaSeca1.setCpf("098.765.432-01");
        oreiaSeca1.setNome("Cauan Stipp");
        oreiaSeca1.setSalario("3500.90");

        System.out.println(oreiaSeca1.getNome());
        System.out.println(oreiaSeca1.getCpf());
        System.out.println(oreiaSeca1.getSalario());
        System.out.println(oreiaSeca1.getbonificacao());
    }
}
