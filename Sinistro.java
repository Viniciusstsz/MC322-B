
  public class Sinistro{
    private int Id;
    private String data;
    private String endereco;
    private static int numeroSinistros = 0;
    // construtor
    public Sinistro(String data, String endereco){
      this.Id = 0;
      this.data = data;
      this.endereco = endereco;
      ++numeroSinistros;      
    }

    public String getData(){
      return data;
    }

    public void setData(String data){
      this.data = data;
    }    
    
    public String getEndereco(){
      return endereco;
    }

    public void setEndereco(String endereco){
      this.endereco = endereco;
    }
    
    public int getId(){
      return Id;
    }

    public void setId(){
      this.Id = numeroSinistros;
    }
    
  }

