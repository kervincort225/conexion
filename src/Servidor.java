

import javax.swing.*;

import java.awt.*;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoServidor mimarco=new MarcoServidor();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
	}	
}

class MarcoServidor extends JFrame  implements Runnable{
	
	public MarcoServidor(){
		
		setBounds(1200,300,280,350);				
			
		JPanel milamina= new JPanel();
		
		milamina.setLayout(new BorderLayout());
		
		areatexto=new JTextArea();
		
		milamina.add(areatexto,BorderLayout.CENTER);
		
		add(milamina);
		
		setVisible(true);
		
		Thread mihilo = new Thread(this);
		
		mihilo.start();
		
		}
	
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		try {
			//aqui abre el puerto
			ServerSocket servidor = new ServerSocket(52323);
			//aqui acepta todo lo que venga a travez de ese puerto
			while(true) {
			Socket misocket = servidor.accept();
			//aqui entra la data que viene a travez de ese puerto
			DataInputStream flujo_entradad = new DataInputStream(misocket.getInputStream());
			//ahora tenemos que saber leer lo que viene en es epuerto
			String mensaje_texto = flujo_entradad.readUTF();		
			areatexto.append("\n "+mensaje_texto);	
			//cerramos la conexion
			misocket.close();
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private	JTextArea areatexto;
}
