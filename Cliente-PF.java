
  public class ClientePF extends Cliente {
    private String cpf ;
    private Date dataNascimento ;

    public ClientePF (String nome, String endereco, Date dataLicenca,
      String educacao, String genero, String classeEconomica,
      List<Veiculo> listaVeiculos, String cpf, Date dataNascimento) {
 
    // chama o construtor da superclasse
 
      super(nome, endereco, dataLicenca, educacao, genero, classeEconomica, listaVeiculos);
      this.cpf = cpf;
      this.dataNascimento = dataNascimento;
    }

    public void setNome(String nome){
      this.nome = nome;
    }

    public String getNome(){
      return nome;
    }

    public void setEndereco(String endereco){
      this.endereco = endereco;
    }

    public String getEndereco(){
      return endereco;
    }

    public void setDataLicenca(String dataLicenca){
      this.dataLicenca = dataLicenca;
    }

    public Date getDataLicenca(){
      return dataLicenca;
    }

    public void setEducacao(String educacao){
      this.educacao = educacao;
    }

    public String getEducacao(){
      return educacao;
    }

    public void setGenero(String genero){
      this.genero = genero;
    }

    public String getGenero(){
      return genero;
    }

    public void setClasseEconomica(String classeEconomica){
      this.classeEconomica = classeEconomica;
    }

    public String getClasseEconomica(){
      return classeEconomica;
    }
    
    public void setCpf(String cpf){
      this.cpf = cpf;
    }

    public String getCpf(){
      return cpf;
    }

    public void setDataNascimento(String dataNascimento){
      this.dataNascimento = dataNascimento;
    }

    public String getDataNascimento(){
      return dataNascimento;
    }
    
    
 // TO DO:
 // metodos getters e setters para cpf e dataNascimento
 // ...

    @Override    
    public String toString(){
      return String.format("nome: %s\nendereço: %s\ndata da licença: %s\neducação: %s\ngenêro: %s\nclasse econômica: %s\ncpf: %s\ndata de  nascimento: %d", nome, endereco, dataLicenca, educacao, genero,
      classeEconomica, cpf, dataNascimento);
    }
 
 public boolean validarCPF(String cpf){
      String cpf1=cpf.replaceAll(".","");
      String cpf2=cpf1.replaceAll("-","");

      String[] cpf_op = cpf2.split("");
      
      //verifica se o cpf possui 11 digitos
      if(cpf_op.length!=11){
        return false;
      }

      //verifica se todos os dıgitos sao iguais
      int cont=0;
      for(int i=0;i<10;i++){
        if(cpf_op[i]==cpf_op[i+1]){
          cont++;
        }        
      }
      if(cont==10){
        return false;
      }

      // calculo dos verificadores
      int soma1 = 10*(Integer.parseInt(cpf_op[0]))+
      		   9*(Integer.parseInt(cpf_op[1]))+
      		   8*(Integer.parseInt(cpf_op[2]))+
      		   7*(Integer.parseInt(cpf_op[3]))+
      		   6*(Integer.parseInt(cpf_op[4]))+
      		   5*(Integer.parseInt(cpf_op[5]))+
      		   4*(Integer.parseInt(cpf_op[6]))+
      		   3*(Integer.parseInt(cpf_op[7]))+
      		   2*(Integer.parseInt(cpf_op[8]));
      int v1 = 11-(soma1%11);
      int soma2 = 11*(Integer.parseInt(cpf_op[0]))+
      		   10*(Integer.parseInt(cpf_op[1]))+
      		    9*(Integer.parseInt(cpf_op[2]))+
      		    8*(Integer.parseInt(cpf_op[3]))+
      		    7*(Integer.parseInt(cpf_op[4]))+
      		    6*(Integer.parseInt(cpf_op[5]))+
      		    5*(Integer.parseInt(cpf_op[6]))+
      		    4*(Integer.parseInt(cpf_op[7]))+
      		    3*(Integer.parseInt(cpf_op[8]))+
      		    2*v1;
      int v2 = 11-(soma2%11);

      //verifica se os verificadores estão corretos
      if((v1==(Integer.parseInt(cpf_op[9])))&&(v2==(Integer.parseInt(cpf_op[10])))){
        return true;
      }
      return false;
 }

}
