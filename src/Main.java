import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de Java");
        curso1.setDescricao("Variáveis, Tipos de Dados e Operadores Matemáticos em Java");
        curso1.setCargaHoraria(2);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de Java");
        curso2.setDescricao("Entendendo Metódos Java");
        curso2.setCargaHoraria(2);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devIara = new Dev();
        devIara.setNome("Iara");
        devIara.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Iara: " + devIara.getConteudosInscritos());
        devIara.progredir();
        devIara.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Iara: " + devIara.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Iara: " + devIara.getConteudoConcluido());
        System.out.println("XP: " + devIara.calcularTotalXp());

        System.out.println("................");

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila: " + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila: " + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila: " + devCamila.getConteudoConcluido());
        System.out.println("XP: "+ devCamila.calcularTotalXp());


    }
}
