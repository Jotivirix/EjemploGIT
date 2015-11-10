import acm.graphics.GLabel;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class Ejercicio1 extends GraphicsProgram{

	public void run(){
		//Cambiamos el tamaño de la ventana
		setSize (800,600);
		//Llamo al método  que dibuja la pirámide
		pintaPiramide();
	}


	public void pintaPiramide(){
		int numLadrillosBase = 14;
		int anchoLadrillo = 30;
		int altoLadrillo = 12;
		int alto = getHeight();
		int ancho = getWidth();

		int altoPiramide = numLadrillosBase * altoLadrillo;
		int basePiramide = numLadrillosBase * anchoLadrillo;
		//Terminado y probado con varios tamanos de ladrillos
		for(int j=0; j<numLadrillosBase; j++){
			for(int i=0; i<numLadrillosBase-j; i++){
				GRect ladrillo = new GRect (anchoLadrillo, altoLadrillo);

				add(ladrillo,
						ancho/2-basePiramide/2+anchoLadrillo*j/2 + anchoLadrillo*i, 
						alto- altoLadrillo - altoLadrillo*j);
				
				pause(20);
			}
		}
	}
}
