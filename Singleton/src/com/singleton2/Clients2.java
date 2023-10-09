package com.singleton2;
// Une classe de test

public class Clients2 {
 public static void main(String[] args)
 {
int som = Arithmetique.getInstance("loico").somme(2, 5);
System.out.printf("la somme est %d",som);
Arithmetique s1 = Arithmetique.getInstance("Loico");
s1.affiche();
Arithmetique s2 = Arithmetique.getInstance(5, 9);
s2.affiche();
 }
 }