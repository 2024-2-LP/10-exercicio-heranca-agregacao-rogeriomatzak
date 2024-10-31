package school.sptech.especialistas;

import school.sptech.Desenvolvedor;

public class DesenvolvedorWeb extends Desenvolvedor {
  private String  backend;
  private String frontend;
  private  String sgbd;
  private Integer horasMentoria;

  public DesenvolvedorWeb() {
  }

  public DesenvolvedorWeb(String nome, Integer qtdHoras, Double valorHora, String backend, String frontend, String sgbd, Integer horasMentoria) {
    super(nome, qtdHoras, valorHora);
    this.backend = backend;
    this.frontend = frontend;
    this.sgbd = sgbd;
    this.horasMentoria = horasMentoria;
  }

  public String getBackend() {
    return backend;
  }

  public void setBackend(String backend) {
    this.backend = backend;
  }

  public String getFrontend() {
    return frontend;
  }

  public void setFrontend(String frontend) {
    this.frontend = frontend;
  }

  public String getSgbd() {
    return sgbd;
  }

  public void setSgbd(String sgbd) {
    this.sgbd = sgbd;
  }

  public Integer getHorasMentoria() {
    return horasMentoria;
  }

  public void setHorasMentoria(Integer horasMentoria) {
    this.horasMentoria = horasMentoria;
  }

  @Override
  public Double calcularSalario() {
    Double mentoria = 300.00 * horasMentoria;
    return super.calcularSalario()+ mentoria;
  }

  public Boolean isFullstack(){
    if (frontend ==null || backend == null || sgbd == null){
      return  false;
    }
    return  true;
    }
  }
