
  public class ClienteCNPJ extends Cliente {
    private String cnpj;
    private Date dataNascimento;

    public ClienteCNPJ (String nome, String endereco, Date dataLicenca,
      String educacao, String genero, String classeEconomica,
      List<Veiculo> listaVeiculos, String cnpj, Date dataNascimento) {
 
    // chama o construtor da superclasse
 
      super(nome, endereco, dataLicenca, educacao, genero, classeEconomica, listaVeiculos);
      this.cnpj = cnpj;
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
    
    public void setCpf(String cnpj){
      this.cnpj = cnpj;
    }

    public String getCpf(){
      return cnpj;
    }

    public void setDataNascimento(String dataNascimento){
      this.dataNascimento = dataNascimento;
    }

    public String getDataNascimento(){
      return dataNascimento;
    }

 // TO DO:
 // metodos getters e setters para cnpj e dataNascimento
 // ...

 @Override    
 public String toString(){
      return String.format("nome: %s\nendereço: %s\ndata da licença: %s\neducação: %s\ngenêro: %s\nclasse econômica: %s\ncnpj: %s\ndata de nascimento: %d", nome, endereco, dataLicenca, educacao, genero, classeEconomica, cnpj, dataNascimento);
 }
 
 public boolean validarCNPJ(String cnpj ){
      String cpf1=cpf.replaceAll(".","");
      String cpf2=cpf1.replaceAll("-","");

      String[] cpf_op = cpf2.split("");
      
      //verifica se o cpf possui 11 digitos
      if(cpf_op.length!=14){
        return false;
      }

      //verifica se todos os dıgitos sao iguais
      int cont=0;
      for(int i=0;i<13;i++){
        if(cpf_op[i]==cpf_op[i+1]){
          cont++;
        }        
      }
      if(cont==13){
        return false;
      }

      // calculo dos verificadores
      int soma1 = 5*(Integer.parseInt(cpf_op[0]))+
      		   4*(Integer.parseInt(cpf_op[1]))+
      		   3*(Integer.parseInt(cpf_op[2]))+
      		   2*(Integer.parseInt(cpf_op[3]))+
      		   9*(Integer.parseInt(cpf_op[4]))+
      		   8*(Integer.parseInt(cpf_op[5]))+
      		   7*(Integer.parseInt(cpf_op[6]))+
      		   6*(Integer.parseInt(cpf_op[7]))+
      		   5*(Integer.parseInt(cpf_op[8]))+
      		   4*(Integer.parseInt(cpf_op[9]))+
      		   3*(Integer.parseInt(cpf_op[10]))+
      		   2*(Integer.parseInt(cpf_op[11]));
      int v1 = (soma1%11);
      int verificador1 = 0;
      
      if (v1>=2){
        verificador1 = 11 - v1;
      }
      
      int soma2 = 6*(Integer.parseInt(cpf_op[0]))+
      		   5*(Integer.parseInt(cpf_op[1]))+
      		   4*(Integer.parseInt(cpf_op[2]))+
      		   3*(Integer.parseInt(cpf_op[3]))+
      		   2*(Integer.parseInt(cpf_op[4]))+
      		   9*(Integer.parseInt(cpf_op[5]))+
      		   8*(Integer.parseInt(cpf_op[6]))+
      		   7*(Integer.parseInt(cpf_op[7]))+
      		   6*(Integer.parseInt(cpf_op[8]))+
      		   5*(Integer.parseInt(cpf_op[9]))+
      		   4*(Integer.parseInt(cpf_op[10]))+
      		   3*(Integer.parseInt(cpf_op[11]))+
      		   2*v1;
      int v2 = (soma2%11);
      int verificador2 = 0;
      
      if (v2>=2){
        verificador2 = 11 - v2;
      }
      

      //verifica se os verificadores estão corretos
      if((verificador1==(Integer.parseInt(cpf_op[12])))&&(verificador2==(Integer.parseInt(cpf_op[13])))){
        return true;
      }
      return false;
 }

}
