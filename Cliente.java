
  public class Cliente{
    private String nome;
    private String cpf;
    private String dataNascimento;
    private int idade;
    private String endereco;

    // construtor
    public Cliente(String nome, String cpf, String dataNascimento, int idade, String endereco){
      this.nome = nome;
      this.cpf = cpf;
      this.dataNascimento = dataNascimento;
      this.idade = idade;
      this.endereco = endereco;      
    }

    public String getNome(){
      return nome;
    }

    public void setNome(String nome){
      this.nome = nome;
    }
    
    public String getCpf(){
      return cpf;
    }

    public void setCpf(String cpf){
      this.cpf = cpf;
    }
    
    public String getDataNascimento(){
      return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento){
      this.dataNascimento = dataNascimento;
    }

    public int getIdade(){
      return idade;
    }

    public void setIdade(int idade){
      this.idade = idade;
    }
    
    public String getEndereco(){
      return endereco;
    }

    public void setEndereco(String endereco){
      this.endereco = endereco;
    }

    public String toString(){
      return String.format("nome: %s\ncpf: %s\ndata de nascimento: %s\nnome: %s\nendereço: %s\n", nome, cpf, dataNascimento, String.valueOf(idade), endereco);
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
  
