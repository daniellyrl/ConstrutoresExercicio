public class Main {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Danielly",21,345);
        Professor p1 = new Professor("Fernanda",30,3000);
        System.out.println("O nome do aluno é: " + a1.getNome() + ", sua idade é: " + a1.getIdade() +
                " e sua matrícula é: " + a1.getMatricula());
        System.out.println("O nome do professor é: " + p1.getNome() + ", sua idade é: " + p1.getIdade() +
                " e seu sálario é: " + p1.getSalario());
    }
}