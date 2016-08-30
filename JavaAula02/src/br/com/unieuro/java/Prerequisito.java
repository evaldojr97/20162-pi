package br.com.unieuro.java;

public class Prerequisito {
private int id_disciplina = 0;
private int id_prerequisito = 0;

public Prerequisito(int id_disciplina,int id_prerequisito){
super ();
this.id_disciplina = id_disciplina;
this.id_prerequisito = id_prerequisito;
}

public int getId_disciplina() {
return id_disciplina;
}

public void setId_disciplina(int id_disciplina) {
this.id_disciplina = id_disciplina;
}

public int getId_prerequisito() {
return id_prerequisito;
}

public void setId_prerequisito(int id_prerequisito) {
this.id_prerequisito = id_prerequisito;
}

public String toString(){
String resultado = "Id do disciplina: " + id_disciplina + "Id do pré-requisito" + id_prerequisito; 
return resultado;
}
}