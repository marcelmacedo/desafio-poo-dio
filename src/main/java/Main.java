import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descricao do curso");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Javascript");
        curso2.setDescricao("Descricao do curso");
        curso2.setCargaHoraria(8);

        /* Polimorfismo -> Podemos instanciar as classes filhas atravez da classe mae Conteudo().
            Conteudo conteudo = new Curso();
            Conteudo conteudo1 = new Mentoria();
         */

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descricao mentoria Java");
        mentoria.setData(LocalDate.now());

        /*
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);
        */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        /*Dev devMarcel = new Dev();
        devMarcel.setNome("Marcel");
        devMarcel.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos incritos Marcel: " + devMarcel.getConteudosInscritos());

        devMarcel.progredir();
        System.out.println("Conteudos Conteudos Marcel: " + devMarcel.getConteudosInscritos());
        System.out.println("Conteudos Conteudos Marcel: " + devMarcel.getConteudoConcluidos());
        System.out.println("XP: " + devMarcel.calcularTotalXp());*/


        System.out.println("---------------------------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos incritos João: " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("+++++");
        System.out.println("Conteudos incritos João: " + devJoao.getConteudosInscritos());
        System.out.println("Conteudos Conteudos João: " + devJoao.getConteudoConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXp());

    }
}
