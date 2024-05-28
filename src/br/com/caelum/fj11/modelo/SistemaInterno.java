package caelum.fj11.modelo;

public class SistemaInterno {
       public void autentica(Autenticavel f){
           int senha = 123;

           if (f.autentica(senha)){
               System.out.println("Bem vindo ao sistema");
           }else {
               System.out.println("Senha incorreta");
           }
       }
}

