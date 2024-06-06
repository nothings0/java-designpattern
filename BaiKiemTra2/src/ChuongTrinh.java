import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import com.nhan._1020546_model._1020546VeXe;

public class ChuongTrinh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		NhapVeXe("vao.txt");
		XuatVeXe("ra.txt");
	}
	
	public static void NhapVeXe(String fileName) {
		Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");

        _1020546VeXe VeXe = new _1020546VeXe();
        
        
        while (true) {
            System.out.print("Nhập Loai xe: ");

            int loaiXe;
            try {
            	loaiXe = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Loại xe không hợp lệ. Vui lòng nhập lại.");
                continue;
            }

            System.out.print("Nhập Bien So Xe: ");

            String bienSoXe;
            try {
            	bienSoXe = scanner.nextLine();
            } catch (NumberFormatException e) {
                System.out.println("Bien So xe không hợp lệ. Vui lòng nhập lại.");
                continue;
            }
            System.out.print("Nhập So Ve Xe: ");

            int soVe;
            try {
            	soVe = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("So ve xe không hợp lệ. Vui lòng nhập lại.");
                continue;
            }
            
            String timeIn;
            try {
                timeIn = dateFormat.format(new Date());
            } catch (Exception e) {
                System.out.println("Thời gian vào bãi không hợp lệ. Vui lòng nhập lại.");
                continue;
            }
            
            System.out.print("Tinh Trang Xe Luc Vao: ");
            String stateIn;
            try {
            	stateIn = scanner.nextLine();
            } catch (Exception e) {
                System.out.println("Thời gian vào bãi không hợp lệ. Vui lòng nhập lại.");
                continue;
            }
            scanner.close();
            try {
                FileWriter fileWriter = new FileWriter(fileName, true); // Mở tệp với chế độ append (nối tiếp)
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

                bufferedWriter.write(String.format("%d;%s;%d;%s;%s\n", loaiXe, bienSoXe, soVe, timeIn, stateIn));

                bufferedWriter.close();
                System.out.println("Đã thêm dòng dữ liệu vào tệp " + fileName);
            } catch (IOException e) {
                System.out.println("Đã xảy ra lỗi khi ghi dữ liệu vào tệp.");
                e.printStackTrace();
            }
            break;
        }
	}
	
	public static void XuatVeXe(String fileName) {
		Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");

        _1020546VeXe VeXe = new _1020546VeXe();
        
        
        while (true) {
            System.out.print("Nhập Loai xe: ");

            int loaiXe;
            try {
            	loaiXe = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Loại xe không hợp lệ. Vui lòng nhập lại.");
                continue;
            }

            System.out.print("Nhập Bien So Xe: ");

            String bienSoXe;
            try {
            	bienSoXe = scanner.nextLine();
            } catch (NumberFormatException e) {
                System.out.println("Bien So xe không hợp lệ. Vui lòng nhập lại.");
                continue;
            }
            System.out.print("Nhập So Ve Xe: ");

            int soVe;
            try {
            	soVe = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("So ve xe không hợp lệ. Vui lòng nhập lại.");
                continue;
            }
            
            String timeOut;
            try {
            	timeOut = dateFormat.format(new Date());
            } catch (Exception e) {
                System.out.println("Thời gian ra bãi không hợp lệ. Vui lòng nhập lại.");
                continue;
            }
            
            System.out.print("Tinh Trang Xe Luc Ra: ");
            String stateOut;
            try {
            	stateOut = scanner.nextLine();
            } catch (Exception e) {
                System.out.println("Tinh Trang Xe Luc Ra không hợp lệ. Vui lòng nhập lại.");
                continue;
            }
            scanner.close();
            try {
                FileWriter fileWriter = new FileWriter(fileName, true); // Mở tệp với chế độ append (nối tiếp)
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

                bufferedWriter.write(String.format("%d;%s;%d;%s;%s\n", loaiXe, bienSoXe, soVe, timeOut, stateOut));

                bufferedWriter.close();
                System.out.println("Đã thêm dòng dữ liệu vào tệp " + fileName);
            } catch (IOException e) {
                System.out.println("Đã xảy ra lỗi khi ghi dữ liệu vào tệp.");
                e.printStackTrace();
            }
            break;
        }
	}
}
