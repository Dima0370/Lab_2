package com.lab2.patient;

import java.util.Scanner;

public class Patient {

	private int id;
	private String lastname;
	private String name;
	private String surname;
	private String address;
	private int phoneNumber;
	private int medcardID;
	private String diagnosis;

	// Конструктор без параметрів
	public Patient() {
	}
	
	// Конструктор з параметрами
	public Patient(int id, String lastname, String name, String surname, String address, int phoneNumber, int medcardID,
			String diagnosis) {
		this.id = id;
		this.lastname = lastname;
		this.name = name;
		this.surname = surname;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.medcardID = medcardID;
		this.diagnosis = diagnosis;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getMedcardID() {
		return medcardID;
	}

	public void setMedcardID(int medcardID) {
		this.medcardID = medcardID;
	}

	public String getDiagnosis() {
		return diagnosis;
	}

	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}

	// Виведення списку пацієнтів з вказаним діагнозом
	public void sortDiagnosis(Patient[] p) {
		Scanner in = new Scanner(System.in);
		System.out.println();
		System.out.print("1. Enter the name of the diagnosis: ");
		String diagnosis = in.nextLine();

		System.out.println();
		System.out.println("List of patients with the specified diagnosis: ");
		System.out.println();

		for (int i = 0; i < p.length; i++) {
			if (diagnosis.equals(p[i].getDiagnosis())) {
				System.out.println(p[i]);
			}
		}
	}

	// Виведення списку пацієнтів, номер медичної карти у яких знаходиться в заданому інтервалі
	public void sortMedCardID(Patient[] p) {
		Scanner in = new Scanner(System.in);
		System.out.println();
		System.out.print("2. Enter the first number of the interval: ");
		int firstNumber = in.nextInt();

		System.out.println();
		System.out.print("Enter the second interval number: ");
		int secondNumber = in.nextInt();

		System.out.println();
		System.out.println("List of patients whose medical card number is in the given interval: ");
		System.out.println();

		for (int i = 0; i < p.length; i++) {
			if (firstNumber <= p[i].getMedcardID() && p[i].getMedcardID() <= secondNumber) {
				System.out.println(p[i]);
			}
		}
	}

	// Виведення списку пацієнтів, номер телефону яких починається з вказаної цифри
	public void sortFirstDigitPhoneNum(Patient[] p) {
		Scanner in = new Scanner(System.in);
		int count = 0;

		System.out.println();
		System.out.print("3. Enter the first digit of the phone number: ");
		int firstDigit = in.nextInt();

		System.out.println();
		System.out.println("List of patients whose phone number begins with the specified number: ");
		System.out.println();

		for (int i = 0; i < p.length; i++) {
			if (Integer.parseInt(Integer.toString(p[i].getPhoneNumber()).substring(0, 1)) == firstDigit) {
				count++;
				System.out.println(p[i]);
			}
		}

		System.out.println();
		System.out.println("Number of such patients: " + count);
	}

	// Метод toString() для символьного опису об'єкта
	@Override
	public String toString() {
		return "Patient: id - " + id + ", Surname - " + lastname + ", Name - " + name + ", Middle name - " + surname
				+ ", Address - " + address + ", Phone number - " + phoneNumber + ", Medical card number- "
				+ medcardID + ", Diagnosis - " + diagnosis + "";
	}
}