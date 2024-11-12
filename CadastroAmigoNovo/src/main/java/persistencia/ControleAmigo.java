/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.util.ArrayList;
import negocio.Amigo;

/**
 *
 * @author USUARIO
 */
public class ControleAmigo {
  private ArrayList<Amigo> amigos = new ArrayList<>();
  
  public boolean salvar (Amigo a) {
      if (a == null) {
          amigos.add(a);
          return true;
      }else{
          return false;
      }
  }
  public ArrayList<Amigo> retornarTodos () {
      return amigos;
  }
}
