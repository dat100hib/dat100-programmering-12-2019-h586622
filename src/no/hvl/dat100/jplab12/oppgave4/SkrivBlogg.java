package no.hvl.dat100.jplab12.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.*;

import no.hvl.dat100.jplab12.oppgave3.*;
import no.hvl.dat100.jplab12.common.TODO;

public class SkrivBlogg {

	private static String MAPPE = System.getProperty("user.dir") + "/src/no/hvl/dat100/jplab12/tests/";

	public static boolean skriv(Blogg samling, String filnavn) {
		try {
			PrintWriter skriver = new PrintWriter(MAPPE + filnavn);
			skriver.print(samling.toString());
			skriver.close();

			return true;
		} catch (FileNotFoundException e) {
			return false;
		}

	}
}
