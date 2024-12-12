package com.games.wallet.application.domain;

import java.time.LocalDate;
import java.util.UUID;

public class Player {

	private UUID id;
	private String name;
	private String userName;
	private String email;
	private String cpf;
	private String cell;
	private String gender;
	private LocalDate dateBirth;
	private Address address;

	/**
	 * @param id
	 * @param name
	 * @param userName
	 * @param email
	 * @param cpf
	 * @param cell
	 * @param gender
	 * @param dateBirth
	 * @param address
	 */

	public Player() {

	}

	public Player(UUID id, String name, String userName, String email, String cpf, String cell, String gender,
			LocalDate dateBirth, Address address) {
		this.id = id;
		this.name = name;
		this.userName = userName;
		this.email = email;
		this.cpf = cpf;
		this.cell = cell;
		this.gender = gender;
		this.dateBirth = dateBirth;
		this.address = address;
	}

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
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
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
	 * @return the cell
	 */
	public String getCell() {
		return cell;
	}

	/**
	 * @param cell the cell to set
	 */
	public void setCell(String cell) {
		this.cell = cell;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @return the dateBirth
	 */
	public LocalDate getDateBirth() {
		return dateBirth;
	}

	/**
	 * @param dateBirth the dateBirth to set
	 */
	public void setDateBirth(LocalDate dateBirth) {
		this.dateBirth = dateBirth;
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

}
