/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apuracaodevotos;

/**
 *
 * @author Etec-User
 */

public class Votos {
    
    int votosNulos;
    int votosBrancos;
    int votosValidos;
    int votosCandidatoA;
    int votosCandidatoB;
    int votosCandidatoC;
    private String mensagemErro = "";
    private boolean valoresCorretos = true;
    
    public void setVotosNulos(int votosNulos){
        this.votosNulos = votosNulos;
    }
    
    public void setVotosBrancos(int votosBrancos){
        this.votosBrancos = votosBrancos;
    }
    
    public void setVotosValidos(int votosCandidatoA, int votosCandidatoB, int votosCandidatoC){
        this.votosValidos = votosValidos;
        
        if(votosCandidatoA >= 0 && votosCandidatoB >= 0 && votosCandidatoC >=0){
    this.votosCandidatoA = votosCandidatoA;
    this.votosCandidatoB = votosCandidatoB;
    this.votosCandidatoC = votosCandidatoC;
    }else{
            this.mensagemErro = this.mensagemErro.concat(" O valor esta invalido");
            this.valoresCorretos = false;
        }
    }    
        
    public String apurarVotos(){
        if (this.valoresCorretos == false){
            return this.mensagemErro;
        }
        int resultApuracao = this.votosCandidatoA + votosCandidatoB + votosCandidatoC + votosBrancos + votosNulos;
        int resultBrancos = this.votosBrancos;
        int resultNulos = this.votosNulos;
        int resultValidos = this.votosCandidatoA + votosCandidatoB + votosCandidatoC;
        int resultCandidatoA = this.votosCandidatoA;
        int resultCandidatoB = this.votosCandidatoB;
        int resultCandidatoC = this.votosCandidatoC;
        
        String calcular =
                
        " O resultado da apuração foi: " + resultApuracao + ",      " + (resultApuracao*100)/resultApuracao + " %" +
        " \nO resultado dos votos brancos foi:" + resultBrancos + ",      " + (votosBrancos * 100)/resultApuracao + "%" +
        " \nO resultado dos votos nulos foi:" + resultNulos + ",      " + (votosNulos * 100)/resultApuracao + " %" +
        " \nO resultado do candidatoA foi:" + resultCandidatoA + ",      " + (votosCandidatoA * 100)/resultApuracao + " %" +
        " \nO resultado do candidatoB foi:" + resultCandidatoB + ",      " + (votosCandidatoB * 100)/resultApuracao + " %" +
        " \nO resultado do candidatoC foi:" + resultCandidatoC + ",      " + (votosCandidatoC * 100)/resultApuracao + " %" +
        " \n*************Votos validos************************" + "\nResultado dos votos validos foi de: " +resultValidos + "," + ((votosCandidatoA + votosCandidatoB + votosCandidatoC)* 100)/resultApuracao + " %" +
        " \n*************Vencedor*****************************";        
        
    if (resultCandidatoA > resultCandidatoB && resultCandidatoA > resultCandidatoC){
        calcular += " \n O vencedor foi: O candidatoA";
    } else if (resultCandidatoB > resultCandidatoA && resultCandidatoB > resultCandidatoC){
        calcular += " \n O vencedor foi: O candidatoB ";
    } else if (resultCandidatoC > resultCandidatoA && resultCandidatoC > resultCandidatoB){
        calcular += " \n O vencedor foi: O candidatoC";
    } else {
        calcular += " \n*****************EMPATE**************************";
    }
        
        return calcular;               
        
    }
}
