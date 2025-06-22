package db;

public class Cliente {
    private int id;
    private String nome;
    private String email;
    private int telefone;
    private String senha;

    public Cliente(){

    }

    public Cliente(int id, String nome, String email, int telefone, String senha){
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.senha = senha;
    }

    //setters
    public void setId(int id){
        this.id = id;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setTelefone(int telefone){
        this.telefone = telefone;
    }

    public void setSenha(String senha){
        this.senha = senha;
    }

    //getters
    public int getId(){
        return this.id;
    }

    public String getNome(){
        return this.nome;
    }

    public String getEmail(){
        return this.email;
    }

    public int getTelefone(){
        return this.telefone;
    }

    public String getSenha(){
        return this.senha;
    }




}




