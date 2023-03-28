import java.util.Scanner;

class Main{
  public static void main(String[] args){
    System.out.println("Olá, o que você gostaria de criar?\nSeguradora(digite 1)\nVeiculo(digite 2)\nSinistro(digite 3)\nCliente(digite 4)\n");
    Scanner scan = new Scanner(System.in);
    String caso = scan.next();
    
    switch(caso){
      case "1":
       System.out.println("Você escolheu cadastrar uma seguradora, insira os dados necessários\n");
       
       System.out.println("Nome: ");
       String nome_seguradora = scan.next();
       System.out.println("telefone: ");       
       String telefone_seguradora = scan.next();
       System.out.println("email: ");
       String email_seguradora = scan.next();
       System.out.println("endereco: ");
       String endereco_seguradora = scan.next();
       
       Seguradora novaSeguradora = new Seguradora(null, null, null, null);
       novaSeguradora.setNome(nome_seguradora);
       novaSeguradora.setTelefone(telefone_seguradora);
       novaSeguradora.setEmail(email_seguradora);
       novaSeguradora.setEndereco(endereco_seguradora);
        
       String nomeget_seguradora = novaSeguradora.getNome();
       String telefoneget_seguradora = novaSeguradora.getTelefone();
       String emailget_seguradora = novaSeguradora.getEmail();
       String enderecoget_seguradora = novaSeguradora.getEndereco();
       
       System.out.println("Nome cadastrado: "+nomeget_seguradora+"\n"+
                          "Telefone cadastrado: "+telefoneget_seguradora+"\n"+
                          "Email cadastrado: "+emailget_seguradora+"\n"+
                          "Endereco cadastrado: "+enderecoget_seguradora+"\n");
      
      case "2":
       System.out.println("Você escolheu cadastrar um veículo, insira os dados necessários\n");      
       
       System.out.println("placa: ");
       String placa_veiculo = scan.next();
       System.out.println("marca: ");       
       String marca_veiculo = scan.next();
       System.out.println("modelo: ");
       String modelo_veiculo = scan.next();
         
       Veiculo novoVeiculo = new Veiculo(null, null, null);
       novoVeiculo.setPlaca(placa_veiculo);
       novoVeiculo.setMarca(marca_veiculo);
       novoVeiculo.setModelo(modelo_veiculo);
        
       String placaget_veiculo = novoVeiculo.getPlaca();
       String marcaget_veiculo = novoVeiculo.getMarca();
       String modeloget_veiculo = novoVeiculo.getModelo();
       
       System.out.println("Placa cadastrada: "+placaget_veiculo+"\n"+
      			  "Marca cadastrada: "+marcaget_veiculo+"\n"+
       		  "Modelo cadastrado: "+modeloget_veiculo+"\n");
        
      case "3":
       System.out.println("Você escolheu cadastrar um sinistro, insira os dados necessários na ordem: data, endereço\n");   
       
       System.out.println("data: ");
       String data_sinistro = scan.next();
       System.out.println("endereco: ");       
       String endereco_sinistro = scan.next();       
       
       Sinistro novoSinistro = new Sinistro(null, null);
       novoSinistro.setId();
       novoSinistro.setData(data_sinistro);
       novoSinistro.setEndereco(endereco_sinistro);
        
       int Idget_sinistro = novoSinistro.getId();
       String dataget_sinistro = novoSinistro.getData();
       String enderecoget_sinistro = novoSinistro.getEndereco();
       
       System.out.println("Id cadastrado: "+Idget_sinistro+"\n"+
       		  "Data cadastrada: "+dataget_sinistro+"\n"+
       		  "Endereco cadastrado: "+enderecoget_sinistro+"\n");   
        
      case "4":
       System.out.println("Você escolheu cadastrar um Cliente, insira os dados necessários na ordem: nome, cpf, data de nascimento, idade, endereco\n");        
       System.out.println("Nome: ");
       String nome_cliente = scan.next();
       System.out.println("cpf: ");       
       String cpf_cliente = scan.next();
       System.out.println("data de nascimento: ");
       String dataNascimento_cliente = scan.next();
       System.out.println("idade: ");
       String idade_cliente = scan.next();
       System.out.println("endereco: ");
       String endereco_cliente = scan.next();
       
       Cliente novoCliente = new Cliente(null, null, null, Integer.parseInt(idade_cliente), null);
       novoCliente.setNome(nome_cliente);
       novoCliente.setCpf(cpf_cliente);
       novoCliente.setDataNascimento(dataNascimento_cliente);
       novoCliente.setIdade(Integer.parseInt(idade_cliente));
       novoCliente.setEndereco(endereco_cliente);
        
       String nomeget_cliente = novoCliente.getNome();
       String cpfget_cliente = novoCliente.getCpf();
       String dataNascimentoget_cliente = novoCliente.getDataNascimento();
       int idadeget_cliente = novoCliente.getIdade();
       String enderecoget_cliente = novoCliente.getEndereco();
       
       System.out.println("Nome cadastrado: "+nomeget_cliente+"\n"+
       		  "Cpf cadastrado: "+cpfget_cliente+"\n"+
       		  "Data de nascimento cadastrado: "+dataNascimentoget_cliente+"\n"+
       		  "Idade cadastrada: "+idadeget_cliente+"\n"+
       		  "Endereco cadastrado: "+enderecoget_cliente+"\n");
        
    }
  }
}


