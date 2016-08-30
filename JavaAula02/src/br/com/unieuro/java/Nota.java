package br.com.unieuro.java;

public class Nota {
private int id_estudante = 0; 
private int id_grade = 0;
private int nota = 0;

public Nota(int id_estudante, int id_grade, int nota){
super();
this.id_estudante = id_estudante;
this.id_grade = id_grade;
this.nota = nota;
}

public int getId_estudante() {
return id_estudante;
}

public void setId_estudante(int id_estudante) {
this.id_estudante = id_estudante;
}

public int getId_grade() {
return id_grade;
}

public void setId_grade(int id_grade) {
this.id_grade = id_grade;
}

public int getNota() {
return nota;
}

public void setNota(int nota) {
this.nota = nota;
}

public String toString(){
String resultado = "Id do estudante: " + id_estudante + "Id da Grade: " + id_grade + "Nota: " + nota;
return resultado; 
}
}