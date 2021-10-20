package hilo;

import java.util.Scanner;

public class MainPrimos {

	public static void main(String[] args) {
		
				Scanner sc = new Scanner(System.in);
				
				System.out.println("Escriba el primer numero");
				int num1 = sc.nextInt();
				System.out.println("Escriba el segundo numero");
				int num2 = sc.nextInt();
				System.out.println("Escriba el tercer numero");
				int num3 = sc.nextInt();
				
				int[] arrayNum = new int[] {num1,num2,num3};
				
				
				for (int i = 0; i < arrayNum.length; i++) {
					HiloRunnable hilo = new HiloRunnable(arrayNum[i]);
					Thread t = new Thread(hilo);
					t.setName("Hilo"+(i+1));
					t.start();
				}
				
				
/*
		//Creamos un objeto que implemente Runnable
				HiloRunnable hilo1 = new HiloRunnable(num1);
				//Creamos un objeto de tipo Thread (que es realmente el objeto que 
				//es capaz de crear hilos) y le pasamos un objeto de tipo Runnable
				Thread t1 = new Thread(hilo1);
				
				//ahora trabajos con el objeto de tipo Thread de igual manera que en el ejemplo
				//de HiloThread
				t1.setName("Hilo1");//establecemos el nombre del hilo
				
				
				HiloRunnable hilo2 = new HiloRunnable(num2);
				//En vez de establecer el nombre por setter, lo podemos
				//establecer por constructor
				Thread t2 = new Thread(hilo2,"Hilo2");
				
				HiloRunnable hilo3 = new HiloRunnable(num3);
				//En vez de establecer el nombre por setter, lo podemos
				//establecer por constructor
				Thread t3 = new Thread(hilo3,"Hilo3");
						
				try {
					Thread.sleep(5000);//5 seg
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				//arrancamos los dos hilos
				//ojo no se ejecuta run()
				t1.start();		
				t2.start();
				t3.start();
				
				
				*/
				System.out.println("Hilo principal parando");
	}

}
