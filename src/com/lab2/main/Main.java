package com.lab2.main;

import com.lab2.patient.*;

public class Main {

	public static void main(String[] args) {

		Patient a = new Patient(); // Об'єкт a класу Patient 
		Patient[] p = new Patient[7]; // Масив об'єктів p класу Patient
		
		// Створення об'єктів масиву та їх заповнення даними
		p[0] = new Patient(144, "A", "Ivan", "Biluy", "s.g. 34", 1922, 17, "Temperature +38");
		p[1] = new Patient(255, "B", "Petro", "Tarasiv", "n.p. 56", 2111, 24, "Stomach ache");
		p[2] = new Patient(165, "C", "Andriy", "Olegiv", "h.e. 30", 34567, 26, "Leg injury");
		p[3] = new Patient(66, "D", "Taras", "Sulniy", "l.a. 10", 3212111, 41, "Headache");
		p[4] = new Patient(95, "E", "Danylo", "Boss", "x.s. 94", 355578, 105, "Pneumonia");
		p[5] = new Patient(55, "F", "Pavlo", "Fire", "m.a. 23", 615052, 3, "Leg injury");
		p[6] = new Patient(51, "G", "Sergiy", "Reddi", "f.w. 72", 3112, 10, "Leg injury");

		// Виведення списку всіх пацієнтів
		System.out.println("\nList of patients:");
		System.out.println();

		for (int i = 0; i < p.length; i++) {
			System.out.println(p[i]);
		}

		a.sortDiagnosis(p); // Виклик методу sortDiagnosis з параметром p об'єктом а
		a.sortMedCardID(p); // Виклик методу sortMedCardID з параметром p об'єктом а
		a.sortFirstDigitPhoneNum(p); // Виклик методу sortFirstDigitPhoneNum з параметром p об'єктом а
	}
}
