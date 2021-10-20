package vista;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import modelo.entidad.Coche;
import modelo.negocio.GestorCoche;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba el numero de lo que desa hacer ");
		System.out.print("(1.Añadir, 2.Eliminar, 3.Modificar,4. Obtener, 5.Listar, 6.ExportarPDF o 7.ExportarExcel):");

		GestorCoche gc = new GestorCoche();
		
		String casos = sc.nextLine();

		switch (casos) {
		case "1":
			altaModificarCoche(sc, gc, true);
			break;
		case "2":
			eliminarCoche(sc, gc);
			break;
		case "3":
			altaModificarCoche(sc, gc, false);
			break;
		case "4":
			buscarCoche(sc, gc);
			break;
		case "5":
			listarCoches(gc);
			break;
		case "6":
			exportarBBDDPDF(gc);
			break;
		case "7":
			exportarBBDDExcel(gc);
			
		}

	}
	
	private static void exportarBBDDExcel(GestorCoche gc) {
	    String XLSX_FULL_NAME = "src/main/resources/coche.xlsx";
		
		List<Coche> listaCoches = gc.listar();
		
		if(!listaCoches.isEmpty()) {
			try {
				String sheetName = "Input";
				FileInputStream file = new FileInputStream(XLSX_FULL_NAME);
	            XSSFWorkbook workbook = new XSSFWorkbook(file);
	            XSSFSheet sheet = workbook.getSheet(sheetName);
	            int row = 1;
	            int col = 1;
	            
	            Cell cell = null;
	            XSSFRow sheetRow = sheet.getRow(row);
	            if (sheetRow == null) {
	                sheetRow = sheet.createRow(row);
	            }
	            cell = sheetRow.getCell(col);
	            if (cell == null) {
	                cell = sheetRow.createCell(col);
	            }
	            for (Coche c : listaCoches) {
	            	String id = "ID: " + c.getId() + c.toString();
	            	cell.setCellValue(id);
	            	
				}
	            
	            
	/*            Object value = data;
	            if (value instanceof java.lang.String) {
	                String s = (String) value;
	                cell.setCellValue(s);
	            } else if (value instanceof java.lang.Double) {
	                Double d = (Double) value;
	                cell.setCellValue(d);
	            } else if (value instanceof java.lang.Integer) {
	                Integer i = (Integer) value;
	                cell.setCellValue(i);
	            } else if (value instanceof java.util.Date) {
	                Date date = (Date) value;
	                cell.setCellValue(date);
	            }
							*/
				
			}catch(Exception ex) {
				System.out.println("Excepcion " + ex.getMessage());
			}
			
			
		}
		
	}
	
	private static void exportarBBDDPDF(GestorCoche gc) {
		List<Coche> listaCoches = gc.listar();
		
		if(!listaCoches.isEmpty()) {
			try (PDDocument doc = new PDDocument()) {

				PDPage myPage = new PDPage();
				doc.addPage(myPage);

				try (PDPageContentStream cont = new PDPageContentStream(doc, myPage)) {

					cont.beginText();

					cont.setFont(PDType1Font.TIMES_ROMAN, 12);
					cont.setLeading(14.5f);

					cont.newLineAtOffset(25, 700);
					
					String line1 = " ID  | Marca | Modelo |  KM  | Matricula |";
					cont.showText(line1);

					cont.newLine();
					
					for (Coche c : listaCoches) {
						String line = " " + c.getId() + "    " + c.getMarca() + "     "
								+ c.getModelo() + "     " + c.getKm() + "   " + c.getMatricula();
						cont.showText(line);
						cont.newLine();
					}
					
					cont.endText();				
				} catch (IOException ioe) {
					ioe.printStackTrace();
				}
				
				doc.save("src/main/resources/bbdd_coches.pdf");
				System.out.println("Fichero pdf creado en src/main/resources/bbdd_ccohes.pdf");
				System.out.println("Refresque el proyecto en caso de que no aparezca");
			}catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}
		
	}

	private static void listarCoches(GestorCoche gc) {
		List<Coche> listaCoches = gc.listar();
		for (Coche c : listaCoches) {
			System.out.println(c);
		}
	}

	private static void buscarCoche(Scanner sc, GestorCoche gc) {
		System.out.print("Escribe la matricula: ");
		String idL = sc.nextLine();
		Coche coche = gc.obtener(Integer.parseInt(idL));
		System.out.println(coche);
	}

	private static void eliminarCoche(Scanner sc, GestorCoche gc) {
		System.out.print("Escribe la id del coche: ");
		String idE = sc.nextLine();
		boolean baja = gc.baja(Integer.parseInt(idE));
		if (baja) {
			System.out.println("El coche se ha eliminado");
		} else {
			System.out.println("El coche NO se ha eliminado");
		}
	}

	private static void altaModificarCoche(Scanner sc, GestorCoche gc, boolean alta) {
		Coche cocheA = new Coche();
		System.out.print("Escribe la marca: ");
		String marcaA = sc.nextLine();
		cocheA.setMarca(marcaA);
		System.out.print("Escribe el modelo: ");
		String modeloA = sc.nextLine();
		cocheA.setModelo(modeloA);
		System.out.print("Escribe los kilometros: ");
		String kmA = sc.nextLine();
		cocheA.setKm(Integer.parseInt(kmA));
		System.out.print("Escribe la matricula: ");
		String matriculaA = sc.nextLine();
		cocheA.setMatricula(matriculaA);

		int resultado = 0;
		if(alta)
			resultado = gc.alta(cocheA);
		else
			resultado = gc.modificar(cocheA);
		
		if (resultado == 0) {
			System.out.println("El coche se ha incluido");
		} else if ( resultado == 2 || resultado == 3 || resultado == 4) {
				System.out.println("LAS CASILLAS MODELO MATRICULA Y MARCA SON OBLIGATORIAS");
		} else if(resultado == 1) {
			System.out.println("LA LONGITUD DE CARACTERES DE UNA MATRICULA ES DE 7 CARACTERES");
		} else if(resultado == 5) {
			System.out.println("Ha habido un fallo con la BBDD");
		}
	}
}