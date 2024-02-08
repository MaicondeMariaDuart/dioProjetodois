package one.digitalinovation.dominio;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import one.digitalinovation.Bootcamp;
import one.digitalinovation.Conteudo;
import one.digitalinovation.Curso;
import one.digitalinovation.Dev;
import one.digitalinovation.Mentoria;

public class main {

	public static void main(String[] args) {
		Curso cursoJavaBasico = new Curso();
		cursoJavaBasico.setTitulo("Java Basico");
		cursoJavaBasico.setDescricao("Aprenda os conceitos básicos sobre Java");
		cursoJavaBasico.setCargaHoraria(8);
		
		Curso cursoDotNet = new Curso();
		cursoDotNet.setTitulo("Java. NET");
		cursoDotNet.setDescricao("Aprenda os conceitos básicos sobre C#");
		cursoDotNet.setCargaHoraria(8);
		
		Curso cursoJavaAvancado = new Curso();
		cursoJavaAvancado.setTitulo("Java Avançado");
		cursoJavaAvancado.setDescricao("Aprenda os conceitos avançados sobre Java");
		cursoJavaAvancado.setCargaHoraria(8);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Aprendendo Orientação Objetos com Java");
		mentoria.setDescricao("Imersão sobre os pilares da Orientação Objetos");
		mentoria.setData(LocalDateTime.now());
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("GFT START #2 JAVA");
		bootcamp.setInicio(LocalDateTime.now());
		bootcamp.setFim(bootcamp.getInicio().plusDays(45));
		List<Conteudo> conteudosBootcamps=Arrays.asList(cursoJavaBasico, cursoJavaAvancado, mentoria);
		bootcamp.setConteudos(conteudosBootcamps);
		
		Dev felipao = new Dev();
		felipao.setNome("felipão");
		
		felipao.inscrever(cursoDotNet);
		felipao.inscrever(bootcamp);
		felipao.progredir();
		felipao.progredir();
		
		Dev maicon = new Dev();
		maicon.setNome("Maicon");
		maicon.inscrever(bootcamp);
		maicon.progredir();
		maicon.progredir();
		maicon.progredir();

		System.out.println(String.format(" XP Maicon: %.2f", maicon.calcularTotalXp()));
		System.out.println(String.format(" XP Felipao: %.2f", felipao.calcularTotalXp()));
		
		List<Dev> ranking = Arrays.asList(felipao, maicon).stream()
				.sorted((dev1, dev2) -> Double.compare(dev1.calcularTotalXp(), dev2.calcularTotalXp()))
				.collect(Collectors.toList());
		
		for (Dev dev : ranking) {
			System.out.println(dev.getNome());
		}
		

	}

}
