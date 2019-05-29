package day12;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.GregorianCalendar;



public class FileOutExam {
	public static void main(String[] args) {
		//����
		GregorianCalendar calendar = new GregorianCalendar();
		int year=calendar.get(Calendar.YEAR);  //��
		int month=(calendar.get(Calendar.MONTH)+1); //��
		int date=calendar.get(Calendar.DATE); //��
		String dayOf=dayOfWeek(calendar); //����
		String dayOfMy=specialDayOfWeek(calendar,1989,10,31); //Ư���� ���� ����
		//����
		String dir = "c:/iotest";
		  File f = new File(dir);
	      if(!f.exists()) {
	    	  f.mkdirs();
	      }
		try (FileWriter writer = new FileWriter("c:/iotest/today.txt"); PrintWriter out = new PrintWriter(writer)) {
			out.println("������ "+year+"�� "+month+"�� "+date+"���Դϴ�.");
			out.println("������ "+dayOf+"�����Դϴ�.");
			out.println("�������� "+dayOfMy+"���Ͽ� �¾���ϴ�.");
			System.out.println("������ �Ϸ�Ǿ����ϴ�.");
		} catch (IOException ioe) {
			System.out.println("���Ͽ� �����ϴ� ���� ������ �߻��߽��ϴ�.");
		}
	}
	//Ư����¥ ���� ����
	static String specialDayOfWeek(GregorianCalendar calendar, int year, int month, int date){
		String day=null;
		calendar.set(year, month-1, date);  //������ 1�� �������
		switch(calendar.get(Calendar.DAY_OF_WEEK)) {
		case 1 :
			day="��";
			break;
		case 2 :
			day="��";
			break;
		case 3 :
			day="ȭ";
			break;
		case 4 :
			day="��";
			break;
		case 5 :
			day="��";
			break;
		case 6 :
			day="��";
			break;
		case 7 :
			day="��";
			break;
		}
		return day;
	}
	//������ ���� ����
	static String dayOfWeek(GregorianCalendar calendar){
		String day=null;
		switch(calendar.get(Calendar.DAY_OF_WEEK)) {
		case 1 :
			day="��";
			break;
		case 2 :
			day="��";
			break;
		case 3 :
			day="ȭ";
			break;
		case 4 :
			day="��";
			break;
		case 5 :
			day="��";
			break;
		case 6 :
			day="��";
			break;
		case 7 :
			day="��";
			break;
		}
		return day;
	}
}
