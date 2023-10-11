package br.com.fiap.carrosapi.model;

public record Carro(
	Long id,
	String nome,
	String marca,
	Double nota
) {}
