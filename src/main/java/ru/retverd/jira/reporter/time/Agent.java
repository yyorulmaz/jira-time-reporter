package ru.retverd.jira.reporter.time;

import java.util.Scanner;

public class Agent {
	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		System.out.println("Hello, I'm Agent!\nHit Enter to exit... ");
		System.in.read();
		in.close();
	}
}