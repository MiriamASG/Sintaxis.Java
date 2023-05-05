package javaapplication1;
import javax.swing.JOptionPane;
/**
 *
 * @author miria
 */
public class JavaApplication1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* TODO code application logic here
        Vertice vert1= new Vertice();
        vert1.;//(puse privado el atributo)
        vert1.setNombreVertice("Mas");
        //System.out.println(vert1.getNombreVertice());
        vert1.setNumeroVertice(3);
        //System.out.println(vert1.getNumeroVertice());
        
        Vertice vert2=new Vertice();
        vert2.setNombreVertice("hola");
        //System.out.println(vert2.getNombreVertice());
        vert2.setNumeroVertice(10);
        //System.out.println(vert2.getNumeroVertice());
        
        Vertice vert3=new Vertice();
        vert3.setNombreVertice("chau");
        //System.out.println(vert3.getNombreVertice());
        vert3.setNumeroVertice(27);
        //System.out.println(vert3.getNumeroVertice());
        
        Vertice vert4=new Vertice();
        vert4.setNombreVertice("jodete");
        //System.out.println(vert4.getNombreVertice());
        vert4.setNumeroVertice(45);
        //System.out.println(vert4.getNumeroVertice());
        
        Vertice vert5=new Vertice();
        vert5.setNombreVertice("venga");
        //System.out.println(vert5.getNombreVertice());
        vert5.setNumeroVertice(99);
        //System.out.println(vert5.getNumeroVertice())
        
        array_ver[0]=vert1;
        array_ver[1]=vert2;
        array_ver[2]=vert3;
        array_ver[3]=vert4;
        array_ver[4]=vert5;*/
        
        Vertice array_ver[]=new Vertice[5];
        /*for(int a=0;a<5;a++){
            System.out.println(array_ver[a].getNombreVertice()); 
            System.out.println(array_ver[a].getNumeroVertice());
            //array_ver[a] = null;
        }*/
     int a;
     a=Integer.parseInt(JOptionPane.showInputDialog("Menu:\n1-Recorrer array\n2-Verificar vertice\n3-Insertar vertice\n4-Dar de alta un vertice\n5-Dar de baja un vertice"));         
    switch(a){ 
      case 1:{
         String b;
         b=JOptionPane.showInputDialog("Ingresar el nombre del vertice");
     check_vertice(array_ver,b);
     break;}
        case 2:{
     IsEmpty_Vertices(array_ver);
     break;}
        case 3:{
            String c;
            c=JOptionPane.showInputDialog("Ingrese nuevo nombre");
     Insert_Vertice(array_ver,"verter");
     break;}
        case 4:{
     Update_Vertice(array_ver,"verter", 3);
     break;}
        case 5:{
     Delete_Vertice(array_ver, "arreglo");
     break;}
    }
    }   
    public static boolean check_vertice(Vertice cetiver[] ,String palanume){
        for (Vertice cetiver1 : cetiver) {
            if (cetiver1 == null) {
                continue;  
            }
            if (cetiver1.getNombreVertice().equals(palanume)) {
                System.out.println("ya existe!");
                return true;
            }
        }
        System.out.println("No existe!!!!!!!!!!!!!!!!");
        return false;
    }
    private static boolean IsEmpty_Vertices(Vertice jajaja[]){
        for (Vertice jajaja1 : jajaja) {
            if (jajaja1 == null) {
                System.out.println("Si, esta vacio");
                return true;
            }
        }
     return false;
    }
    private static boolean Insert_Vertice (Vertice nuevo[], String pinche ){
        for (Vertice nuevo1 : nuevo) {
            if (nuevo1 == null) {
                Vertice nuever=new Vertice();
                nuever.setNombreVertice(pinche);
                System.out.println("Se creo un nuevo vertice");
                return true;
            }
        } 
     return false;
    } 
    
    private static boolean Update_Vertice (Vertice vertingos[],String verte,
            int oremun ){
        for (Vertice vertingo : vertingos) {
            if (vertingo == null) {
                continue;
            }
            if (vertingo.getNombreVertice().equals(verte)) {
                vertingo.setNumeroVertice(oremun);
                return true;
            }
        }
     return false;   
}
    private static boolean Delete_Vertice(Vertice baja[], String arreglo){
        for(int i=0;i<baja.length;i++){            
             if(baja[i]==null){
               continue;
            }
            if(baja[i].getNombreVertice().equals("arreglo")){
                baja[i]=null;
                System.out.println("De baja");
                return true;
            }
        }
        System.out.println("No se encontro tal dato");
    return false; 
    }
}



