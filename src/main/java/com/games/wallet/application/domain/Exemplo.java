package com.games.wallet.application.domain;

import java.util.UUID;

public class Exemplo {

	/**
	 * @param id
	 * @param name
	 * @param address
	 * @param cpf
	 * @param isValidCpf
	 */
	public Exemplo(UUID id, String name, Address address, String cpf, Boolean isValidCpf) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.cpf = cpf;
		this.isValidCpf = isValidCpf;
	}

	public Exemplo() {
		this.isValidCpf = false;
	}

	private UUID id;

	private String name;

	private Address address;

	private String cpf;

	private Boolean isValidCpf;

	/**
	 * @return the id
	 */
	public UUID getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(UUID id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}

	/**
	 * @return the cpf
	 */
	public String getCpf() {
		return cpf;
	}

	/**
	 * @param cpf the cpf to set
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	/**
	 * @return the isValidCpf
	 */
	public Boolean getIsValidCpf() {
		return isValidCpf;
	}

	/**
	 * @param isValidCpf the isValidCpf to set
	 */
	public void setIsValidCpf(Boolean isValidCpf) {
		this.isValidCpf = isValidCpf;
	}

}